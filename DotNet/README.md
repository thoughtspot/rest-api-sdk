
# Getting Started with ThoughtSpot Public REST API

## Install the Package

If you are building with .NET CLI tools then you can also use the following command:

```bash
dotnet add package thoughtspot.rest.api.sdk --version 1.13.1
```

## Test the SDK

The generated SDK also contain one or more Tests, which are contained in the Tests project. In order to invoke these test cases, you will need `NUnit 3.0 Test Adapter Extension` for Visual Studio. Once the SDK is complied, the test cases should appear in the Test Explorer window. Here, you can click `Run All` to execute these test cases.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `BaseUrl` | `string` | *Default*: `"https://localhost:443"` |
| `Environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `Timeout` | `TimeSpan` | Http client timeout.<br>*Default*: `TimeSpan.FromSeconds(100)` |
| `AccessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```csharp
ThoughtSpotPublicRESTAPI.Standard.ThoughtSpotPublicRESTAPIClient client = new ThoughtSpotPublicRESTAPI.Standard.ThoughtSpotPublicRESTAPIClient.Builder()
    .AccessToken("AccessToken")
    .Environment(ThoughtSpotPublicRESTAPI.Standard.Environment.Production)
    .BaseUrl("https://localhost:443")
    .HttpClientConfig(config => config.NumberOfRetries(0))
    .Build();
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [User](doc/controllers/user.md)
* [Group](doc/controllers/group.md)
* [Metadata](doc/controllers/metadata.md)
* [Database](doc/controllers/database.md)
* [Connection](doc/controllers/connection.md)
* [Data](doc/controllers/data.md)
* [Logs](doc/controllers/logs.md)
* [Custom Actions](doc/controllers/custom-actions.md)
* [Security](doc/controllers/security.md)
* [Org](doc/controllers/org.md)
* [Session](doc/controllers/session.md)
* [Admin](doc/controllers/admin.md)
* [Report](doc/controllers/report.md)
* [Materialization](doc/controllers/materialization.md)

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

