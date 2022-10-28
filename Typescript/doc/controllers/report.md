# Report

```ts
const reportController = new ReportController(client);
```

## Class Name

`ReportController`

## Methods

* [Restapi V2 Answer Report](../../doc/controllers/report.md#restapi-v2-answer-report)
* [Restapi V2 Liveboard Report](../../doc/controllers/report.md#restapi-v2-liveboard-report)


# Restapi V2 Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

```ts
async restapiV2AnswerReport(
  id: string,
  type: Type16Enum,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the Answer to download. |
| `type` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Query, Required | Type of file to be generated. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const id = 'id0';
const type = 'PDF';
try {
  const { result, ...httpResponse } = await reportController.restapiV2AnswerReport(id, type);
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


# Restapi V2 Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

```ts
async restapiV2LiveboardReport(
  type: Type16Enum,
  id?: string,
  vizId?: string[],
  transientContent?: string,
  runtimeFilter?: string,
  runtimeSort?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Query, Required | Type of file to be generated. Valid values: CSV/XLSX/PDF/PNG. |
| `id` | `string \| undefined` | Query, Optional | GUID of the Liveboard to download.<br><br>This field is considered only when no input is provided for transientContent field. |
| `vizId` | `string[] \| undefined` | Query, Optional | JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.<br><br>For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.<br><br>Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered. |
| `transientContent` | `string \| undefined` | Query, Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard. |
| `runtimeFilter` | `string \| undefined` | Query, Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard . |
| `runtimeSort` | `string \| undefined` | Query, Optional | JSON object which provides columns to sort the data at the time of data retrieval.<br><br>Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const type = 'PDF';
try {
  const { result, ...httpResponse } = await reportController.restapiV2LiveboardReport(type);
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

