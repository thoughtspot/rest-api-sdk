# Admin

```java
AdminController adminController = client.getAdminController();
```

## Class Name

`AdminController`

## Methods

* [Get Cluster Config](../../doc/controllers/admin.md#get-cluster-config)
* [Get Cluster Config Overrides](../../doc/controllers/admin.md#get-cluster-config-overrides)
* [Update Cluster Config](../../doc/controllers/admin.md#update-cluster-config)
* [Reset User Password](../../doc/controllers/admin.md#reset-user-password)
* [Sync Principal](../../doc/controllers/admin.md#sync-principal)
* [Change Author of Objects](../../doc/controllers/admin.md#change-author-of-objects)
* [Assign Author to Objects](../../doc/controllers/admin.md#assign-author-to-objects)


# Get Cluster Config

To get details of the current configuration of a Thoughtspot cluster, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<Object> getClusterConfigAsync()
```

## Response Type

`Object`

## Example Usage

```java
adminController.getClusterConfigAsync().thenAccept(result -> {
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


# Get Cluster Config Overrides

To get the details of overrides to the Thoughtspot cluster configuration, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<Object> getClusterConfigOverridesAsync()
```

## Response Type

`Object`

## Example Usage

```java
adminController.getClusterConfigOverridesAsync().thenAccept(result -> {
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


# Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> updateClusterConfigAsync(
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

adminController.updateClusterConfigAsync(body).thenAccept(result -> {
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


# Reset User Password

To reset the password of a ThoughtSpot user account, use this endpoint.

It is mandatory to use Authorization header with token of a user with admin access to successfully run this endpoint.

At least one of User Id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> resetUserPasswordAsync(
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

adminController.resetUserPasswordAsync(body).thenAccept(result -> {
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


# Sync Principal

To programmatically synchronize user accounts and user groups from external system with ThoughtSpot, use this endpoint.

The payload takes principals containing all users and groups present in the external system.

The users and user groups in Thoughtspot get updated for any matching inputs.

Any user and user group present in the input, but not present in the cluster, gets created in cluster.
n You can optionally choose to delete the user and groups from the cluster, that are not present in the input.

Permission: Requires administration privilege

```java
CompletableFuture<AdminsyncPrincipalResponse> syncPrincipalAsync(
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

adminController.syncPrincipalAsync(body).thenAccept(result -> {
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


# Change Author of Objects

To programmatically change the author of one or several objects from one user account to another, use this endpoint.

You might want to change the author of objects from one user to another active user, when the account is removed from the ThoughtSpot application.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> changeAuthorOfObjectsAsync(
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

adminController.changeAuthorOfObjectsAsync(body).thenAccept(result -> {
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


# Assign Author to Objects

To programmatically assign an author to one or several objects, use this endpoint.

Provide either user name or id as input. When both are given user id will be considered.

Requires administration privilege.

```java
CompletableFuture<Boolean> assignAuthorToObjectsAsync(
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

adminController.assignAuthorToObjectsAsync(body).thenAccept(result -> {
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

