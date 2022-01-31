# Metadata

```csharp
MetadataController metadataController = client.MetadataController;
```

## Class Name

`MetadataController`

## Methods

* [Get Tag](/doc/controllers/metadata.md#get-tag)
* [Create Tag](/doc/controllers/metadata.md#create-tag)
* [Update Tag](/doc/controllers/metadata.md#update-tag)
* [Delete Tag](/doc/controllers/metadata.md#delete-tag)
* [Assign Tag](/doc/controllers/metadata.md#assign-tag)
* [Unassign Tag](/doc/controllers/metadata.md#unassign-tag)
* [Assign Favorite](/doc/controllers/metadata.md#assign-favorite)
* [Unassign Favorite](/doc/controllers/metadata.md#unassign-favorite)
* [Get Homeliveboard](/doc/controllers/metadata.md#get-homeliveboard)
* [Assign Homeliveboard](/doc/controllers/metadata.md#assign-homeliveboard)
* [Unassign Homeliveboard](/doc/controllers/metadata.md#unassign-homeliveboard)
* [Get Incomplete Objects](/doc/controllers/metadata.md#get-incomplete-objects)
* [Get Metadata Header](/doc/controllers/metadata.md#get-metadata-header)
* [Get Object Detail](/doc/controllers/metadata.md#get-object-detail)
* [Get Object Visualization Header](/doc/controllers/metadata.md#get-object-visualization-header)
* [Search Object Header](/doc/controllers/metadata.md#search-object-header)
* [Delete Metadata Object](/doc/controllers/metadata.md#delete-metadata-object)
* [Get Object Dependency](/doc/controllers/metadata.md#get-object-dependency)
* [Export Object TML](/doc/controllers/metadata.md#export-object-tml)
* [Import Object TML](/doc/controllers/metadata.md#import-object-tml)


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

[`Task<Models.MetadataTagResponse>`](/doc/models/metadata-tag-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Tag

To programmatically create tags, use this endpoint

```csharp
CreateTagAsync(
    Models.ApiRestV2MetadataTagCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataTagCreateRequest`](/doc/models/api-rest-v2-metadata-tag-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.MetadataTagResponse>`](/doc/models/metadata-tag-response.md)

## Example Usage

```csharp
var body = new ApiRestV2MetadataTagCreateRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update Tag

To programmatically update tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
UpdateTagAsync(
    Models.ApiRestV2MetadataTagUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataTagUpdateRequest`](/doc/models/api-rest-v2-metadata-tag-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataTagUpdateRequest();

try
{
    bool? result = await metadataController.UpdateTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
AssignTagAsync(
    Models.ApiRestV2MetadataTagAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataTagAssignRequest`](/doc/models/api-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataTagAssignRequest();
body.MetaObject = new List<MetaObjectInput>();

var bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.Id = "id6";
bodyMetaObject0.Type = TypeEnum.ANSWER;
body.MetaObject.Add(bodyMetaObject0);

var bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.Id = "id7";
bodyMetaObject1.Type = TypeEnum.LIVEBOARD;
body.MetaObject.Add(bodyMetaObject1);


try
{
    bool? result = await metadataController.AssignTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```csharp
UnassignTagAsync(
    Models.ApiRestV2MetadataTagUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataTagUnassignRequest`](/doc/models/api-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataTagUnassignRequest();
body.MetaObject = new List<MetaObjectInput>();

var bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.Id = "id6";
bodyMetaObject0.Type = TypeEnum.ANSWER;
body.MetaObject.Add(bodyMetaObject0);

var bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.Id = "id7";
bodyMetaObject1.Type = TypeEnum.LIVEBOARD;
body.MetaObject.Add(bodyMetaObject1);


try
{
    bool? result = await metadataController.UnassignTagAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered

```csharp
AssignFavoriteAsync(
    Models.ApiRestV2MetadataFavoriteAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataFavoriteAssignRequest`](/doc/models/api-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataFavoriteAssignRequest();
body.MetaObject = new List<MetaObjectInput>();

var bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.Id = "id6";
bodyMetaObject0.Type = TypeEnum.ANSWER;
body.MetaObject.Add(bodyMetaObject0);

var bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.Id = "id7";
bodyMetaObject1.Type = TypeEnum.LIVEBOARD;
body.MetaObject.Add(bodyMetaObject1);


try
{
    bool? result = await metadataController.AssignFavoriteAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.

```csharp
UnassignFavoriteAsync(
    Models.ApiRestV2MetadataFavoriteUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataFavoriteUnassignRequest`](/doc/models/api-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataFavoriteUnassignRequest();
body.MetaObject = new List<MetaObjectInput>();

var bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.Id = "id6";
bodyMetaObject0.Type = TypeEnum.ANSWER;
body.MetaObject.Add(bodyMetaObject0);

var bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.Id = "id7";
bodyMetaObject1.Type = TypeEnum.LIVEBOARD;
body.MetaObject.Add(bodyMetaObject1);


try
{
    bool? result = await metadataController.UnassignFavoriteAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Homeliveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```csharp
GetHomeliveboardAsync(
    string userName = null,
    string userId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Query, Optional | - |
| `userId` | `string` | Query, Optional | The GUID of the user |

## Response Type

[`Task<Models.HomeLiveboardResponse>`](/doc/models/home-liveboard-response.md)

## Example Usage

```csharp
try
{
    HomeLiveboardResponse result = await metadataController.GetHomeliveboardAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Homeliveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```csharp
AssignHomeliveboardAsync(
    Models.ApiRestV2MetadataHomeliveboardAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataHomeliveboardAssignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataHomeliveboardAssignRequest();

try
{
    bool? result = await metadataController.AssignHomeliveboardAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Homeliveboard

To unassign the home liveboard set for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```csharp
UnassignHomeliveboardAsync(
    Models.ApiRestV2MetadataHomeliveboardUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataHomeliveboardUnassignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataHomeliveboardUnassignRequest();

try
{
    bool? result = await metadataController.UnassignHomeliveboardAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Metadata Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```csharp
GetMetadataHeaderAsync(
    Models.Type8Enum type,
    string id,
    List<string> outputFields = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type8Enum`](/doc/models/type-8-enum.md) | Query, Required | Type of the metadata object being searched. |
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
    object result = await metadataController.GetMetadataHeaderAsync(type, id, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Detail

Use this endpoint to get full details of metadata objects

```csharp
GetObjectDetailAsync(
    Models.Type9Enum type,
    List<string> id,
    bool? showHidden = null,
    bool? dropQuestionDetails = null,
    string version = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type9Enum`](/doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. Valid values |
| `id` | `List<string>` | Query, Required | A JSON array of GUIDs of the objects. |
| `showHidden` | `bool?` | Query, Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table. |
| `dropQuestionDetails` | `bool?` | Query, Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for LOGICAL_TABLE data type. |
| `version` | `string` | Query, Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. |

## Response Type

`Task<object>`

## Example Usage

```csharp
Type9Enum type = Type9Enum.DATAOBJECT;
var id = new List<string>();
id.Add("id0");

try
{
    object result = await metadataController.GetObjectDetailAsync(type, id, null, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```csharp
SearchObjectHeaderAsync(
    Models.ApiRestV2MetadataHeaderSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataHeaderSearchRequest`](/doc/models/api-rest-v2-metadata-header-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataHeaderSearchRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Metadata Object

Use this endpoint to delete the metadata objects

```csharp
DeleteMetadataObjectAsync(
    Models.Type9Enum type,
    List<string> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Models.Type9Enum`](/doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. |
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
    bool? result = await metadataController.DeleteMetadataObjectAsync(type, id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API.

Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object.

Example:

Consider a worksheet W1 that has a derived logical column C1 that has a reference to a base logical column C2. This can be shown diagramatically as: W1-->C1-->C2.

W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1s column C1 and C2.

Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```csharp
GetObjectDependencyAsync(
    Models.ApiRestV2MetadataDependencyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataDependencyRequest`](/doc/models/api-rest-v2-metadata-dependency-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataDependencyRequest();
body.Type = Type12Enum.COLUMN;
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```csharp
ExportObjectTMLAsync(
    Models.ApiRestV2MetadataTmlExportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataTmlExportRequest`](/doc/models/api-rest-v2-metadata-tml-export-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataTmlExportRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```csharp
ImportObjectTMLAsync(
    Models.ApiRestV2MetadataTmlImportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2MetadataTmlImportRequest`](/doc/models/api-rest-v2-metadata-tml-import-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2MetadataTmlImportRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

