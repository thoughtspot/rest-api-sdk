# User

```java
UserController userController = client.getUserController();
```

## Class Name

`UserController`

## Methods

* [Get User](../../doc/controllers/user.md#get-user)
* [Create User](../../doc/controllers/user.md#create-user)
* [Update User](../../doc/controllers/user.md#update-user)
* [Delete User](../../doc/controllers/user.md#delete-user)
* [Add Groups to User](../../doc/controllers/user.md#add-groups-to-user)
* [Remove Groups From User](../../doc/controllers/user.md#remove-groups-from-user)
* [Change Password of User](../../doc/controllers/user.md#change-password-of-user)
* [Search Users](../../doc/controllers/user.md#search-users)


# Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information

Permission: Requires administration privilege

```java
CompletableFuture<UserResponse> getUserAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Username of the user that you want to query |
| `id` | `String` | Query, Optional | The GUID of the user account to query |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```java
userController.getUserAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a user and assign groups. To create a user, you require admin user privileges.

All users created in the ThoughtSpot system are added to ALL_GROUP

Permission: Requires administration privilege

```java
CompletableFuture<UserResponse> createUserAsync(
    final TspublicRestV2UserCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserCreateRequest`](../../doc/models/tspublic-rest-v2-user-create-request.md) | Body, Required | - |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```java
TspublicRestV2UserCreateRequest body = new TspublicRestV2UserCreateRequest();
body.setName("name6");
body.setDisplayName("displayName6");
body.setPassword("password0");

userController.createUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
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

```java
CompletableFuture<Boolean> updateUserAsync(
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

userController.updateUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete User

To remove a user from the ThoughtSpot system, use this endpoint.

At least one value is needed. When both are given, then user id will be considered to delete user.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> deleteUserAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Username of the user account |
| `id` | `String` | Query, Optional | The GUID of the user account |

## Response Type

`boolean`

## Example Usage

```java
userController.deleteUserAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add Groups to User

To programmatically add groups to an existing ThoughtSpot user, use this endpoint.

When you assign groups to a user, the user inherits the privileges assigned to those groups.

At least one of user Id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> addGroupsToUserAsync(
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


userController.addGroupsToUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove Groups From User

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.

The API removes only the user association. It does not delete the user or group from the Thoughtspot system.

At least one of user id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> removeGroupsFromUserAsync(
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


userController.removeGroupsFromUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> changePasswordOfUserAsync(
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

userController.changePasswordOfUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Users

To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.

Permission: Requires administration privilege

```java
CompletableFuture<Object> searchUsersAsync(
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

userController.searchUsersAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

