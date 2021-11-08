# User

```ts
const userController = new UserController(client);
```

## Class Name

`UserController`

## Methods

* [Get User](/doc/controllers/user.md#get-user)
* [Create User](/doc/controllers/user.md#create-user)
* [Update User](/doc/controllers/user.md#update-user)
* [Delete User](/doc/controllers/user.md#delete-user)
* [Add Groups to User](/doc/controllers/user.md#add-groups-to-user)
* [Remove Groups From User](/doc/controllers/user.md#remove-groups-from-user)
* [Search Users](/doc/controllers/user.md#search-users)


# Get User

To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information

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

[`UserResponse`](/doc/models/user-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Create User

To programmatically create a user account in the ThoughtSpot system, use this API endpoint. Using this API, you can create a user and assign groups. To create a user, you require admin user privileges. All users created in the ThoughtSpot system are added to ALL_GROUP

```ts
async createUser(
  body: ApiRestV2UserCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<UserResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserCreateRequest`](/doc/models/api-rest-v2-user-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`UserResponse`](/doc/models/user-response.md)

## Example Usage

```ts
const body: ApiRestV2UserCreateRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Update User

You can use this endpoint to programmatically modify an existing user account. To modify a user, you require admin user privileges. At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```ts
async updateUser(
  body: ApiRestV2UserUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserUpdateRequest`](/doc/models/api-rest-v2-user-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const body: ApiRestV2UserUpdateRequest = {};

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Delete User

To remove a user from the ThoughtSpot system, use this endpoint. At least one value is needed. When both are given, then user id will be considered to delete user.

```ts
async deleteUser(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Username of the user account |
| `id` | `string \| undefined` | Query, Optional | The GUID of the user account |
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Add Groups to User

To programmatically add groups to an existing ThoughtSpot user, use this endpoint. When you assign groups to a user, the user inherits the privileges assigned to those groups. At least one of user Id or username is mandatory. When both are given, then user id will be considered.

```ts
async addGroupsToUser(
  body: ApiRestV2UserAddgroupRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserAddgroupRequest`](/doc/models/api-rest-v2-user-addgroup-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const body: ApiRestV2UserAddgroupRequest = {};

try {
  const { result, ...httpResponse } = await userController.addGroupsToUser(body);
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


# Remove Groups From User

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint. The API removes only the user association. It does not delete the user or group from the Thoughtspot system. At least one of user id or username is mandatory. When both are given, then user id will be considered.

```ts
async removeGroupsFromUser(
  body: ApiRestV2UserRemovegroupRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserRemovegroupRequest`](/doc/models/api-rest-v2-user-removegroup-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const body: ApiRestV2UserRemovegroupRequest = {};

try {
  const { result, ...httpResponse } = await userController.removeGroupsFromUser(body);
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


# Search Users

To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.

```ts
async searchUsers(
  body: ApiRestV2UserSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<UserResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2UserSearchRequest`](/doc/models/api-rest-v2-user-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`UserResponse[]`](/doc/models/user-response.md)

## Example Usage

```ts
const body: ApiRestV2UserSearchRequest = {};

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

