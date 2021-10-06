# Session

```python
session_controller = client.session
```

## Class Name

`SessionController`

## Methods

* [Session Info](/doc/controllers/session.md#session-info)
* [Login](/doc/controllers/session.md#login)
* [Logout](/doc/controllers/session.md#logout)


# Session Info

Get Session object information

```python
def session_info(self)
```

## Response Type

[`RestAPISessionInfo`](/doc/models/rest-api-session-info.md)

## Example Usage

```python
result = session_controller.session_info()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Login

You can programmatically login a user to ThoughtSpot

:information_source: **Note** This endpoint does not require authentication.

```python
def login(self,
         body=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionLoginRequest`](/doc/models/api-rest-v2-session-login-request.md) | Body, Optional | - |

## Response Type

[`SessionAuthTokenResponse`](/doc/models/session-auth-token-response.md)

## Example Usage

```python
result = session_controller.login()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Logout

To log a user out of the current session, use this endpoint

```python
def logout(self)
```

## Response Type

`bool`

## Example Usage

```python
result = session_controller.logout()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

