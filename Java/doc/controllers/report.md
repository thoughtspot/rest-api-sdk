# Report

```java
ReportController reportController = client.getReportController();
```

## Class Name

`ReportController`

## Methods

* [Restapi V2 Answer Report](../../doc/controllers/report.md#restapi-v2-answer-report)
* [Restapi V2 Liveboard Report](../../doc/controllers/report.md#restapi-v2-liveboard-report)


# Restapi V2 Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

```java
CompletableFuture<Object> restapiV2AnswerReportAsync(
    final String id,
    final Type16Enum type)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | GUID of the Answer to download. |
| `type` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Query, Required | Type of file to be generated. |

## Response Type

`Object`

## Example Usage

```java
String id = "id0";
Type16Enum type = Type16Enum.PDF;

reportController.restapiV2AnswerReportAsync(id, type).thenAccept(result -> {
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


# Restapi V2 Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

```java
CompletableFuture<Object> restapiV2LiveboardReportAsync(
    final Type16Enum type,
    final String id,
    final List<String> vizId,
    final String transientContent,
    final String runtimeFilter,
    final String runtimeSort,
    final PdfOptionsInput pdfOptions)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Query, Required | Type of file to be generated. Valid values: CSV/XLSX/PDF/PNG. |
| `id` | `String` | Query, Optional | GUID of the Liveboard to download.<br><br>This field is considered only when no input is provided for transientContent field. |
| `vizId` | `List<String>` | Query, Optional | JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.<br><br>For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.<br><br>Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered. |
| `transientContent` | `String` | Query, Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard. |
| `runtimeFilter` | `String` | Query, Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard . |
| `runtimeSort` | `String` | Query, Optional | JSON object which provides columns to sort the data at the time of data retrieval.<br><br>Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters |
| `pdfOptions` | [`PdfOptionsInput`](../../doc/models/pdf-options-input.md) | Query, Optional | Additional options that are applicable for PDF type. |

## Response Type

`Object`

## Example Usage

```java
Type16Enum type = Type16Enum.PDF;

reportController.restapiV2LiveboardReportAsync(type, null, null, null, null, null, null).thenAccept(result -> {
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

