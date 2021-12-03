
# Getting Started with RESTAPI SDK

## Install the Rest API SDK

To install the SDK, run the following command at the command line:

    npm install @thoughtspot/rest-api-sdk

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

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

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Session](doc/controllers/session.md)
* [User](doc/controllers/user.md)
* [Group](doc/controllers/group.md)
* [Metadata](doc/controllers/metadata.md)
* [Database](doc/controllers/database.md)
* [Dependency](doc/controllers/dependency.md)

## Classes Documentation

* [ApiResponse](doc/api-response.md)
* [ApiError](doc/api-error.md)

## Live Playground
We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.