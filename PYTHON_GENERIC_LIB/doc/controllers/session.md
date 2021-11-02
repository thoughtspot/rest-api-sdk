# Session

```python
session_controller = client.session
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

```python
def session_info(self)
```

## Response Type

[`SessionInfoResponse`](/doc/models/session-info-response.md)

## Example Usage

```python
result = session_controller.session_info()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Login

To programmatically login a user to ThoughtSpot, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

```python
def login(self,
         body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionLoginRequest`](/doc/models/api-rest-v2-session-login-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](/doc/models/session-login-response.md)

## Example Usage

```python
body = ApiRestV2SessionLoginRequest()
body.user_name = 'abc'
body.password = 'abc'

result = session_controller.login(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Gettoken

To programmatically create token for a user in ThoughtSpot, use this endpoint

```python
def gettoken(self,
            body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2SessionGettokenRequest`](/doc/models/api-rest-v2-session-gettoken-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](/doc/models/session-login-response.md)

## Example Usage

```python
body = ApiRestV2SessionGettokenRequest()
body.user_name = 'userName8'
body.password = 'password0'

result = session_controller.gettoken(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Logout

To log a user out of the current session, use this endpoint

:information_source: **Note** This endpoint does not require authentication.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Revoketoken

To expire or revoke a token for a user, use this endpoint

```python
def revoketoken(self)
```

## Response Type

`bool`

## Example Usage

```python
result = session_controller.revoketoken()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

