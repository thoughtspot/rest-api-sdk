# ThoughtSpot.RestApi.Sdk

Official ThoughtSpot REST API SDK for .NET

The SDK ships both synchronous and asynchronous variants of every method, and targets net8.0 and above.

## Installation

Install the package using the .NET CLI:

```
dotnet add package ThoughtSpot.RestApi.Sdk --version 2.33.0
```

Or using the NuGet Package Manager:

```
Install-Package ThoughtSpot.RestApi.Sdk -Version 2.33.0
```

## Usage

Create an `ApiClientConfiguration`, then build a per-tag class (e.g. `AuthenticationApi`, `UsersApi`) or the aggregate `ThoughtSpotRestApi` via `CreateAsync`. `CreateAsync` is the recommended entry point — it's required for streaming methods, and for automatic token refresh when using `Username`+`Password`, `Username`+`SecretKey`, `TokenProvider`, or `GetToken`.

```csharp
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk;
using ThoughtSpot.RestApi.Sdk.Model;

var config = new ApiClientConfiguration
{
    Host = "https://your-thoughtspot-instance:8443",
    Username = "your-username",
    Password = "your-password",
};

var authApi = await AuthenticationApi.CreateAsync(config);
var systemApi = await SystemApi.CreateAsync(config);

var me = await authApi.GetCurrentUserInfoAsync();
Console.WriteLine($"User: {me.Name}");

var info = await systemApi.SearchSecuritySettingsAsync(new SearchSecuritySettingsRequest());
Console.WriteLine($"Response Type: {info?.GetType().Name}");
```

> Note: Set `IgnoreSslErrors = true` on the configuration only when connecting to development or test environments that use self-signed certificates. For production deployments, keep this value `false`.

### Synchronous usage

Every async method (`XxxAsync`) has a blocking counterpart with the same name minus the suffix. No `await` or async context is required, which makes the SDK usable from synchronous code:

```csharp
var me = authApi.GetCurrentUserInfo();
Console.WriteLine(me.Name);
```

### Per-tag API classes vs. the aggregate client

Instantiate a focused per-tag class (`UsersApi`, `MetadataApi`, `RolesApi`, and so on) for a narrow surface, or `ThoughtSpotRestApi` to reach every endpoint from a single object. Both are constructed the same way and take the same `ApiClientConfiguration`:

```csharp
var usersApi = await UsersApi.CreateAsync(config);
var users = await usersApi.SearchUsersAsync(new SearchUsersRequest());
```

### Accessing response status and headers

Every method has a `WithHttpInfo` / `WithHttpInfoAsync` variant that returns an `ApiResponse<T>` with the status code, headers, and deserialized data:

```csharp
var response = await authApi.GetCurrentUserInfoWithHttpInfoAsync();
Console.WriteLine(response.StatusCode);
Console.WriteLine(response.Data.Name);
```

## Authentication

Configure one of the following on `ApiClientConfiguration`:

**1. Username + Password** — the SDK fetches and refreshes a token automatically (requires `CreateAsync`):

```csharp
var config = new ApiClientConfiguration { Host = HOST, Username = "user", Password = "pass" };
var api = await AuthenticationApi.CreateAsync(config);
```

**2. Username + SecretKey** — for clusters with Trusted Authentication enabled:

```csharp
var config = new ApiClientConfiguration { Host = HOST, Username = "user", SecretKey = "secret" };
```

**3. TokenProvider** — invoked before every request. The SDK does not cache its result and does not retry a 401, so use it when you cache tokens yourself:

```csharp
var config = new ApiClientConfiguration
{
    Host = HOST,
    TokenProvider = async cancellationToken => await myIdentityProvider.FetchBearerAsync(cancellationToken),
};
```

**4. GetToken** — for any other identity source: your own backend, a secrets vault, or a separate ThoughtSpot client. You return a token, and optionally when it expires. The SDK caches it, fetches a new one before it expires, and recovers from a 401.

Return a `TokenResult` with an expiry. `/auth/token/*` responses give the expiry in epoch milliseconds:

```csharp
var api = await ThoughtSpotRestApi.CreateAsync(new ApiClientConfiguration
{
    Host = HOST,
    GetToken = async cancellationToken =>
    {
        var minted = await myBackend.MintThoughtSpotTokenAsync(userId, cancellationToken);
        return TokenResult.FromEpochMilliseconds(minted.Token, minted.ExpiresAtEpochMs);
    },
});
```

Or return a plain string. A token without an expiry is reused until the server rejects it with a 401:

```csharp
var config = new ApiClientConfiguration
{
    Host = HOST,
    GetToken = async cancellationToken => await vault.ReadSecretAsync("thoughtspot/bearer", cancellationToken),
};
```

