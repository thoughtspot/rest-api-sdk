# Metadata

```java
MetadataController metadataController = client.getMetadataController();
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

```java
CompletableFuture<MetadataTagResponse> getTagAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the tag |
| `id` | `String` | Query, Optional | The GUID of the tag |

## Response Type

[`MetadataTagResponse`](/doc/models/metadata-tag-response.md)

## Example Usage

```java
metadataController.getTagAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Tag

To programmatically create tags, use this endpoint

```java
CompletableFuture<MetadataTagResponse> createTagAsync(
    final ApiRestV2MetadataTagCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagCreateRequest`](/doc/models/api-rest-v2-metadata-tag-create-request.md) | Body, Required | - |

## Response Type

[`MetadataTagResponse`](/doc/models/metadata-tag-response.md)

## Example Usage

```java
ApiRestV2MetadataTagCreateRequest body = new ApiRestV2MetadataTagCreateRequest();
body.setName("name6");

metadataController.createTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update Tag

To programmatically update tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> updateTagAsync(
    final ApiRestV2MetadataTagUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagUpdateRequest`](/doc/models/api-rest-v2-metadata-tag-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataTagUpdateRequest body = new ApiRestV2MetadataTagUpdateRequest();

metadataController.updateTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Tag

To programmatically delete tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> deleteTagAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the tag |
| `id` | `String` | Query, Optional | The GUID of the tag |

## Response Type

`boolean`

## Example Usage

```java
metadataController.deleteTagAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> assignTagAsync(
    final ApiRestV2MetadataTagAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagAssignRequest`](/doc/models/api-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataTagAssignRequest body = new ApiRestV2MetadataTagAssignRequest();
body.setMetaObject(new LinkedList<>());

MetaObjectInput bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.setId("id6");
bodyMetaObject0.setType(TypeEnum.ANSWER);
body.getMetaObject().add(bodyMetaObject0);

MetaObjectInput bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.setId("id7");
bodyMetaObject1.setType(TypeEnum.LIVEBOARD);
body.getMetaObject().add(bodyMetaObject1);


metadataController.assignTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> unassignTagAsync(
    final ApiRestV2MetadataTagUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagUnassignRequest`](/doc/models/api-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataTagUnassignRequest body = new ApiRestV2MetadataTagUnassignRequest();
body.setMetaObject(new LinkedList<>());

MetaObjectInput bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.setId("id6");
bodyMetaObject0.setType(TypeEnum.ANSWER);
body.getMetaObject().add(bodyMetaObject0);

MetaObjectInput bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.setId("id7");
bodyMetaObject1.setType(TypeEnum.LIVEBOARD);
body.getMetaObject().add(bodyMetaObject1);


metadataController.unassignTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered

```java
CompletableFuture<Boolean> assignFavoriteAsync(
    final ApiRestV2MetadataFavoriteAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataFavoriteAssignRequest`](/doc/models/api-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataFavoriteAssignRequest body = new ApiRestV2MetadataFavoriteAssignRequest();
body.setMetaObject(new LinkedList<>());

MetaObjectInput bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.setId("id6");
bodyMetaObject0.setType(TypeEnum.ANSWER);
body.getMetaObject().add(bodyMetaObject0);

MetaObjectInput bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.setId("id7");
bodyMetaObject1.setType(TypeEnum.LIVEBOARD);
body.getMetaObject().add(bodyMetaObject1);


metadataController.assignFavoriteAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.

```java
CompletableFuture<Boolean> unassignFavoriteAsync(
    final ApiRestV2MetadataFavoriteUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataFavoriteUnassignRequest`](/doc/models/api-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataFavoriteUnassignRequest body = new ApiRestV2MetadataFavoriteUnassignRequest();
body.setMetaObject(new LinkedList<>());

MetaObjectInput bodyMetaObject0 = new MetaObjectInput();
bodyMetaObject0.setId("id6");
bodyMetaObject0.setType(TypeEnum.ANSWER);
body.getMetaObject().add(bodyMetaObject0);

MetaObjectInput bodyMetaObject1 = new MetaObjectInput();
bodyMetaObject1.setId("id7");
bodyMetaObject1.setType(TypeEnum.LIVEBOARD);
body.getMetaObject().add(bodyMetaObject1);


metadataController.unassignFavoriteAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Homeliveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<HomeLiveboardResponse> getHomeliveboardAsync(
    final String userName,
    final String userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `String` | Query, Optional | - |
| `userId` | `String` | Query, Optional | The GUID of the user |

## Response Type

[`HomeLiveboardResponse`](/doc/models/home-liveboard-response.md)

## Example Usage

```java
metadataController.getHomeliveboardAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Homeliveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> assignHomeliveboardAsync(
    final ApiRestV2MetadataHomeliveboardAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHomeliveboardAssignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataHomeliveboardAssignRequest body = new ApiRestV2MetadataHomeliveboardAssignRequest();

metadataController.assignHomeliveboardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Homeliveboard

To unassign the home liveboard set for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> unassignHomeliveboardAsync(
    final ApiRestV2MetadataHomeliveboardUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHomeliveboardUnassignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2MetadataHomeliveboardUnassignRequest body = new ApiRestV2MetadataHomeliveboardUnassignRequest();

metadataController.unassignHomeliveboardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Incomplete Objects

To get a list of objects with incomplete metadata, use this endpoint

```java
CompletableFuture<Object> getIncompleteObjectsAsync()
```

## Response Type

`Object`

## Example Usage

```java
metadataController.getIncompleteObjectsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Metadata Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```java
CompletableFuture<Object> getMetadataHeaderAsync(
    final Type8Enum type,
    final String id,
    final List<String> outputFields)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type8Enum`](/doc/models/type-8-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `String` | Query, Required | GUID of the metadata object |
| `outputFields` | `List<String>` | Query, Optional | Array of header field names that need to be included in the header response |

## Response Type

`Object`

## Example Usage

```java
Type8Enum type = Type8Enum.COLUMN_ALL;
String id = "id0";

metadataController.getMetadataHeaderAsync(type, id, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Detail

Use this endpoint to get full details of metadata objects

```java
CompletableFuture<Object> getObjectDetailAsync(
    final Type9Enum type,
    final List<String> id,
    final Boolean showHidden,
    final Boolean dropQuestionDetails,
    final String version)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type9Enum`](/doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. Valid values |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the objects. |
| `showHidden` | `Boolean` | Query, Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table. |
| `dropQuestionDetails` | `Boolean` | Query, Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for LOGICAL_TABLE data type. |
| `version` | `String` | Query, Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. |

## Response Type

`Object`

## Example Usage

```java
Type9Enum type = Type9Enum.DATAOBJECT;
List<String> id = new LinkedList<>();
id.add("id0");

metadataController.getObjectDetailAsync(type, id, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer.

At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```java
CompletableFuture<List<Object>> getObjectVisualizationHeaderAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the liveboard or answer |

## Response Type

`List<Object>`

## Example Usage

```java
String id = "id0";

metadataController.getObjectVisualizationHeaderAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```java
CompletableFuture<Object> searchObjectHeaderAsync(
    final ApiRestV2MetadataHeaderSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHeaderSearchRequest`](/doc/models/api-rest-v2-metadata-header-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2MetadataHeaderSearchRequest body = new ApiRestV2MetadataHeaderSearchRequest();
body.setType(Type10Enum.USER);

metadataController.searchObjectHeaderAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Metadata Object

Use this endpoint to delete the metadata objects

```java
CompletableFuture<Boolean> deleteMetadataObjectAsync(
    final Type9Enum type,
    final List<String> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type9Enum`](/doc/models/type-9-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`boolean`

## Example Usage

```java
Type9Enum type = Type9Enum.DATAOBJECT;
List<String> id = new LinkedList<>();
id.add("id0");

metadataController.deleteMetadataObjectAsync(type, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
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

```java
CompletableFuture<Object> getObjectDependencyAsync(
    final ApiRestV2MetadataDependencyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataDependencyRequest`](/doc/models/api-rest-v2-metadata-dependency-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2MetadataDependencyRequest body = new ApiRestV2MetadataDependencyRequest();
body.setType(Type12Enum.COLUMN);
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");

metadataController.getObjectDependencyAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```java
CompletableFuture<Object> exportObjectTMLAsync(
    final ApiRestV2MetadataTmlExportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTmlExportRequest`](/doc/models/api-rest-v2-metadata-tml-export-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2MetadataTmlExportRequest body = new ApiRestV2MetadataTmlExportRequest();
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");

metadataController.exportObjectTMLAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```java
CompletableFuture<Object> importObjectTMLAsync(
    final ApiRestV2MetadataTmlImportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTmlImportRequest`](/doc/models/api-rest-v2-metadata-tml-import-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2MetadataTmlImportRequest body = new ApiRestV2MetadataTmlImportRequest();
body.setObjectTML(new LinkedList<>());
body.getObjectTML().add("objectTML5");
body.getObjectTML().add("objectTML6");

metadataController.importObjectTMLAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

