# Data

```ts
const dataController = new DataController(client);
```

## Class Name

`DataController`

## Methods

* [Search Query Data](/doc/controllers/data.md#search-query-data)
* [Answer Data](/doc/controllers/data.md#answer-data)
* [Liveboard Data](/doc/controllers/data.md#liveboard-data)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```ts
async searchQueryData(
  body: ApiRestV2DataSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DataSearchRequest`](/doc/models/api-rest-v2-data-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2DataSearchRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```ts
async answerData(
  body: ApiRestV2DataAnswerRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DataAnswerRequest`](/doc/models/api-rest-v2-data-answer-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2DataAnswerRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```ts
async liveboardData(
  body: ApiRestV2DataLiveboardRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DataLiveboardRequest`](/doc/models/api-rest-v2-data-liveboard-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2DataLiveboardRequest = {
  id: 'id6',
};

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

