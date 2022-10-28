# Group

```java
GroupController groupController = client.getGroupController();
```

## Class Name

`GroupController`

## Methods

* [Restapi V2 Get Group](../../doc/controllers/group.md#restapi-v2-get-group)
* [Restapi V2 Create Group](../../doc/controllers/group.md#restapi-v2-create-group)
* [Restapi V2 Update Group](../../doc/controllers/group.md#restapi-v2-update-group)
* [Restapi V2 Delete Group](../../doc/controllers/group.md#restapi-v2-delete-group)
* [Restapi V2 Add Privileges to Group](../../doc/controllers/group.md#restapi-v2-add-privileges-to-group)
* [Restapi V2 Remove Privileges From Group](../../doc/controllers/group.md#restapi-v2-remove-privileges-from-group)
* [Restapi V2 Add Users to Group](../../doc/controllers/group.md#restapi-v2-add-users-to-group)
* [Restapi V2 Remove Users From Group](../../doc/controllers/group.md#restapi-v2-remove-users-from-group)
* [Restapi V2 Add Groups to Group](../../doc/controllers/group.md#restapi-v2-add-groups-to-group)
* [Restapi V2 Remove Groups From Group](../../doc/controllers/group.md#restapi-v2-remove-groups-from-group)
* [Restapi V2 Search Groups](../../doc/controllers/group.md#restapi-v2-search-groups)


# Restapi V2 Get Group

To get the details of a specific group by name or id, use this endpoint.
At Least one value needed.  When both are given id will be considered to fetch user information.

```java
CompletableFuture<GroupResponse> restapiV2GetGroupAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the group |
| `id` | `String` | Query, Optional | The GUID of the group to query. |

## Response Type

[`GroupResponse`](../../doc/models/group-response.md)

## Example Usage

```java
groupController.restapiV2GetGroupAsync(null, null).thenAccept(result -> {
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


# Restapi V2 Create Group

To programmatically create a group in the ThoughtSpot system, use this API endpoint. Using this API, you can create a group and assign privileges and users. For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups. The privileges determine the actions that the users belonging to a group are allowed to do. ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

```java
CompletableFuture<GroupResponse> restapiV2CreateGroupAsync(
    final TspublicRestV2GroupCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupCreateRequest`](../../doc/models/tspublic-rest-v2-group-create-request.md) | Body, Required | - |

## Response Type

[`GroupResponse`](../../doc/models/group-response.md)

## Example Usage

```java
TspublicRestV2GroupCreateRequest body = new TspublicRestV2GroupCreateRequest();
body.setName("name6");
body.setDisplayName("displayName6");

groupController.restapiV2CreateGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Update Group

You can use this endpoint to programmatically modify an existing user account.
To modify a user, you require admin user privileges.
At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```java
CompletableFuture<Boolean> restapiV2UpdateGroupAsync(
    final TspublicRestV2GroupUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupUpdateRequest`](../../doc/models/tspublic-rest-v2-group-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupUpdateRequest body = new TspublicRestV2GroupUpdateRequest();

groupController.restapiV2UpdateGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Delete Group

To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one value needed.  When both are given user id will be considered to fetch user information.

```java
CompletableFuture<Boolean> restapiV2DeleteGroupAsync(
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
groupController.restapiV2DeleteGroupAsync(null, null).thenAccept(result -> {
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


# Restapi V2 Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.
When you assign privileges to a group,  all the users under to this group inherits the privileges assigned to that group.
At least one of id or name of group is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2AddPrivilegesToGroupAsync(
    final TspublicRestV2GroupAddprivilegeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupAddprivilegeRequest`](../../doc/models/tspublic-rest-v2-group-addprivilege-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupAddprivilegeRequest body = new TspublicRestV2GroupAddprivilegeRequest();

groupController.restapiV2AddPrivilegesToGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Remove Privileges From Group

To programmatically remove privileges from a group, use API endpoint. The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2RemovePrivilegesFromGroupAsync(
    final TspublicRestV2GroupRemoveprivilegeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupRemoveprivilegeRequest`](../../doc/models/tspublic-rest-v2-group-removeprivilege-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupRemoveprivilegeRequest body = new TspublicRestV2GroupRemoveprivilegeRequest();

groupController.restapiV2RemovePrivilegesFromGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Add Users to Group

To programmatically add existing ThoughtSpot users to a group, use this API endpoint. When you assign users to a group, the users inherits the privileges assigned to that group. At least one of id or name of the group is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2AddUsersToGroupAsync(
    final TspublicRestV2GroupAdduserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupAdduserRequest`](../../doc/models/tspublic-rest-v2-group-adduser-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupAdduserRequest body = new TspublicRestV2GroupAdduserRequest();
body.setUsers(new LinkedList<>());

UserNameAndIDInput bodyUsers0 = new UserNameAndIDInput();
body.getUsers().add(bodyUsers0);


groupController.restapiV2AddUsersToGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Remove Users From Group

To programmatically remove users from a group, use API endpoint.The API removes only the user association. It does not delete the users or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2RemoveUsersFromGroupAsync(
    final TspublicRestV2GroupRemoveuserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupRemoveuserRequest`](../../doc/models/tspublic-rest-v2-group-removeuser-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupRemoveuserRequest body = new TspublicRestV2GroupRemoveuserRequest();
body.setUsers(new LinkedList<>());

UserNameAndIDInput bodyUsers0 = new UserNameAndIDInput();
body.getUsers().add(bodyUsers0);


groupController.restapiV2RemoveUsersFromGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Add Groups to Group

To programmatically add existing groups to a group, use API endpoint. When you assign groups to a group, the group inherits the privileges assigned to those groups. At least one of id or name of group is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2AddGroupsToGroupAsync(
    final TspublicRestV2GroupAddgroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupAddgroupRequest`](../../doc/models/tspublic-rest-v2-group-addgroup-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupAddgroupRequest body = new TspublicRestV2GroupAddgroupRequest();
body.setGroups(new LinkedList<>());

GroupNameAndIDInput bodyGroups0 = new GroupNameAndIDInput();
body.getGroups().add(bodyGroups0);


groupController.restapiV2AddGroupsToGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Remove Groups From Group

To programmatically remove groups from a group, use API endpoint.The API removes only the group association. It does not delete the group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.

```java
CompletableFuture<Boolean> restapiV2RemoveGroupsFromGroupAsync(
    final TspublicRestV2GroupRemovegroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupRemovegroupRequest`](../../doc/models/tspublic-rest-v2-group-removegroup-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2GroupRemovegroupRequest body = new TspublicRestV2GroupRemovegroupRequest();
body.setGroups(new LinkedList<>());

GroupNameAndIDInput bodyGroups0 = new GroupNameAndIDInput();
body.getGroups().add(bodyGroups0);


groupController.restapiV2RemoveGroupsFromGroupAsync(body).thenAccept(result -> {
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


# Restapi V2 Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system, use this end point.

```java
CompletableFuture<Object> restapiV2SearchGroupsAsync(
    final TspublicRestV2GroupSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupSearchRequest`](../../doc/models/tspublic-rest-v2-group-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2GroupSearchRequest body = new TspublicRestV2GroupSearchRequest();

groupController.restapiV2SearchGroupsAsync(body).thenAccept(result -> {
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

