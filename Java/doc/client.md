
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `baseUrl` | `String` | *Default*: `"https://localhost:443"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
ThoughtSpotPublicRESTAPIClient client = new ThoughtSpotPublicRESTAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .baseUrl("https://localhost:443")
    .build();
```

## ThoughtSpot Public REST APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getUserController()` | Provides access to User controller. | `UserController` |
| `getGroupController()` | Provides access to Group controller. | `GroupController` |
| `getMetadataController()` | Provides access to Metadata controller. | `MetadataController` |
| `getDatabaseController()` | Provides access to Database controller. | `DatabaseController` |
| `getConnectionController()` | Provides access to Connection controller. | `ConnectionController` |
| `getDataController()` | Provides access to Data controller. | `DataController` |
| `getLogsController()` | Provides access to Logs controller. | `LogsController` |
| `getCustomActionsController()` | Provides access to CustomActions controller. | `CustomActionsController` |
| `getSecurityController()` | Provides access to Security controller. | `SecurityController` |
| `getOrgController()` | Provides access to Org controller. | `OrgController` |
| `getSessionController()` | Provides access to Session controller. | `SessionController` |
| `getAdminController()` | Provides access to Admin controller. | `AdminController` |
| `getReportController()` | Provides access to Report controller. | `ReportController` |
| `getMaterializationController()` | Provides access to Materialization controller. | `MaterializationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getBaseUrl()` | baseUrl value. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | `BearerAuthCredentials` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

