
# Tspublic Rest V2 Data Liveboard Request

## Structure

`TspublicRestV2DataLiveboardRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `offset` | `int` | Optional | The offset point, starting from where the records should be included in the response.<br><br>If no input is provided then offset starts from 0.<br>**Default**: `0` |
| `batch_number` | `int` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber.<br><br>Example:<br><br>Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.<br>**Default**: `-1` |
| `batch_size` | `int` | Optional | The number of records that should be included in the response starting from offset position.<br><br>If no input is provided, then all records starting from the value provided in offset is included in the response<br>**Default**: `-1` |
| `id` | `string` | Optional | The GUID of the Liveboard |
| `transient_content` | `string` | Optional | If you have embedded ThoughtSpot in your host application, and you want to download Liveboard data with unsaved changes then, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard . If value for this field is provided, then id will not be considered. |
| `viz_id` | `List of string` | Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |
| `runtime_filter` | `string` | Optional | JSON object which contains filter condition to filter the data at the time of data retrieval.<br><br>Example: {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":"BET","val2":["1625126400000","1625126400000"]}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters |
| `runtime_sort` | `string` | Optional | JSON object which provides columns to sort the data at the time of data retrieval.<br><br>Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}<br><br>For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters. |
| `format_type` | [`FormatTypeEnum`](../../doc/models/format-type-enum.md) | Optional | The format of the data in the response.<br><br>FULL: The response comes in "column":"value" format.<br><br>COMPACT: The response includes only the value of the columns.<br>**Default**: `'COMPACT'` |

## Example (as JSON)

```json
{
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "id": null,
  "transientContent": null,
  "vizId": null,
  "runtimeFilter": null,
  "runtimeSort": null,
  "formatType": null
}
```

