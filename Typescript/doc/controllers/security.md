# Security

```ts
const securityController = new SecurityController(client);
```

## Class Name

`SecurityController`

## Methods

* [Restapi V2 Get Permission on Object](../../doc/controllers/security.md#restapi-v2-get-permission-on-object)
* [Restapi V2 Get Permission for Principal](../../doc/controllers/security.md#restapi-v2-get-permission-for-principal)
* [Restapi V2 Share Object](../../doc/controllers/security.md#restapi-v2-share-object)
* [Restapi V2 Share Visualization](../../doc/controllers/security.md#restapi-v2-share-visualization)
* [Restapi V2 Search Permission on Objects](../../doc/controllers/security.md#restapi-v2-search-permission-on-objects)
* [Restapi V2 Search Permission for Principals](../../doc/controllers/security.md#restapi-v2-search-permission-for-principals)


# Restapi V2 Get Permission on Object

To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

```ts
async restapiV2GetPermissionOnObject(
  id: string,
  type: Type7Enum,
  includeDependent?: boolean,
  requestOptions?: RequestOptions
): Promise<ApiResponse<SecurityPermissionResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the metadata object for which the permission needs to be obtained. |
| `type` | [`Type7Enum`](../../doc/models/type-7-enum.md) | Query, Required | Type of metadata object. Valid values: Liveboard\|Answer\|DataObject\|Column |
| `includeDependent` | `boolean \| undefined` | Query, Optional | When this field is set to true, the API returns the permission details for the dependent objects for the the object included in the request |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`SecurityPermissionResponse`](../../doc/models/security-permission-response.md)

## Example Usage

```ts
const id = 'id0';
const type = 'DATAOBJECT';
try {
  const { result, ...httpResponse } = await securityController.restapiV2GetPermissionOnObject(id, type);
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


# Restapi V2 Get Permission for Principal

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

Requires administration privilege

```ts
async restapiV2GetPermissionForPrincipal(
  id?: string,
  name?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<PrincipalSearchResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string \| undefined` | Query, Optional | GUID of the user or user group for which the object permission needs to be obtained |
| `name` | `string \| undefined` | Query, Optional | Name of the ser or user group for which the object permission needs to be obtained |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`PrincipalSearchResponse`](../../doc/models/principal-search-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await securityController.restapiV2GetPermissionForPrincipal();
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


# Restapi V2 Share Object

To programmatically share ThoughtSpot objects with another user or user group, use this endpoint.

When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.

```ts
async restapiV2ShareObject(
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
  const { result, ...httpResponse } = await securityController.restapiV2ShareObject(body);
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


# Restapi V2 Share Visualization

If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint.

Requires privilege to share the visualization

```ts
async restapiV2ShareVisualization(
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
  const { result, ...httpResponse } = await securityController.restapiV2ShareVisualization(body);
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


# Restapi V2 Search Permission on Objects

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```ts
async restapiV2SearchPermissionOnObjects(
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
  const { result, ...httpResponse } = await securityController.restapiV2SearchPermissionOnObjects(body);
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


# Restapi V2 Search Permission for Principals

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```ts
async restapiV2SearchPermissionForPrincipals(
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
  const { result, ...httpResponse } = await securityController.restapiV2SearchPermissionForPrincipals(body);
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

