
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `acceptLanguage` | `string` | response format<br>*Default*: `'application/json'` |
| `contentType` | `string` | body content type for post request<br>*Default*: `'application/json'` |
| `baseUrl` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `timeout` | `number` | Timeout for API calls.<br>*Default*: `0` |
| `httpClientOptions` | `Partial<HttpClientOptions>` | Stable configurable http client options. |
| `unstableHttpClientOptions` | `any` | Unstable configurable http client options. |
| `accessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

## HttpClientOptions

| Parameter | Type | Description |
|  --- | --- | --- |
| `timeout` | `number` | Timeout in milliseconds. |
| `httpAgent` | `any` | Custom http agent to be used when performing http requests. |
| `httpsAgent` | `any` | Custom https agent to be used when performing http requests. |
| `retryConfig` | `Partial<RetryConfiguration>` | Configurations to retry requests. |

## RetryConfiguration

| Parameter | Type | Description |
|  --- | --- | --- |
| `maxNumberOfRetries` | `number` | Maximum number of retries. <br> *Default*: `0` |
| `retryOnTimeout` | `boolean` | Whether to retry on request timeout. <br> *Default*: `true` |
| `retryInterval` | `number` | Interval before next retry. Used in calculation of wait time for next request in case of failure. <br> *Default*: `1` |
| `maximumRetryWaitTime` | `number` | Overall wait time for the requests getting retried. <br> *Default*: `0` |
| `backoffFactor` | `number` | Used in calculation of wait time for next request in case of failure. <br> *Default*: `2` |
| `httpStatusCodesToRetry` | `number[]` | Http status codes to retry against. <br> *Default*: `[408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524]` |
| `httpMethodsToRetry` | `HttpMethod[]` | Http methods to retry against. <br> *Default*: `['GET', 'PUT', 'GET', 'PUT']` |

The API client can be initialized as follows:

```ts
const client = new Client({
  acceptLanguage: 'application/json',
  contentType: 'application/json',
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
| org | Gets OrgController |
| metadata | Gets MetadataController |
| database | Gets DatabaseController |
| connection | Gets ConnectionController |
| data | Gets DataController |
| report | Gets ReportController |
| admin | Gets AdminController |
| security | Gets SecurityController |
| logs | Gets LogsController |
| materialization | Gets MaterializationController |
| customActions | Gets CustomActionsController |

