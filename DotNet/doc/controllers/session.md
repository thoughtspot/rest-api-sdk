# Session

```csharp
SessionController sessionController = client.SessionController;
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

```csharp
GetSessionInfoAsync()
```

## Response Type

`Task<object>`

## Example Usage

```csharp
try
{
    object result = await sessionController.GetSessionInfoAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Login

To programmatically login a user to ThoughtSpot, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```csharp
LoginAsync(
    Models.ApiRestV2SessionLoginRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2SessionLoginRequest`](/doc/models/api-rest-v2-session-login-request.md) | Body, Required | - |

## Response Type

[`Task<Models.SessionLoginResponse>`](/doc/models/session-login-response.md)

## Example Usage

```csharp
var body = new ApiRestV2SessionLoginRequest();
body.UserName = "userName8";
body.Password = "password0";

try
{
    SessionLoginResponse result = await sessionController.LoginAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Logout

To log a user out of the current session, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```csharp
LogoutAsync()
```

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await sessionController.LogoutAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Gettoken

To programmatically create token for a user in ThoughtSpot, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```csharp
GettokenAsync(
    Models.ApiRestV2SessionGettokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2SessionGettokenRequest`](/doc/models/api-rest-v2-session-gettoken-request.md) | Body, Required | - |

## Response Type

[`Task<Models.SessionLoginResponse>`](/doc/models/session-login-response.md)

## Example Usage

```csharp
var body = new ApiRestV2SessionGettokenRequest();
body.UserName = "userName8";
body.Password = "password0";

try
{
    SessionLoginResponse result = await sessionController.GettokenAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Revoketoken

To expire or revoke a token for a user, use this endpoint

```csharp
RevoketokenAsync()
```

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await sessionController.RevoketokenAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

