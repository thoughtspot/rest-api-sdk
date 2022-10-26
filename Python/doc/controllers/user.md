# User

```python
user_controller = client.user
```

## Class Name

`UserController`

## Methods

* [Restapi V2 Get User](../../doc/controllers/user.md#restapi-v2-get-user)
* [Restapi V2 Create User](../../doc/controllers/user.md#restapi-v2-create-user)
* [Restapi V2 Update User](../../doc/controllers/user.md#restapi-v2-update-user)
* [Restapi V2 Delete User](../../doc/controllers/user.md#restapi-v2-delete-user)
* [Restapi V2 Add User to Groups](../../doc/controllers/user.md#restapi-v2-add-user-to-groups)
* [Restapi V2 Remove User From Groups](../../doc/controllers/user.md#restapi-v2-remove-user-from-groups)
* [Restapi V2 Search Users](../../doc/controllers/user.md#restapi-v2-search-users)
* [Restapi V2 Change Password of User](../../doc/controllers/user.md#restapi-v2-change-password-of-user)
* [Restapi V2 Add User to Orgs](../../doc/controllers/user.md#restapi-v2-add-user-to-orgs)


# Restapi V2 Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed.  When both are given, user id will be considered to fetch user information

```python
def restapi_v_2__get_user(self,
                         name=None,
                         id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user that you want to query. |
| `id` | `string` | Query, Optional | The GUID of the user account to query |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```python
result = user_controller.restapi_v_2__get_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create User

To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
To create a user, you require admin user privileges.
All users created in the ThoughtSpot system are added to ALL_GROUP

```python
def restapi_v_2__create_user(self,
                            name,
                            display_name,
                            password,
                            visibility=None,
                            mail=None,
                            org_ids=None,
                            groups=None,
                            state=None,
                            notify_on_share=None,
                            show_walk_me=None,
                            analyst_onboarding_complete=None,
                            mtype=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Required | Name of the user. The username string must be unique. |
| `display_name` | `string` | Query, Required | A unique display name string for the user account, usually their first and last name |
| `password` | `string` | Query, Required | Password for the user account. |
| `visibility` | [`VisibilityEnum`](../../doc/models/visibility-enum.md) | Query, Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and this allows them to share objects |
| `mail` | `string` | Query, Optional | Email of the user account |
| `org_ids` | `List of int` | Query, Optional | Array of org identifiers. If no value is provided then user will be created in the organization associated with the login session. |
| `groups` | [`List of GroupNameAndIDInput`](../../doc/models/group-name-and-id-input.md) | Query, Optional | Array of objects of groups that the user belong to. |
| `state` | [`StateEnum`](../../doc/models/state-enum.md) | Query, Optional | Status of user account. acitve or inactive. |
| `notify_on_share` | `bool` | Query, Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `show_walk_me` | `bool` | Query, Optional | The user preference for revisiting the onboarding experience. |
| `analyst_onboarding_complete` | `bool` | Query, Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `mtype` | [`Type8Enum`](../../doc/models/type-8-enum.md) | Query, Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```python
name = 'name0'
display_name = 'displayName2'
password = 'password4'

result = user_controller.restapi_v_2__create_user(name, display_name, password)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update User

You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```python
def restapi_v_2__update_user(self,
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

result = user_controller.restapi_v_2__update_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete User

To remove a user from the ThoughtSpot system, use this endpoint.
At Least one value needed.  When both are given user id will be considered to delete user.

```python
def restapi_v_2__delete_user(self,
                            name=None,
                            id=None,
                            org_id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user that you want to query. |
| `id` | `string` | Query, Optional | The GUID of the user account to query |
| `org_id` | `int` | Query, Optional | Unique identifier of the organization from which the user would be deleted. If no value is provided then user will be deleted from the organization associated with the login session. |

## Response Type

`bool`

## Example Usage

```python
result = user_controller.restapi_v_2__delete_user()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add User to Groups

To programmatically add groups to an existing ThoughtSpot user use this endpoint.
When you assign groups to a user, the user inherits the privileges assigned to those groups.
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```python
def restapi_v_2__add_user_to_groups(self,
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


result = user_controller.restapi_v_2__add_user_to_groups(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
The API removes only the user association. It does not delete the user or group from the Thoughtspot system
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```python
def restapi_v_2__remove_user_from_groups(self,
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


result = user_controller.restapi_v_2__remove_user_from_groups(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Users

To get the details of a specific user account or all users in the ThoughtSpot system use this end point.

```python
def restapi_v_2__search_users(self,
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

result = user_controller.restapi_v_2__search_users(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

```python
def restapi_v_2__change_password_of_user(self,
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

result = user_controller.restapi_v_2__change_password_of_user(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add User to Orgs

To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.

At least one of id or name of the organization is required. When both are given, then organization id will be considered.

Requires Administration access for the organization to which users need to be added.

```python
def restapi_v_2__add_user_to_orgs(self,
                                 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserAddorgRequest`](../../doc/models/tspublic-rest-v2-user-addorg-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2UserAddorgRequest()
body.users = []

body.users.append(UserNameAndIDInput())


result = user_controller.restapi_v_2__add_user_to_orgs(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

