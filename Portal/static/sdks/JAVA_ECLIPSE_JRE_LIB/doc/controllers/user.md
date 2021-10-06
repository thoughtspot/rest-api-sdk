# User

```java
UserController userController = client.getUserController();
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

```java
CompletableFuture<RestAPIUserDetail> getUserAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | - |
| `id` | `String` | Query, Optional | - |

## Response Type

[`RestAPIUserDetail`](/doc/models/rest-api-user-detail.md)

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
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
To create a user, you require admin user privileges.
All users created in the ThoughtSpot system are added to ALL_GROUP

```java
CompletableFuture<CreateUserResponce> createUserAsync(
    final ApiRestV2UserCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserCreateRequest`](/doc/models/api-rest-v2-user-create-request.md) | Body, Optional | - |

## Response Type

[`CreateUserResponce`](/doc/models/create-user-responce.md)

## Example Usage

```java
userController.createUserAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
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

```java
CompletableFuture<String> updateUserAsync(
    final ApiRestV2UserUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserUpdateRequest`](/doc/models/api-rest-v2-user-update-request.md) | Body, Optional | - |

## Response Type

`String`

## Example Usage

```java
userController.updateUserAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete User

To remove a user from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one value needed.  When both are given user id will be considered to fetch user information.

```java
CompletableFuture<Object> deleteUserAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | - |
| `id` | `String` | Query, Optional | - |

## Response Type

`Object`

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
| 500 | Operation failed or unautherized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

