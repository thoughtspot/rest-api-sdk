# Materialization

```csharp
MaterializationController materializationController = client.MaterializationController;
```

## Class Name

`MaterializationController`


# Refresh Materialized View

Use this endpoint to refresh data in the materialized view by running the query associated with it

```csharp
RefreshMaterializedViewAsync(
    Models.TspublicRestV2MaterializationRefreshviewRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2MaterializationRefreshviewRequest`](../../doc/models/tspublic-rest-v2-materialization-refreshview-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2MaterializationRefreshviewRequest();
body.Id = "id6";

try
{
    object result = await materializationController.RefreshMaterializedViewAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

