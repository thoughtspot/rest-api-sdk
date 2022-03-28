# Metadata

```ts
const metadataController = new MetadataController(client);
```

## Class Name

`MetadataController`

## Methods

* [Get Tag](../../doc/controllers/metadata.md#get-tag)
* [Create Tag](../../doc/controllers/metadata.md#create-tag)
* [Update Tag](../../doc/controllers/metadata.md#update-tag)
* [Delete Tag](../../doc/controllers/metadata.md#delete-tag)
* [Assign Tag](../../doc/controllers/metadata.md#assign-tag)
* [Unassign Tag](../../doc/controllers/metadata.md#unassign-tag)
* [Assign Favorite](../../doc/controllers/metadata.md#assign-favorite)
* [Unassign Favorite](../../doc/controllers/metadata.md#unassign-favorite)
* [Get Home Liveboard](../../doc/controllers/metadata.md#get-home-liveboard)
* [Assign Home Liveboard](../../doc/controllers/metadata.md#assign-home-liveboard)
* [Unassign Home Liveboard](../../doc/controllers/metadata.md#unassign-home-liveboard)
* [Get Incomplete Objects](../../doc/controllers/metadata.md#get-incomplete-objects)
* [Get Object Header](../../doc/controllers/metadata.md#get-object-header)
* [Get Object Detail](../../doc/controllers/metadata.md#get-object-detail)
* [Get Object Visualization Header](../../doc/controllers/metadata.md#get-object-visualization-header)
* [Search Object Header](../../doc/controllers/metadata.md#search-object-header)
* [Search Object Detail](../../doc/controllers/metadata.md#search-object-detail)
* [Delete Object](../../doc/controllers/metadata.md#delete-object)
* [Get Object Dependency](../../doc/controllers/metadata.md#get-object-dependency)
* [Export Object TML](../../doc/controllers/metadata.md#export-object-tml)
* [Import Object TML](../../doc/controllers/metadata.md#import-object-tml)


# Get Tag

To get details of a specific tag, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async getTag(
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
  const { result, ...httpResponse } = await metadataController.getTag();
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


# Create Tag

To programmatically create tags, use this endpoint

Permission: Requires administration privilege

```ts
async createTag(
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
  const { result, ...httpResponse } = await metadataController.createTag(body);
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


# Update Tag

To programmatically update tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires administration privilege

```ts
async updateTag(
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
  const { result, ...httpResponse } = await metadataController.updateTag(body);
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


# Delete Tag

To programmatically delete tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires administration privilege

```ts
async deleteTag(
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
  const { result, ...httpResponse } = await metadataController.deleteTag();
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


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async assignTag(
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
  const { result, ...httpResponse } = await metadataController.assignTag(body);
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


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async unassignTag(
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
  const { result, ...httpResponse } = await metadataController.unassignTag(body);
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


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async assignFavorite(
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
  const { result, ...httpResponse } = await metadataController.assignFavorite(body);
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


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.

Permission: Requires at least view access to the object

```ts
async unassignFavorite(
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
  const { result, ...httpResponse } = await metadataController.unassignFavorite(body);
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


# Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async getHomeLiveboard(
  userName?: string,
  userId?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<HomeLiveboardResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string \| undefined` | Query, Optional | - |
| `userId` | `string \| undefined` | Query, Optional | The GUID of the user |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`HomeLiveboardResponse`](../../doc/models/home-liveboard-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await metadataController.getHomeLiveboard();
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


# Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async assignHomeLiveboard(
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
  const { result, ...httpResponse } = await metadataController.assignHomeLiveboard(body);
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


# Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async unassignHomeLiveboard(
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
  const { result, ...httpResponse } = await metadataController.unassignHomeLiveboard(body);
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


# Get Incomplete Objects

To get a list of objects with incomplete metadata, use this endpoint

```ts
async getIncompleteObjects(
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
  const { result, ...httpResponse } = await metadataController.getIncompleteObjects();
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


# Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access for other object types

```ts
async getObjectHeader(
  type: Type9Enum,
  id: string,
  outputFields?: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type9Enum`](../../doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. |
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
  const { result, ...httpResponse } = await metadataController.getObjectHeader(type, id);
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


# Get Object Detail

Use this endpoint to get full details of metadata objects.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access to other object types

```ts
async getObjectDetail(
  type: Type10Enum,
  id: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type10Enum`](../../doc/models/type-10-enum.md) | Query, Required | Type of the metadata object being searched. Valid values |
| `id` | `string[]` | Query, Required | A JSON array of GUIDs of the objects. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const type = 'DATAOBJECT';
const Id: string[] = ['id0'];
try {
  const { result, ...httpResponse } = await metadataController.getObjectDetail(type, id);
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


# Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer.

At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```ts
async getObjectVisualizationHeader(
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
  const { result, ...httpResponse } = await metadataController.getObjectVisualizationHeader(id);
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


# Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access for other object types

```ts
async searchObjectHeader(
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
  const { result, ...httpResponse } = await metadataController.searchObjectHeader(body);
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


# Search Object Detail

Use this endpoint to get full details of metadata objects.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access for other object types

```ts
async searchObjectDetail(
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
  const { result, ...httpResponse } = await metadataController.searchObjectDetail(body);
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


# Delete Object

Use this endpoint to delete the metadata objects.

Permission: Requires modify access to the object

```ts
async deleteObject(
  type: Type10Enum,
  id: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type10Enum`](../../doc/models/type-10-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `string[]` | Query, Required | A JSON array of GUIDs of the objects. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const type = 'DATAOBJECT';
const Id: string[] = ['id0'];
try {
  const { result, ...httpResponse } = await metadataController.deleteObject(type, id);
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


# Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API.

Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object.

Example:

Consider a worksheet W1 that has a derived logical column C1 that has a reference to a base logical column C2. This can be shown diagramatically as: W1-->C1-->C2.

W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1s column C1 and C2.

Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

Permission: Requires at least view access to the object

```ts
async getObjectDependency(
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
  const { result, ...httpResponse } = await metadataController.getObjectDependency(body);
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


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.

Permission: Requires at least view access to the object

```ts
async exportObjectTML(
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
  const { result, ...httpResponse } = await metadataController.exportObjectTML(body);
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


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.

Permission: Requires datamanagement privilge

```ts
async importObjectTML(
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
  const { result, ...httpResponse } = await metadataController.importObjectTML(body);
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

