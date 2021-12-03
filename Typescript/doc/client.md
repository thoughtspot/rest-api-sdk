
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `contentType` | `string` | body content type for post request<br>*Default*: `'application/json'` |
| `acceptLanguage` | `string` | response format<br>*Default*: `'application/json'` |
| `baseUrl` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `timeout` | `number` | Timeout for API calls.<br>*Default*: `0` |
| `accessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```ts
const client = new Client({
  contentType: 'application/json',
  acceptLanguage: 'application/json',
  timeout: 0,
  environment: Environment.Production,
  accessToken: 'AccessToken',
})
```

## RESTAPI SDK Client

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

## Controllers

| Name | Description |
|  --- | --- |
| session | Gets SessionController |
| user | Gets UserController |
| group | Gets GroupController |
| metadata | Gets MetadataController |
| database | Gets DatabaseController |
| dependency | Gets DependencyController |

