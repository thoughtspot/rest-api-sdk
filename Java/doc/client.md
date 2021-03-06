
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `acceptLanguage` | `String` | response format<br>*Default*: `"application/json"` |
| `contentType` | `String` | body content type for post request<br>*Default*: `"application/json"` |
| `baseUrl` | `String` | *Default*: `"https://localhost:443"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
RESTAPISDKClient client = new RESTAPISDKClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .acceptLanguage("application/json")
    .contentType("application/json")
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .baseUrl("https://localhost:443")
    .build();
```

## RESTAPI SDKClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getSessionController()` | Provides access to Session controller. | `SessionController` |
| `getUserController()` | Provides access to User controller. | `UserController` |
| `getGroupController()` | Provides access to Group controller. | `GroupController` |
| `getOrgController()` | Provides access to Org controller. | `OrgController` |
| `getMetadataController()` | Provides access to Metadata controller. | `MetadataController` |
| `getDatabaseController()` | Provides access to Database controller. | `DatabaseController` |
| `getConnectionController()` | Provides access to Connection controller. | `ConnectionController` |
| `getDataController()` | Provides access to Data controller. | `DataController` |
| `getReportController()` | Provides access to Report controller. | `ReportController` |
| `getAdminController()` | Provides access to Admin controller. | `AdminController` |
| `getSecurityController()` | Provides access to Security controller. | `SecurityController` |
| `getLogsController()` | Provides access to Logs controller. | `LogsController` |
| `getMaterializationController()` | Provides access to Materialization controller. | `MaterializationController` |
| `getCustomActionsController()` | Provides access to CustomActions controller. | `CustomActionsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getBaseUrl()` | baseUrl value. | `String` |
| `getAcceptLanguage()` | response format. | `String` |
| `getContentType()` | body content type for post request. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | `BearerAuthCredentials` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

