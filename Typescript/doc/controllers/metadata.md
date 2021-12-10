# Metadata

```ts
const metadataController = new MetadataController(client);
```

## Class Name

`MetadataController`

## Methods

* [Get Tag](/doc/controllers/metadata.md#get-tag)
* [Create Tag](/doc/controllers/metadata.md#create-tag)
* [Update Tag](/doc/controllers/metadata.md#update-tag)
* [Delete Tag](/doc/controllers/metadata.md#delete-tag)
* [Get Object Dependency](/doc/controllers/metadata.md#get-object-dependency)
* [Assign Tag](/doc/controllers/metadata.md#assign-tag)
* [Unassign Tag](/doc/controllers/metadata.md#unassign-tag)
* [Assign Favorite](/doc/controllers/metadata.md#assign-favorite)
* [Unassign Favorite](/doc/controllers/metadata.md#unassign-favorite)
* [Get Homeliveboard](/doc/controllers/metadata.md#get-homeliveboard)
* [Assign Homeliveboard](/doc/controllers/metadata.md#assign-homeliveboard)
* [Unassign Homeliveboard](/doc/controllers/metadata.md#unassign-homeliveboard)
* [Get Incomplete Objects](/doc/controllers/metadata.md#get-incomplete-objects)
* [Get Object Header](/doc/controllers/metadata.md#get-object-header)
* [Get Object Visualization Header](/doc/controllers/metadata.md#get-object-visualization-header)
* [Get Object Detail](/doc/controllers/metadata.md#get-object-detail)
* [Export Object TML](/doc/controllers/metadata.md#export-object-tml)
* [Import Object TML](/doc/controllers/metadata.md#import-object-tml)


# Get Tag

To get details of a specific tag, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

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

[`MetadataTagResponse`](/doc/models/metadata-tag-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Create Tag

To programmatically create tags, use this endpoint

```ts
async createTag(
  body: ApiRestV2MetadataTagCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<MetadataTagResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagCreateRequest`](/doc/models/api-rest-v2-metadata-tag-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`MetadataTagResponse`](/doc/models/metadata-tag-response.md)

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2MetadataTagCreateRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Update Tag

To programmatically update tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async updateTag(
  body: ApiRestV2MetadataTagUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagUpdateRequest`](/doc/models/api-rest-v2-metadata-tag-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2MetadataTagUpdateRequest = {};

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Delete Tag

To programmatically delete tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API. Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. For example, consider a worksheet W1 that has a derived logical column C1 that has a reference to a base logical column C2. This can be shown diagramatically as: W1-->C1-->C2. W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1s column C1 and C2. Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```ts
async getObjectDependency(
  body: ApiRestV2MetadataDependencyRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataDependencyRequest`](/doc/models/api-rest-v2-metadata-dependency-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: ApiRestV2MetadataDependencyRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async assignTag(
  body: ApiRestV2MetadataTagAssignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagAssignRequest`](/doc/models/api-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyMetaObject: MetaObjectInput[] = [];

const bodymetaObject0: MetaObjectInput = {
  id: 'id6',
  type: 'ANSWER',
};

bodyMetaObject[0] = bodymetaObject0;

const bodymetaObject1: MetaObjectInput = {
  id: 'id7',
  type: 'LIVEBOARD',
};

bodyMetaObject[1] = bodymetaObject1;

const body: ApiRestV2MetadataTagAssignRequest = {
  metaObject: bodyMetaObject,
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```ts
async unassignTag(
  body: ApiRestV2MetadataTagUnassignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagUnassignRequest`](/doc/models/api-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyMetaObject: MetaObjectInput[] = [];

const bodymetaObject0: MetaObjectInput = {
  id: 'id6',
  type: 'ANSWER',
};

bodyMetaObject[0] = bodymetaObject0;

const bodymetaObject1: MetaObjectInput = {
  id: 'id7',
  type: 'LIVEBOARD',
};

bodyMetaObject[1] = bodymetaObject1;

const body: ApiRestV2MetadataTagUnassignRequest = {
  metaObject: bodyMetaObject,
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async assignFavorite(
  body: ApiRestV2MetadataFavoriteAssignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataFavoriteAssignRequest`](/doc/models/api-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyMetaObject: MetaObjectInput[] = [];

const bodymetaObject0: MetaObjectInput = {
  id: 'id6',
  type: 'ANSWER',
};

bodyMetaObject[0] = bodymetaObject0;

const bodymetaObject1: MetaObjectInput = {
  id: 'id7',
  type: 'LIVEBOARD',
};

bodyMetaObject[1] = bodymetaObject1;

const body: ApiRestV2MetadataFavoriteAssignRequest = {
  metaObject: bodyMetaObject,
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.Screen reader support enabled.

```ts
async unassignFavorite(
  body: ApiRestV2MetadataFavoriteUnassignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataFavoriteUnassignRequest`](/doc/models/api-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyMetaObject: MetaObjectInput[] = [];

const bodymetaObject0: MetaObjectInput = {
  id: 'id6',
  type: 'ANSWER',
};

bodyMetaObject[0] = bodymetaObject0;

const bodymetaObject1: MetaObjectInput = {
  id: 'id7',
  type: 'LIVEBOARD',
};

bodyMetaObject[1] = bodymetaObject1;

const body: ApiRestV2MetadataFavoriteUnassignRequest = {
  metaObject: bodyMetaObject,
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Homeliveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async getHomeliveboard(
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

[`HomeLiveboardResponse`](/doc/models/home-liveboard-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await metadataController.getHomeliveboard();
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


# Assign Homeliveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async assignHomeliveboard(
  body: ApiRestV2MetadataHomeliveboardAssignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHomeliveboardAssignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2MetadataHomeliveboardAssignRequest = {};

try {
  const { result, ...httpResponse } = await metadataController.assignHomeliveboard(body);
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


# Unassign Homeliveboard

To unassign the home liveboard set for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```ts
async unassignHomeliveboard(
  body: ApiRestV2MetadataHomeliveboardUnassignRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHomeliveboardUnassignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2MetadataHomeliveboardUnassignRequest = {};

try {
  const { result, ...httpResponse } = await metadataController.unassignHomeliveboard(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```ts
async getObjectHeader(
  body: ApiRestV2MetadataHeaderSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHeaderSearchRequest`](/doc/models/api-rest-v2-metadata-header-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2MetadataHeaderSearchRequest = {
  type: 'USER',
};

try {
  const { result, ...httpResponse } = await metadataController.getObjectHeader(body);
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


# Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer. At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Object Detail

Use this endpoint to get full details of metadata objects

```ts
async getObjectDetail(
  type: Type10Enum,
  id: string[],
  showHidden?: boolean,
  dropQuestionDetails?: boolean,
  version?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type10Enum`](/doc/models/type-10-enum.md) | Query, Required | Type of the metadata object being searched. Valid values |
| `id` | `string[]` | Query, Required | A JSON array of GUIDs of the objects. |
| `showHidden` | `boolean \| undefined` | Query, Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table. |
| `dropQuestionDetails` | `boolean \| undefined` | Query, Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for LOGICAL_TABLE data type. |
| `version` | `string \| undefined` | Query, Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. |
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```ts
async exportObjectTML(
  body: ApiRestV2MetadataTmlExportRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTmlExportRequest`](/doc/models/api-rest-v2-metadata-tml-export-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: ApiRestV2MetadataTmlExportRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```ts
async importObjectTML(
  body: ApiRestV2MetadataTmlImportRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTmlImportRequest`](/doc/models/api-rest-v2-metadata-tml-import-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyObjectTML: string[] = ['objectTML5', 'objectTML6'];
const body: ApiRestV2MetadataTmlImportRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

