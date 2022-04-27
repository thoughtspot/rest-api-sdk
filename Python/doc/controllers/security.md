# Security

```python
security_controller = client.security
```

## Class Name

`SecurityController`

## Methods

* [Share Object](../../doc/controllers/security.md#share-object)
* [Share Visualization](../../doc/controllers/security.md#share-visualization)
* [Get Permission on Object](../../doc/controllers/security.md#get-permission-on-object)
* [Get Permission for Principal](../../doc/controllers/security.md#get-permission-for-principal)
* [Search Permission on Objects](../../doc/controllers/security.md#search-permission-on-objects)
* [Search Permission for Principals](../../doc/controllers/security.md#search-permission-for-principals)


# Share Object

To programmatically share ThoughtSpot objects with another user or user group, use this endpoint.

When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.

Requires privilege to share the object

```python
def share_object(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityShareTsobjectRequest`](../../doc/models/tspublic-rest-v2-security-share-tsobject-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2SecurityShareTsobjectRequest()
body.mtype = ShareObjectTypeEnum.DATAOBJECT
body.id = ['id6', 'id7']
body.permission = 'permission8'

result = security_controller.share_object(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Share Visualization

If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint.

When you share a visualization, a notification with a live link is sent to the user. When the users access this Liveboard, they can view the last saved version of the visualization.

Requires privilege to share the visualization

```python
def share_visualization(self,
                       body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityShareVisualizationRequest`](../../doc/models/tspublic-rest-v2-security-share-visualization-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2SecurityShareVisualizationRequest()
body.id = 'id6'
body.viz_id = 'vizId4'
body.principal_id = ['principalId2', 'principalId3']

result = security_controller.share_visualization(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Permission on Object

To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```python
def get_permission_on_object(self,
                            id,
                            mtype,
                            include_dependent=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the metadata object for which the permission needs to be obtained. |
| `mtype` | [`GetPermissionOnObjectTypeEnum`](../../doc/models/get-permission-on-object-type-enum.md) | Query, Required | Type of metadata object |
| `include_dependent` | `bool` | Query, Optional | When this field is set to true, the API response includes the permission details for the dependent objects. |

## Response Type

[`SecurityPermissionResponse`](../../doc/models/security-permission-response.md)

## Example Usage

```python
id = 'id0'
mtype = GetPermissionOnObjectTypeEnum.DATAOBJECT

result = security_controller.get_permission_on_object(id, mtype)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Permission for Principal

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

Provide at least one of id or name. When both are given then id is considered.

Requires administration privilege

```python
def get_permission_for_principal(self,
                                id=None,
                                name=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Optional | GUID of the user or user group for which the object permission needs to be obtained |
| `name` | `string` | Query, Optional | Name of the user or user group for which the object permission needs to be obtained |

## Response Type

[`PrincipalSearchResponse`](../../doc/models/principal-search-response.md)

## Example Usage

```python
result = security_controller.get_permission_for_principal()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Permission on Objects

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups that has either VIEW OR MODIFY permission.

Provide list of object ids and its type to list the permissions for.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```python
def search_permission_on_objects(self,
                                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityPermissionTsobjectSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-tsobject-search-request.md) | Body, Required | - |

## Response Type

[`List of SecurityPermissionResponse`](../../doc/models/security-permission-response.md)

## Example Usage

```python
body = TspublicRestV2SecurityPermissionTsobjectSearchRequest()
body.ts_object = []

body.ts_object.append(TsObjectSearchInput())
body.ts_object[0].mtype = TsObjectSearchInputTypeEnum.DATAOBJECT
body.ts_object[0].id = ['id8', 'id9']

body.ts_object.append(TsObjectSearchInput())
body.ts_object[1].mtype = TsObjectSearchInputTypeEnum.COLUMN
body.ts_object[1].id = ['id9', 'id0', 'id1']

body.ts_object.append(TsObjectSearchInput())
body.ts_object[2].mtype = TsObjectSearchInputTypeEnum.LIVEBOARD
body.ts_object[2].id = ['id0']


result = security_controller.search_permission_on_objects(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Permission for Principals

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

You can optionally provide list of object ids for which the persmission needs to be displayed.

Requires administration privilege

```python
def search_permission_for_principals(self,
                                    body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityPermissionPrincipalSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-principal-search-request.md) | Body, Required | - |

## Response Type

[`List of PrincipalSearchResponse`](../../doc/models/principal-search-response.md)

## Example Usage

```python
body = TspublicRestV2SecurityPermissionPrincipalSearchRequest()
body.principal = []

body.principal.append(UserNameAndIDInput())


result = security_controller.search_permission_for_principals(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

