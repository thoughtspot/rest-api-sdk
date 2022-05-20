
# Getting Started with RESTAPI SDK

SDK for ThoughtSpot's v2 [Rest APIs](https://developers.thoughtspot.com/docs/?pageid=rest-api-v2) (Beta)

## Install the Package

The SDK is available as a NuGet that you can search for and install using the NuGet GUI. You can also use the following command on the Package Manager Console:

```csharp
Install-Package thoughtspot.rest.api.sdk -Version 1.10.0
```

You can also view the NuGet at:
https://www.nuget.org/packages/thoughtspot.rest.api.sdk/1.10.0

If you are building with .NET CLI tools then you can also use the following command:

```bash
dotnet add package thoughtspot.rest.api.sdk --version 1.10.0
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `AcceptLanguage` | `string` | response format<br>*Default*: `"application/json"` |
| `ContentType` | `string` | body content type for post request<br>*Default*: `"application/json"` |
| `BaseUrl` | `string` | *Default*: `"https://localhost:443"` |
| `Environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `Timeout` | `TimeSpan` | Http client timeout.<br>*Default*: `TimeSpan.FromSeconds(100)` |
| `AccessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```csharp
RESTAPISDK.Standard.RESTAPISDKClient client = new RESTAPISDK.Standard.RESTAPISDKClient.Builder()
    .AccessToken("AccessToken")
    .AcceptLanguage(GetEnvironmentVariable("application/json"))
    .ContentType(GetEnvironmentVariable("application/json"))
    .Environment(RESTAPISDK.Standard.Environment.Production)
    .BaseUrl("https://localhost:443")
    .HttpClientConfig(config => config.NumberOfRetries(0))
    .Build();
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## Guide
[API Reference](https://github.com/thoughtspot/rest-api-sdk/blob/1.10.0/Typescript/doc/README.md)
## Live Playground
We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.
