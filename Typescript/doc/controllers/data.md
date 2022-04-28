# Data

```ts
const dataController = new DataController(client);
```

## Class Name

`DataController`

## Methods

* [Search Query Data](../../doc/controllers/data.md#search-query-data)
* [Answer Data](../../doc/controllers/data.md#answer-data)
* [Liveboard Data](../../doc/controllers/data.md#liveboard-data)
* [Answer Query Sql](../../doc/controllers/data.md#answer-query-sql)
* [Liveboard Query Sql](../../doc/controllers/data.md#liveboard-query-sql)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

Permission: Requires at least view access to the dataobject and datadownloading privilege

```ts
async searchQueryData(
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
  const { result, ...httpResponse } = await dataController.searchQueryData(body);
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


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.

Permission: Requires at least view access to the object and datadownloading privilege

```ts
async answerData(
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
  const { result, ...httpResponse } = await dataController.answerData(body);
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


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

Permission: Requires at least view access to the object and datadownloading privilege

```ts
async liveboardData(
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
  const { result, ...httpResponse } = await dataController.liveboardData(body);
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


# Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```ts
async answerQuerySql(
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
  const { result, ...httpResponse } = await dataController.answerQuerySql(id);
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


# Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```ts
async liveboardQuerySql(
  id: string,
  vizId?: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<LiveboardQueryResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Liveboard |
| `vizId` | `string[] \| undefined` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`LiveboardQueryResponse`](../../doc/models/liveboard-query-response.md)

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await dataController.liveboardQuerySql(id);
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

