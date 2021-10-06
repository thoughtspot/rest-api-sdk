# User

```python
user_controller = client.user
```

## Class Name

`UserController`

## Methods

* [Get User](/doc/controllers/user.md#get-user)
* [Create User](/doc/controllers/user.md#create-user)
* [Update User](/doc/controllers/user.md#update-user)
* [Delete User](/doc/controllers/user.md#delete-user)


# Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed.  When both are given, user id will be considered to fetch user information

```python
def get_user(self,
            name=None,
            id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | - |
| `id` | `string` | Query, Optional | - |

## Response Type

[`RestAPIUserDetail`](/doc/models/rest-api-user-detail.md)

## Example Usage

```python
result = user_controller.get_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
To create a user, you require admin user privileges.
All users created in the ThoughtSpot system are added to ALL_GROUP

```python
def create_user(self,
               body=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserCreateRequest`](/doc/models/api-rest-v2-user-create-request.md) | Body, Optional | - |

## Response Type

[`CreateUserResponce`](/doc/models/create-user-responce.md)

## Example Usage

```python
result = user_controller.create_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update User

You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
This API allows the following modifications to a user profile:
User name modifications
Password reset
User visibility for sharing objects
User preferences, such as viewing onboarding experience, subscribing to or unsubscribing from email notifications, and so on.

```python
def update_user(self,
               body=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserUpdateRequest`](/doc/models/api-rest-v2-user-update-request.md) | Body, Optional | - |

## Response Type

`string`

## Example Usage

```python
result = user_controller.update_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete User

To remove a user from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one value needed.  When both are given user id will be considered to fetch user information.

```python
def delete_user(self,
               name=None,
               id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | - |
| `id` | `string` | Query, Optional | - |

## Response Type

`object`

## Example Usage

```python
result = user_controller.delete_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

