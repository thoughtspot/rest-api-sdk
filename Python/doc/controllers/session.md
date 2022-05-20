# Session

```python
session_controller = client.session
```

## Class Name

`SessionController`

## Methods

* [Get Session Info](../../doc/controllers/session.md#get-session-info)
* [Login](../../doc/controllers/session.md#login)
* [Logout](../../doc/controllers/session.md#logout)
* [Get Token](../../doc/controllers/session.md#get-token)
* [Revoke Token](../../doc/controllers/session.md#revoke-token)


# Get Session Info

To get session object information, use this endpoint

```python
def get_session_info(self)
```

## Response Type

`object`

## Example Usage

```python
result = session_controller.get_session_info()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Login

You can programmatically create login session for a user in ThoughtSpot using this endpoint.

You can create session by either providing userName and password as inputs in this request body or by including "Authorization" header with the token generated through the endpoint /tspublic/rest/v2/session/getToken.

userName and password input is given precedence over "Authorization" header, when both are included in the request.

```python
def login(self,
         body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SessionLoginRequest`](../../doc/models/tspublic-rest-v2-session-login-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```python
body = TspublicRestV2SessionLoginRequest()

result = session_controller.login(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


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

```python
def get_token(self,
             body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SessionGettokenRequest`](../../doc/models/tspublic-rest-v2-session-gettoken-request.md) | Body, Required | - |

## Response Type

[`SessionLoginResponse`](../../doc/models/session-login-response.md)

## Example Usage

```python
body = TspublicRestV2SessionGettokenRequest()
body.user_name = 'userName8'

result = session_controller.get_token(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Revoke Token

To expire or revoke a token for a user, use this endpoint

```python
def revoke_token(self)
```

## Response Type

`bool`

## Example Usage

```python
result = session_controller.revoke_token()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

