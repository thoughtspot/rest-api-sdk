
# Getting Started with RESTAPI SDK

## Install the Rest API SDK

The latest version of .NET SDK is available in nuget package manager - https://www.nuget.org/packages/thoughtspot.rest.api.sdk.

To install the SDK, run the following command at the command line: 

`dotnet add package thoughtspot.rest.api.sdk` 

For projects that support PackageReference, add below XML node into the project file to reference the package.

`<PackageReference Include="thoughtspot.rest.api.sdk" />`

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://github.com/thoughtspot/rest-api-sdk/blob/main/DotNet/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `ContentType` | `string` | body content type for post request<br>*Default*: `"application/json"` |
| `AcceptLanguage` | `string` | response format<br>*Default*: `"application/json"` |
| `BaseUrl` | `string` | *Default*: `"https://localhost:443"` |
| `Environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `Timeout` | `TimeSpan` | Http client timeout.<br>*Default*: `TimeSpan.FromSeconds(100)` |
| `AccessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```csharp
RESTAPISDK.Standard.RESTAPISDKClient client = new RESTAPISDK.Standard.RESTAPISDKClient.Builder()
    .AccessToken("AccessToken")
    .ContentType(GetEnvironmentVariable("application/json"))
    .AcceptLanguage(GetEnvironmentVariable("application/json"))
    .Environment(RESTAPISDK.Standard.Environment.Production)
    .BaseUrl("https://localhost:443")
    .HttpClientConfig(config => config.NumberOfRetries(0))
    .Build();
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## Guide
[API Reference](https://github.com/thoughtspot/rest-api-sdk/blob/main/DotNet/doc/README.md)

## Live Playground
We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.
