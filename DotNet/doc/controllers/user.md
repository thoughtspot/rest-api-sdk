# User

```csharp
UserController userController = client.UserController;
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

```csharp
RestapiV2GetUserAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user that you want to query. |
| `id` | `string` | Query, Optional | The GUID of the user account to query |

## Response Type

[`Task<Models.UserResponse>`](../../doc/models/user-response.md)

## Example Usage

```csharp
try
{
    UserResponse result = await userController.RestapiV2GetUserAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create User

To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
To create a user, you require admin user privileges.
All users created in the ThoughtSpot system are added to ALL_GROUP

```csharp
RestapiV2CreateUserAsync(
    string name,
    string displayName,
    string password,
    Models.VisibilityEnum? visibility = null,
    string mail = null,
    List<int> orgIds = null,
    List<Models.GroupNameAndIDInput> groups = null,
    Models.StateEnum? state = null,
    bool? notifyOnShare = null,
    bool? showWalkMe = null,
    bool? analystOnboardingComplete = null,
    Models.Type8Enum? type = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Required | Name of the user. The username string must be unique. |
| `displayName` | `string` | Query, Required | A unique display name string for the user account, usually their first and last name |
| `password` | `string` | Query, Required | Password for the user account. |
| `visibility` | [`Models.VisibilityEnum?`](../../doc/models/visibility-enum.md) | Query, Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and this allows them to share objects |
| `mail` | `string` | Query, Optional | Email of the user account |
| `orgIds` | `List<int>` | Query, Optional | Array of org identifiers. If no value is provided then user will be created in the organization associated with the login session. |
| `groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Query, Optional | Array of objects of groups that the user belong to. |
| `state` | [`Models.StateEnum?`](../../doc/models/state-enum.md) | Query, Optional | Status of user account. acitve or inactive. |
| `notifyOnShare` | `bool?` | Query, Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `showWalkMe` | `bool?` | Query, Optional | The user preference for revisiting the onboarding experience. |
| `analystOnboardingComplete` | `bool?` | Query, Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `type` | [`Models.Type8Enum?`](../../doc/models/type-8-enum.md) | Query, Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

## Response Type

[`Task<Models.UserResponse>`](../../doc/models/user-response.md)

## Example Usage

```csharp
string name = "name0";
string displayName = "displayName2";
string password = "password4";

try
{
    UserResponse result = await userController.RestapiV2CreateUserAsync(name, displayName, password, null, null, null, null, null, null, null, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update User

You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```csharp
RestapiV2UpdateUserAsync(
    Models.TspublicRestV2UserUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserUpdateRequest`](../../doc/models/tspublic-rest-v2-user-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2UserUpdateRequest();

try
{
    bool? result = await userController.RestapiV2UpdateUserAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete User

To remove a user from the ThoughtSpot system, use this endpoint.
At Least one value needed.  When both are given user id will be considered to delete user.

```csharp
RestapiV2DeleteUserAsync(
    string name = null,
    string id = null,
    int? orgId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user that you want to query. |
| `id` | `string` | Query, Optional | The GUID of the user account to query |
| `orgId` | `int?` | Query, Optional | Unique identifier of the organization from which the user would be deleted. If no value is provided then user will be deleted from the organization associated with the login session. |

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await userController.RestapiV2DeleteUserAsync(null, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add User to Groups

To programmatically add groups to an existing ThoughtSpot user use this endpoint.
When you assign groups to a user, the user inherits the privileges assigned to those groups.
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```csharp
RestapiV2AddUserToGroupsAsync(
    Models.TspublicRestV2UserAddgroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserAddgroupRequest`](../../doc/models/tspublic-rest-v2-user-addgroup-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2UserAddgroupRequest();
body.Groups = new List<GroupNameAndIDInput>();

var bodyGroups0 = new GroupNameAndIDInput();
body.Groups.Add(bodyGroups0);


try
{
    bool? result = await userController.RestapiV2AddUserToGroupsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
The API removes only the user association. It does not delete the user or group from the Thoughtspot system
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```csharp
RestapiV2RemoveUserFromGroupsAsync(
    Models.TspublicRestV2UserRemovegroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserRemovegroupRequest`](../../doc/models/tspublic-rest-v2-user-removegroup-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2UserRemovegroupRequest();
body.Groups = new List<GroupNameAndIDInput>();

var bodyGroups0 = new GroupNameAndIDInput();
body.Groups.Add(bodyGroups0);


try
{
    bool? result = await userController.RestapiV2RemoveUserFromGroupsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Users

To get the details of a specific user account or all users in the ThoughtSpot system use this end point.

```csharp
RestapiV2SearchUsersAsync(
    Models.TspublicRestV2UserSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserSearchRequest`](../../doc/models/tspublic-rest-v2-user-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2UserSearchRequest();

try
{
    object result = await userController.RestapiV2SearchUsersAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

```csharp
RestapiV2ChangePasswordOfUserAsync(
    Models.TspublicRestV2UserChangepasswordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserChangepasswordRequest`](../../doc/models/tspublic-rest-v2-user-changepassword-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2UserChangepasswordRequest();
body.CurrentPassword = "currentPassword0";
body.NewPassword = "newPassword0";

try
{
    bool? result = await userController.RestapiV2ChangePasswordOfUserAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add User to Orgs

To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.

At least one of id or name of the organization is required. When both are given, then organization id will be considered.

Requires Administration access for the organization to which users need to be added.

```csharp
RestapiV2AddUserToOrgsAsync(
    Models.TspublicRestV2UserAddorgRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserAddorgRequest`](../../doc/models/tspublic-rest-v2-user-addorg-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2UserAddorgRequest();
body.Users = new List<UserNameAndIDInput>();

var bodyUsers0 = new UserNameAndIDInput();
body.Users.Add(bodyUsers0);


try
{
    bool? result = await userController.RestapiV2AddUserToOrgsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

