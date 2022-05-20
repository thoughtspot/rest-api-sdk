
# Client Class Documentation

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

## RESTAPI SDKClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description |
|  --- | --- |
| SessionController | Gets SessionController controller. |
| UserController | Gets UserController controller. |
| GroupController | Gets GroupController controller. |
| MetadataController | Gets MetadataController controller. |
| DatabaseController | Gets DatabaseController controller. |
| ConnectionController | Gets ConnectionController controller. |
| DataController | Gets DataController controller. |
| ReportController | Gets ReportController controller. |
| AdminController | Gets AdminController controller. |
| SecurityController | Gets SecurityController controller. |
| LogsController | Gets LogsController controller. |
| MaterializationController | Gets MaterializationController controller. |
| CustomActionsController | Gets CustomActionsController controller. |

### Properties

| Name | Description | Type |
|  --- | --- | --- |
| HttpClientConfiguration | Gets the configuration of the Http Client associated with this client. | `IHttpClientConfiguration` |
| Timeout | Http client timeout. | `TimeSpan` |
| AcceptLanguage | response format | `string` |
| ContentType | body content type for post request | `string` |
| Environment | Current API environment. | `Environment` |
| BaseUrl | BaseUrl value. | `string` |
| AccessTokenCredentials | Gets the access token to use with OAuth 2 authentication. | `IAccessTokenCredentials` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `GetBaseUri(Server alias = Server.Default)` | Gets the URL for a particular alias in the current environment and appends it with template parameters. | `string` |
| `ToBuilder()` | Creates an object of the RESTAPI SDKClient using the values provided for the builder. | `Builder` |

## RESTAPI SDKClient Builder Class

Class to build instances of RESTAPI SDKClient.

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `HttpClientConfiguration(Action<HttpClientConfiguration.Builder> action)` | Gets the configuration of the Http Client associated with this client. | `Builder` |
| `Timeout(TimeSpan timeout)` | Http client timeout. | `Builder` |
| `AcceptLanguage(string acceptLanguage)` | response format | `Builder` |
| `ContentType(string contentType)` | body content type for post request | `Builder` |
| `Environment(Environment environment)` | Current API environment. | `Builder` |
| `BaseUrl(string baseUrl)` | BaseUrl value. | `Builder` |
| `AccessTokenCredentials(IAccessTokenCredentials accessTokenCredentials)` | Gets the access token to use with OAuth 2 authentication. | `Builder` |

