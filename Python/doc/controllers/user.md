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
* [Add Groups to User](/doc/controllers/user.md#add-groups-to-user)
* [Remove Groups From User](/doc/controllers/user.md#remove-groups-from-user)
* [Search Users](/doc/controllers/user.md#search-users)


# Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information

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

[`UserResponse`](/doc/models/user-response.md)

## Example Usage

```python
result = user_controller.get_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system, use this API endpoint. Using this API, you can create a user and assign groups. To create a user, you require admin user privileges. All users created in the ThoughtSpot system are added to ALL_GROUP

```python
def create_user(self,
               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserCreateRequest`](/doc/models/api-rest-v2-user-create-request.md) | Body, Required | - |

## Response Type

[`UserResponse`](/doc/models/user-response.md)

## Example Usage

```python
body = ApiRestV2UserCreateRequest()
body.name = 'name6'
body.display_name = 'displayName6'
body.password = 'password0'

result = user_controller.create_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update User

You can use this endpoint to programmatically modify an existing user account. To modify a user, you require admin user privileges. At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```python
def update_user(self,
               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserUpdateRequest`](/doc/models/api-rest-v2-user-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2UserUpdateRequest()

result = user_controller.update_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete User

To remove a user from the ThoughtSpot system, use this endpoint. At least one value is needed. When both are given, then user id will be considered to delete user.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Add Groups to User

To programmatically add groups to an existing ThoughtSpot user, use this endpoint. When you assign groups to a user, the user inherits the privileges assigned to those groups. At least one of user Id or username is mandatory. When both are given, then user id will be considered.

```python
def add_groups_to_user(self,
                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserAddgroupRequest`](/doc/models/api-rest-v2-user-addgroup-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2UserAddgroupRequest()

result = user_controller.add_groups_to_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Remove Groups From User

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint. The API removes only the user association. It does not delete the user or group from the Thoughtspot system. At least one of user id or username is mandatory. When both are given, then user id will be considered.

```python
def remove_groups_from_user(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserRemovegroupRequest`](/doc/models/api-rest-v2-user-removegroup-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2UserRemovegroupRequest()

result = user_controller.remove_groups_from_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Search Users

To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.

```python
def search_users(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserSearchRequest`](/doc/models/api-rest-v2-user-search-request.md) | Body, Required | - |

## Response Type

[`List of UserResponse`](/doc/models/user-response.md)

## Example Usage

```python
body = ApiRestV2UserSearchRequest()

result = user_controller.search_users(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

