# Session

```ts
const sessionController = new SessionController(client);
```

## Class Name

`SessionController`

## Methods

* [Session Info](/doc/controllers/session.md#session-info)
* [Login](/doc/controllers/session.md#login)
* [Logout](/doc/controllers/session.md#logout)


# Session Info

Get Session object information

```ts
async sessionInfo(
  requestOptions?: RequestOptions
): Promise<ApiResponse<RestAPISessionInfo>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`RestAPISessionInfo`](/doc/models/rest-api-session-info.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await sessionController.sessionInfo();
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Login

You can programmatically login a user to ThoughtSpot

:information_source: **Note** This endpoint does not require authentication.

```ts
async login(
  body?: ApiRestV2SessionLoginRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SessionAuthTokenResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionLoginRequest \| undefined`](/doc/models/api-rest-v2-session-login-request.md) | Body, Optional | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SessionAuthTokenResponse`](/doc/models/session-auth-token-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await sessionController.login();
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Logout

To log a user out of the current session, use this endpoint

```ts
async logout(
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await sessionController.logout();
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

