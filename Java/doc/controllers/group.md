# Group

```java
GroupController groupController = client.getGroupController();
```

## Class Name

`GroupController`

## Methods

* [Get Group](/doc/controllers/group.md#get-group)
* [Create Group](/doc/controllers/group.md#create-group)
* [Delete Group](/doc/controllers/group.md#delete-group)
* [Add Users to Group](/doc/controllers/group.md#add-users-to-group)
* [Remove Users From Group](/doc/controllers/group.md#remove-users-from-group)
* [Add Privileges to Group](/doc/controllers/group.md#add-privileges-to-group)
* [Search Groups](/doc/controllers/group.md#search-groups)


# Get Group

To get the details of a specific group by name or id, use this endpoint. At Least one value needed.  When both are given id will be considered to fetch user information.

```java
CompletableFuture<GroupResponse> getGroupAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the group |
| `id` | `String` | Query, Optional | The GUID of the group to query |

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

To programmatically create a group in the ThoughtSpot system use this API endpoint.  Using this API, you can create a group and assign privileges and users. For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups.  The privileges determine the actions that the users belonging to a group are allowed to do. ThoughtSpot also has a default group called ALL_GROUP.  When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

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


# Delete Group

To remove a group from the ThoughtSpot system, use this endpoint.  At least one value of name or id is needed.  When both are given group id will be considered to delete.

```java
CompletableFuture<Boolean> deleteGroupAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the group that you want to delete. |
| `id` | `String` | Query, Optional | The GUID of the group to delete. |

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


# Add Users to Group

To programmatically add existing ThoughtSpot users to a group use API endpoint. When you assign users to a group, the users inherits the privileges assigned to that group. At least one of id or name of group is required. When both are given user id will be considered.

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

To programmatically remove users from a group, use this API endpoint.  The API removes only the user association. It does not delete the users or group from the Thoughtspot system.  At least one of id or name of group is required. When both are given, id will be considered.

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


# Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.  When you assign privileges to a group,  all the users under to this group inherits the privileges assigned from this group.  At least one of id or name of group is required. When both are given id will be considered.

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


# Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system use this end point. If no inputs are provided, then all groups are included in the response.

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
