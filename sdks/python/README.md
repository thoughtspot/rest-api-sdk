# ThoughtSpot Python SDK

Python client for ThoughtSpot's [v2 REST APIs](https://developers.thoughtspot.com/docs/rest-api-v2).

The SDK is async-first (built on [httpx](https://www.python-httpx.org/)) and ships a
synchronous variant of every method. It is compatible with Python 3.9 and above.

## Installation

```
pip install thoughtspot-rest-api-sdk
```

## Usage

Create a `Configuration`, pass it to an `ApiClient`, and make calls through
`ThoughtSpotRestApi` (which exposes every endpoint) or a focused per-tag class
such as `UsersApi` or `MetadataApi`.

```python
import asyncio
from thoughtspot_rest_api_sdk import Configuration, ThoughtSpotRestApi

BASE_URL = "https://your-cluster.thoughtspot.cloud"

async def main():
    config = Configuration(host=BASE_URL, access_token="YOUR_BEARER_TOKEN")

    # Pass the Configuration directly; the client manages its own connection
    # pool. (To share one pool across several API classes, build an ApiClient
    # explicitly and pass that instead — see "Per-tag API classes".)
    async with ThoughtSpotRestApi(configuration=config) as client:

        # Current user
        user = await client.get_current_user_info()
        print(user.name)

        # Search with a request body (dict or the typed request model)
        users = await client.search_users({"record_offset": 0, "record_size": 10})
        for u in users:
            print(u.name)

asyncio.run(main())
```

### Synchronous usage

Every method has a blocking `*_sync` variant. No event loop or `await` is
required, which makes the SDK usable from synchronous code (Django, Flask,
scripts, notebooks):

```python
from thoughtspot_rest_api_sdk import Configuration, ThoughtSpotRestApi

config = Configuration(host=BASE_URL, access_token="YOUR_BEARER_TOKEN")
client = ThoughtSpotRestApi(configuration=config)

user = client.get_current_user_info_sync()
print(user.name)
```

### Per-tag API classes

`ThoughtSpotRestApi` aggregates all endpoints. For a focused surface, instantiate
a per-tag class against the same `ApiClient` — it shares the same connection pool
and authentication:

```python
from thoughtspot_rest_api_sdk import ApiClient, Configuration, UsersApi, MetadataApi

async with ApiClient(config) as api_client:
    users = UsersApi(api_client)
    metadata = MetadataApi(api_client)
    await users.search_users({"record_offset": 0, "record_size": 10})
```

### Accessing response status and headers

Each method has a `*_with_http_info` variant (and a `*_sync_with_http_info`
variant) that returns the status code, headers, and deserialized data:

```python
response = await client.get_current_user_info_with_http_info()
print(response.status_code)
print(response.headers)
print(response.data)
```

## Authentication

Pick one of these:

| You have | Use |
|---|---|
| Your own way to mint tokens (any `/auth/token/*` endpoint, your backend) | `get_token=` **(recommended)** |
| A bearer token you already hold | `access_token="..."` |
| A username plus password or secret key, and want the SDK to mint | `ThoughtSpotTokenProvider` (no 401 recovery; see below) |

### `get_token` (recommended)

Pass a zero-argument function that returns a token. Your secret key never goes
to the SDK. Load it from an environment variable or a secret manager, and run
`get_token` server-side only. Don't send full-access tokens to browsers. The
function can be sync or async, and can return:

- a token `str`;
- a `TokenResult(token, expires_at_ms=...)`, where `expires_at_ms` is epoch
  milliseconds;
- the response of any `/auth/token/*` call, used as-is (its
  `expiration_time_in_millis` gives the expiry);
- a dict with a `token` key and, optionally, `expires_at_ms`,
  `expiration_time_in_millis` or `expiresAt`. The raw `/auth/token/*` JSON works.

```python
import os

from thoughtspot_rest_api_sdk import (
    ApiClient, AuthenticationApi, Configuration, GetFullAccessTokenRequest,
    ThoughtSpotRestApi, TokenResult,
)

# A separate client with no token mints the tokens.
auth_api = AuthenticationApi(ApiClient(Configuration(host=BASE_URL)))

async def get_token() -> TokenResult:
    resp = await auth_api.get_full_access_token(
        GetFullAccessTokenRequest(
            username="USERNAME", secret_key=os.environ["THOUGHTSPOT_SECRET_KEY"]
        )
    )
    return TokenResult(resp.token, expires_at_ms=resp.expiration_time_in_millis)
    # Equivalent: `return resp`

client = ThoughtSpotRestApi(ApiClient(Configuration(host=BASE_URL, get_token=get_token)))
```

You can also call your own backend:

```python
def get_token() -> TokenResult:
    data = requests.post(MY_BACKEND_URL, timeout=10).json()
    return TokenResult(data["token"], expires_at_ms=data["expiration_time_in_millis"])

config = Configuration(host=BASE_URL, get_token=get_token)
```

What the SDK does with it:

- **First use, not construction.** `get_token` is first called on the first
  request. Creating the `Configuration` or client does not call it.
- **Cached per client.** Each `ApiClient` keeps its own token, even when
  clients share a `Configuration`. The cached token is reused without
  validation calls.
- **Refresh before expiry.** When the expiry is known, `get_token` is called
  again once fewer than `token_refresh_buffer_ms` (default `30000`) remain. Set
  it on the `Configuration`, or per token with
  `TokenResult(..., refresh_buffer_ms=...)`. When `get_token` returns a plain
  `str`, the expiry is unknown. The token is then kept until the server rejects
  it, which costs one 401 round trip at each expiry. If an early refresh fails
  while the cached token is still valid, the cached token is used and a warning
  is logged. Once the token has expired, the `get_token` error is raised. A
  token that is already inside the buffer when minted logs a one-time warning:
  check that `expires_at_ms` is in milliseconds, not seconds.
- **One retry on 401.** On a 401 the SDK drops the cached token, calls
  `get_token` once, and resends the request once. If that also returns 401,
  `UnauthorizedException` is raised. This retry is separate from the
  `retries` budget, and a 401 in `retry_statuses` is ignored while `get_token`
  is set. The resend assumes the server rejects an unauthenticated request
  before processing it, which is how ThoughtSpot's authentication works.
- **Single-flight.** Concurrent requests that all need a token share one
  `get_token` call. A burst of 401s for the same token also triggers only one
  call.
- **Bounded wait.** A `get_token` call may take up to `get_token_timeout`
  seconds (default `300`). After that, every request waiting on it fails with
  `TimeoutError`, and the next request calls `get_token` again. A sync
  `get_token` thread can't be stopped; its late result is discarded. A
  timeout during an early refresh is handled like any failed refresh.
- **Retry safety.** Multipart bodies are rewound before the retry. For SSE
  `*_stream` endpoints, the token is fetched before the stream opens, and a 401
  on open is retried once. A persistent 401 is raised to the caller as
  `UnauthorizedException`.
- **No tokens in logs.** The SDK logs each `get_token` call and its reason
  (`cold`, `expiry`, `401`) at DEBUG level on the `thoughtspot_rest_api_sdk.token`
  logger, never the token. `TokenResult` hides the token in its `repr()`.

Usage notes:

- A sync `get_token` runs in a worker thread, so it may block on I/O or call the
  SDK's `*_sync` methods. An async `get_token` runs on the event loop, so it
  must `await` the async methods and never call `*_sync` ones.
- `get_token` may mint through the same client you pass it to. Requests made
  from inside `get_token` are sent without the managed token and are not
  retried on 401, so they don't wait on the `get_token` call they belong to.
- Share one `ApiClient`, and so one cache, across your API objects, and use it
  from one event loop.
- `get_token` is read when the `ApiClient` is created.
- With `get_token`, the SDK sets the `Authorization` header on every request,
  overriding any value passed through `_headers` or `_request_auth`.
- `get_token` and `access_token` cannot be used together.
- Tokens must be visible ASCII with no whitespace. Strip any trailing newline
  from a token read from a file.

### Static token

Use this when you already hold a bearer token. It is sent as-is and never
refreshed or retried.

```python
config = Configuration(host=BASE_URL, access_token="YOUR_BEARER_TOKEN")
```

### Built-in provider

`ThoughtSpotTokenProvider` mints a token from
`/auth/token/full` and refreshes it transparently. Supply exactly one of
`password` (basic auth) or `secret_key` (trusted authentication). It caches the
token and only re-mints when the cached one is near expiry, and collapses
concurrent refreshes into a single call:

```python
from thoughtspot_rest_api_sdk import Configuration, ThoughtSpotTokenProvider

provider = ThoughtSpotTokenProvider(BASE_URL, "USERNAME", password="PASSWORD")
config = Configuration(host=BASE_URL, access_token=provider)
```

> **No 401 recovery.** The provider re-mints only near expiry. If the server
> rejects its token earlier (revoked, rotated, clock skew), requests fail with
> `UnauthorizedException` until the cached token expires. For 401 recovery,
> mint with `get_token` instead (example above). Don't pass the provider
> itself as `get_token`: after a 401 it returns the same cached token, so the
> retry fails too.

### Per-request callable

`access_token` also accepts a callable, invoked on **every** request with no
caching and no 401 retry. It is kept for backward compatibility; prefer
`get_token`.

```python
async def token_supplier() -> str:
    return await my_identity_provider.fetch_bearer()

config = Configuration(host=BASE_URL, access_token=token_supplier)
```

## Streaming

Endpoints that return a server-sent event (SSE) stream expose an additional
`*_stream` async generator that yields events as they arrive:

```python
from thoughtspot_rest_api_sdk.models import SendAgentConversationMessageStreamingRequest

async for event in client.send_agent_conversation_message_streaming_stream(
    conversation_identifier="CONVERSATION_ID",
    send_agent_conversation_message_streaming_request=(
        SendAgentConversationMessageStreamingRequest(messages=["Hello"])
    ),
):
    if event.get("type") == "text-chunk":
        print(event.get("content", ""), end="", flush=True)
```

## File uploads

Multipart endpoints (for example DBT and Style Customization) accept file content
as raw bytes, a `(filename, bytes)` tuple, or an open file handle:

```python
with open("project.zip", "rb") as f:
    await client.dbt_connection(
        connection_name="my-connection",
        database_name="MY_DB",
        import_type="ZIP_FILE",
        file_content=f,
    )
```

## File downloads

Export endpoints return binary content as bytes. Write it to disk:

```python
from pathlib import Path

data = await client.export_liveboard_report(metadata_identifier="LIVEBOARD_ID", file_format="PDF")
Path("report.pdf").write_bytes(data)
```

## Error handling

API errors raise typed exceptions. Catch them by HTTP status, or catch the base
`ApiException`:

```python
from thoughtspot_rest_api_sdk.exceptions import (
    ApiException,                  # base class
    BadRequestException,           # 400
    UnauthorizedException,         # 401
    ForbiddenException,            # 403
    NotFoundException,             # 404
    ConflictException,             # 409
    UnprocessableEntityException,  # 422
    ServiceException,              # 5xx
)

try:
    await client.search_metadata({"metadata": [{"type": "LIVEBOARD"}]})
except UnauthorizedException:
    ...  # refresh credentials and retry
except ApiException as e:
    print(e.status, e.reason, e.body, e.headers)
```

Every exception exposes `.status`, `.reason`, `.body`, `.data`, and `.headers`.

## Retries

Retries are **off by default**. Set `retries` on the `Configuration` to enable
automatic retries with exponential backoff and jitter:

```python
config = Configuration(host=BASE_URL, access_token="...", retries=3)
```

When enabled, the SDK retries on `retry_statuses` (default `429, 502, 503, 504`)
and on network/timeout errors, with exponential backoff and jitter. Once the
retry budget is exhausted the final response is returned, raising the usual typed
exception (a 429 raises the base `ApiException` — branch on `e.status == 429`).

POST requests are retried too (ThoughtSpot uses POST for read endpoints). To
avoid retrying non-idempotent calls, restrict the eligible methods:

```python
config.retry_methods = {"GET", "PUT", "DELETE"}
```

## Configuration

| Option | Default | Description |
|---|---|---|
| `host` | — | Cluster URL, e.g. `https://your-cluster.thoughtspot.cloud` |
| `get_token` | `None` | Callable that mints a token: cached per client, refreshed before expiry, retried once on 401 (see *Authentication*) |
| `token_refresh_buffer_ms` | `30000` | Call `get_token` again when fewer than this many milliseconds of validity remain |
| `access_token` | `None` | Bearer token string, or a callable invoked on every request |
| `verify_ssl` | `True` | Set `False` for clusters with self-signed certificates |
| `ssl_ca_cert` / `ca_cert_data` | `None` | Custom CA bundle (file path / PEM string) |
| `cert_file` / `key_file` | `None` | Client certificate and key for mutual TLS |
| `proxy` | `None` | Proxy URL, e.g. `http://127.0.0.1:8888` |
| `connection_pool_maxsize` | `100` | Maximum number of concurrent connections |
| `timeout` | `None` | Default request timeout — seconds (float) or an `httpx.Timeout` |
| `connect_timeout` / `read_timeout` / `write_timeout` / `pool_timeout` | `None` | Per-phase default timeouts in seconds; phases left unset default to 300s |
| `default_headers` | `{}` | Headers added to every request |
| `retries` | `None` (off) | Max retry attempts; set `> 0` to enable automatic retries |
| `retry_backoff_factor` | `0.5` | Base seconds for exponential backoff (plus jitter) |
| `retry_max_backoff` | `30` | Cap on a single retry's sleep, in seconds |
| `retry_statuses` | `{429, 502, 503, 504}` | Status codes that trigger a retry |
| `retry_methods` | all | Restrict retries to specific HTTP methods |

The default request timeout is **300s** when nothing is configured. The timeout
and header options are constructor arguments:

```python
config = Configuration(
    host=BASE_URL,
    access_token="...",
    connect_timeout=5,
    read_timeout=60,
    default_headers={"X-My-App": "demo"},
)
```

A single call can still override these:
`await client.search_users({...}, _request_timeout=30, _headers={"X-Trace": "1"})`.
`_request_timeout` accepts a float (all phases) or a `(connect, read)` tuple of floats.

> **Note:** For clusters with self-signed certificates, disable verification:
>
> ```python
> config = Configuration(host=BASE_URL, access_token="YOUR_BEARER_TOKEN", verify_ssl=False)
> ```

## Updating configuration at runtime

To apply a new `Configuration` to an existing client — for example after rotating
credentials or changing timeouts — call `apply_configuration`:

```python
client.apply_configuration(Configuration(host=BASE_URL, access_token=NEW_TOKEN))
```

This rebuilds the underlying API client, which also drops any token cached from
`get_token`. You don't need it for token refresh: `get_token` handles that (see
*Authentication*).

## Live Playground

We recommend that you browse through the
[API playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2_0)
before you start constructing your API requests. The playground offers an
interactive portal with comprehensive information about the API endpoints and
their request and response workflows.

## Documentation for API endpoints

The full list of available methods is on the `ThoughtSpotRestApi` class in
[`thoughtspot_rest_api_sdk/api/thought_spot_rest_api.py`](thoughtspot_rest_api_sdk/api/thought_spot_rest_api.py).
Method names match the operation IDs in the REST API, in snake_case.

## Author

This SDK is developed and maintained by **ThoughtSpot**.

- **Website**: [www.thoughtspot.com](https://www.thoughtspot.com/)
- **GitHub**: [thoughtspot](https://github.com/thoughtspot)
- **Email**: [support@thoughtspot.com](mailto:support@thoughtspot.com)

## License

For full details, please refer to the
[license documentation](https://github.com/thoughtspot/rest-api-sdk/blob/release/LICENSE.md).
