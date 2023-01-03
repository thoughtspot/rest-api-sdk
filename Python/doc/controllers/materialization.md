# Materialization

```python
materialization_controller = client.materialization
```

## Class Name

`MaterializationController`


# Restapi V2 Refresh Materialized View

Use this endpoint to refresh data in the materialized view by running the query associated with it

```python
def restapi_v_2__refresh_materialized_view(self,
                                          body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MaterializationRefreshviewRequest`](../../doc/models/tspublic-rest-v2-materialization-refreshview-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2MaterializationRefreshviewRequest()
body.id = 'id6'

result = materialization_controller.restapi_v_2__refresh_materialized_view(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

