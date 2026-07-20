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

Set `access_token` on the `Configuration`. It accepts a **static token string**,
the **built-in token provider**, or **your own callable** — three options for the
three common cases.

**1. Static token** — when you already hold a bearer token:

```python
config = Configuration(host=BASE_URL, access_token="YOUR_BEARER_TOKEN")
```

**2. Built-in provider** — `ThoughtSpotTokenProvider` mints a token from
`/auth/token/full` and refreshes it transparently. Supply exactly one of
`password` (basic auth) or `secret_key` (trusted authentication). It caches the
token and only re-mints when the cached one is near expiry, and collapses
concurrent refreshes into a single call:

```python
from thoughtspot_rest_api_sdk import Configuration, ThoughtSpotTokenProvider

provider = ThoughtSpotTokenProvider(BASE_URL, "USERNAME", password="PASSWORD")
config = Configuration(host=BASE_URL, access_token=provider)
```

**3. Your own callable** — for any other identity source. It is invoked on every
request (so it doubles as the refresh hook) and may be sync or async:

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
| `access_token` | `None` | Bearer token string, or a callable returning a token |
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

This rebuilds the underlying API client. For continuous token refresh you do not
need this — set `access_token` to a callable (see *Authentication*); it is invoked
on every request.

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
