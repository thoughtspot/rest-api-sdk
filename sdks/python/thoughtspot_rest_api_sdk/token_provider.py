# coding: utf-8

"""
    ThoughtSpot REST API SDK — token provider.

    CUSTOM (ThoughtSpot): bearer-token lifecycle helpers.

    * ``TokenResult`` + ``_TokenCache`` back ``Configuration(get_token=...)``:
      the customer supplies a callable that mints a token however they choose
      (any ``/auth/token/*`` endpoint or their own backend). The SDK calls it on
      first use, caches the result per ApiClient, calls it again when fewer than
      the refresh buffer (default 30s) of validity remain, and — through the
      HTTP-layer ``_CachedTokenAuth`` in rest.py — once more after a 401 before
      retrying the request once. Concurrent calls share a single in-flight
      ``get_token`` call (single-flight).
    * ``ThoughtSpotTokenProvider`` is the older credentials-based supplier for
      ``/auth/token/full``. Pass an instance as
      ``Configuration(access_token=provider)``; the SDK invokes it per request
      through ``_TokenAuth`` in rest.py. It mints a token, caches it, and
      refreshes only when within ``expiry_skew_sec`` of expiry.

    Tokens are never logged. ``get_token`` calls are logged at DEBUG level on the
    ``thoughtspot_rest_api_sdk.token`` logger with the reason (cold, expiry,
    401) only.

    This is a hand-maintained supporting module (not generator output);
    generate.sh copies it to the package root and exports it from __init__.py
    after generation.
"""

import asyncio
import contextvars
import functools
import inspect
import logging
import math
import re
import time
from collections.abc import Mapping
from dataclasses import dataclass, field
from typing import Any, Awaitable, Callable, Optional, Tuple, Union, cast

logger = logging.getLogger("thoughtspot_rest_api_sdk.token")

DEFAULT_TOKEN_REFRESH_BUFFER_MS = 30_000
"""Default refresh buffer: call ``get_token`` when fewer than 30s of validity remain."""

DEFAULT_GET_TOKEN_TIMEOUT = 300.0
"""Default limit, in seconds, on one ``get_token`` call (matches the request default)."""

_TOKEN_CHARS = re.compile(r"[\x21-\x7e]+")

# Token caches whose get_token is running in the current context. A request made
# from inside get_token (e.g. minting through the same ApiClient) must not wait
# on the fetch it is part of; _CachedTokenAuth sends it without the managed token
# instead, as the Java SDK does. run_sync carries this into *_sync calls.
_FETCHING: "contextvars.ContextVar[frozenset]" = contextvars.ContextVar(
    "thoughtspot_rest_api_sdk_token_fetching", default=frozenset()
)


@dataclass(frozen=True)
class TokenResult:
    """A bearer token returned by a ``get_token`` callable, plus optional expiry.

    :param token: The bearer token. Treated as opaque; never logged or shown in
        ``repr()``.
    :param expires_at_ms: Expiry as epoch milliseconds. Pass
        ``expiration_time_in_millis`` from an ``/auth/token/*`` response
        directly. When omitted, the token is reused until the server rejects it
        with a 401.
    :param refresh_buffer_ms: Overrides ``Configuration.token_refresh_buffer_ms``
        for this token.
    """

    token: str = field(repr=False)
    expires_at_ms: Optional[float] = None
    refresh_buffer_ms: Optional[float] = None

    def __post_init__(self) -> None:
        # Reject whitespace / control / non-ASCII characters up front: the HTTP
        # layer would otherwise fail with an error that echoes the header value
        # (token included), e.g. for a token read from a file with a trailing
        # newline. The message never includes the value.
        if not isinstance(self.token, str) or not _TOKEN_CHARS.fullmatch(self.token):
            raise ValueError(
                "TokenResult.token must be a non-empty str of visible ASCII characters "
                "(no whitespace or control characters)."
            )
        for name in ("expires_at_ms", "refresh_buffer_ms"):
            value = getattr(self, name)
            if value is None:
                continue
            is_number = isinstance(value, (int, float)) and not isinstance(value, bool)
            if not is_number or not math.isfinite(value):
                raise ValueError(f"TokenResult.{name} must be a finite number of milliseconds.")
        if self.refresh_buffer_ms is not None and self.refresh_buffer_ms < 0:
            raise ValueError("TokenResult.refresh_buffer_ms must be >= 0.")


