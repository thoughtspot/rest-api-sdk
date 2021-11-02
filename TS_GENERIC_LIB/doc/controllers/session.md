# Session

```ts
const sessionController = new SessionController(client);
```

## Class Name

`SessionController`

## Methods

* [Session Info](/doc/controllers/session.md#session-info)
* [Login](/doc/controllers/session.md#login)
* [Gettoken](/doc/controllers/session.md#gettoken)
* [Logout](/doc/controllers/session.md#logout)
* [Revoketoken](/doc/controllers/session.md#revoketoken)


# Session Info

To get session object information, use this endpoint

```ts
async sessionInfo(
  requestOptions?: RequestOptions
): Promise<ApiResponse<SessionInfoResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SessionInfoResponse`](/doc/models/session-info-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Login

To programmatically login a user to ThoughtSpot, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```ts
async login(
  body: ApiRestV2SessionLoginRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SessionLoginResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionLoginRequest`](/doc/models/api-rest-v2-session-login-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SessionLoginResponse`](/doc/models/session-login-response.md)

## Example Usage

```ts
const body: ApiRestV2SessionLoginRequest = {
  userName: 'abc',
  password: 'abc',
};

try {
  const { result, ...httpResponse } = await sessionController.login(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Gettoken

To programmatically create token for a user in ThoughtSpot, use this endpoint

```ts
async gettoken(
  body: ApiRestV2SessionGettokenRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SessionLoginResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionGettokenRequest`](/doc/models/api-rest-v2-session-gettoken-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SessionLoginResponse`](/doc/models/session-login-response.md)

## Example Usage

```ts
const body: ApiRestV2SessionGettokenRequest = {
  userName: 'userName8',
  password: 'password0',
};

try {
  const { result, ...httpResponse } = await sessionController.gettoken(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Logout

To log a user out of the current session, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Revoketoken

To expire or revoke a token for a user, use this endpoint

```ts
async revoketoken(
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
  const { result, ...httpResponse } = await sessionController.revoketoken();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

