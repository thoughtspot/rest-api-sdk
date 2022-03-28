# Security

```csharp
SecurityController securityController = client.SecurityController;
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

```csharp
ShareObjectAsync(
    Models.TspublicRestV2SecurityShareTsobjectRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2SecurityShareTsobjectRequest`](../../doc/models/tspublic-rest-v2-security-share-tsobject-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2SecurityShareTsobjectRequest();
body.Type = Type19Enum.DATAOBJECT;
body.Id = new List<string>();
body.Id.Add("id6");
body.Id.Add("id7");
body.Permission = "permission8";

try
{
    bool? result = await securityController.ShareObjectAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Share Visualization

If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint.

When you share a visualization, a notification with a live link is sent to the user. When the users access this Liveboard, they can view the last saved version of the visualization.

Requires privilege to share the visualization

```csharp
ShareVisualizationAsync(
    Models.TspublicRestV2SecurityShareVisualizationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2SecurityShareVisualizationRequest`](../../doc/models/tspublic-rest-v2-security-share-visualization-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2SecurityShareVisualizationRequest();
body.Id = "id6";
body.VizId = "vizId4";
body.PrincipalId = new List<string>();
body.PrincipalId.Add("principalId2");
body.PrincipalId.Add("principalId3");

try
{
    bool? result = await securityController.ShareVisualizationAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Permission on Object

To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```csharp
GetPermissionOnObjectAsync(
    string id,
    Models.Type20Enum type,
    bool? includeDependent = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the metadata object for which the permission needs to be obtained. |
| `type` | [`Models.Type20Enum`](../../doc/models/type-20-enum.md) | Query, Required | Type of metadata object |
| `includeDependent` | `bool?` | Query, Optional | When this field is set to true, the API response includes the permission details for the dependent objects. |

## Response Type

[`Task<Models.SecurityPermissionResponse>`](../../doc/models/security-permission-response.md)

## Example Usage

```csharp
string id = "id0";
Type20Enum type = Type20Enum.DATAOBJECT;

try
{
    SecurityPermissionResponse result = await securityController.GetPermissionOnObjectAsync(id, type, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Permission for Principal

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

Provide at least one of id or name. When both are given then id is considered.

Requires administration privilege

```csharp
GetPermissionForPrincipalAsync(
    string id = null,
    string name = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Optional | GUID of the user or user group for which the object permission needs to be obtained |
| `name` | `string` | Query, Optional | Name of the user or user group for which the object permission needs to be obtained |

## Response Type

[`Task<Models.PrincipalSearchResponse>`](../../doc/models/principal-search-response.md)

## Example Usage

```csharp
try
{
    PrincipalSearchResponse result = await securityController.GetPermissionForPrincipalAsync(null, null);
}
catch (ApiException e){};
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

```csharp
SearchPermissionOnObjectsAsync(
    Models.TspublicRestV2SecurityPermissionTsobjectSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2SecurityPermissionTsobjectSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-tsobject-search-request.md) | Body, Required | - |

## Response Type

[`Task<List<Models.SecurityPermissionResponse>>`](../../doc/models/security-permission-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2SecurityPermissionTsobjectSearchRequest();
body.TsObject = new List<TsObjectSearchInput>();

var bodyTsObject0 = new TsObjectSearchInput();
bodyTsObject0.Type = Type2Enum.DATAOBJECT;
bodyTsObject0.Id = new List<string>();
bodyTsObject0.Id.Add("id8");
bodyTsObject0.Id.Add("id9");
body.TsObject.Add(bodyTsObject0);

var bodyTsObject1 = new TsObjectSearchInput();
bodyTsObject1.Type = Type2Enum.COLUMN;
bodyTsObject1.Id = new List<string>();
bodyTsObject1.Id.Add("id9");
bodyTsObject1.Id.Add("id0");
bodyTsObject1.Id.Add("id1");
body.TsObject.Add(bodyTsObject1);

var bodyTsObject2 = new TsObjectSearchInput();
bodyTsObject2.Type = Type2Enum.LIVEBOARD;
bodyTsObject2.Id = new List<string>();
bodyTsObject2.Id.Add("id0");
body.TsObject.Add(bodyTsObject2);


try
{
    List<SecurityPermissionResponse> result = await securityController.SearchPermissionOnObjectsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Permission for Principals

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

You can optionally provide list of object ids for which the persmission needs to be displayed.

Requires administration privilege

```csharp
SearchPermissionForPrincipalsAsync(
    Models.TspublicRestV2SecurityPermissionPrincipalSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2SecurityPermissionPrincipalSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-principal-search-request.md) | Body, Required | - |

## Response Type

[`Task<List<Models.PrincipalSearchResponse>>`](../../doc/models/principal-search-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2SecurityPermissionPrincipalSearchRequest();
body.Principal = new List<UserNameAndIDInput>();

var bodyPrincipal0 = new UserNameAndIDInput();
body.Principal.Add(bodyPrincipal0);


try
{
    List<PrincipalSearchResponse> result = await securityController.SearchPermissionForPrincipalsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

