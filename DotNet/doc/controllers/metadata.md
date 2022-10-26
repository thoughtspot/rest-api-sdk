# Metadata

```csharp
MetadataController metadataController = client.MetadataController;
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

```csharp
RestapiV2GetTagAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the tag |
| `id` | `string` | Query, Optional | The GUID of the tag |

## Response Type

[`Task<Models.MetadataTagResponse>`](../../doc/models/metadata-tag-response.md)

## Example Usage

```csharp
try
{
    MetadataTagResponse result = await metadataController.RestapiV2GetTagAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```csharp
RestapiV2GetHomeLiveboardAsync(
    string userName = null,
    string userId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Query, Optional | Name of the tag |
| `userId` | `string` | Query, Optional | The GUID of the tag |

## Response Type

[`Task<Models.HomeLiveboardResponse>`](../../doc/models/home-liveboard-response.md)

## Example Usage

```csharp
try
{
    HomeLiveboardResponse result = await metadataController.RestapiV2GetHomeLiveboardAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```csharp
RestapiV2SearchObjectHeaderAsync(
    Models.TspublicRestV2MetadataHeaderSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataHeaderSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-header-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataHeaderSearchRequest();
body.Type = Type3Enum.USER;

try
{
    object result = await metadataController.RestapiV2SearchObjectHeaderAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer. At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```csharp
RestapiV2GetObjectVisualizationHeaderAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the liveboard or answer |

## Response Type

`Task<object>`

## Example Usage

```csharp
string id = "id0";

try
{
    object result = await metadataController.RestapiV2GetObjectVisualizationHeaderAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Detail

Use this endpoint to get full details of metadata objects

```csharp
RestapiV2GetObjectDetailAsync(
    Models.Type4Enum type,
    List<string> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `List<string>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`Task<object>`

## Example Usage

```csharp
Type4Enum type = Type4Enum.DATAOBJECT;
var id = new List<string>();
id.Add("id0");

try
{
    object result = await metadataController.RestapiV2GetObjectDetailAsync(type, id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```csharp
RestapiV2GetObjectHeaderAsync(
    Models.Type5Enum type,
    string id,
    List<string> outputFields = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type5Enum`](../../doc/models/type-5-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `string` | Query, Required | GUID of the metadata object |
| `outputFields` | `List<string>` | Query, Optional | Array of header field names that need to be included in the header response |

## Response Type

`Task<object>`

## Example Usage

```csharp
Type5Enum type = Type5Enum.COLUMNALL;
string id = "id0";

try
{
    object result = await metadataController.RestapiV2GetObjectHeaderAsync(type, id, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Object Detail

Use this endpoint to get full details of metadata objects

```csharp
RestapiV2SearchObjectDetailAsync(
    Models.TspublicRestV2MetadataDetailSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataDetailSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-detail-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataDetailSearchRequest();
body.Type = Type6Enum.USER;
body.Id = new List<string>();
body.Id.Add("id6");
body.Id.Add("id7");

try
{
    object result = await metadataController.RestapiV2SearchObjectDetailAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Tag

To programmatically create tags, use this endpoint

```csharp
RestapiV2CreateTagAsync(
    Models.TspublicRestV2MetadataTagCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataTagCreateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.MetadataTagResponse>`](../../doc/models/metadata-tag-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2MetadataTagCreateRequest();
body.Name = "name6";

try
{
    MetadataTagResponse result = await metadataController.RestapiV2CreateTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Tag

To programmatically update tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
RestapiV2UpdateTagAsync(
    Models.TspublicRestV2MetadataTagUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataTagUpdateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataTagUpdateRequest();

try
{
    bool? result = await metadataController.RestapiV2UpdateTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Tag

To programmatically delete tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
RestapiV2DeleteTagAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the tag |
| `id` | `string` | Query, Optional | The GUID of the tag |

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await metadataController.RestapiV2DeleteTagAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
RestapiV2AssignTagAsync(
    Models.TspublicRestV2MetadataTagAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataTagAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataTagAssignRequest();
body.TsObject = new List<TsObjectInput>();

var bodyTsObject0 = new TsObjectInput();
bodyTsObject0.Id = "id8";
bodyTsObject0.Type = TypeEnum.DATAOBJECT;
body.TsObject.Add(bodyTsObject0);

var bodyTsObject1 = new TsObjectInput();
bodyTsObject1.Id = "id9";
bodyTsObject1.Type = TypeEnum.CONNECTION;
body.TsObject.Add(bodyTsObject1);

var bodyTsObject2 = new TsObjectInput();
bodyTsObject2.Id = "id0";
bodyTsObject2.Type = TypeEnum.ANSWER;
body.TsObject.Add(bodyTsObject2);


try
{
    bool? result = await metadataController.RestapiV2AssignTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
RestapiV2UnassignTagAsync(
    Models.TspublicRestV2MetadataTagUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataTagUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataTagUnassignRequest();
body.TsObject = new List<TsObjectInput>();

var bodyTsObject0 = new TsObjectInput();
bodyTsObject0.Id = "id8";
bodyTsObject0.Type = TypeEnum.DATAOBJECT;
body.TsObject.Add(bodyTsObject0);

var bodyTsObject1 = new TsObjectInput();
bodyTsObject1.Id = "id9";
bodyTsObject1.Type = TypeEnum.CONNECTION;
body.TsObject.Add(bodyTsObject1);

var bodyTsObject2 = new TsObjectInput();
bodyTsObject2.Id = "id0";
bodyTsObject2.Type = TypeEnum.ANSWER;
body.TsObject.Add(bodyTsObject2);


try
{
    bool? result = await metadataController.RestapiV2UnassignTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```csharp
RestapiV2AssignFavoriteAsync(
    Models.TspublicRestV2MetadataFavoriteAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataFavoriteAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataFavoriteAssignRequest();
body.TsObject = new List<TsObjectInput>();

var bodyTsObject0 = new TsObjectInput();
bodyTsObject0.Id = "id8";
bodyTsObject0.Type = TypeEnum.DATAOBJECT;
body.TsObject.Add(bodyTsObject0);

var bodyTsObject1 = new TsObjectInput();
bodyTsObject1.Id = "id9";
bodyTsObject1.Type = TypeEnum.CONNECTION;
body.TsObject.Add(bodyTsObject1);

var bodyTsObject2 = new TsObjectInput();
bodyTsObject2.Id = "id0";
bodyTsObject2.Type = TypeEnum.ANSWER;
body.TsObject.Add(bodyTsObject2);


try
{
    bool? result = await metadataController.RestapiV2AssignFavoriteAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```csharp
RestapiV2UnassignFavoriteAsync(
    Models.TspublicRestV2MetadataFavoriteUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataFavoriteUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataFavoriteUnassignRequest();
body.TsObject = new List<TsObjectInput>();

var bodyTsObject0 = new TsObjectInput();
bodyTsObject0.Id = "id8";
bodyTsObject0.Type = TypeEnum.DATAOBJECT;
body.TsObject.Add(bodyTsObject0);

var bodyTsObject1 = new TsObjectInput();
bodyTsObject1.Id = "id9";
bodyTsObject1.Type = TypeEnum.CONNECTION;
body.TsObject.Add(bodyTsObject1);

var bodyTsObject2 = new TsObjectInput();
bodyTsObject2.Id = "id0";
bodyTsObject2.Type = TypeEnum.ANSWER;
body.TsObject.Add(bodyTsObject2);


try
{
    bool? result = await metadataController.RestapiV2UnassignFavoriteAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```csharp
RestapiV2AssignHomeLiveboardAsync(
    Models.TspublicRestV2MetadataHomeliveboardAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataHomeliveboardAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataHomeliveboardAssignRequest();

try
{
    bool? result = await metadataController.RestapiV2AssignHomeLiveboardAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```csharp
RestapiV2UnassignHomeLiveboardAsync(
    Models.TspublicRestV2MetadataHomeliveboardUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataHomeliveboardUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataHomeliveboardUnassignRequest();

try
{
    bool? result = await metadataController.RestapiV2UnassignHomeLiveboardAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```csharp
RestapiV2ExportObjectTMLAsync(
    Models.TspublicRestV2MetadataTmlExportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataTmlExportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-export-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataTmlExportRequest();
body.Id = new List<string>();
body.Id.Add("id6");
body.Id.Add("id7");

try
{
    object result = await metadataController.RestapiV2ExportObjectTMLAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```csharp
RestapiV2ImportObjectTMLAsync(
    Models.TspublicRestV2MetadataTmlImportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataTmlImportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-import-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataTmlImportRequest();
body.ObjectTML = new List<string>();
body.ObjectTML.Add("objectTML5");
body.ObjectTML.Add("objectTML6");

try
{
    object result = await metadataController.RestapiV2ImportObjectTMLAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Object

Use this endpoint to delete the metadata objects

```csharp
RestapiV2DeleteObjectAsync(
    Models.Type4Enum type,
    List<string> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched |
| `id` | `List<string>` | Query, Required | A JSON array of GUIDs of the objects |

## Response Type

`Task<bool>`

## Example Usage

```csharp
Type4Enum type = Type4Enum.DATAOBJECT;
var id = new List<string>();
id.Add("id0");

try
{
    bool? result = await metadataController.RestapiV2DeleteObjectAsync(type, id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API. Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. For example, consider a worksheet 'W1' that has a derived logical column 'C1' that has a reference to a base logical column 'C2'. This can be shown diagramatically as: W1-->C1-->C2. W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1's column C1 and C2. Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```csharp
RestapiV2GetObjectDependencyAsync(
    Models.TspublicRestV2MetadataDependencyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MetadataDependencyRequest`](../../doc/models/tspublic-rest-v2-metadata-dependency-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2MetadataDependencyRequest();
body.Type = Type13Enum.COLUMN;
body.Id = new List<string>();
body.Id.Add("id6");
body.Id.Add("id7");

try
{
    object result = await metadataController.RestapiV2GetObjectDependencyAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

