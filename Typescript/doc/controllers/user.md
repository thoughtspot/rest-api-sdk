# User

```ts
const userController = new UserController(client);
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

```ts
async getUser(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<UserResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Username of the user that you want to query |
| `id` | `string \| undefined` | Query, Optional | The GUID of the user account to query |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await userController.getUser();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a user and assign groups. To create a user, you require admin user privileges.

All users created in the ThoughtSpot system are added to ALL user group.

Permission: Requires administration privilege

```ts
async createUser(
  body: TspublicRestV2UserCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<UserResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserCreateRequest`](../../doc/models/tspublic-rest-v2-user-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2UserCreateRequest = {
  name: 'name6',
  displayName: 'displayName6',
  password: 'password0',
};

try {
  const { result, ...httpResponse } = await userController.createUser(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Update User

You can use this endpoint to programmatically modify an existing user account.

To modify a user, you require admin user privileges.

At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

Permission: Requires administration privilege

```ts
async updateUser(
  body: TspublicRestV2UserUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserUpdateRequest`](../../doc/models/tspublic-rest-v2-user-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2UserUpdateRequest = {};

try {
  const { result, ...httpResponse } = await userController.updateUser(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Delete User

To remove a user from the ThoughtSpot system, use this endpoint.

At least one value is needed. When both are given, then user id will be considered to delete user.

Permission: Requires administration privilege

```ts
async deleteUser(
  name?: string,
  id?: string,
  orgId?: number,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Username of the user account |
| `id` | `string \| undefined` | Query, Optional | The GUID of the user account |
| `orgId` | `number \| undefined` | Query, Optional | This is applicable only if organization feature is enabled in the cluster.<br><br>Unique identifier of the organization from which the user would be deleted. If no value is provided, the organization associated with the login session is considered. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await userController.deleteUser();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Add User to Groups

To programmatically add groups to an existing ThoughtSpot user, use this endpoint.

When you assign groups to a user, the user inherits the privileges assigned to those groups.

At least one of user Id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```ts
async addUserToGroups(
  body: TspublicRestV2UserAddgroupRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserAddgroupRequest`](../../doc/models/tspublic-rest-v2-user-addgroup-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyGroups: GroupNameAndIDInput[] = [];

const bodygroups0: GroupNameAndIDInput = {};

bodyGroups[0] = bodygroups0;

const body: TspublicRestV2UserAddgroupRequest = {
  groups: bodyGroups,
};

try {
  const { result, ...httpResponse } = await userController.addUserToGroups(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.

The API removes only the user association. It does not delete the user or group from the Thoughtspot system.

At least one of user id or username is mandatory. When both are given, then user id will be considered.

Permission: Requires administration privilege

```ts
async removeUserFromGroups(
  body: TspublicRestV2UserRemovegroupRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserRemovegroupRequest`](../../doc/models/tspublic-rest-v2-user-removegroup-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyGroups: GroupNameAndIDInput[] = [];

const bodygroups0: GroupNameAndIDInput = {};

bodyGroups[0] = bodygroups0;

const body: TspublicRestV2UserRemovegroupRequest = {
  groups: bodyGroups,
};

try {
  const { result, ...httpResponse } = await userController.removeUserFromGroups(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Add User to Orgs

This is endpoint is applicable only if organization feature is enabled in the cluster.

To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.

Requires Administration access for the organization to which users need to be added.

```ts
async addUserToOrgs(
  body: TspublicRestV2UserAddorgRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserAddorgRequest`](../../doc/models/tspublic-rest-v2-user-addorg-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyUsers: UserNameAndIDInput[] = [];

const bodyusers0: UserNameAndIDInput = {};

bodyUsers[0] = bodyusers0;

const body: TspublicRestV2UserAddorgRequest = {
  users: bodyUsers,
};

try {
  const { result, ...httpResponse } = await userController.addUserToOrgs(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

Permission: Requires administration privilege

```ts
async changePasswordOfUser(
  body: TspublicRestV2UserChangepasswordRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserChangepasswordRequest`](../../doc/models/tspublic-rest-v2-user-changepassword-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2UserChangepasswordRequest = {
  currentPassword: 'currentPassword0',
  newPassword: 'newPassword0',
};

try {
  const { result, ...httpResponse } = await userController.changePasswordOfUser(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Search Users

To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.

Permission: Requires administration privilege

```ts
async searchUsers(
  body: TspublicRestV2UserSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2UserSearchRequest`](../../doc/models/tspublic-rest-v2-user-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2UserSearchRequest = {};

try {
  const { result, ...httpResponse } = await userController.searchUsers(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

