# Report

```python
report_controller = client.report
```

## Class Name

`ReportController`

## Methods

* [Restapi V2 Answer Report](../../doc/controllers/report.md#restapi-v2-answer-report)
* [Restapi V2 Liveboard Report](../../doc/controllers/report.md#restapi-v2-liveboard-report)


# Restapi V2 Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

```python
def restapi_v_2__answer_report(self,
                              id,
                              mtype)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the Answer to download. |
| `mtype` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Query, Required | Type of file to be generated. |

## Response Type

`object`

## Example Usage

```python
id = 'id0'
mtype = Type16Enum.PDF

result = report_controller.restapi_v_2__answer_report(id, mtype)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

```python
def restapi_v_2__liveboard_report(self,
                                 mtype,
                                 id=None,
                                 viz_id=None,
                                 transient_content=None,
                                 runtime_filter=None,
                                 runtime_sort=None,
                                 pdf_options=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mtype` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Query, Required | Type of file to be generated. Valid values: CSV/XLSX/PDF/PNG. |
| `id` | `string` | Query, Optional | GUID of the Liveboard to download.<br><br>This field is considered only when no input is provided for transientContent field. |
| `viz_id` | `List of string` | Query, Optional | JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.<br><br>For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.<br><br>Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered. |
| `transient_content` | `string` | Query, Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard. |
| `runtime_filter` | `string` | Query, Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard . |
| `runtime_sort` | `string` | Query, Optional | JSON object which provides columns to sort the data at the time of data retrieval.<br><br>Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters |
| `pdf_options` | [`PdfOptionsInput`](../../doc/models/pdf-options-input.md) | Query, Optional | Additional options that are applicable for PDF type. |

## Response Type

`object`

## Example Usage

```python
mtype = Type16Enum.PDF

result = report_controller.restapi_v_2__liveboard_report(mtype)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

