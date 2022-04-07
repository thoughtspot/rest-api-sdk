# Metadata

```csharp
MetadataController metadataController = client.MetadataController;
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

```csharp
GetTagAsync(
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
    MetadataTagResponse result = await metadataController.GetTagAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Tag

To programmatically create tags, use this endpoint

```csharp
CreateTagAsync(
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
    MetadataTagResponse result = await metadataController.CreateTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Tag

To programmatically update tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
UpdateTagAsync(
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
    bool? result = await metadataController.UpdateTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Tag

To programmatically delete tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
DeleteTagAsync(
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
    bool? result = await metadataController.DeleteTagAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
AssignTagAsync(
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
    bool? result = await metadataController.AssignTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
UnassignTagAsync(
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
    bool? result = await metadataController.UnassignTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered

```csharp
AssignFavoriteAsync(
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
    bool? result = await metadataController.AssignFavoriteAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.

```csharp
UnassignFavoriteAsync(
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
    bool? result = await metadataController.UnassignFavoriteAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```csharp
GetHomeLiveboardAsync(
    string userName = null,
    string userId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Query, Optional | - |
| `userId` | `string` | Query, Optional | The GUID of the user |

## Response Type

[`Task<Models.HomeLiveboardResponse>`](../../doc/models/home-liveboard-response.md)

## Example Usage

```csharp
try
{
    HomeLiveboardResponse result = await metadataController.GetHomeLiveboardAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```csharp
AssignHomeLiveboardAsync(
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
    bool? result = await metadataController.AssignHomeLiveboardAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```csharp
UnassignHomeLiveboardAsync(
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
    bool? result = await metadataController.UnassignHomeLiveboardAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Incomplete Objects

To get a list of objects with incomplete metadata, use this endpoint

```csharp
GetIncompleteObjectsAsync()
```

## Response Type

`Task<object>`

## Example Usage

```csharp
try
{
    object result = await metadataController.GetIncompleteObjectsAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```csharp
GetObjectHeaderAsync(
    Models.Type8Enum type,
    string id,
    List<string> outputFields = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type8Enum`](../../doc/models/type-8-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `string` | Query, Required | GUID of the metadata object |
| `outputFields` | `List<string>` | Query, Optional | Array of header field names that need to be included in the header response |

## Response Type

`Task<object>`

## Example Usage

```csharp
Type8Enum type = Type8Enum.COLUMNALL;
string id = "id0";

try
{
    object result = await metadataController.GetObjectHeaderAsync(type, id, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Detail

Use this endpoint to get full details of metadata objects

```csharp
GetObjectDetailAsync(
    Models.Type9Enum type,
    List<string> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type9Enum`](../../doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. Valid values |
| `id` | `List<string>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`Task<object>`

## Example Usage

```csharp
Type9Enum type = Type9Enum.DATAOBJECT;
var id = new List<string>();
id.Add("id0");

try
{
    object result = await metadataController.GetObjectDetailAsync(type, id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer.

At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```csharp
GetObjectVisualizationHeaderAsync(
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
    object result = await metadataController.GetObjectVisualizationHeaderAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```csharp
SearchObjectHeaderAsync(
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
body.Type = Type10Enum.USER;

try
{
    object result = await metadataController.SearchObjectHeaderAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Object Detail

Use this endpoint to get full details of metadata objects

```csharp
SearchObjectDetailAsync(
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
body.Type = Type11Enum.USER;
body.Id = new List<string>();
body.Id.Add("id6");
body.Id.Add("id7");

try
{
    object result = await metadataController.SearchObjectDetailAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Object

Use this endpoint to delete the metadata objects

```csharp
DeleteObjectAsync(
    Models.Type9Enum type,
    List<string> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type9Enum`](../../doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `List<string>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`Task<bool>`

## Example Usage

```csharp
Type9Enum type = Type9Enum.DATAOBJECT;
var id = new List<string>();
id.Add("id0");

try
{
    bool? result = await metadataController.DeleteObjectAsync(type, id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API.

Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object.

Example:

Consider a worksheet W1 that has a derived logical column C1 that has a reference to a base logical column C2. This can be shown diagramatically as: W1-->C1-->C2.

W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1s column C1 and C2.

Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```csharp
GetObjectDependencyAsync(
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
    object result = await metadataController.GetObjectDependencyAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```csharp
ExportObjectTMLAsync(
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
    object result = await metadataController.ExportObjectTMLAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```csharp
ImportObjectTMLAsync(
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
    object result = await metadataController.ImportObjectTMLAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

