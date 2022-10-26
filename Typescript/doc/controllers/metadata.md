# Metadata

```ts
const metadataController = new MetadataController(client);
```

## Class Name

`MetadataController`

## Methods

* [Restapi V2 Get Tag](../../doc/controllers/metadata.md#restapi-v2-get-tag)
* [Restapi V2 Get Home Liveboard](../../doc/controllers/metadata.md#restapi-v2-get-home-liveboard)
* [Restapi V2 Search Object Header](../../doc/controllers/metadata.md#restapi-v2-search-object-header)
* [Restapi V2 Get Object Visualization Header](../../doc/controllers/metadata.md#restapi-v2-get-object-visualization-header)
* [Restapi V2 Get Object Detail](../../doc/controllers/metadata.md#restapi-v2-get-object-detail)
* [Restapi V2 Get Object Header](../../doc/controllers/metadata.md#restapi-v2-get-object-header)
* [Restapi V2 Search Object Detail](../../doc/controllers/metadata.md#restapi-v2-search-object-detail)
* [Restapi V2 Create Tag](../../doc/controllers/metadata.md#restapi-v2-create-tag)
* [Restapi V2 Update Tag](../../doc/controllers/metadata.md#restapi-v2-update-tag)
* [Restapi V2 Delete Tag](../../doc/controllers/metadata.md#restapi-v2-delete-tag)
* [Restapi V2 Assign Tag](../../doc/controllers/metadata.md#restapi-v2-assign-tag)
* [Restapi V2 Unassign Tag](../../doc/controllers/metadata.md#restapi-v2-unassign-tag)
* [Restapi V2 Assign Favorite](../../doc/controllers/metadata.md#restapi-v2-assign-favorite)
* [Restapi V2 Unassign Favorite](../../doc/controllers/metadata.md#restapi-v2-unassign-favorite)
* [Restapi V2 Assign Home Liveboard](../../doc/controllers/metadata.md#restapi-v2-assign-home-liveboard)
* [Restapi V2 Unassign Home Liveboard](../../doc/controllers/metadata.md#restapi-v2-unassign-home-liveboard)
* [Restapi V2 Export Object TML](../../doc/controllers/metadata.md#restapi-v2-export-object-tml)
* [Restapi V2 Import Object TML](../../doc/controllers/metadata.md#restapi-v2-import-object-tml)
* [Restapi V2 Delete Object](../../doc/controllers/metadata.md#restapi-v2-delete-object)
* [Restapi V2 Get Object Dependency](../../doc/controllers/metadata.md#restapi-v2-get-object-dependency)


# Restapi V2 Get Tag

To get details of a specific tag, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async restapiV2GetTag(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<MetadataTagResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Name of the tag |
| `id` | `string \| undefined` | Query, Optional | The GUID of the tag |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`MetadataTagResponse`](../../doc/models/metadata-tag-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await metadataController.restapiV2GetTag();
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


# Restapi V2 Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async restapiV2GetHomeLiveboard(
  userName?: string,
  userId?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<HomeLiveboardResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string \| undefined` | Query, Optional | Name of the tag |
| `userId` | `string \| undefined` | Query, Optional | The GUID of the tag |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`HomeLiveboardResponse`](../../doc/models/home-liveboard-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await metadataController.restapiV2GetHomeLiveboard();
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


# Restapi V2 Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```ts
async restapiV2SearchObjectHeader(
  body: TspublicRestV2MetadataHeaderSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHeaderSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-header-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2MetadataHeaderSearchRequest = {
  type: 'USER',
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2SearchObjectHeader(body);
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


# Restapi V2 Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer. At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```ts
async restapiV2GetObjectVisualizationHeader(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the liveboard or answer |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown[]`

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await metadataController.restapiV2GetObjectVisualizationHeader(id);
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


# Restapi V2 Get Object Detail

Use this endpoint to get full details of metadata objects

```ts
async restapiV2GetObjectDetail(
  type: Type4Enum,
  id: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `string[]` | Query, Required | A JSON array of GUIDs of the objects. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const type = 'DATAOBJECT';
const Id: string[] = ['id0'];
try {
  const { result, ...httpResponse } = await metadataController.restapiV2GetObjectDetail(type, id);
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


# Restapi V2 Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```ts
async restapiV2GetObjectHeader(
  type: Type5Enum,
  id: string,
  outputFields?: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type5Enum`](../../doc/models/type-5-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `string` | Query, Required | GUID of the metadata object |
| `outputFields` | `string[] \| undefined` | Query, Optional | Array of header field names that need to be included in the header response |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const type = 'COLUMN_ALL';
const id = 'id0';
try {
  const { result, ...httpResponse } = await metadataController.restapiV2GetObjectHeader(type, id);
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


# Restapi V2 Search Object Detail

Use this endpoint to get full details of metadata objects

```ts
async restapiV2SearchObjectDetail(
  body: TspublicRestV2MetadataDetailSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataDetailSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-detail-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: TspublicRestV2MetadataDetailSearchRequest = {
  type: 'USER',
  id: bodyId,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2SearchObjectDetail(body);
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


# Restapi V2 Create Tag

To programmatically create tags, use this endpoint

```ts
async restapiV2CreateTag(
  body: TspublicRestV2MetadataTagCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<MetadataTagResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagCreateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`MetadataTagResponse`](../../doc/models/metadata-tag-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2MetadataTagCreateRequest = {
  name: 'name6',
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2CreateTag(body);
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


# Restapi V2 Update Tag

To programmatically update tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async restapiV2UpdateTag(
  body: TspublicRestV2MetadataTagUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagUpdateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2MetadataTagUpdateRequest = {};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2UpdateTag(body);
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


# Restapi V2 Delete Tag

To programmatically delete tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async restapiV2DeleteTag(
  name?: string,
  id?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Name of the tag |
| `id` | `string \| undefined` | Query, Optional | The GUID of the tag |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await metadataController.restapiV2DeleteTag();
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


# Restapi V2 Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async restapiV2AssignTag(
  body: TspublicRestV2MetadataTagAssignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTsObject: TsObjectInput[] = [];

const bodytsObject0: TsObjectInput = {
  id: 'id8',
  type: 'DATAOBJECT',
};

bodyTsObject[0] = bodytsObject0;

const bodytsObject1: TsObjectInput = {
  id: 'id9',
  type: 'CONNECTION',
};

bodyTsObject[1] = bodytsObject1;

const bodytsObject2: TsObjectInput = {
  id: 'id0',
  type: 'ANSWER',
};

bodyTsObject[2] = bodytsObject2;

const body: TspublicRestV2MetadataTagAssignRequest = {
  tsObject: bodyTsObject,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2AssignTag(body);
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


# Restapi V2 Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async restapiV2UnassignTag(
  body: TspublicRestV2MetadataTagUnassignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTsObject: TsObjectInput[] = [];

const bodytsObject0: TsObjectInput = {
  id: 'id8',
  type: 'DATAOBJECT',
};

bodyTsObject[0] = bodytsObject0;

const bodytsObject1: TsObjectInput = {
  id: 'id9',
  type: 'CONNECTION',
};

bodyTsObject[1] = bodytsObject1;

const bodytsObject2: TsObjectInput = {
  id: 'id0',
  type: 'ANSWER',
};

bodyTsObject[2] = bodytsObject2;

const body: TspublicRestV2MetadataTagUnassignRequest = {
  tsObject: bodyTsObject,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2UnassignTag(body);
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


# Restapi V2 Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async restapiV2AssignFavorite(
  body: TspublicRestV2MetadataFavoriteAssignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataFavoriteAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTsObject: TsObjectInput[] = [];

const bodytsObject0: TsObjectInput = {
  id: 'id8',
  type: 'DATAOBJECT',
};

bodyTsObject[0] = bodytsObject0;

const bodytsObject1: TsObjectInput = {
  id: 'id9',
  type: 'CONNECTION',
};

bodyTsObject[1] = bodytsObject1;

const bodytsObject2: TsObjectInput = {
  id: 'id0',
  type: 'ANSWER',
};

bodyTsObject[2] = bodytsObject2;

const body: TspublicRestV2MetadataFavoriteAssignRequest = {
  tsObject: bodyTsObject,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2AssignFavorite(body);
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


# Restapi V2 Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async restapiV2UnassignFavorite(
  body: TspublicRestV2MetadataFavoriteUnassignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataFavoriteUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTsObject: TsObjectInput[] = [];

const bodytsObject0: TsObjectInput = {
  id: 'id8',
  type: 'DATAOBJECT',
};

bodyTsObject[0] = bodytsObject0;

const bodytsObject1: TsObjectInput = {
  id: 'id9',
  type: 'CONNECTION',
};

bodyTsObject[1] = bodytsObject1;

const bodytsObject2: TsObjectInput = {
  id: 'id0',
  type: 'ANSWER',
};

bodyTsObject[2] = bodytsObject2;

const body: TspublicRestV2MetadataFavoriteUnassignRequest = {
  tsObject: bodyTsObject,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2UnassignFavorite(body);
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


# Restapi V2 Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async restapiV2AssignHomeLiveboard(
  body: TspublicRestV2MetadataHomeliveboardAssignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHomeliveboardAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2MetadataHomeliveboardAssignRequest = {};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2AssignHomeLiveboard(body);
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


# Restapi V2 Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async restapiV2UnassignHomeLiveboard(
  body: TspublicRestV2MetadataHomeliveboardUnassignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHomeliveboardUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2MetadataHomeliveboardUnassignRequest = {};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2UnassignHomeLiveboard(body);
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


# Restapi V2 Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```ts
async restapiV2ExportObjectTML(
  body: TspublicRestV2MetadataTmlExportRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTmlExportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-export-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: TspublicRestV2MetadataTmlExportRequest = {
  id: bodyId,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2ExportObjectTML(body);
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


# Restapi V2 Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```ts
async restapiV2ImportObjectTML(
  body: TspublicRestV2MetadataTmlImportRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTmlImportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-import-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyObjectTML: string[] = ['objectTML5', 'objectTML6'];
const body: TspublicRestV2MetadataTmlImportRequest = {
  objectTML: bodyObjectTML,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2ImportObjectTML(body);
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


# Restapi V2 Delete Object

Use this endpoint to delete the metadata objects

```ts
async restapiV2DeleteObject(
  type: Type4Enum,
  id: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched |
| `id` | `string[]` | Query, Required | A JSON array of GUIDs of the objects |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const type = 'DATAOBJECT';
const Id: string[] = ['id0'];
try {
  const { result, ...httpResponse } = await metadataController.restapiV2DeleteObject(type, id);
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


# Restapi V2 Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API. Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. For example, consider a worksheet 'W1' that has a derived logical column 'C1' that has a reference to a base logical column 'C2'. This can be shown diagramatically as: W1-->C1-->C2. W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1's column C1 and C2. Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```ts
async restapiV2GetObjectDependency(
  body: TspublicRestV2MetadataDependencyRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataDependencyRequest`](../../doc/models/tspublic-rest-v2-metadata-dependency-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: TspublicRestV2MetadataDependencyRequest = {
  type: 'COLUMN',
  id: bodyId,
};

try {
  const { result, ...httpResponse } = await metadataController.restapiV2GetObjectDependency(body);
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

