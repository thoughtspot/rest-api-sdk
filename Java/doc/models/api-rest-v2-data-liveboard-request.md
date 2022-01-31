
# Api Rest V2 Data Liveboard Request

## Structure

`ApiRestV2DataLiveboardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offset` | `Integer` | Optional | The offset point, starting from where the records should be included in the response.<br><br>If no input is provided then offset starts from 0.<br>**Default**: `0` | Integer getOffset() | setOffset(Integer offset) |
| `BatchNumber` | `Integer` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber.<br><br>Example:<br><br>Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered. | Integer getBatchNumber() | setBatchNumber(Integer batchNumber) |
| `BatchSize` | `Integer` | Optional | The number of records that should be included in the response starting from offset position.<br><br>If no input is provided, then all records starting from the value provided in offset is included in the response. | Integer getBatchSize() | setBatchSize(Integer batchSize) |
| `Id` | `String` | Required | The GUID of the Liveboard | String getId() | setId(String id) |
| `VizId` | `List<String>` | Optional | A JSON array of GUIDs of the visualizations in the Liveboard. | List<String> getVizId() | setVizId(List<String> vizId) |
| `FormatType` | [`FormatType1Enum`](/doc/models/format-type-1-enum.md) | Optional | The format of the data in the response.<br><br>FULL: The response comes in "column":"value" format.<br><br>COMPACT: The response includes only the value of the columns.<br>**Default**: `FormatType1Enum.COMPACT` | FormatType1Enum getFormatType() | setFormatType(FormatType1Enum formatType) |

## Example (as JSON)

```json
{
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "id": "id0",
  "vizId": null,
  "formatType": null
}
```

