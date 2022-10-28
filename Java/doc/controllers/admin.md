# Admin

```java
AdminController adminController = client.getAdminController();
```

## Class Name

`AdminController`

## Methods

* [Restapi V2 Update Cluster Config](../../doc/controllers/admin.md#restapi-v2-update-cluster-config)
* [Restapi V2 Reset User Password](../../doc/controllers/admin.md#restapi-v2-reset-user-password)
* [Restapi V2 Sync Principal](../../doc/controllers/admin.md#restapi-v2-sync-principal)
* [Restapi V2 Change Author of Objects](../../doc/controllers/admin.md#restapi-v2-change-author-of-objects)
* [Restapi V2 Assign Author to Objects](../../doc/controllers/admin.md#restapi-v2-assign-author-to-objects)
* [Restapi V2 Force Logout Users](../../doc/controllers/admin.md#restapi-v2-force-logout-users)


# Restapi V2 Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

```java
CompletableFuture<Boolean> restapiV2UpdateClusterConfigAsync(
    final TspublicRestV2AdminConfigurationUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminConfigurationUpdateRequest`](../../doc/models/tspublic-rest-v2-admin-configuration-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2AdminConfigurationUpdateRequest body = new TspublicRestV2AdminConfigurationUpdateRequest();

adminController.restapiV2UpdateClusterConfigAsync(body).thenAccept(result -> {
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


# Restapi V2 Reset User Password

To reset the password of a ThoughtSpot user account, use this endpoint.

It is mandatory to use Authorization header with token of a user with admin access to successfully run this endpoint.

At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```java
CompletableFuture<Boolean> restapiV2ResetUserPasswordAsync(
    final TspublicRestV2AdminResetpasswordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminResetpasswordRequest`](../../doc/models/tspublic-rest-v2-admin-resetpassword-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2AdminResetpasswordRequest body = new TspublicRestV2AdminResetpasswordRequest();
body.setNewPassword("newPassword0");

adminController.restapiV2ResetUserPasswordAsync(body).thenAccept(result -> {
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


# Restapi V2 Sync Principal

To programmatically synchronize user accounts and user groups from external system with ThoughtSpot, use this endpoint.

The payload takes principals containing all users and groups present in the external system.

The users and user groups in Thoughtspot get updated for any matching inputs.

Any user and user group present in the input, but not present in the cluster, gets created in cluster.
n You can optionally choose to delete the user and groups from the cluster, that are not present in the input.

```java
CompletableFuture<AdminsyncPrincipalResponse> restapiV2SyncPrincipalAsync(
    final TspublicRestV2AdminSyncprincipalRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminSyncprincipalRequest`](../../doc/models/tspublic-rest-v2-admin-syncprincipal-request.md) | Body, Required | - |

## Response Type

[`AdminsyncPrincipalResponse`](../../doc/models/adminsync-principal-response.md)

## Example Usage

```java
TspublicRestV2AdminSyncprincipalRequest body = new TspublicRestV2AdminSyncprincipalRequest();
body.setPrincipalObject(new LinkedList<>());
body.getPrincipalObject().add(localhost.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

adminController.restapiV2SyncPrincipalAsync(body).thenAccept(result -> {
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


# Restapi V2 Change Author of Objects

To programmatically change the owner of one or several objects from one user account to another, use this endpoint.

You might want to transfer ownership of objects owned by a user to another active user, when the account is removed from the ThoughtSpot application.

```java
CompletableFuture<Boolean> restapiV2ChangeAuthorOfObjectsAsync(
    final TspublicRestV2AdminChangeauthorRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminChangeauthorRequest`](../../doc/models/tspublic-rest-v2-admin-changeauthor-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2AdminChangeauthorRequest body = new TspublicRestV2AdminChangeauthorRequest();
body.setTsObjectId(new LinkedList<>());
body.getTsObjectId().add("tsObjectId7");
body.setFromUser(new FromUserNameAndIDInput());
body.setToUser(new ToUserNameAndIDInput());

adminController.restapiV2ChangeAuthorOfObjectsAsync(body).thenAccept(result -> {
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


# Restapi V2 Assign Author to Objects

To programmatically assign an author to one or several objects, use this endpoint.

Provide either user name or id as input. When both are given user id will be considered.

Requires administration privilege.

```java
CompletableFuture<Boolean> restapiV2AssignAuthorToObjectsAsync(
    final TspublicRestV2AdminAssignauthorRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminAssignauthorRequest`](../../doc/models/tspublic-rest-v2-admin-assignauthor-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2AdminAssignauthorRequest body = new TspublicRestV2AdminAssignauthorRequest();
body.setTsObjectId(new LinkedList<>());
body.getTsObjectId().add("tsObjectId7");

adminController.restapiV2AssignAuthorToObjectsAsync(body).thenAccept(result -> {
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


# Restapi V2 Force Logout Users

To logout one or more users from logged in session, use this endpoint. If no input is provided then all logged in users are force logged out.

Requires administration privilege

```java
CompletableFuture<Boolean> restapiV2ForceLogoutUsersAsync(
    final TspublicRestV2AdminForcelogoutRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminForcelogoutRequest`](../../doc/models/tspublic-rest-v2-admin-forcelogout-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2AdminForcelogoutRequest body = new TspublicRestV2AdminForcelogoutRequest();

adminController.restapiV2ForceLogoutUsersAsync(body).thenAccept(result -> {
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

