# Data

```ts
const dataController = new DataController(client);
```

## Class Name

`DataController`

## Methods

* [Restapi V2 Search Query Data](../../doc/controllers/data.md#restapi-v2-search-query-data)
* [Restapi V2 Liveboard Data](../../doc/controllers/data.md#restapi-v2-liveboard-data)
* [Restapi V2 Answer Data](../../doc/controllers/data.md#restapi-v2-answer-data)
* [Restapi V2 Answer Query Sql](../../doc/controllers/data.md#restapi-v2-answer-query-sql)
* [Restapi V2 Liveboard Query Sql](../../doc/controllers/data.md#restapi-v2-liveboard-query-sql)


# Restapi V2 Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```ts
async restapiV2SearchQueryData(
  body: TspublicRestV2DataSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataSearchRequest`](../../doc/models/tspublic-rest-v2-data-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2DataSearchRequest = {
  queryString: 'queryString0',
  dataObjectId: 'dataObjectId6',
};

try {
  const { result, ...httpResponse } = await dataController.restapiV2SearchQueryData(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```ts
async restapiV2LiveboardData(
  body: TspublicRestV2DataLiveboardRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataLiveboardRequest`](../../doc/models/tspublic-rest-v2-data-liveboard-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2DataLiveboardRequest = {};

try {
  const { result, ...httpResponse } = await dataController.restapiV2LiveboardData(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```ts
async restapiV2AnswerData(
  body: TspublicRestV2DataAnswerRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataAnswerRequest`](../../doc/models/tspublic-rest-v2-data-answer-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2DataAnswerRequest = {
  id: 'id6',
};

try {
  const { result, ...httpResponse } = await dataController.restapiV2AnswerData(body);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint

```ts
async restapiV2AnswerQuerySql(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<AnswerQueryResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Answer |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`AnswerQueryResponse`](../../doc/models/answer-query-response.md)

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await dataController.restapiV2AnswerQuerySql(id);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint

```ts
async restapiV2LiveboardQuerySql(
  id: string,
  vizId?: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<LiveboardQueryResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Answer |
| `vizId` | `string[] \| undefined` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`LiveboardQueryResponse`](../../doc/models/liveboard-query-response.md)

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await dataController.restapiV2LiveboardQuerySql(id);
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
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

