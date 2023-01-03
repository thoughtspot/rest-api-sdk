# Session

```java
SessionController sessionController = client.getSessionController();
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

```java
CompletableFuture<SessionLoginResponse> restapiV2LoginAsync(
    final String userName,
    final String password,
    final Boolean rememberMe)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `String` | Query, Optional | Username of the user account |
| `password` | `String` | Query, Optional | The password of the user account |
| `rememberMe` | `Boolean` | Query, Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls. |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```java
sessionController.restapiV2LoginAsync(null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


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

```java
CompletableFuture<SessionLoginResponse> restapiV2GetTokenAsync(
    final String userName,
    final String password,
    final String secretKey,
    final AccessLevelEnum accessLevel,
    final String tsObjectId,
    final String tokenExpiryDuration,
    final String orgId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `String` | Query, Required | Username of the user account |
| `password` | `String` | Query, Optional | The password of the user account |
| `secretKey` | `String` | Query, Optional | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. |
| `accessLevel` | [`AccessLevelEnum`](../../doc/models/access-level-enum.md) | Query, Optional | User access privilege.<br><br>FULL - Creates a session with full access.<br><br>REPORT_BOOK_VIEW - Allow view access to the specified visualizations. |
| `tsObjectId` | `String` | Query, Optional | GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object. |
| `tokenExpiryDuration` | `String` | Query, Optional | Duration in seconds after which the token expires |
| `orgId` | `String` | Query, Optional | Id of the organization to be associated with the user login. If no input is provided then last logged in organization will be considered |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```java
String userName = "userName2";

sessionController.restapiV2GetTokenAsync(userName, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