TokenResultLike = Union[str, TokenResult, Mapping, Any]
"""What ``get_token`` may return: a token ``str``, a ``TokenResult``, a mapping
with a ``token`` key and an optional ``expires_at_ms`` /
``expiration_time_in_millis`` / ``expiresAt`` key (e.g. the raw
``/auth/token/*`` JSON), or an SDK token response model (anything with
``token`` and ``expiration_time_in_millis`` attributes)."""

_MAPPING_EXPIRY_KEYS = ("expires_at_ms", "expiration_time_in_millis", "expiresAt")

GetToken = Callable[[], Union[TokenResultLike, Awaitable[TokenResultLike]]]
"""A zero-argument sync or async callable returning a ``TokenResultLike``."""


def _to_token_result(value: Any) -> TokenResult:
    """Normalise a ``get_token`` return value into a ``TokenResult``."""
    if isinstance(value, TokenResult):
        return value
    if isinstance(value, str):
        return TokenResult(token=value)
    if isinstance(value, Mapping):
        expires = next((value[k] for k in _MAPPING_EXPIRY_KEYS if k in value), None)
        return TokenResult(token=value.get("token", ""), expires_at_ms=expires)
    token = getattr(value, "token", None)
    if isinstance(token, str):
        # SDK token models (GetTokenResponse, Token, AccessToken, ...).
        return TokenResult(
            token=token,
            expires_at_ms=getattr(value, "expiration_time_in_millis", None),
        )
    # Report the type only — the value may itself be a credential.
    raise TypeError(
        "get_token must return a str, TokenResult, mapping with a 'token' key, "
        f"or an SDK token response; got {type(value).__name__}."
    )


def _is_async_callable(fn: Any) -> bool:
    while isinstance(fn, functools.partial):
        fn = fn.func
    if inspect.iscoroutinefunction(fn):
        return True
    # Callable objects with an ``async def __call__``.
    return callable(fn) and inspect.iscoroutinefunction(fn.__call__)


