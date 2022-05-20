# Custom Actions

```java
CustomActionsController customActionsController = client.getCustomActionsController();
```

## Class Name

`CustomActionsController`

## Methods

* [Get Custom Action](../../doc/controllers/custom-actions.md#get-custom-action)
* [Create Custom Action](../../doc/controllers/custom-actions.md#create-custom-action)
* [Update Custom Action](../../doc/controllers/custom-actions.md#update-custom-action)
* [Delete Custom Action](../../doc/controllers/custom-actions.md#delete-custom-action)
* [Search Custom Action](../../doc/controllers/custom-actions.md#search-custom-action)
* [Get Custom Action Association](../../doc/controllers/custom-actions.md#get-custom-action-association)
* [Update Custom Action Association](../../doc/controllers/custom-actions.md#update-custom-action-association)
* [Delete Custom Action Association](../../doc/controllers/custom-actions.md#delete-custom-action-association)


# Get Custom Action

To get details of a specific custom action configured in the ThoughtSpot system, use this endpoint

```java
CompletableFuture<Object> getCustomActionAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | GUID of the custom action |

## Response Type

`Object`

## Example Usage

```java
String id = "id0";

customActionsController.getCustomActionAsync(id).thenAccept(result -> {
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


# Create Custom Action

To programmatically create custom actions on ThoughtSpot clusters that support embedding configuration, use this endpoint

```java
CompletableFuture<Object> createCustomActionAsync(
    final TspublicRestV2CustomactionCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionCreateRequest`](../../doc/models/tspublic-rest-v2-customaction-create-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2CustomactionCreateRequest body = new TspublicRestV2CustomactionCreateRequest();
body.setConfiguration("configuration0");

customActionsController.createCustomActionAsync(body).thenAccept(result -> {
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


# Update Custom Action

To programmatically edit an existing custom action, use this endpoint

```java
CompletableFuture<Object> updateCustomActionAsync(
    final TspublicRestV2CustomactionUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-update-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2CustomactionUpdateRequest body = new TspublicRestV2CustomactionUpdateRequest();
body.setId("id6");
body.setConfiguration("configuration0");

customActionsController.updateCustomActionAsync(body).thenAccept(result -> {
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


# Delete Custom Action

To programmatically delete a custom action, use this endpoint

```java
CompletableFuture<Object> deleteCustomActionAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | GUID of the custom action |

## Response Type

`Object`

## Example Usage

```java
String id = "id0";

customActionsController.deleteCustomActionAsync(id).thenAccept(result -> {
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


# Search Custom Action

To search custom actions available on a ThoughtSpot instance, use this endpoint

```java
CompletableFuture<Object> searchCustomActionAsync(
    final TspublicRestV2CustomactionSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionSearchRequest`](../../doc/models/tspublic-rest-v2-customaction-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2CustomactionSearchRequest body = new TspublicRestV2CustomactionSearchRequest();

customActionsController.searchCustomActionAsync(body).thenAccept(result -> {
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


# Get Custom Action Association

ThoughtSpot supports associating custom actions to Liveboards, answers, and worksheets. To get the details of the ThoughtSpot objects associated with a custom action, use this endpoint.

```java
CompletableFuture<Object> getCustomActionAssociationAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | GUID of the custom action |

## Response Type

`Object`

## Example Usage

```java
String id = "id0";

customActionsController.getCustomActionAssociationAsync(id).thenAccept(result -> {
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


# Update Custom Action Association

To programmatically associate a custom action to a ThoughtSpot object, use this endpoint

```java
CompletableFuture<Object> updateCustomActionAssociationAsync(
    final TspublicRestV2CustomactionAssociationUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionAssociationUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-association-update-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2CustomactionAssociationUpdateRequest body = new TspublicRestV2CustomactionAssociationUpdateRequest();
body.setId("id6");
body.setAssociation("association6");

customActionsController.updateCustomActionAssociationAsync(body).thenAccept(result -> {
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


# Delete Custom Action Association

To remove custom action associations to ThoughtSpot objects, use this endpoint

```java
CompletableFuture<Object> deleteCustomActionAssociationAsync(
    final String id,
    final String association)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | GUID of the custom action |
| `association` | `String` | Query, Required | A JSON map of the attributes with association of the action to ThoughtSpot object ID<br><br>Example:<br><br>{"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet action","version":"v2","type":"URL","detail":{"link":"https://unpkg.com ","function":"my-worksheet-action","authSelect":"NONE","authToken":"","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c-4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"context":"NONE","availability":[ ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]} |

## Response Type

`Object`

## Example Usage

```java
String id = "id0";
String association = "association0";

customActionsController.deleteCustomActionAssociationAsync(id, association).thenAccept(result -> {
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

