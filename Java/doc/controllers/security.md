# Security

```java
SecurityController securityController = client.getSecurityController();
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

```java
CompletableFuture<SecurityPermissionResponse> restapiV2GetPermissionOnObjectAsync(
    final String id,
    final Type7Enum type,
    final Boolean includeDependent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | GUID of the metadata object for which the permission needs to be obtained. |
| `type` | [`Type7Enum`](../../doc/models/type-7-enum.md) | Query, Required | Type of metadata object. Valid values: Liveboard\|Answer\|DataObject\|Column |
| `includeDependent` | `Boolean` | Query, Optional | When this field is set to true, the API returns the permission details for the dependent objects for the the object included in the request |

## Response Type

[`SecurityPermissionResponse`](../../doc/models/security-permission-response.md)

## Example Usage

```java
String id = "id0";
Type7Enum type = Type7Enum.DATAOBJECT;

securityController.restapiV2GetPermissionOnObjectAsync(id, type, null).thenAccept(result -> {
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


# Restapi V2 Get Permission for Principal

Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission.

Requires administration privilege

```java
CompletableFuture<PrincipalSearchResponse> restapiV2GetPermissionForPrincipalAsync(
    final String id,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Optional | GUID of the user or user group for which the object permission needs to be obtained |
| `name` | `String` | Query, Optional | Name of the ser or user group for which the object permission needs to be obtained |

## Response Type

[`PrincipalSearchResponse`](../../doc/models/principal-search-response.md)

## Example Usage

```java
securityController.restapiV2GetPermissionForPrincipalAsync(null, null).thenAccept(result -> {
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


# Restapi V2 Share Object

To programmatically share ThoughtSpot objects with another user or user group, use this endpoint.

When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.

```java
CompletableFuture<Boolean> restapiV2ShareObjectAsync(
    final TspublicRestV2SecurityShareTsobjectRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityShareTsobjectRequest`](../../doc/models/tspublic-rest-v2-security-share-tsobject-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2SecurityShareTsobjectRequest body = new TspublicRestV2SecurityShareTsobjectRequest();
body.setType(Type18Enum.DATAOBJECT);
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");
body.setPermission("permission8");

securityController.restapiV2ShareObjectAsync(body).thenAccept(result -> {
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


# Restapi V2 Share Visualization

If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint.

Requires privilege to share the visualization

```java
CompletableFuture<Boolean> restapiV2ShareVisualizationAsync(
    final TspublicRestV2SecurityShareVisualizationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityShareVisualizationRequest`](../../doc/models/tspublic-rest-v2-security-share-visualization-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2SecurityShareVisualizationRequest body = new TspublicRestV2SecurityShareVisualizationRequest();
body.setId("id6");
body.setVizId("vizId4");
body.setPrincipalId(new LinkedList<>());
body.getPrincipalId().add("principalId2");
body.getPrincipalId().add("principalId3");

securityController.restapiV2ShareVisualizationAsync(body).thenAccept(result -> {
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


# Restapi V2 Search Permission on Objects

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```java
CompletableFuture<List<SecurityPermissionResponse>> restapiV2SearchPermissionOnObjectsAsync(
    final TspublicRestV2SecurityPermissionTsobjectSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityPermissionTsobjectSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-tsobject-search-request.md) | Body, Required | - |

## Response Type

[`List<SecurityPermissionResponse>`](../../doc/models/security-permission-response.md)

## Example Usage

```java
TspublicRestV2SecurityPermissionTsobjectSearchRequest body = new TspublicRestV2SecurityPermissionTsobjectSearchRequest();
body.setTsObject(new LinkedList<>());

TsObjectSearchInput bodyTsObject0 = new TsObjectSearchInput();
bodyTsObject0.setType(Type2Enum.DATAOBJECT);
bodyTsObject0.setId(new LinkedList<>());
bodyTsObject0.getId().add("id8");
bodyTsObject0.getId().add("id9");
body.getTsObject().add(bodyTsObject0);

TsObjectSearchInput bodyTsObject1 = new TsObjectSearchInput();
bodyTsObject1.setType(Type2Enum.COLUMN);
bodyTsObject1.setId(new LinkedList<>());
bodyTsObject1.getId().add("id9");
bodyTsObject1.getId().add("id0");
bodyTsObject1.getId().add("id1");
body.getTsObject().add(bodyTsObject1);

TsObjectSearchInput bodyTsObject2 = new TsObjectSearchInput();
bodyTsObject2.setType(Type2Enum.LIVEBOARD);
bodyTsObject2.setId(new LinkedList<>());
bodyTsObject2.getId().add("id0");
body.getTsObject().add(bodyTsObject2);


securityController.restapiV2SearchPermissionOnObjectsAsync(body).thenAccept(result -> {
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


# Restapi V2 Search Permission for Principals

To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission.

You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred.

You can optionally provide users or user groups for which the persmission needs to be displayed.

You can optionally see the permission on the dependent objects as well by enabling includeDependent field.

Requires administration privilege

```java
CompletableFuture<List<PrincipalSearchResponse>> restapiV2SearchPermissionForPrincipalsAsync(
    final TspublicRestV2SecurityPermissionPrincipalSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2SecurityPermissionPrincipalSearchRequest`](../../doc/models/tspublic-rest-v2-security-permission-principal-search-request.md) | Body, Required | - |

## Response Type

[`List<PrincipalSearchResponse>`](../../doc/models/principal-search-response.md)

## Example Usage

```java
TspublicRestV2SecurityPermissionPrincipalSearchRequest body = new TspublicRestV2SecurityPermissionPrincipalSearchRequest();
body.setPrincipal(new LinkedList<>());

UserNameAndIDInput bodyPrincipal0 = new UserNameAndIDInput();
body.getPrincipal().add(bodyPrincipal0);


securityController.restapiV2SearchPermissionForPrincipalsAsync(body).thenAccept(result -> {
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

