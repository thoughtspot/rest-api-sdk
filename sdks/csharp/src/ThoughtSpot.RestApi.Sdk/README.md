# ThoughtSpot.RestApi.Sdk

Official ThoughtSpot REST API SDK for .NET

The SDK ships both synchronous and asynchronous variants of every method, and targets net8.0 and above.

## Installation

Install the package using the .NET CLI:

```
dotnet add package ThoughtSpot.RestApi.Sdk --version 2.26.0
```

Or using the NuGet Package Manager:

```
Install-Package ThoughtSpot.RestApi.Sdk -Version 2.26.0
```

## Usage

Create an `ApiClientConfiguration`, then build a per-tag class (e.g. `AuthenticationApi`, `UsersApi`) or the aggregate `ThoughtSpotRestApi` via `CreateAsync`. `CreateAsync` is the recommended entry point — it's required for streaming methods, and for automatic token refresh when using `Username`+`Password`, `Username`+`SecretKey`, or `TokenProvider`.

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

**3. TokenProvider** — for any other identity source. It is invoked before every request, so it doubles as the refresh hook, and may wrap your own caching:

```csharp
var config = new ApiClientConfiguration
{
    Host = HOST,
    TokenProvider = async cancellationToken => await myIdentityProvider.FetchBearerAsync(cancellationToken),
};
```

A static `BearerToken` is also accepted but is obsolete — it never refreshes, so requests start failing with 401 once it expires. Prefer one of the three options above.

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

## Configuration

| Option | Default | Description |
| --- | --- | --- |
| `Host` | — | Cluster URL, e.g. `https://your-cluster.thoughtspot.cloud` |
| `Username` / `Password` | `null` | Password-based auth; fetches and refreshes a token automatically via `CreateAsync` |
| `Username` / `SecretKey` | `null` | Trusted-authentication auth |
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
