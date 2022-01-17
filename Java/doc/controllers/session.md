# Session

```java
SessionController sessionController = client.getSessionController();
```

## Class Name

`SessionController`

## Methods

* [Get Session Info](/doc/controllers/session.md#get-session-info)
* [Login](/doc/controllers/session.md#login)
* [Logout](/doc/controllers/session.md#logout)
* [Gettoken](/doc/controllers/session.md#gettoken)
* [Revoketoken](/doc/controllers/session.md#revoketoken)


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Login

To programmatically login a user to ThoughtSpot, use this endpoint

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


# Gettoken

To programmatically create token for a user in ThoughtSpot, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<SessionLoginResponse> gettokenAsync(
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

sessionController.gettokenAsync(body).thenAccept(result -> {
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


# Revoketoken

To expire or revoke a token for a user, use this endpoint

```java
CompletableFuture<Boolean> revoketokenAsync()
```

## Response Type

`boolean`

## Example Usage

```java
sessionController.revoketokenAsync().thenAccept(result -> {
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

