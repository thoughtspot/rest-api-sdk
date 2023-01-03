
# Client Class Documentation

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

## ThoughtSpot Public REST APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description |
|  --- | --- |
| UserController | Gets UserController controller. |
| GroupController | Gets GroupController controller. |
| MetadataController | Gets MetadataController controller. |
| DatabaseController | Gets DatabaseController controller. |
| ConnectionController | Gets ConnectionController controller. |
| DataController | Gets DataController controller. |
| LogsController | Gets LogsController controller. |
| CustomActionsController | Gets CustomActionsController controller. |
| SecurityController | Gets SecurityController controller. |
| OrgController | Gets OrgController controller. |
| SessionController | Gets SessionController controller. |
| AdminController | Gets AdminController controller. |
| ReportController | Gets ReportController controller. |
| MaterializationController | Gets MaterializationController controller. |

### Properties

| Name | Description | Type |
|  --- | --- | --- |
| HttpClientConfiguration | Gets the configuration of the Http Client associated with this client. | `IHttpClientConfiguration` |
| Timeout | Http client timeout. | `TimeSpan` |
| Environment | Current API environment. | `Environment` |
| BaseUrl | BaseUrl value. | `string` |
| AccessTokenCredentials | Gets the access token to use with OAuth 2 authentication. | `IAccessTokenCredentials` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `GetBaseUri(Server alias = Server.Default)` | Gets the URL for a particular alias in the current environment and appends it with template parameters. | `string` |
| `ToBuilder()` | Creates an object of the ThoughtSpot Public REST APIClient using the values provided for the builder. | `Builder` |

## ThoughtSpot Public REST APIClient Builder Class

Class to build instances of ThoughtSpot Public REST APIClient.

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `HttpClientConfiguration(Action<HttpClientConfiguration.Builder> action)` | Gets the configuration of the Http Client associated with this client. | `Builder` |
| `Timeout(TimeSpan timeout)` | Http client timeout. | `Builder` |
| `Environment(Environment environment)` | Current API environment. | `Builder` |
| `BaseUrl(string baseUrl)` | BaseUrl value. | `Builder` |
| `AccessTokenCredentials(IAccessTokenCredentials accessTokenCredentials)` | Gets the access token to use with OAuth 2 authentication. | `Builder` |

