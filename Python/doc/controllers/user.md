# User

```python
user_controller = client.user
```

## Class Name

`UserController`

## Methods

* [Get User](../../doc/controllers/user.md#get-user)
* [Create User](../../doc/controllers/user.md#create-user)
* [Update User](../../doc/controllers/user.md#update-user)
* [Delete User](../../doc/controllers/user.md#delete-user)
* [Add User to Groups](../../doc/controllers/user.md#add-user-to-groups)
* [Remove User From Groups](../../doc/controllers/user.md#remove-user-from-groups)
* [Change Password of User](../../doc/controllers/user.md#change-password-of-user)
* [Search Users](../../doc/controllers/user.md#search-users)


# Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information

Permission: Requires administration privilege

```python
def get_user(self,
            name=None,
            id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user that you want to query |
| `id` | `string` | Query, Optional | The GUID of the user account to query |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```python
result = user_controller.get_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a user and assign groups. To create a user, you require admin user privileges.

All users created in the ThoughtSpot system are added to ALL user group.

Permission: Requires administration privilege

```python
def create_user(self,
               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserCreateRequest`](../../doc/models/tspublic-rest-v2-user-create-request.md) | Body, Required | - |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```python
body = TspublicRestV2UserCreateRequest()
body.name = 'name6'
body.display_name = 'displayName6'
body.password = 'password0'

result = user_controller.create_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update User

You can use this endpoint to programmatically modify an existing user account.

To modify a user, you require admin user privileges.

At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

Permission: Requires administration privilege

```python
def update_user(self,
               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserUpdateRequest`](../../doc/models/tspublic-rest-v2-user-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2UserUpdateRequest()

result = user_controller.update_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete User

To remove a user from the ThoughtSpot system, use this endpoint.

At least one value is needed. When both are given, then user id will be considered to delete user.

Permission: Requires administration privilege

```python
def delete_user(self,
               name=None,
               id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user account |
| `id` | `string` | Query, Optional | The GUID of the user account |

## Response Type

`bool`

## Example Usage

```python
result = user_controller.delete_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add User to Groups

To programmatically add groups to an existing ThoughtSpot user, use this endpoint.

When you assign groups to a user, the user inherits the privileges assigned to those groups.

At least one of user Id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```python
def add_user_to_groups(self,
                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserAddgroupRequest`](../../doc/models/tspublic-rest-v2-user-addgroup-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2UserAddgroupRequest()
body.groups = []

body.groups.append(GroupNameAndIDInput())


result = user_controller.add_user_to_groups(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.

The API removes only the user association. It does not delete the user or group from the Thoughtspot system.

At least one of user id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```python
def remove_user_from_groups(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserRemovegroupRequest`](../../doc/models/tspublic-rest-v2-user-removegroup-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2UserRemovegroupRequest()
body.groups = []

body.groups.append(GroupNameAndIDInput())


result = user_controller.remove_user_from_groups(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

Permission: Requires administration privilege

```python
def change_password_of_user(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserChangepasswordRequest`](../../doc/models/tspublic-rest-v2-user-changepassword-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2UserChangepasswordRequest()
body.current_password = 'currentPassword0'
body.new_password = 'newPassword0'

result = user_controller.change_password_of_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Users

To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.

Permission: Requires administration privilege

```python
def search_users(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserSearchRequest`](../../doc/models/tspublic-rest-v2-user-search-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2UserSearchRequest()

result = user_controller.search_users(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

