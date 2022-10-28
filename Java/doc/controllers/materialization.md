# Materialization

```java
MaterializationController materializationController = client.getMaterializationController();
```

## Class Name

`MaterializationController`


# Restapi V2 Refresh Materialized View

Use this endpoint to refresh data in the materialized view by running the query associated with it

```java
CompletableFuture<Object> restapiV2RefreshMaterializedViewAsync(
    final TspublicRestV2MaterializationRefreshviewRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MaterializationRefreshviewRequest`](../../doc/models/tspublic-rest-v2-materialization-refreshview-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2MaterializationRefreshviewRequest body = new TspublicRestV2MaterializationRefreshviewRequest();
body.setId("id6");

materializationController.restapiV2RefreshMaterializedViewAsync(body).thenAccept(result -> {
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

