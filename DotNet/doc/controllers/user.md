# User

```csharp
UserController userController = client.UserController;
```

## Class Name

`UserController`

## Methods

* [Get User](../../doc/controllers/user.md#get-user)
* [Create User](../../doc/controllers/user.md#create-user)
* [Update User](../../doc/controllers/user.md#update-user)
* [Delete User](../../doc/controllers/user.md#delete-user)
* [Add User to Groups](../../doc/controllers/user.md#add-user-to-groups)
* [Remove User From Groups](../../doc/controllers/user.md#remove-user-from-groups)
* [Add User to Orgs](../../doc/controllers/user.md#add-user-to-orgs)
* [Change Password of User](../../doc/controllers/user.md#change-password-of-user)
* [Search Users](../../doc/controllers/user.md#search-users)


# Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information

Permission: Requires administration privilege

```csharp
GetUserAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user that you want to query |
| `id` | `string` | Query, Optional | The GUID of the user account to query |

## Response Type

[`Task<Models.UserResponse>`](../../doc/models/user-response.md)

## Example Usage

```csharp
try
{
    UserResponse result = await userController.GetUserAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a user and assign groups. To create a user, you require admin user privileges.

All users created in the ThoughtSpot system are added to ALL user group.

Permission: Requires administration privilege

```csharp
CreateUserAsync(
    Models.TspublicRestV2UserCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2UserCreateRequest`](../../doc/models/tspublic-rest-v2-user-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.UserResponse>`](../../doc/models/user-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2UserCreateRequest();
body.Name = "name6";
body.DisplayName = "displayName6";
body.Password = "password0";

try
{
    UserResponse result = await userController.CreateUserAsync(body);
}
catch (ApiException e){};
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

```csharp
UpdateUserAsync(
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
    bool? result = await userController.UpdateUserAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete User

To remove a user from the ThoughtSpot system, use this endpoint.

At least one value is needed. When both are given, then user id will be considered to delete user.

Permission: Requires administration privilege

```csharp
DeleteUserAsync(
    string name = null,
    string id = null,
    int? orgId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Username of the user account |
| `id` | `string` | Query, Optional | The GUID of the user account |
| `orgId` | `int?` | Query, Optional | This is applicable only if organization feature is enabled in the cluster.<br><br>Unique identifier of the organization from which the user would be deleted. If no value is provided, the organization associated with the login session is considered. |

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await userController.DeleteUserAsync(null, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add User to Groups

To programmatically add groups to an existing ThoughtSpot user, use this endpoint.

When you assign groups to a user, the user inherits the privileges assigned to those groups.

At least one of user Id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```csharp
AddUserToGroupsAsync(
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
    bool? result = await userController.AddUserToGroupsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.

The API removes only the user association. It does not delete the user or group from the Thoughtspot system.

At least one of user id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```csharp
RemoveUserFromGroupsAsync(
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
    bool? result = await userController.RemoveUserFromGroupsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add User to Orgs

This is endpoint is applicable only if organization feature is enabled in the cluster.

To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.

Requires Administration access for the organization to which users need to be added.

```csharp
AddUserToOrgsAsync(
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
    bool? result = await userController.AddUserToOrgsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

Permission: Requires administration privilege

```csharp
ChangePasswordOfUserAsync(
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
    bool? result = await userController.ChangePasswordOfUserAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Users

To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.

Permission: Requires administration privilege

```csharp
SearchUsersAsync(
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
    object result = await userController.SearchUsersAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

