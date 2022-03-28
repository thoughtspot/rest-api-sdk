
# Getting Started with RESTAPI SDK

## Install the Package

Run the following command from your project directory to install the package from npm:

```ts
npm install thoughtspot@rest-api-sdk@1.10.0
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

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

## Authorization

This API uses `OAuth 2 Bearer token`.

## Guide
[API Reference](https://github.com/thoughtspot/rest-api-sdk/blob/1.10.0/Typescript/doc/README.md)
## Live Playground
We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.
