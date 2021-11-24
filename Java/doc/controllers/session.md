# Session

```java
SessionController sessionController = client.getSessionController();
```

## Class Name

`SessionController`

## Methods

* [Session Info](/doc/controllers/session.md#session-info)
* [Login](/doc/controllers/session.md#login)
* [Get Token](/doc/controllers/session.md#get-token)
* [Logout](/doc/controllers/session.md#logout)
* [Revoke Token](/doc/controllers/session.md#revoke-token)


# Session Info

Get Session object information

```java
CompletableFuture<SessionInfoResponse> sessionInfoAsync()
```

## Response Type

[`SessionInfoResponse`](/doc/models/session-info-response.md)

## Example Usage

```java
sessionController.sessionInfoAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Login

You can programmatically login a user to ThoughtSpot

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<SessionLoginResponse> loginAsync(
    final ApiRestV2SessionLoginRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionLoginRequest`](/doc/models/api-rest-v2-session-login-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](/doc/models/session-login-response.md)

## Example Usage

```java
ApiRestV2SessionLoginRequest body = new ApiRestV2SessionLoginRequest();
body.setUserName("userName8");
body.setPassword("password0");

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Token

You can programmatically create token for a user in ThoughtSpot

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<SessionLoginResponse> getTokenAsync(
    final ApiRestV2SessionGettokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionGettokenRequest`](/doc/models/api-rest-v2-session-gettoken-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](/doc/models/session-login-response.md)

## Example Usage

```java
ApiRestV2SessionGettokenRequest body = new ApiRestV2SessionGettokenRequest();
body.setUserName("userName8");
body.setPassword("password0");

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

