# Security

```ts
const securityController = new SecurityController(client);
```

## Class Name

`SecurityController`

## Methods

* [Share Object](../../doc/controllers/security.md#share-object)
* [Share Visualization](../../doc/controllers/security.md#share-visualization)
* [Get Permission on Object](../../doc/controllers/security.md#get-permission-on-object)
* [Get Permission for Principal](../../doc/controllers/security.md#get-permission-for-principal)
* [Search Permission on Objects](../../doc/controllers/security.md#search-permission-on-objects)
* [Search Permission for Principals](../../doc/controllers/security.md#search-permission-for-principals)


# Share Object

To programmatically share ThoughtSpot objects with another user or user group, use this endpoint.

When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.

Requires privilege to share the object

```ts
async shareObject(
  body: TspublicRestV2SecurityShareTsobjectRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityShareTsobjectRequest`](../../doc/models/tspublic-rest-v2-security-share-tsobject-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: TspublicRestV2SecurityShareTsobjectRequest = {
  type: 'DATAOBJECT',
  id: bodyId,
  permission: 'permission8',
};

try {
  const { result, ...httpResponse } = await securityController.shareObject(body);
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


# Share Visualization

If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint.

When you share a visualization, a notification with a live link is sent to the user. When the users access this Liveboard, they can view the last saved version of the visualization.

Requires privilege to share the visualization

```ts
async shareVisualization(
  body: TspublicRestV2SecurityShareVisualizationRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityShareVisualizationRequest`](../../doc/models/tspublic-rest-v2-security-share-visualization-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyPrincipalId: string[] = ['principalId2', 'principalId3'];
const body: TspublicRestV2SecurityShareVisualizationRequest = {
  id: 'id6',
  vizId: 'vizId4',
  principalId: bodyPrincipalId,
};

try {
  const { result, ...httpResponse } = await securityController.shareVisualization(body);
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


# Get Permission on Object

To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```ts
async getPermissionOnObject(
  id: string,
  type: Type20Enum,
  includeDependent?: boolean,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SecurityPermissionResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the metadata object for which the permission needs to be obtained. |
| `type` | [`Type20Enum`](../../doc/models/type-20-enum.md) | Query, Required | Type of metadata object |
| `includeDependent` | `boolean \| undefined` | Query, Optional | When this field is set to true, the API response includes the permission details for the dependent objects. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SecurityPermissionResponse`](../../doc/models/security-permission-response.md)

## Example Usage

```ts
const id = 'id0';
const type = 'DATAOBJECT';
try {
  const { result, ...httpResponse } = await securityController.getPermissionOnObject(id, type);
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


# Get Permission for Principal

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

Provide at least one of id or name. When both are given then id is considered.

Requires administration privilege

```ts
async getPermissionForPrincipal(
  id?: string,
  name?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<PrincipalSearchResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string \| undefined` | Query, Optional | GUID of the user or user group for which the object permission needs to be obtained |
| `name` | `string \| undefined` | Query, Optional | Name of the user or user group for which the object permission needs to be obtained |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`PrincipalSearchResponse`](../../doc/models/principal-search-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await securityController.getPermissionForPrincipal();
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


# Search Permission on Objects

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups that has either VIEW OR MODIFY permission.

Provide list of object ids and its type to list the permissions for.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```ts
async searchPermissionOnObjects(
  body: TspublicRestV2SecurityPermissionTsobjectSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SecurityPermissionResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityPermissionTsobjectSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-tsobject-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SecurityPermissionResponse[]`](../../doc/models/security-permission-response.md)

## Example Usage

```ts
const contentType = null;
const bodyTsObject: TsObjectSearchInput[] = [];

const bodytsObject0Id: string[] = ['id8', 'id9'];
const bodytsObject0: TsObjectSearchInput = {
  type: 'DATAOBJECT',
  id: bodytsObject0Id,
};

bodyTsObject[0] = bodytsObject0;

const bodytsObject1Id: string[] = ['id9', 'id0', 'id1'];
const bodytsObject1: TsObjectSearchInput = {
  type: 'COLUMN',
  id: bodytsObject1Id,
};

bodyTsObject[1] = bodytsObject1;

const bodytsObject2Id: string[] = ['id0'];
const bodytsObject2: TsObjectSearchInput = {
  type: 'LIVEBOARD',
  id: bodytsObject2Id,
};

bodyTsObject[2] = bodytsObject2;

const body: TspublicRestV2SecurityPermissionTsobjectSearchRequest = {
  tsObject: bodyTsObject,
};

try {
  const { result, ...httpResponse } = await securityController.searchPermissionOnObjects(body);
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


# Search Permission for Principals

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

You can optionally provide list of object ids for which the persmission needs to be displayed.

Requires administration privilege

```ts
async searchPermissionForPrincipals(
  body: TspublicRestV2SecurityPermissionPrincipalSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<PrincipalSearchResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityPermissionPrincipalSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-principal-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`PrincipalSearchResponse[]`](../../doc/models/principal-search-response.md)

## Example Usage

```ts
const contentType = null;
const bodyPrincipal: UserNameAndIDInput[] = [];

const bodyprincipal0: UserNameAndIDInput = {};

bodyPrincipal[0] = bodyprincipal0;

const body: TspublicRestV2SecurityPermissionPrincipalSearchRequest = {
  principal: bodyPrincipal,
};

try {
  const { result, ...httpResponse } = await securityController.searchPermissionForPrincipals(body);
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

