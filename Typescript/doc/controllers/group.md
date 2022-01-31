# Group

```ts
const groupController = new GroupController(client);
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

```ts
async getGroup(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<GroupResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Name of the group |
| `id` | `string \| undefined` | Query, Optional | The GUID of the group |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`GroupResponse`](/doc/models/group-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await groupController.getGroup();
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


# Create Group

To programmatically create a group in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a group and assign privileges and users.

For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups.

The privileges determine the actions that the users belonging to a group are allowed to do.

ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

```ts
async createGroup(
  body: ApiRestV2GroupCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<GroupResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupCreateRequest`](/doc/models/api-rest-v2-group-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`GroupResponse`](/doc/models/group-response.md)

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupCreateRequest = {
  name: 'name6',
  displayName: 'displayName6',
};

try {
  const { result, ...httpResponse } = await groupController.createGroup(body);
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


# Update Group

You can use this endpoint to programmatically modify an existing group.

To modify a group, you require admin user privileges.

At least one of id or name is required to update the group. When both are given, then id will be considered and group name will be updated.

```ts
async updateGroup(
  body: ApiRestV2GroupUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupUpdateRequest`](/doc/models/api-rest-v2-group-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupUpdateRequest = {};

try {
  const { result, ...httpResponse } = await groupController.updateGroup(body);
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


# Delete Group

To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value needed. When both are given,then user id will be considered to fetch user information.

```ts
async deleteGroup(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Name of the group. |
| `id` | `string \| undefined` | Query, Optional | The GUID of the group |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await groupController.deleteGroup();
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


# Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.

When you assign privileges to a group, all the users under to this group inherits the privileges assigned to that group.

At least one of id or name of group is required. When both are given,then user id will be considered.

```ts
async addPrivilegesToGroup(
  body: ApiRestV2GroupAddprivilegeRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAddprivilegeRequest`](/doc/models/api-rest-v2-group-addprivilege-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupAddprivilegeRequest = {};

try {
  const { result, ...httpResponse } = await groupController.addPrivilegesToGroup(body);
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


# Remove Privileges From Group

To programmatically remove privileges from a group, use API endpoint.

The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

```ts
async removePrivilegesFromGroup(
  body: ApiRestV2GroupRemoveprivilegeRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemoveprivilegeRequest`](/doc/models/api-rest-v2-group-removeprivilege-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupRemoveprivilegeRequest = {};

try {
  const { result, ...httpResponse } = await groupController.removePrivilegesFromGroup(body);
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


# Add Users to Group

To programmatically add existing ThoughtSpot users to a group, use this API endpoint.

hen you assign users to a group, the users inherits the privileges assigned to that group.

At least one of id or name of the group is required. When both are given,then user id will be considered.

```ts
async addUsersToGroup(
  body: ApiRestV2GroupAdduserRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAdduserRequest`](/doc/models/api-rest-v2-group-adduser-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupAdduserRequest = {};

try {
  const { result, ...httpResponse } = await groupController.addUsersToGroup(body);
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


# Remove Users From Group

To programmatically remove users from a group, use API endpoint.

The API removes only the user association. It does not delete the users or group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

```ts
async removeUsersFromGroup(
  body: ApiRestV2GroupRemoveuserRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemoveuserRequest`](/doc/models/api-rest-v2-group-removeuser-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupRemoveuserRequest = {};

try {
  const { result, ...httpResponse } = await groupController.removeUsersFromGroup(body);
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


# Add Groups to Group

To programmatically add existing groups to a group, use API endpoint.

When you assign groups to a group, the group inherits the privileges assigned to those groups.

At least one of id or name of group is required. When both are given,then user id will be considered.

```ts
async addGroupsToGroup(
  body: ApiRestV2GroupAddgroupRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAddgroupRequest`](/doc/models/api-rest-v2-group-addgroup-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupAddgroupRequest = {};

try {
  const { result, ...httpResponse } = await groupController.addGroupsToGroup(body);
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


# Remove Groups From Group

To programmatically remove groups from a group, use API endpoint.

The API removes only the group association. It does not delete the group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

```ts
async removeGroupsFromGroup(
  body: ApiRestV2GroupRemovegroupRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemovegroupRequest`](/doc/models/api-rest-v2-group-removegroup-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupRemovegroupRequest = {};

try {
  const { result, ...httpResponse } = await groupController.removeGroupsFromGroup(body);
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


# Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system use this end point.

If no inputs are provided, then all groups are included in the response.

```ts
async searchGroups(
  body: ApiRestV2GroupSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<GroupResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupSearchRequest`](/doc/models/api-rest-v2-group-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`GroupResponse[]`](/doc/models/group-response.md)

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2GroupSearchRequest = {};

try {
  const { result, ...httpResponse } = await groupController.searchGroups(body);
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

