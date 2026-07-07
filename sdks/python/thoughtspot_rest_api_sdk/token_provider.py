# coding: utf-8

"""
    ThoughtSpot REST API SDK — token provider.

    CUSTOM (ThoughtSpot): a caching bearer-token supplier for the
    ``/auth/token/full`` endpoint. Pass an instance as
    ``Configuration(access_token=provider)``; the SDK invokes it per request
    (the async path and the ``*_sync`` background-loop path) through the
    HTTP-layer ``_TokenAuth`` in rest.py. The provider mints a token, caches it,
    and refreshes only when within ``expiry_skew_sec`` of expiry — so concurrent
    callers share a single in-flight refresh (single-flight via an asyncio.Lock).

    This is a hand-maintained supporting module (not generator output);
    generate.sh copies it to the package root and exports it from __init__.py
    after generation.
"""

import asyncio
import time
from typing import Optional, Tuple


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
