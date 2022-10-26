# User

```java
UserController userController = client.getUserController();
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

```java
CompletableFuture<UserResponse> restapiV2GetUserAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Username of the user that you want to query. |
| `id` | `String` | Query, Optional | The GUID of the user account to query |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```java
userController.restapiV2GetUserAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create User

To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
To create a user, you require admin user privileges.
All users created in the ThoughtSpot system are added to ALL_GROUP

```java
CompletableFuture<UserResponse> restapiV2CreateUserAsync(
    final String name,
    final String displayName,
    final String password,
    final VisibilityEnum visibility,
    final String mail,
    final List<Integer> orgIds,
    final List<GroupNameAndIDInput> groups,
    final StateEnum state,
    final Boolean notifyOnShare,
    final Boolean showWalkMe,
    final Boolean analystOnboardingComplete,
    final Type8Enum type)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Required | Name of the user. The username string must be unique. |
| `displayName` | `String` | Query, Required | A unique display name string for the user account, usually their first and last name |
| `password` | `String` | Query, Required | Password for the user account. |
| `visibility` | [`VisibilityEnum`](../../doc/models/visibility-enum.md) | Query, Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and this allows them to share objects |
| `mail` | `String` | Query, Optional | Email of the user account |
| `orgIds` | `List<Integer>` | Query, Optional | Array of org identifiers. If no value is provided then user will be created in the organization associated with the login session. |
| `groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Query, Optional | Array of objects of groups that the user belong to. |
| `state` | [`StateEnum`](../../doc/models/state-enum.md) | Query, Optional | Status of user account. acitve or inactive. |
| `notifyOnShare` | `Boolean` | Query, Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `showWalkMe` | `Boolean` | Query, Optional | The user preference for revisiting the onboarding experience. |
| `analystOnboardingComplete` | `Boolean` | Query, Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `type` | [`Type8Enum`](../../doc/models/type-8-enum.md) | Query, Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```java
String name = "name0";
String displayName = "displayName2";
String password = "password4";

userController.restapiV2CreateUserAsync(name, displayName, password, null, null, null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update User

You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```java
CompletableFuture<Boolean> restapiV2UpdateUserAsync(
    final TspublicRestV2UserUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserUpdateRequest`](../../doc/models/tspublic-rest-v2-user-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2UserUpdateRequest body = new TspublicRestV2UserUpdateRequest();

userController.restapiV2UpdateUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete User

To remove a user from the ThoughtSpot system, use this endpoint.
At Least one value needed.  When both are given user id will be considered to delete user.

```java
CompletableFuture<Boolean> restapiV2DeleteUserAsync(
    final String name,
    final String id,
    final Integer orgId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Username of the user that you want to query. |
| `id` | `String` | Query, Optional | The GUID of the user account to query |
| `orgId` | `Integer` | Query, Optional | Unique identifier of the organization from which the user would be deleted. If no value is provided then user will be deleted from the organization associated with the login session. |

## Response Type

`boolean`

## Example Usage

```java
userController.restapiV2DeleteUserAsync(null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add User to Groups

To programmatically add groups to an existing ThoughtSpot user use this endpoint.
When you assign groups to a user, the user inherits the privileges assigned to those groups.
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```java
CompletableFuture<Boolean> restapiV2AddUserToGroupsAsync(
    final TspublicRestV2UserAddgroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserAddgroupRequest`](../../doc/models/tspublic-rest-v2-user-addgroup-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2UserAddgroupRequest body = new TspublicRestV2UserAddgroupRequest();
body.setGroups(new LinkedList<>());

GroupNameAndIDInput bodyGroups0 = new GroupNameAndIDInput();
body.getGroups().add(bodyGroups0);


userController.restapiV2AddUserToGroupsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
The API removes only the user association. It does not delete the user or group from the Thoughtspot system
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```java
CompletableFuture<Boolean> restapiV2RemoveUserFromGroupsAsync(
    final TspublicRestV2UserRemovegroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserRemovegroupRequest`](../../doc/models/tspublic-rest-v2-user-removegroup-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2UserRemovegroupRequest body = new TspublicRestV2UserRemovegroupRequest();
body.setGroups(new LinkedList<>());

GroupNameAndIDInput bodyGroups0 = new GroupNameAndIDInput();
body.getGroups().add(bodyGroups0);


userController.restapiV2RemoveUserFromGroupsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Users

To get the details of a specific user account or all users in the ThoughtSpot system use this end point.

```java
CompletableFuture<Object> restapiV2SearchUsersAsync(
    final TspublicRestV2UserSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserSearchRequest`](../../doc/models/tspublic-rest-v2-user-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2UserSearchRequest body = new TspublicRestV2UserSearchRequest();

userController.restapiV2SearchUsersAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2ChangePasswordOfUserAsync(
    final TspublicRestV2UserChangepasswordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserChangepasswordRequest`](../../doc/models/tspublic-rest-v2-user-changepassword-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2UserChangepasswordRequest body = new TspublicRestV2UserChangepasswordRequest();
body.setCurrentPassword("currentPassword0");
body.setNewPassword("newPassword0");

userController.restapiV2ChangePasswordOfUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add User to Orgs

To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.

At least one of id or name of the organization is required. When both are given, then organization id will be considered.

Requires Administration access for the organization to which users need to be added.

```java
CompletableFuture<Boolean> restapiV2AddUserToOrgsAsync(
    final TspublicRestV2UserAddorgRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserAddorgRequest`](../../doc/models/tspublic-rest-v2-user-addorg-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2UserAddorgRequest body = new TspublicRestV2UserAddorgRequest();
body.setUsers(new LinkedList<>());

UserNameAndIDInput bodyUsers0 = new UserNameAndIDInput();
body.getUsers().add(bodyUsers0);


userController.restapiV2AddUserToOrgsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

