# Materialization

```ts
const materializationController = new MaterializationController(client);
```

## Class Name

`MaterializationController`


# Refresh Materialized View

Use this endpoint to refresh data in the materialized view by running the query associated with it

```ts
async refreshMaterializedView(
  body: TspublicRestV2MaterializationRefreshviewRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2MaterializationRefreshviewRequest`](../../doc/models/tspublic-rest-v2-materialization-refreshview-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2MaterializationRefreshviewRequest = {
  id: 'id6',
};

try {
  const { result, ...httpResponse } = await materializationController.refreshMaterializedView(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