To mint the token with the SDK itself, use a separate client, and keep it alive as long as `api`. Take the expiry from your own clock, captured before the call: the SDK models type `ExpirationTimeInMillis` as a `float`, which can be off by about a minute.

```csharp
using var minter = new AuthenticationApi(HOST);
var api = await ThoughtSpotRestApi.CreateAsync(new ApiClientConfiguration
{
    Host = HOST,
    GetToken = async cancellationToken =>
    {
        const int validitySeconds = 3600;
        var expiresAt = DateTimeOffset.UtcNow.AddSeconds(validitySeconds);
        var minted = await minter.GetFullAccessTokenAsync(
            new GetFullAccessTokenRequest(username: "svc-reporting", secretKey: secretKey, validityTimeInSec: validitySeconds),
            cancellationToken: cancellationToken);
        return new TokenResult(minted.VarToken, expiresAt);
    },
});
```

> **Important:** `GetToken` must not call the client it supplies tokens for. That request waits for its own token, so both fail with `TimeoutException` once `GetTokenTimeout` (default 5 minutes) runs out.

A static `BearerToken` is also accepted but is obsolete — it never refreshes, so requests start failing with 401 once it expires. Prefer one of the options above. `GetToken` cannot be combined with any other option. `CreateAsync` throws `ArgumentException` if it is.

### GetToken caching and 401 recovery

- The SDK reuses the cached token without validating it against the server.
- It fetches a new token when `TokenRefreshBuffer` (default 30 seconds) or less of validity remains. `TokenResult.RefreshBuffer` overrides the buffer for one token. A token that already expires within the buffer when it is fetched is fetched again on every request.
- If a refresh fails while the cached token is still valid, the SDK keeps using the cached token and tries again on the next request. Once the token has expired, the error goes to the caller. Errors are never cached.
- Concurrent requests share one fetch.
- A `GetToken` call that takes longer than `GetTokenTimeout` (default 5 minutes) is cancelled, the requests waiting on it throw `TimeoutException`, and the next request calls `GetToken` again.
- Each client instance has its own cache: each `CreateAsync` call, and each per-tag class. Use `ThoughtSpotRestApi` to share one cache across all endpoints. `ApplyConfigurationAsync` starts a new cache.
- After a 401, the SDK fetches one new token and resends the request once. If the resend also gets a 401, the call throws `ApiException` with `ErrorCode` 401. A burst of 401s on the same token causes one fetch.
- An upload from a stream that cannot seek cannot be sent twice. For such a request the SDK returns the 401 to the caller, and the next request fetches a new token.

Set `OnTokenEvent` to see when and why the SDK fetches a token. Events carry a kind, a reason (`Cold`, `Expiry` or `Unauthorized`) and, for failures, the exception type. They never contain a token. With no callback set, the SDK reports nothing:

```csharp
var config = new ApiClientConfiguration
{
    Host = HOST,
    GetToken = getToken,
    TokenRefreshBuffer = TimeSpan.FromMinutes(2),
    OnTokenEvent = e => Console.WriteLine($"ThoughtSpot token event: {e.Kind} {e.Reason} {e.ExceptionType?.Name}"),
};
```

`TokenEventKind.TokenExpiresWithinRefreshBuffer` usually means the expiry was given in seconds instead of milliseconds, or the token lifetime is shorter than the buffer.

## Streaming

Endpoints that return a server-sent event (SSE) stream expose a `XxxStreamAsync` method returning `IAsyncEnumerable<string>`. Streaming requires the class to have been built via `CreateAsync` — a raw `HttpClient` handle is needed internally, which direct construction does not set up:

```csharp
var aiApi = await AIApi.CreateAsync(config);

await foreach (var chunk in aiApi.SendAgentConversationMessageStreamingStreamAsync(
    conversationIdentifier: conversationId,
    sendAgentConversationMessageStreamingRequest: new SendAgentConversationMessageStreamingRequest
    {
        Messages = new List<string> { "Hello" },
    }))
{
    Console.Write(chunk);
}
```

## File uploads

Multipart endpoints (for example DBT and Style Customization) accept a `FileParameter`, built from a `Stream` plus an optional filename and content type:

```csharp
await using var stream = File.OpenRead("project.zip");
await dbtApi.DbtConnectionAsync(
    connectionName: "my-connection",
    databaseName: "MY_DB",
    importType: "ZIP_FILE",
    fileContent: new FileParameter("project.zip", stream));
```

## File downloads

Export endpoints (for example `ExportLiveboardReportAsync`) return a `FileParameter` wrapping the response `Stream`, filename, and content type:

```csharp
var file = await reportsApi.ExportLiveboardReportAsync(
    new ExportLiveboardReportRequest { MetadataIdentifier = liveboardId, FileFormat = "PDF" });

await using var output = File.Create("report.pdf");
await file.Content.CopyToAsync(output);
```