class _TokenCache:
    """Per-client cache around a customer ``get_token`` callable.

    Owned by a single ``RESTClientObject`` (one per ApiClient) and only touched
    from that client's event loop. Never validates the cached token against the
    server: a 401 is the fallback signal that it must be replaced.
    """

    def __init__(
        self,
        get_token: GetToken,
        refresh_buffer_ms: Optional[float] = None,
        clock: Callable[[], float] = time.time,
        get_token_timeout: Optional[float] = None,
    ) -> None:
        if not callable(get_token):
            raise TypeError("get_token must be callable.")
        self._get_token = get_token
        self._refresh_buffer_ms = (
            DEFAULT_TOKEN_REFRESH_BUFFER_MS if refresh_buffer_ms is None else refresh_buffer_ms
        )
        self._get_token_timeout = (
            DEFAULT_GET_TOKEN_TIMEOUT if get_token_timeout is None else get_token_timeout
        )
        self._clock = clock
        self._cached: Optional[TokenResult] = None
        self._inflight: Optional["asyncio.Task[TokenResult]"] = None
        self._warned_short_lived = False

    def __repr__(self) -> str:
        return f"{type(self).__name__}(cached={self._cached is not None})"

    async def get(self) -> str:
        """Return the cached token, calling ``get_token`` if absent or near expiry."""
        cached = self._cached
        if cached is None:
            return (await self._refresh("cold")).token
        if not self._near_expiry(cached):
            return cached.token
        try:
            return (await self._refresh("expiry")).token
        except Exception as exc:  # pylint: disable=broad-except
            # A failed early refresh must not fail a request the cached token
            # can still serve; the next request tries get_token again. Once
            # the token has actually expired the error propagates.
            if cached.expires_at_ms is None or cached.expires_at_ms <= self._now_ms():
                raise
            logger.warning(
                "get_token failed while refreshing a still-valid token (%s); "
                "using the cached token",
                type(exc).__name__,
            )
            return cached.token

    def is_fetching_in_context(self) -> bool:
        """True when called from inside this cache's own ``get_token`` call."""
        return self in _FETCHING.get()

    def invalidate(self, rejected_token: str) -> None:
        """Drop ``rejected_token`` from the cache (if still cached) without a refresh."""
        if self._cached is not None and self._cached.token == rejected_token:
            self._cached = None

    async def get_after_unauthorized(self, rejected_token: str) -> str:
        """Replace ``rejected_token`` after a 401 and return the new token.

        When a burst of requests share a token that the server rejects, only the
        first 401 clears the cache and calls ``get_token``; the rest join that
        call or reuse the token it produced.
        """
        cached = self._cached
        if cached is not None and cached.token != rejected_token:
            return await self.get()
        self._cached = None
        return (await self._refresh("401")).token

    def _near_expiry(self, result: TokenResult) -> bool:
        if result.expires_at_ms is None:
            return False
        buffer_ms = result.refresh_buffer_ms
        if buffer_ms is None:
            buffer_ms = self._refresh_buffer_ms
        return result.expires_at_ms - self._now_ms() <= buffer_ms

    def _now_ms(self) -> float:
        return self._clock() * 1000

    def _warn_if_short_lived(self, result: TokenResult) -> None:
        # A token that is already inside the refresh buffer when minted makes
        # every request call get_token. Usually expires_at_ms was given in
        # seconds, or the token lifetime is shorter than the buffer.
        if self._warned_short_lived or not self._near_expiry(result):
            return
        self._warned_short_lived = True
        logger.warning(
            "get_token returned a token that expires within the refresh buffer, so "
            "get_token will be called on every request. Check that expires_at_ms is "
            "epoch milliseconds and that the token lifetime exceeds "
            "token_refresh_buffer_ms."
        )

    async def _refresh(self, reason: str) -> TokenResult:
        loop = asyncio.get_running_loop()
        task = self._inflight
        if task is None or task.get_loop() is not loop:
            task = loop.create_task(self._fetch(reason))
            self._inflight = task
        # shield: a cancelled caller must not cancel the call other callers share.
        return await asyncio.shield(task)

    async def _fetch(self, reason: str) -> TokenResult:
        # _fetch runs in its own task, so the marker stays local to this call.
        marker = _FETCHING.set(_FETCHING.get() | {self})
        try:
            logger.debug("Calling get_token (reason=%s)", reason)
            value = await self._call_get_token_with_timeout(reason)
            result = _to_token_result(value)
            self._warn_if_short_lived(result)
            self._cached = result
            return result
        finally:
            _FETCHING.reset(marker)
            if self._inflight is asyncio.current_task():
                self._inflight = None

    async def _call_get_token_with_timeout(self, reason: str) -> Any:
        # The limit applies to the one shared call, so every waiter gets the
        # same TimeoutError and the next request starts a fresh call. A sync
        # get_token thread cannot be stopped; its late result is discarded.
        # asyncio.wait rather than wait_for: a TimeoutError raised by get_token
        # itself must surface as-is, not be reported as this timeout.
        call = asyncio.create_task(self._call_get_token())
        try:
            done, _ = await asyncio.wait({call}, timeout=self._get_token_timeout)
        finally:
            if not call.done():
                call.cancel()
        if not done:
            logger.warning(
                "get_token did not return within %ss (reason=%s)", self._get_token_timeout, reason
            )
            raise TimeoutError(f"get_token did not return within {self._get_token_timeout:g}s.")
        return call.result()

    async def _call_get_token(self) -> Any:
        if _is_async_callable(self._get_token):
            return await cast(Awaitable[Any], self._get_token())
        # Run sync callables off the event loop: a blocking mint must not stall
        # other requests, and a get_token that calls an SDK *_sync method would
        # otherwise deadlock the shared background loop.
        loop = asyncio.get_running_loop()
        ctx = contextvars.copy_context()
        value = await loop.run_in_executor(None, ctx.run, self._get_token)
        if inspect.isawaitable(value):
            value = await value
        return value


