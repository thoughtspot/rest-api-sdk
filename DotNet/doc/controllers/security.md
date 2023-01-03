# Security

```csharp
SecurityController securityController = client.SecurityController;
```

## Class Name

`SecurityController`

## Methods

* [Restapi V2 Get Permission on Object](../../doc/controllers/security.md#restapi-v2-get-permission-on-object)
* [Restapi V2 Get Permission for Principal](../../doc/controllers/security.md#restapi-v2-get-permission-for-principal)
* [Restapi V2 Share Object](../../doc/controllers/security.md#restapi-v2-share-object)
* [Restapi V2 Share Visualization](../../doc/controllers/security.md#restapi-v2-share-visualization)
* [Restapi V2 Search Permission on Objects](../../doc/controllers/security.md#restapi-v2-search-permission-on-objects)
* [Restapi V2 Search Permission for Principals](../../doc/controllers/security.md#restapi-v2-search-permission-for-principals)


# Restapi V2 Get Permission on Object

To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

```csharp
RestapiV2GetPermissionOnObjectAsync(
    string id,
    Models.Type7Enum type,
    bool? includeDependent = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the metadata object for which the permission needs to be obtained. |
| `type` | [`Models.Type7Enum`](../../doc/models/type-7-enum.md) | Query, Required | Type of metadata object. Valid values: Liveboard\|Answer\|DataObject\|Column |
| `includeDependent` | `bool?` | Query, Optional | When this field is set to true, the API returns the permission details for the dependent objects for the the object included in the request |

## Response Type

[`Task<Models.SecurityPermissionResponse>`](../../doc/models/security-permission-response.md)

## Example Usage

```csharp
string id = "id0";
Type7Enum type = Type7Enum.DATAOBJECT;

try
{
    SecurityPermissionResponse result = await securityController.RestapiV2GetPermissionOnObjectAsync(id, type, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Permission for Principal

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

Requires administration privilege

```csharp
RestapiV2GetPermissionForPrincipalAsync(
    string id = null,
    string name = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Optional | GUID of the user or user group for which the object permission needs to be obtained |
| `name` | `string` | Query, Optional | Name of the ser or user group for which the object permission needs to be obtained |

## Response Type

[`Task<Models.PrincipalSearchResponse>`](../../doc/models/principal-search-response.md)

## Example Usage

```csharp
try
{
    PrincipalSearchResponse result = await securityController.RestapiV2GetPermissionForPrincipalAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Share Object

To programmatically share ThoughtSpot objects with another user or user group, use this endpoint.

When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.

```csharp
RestapiV2ShareObjectAsync(
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
body.Type = Type18Enum.DATAOBJECT;
body.Id = new List<string>();
body.Id.Add("id6");
body.Id.Add("id7");
body.Permission = "permission8";

try
{
    bool? result = await securityController.RestapiV2ShareObjectAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Share Visualization

If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint.

Requires privilege to share the visualization

```csharp
RestapiV2ShareVisualizationAsync(
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
    bool? result = await securityController.RestapiV2ShareVisualizationAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Permission on Objects

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```csharp
RestapiV2SearchPermissionOnObjectsAsync(
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
    List<SecurityPermissionResponse> result = await securityController.RestapiV2SearchPermissionOnObjectsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Permission for Principals

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```csharp
RestapiV2SearchPermissionForPrincipalsAsync(
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
    List<PrincipalSearchResponse> result = await securityController.RestapiV2SearchPermissionForPrincipalsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

