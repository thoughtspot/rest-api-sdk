# Metadata

```python
metadata_controller = client.metadata
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

```python
def restapi_v_2__get_tag(self,
                        name=None,
                        id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the tag |
| `id` | `string` | Query, Optional | The GUID of the tag |

## Response Type

[`MetadataTagResponse`](../../doc/models/metadata-tag-response.md)

## Example Usage

```python
result = metadata_controller.restapi_v_2__get_tag()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Home Liveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def restapi_v_2__get_home_liveboard(self,
                                   user_name=None,
                                   user_id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Query, Optional | Name of the tag |
| `user_id` | `string` | Query, Optional | The GUID of the tag |

## Response Type

[`HomeLiveboardResponse`](../../doc/models/home-liveboard-response.md)

## Example Usage

```python
result = metadata_controller.restapi_v_2__get_home_liveboard()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```python
def restapi_v_2__search_object_header(self,
                                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHeaderSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-header-search-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2MetadataHeaderSearchRequest()
body.mtype = Type3Enum.USER

result = metadata_controller.restapi_v_2__search_object_header(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer. At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```python
def restapi_v_2__get_object_visualization_header(self,
                                                id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the liveboard or answer |

## Response Type

`List of object`

## Example Usage

```python
id = 'id0'

result = metadata_controller.restapi_v_2__get_object_visualization_header(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Detail

Use this endpoint to get full details of metadata objects

```python
def restapi_v_2__get_object_detail(self,
                                  mtype,
                                  id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mtype` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `List of string` | Query, Required | A JSON array of GUIDs of the objects. |

## Response Type

`object`

## Example Usage

```python
mtype = Type4Enum.DATAOBJECT
id = ['id0']

result = metadata_controller.restapi_v_2__get_object_detail(mtype, id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Header

To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.

```python
def restapi_v_2__get_object_header(self,
                                  mtype,
                                  id,
                                  output_fields=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mtype` | [`Type5Enum`](../../doc/models/type-5-enum.md) | Query, Required | Type of the metadata object being searched. |
| `id` | `string` | Query, Required | GUID of the metadata object |
| `output_fields` | `List of string` | Query, Optional | Array of header field names that need to be included in the header response |

## Response Type

`object`

## Example Usage

```python
mtype = Type5Enum.COLUMN_ALL
id = 'id0'

result = metadata_controller.restapi_v_2__get_object_header(mtype, id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Object Detail

Use this endpoint to get full details of metadata objects

```python
def restapi_v_2__search_object_detail(self,
                                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataDetailSearchRequest`](../../doc/models/tspublic-rest-v2-metadata-detail-search-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2MetadataDetailSearchRequest()
body.mtype = Type6Enum.USER
body.id = ['id6', 'id7']

result = metadata_controller.restapi_v_2__search_object_detail(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Tag

To programmatically create tags, use this endpoint

```python
def restapi_v_2__create_tag(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagCreateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-create-request.md) | Body, Required | - |

## Response Type

[`MetadataTagResponse`](../../doc/models/metadata-tag-response.md)

## Example Usage

```python
body = TspublicRestV2MetadataTagCreateRequest()
body.name = 'name6'

result = metadata_controller.restapi_v_2__create_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Tag

To programmatically update tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def restapi_v_2__update_tag(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagUpdateRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataTagUpdateRequest()

result = metadata_controller.restapi_v_2__update_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Tag

To programmatically delete tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def restapi_v_2__delete_tag(self,
                           name=None,
                           id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the tag |
| `id` | `string` | Query, Optional | The GUID of the tag |

## Response Type

`bool`

## Example Usage

```python
result = metadata_controller.restapi_v_2__delete_tag()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def restapi_v_2__assign_tag(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataTagAssignRequest()
body.ts_object = []

body.ts_object.append(TsObjectInput())
body.ts_object[0].id = 'id8'
body.ts_object[0].mtype = TypeEnum.DATAOBJECT

body.ts_object.append(TsObjectInput())
body.ts_object[1].id = 'id9'
body.ts_object[1].mtype = TypeEnum.CONNECTION

body.ts_object.append(TsObjectInput())
body.ts_object[2].id = 'id0'
body.ts_object[2].mtype = TypeEnum.ANSWER


result = metadata_controller.restapi_v_2__assign_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def restapi_v_2__unassign_tag(self,
                             body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTagUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataTagUnassignRequest()
body.ts_object = []

body.ts_object.append(TsObjectInput())
body.ts_object[0].id = 'id8'
body.ts_object[0].mtype = TypeEnum.DATAOBJECT

body.ts_object.append(TsObjectInput())
body.ts_object[1].id = 'id9'
body.ts_object[1].mtype = TypeEnum.CONNECTION

body.ts_object.append(TsObjectInput())
body.ts_object[2].id = 'id0'
body.ts_object[2].mtype = TypeEnum.ANSWER


result = metadata_controller.restapi_v_2__unassign_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def restapi_v_2__assign_favorite(self,
                                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataFavoriteAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataFavoriteAssignRequest()
body.ts_object = []

body.ts_object.append(TsObjectInput())
body.ts_object[0].id = 'id8'
body.ts_object[0].mtype = TypeEnum.DATAOBJECT

body.ts_object.append(TsObjectInput())
body.ts_object[1].id = 'id9'
body.ts_object[1].mtype = TypeEnum.CONNECTION

body.ts_object.append(TsObjectInput())
body.ts_object[2].id = 'id0'
body.ts_object[2].mtype = TypeEnum.ANSWER


result = metadata_controller.restapi_v_2__assign_favorite(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def restapi_v_2__unassign_favorite(self,
                                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataFavoriteUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataFavoriteUnassignRequest()
body.ts_object = []

body.ts_object.append(TsObjectInput())
body.ts_object[0].id = 'id8'
body.ts_object[0].mtype = TypeEnum.DATAOBJECT

body.ts_object.append(TsObjectInput())
body.ts_object[1].id = 'id9'
body.ts_object[1].mtype = TypeEnum.CONNECTION

body.ts_object.append(TsObjectInput())
body.ts_object[2].id = 'id0'
body.ts_object[2].mtype = TypeEnum.ANSWER


result = metadata_controller.restapi_v_2__unassign_favorite(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Home Liveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def restapi_v_2__assign_home_liveboard(self,
                                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHomeliveboardAssignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataHomeliveboardAssignRequest()

result = metadata_controller.restapi_v_2__assign_home_liveboard(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Unassign Home Liveboard

To unassign the home liveboard set for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def restapi_v_2__unassign_home_liveboard(self,
                                        body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataHomeliveboardUnassignRequest`](../../doc/models/tspublic-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2MetadataHomeliveboardUnassignRequest()

result = metadata_controller.restapi_v_2__unassign_home_liveboard(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```python
def restapi_v_2__export_object_tml(self,
                                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTmlExportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-export-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2MetadataTmlExportRequest()
body.id = ['id6', 'id7']

result = metadata_controller.restapi_v_2__export_object_tml(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```python
def restapi_v_2__import_object_tml(self,
                                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataTmlImportRequest`](../../doc/models/tspublic-rest-v2-metadata-tml-import-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2MetadataTmlImportRequest()
body.object_tml = ['objectTML5', 'objectTML6']

result = metadata_controller.restapi_v_2__import_object_tml(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Object

Use this endpoint to delete the metadata objects

```python
def restapi_v_2__delete_object(self,
                              mtype,
                              id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mtype` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Query, Required | Type of the metadata object being searched |
| `id` | `List of string` | Query, Required | A JSON array of GUIDs of the objects |

## Response Type

`bool`

## Example Usage

```python
mtype = Type4Enum.DATAOBJECT
id = ['id0']

result = metadata_controller.restapi_v_2__delete_object(mtype, id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Object Dependency

To query the details of dependent objects and associate objects as dependents, you can use this API. Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. For example, consider a worksheet 'W1' that has a derived logical column 'C1' that has a reference to a base logical column 'C2'. This can be shown diagramatically as: W1-->C1-->C2. W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1's column C1 and C2. Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1

```python
def restapi_v_2__get_object_dependency(self,
                                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MetadataDependencyRequest`](../../doc/models/tspublic-rest-v2-metadata-dependency-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2MetadataDependencyRequest()
body.mtype = Type13Enum.COLUMN
body.id = ['id6', 'id7']

result = metadata_controller.restapi_v_2__get_object_dependency(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

