# Report

```ts
const reportController = new ReportController(client);
```

## Class Name

`ReportController`

## Methods

* [Answer Report](../../doc/controllers/report.md#answer-report)
* [Liveboard Report](../../doc/controllers/report.md#liveboard-report)


# Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

Permission: Requires at least view access to the object and datadownloading privilege

```ts
async answerReport(
  body: TspublicRestV2ReportAnswerRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<NodeJS.ReadableStream | Blob>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ReportAnswerRequest`](../../doc/models/tspublic-rest-v2-report-answer-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`NodeJS.ReadableStream | Blob`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2ReportAnswerRequest = {
  id: 'id6',
  type: 'PDF',
};

try {
  const { result, ...httpResponse } = await reportController.answerReport(body);
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


# Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

Permission: Requires at least view access to the object and datadownloading privilege

```ts
async liveboardReport(
  body: TspublicRestV2ReportLiveboardRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<NodeJS.ReadableStream | Blob>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ReportLiveboardRequest`](../../doc/models/tspublic-rest-v2-report-liveboard-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`NodeJS.ReadableStream | Blob`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2ReportLiveboardRequest = {
  type: 'PDF',
};

try {
  const { result, ...httpResponse } = await reportController.liveboardReport(body);
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

