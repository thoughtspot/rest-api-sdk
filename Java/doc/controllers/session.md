# Session

```java
SessionController sessionController = client.getSessionController();
```

## Class Name

`SessionController`

## Methods

* [Get Session Info](../../doc/controllers/session.md#get-session-info)
* [Login](../../doc/controllers/session.md#login)
* [Logout](../../doc/controllers/session.md#logout)
* [Get Token](../../doc/controllers/session.md#get-token)
* [Revoke Token](../../doc/controllers/session.md#revoke-token)
* [Switch Org](../../doc/controllers/session.md#switch-org)


# Get Session Info

To get session object information, use this endpoint

```java
CompletableFuture<Object> getSessionInfoAsync()
```

## Response Type

`Object`

## Example Usage

```java
sessionController.getSessionInfoAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Login

You can programmatically create login session for a user in ThoughtSpot using this endpoint.

You can create session by either providing userName and password as inputs in this request body or by including "Authorization" header with the token generated through the endpoint /tspublic/rest/v2/session/getToken.

userName and password input is given precedence over "Authorization" header, when both are included in the request.

```java
CompletableFuture<SessionLoginResponse> loginAsync(
    final TspublicRestV2SessionLoginRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SessionLoginRequest`](../../doc/models/tspublic-rest-v2-session-login-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```java
TspublicRestV2SessionLoginRequest body = new TspublicRestV2SessionLoginRequest();

sessionController.loginAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Logout

To log a user out of the current session, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<Boolean> logoutAsync()
```

## Response Type

`boolean`

## Example Usage

```java
sessionController.logoutAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Token

To programmatically create session token for a user in ThoughtSpot, use this endpoint.

You can generate the token for a user by providing password or secret key from the cluster.

You need to enable trusted authentication to generate secret key. To generate secret key, follow below steps.

1. Click the Develop tab.

2. Under Customizations, click Settings.

3. To enable trusted authentication, turn on the toggle.

4. A secret_key for trusted authentication is generated.

5. Click the clipboard icon to copy the token.

Password is given precedence over secretKey input, when both are included in the request.

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<SessionLoginResponse> getTokenAsync(
    final TspublicRestV2SessionGettokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SessionGettokenRequest`](../../doc/models/tspublic-rest-v2-session-gettoken-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```java
TspublicRestV2SessionGettokenRequest body = new TspublicRestV2SessionGettokenRequest();
body.setUserName("userName8");

sessionController.getTokenAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Revoke Token

To expire or revoke a token for a user, use this endpoint

```java
CompletableFuture<Boolean> revokeTokenAsync()
```

## Response Type

`boolean`

## Example Usage

```java
sessionController.revokeTokenAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Switch Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To programmatically switch the organization context for the logged in session, use this endpoint.

The original session is reused even after changing the organization.

The logged in user should have access to the organization being switched to.

This endpoint can be used to switch organization only when using session cookies for authentication.

```java
CompletableFuture<Boolean> switchOrgAsync(
    final TspublicRestV2SessionOrgRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SessionOrgRequest`](../../doc/models/tspublic-rest-v2-session-org-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2SessionOrgRequest body = new TspublicRestV2SessionOrgRequest();

sessionController.switchOrgAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

