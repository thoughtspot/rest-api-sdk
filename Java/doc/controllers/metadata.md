# Metadata

```java
MetadataController metadataController = client.getMetadataController();
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

[`MetadataTagResponse`](../../doc/models/metadata-tag-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Tag

To programmatically create tags, use this endpoint

Permission: Requires administration privilege

```java
CompletableFuture<MetadataTagResponse> createTagAsync(
    final TspublicRestV2MetadataTagCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagCreateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-create-request.md) | Body, Required | - |

## Response Type

[`MetadataTagResponse`](../../doc/models/metadata-tag-response.md)

## Example Usage

```java
TspublicRestV2MetadataTagCreateRequest body = new TspublicRestV2MetadataTagCreateRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Tag

To programmatically update tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires administration privilege

```java
CompletableFuture<Boolean> updateTagAsync(
    final TspublicRestV2MetadataTagUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagUpdateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataTagUpdateRequest body = new TspublicRestV2MetadataTagUpdateRequest();

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Tag

To programmatically delete tags, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires administration privilege

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```java
CompletableFuture<Boolean> assignTagAsync(
    final TspublicRestV2MetadataTagAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataTagAssignRequest body = new TspublicRestV2MetadataTagAssignRequest();
body.setTsObject(new LinkedList<>());

TsObjectInput bodyTsObject0 = new TsObjectInput();
bodyTsObject0.setId("id8");
bodyTsObject0.setType(TsObjectInputTypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TsObjectInputTypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TsObjectInputTypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.

At least one of id or name of tag is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```java
CompletableFuture<Boolean> unassignTagAsync(
    final TspublicRestV2MetadataTagUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataTagUnassignRequest body = new TspublicRestV2MetadataTagUnassignRequest();
body.setTsObject(new LinkedList<>());

TsObjectInput bodyTsObject0 = new TsObjectInput();
bodyTsObject0.setId("id8");
bodyTsObject0.setType(TsObjectInputTypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TsObjectInputTypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TsObjectInputTypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```java
CompletableFuture<Boolean> assignFavoriteAsync(
    final TspublicRestV2MetadataFavoriteAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataFavoriteAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataFavoriteAssignRequest body = new TspublicRestV2MetadataFavoriteAssignRequest();
body.setTsObject(new LinkedList<>());

TsObjectInput bodyTsObject0 = new TsObjectInput();
bodyTsObject0.setId("id8");
bodyTsObject0.setType(TsObjectInputTypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TsObjectInputTypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TsObjectInputTypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.

Permission: Requires at least view access to the object

```java
CompletableFuture<Boolean> unassignFavoriteAsync(
    final TspublicRestV2MetadataFavoriteUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataFavoriteUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataFavoriteUnassignRequest body = new TspublicRestV2MetadataFavoriteUnassignRequest();
body.setTsObject(new LinkedList<>());

TsObjectInput bodyTsObject0 = new TsObjectInput();
bodyTsObject0.setId("id8");
bodyTsObject0.setType(TsObjectInputTypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TsObjectInputTypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TsObjectInputTypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```java
CompletableFuture<HomeLiveboardResponse> getHomeLiveboardAsync(
    final String userName,
    final String userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `String` | Query, Optional | - |
| `userId` | `String` | Query, Optional | The GUID of the user |

## Response Type

[`HomeLiveboardResponse`](../../doc/models/home-liveboard-response.md)

## Example Usage

```java
metadataController.getHomeLiveboardAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```java
CompletableFuture<Boolean> assignHomeLiveboardAsync(
    final TspublicRestV2MetadataHomeliveboardAssignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHomeliveboardAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataHomeliveboardAssignRequest body = new TspublicRestV2MetadataHomeliveboardAssignRequest();

metadataController.assignHomeLiveboardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint.

At least one of user id or username is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

```java
CompletableFuture<Boolean> unassignHomeLiveboardAsync(
    final TspublicRestV2MetadataHomeliveboardUnassignRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHomeliveboardUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2MetadataHomeliveboardUnassignRequest body = new TspublicRestV2MetadataHomeliveboardUnassignRequest();

metadataController.unassignHomeLiveboardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access for other object types

```java
CompletableFuture<Object> getObjectHeaderAsync(
    final GetObjectHeaderTypeEnum type,
    final String id,
    final List<String> outputFields)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`GetObjectHeaderTypeEnum`](../../doc/models/get-object-header-type-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `String` | Query, Required | GUID of the metadata object |
| `outputFields` | `List<String>` | Query, Optional | Array of header field names that need to be included in the header response |

## Response Type

`Object`

## Example Usage

```java
GetObjectHeaderTypeEnum type = GetObjectHeaderTypeEnum.COLUMN_ALL;
String id = "id0";

metadataController.getObjectHeaderAsync(type, id, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Detail

Use this endpoint to get full details of metadata objects.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access to other object types

```java
CompletableFuture<Object> getObjectDetailAsync(
    final GetObjectDetailTypeEnum type,
    final List<String> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`GetObjectDetailTypeEnum`](../../doc/models/get-object-detail-type-enum.md) | Query, Required | Type of the metadata object being searched. Valid values |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`Object`

## Example Usage

```java
GetObjectDetailTypeEnum type = GetObjectDetailTypeEnum.DATAOBJECT;
List<String> id = new LinkedList<>();
id.add("id0");

metadataController.getObjectDetailAsync(type, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer.

At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

Permission: Requires at least view access to the object

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access for other object types

```java
CompletableFuture<Object> searchObjectHeaderAsync(
    final TspublicRestV2MetadataHeaderSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHeaderSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-header-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2MetadataHeaderSearchRequest body = new TspublicRestV2MetadataHeaderSearchRequest();
body.setType(SearchObjectHeaderTypeEnum.USER);

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Object Detail

Use this endpoint to get full details of metadata objects.

Permission: Requires administration privilege for USER and USER_GROUP type. Requires datamanagement privilege for CONNECTION type. Requires at least view access for other object types

```java
CompletableFuture<Object> searchObjectDetailAsync(
    final TspublicRestV2MetadataDetailSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataDetailSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-detail-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2MetadataDetailSearchRequest body = new TspublicRestV2MetadataDetailSearchRequest();
body.setType(SearchObjectDetailTypeEnum.USER);
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");

metadataController.searchObjectDetailAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Object

Use this endpoint to delete the metadata objects.

Permission: Requires modify access to the object

```java
CompletableFuture<Boolean> deleteObjectAsync(
    final DeleteObjectTypeEnum type,
    final List<String> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`DeleteObjectTypeEnum`](../../doc/models/delete-object-type-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`boolean`

## Example Usage

```java
DeleteObjectTypeEnum type = DeleteObjectTypeEnum.DATAOBJECT;
List<String> id = new LinkedList<>();
id.add("id0");

metadataController.deleteObjectAsync(type, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
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

Permission: Requires at least view access to the object

```java
CompletableFuture<Object> getObjectDependencyAsync(
    final TspublicRestV2MetadataDependencyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataDependencyRequest`](../../doc/models/tspublic-rest-v2-metadata-dependency-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2MetadataDependencyRequest body = new TspublicRestV2MetadataDependencyRequest();
body.setType(GetObjectDependencyTypeEnum.COLUMN);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.

Permission: Requires at least view access to the object

```java
CompletableFuture<Object> exportObjectTMLAsync(
    final TspublicRestV2MetadataTmlExportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTmlExportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-export-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2MetadataTmlExportRequest body = new TspublicRestV2MetadataTmlExportRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.

Permission: Requires datamanagement privilge

```java
CompletableFuture<Object> importObjectTMLAsync(
    final TspublicRestV2MetadataTmlImportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTmlImportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-import-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2MetadataTmlImportRequest body = new TspublicRestV2MetadataTmlImportRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

