# User

```ts
const userController = new UserController(client);
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

```ts
async restapiV2GetUser(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<UserResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Username of the user that you want to query. |
| `id` | `string \| undefined` | Query, Optional | The GUID of the user account to query |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await userController.restapiV2GetUser();
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Create User

To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
To create a user, you require admin user privileges.
All users created in the ThoughtSpot system are added to ALL_GROUP

```ts
async restapiV2CreateUser(
  name: string,
  displayName: string,
  password: string,
  visibility?: VisibilityEnum,
  mail?: string,
  orgIds?: number[],
  state?: StateEnum,
  notifyOnShare?: boolean,
  showWalkMe?: boolean,
  analystOnboardingComplete?: boolean,
  type?: Type8Enum,
  requestOptions?: RequestOptions
): Promise<ApiResponse<UserResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Required | Name of the user. The username string must be unique. |
| `displayName` | `string` | Query, Required | A unique display name string for the user account, usually their first and last name |
| `password` | `string` | Query, Required | Password for the user account. |
| `visibility` | [`VisibilityEnum \| undefined`](../../doc/models/visibility-enum.md) | Query, Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and this allows them to share objects |
| `mail` | `string \| undefined` | Query, Optional | Email of the user account |
| `orgIds` | `number[] \| undefined` | Query, Optional | Array of org identifiers. If no value is provided then user will be created in the organization associated with the login session. |
| `state` | [`StateEnum \| undefined`](../../doc/models/state-enum.md) | Query, Optional | Status of user account. acitve or inactive. |
| `notifyOnShare` | `boolean \| undefined` | Query, Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `showWalkMe` | `boolean \| undefined` | Query, Optional | The user preference for revisiting the onboarding experience. |
| `analystOnboardingComplete` | `boolean \| undefined` | Query, Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `type` | [`Type8Enum \| undefined`](../../doc/models/type-8-enum.md) | Query, Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```ts
const name = 'name0';
const displayName = 'displayName2';
const password = 'password4';
try {
  const { result, ...httpResponse } = await userController.restapiV2CreateUser(name, displayName, password);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Update User

You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated

```ts
async restapiV2UpdateUser(
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
  const { result, ...httpResponse } = await userController.restapiV2UpdateUser(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Delete User

To remove a user from the ThoughtSpot system, use this endpoint.
At Least one value needed.  When both are given user id will be considered to delete user.

```ts
async restapiV2DeleteUser(
  name?: string,
  id?: string,
  orgId?: number,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Username of the user that you want to query. |
| `id` | `string \| undefined` | Query, Optional | The GUID of the user account to query |
| `orgId` | `number \| undefined` | Query, Optional | Unique identifier of the organization from which the user would be deleted. If no value is provided then user will be deleted from the organization associated with the login session. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await userController.restapiV2DeleteUser();
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Add User to Groups

To programmatically add groups to an existing ThoughtSpot user use this endpoint.
When you assign groups to a user, the user inherits the privileges assigned to those groups.
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```ts
async restapiV2AddUserToGroups(
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
  const { result, ...httpResponse } = await userController.restapiV2AddUserToGroups(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Remove User From Groups

To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
The API removes only the user association. It does not delete the user or group from the Thoughtspot system
At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```ts
async restapiV2RemoveUserFromGroups(
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
  const { result, ...httpResponse } = await userController.restapiV2RemoveUserFromGroups(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Search Users

To get the details of a specific user account or all users in the ThoughtSpot system use this end point.

```ts
async restapiV2SearchUsers(
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
  const { result, ...httpResponse } = await userController.restapiV2SearchUsers(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Change Password of User

To change the password of a ThoughtSpot user account, use this endpoint.

At least one of id or name of user is required. When both are given user id will be considered.

```ts
async restapiV2ChangePasswordOfUser(
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
  const { result, ...httpResponse } = await userController.restapiV2ChangePasswordOfUser(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Add User to Orgs

To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.

At least one of id or name of the organization is required. When both are given, then organization id will be considered.

Requires Administration access for the organization to which users need to be added.

```ts
async restapiV2AddUserToOrgs(
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
  const { result, ...httpResponse } = await userController.restapiV2AddUserToOrgs(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

