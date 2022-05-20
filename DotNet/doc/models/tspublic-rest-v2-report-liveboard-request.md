
# Tspublic Rest V2 Report Liveboard Request

## Structure

`TspublicRestV2ReportLiveboardRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Optional | GUID of the Liveboard to download.<br><br>This field is considered only when no input is provided for transientContent field. |
| `VizId` | `List<string>` | Optional | JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.<br><br>For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.<br><br>Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered. |
| `TransientContent` | `string` | Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard. |
| `RuntimeFilter` | `string` | Optional | JSON object which contains filter condition to filter the data at the time of data retrieval.<br><br>Example: {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":"BET","val2":["1625126400000","1625126400000"]}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters |
| `RuntimeSort` | `string` | Optional | JSON object which provides columns to sort the data at the time of data retrieval.<br><br>Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters |
| `Type` | [`Models.LiveboardReportTypeEnum`](../../doc/models/liveboard-report-type-enum.md) | Required | Type of file to be generated.<br>**Default**: `LiveboardReportTypeEnum.PDF` |
| `PdfOptions` | [`Models.PdfOptionsInput`](../../doc/models/pdf-options-input.md) | Optional | - |

## Example (as JSON)

```json
{
  "type": "PDF"
}
```

