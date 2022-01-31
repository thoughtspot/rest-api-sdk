# Admin

```java
AdminController adminController = client.getAdminController();
```

## Class Name

`AdminController`

## Methods

* [Get Cluster Config](/doc/controllers/admin.md#get-cluster-config)
* [Get Cluster Config Overrides](/doc/controllers/admin.md#get-cluster-config-overrides)
* [Update Cluster Config](/doc/controllers/admin.md#update-cluster-config)
* [Reset User Password](/doc/controllers/admin.md#reset-user-password)
* [Sync Principal](/doc/controllers/admin.md#sync-principal)
* [Change Owner of Objects](/doc/controllers/admin.md#change-owner-of-objects)


# Get Cluster Config

To get details of the current configuration of a Thoughtspot cluster, use this endpoint.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Cluster Config Overrides

To get the details of overrides to the Thoughtspot cluster configuration, use this endpoint.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

```java
CompletableFuture<Boolean> updateClusterConfigAsync(
    final ApiRestV2AdminConfigurationUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminConfigurationUpdateRequest`](/doc/models/api-rest-v2-admin-configuration-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2AdminConfigurationUpdateRequest body = new ApiRestV2AdminConfigurationUpdateRequest();

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Reset User Password

To reset the password of a ThoughtSpot user account, use this endpoint.

It is mandatory to use Authorization header with token of a user with admin access to successfully run this endpoint.

At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```java
CompletableFuture<Boolean> resetUserPasswordAsync(
    final ApiRestV2AdminResetpasswordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminResetpasswordRequest`](/doc/models/api-rest-v2-admin-resetpassword-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2AdminResetpasswordRequest body = new ApiRestV2AdminResetpasswordRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Sync Principal

To programmatically synchronize user accounts and user groups from external system with ThoughtSpot, use this endpoint.

The payload takes principals containing all users and groups present in the external system.

The users and user groups in Thoughtspot get updated for any matching inputs.

Any user and user group present in the input, but not present in the cluster, gets created in cluster.
n You can optionally choose to delete the user and groups from the cluster, that are not present in the input.

```java
CompletableFuture<AdminsyncPrincipalResponse> syncPrincipalAsync(
    final ApiRestV2AdminSyncprincipalRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminSyncprincipalRequest`](/doc/models/api-rest-v2-admin-syncprincipal-request.md) | Body, Required | - |

## Response Type

[`AdminsyncPrincipalResponse`](/doc/models/adminsync-principal-response.md)

## Example Usage

```java
ApiRestV2AdminSyncprincipalRequest body = new ApiRestV2AdminSyncprincipalRequest();
body.setPrincipalObject(new LinkedList<>());
body.getPrincipalObject().add("principalObject0");

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Change Owner of Objects

To programmatically change the owner of one or several objects from one user account to another, use this endpoint.

You might want to transfer ownership of objects owned by a user to another active user, when the account is removed from the ThoughtSpot application.

```java
CompletableFuture<Boolean> changeOwnerOfObjectsAsync(
    final ApiRestV2AdminChangeownerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminChangeownerRequest`](/doc/models/api-rest-v2-admin-changeowner-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2AdminChangeownerRequest body = new ApiRestV2AdminChangeownerRequest();
body.setMetaObjectId(new LinkedList<>());
body.getMetaObjectId().add("metaObjectId9");
body.getMetaObjectId().add("metaObjectId0");
body.getMetaObjectId().add("metaObjectId1");
body.setFromUser(new FromUserNameAndIDInput());
body.setToUser(new ToUserNameAndIDInput());

adminController.changeOwnerOfObjectsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

