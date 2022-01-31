# Group

```java
GroupController groupController = client.getGroupController();
```

## Class Name

`GroupController`

## Methods

* [Get Group](/doc/controllers/group.md#get-group)
* [Create Group](/doc/controllers/group.md#create-group)
* [Update Group](/doc/controllers/group.md#update-group)
* [Delete Group](/doc/controllers/group.md#delete-group)
* [Add Privileges to Group](/doc/controllers/group.md#add-privileges-to-group)
* [Remove Privileges From Group](/doc/controllers/group.md#remove-privileges-from-group)
* [Add Users to Group](/doc/controllers/group.md#add-users-to-group)
* [Remove Users From Group](/doc/controllers/group.md#remove-users-from-group)
* [Add Groups to Group](/doc/controllers/group.md#add-groups-to-group)
* [Remove Groups From Group](/doc/controllers/group.md#remove-groups-from-group)
* [Search Groups](/doc/controllers/group.md#search-groups)


# Get Group

To get the details of a specific group by name or id, use this endpoint.

At least one value needed. When both are given,then id will be considered to fetch user information.

```java
CompletableFuture<GroupResponse> getGroupAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the group |
| `id` | `String` | Query, Optional | The GUID of the group |

## Response Type

[`GroupResponse`](/doc/models/group-response.md)

## Example Usage

```java
groupController.getGroupAsync(null, null).thenAccept(result -> {
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


# Create Group

To programmatically create a group in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a group and assign privileges and users.

For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups.

The privileges determine the actions that the users belonging to a group are allowed to do.

ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

```java
CompletableFuture<GroupResponse> createGroupAsync(
    final ApiRestV2GroupCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupCreateRequest`](/doc/models/api-rest-v2-group-create-request.md) | Body, Required | - |

## Response Type

[`GroupResponse`](/doc/models/group-response.md)

## Example Usage

```java
ApiRestV2GroupCreateRequest body = new ApiRestV2GroupCreateRequest();
body.setName("name6");
body.setDisplayName("displayName6");

groupController.createGroupAsync(body).thenAccept(result -> {
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


# Update Group

You can use this endpoint to programmatically modify an existing group.

To modify a group, you require admin user privileges.

At least one of id or name is required to update the group. When both are given, then id will be considered and group name will be updated.

```java
CompletableFuture<Boolean> updateGroupAsync(
    final ApiRestV2GroupUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupUpdateRequest`](/doc/models/api-rest-v2-group-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupUpdateRequest body = new ApiRestV2GroupUpdateRequest();

groupController.updateGroupAsync(body).thenAccept(result -> {
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


# Delete Group

To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value needed. When both are given,then user id will be considered to fetch user information.

```java
CompletableFuture<Boolean> deleteGroupAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the group. |
| `id` | `String` | Query, Optional | The GUID of the group |

## Response Type

`boolean`

## Example Usage

```java
groupController.deleteGroupAsync(null, null).thenAccept(result -> {
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


# Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.

When you assign privileges to a group, all the users under to this group inherits the privileges assigned to that group.

At least one of id or name of group is required. When both are given,then user id will be considered.

```java
CompletableFuture<Boolean> addPrivilegesToGroupAsync(
    final ApiRestV2GroupAddprivilegeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAddprivilegeRequest`](/doc/models/api-rest-v2-group-addprivilege-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupAddprivilegeRequest body = new ApiRestV2GroupAddprivilegeRequest();

groupController.addPrivilegesToGroupAsync(body).thenAccept(result -> {
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


# Remove Privileges From Group

To programmatically remove privileges from a group, use API endpoint.

The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

```java
CompletableFuture<Boolean> removePrivilegesFromGroupAsync(
    final ApiRestV2GroupRemoveprivilegeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemoveprivilegeRequest`](/doc/models/api-rest-v2-group-removeprivilege-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupRemoveprivilegeRequest body = new ApiRestV2GroupRemoveprivilegeRequest();

groupController.removePrivilegesFromGroupAsync(body).thenAccept(result -> {
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


# Add Users to Group

To programmatically add existing ThoughtSpot users to a group, use this API endpoint.

hen you assign users to a group, the users inherits the privileges assigned to that group.

At least one of id or name of the group is required. When both are given,then user id will be considered.

```java
CompletableFuture<Boolean> addUsersToGroupAsync(
    final ApiRestV2GroupAdduserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAdduserRequest`](/doc/models/api-rest-v2-group-adduser-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupAdduserRequest body = new ApiRestV2GroupAdduserRequest();

groupController.addUsersToGroupAsync(body).thenAccept(result -> {
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


# Remove Users From Group

To programmatically remove users from a group, use API endpoint.

The API removes only the user association. It does not delete the users or group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

```java
CompletableFuture<Boolean> removeUsersFromGroupAsync(
    final ApiRestV2GroupRemoveuserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemoveuserRequest`](/doc/models/api-rest-v2-group-removeuser-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupRemoveuserRequest body = new ApiRestV2GroupRemoveuserRequest();

groupController.removeUsersFromGroupAsync(body).thenAccept(result -> {
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


# Add Groups to Group

To programmatically add existing groups to a group, use API endpoint.

When you assign groups to a group, the group inherits the privileges assigned to those groups.

At least one of id or name of group is required. When both are given,then user id will be considered.

```java
CompletableFuture<Boolean> addGroupsToGroupAsync(
    final ApiRestV2GroupAddgroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAddgroupRequest`](/doc/models/api-rest-v2-group-addgroup-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupAddgroupRequest body = new ApiRestV2GroupAddgroupRequest();

groupController.addGroupsToGroupAsync(body).thenAccept(result -> {
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


# Remove Groups From Group

To programmatically remove groups from a group, use API endpoint.

The API removes only the group association. It does not delete the group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

```java
CompletableFuture<Boolean> removeGroupsFromGroupAsync(
    final ApiRestV2GroupRemovegroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemovegroupRequest`](/doc/models/api-rest-v2-group-removegroup-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2GroupRemovegroupRequest body = new ApiRestV2GroupRemovegroupRequest();

groupController.removeGroupsFromGroupAsync(body).thenAccept(result -> {
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


# Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system use this end point.

If no inputs are provided, then all groups are included in the response.

```java
CompletableFuture<List<GroupResponse>> searchGroupsAsync(
    final ApiRestV2GroupSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupSearchRequest`](/doc/models/api-rest-v2-group-search-request.md) | Body, Required | - |

## Response Type

[`List<GroupResponse>`](/doc/models/group-response.md)

## Example Usage

```java
ApiRestV2GroupSearchRequest body = new ApiRestV2GroupSearchRequest();

groupController.searchGroupsAsync(body).thenAccept(result -> {
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

