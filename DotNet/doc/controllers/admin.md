# Admin

```csharp
AdminController adminController = client.AdminController;
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
* [Force Logout Users](../../doc/controllers/admin.md#force-logout-users)


# Get Cluster Config

To get details of the current configuration of a Thoughtspot cluster, use this endpoint.

Permission: Requires administration privilege

```csharp
GetClusterConfigAsync()
```

## Response Type

`Task<object>`

## Example Usage

```csharp
try
{
    object result = await adminController.GetClusterConfigAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Cluster Config Overrides

To get the details of overrides to the Thoughtspot cluster configuration, use this endpoint.

Permission: Requires administration privilege

```csharp
GetClusterConfigOverridesAsync()
```

## Response Type

`Task<object>`

## Example Usage

```csharp
try
{
    object result = await adminController.GetClusterConfigOverridesAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

Permission: Requires administration privilege

```csharp
UpdateClusterConfigAsync(
    Models.TspublicRestV2AdminConfigurationUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2AdminConfigurationUpdateRequest`](../../doc/models/tspublic-rest-v2-admin-configuration-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2AdminConfigurationUpdateRequest();

try
{
    bool? result = await adminController.UpdateClusterConfigAsync(body);
}
catch (ApiException e){};
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

```csharp
ResetUserPasswordAsync(
    Models.TspublicRestV2AdminResetpasswordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2AdminResetpasswordRequest`](../../doc/models/tspublic-rest-v2-admin-resetpassword-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2AdminResetpasswordRequest();
body.NewPassword = "newPassword0";

try
{
    bool? result = await adminController.ResetUserPasswordAsync(body);
}
catch (ApiException e){};
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

```csharp
SyncPrincipalAsync(
    Models.TspublicRestV2AdminSyncprincipalRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2AdminSyncprincipalRequest`](../../doc/models/tspublic-rest-v2-admin-syncprincipal-request.md) | Body, Required | - |

## Response Type

[`Task<Models.AdminsyncPrincipalResponse>`](../../doc/models/adminsync-principal-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2AdminSyncprincipalRequest();
body.PrincipalObject = new object();
body.PrincipalObject.Add(ApiHelper.JsonDeserialize<Object>("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

try
{
    AdminsyncPrincipalResponse result = await adminController.SyncPrincipalAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Change Author of Objects

To programmatically change the author of one or several objects from one user account to another, use this endpoint.

You might want to change the author of objects from one user to another active user, when the account is removed from the ThoughtSpot application.

Permission: Requires administration privilege

```csharp
ChangeAuthorOfObjectsAsync(
    Models.TspublicRestV2AdminChangeauthorRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2AdminChangeauthorRequest`](../../doc/models/tspublic-rest-v2-admin-changeauthor-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2AdminChangeauthorRequest();
body.TsObjectId = new List<string>();
body.TsObjectId.Add("tsObjectId7");
body.FromUser = new FromUserNameAndIDInput();
body.ToUser = new ToUserNameAndIDInput();

try
{
    bool? result = await adminController.ChangeAuthorOfObjectsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Author to Objects

To programmatically assign an author to one or several objects, use this endpoint.

Provide either user name or id as input. When both are given user id will be considered.

Requires administration privilege.

```csharp
AssignAuthorToObjectsAsync(
    Models.TspublicRestV2AdminAssignauthorRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2AdminAssignauthorRequest`](../../doc/models/tspublic-rest-v2-admin-assignauthor-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2AdminAssignauthorRequest();
body.TsObjectId = new List<string>();
body.TsObjectId.Add("tsObjectId7");

try
{
    bool? result = await adminController.AssignAuthorToObjectsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Force Logout Users

To logout one or more users from logged in session, use this endpoint. If no input is provided then all logged in users are force logged out.

Requires administration privilege

```csharp
ForceLogoutUsersAsync(
    Models.TspublicRestV2AdminForcelogoutRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2AdminForcelogoutRequest`](../../doc/models/tspublic-rest-v2-admin-forcelogout-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2AdminForcelogoutRequest();

try
{
    bool? result = await adminController.ForceLogoutUsersAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

