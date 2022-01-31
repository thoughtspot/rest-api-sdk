# Admin

```ts
const adminController = new AdminController(client);
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

```ts
async getClusterConfig(
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await adminController.getClusterConfig();
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Cluster Config Overrides

To get the details of overrides to the Thoughtspot cluster configuration, use this endpoint.

```ts
async getClusterConfigOverrides(
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await adminController.getClusterConfigOverrides();
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

```ts
async updateClusterConfig(
  body: ApiRestV2AdminConfigurationUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminConfigurationUpdateRequest`](/doc/models/api-rest-v2-admin-configuration-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2AdminConfigurationUpdateRequest = {};

try {
  const { result, ...httpResponse } = await adminController.updateClusterConfig(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Reset User Password

To reset the password of a ThoughtSpot user account, use this endpoint.

It is mandatory to use Authorization header with token of a user with admin access to successfully run this endpoint.

At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```ts
async resetUserPassword(
  body: ApiRestV2AdminResetpasswordRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminResetpasswordRequest`](/doc/models/api-rest-v2-admin-resetpassword-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2AdminResetpasswordRequest = {
  newPassword: 'newPassword0',
};

try {
  const { result, ...httpResponse } = await adminController.resetUserPassword(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Sync Principal

To programmatically synchronize user accounts and user groups from external system with ThoughtSpot, use this endpoint.

The payload takes principals containing all users and groups present in the external system.

The users and user groups in Thoughtspot get updated for any matching inputs.

Any user and user group present in the input, but not present in the cluster, gets created in cluster.
n You can optionally choose to delete the user and groups from the cluster, that are not present in the input.

```ts
async syncPrincipal(
  body: ApiRestV2AdminSyncprincipalRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<AdminsyncPrincipalResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminSyncprincipalRequest`](/doc/models/api-rest-v2-admin-syncprincipal-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`AdminsyncPrincipalResponse`](/doc/models/adminsync-principal-response.md)

## Example Usage

```ts
const contentType = null;
const bodyPrincipalObject: string[] = ['principalObject0'];
const body: ApiRestV2AdminSyncprincipalRequest = {
  principalObject: bodyPrincipalObject,
};

try {
  const { result, ...httpResponse } = await adminController.syncPrincipal(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Change Owner of Objects

To programmatically change the owner of one or several objects from one user account to another, use this endpoint.

You might want to transfer ownership of objects owned by a user to another active user, when the account is removed from the ThoughtSpot application.

```ts
async changeOwnerOfObjects(
  body: ApiRestV2AdminChangeownerRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2AdminChangeownerRequest`](/doc/models/api-rest-v2-admin-changeowner-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyMetaObjectId: string[] = ['metaObjectId9', 'metaObjectId0', 'metaObjectId1'];
const bodyFromUser: FromUserNameAndIDInput = {};

const bodyToUser: ToUserNameAndIDInput = {};

const body: ApiRestV2AdminChangeownerRequest = {
  metaObjectId: bodyMetaObjectId,
  fromUser: bodyFromUser,
  toUser: bodyToUser,
};

try {
  const { result, ...httpResponse } = await adminController.changeOwnerOfObjects(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