## Error handling

Failed calls throw `ThoughtSpot.RestApi.Sdk.Client.ApiException`:

```csharp
try
{
    await usersApi.SearchUsersAsync(new SearchUsersRequest());
}
catch (ThoughtSpot.RestApi.Sdk.Client.ApiException ex)
{
    Console.WriteLine($"{ex.ErrorCode}: {ex.Message}");
    Console.WriteLine(ex.ErrorContent);
}
```

`ApiException` exposes `ErrorCode` (the HTTP status), `Message`, `ErrorContent` (the deserialized error body), and `Headers`.

## Retries

Retries are **off by default**. Set `EnableRetries = true` on `ApiClientConfiguration` to enable the built-in Polly pipeline — up to 3 attempts with exponential backoff and jitter, on network errors and `429`/`500`/`502`/`503` responses:

```csharp
var config = new ApiClientConfiguration
{
    Host = HOST,
    Username = "user",
    Password = "pass",
    EnableRetries = true,
};
```

Supply a custom `ResiliencePipeline<HttpResponseMessage>` via `RetryPipeline` for per-instance behavior, or replace `RetryConfiguration.Default` once at application startup to change the fallback used everywhere:

```csharp
RetryConfiguration.Default = new ResiliencePipelineBuilder<HttpResponseMessage>()
    .AddRetry(new RetryStrategyOptions<HttpResponseMessage> { MaxRetryAttempts = 5 })
    .Build();
```

The `GetToken` 401 recovery is separate from this pipeline. It runs inside one attempt, so it does not use up a retry and it works with `EnableRetries = false`. Do not add `401` to a custom pipeline's `ShouldHandle`: each retry would repeat the token renewal and the resend.

## Configuration

| Option | Default | Description |
| --- | --- | --- |
| `Host` | — | Cluster URL, e.g. `https://your-cluster.thoughtspot.cloud` |
| `Username` / `Password` | `null` | Password-based auth; fetches and refreshes a token automatically via `CreateAsync` |
| `Username` / `SecretKey` | `null` | Trusted-authentication auth |
| `GetToken` | `null` | Async callable returning a token (or `TokenResult`); the SDK caches it, refreshes it and recovers from a 401 |
| `TokenRefreshBuffer` | `30s` | How long before a `GetToken` token's expiry the SDK fetches a new one |
| `GetTokenTimeout` | `5min` | Longest a `GetToken` call may take before it is cancelled and waiting requests throw `TimeoutException` |
| `OnTokenEvent` | `null` | Callback for `GetToken` fetch diagnostics; never receives tokens |
| `BearerToken` | `null` | Static token (obsolete — does not refresh) |
| `TokenProvider` | `null` | Async callable invoked before every request; you own caching/refresh |
| `TokenValiditySeconds` | `300` | How long a fetched token is considered valid before the SDK refreshes it |
| `IgnoreSslErrors` | `false` | Disable certificate validation, for self-signed or internal certs |
| `ConnectTimeout` | `60s` | TCP connection establishment timeout |
| `ReadTimeout` | `300s` | Time allowed to read a response after the connection is established |
| `WriteTimeout` | `300s` | Time allowed to write (send) a request body |
| `DefaultHeaders` | `{}` | Headers added to every outgoing request |
| `EnableRetries` | `false` | Opt in to the automatic retry pipeline |
| `RetryPipeline` | `null` | Custom Polly pipeline; falls back to `RetryConfiguration.Default` when `EnableRetries` is `true` and this is unset |

> Note: For clusters with self-signed certificates, disable verification:
>
> ```csharp
> var config = new ApiClientConfiguration { Host = HOST, Username = "user", Password = "pass", IgnoreSslErrors = true };
> ```

## Updating configuration at runtime

To apply a new configuration to an existing client — for example after rotating credentials or changing timeouts — call `ApplyConfigurationAsync`:

```csharp
await api.ApplyConfigurationAsync(api.Config with { Host = "https://new-host" });
```

For continuous token refresh you do not need this — set `TokenProvider` (see *Authentication*); it is invoked on every request.

## Live Playground

We recommend that you browse through the [API playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2_0) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints and their request and response workflows.

## Documentation for API endpoints

The full list of available methods is on the `ThoughtSpotRestApi` class, which aggregates every endpoint. Method names match the operation IDs in the REST API, in PascalCase.

## Author

This SDK is developed and maintained by **ThoughtSpot**.

- **Website**: [www.thoughtspot.com](https://www.thoughtspot.com/)
- **GitHub**: [thoughtspot](https://github.com/thoughtspot)
- **Email**: [support@thoughtspot.com](mailto:support@thoughtspot.com)

## License

For full details, please refer to the [license documentation](https://github.com/thoughtspot/rest-api-sdk/blob/release/LICENSE.md).