class ThoughtSpotTokenProvider:
    """Caching bearer-token supplier backed by ``/auth/token/full``.

    Supply exactly one of ``password`` (basic auth) or ``secret_key`` (trusted
    authentication). The TLS / proxy settings used to *mint* the token mirror
    the target cluster, so pass ``verify_ssl`` / ``ssl_ca_cert`` / ``proxy`` when
    your cluster needs them.

    Example::

        from thoughtspot_rest_api_sdk import Configuration, ThoughtSpotTokenProvider

        provider = ThoughtSpotTokenProvider(HOST, "user", password="pass")
        config = Configuration(host=HOST, access_token=provider)
    """

    def __init__(
        self,
        host: str,
        username: str,
        *,
        password: Optional[str] = None,
        secret_key: Optional[str] = None,
        validity_time_in_sec: Optional[int] = None,
        org_id: Optional[int] = None,
        verify_ssl: bool = True,
        ssl_ca_cert: Optional[str] = None,
        proxy: Optional[str] = None,
        expiry_skew_sec: float = 30,
    ) -> None:
        if (password is None) == (secret_key is None):
            raise ValueError(
                "ThoughtSpotTokenProvider needs exactly one of "
                "`password` (basic auth) or `secret_key` (trusted auth)."
            )
        self._host = host
        self._verify_ssl = verify_ssl
        self._ssl_ca_cert = ssl_ca_cert
        self._proxy = proxy
        # Only forward fields the caller set; the request model fills the rest
        # with its server-side defaults (e.g. validity_time_in_sec=300).
        self._request_kwargs = {
            k: v
            for k, v in {
                "username": username,
                "password": password,
                "secret_key": secret_key,
                "validity_time_in_sec": validity_time_in_sec,
                "org_id": org_id,
            }.items()
            if v is not None
        }
        self._skew_ms = expiry_skew_sec * 1000
        self._token: Optional[str] = None
        self._expiry_ms: float = 0.0
        self._lock: Optional[asyncio.Lock] = None

    async def __call__(self) -> str:
        # Create the lock lazily so it binds to the running loop (Python 3.9
        # binds asyncio.Lock() to a loop at construction time). The check/assign
        # has no await between it, so it is atomic within an event loop.
        if self._lock is None:
            self._lock = asyncio.Lock()
        async with self._lock:
            if self._token is not None and (time.time() * 1000) + self._skew_ms < self._expiry_ms:
                return self._token  # cached, not near expiry
            self._token, self._expiry_ms = await self._mint()
            return self._token

    async def _mint(self) -> Tuple[str, float]:
        # Deferred imports keep package import light (lazyImports=true) and avoid
        # import-ordering issues with the generated package __init__.
        # pylint: disable=import-outside-toplevel
        from thoughtspot_rest_api_sdk.api_client import ApiClient
        from thoughtspot_rest_api_sdk.configuration import Configuration
        from thoughtspot_rest_api_sdk.api.authentication_api import AuthenticationApi
        from thoughtspot_rest_api_sdk.models.get_full_access_token_request import (
            GetFullAccessTokenRequest,
        )

        # A token-mint Configuration carries no access_token — the
        # /auth/token/full endpoint is itself the login and needs no bearer.
        config = Configuration(
            host=self._host,
            verify_ssl=self._verify_ssl,
            ssl_ca_cert=self._ssl_ca_cert,
            proxy=self._proxy,
        )
        async with ApiClient(config) as api_client:
            resp = await AuthenticationApi(api_client).get_full_access_token(
                GetFullAccessTokenRequest(**self._request_kwargs)
            )
        return resp.token, float(resp.expiration_time_in_millis)
