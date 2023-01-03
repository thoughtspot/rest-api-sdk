# Group

```csharp
GroupController groupController = client.GroupController;
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

```csharp
RestapiV2GetGroupAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the group |
| `id` | `string` | Query, Optional | The GUID of the group to query. |

## Response Type

[`Task<Models.GroupResponse>`](../../doc/models/group-response.md)

## Example Usage

```csharp
try
{
    GroupResponse result = await groupController.RestapiV2GetGroupAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Group

To programmatically create a group in the ThoughtSpot system, use this API endpoint. Using this API, you can create a group and assign privileges and users. For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups. The privileges determine the actions that the users belonging to a group are allowed to do. ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

```csharp
RestapiV2CreateGroupAsync(
    Models.TspublicRestV2GroupCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupCreateRequest`](../../doc/models/tspublic-rest-v2-group-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.GroupResponse>`](../../doc/models/group-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2GroupCreateRequest();
body.Name = "name6";
body.DisplayName = "displayName6";

try
{
    GroupResponse result = await groupController.RestapiV2CreateGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Group

You can use this endpoint to programmatically modify an existing user account.
To modify a user, you require admin user privileges.
At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```csharp
RestapiV2UpdateGroupAsync(
    Models.TspublicRestV2GroupUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupUpdateRequest`](../../doc/models/tspublic-rest-v2-group-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupUpdateRequest();

try
{
    bool? result = await groupController.RestapiV2UpdateGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Group

To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one value needed.  When both are given user id will be considered to fetch user information.

```csharp
RestapiV2DeleteGroupAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the group. |
| `id` | `string` | Query, Optional | The GUID of the group |

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await groupController.RestapiV2DeleteGroupAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.
When you assign privileges to a group,  all the users under to this group inherits the privileges assigned to that group.
At least one of id or name of group is required. When both are given user id will be considered.

```csharp
RestapiV2AddPrivilegesToGroupAsync(
    Models.TspublicRestV2GroupAddprivilegeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupAddprivilegeRequest`](../../doc/models/tspublic-rest-v2-group-addprivilege-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupAddprivilegeRequest();

try
{
    bool? result = await groupController.RestapiV2AddPrivilegesToGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove Privileges From Group

To programmatically remove privileges from a group, use API endpoint. The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.

```csharp
RestapiV2RemovePrivilegesFromGroupAsync(
    Models.TspublicRestV2GroupRemoveprivilegeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupRemoveprivilegeRequest`](../../doc/models/tspublic-rest-v2-group-removeprivilege-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupRemoveprivilegeRequest();

try
{
    bool? result = await groupController.RestapiV2RemovePrivilegesFromGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add Users to Group

To programmatically add existing ThoughtSpot users to a group, use this API endpoint. When you assign users to a group, the users inherits the privileges assigned to that group. At least one of id or name of the group is required. When both are given user id will be considered.

```csharp
RestapiV2AddUsersToGroupAsync(
    Models.TspublicRestV2GroupAdduserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupAdduserRequest`](../../doc/models/tspublic-rest-v2-group-adduser-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupAdduserRequest();
body.Users = new List<UserNameAndIDInput>();

var bodyUsers0 = new UserNameAndIDInput();
body.Users.Add(bodyUsers0);


try
{
    bool? result = await groupController.RestapiV2AddUsersToGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove Users From Group

To programmatically remove users from a group, use API endpoint.The API removes only the user association. It does not delete the users or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.

```csharp
RestapiV2RemoveUsersFromGroupAsync(
    Models.TspublicRestV2GroupRemoveuserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupRemoveuserRequest`](../../doc/models/tspublic-rest-v2-group-removeuser-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupRemoveuserRequest();
body.Users = new List<UserNameAndIDInput>();

var bodyUsers0 = new UserNameAndIDInput();
body.Users.Add(bodyUsers0);


try
{
    bool? result = await groupController.RestapiV2RemoveUsersFromGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add Groups to Group

To programmatically add existing groups to a group, use API endpoint. When you assign groups to a group, the group inherits the privileges assigned to those groups. At least one of id or name of group is required. When both are given user id will be considered.

```csharp
RestapiV2AddGroupsToGroupAsync(
    Models.TspublicRestV2GroupAddgroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupAddgroupRequest`](../../doc/models/tspublic-rest-v2-group-addgroup-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupAddgroupRequest();
body.Groups = new List<GroupNameAndIDInput>();

var bodyGroups0 = new GroupNameAndIDInput();
body.Groups.Add(bodyGroups0);


try
{
    bool? result = await groupController.RestapiV2AddGroupsToGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove Groups From Group

To programmatically remove groups from a group, use API endpoint.The API removes only the group association. It does not delete the group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.

```csharp
RestapiV2RemoveGroupsFromGroupAsync(
    Models.TspublicRestV2GroupRemovegroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupRemovegroupRequest`](../../doc/models/tspublic-rest-v2-group-removegroup-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupRemovegroupRequest();
body.Groups = new List<GroupNameAndIDInput>();

var bodyGroups0 = new GroupNameAndIDInput();
body.Groups.Add(bodyGroups0);


try
{
    bool? result = await groupController.RestapiV2RemoveGroupsFromGroupAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system, use this end point.

```csharp
RestapiV2SearchGroupsAsync(
    Models.TspublicRestV2GroupSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2GroupSearchRequest`](../../doc/models/tspublic-rest-v2-group-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2GroupSearchRequest();

try
{
    object result = await groupController.RestapiV2SearchGroupsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

