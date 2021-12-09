# Metadata

```python
metadata_controller = client.metadata
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
* [Get Object Header](/doc/controllers/metadata.md#get-object-header)
* [Get Object Visualization Header](/doc/controllers/metadata.md#get-object-visualization-header)
* [Get Object Detail](/doc/controllers/metadata.md#get-object-detail)
* [Export Object TML](/doc/controllers/metadata.md#export-object-tml)
* [Import Object TML](/doc/controllers/metadata.md#import-object-tml)


# Get Tag

To get details of a specific tag, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def get_tag(self,
           name=None,
           id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the tag |
| `id` | `string` | Query, Optional | The GUID of the tag |

## Response Type

[`MetadataTagResponse`](/doc/models/metadata-tag-response.md)

## Example Usage

```python
result = metadata_controller.get_tag()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Tag

To programmatically create tags, use this endpoint

```python
def create_tag(self,
              body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagCreateRequest`](/doc/models/api-rest-v2-metadata-tag-create-request.md) | Body, Required | - |

## Response Type

[`MetadataTagResponse`](/doc/models/metadata-tag-response.md)

## Example Usage

```python
body = ApiRestV2MetadataTagCreateRequest()
body.name = 'name6'

result = metadata_controller.create_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update Tag

To programmatically update tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def update_tag(self,
              body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagUpdateRequest`](/doc/models/api-rest-v2-metadata-tag-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataTagUpdateRequest()

result = metadata_controller.update_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Tag

To programmatically delete tags, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def delete_tag(self,
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
result = metadata_controller.delete_tag()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Tag

To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def assign_tag(self,
              body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagAssignRequest`](/doc/models/api-rest-v2-metadata-tag-assign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataTagAssignRequest()
body.meta_object = []

body.meta_object.append(MetaObjectInput())
body.meta_object[0].id = 'id6'
body.meta_object[0].mtype = TypeEnum.ANSWER

body.meta_object.append(MetaObjectInput())
body.meta_object[1].id = 'id7'
body.meta_object[1].mtype = TypeEnum.LIVEBOARD


result = metadata_controller.assign_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Tag

To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are given, then id will be considered.

```python
def unassign_tag(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTagUnassignRequest`](/doc/models/api-rest-v2-metadata-tag-unassign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataTagUnassignRequest()
body.meta_object = []

body.meta_object.append(MetaObjectInput())
body.meta_object[0].id = 'id6'
body.meta_object[0].mtype = TypeEnum.ANSWER

body.meta_object.append(MetaObjectInput())
body.meta_object[1].id = 'id7'
body.meta_object[1].mtype = TypeEnum.LIVEBOARD


result = metadata_controller.unassign_tag(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Favorite

To programmatically assign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def assign_favorite(self,
                   body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataFavoriteAssignRequest`](/doc/models/api-rest-v2-metadata-favorite-assign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataFavoriteAssignRequest()
body.meta_object = []

body.meta_object.append(MetaObjectInput())
body.meta_object[0].id = 'id6'
body.meta_object[0].mtype = TypeEnum.ANSWER

body.meta_object.append(MetaObjectInput())
body.meta_object[1].id = 'id7'
body.meta_object[1].mtype = TypeEnum.LIVEBOARD


result = metadata_controller.assign_favorite(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Favorite

To programmatically unassign objects to favorites for a given user account, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.Screen reader support enabled.

```python
def unassign_favorite(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataFavoriteUnassignRequest`](/doc/models/api-rest-v2-metadata-favorite-unassign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataFavoriteUnassignRequest()
body.meta_object = []

body.meta_object.append(MetaObjectInput())
body.meta_object[0].id = 'id6'
body.meta_object[0].mtype = TypeEnum.ANSWER

body.meta_object.append(MetaObjectInput())
body.meta_object[1].id = 'id7'
body.meta_object[1].mtype = TypeEnum.LIVEBOARD


result = metadata_controller.unassign_favorite(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Homeliveboard

To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def get_homeliveboard(self,
                     user_name=None,
                     user_id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Query, Optional | - |
| `user_id` | `string` | Query, Optional | The GUID of the user |

## Response Type

[`HomeLiveboardResponse`](/doc/models/home-liveboard-response.md)

## Example Usage

```python
result = metadata_controller.get_homeliveboard()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Assign Homeliveboard

To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def assign_homeliveboard(self,
                        body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHomeliveboardAssignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-assign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataHomeliveboardAssignRequest()

result = metadata_controller.assign_homeliveboard(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Unassign Homeliveboard

To unassign the home liveboard set for a user, use this endpoint. At least one of user id or username is required. When both are given, then id will be considered.

```python
def unassign_homeliveboard(self,
                          body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHomeliveboardUnassignRequest`](/doc/models/api-rest-v2-metadata-homeliveboard-unassign-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2MetadataHomeliveboardUnassignRequest()

result = metadata_controller.unassign_homeliveboard(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Incomplete Objects

To get a list of objects with incomplete metadata, use this endpoint

```python
def get_incomplete_objects(self)
```

## Response Type

`object`

## Example Usage

```python
result = metadata_controller.get_incomplete_objects()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Header

To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.

```python
def get_object_header(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataHeadersRequest`](/doc/models/api-rest-v2-metadata-headers-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = ApiRestV2MetadataHeadersRequest()
body.mtype = Type8Enum.USER

result = metadata_controller.get_object_header(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Visualization Header

Use this endpoint to get header details of visualization charts for a given liveboard or answer. At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.

```python
def get_object_visualization_header(self,
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

result = metadata_controller.get_object_visualization_header(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Object Detail

Use this endpoint to get full details of metadata objects

```python
def get_object_detail(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataDetailsRequest`](/doc/models/api-rest-v2-metadata-details-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = ApiRestV2MetadataDetailsRequest()
body.mtype = Type9Enum.USER
body.id = ['id6', 'id7']

result = metadata_controller.get_object_detail(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Export Object TML

To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```python
def export_object_tml(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTmlExportRequest`](/doc/models/api-rest-v2-metadata-tml-export-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = ApiRestV2MetadataTmlExportRequest()
body.id = ['id6', 'id7']

result = metadata_controller.export_object_tml(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Import Object TML

To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint

```python
def import_object_tml(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2MetadataTmlImportRequest`](/doc/models/api-rest-v2-metadata-tml-import-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = ApiRestV2MetadataTmlImportRequest()
body.object_tml = ['objectTML5', 'objectTML6']

result = metadata_controller.import_object_tml(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

