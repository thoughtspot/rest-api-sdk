# Session

```ts
const sessionController = new SessionController(client);
```

## Class Name

`SessionController`

## Methods

* [Restapi V2 Login](../../doc/controllers/session.md#restapi-v2-login)
* [Restapi V2 Get Token](../../doc/controllers/session.md#restapi-v2-get-token)


# Restapi V2 Login

You can programmatically create login session for a user in ThoughtSpot using this endpoint.

You can create session by either providing userName and password as inputs in this request body or by including "Authorization" header with the token generated through the endpoint /tspublic/rest/v2/session/gettoken.

userName and password input is given precedence over "Authorization" header, when both are included in the request.

```ts
async restapiV2Login(
  userName?: string,
  password?: string,
  rememberMe?: boolean,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SessionLoginResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string \| undefined` | Query, Optional | Username of the user account |
| `password` | `string \| undefined` | Query, Optional | The password of the user account |
| `rememberMe` | `boolean \| undefined` | Query, Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await sessionController.restapiV2Login();
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Get Token

To programmatically create session token for a user in ThoughtSpot, use this endpoint.

You can generate the token for a user by providing password or secret key from the cluster.

You need to enable trusted authentication to generate secret key. To generate secret key, follow below steps.

1. Click the Develop tab.

2. Under Customizations, click Settings.

3. To enable trusted authentication, turn on the toggle.

4. A secret_key for trusted authentication is generated.

5. Click the clipboard icon to copy the token.

Password is given precedence over secretKey input, when both are included in the request.

```ts
async restapiV2GetToken(
  userName: string,
  password?: string,
  secretKey?: string,
  accessLevel?: AccessLevelEnum,
  tsObjectId?: string,
  tokenExpiryDuration?: string,
  orgId?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SessionLoginResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Query, Required | Username of the user account |
| `password` | `string \| undefined` | Query, Optional | The password of the user account |
| `secretKey` | `string \| undefined` | Query, Optional | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. |
| `accessLevel` | [`AccessLevelEnum \| undefined`](../../doc/models/access-level-enum.md) | Query, Optional | User access privilege.<br><br>FULL - Creates a session with full access.<br><br>REPORT_BOOK_VIEW - Allow view access to the specified visualizations. |
| `tsObjectId` | `string \| undefined` | Query, Optional | GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object. |
| `tokenExpiryDuration` | `string \| undefined` | Query, Optional | Duration in seconds after which the token expires |
| `orgId` | `string \| undefined` | Query, Optional | Id of the organization to be associated with the user login. If no input is provided then last logged in organization will be considered |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```ts
const userName = 'userName2';
try {
  const { result, ...httpResponse } = await sessionController.restapiV2GetToken(userName);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

