
# Getting Started with RESTAPI SDK

## Install the Package

The SDK is available as a NuGet that you can search for and install using the NuGet GUI. You can also use the following command on the Package Manager Console:

```csharp
Install-Package thoughtspot.rest.api.sdk -Version 1.13.0
```

You can also view the NuGet at:
https://www.nuget.org/packages/thoughtspot.rest.api.sdk/1.13.0

If you are building with .NET CLI tools then you can also use the following command:

```bash
dotnet add package thoughtspot.rest.api.sdk --version 1.13.0
```

## Test the SDK

The generated SDK also contain one or more Tests, which are contained in the Tests project. In order to invoke these test cases, you will need `NUnit 3.0 Test Adapter Extension` for Visual Studio. Once the SDK is complied, the test cases should appear in the Test Explorer window. Here, you can click `Run All` to execute these test cases.

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

## List of APIs

* [Session](doc/controllers/session.md)
* [User](doc/controllers/user.md)
* [Group](doc/controllers/group.md)
* [Org](doc/controllers/org.md)
* [Metadata](doc/controllers/metadata.md)
* [Database](doc/controllers/database.md)
* [Connection](doc/controllers/connection.md)
* [Data](doc/controllers/data.md)
* [Report](doc/controllers/report.md)
* [Admin](doc/controllers/admin.md)
* [Security](doc/controllers/security.md)
* [Logs](doc/controllers/logs.md)
* [Materialization](doc/controllers/materialization.md)
* [Custom Actions](doc/controllers/custom-actions.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration Builder](doc/http-client-configuration-builder.md)
* [IAuthManager](doc/i-auth-manager.md)
* [ApiException](doc/api-exception.md)

