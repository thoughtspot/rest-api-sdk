# Metadata

```java
MetadataController metadataController = client.getMetadataController();
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

```java
CompletableFuture<MetadataTagResponse> restapiV2GetTagAsync(
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
metadataController.restapiV2GetTagAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<HomeLiveboardResponse> restapiV2GetHomeLiveboardAsync(
    final String userName,
    final String userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `String` | Query, Optional | Name of the tag |
| `userId` | `String` | Query, Optional | The GUID of the tag |

## Response Type

[`HomeLiveboardResponse`](../../doc/models/home-liveboard-response.md)

## Example Usage

```java
metadataController.restapiV2GetHomeLiveboardAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```java
CompletableFuture<Object> restapiV2SearchObjectHeaderAsync(
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
body.setType(Type3Enum.USER);

metadataController.restapiV2SearchObjectHeaderAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer. At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```java
CompletableFuture<List<Object>> restapiV2GetObjectVisualizationHeaderAsync(
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

metadataController.restapiV2GetObjectVisualizationHeaderAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Detail

Use this endpoint to get full details of metadata objects

```java
CompletableFuture<Object> restapiV2GetObjectDetailAsync(
    final Type4Enum type,
    final List<String> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`Object`

## Example Usage

```java
Type4Enum type = Type4Enum.DATAOBJECT;
List<String> id = new LinkedList<>();
id.add("id0");

metadataController.restapiV2GetObjectDetailAsync(type, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```java
CompletableFuture<Object> restapiV2GetObjectHeaderAsync(
    final Type5Enum type,
    final String id,
    final List<String> outputFields)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type5Enum`](../../doc/models/type-5-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `String` | Query, Required | GUID of the metadata object |
| `outputFields` | `List<String>` | Query, Optional | Array of header field names that need to be included in the header response |

## Response Type

`Object`

## Example Usage

```java
Type5Enum type = Type5Enum.COLUMN_ALL;
String id = "id0";

metadataController.restapiV2GetObjectHeaderAsync(type, id, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Object Detail

Use this endpoint to get full details of metadata objects

```java
CompletableFuture<Object> restapiV2SearchObjectDetailAsync(
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
body.setType(Type6Enum.USER);
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");

metadataController.restapiV2SearchObjectDetailAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Tag

To programmatically create tags, use this endpoint

```java
CompletableFuture<MetadataTagResponse> restapiV2CreateTagAsync(
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

metadataController.restapiV2CreateTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Tag

To programmatically update tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2UpdateTagAsync(
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

metadataController.restapiV2UpdateTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Tag

To programmatically delete tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2DeleteTagAsync(
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
metadataController.restapiV2DeleteTagAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2AssignTagAsync(
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
bodyTsObject0.setType(TypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


metadataController.restapiV2AssignTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2UnassignTagAsync(
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
bodyTsObject0.setType(TypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


metadataController.restapiV2UnassignTagAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2AssignFavoriteAsync(
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
bodyTsObject0.setType(TypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


metadataController.restapiV2AssignFavoriteAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2UnassignFavoriteAsync(
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
bodyTsObject0.setType(TypeEnum.DATAOBJECT);
body.getTsObject().add(bodyTsObject0);

TsObjectInput bodyTsObject1 = new TsObjectInput();
bodyTsObject1.setId("id9");
bodyTsObject1.setType(TypeEnum.CONNECTION);
body.getTsObject().add(bodyTsObject1);

TsObjectInput bodyTsObject2 = new TsObjectInput();
bodyTsObject2.setId("id0");
bodyTsObject2.setType(TypeEnum.ANSWER);
body.getTsObject().add(bodyTsObject2);


metadataController.restapiV2UnassignFavoriteAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2AssignHomeLiveboardAsync(
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

metadataController.restapiV2AssignHomeLiveboardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```java
CompletableFuture<Boolean> restapiV2UnassignHomeLiveboardAsync(
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

metadataController.restapiV2UnassignHomeLiveboardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```java
CompletableFuture<Object> restapiV2ExportObjectTMLAsync(
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

metadataController.restapiV2ExportObjectTMLAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```java
CompletableFuture<Object> restapiV2ImportObjectTMLAsync(
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

metadataController.restapiV2ImportObjectTMLAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Object

Use this endpoint to delete the metadata objects

```java
CompletableFuture<Boolean> restapiV2DeleteObjectAsync(
    final Type4Enum type,
    final List<String> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the objects |

## Response Type

`boolean`

## Example Usage

```java
Type4Enum type = Type4Enum.DATAOBJECT;
List<String> id = new LinkedList<>();
id.add("id0");

metadataController.restapiV2DeleteObjectAsync(type, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API. Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. For example, consider a worksheet 'W1' that has a derived logical column 'C1' that has a reference to a base logical column 'C2'. This can be shown diagramatically as: W1-->C1-->C2. W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1's column C1 and C2. Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```java
CompletableFuture<Object> restapiV2GetObjectDependencyAsync(
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
body.setType(Type13Enum.COLUMN);
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");

metadataController.restapiV2GetObjectDependencyAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

