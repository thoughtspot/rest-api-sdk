
# Tspublic Rest V2 Data Answer Request

## Structure

`TspublicRestV2DataAnswerRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `offset` | `number \| undefined` | Optional | The offset point, starting from where the records should be included in the response.<br><br>If no input is provided then offset starts from 0.<br>**Default**: `0` |
| `batchNumber` | `number \| undefined` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber.<br><br>Example:<br><br>Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.<br>**Default**: `-1` |
| `batchSize` | `number \| undefined` | Optional | The number of records that should be included in the response starting from offset position.<br><br>If no input is provided, then all records starting from the value provided in offset is included in the response<br>**Default**: `-1` |
| `id` | `string` | Required | The GUID of the Answer |
| `formatType` | [`FormatTypeEnum \| undefined`](../../doc/models/format-type-enum.md) | Optional | The format of the data in the response.<br><br>FULL: The response comes in "column":"value" format.<br><br>COMPACT: The response includes only the value of the columns.<br>**Default**: `FormatTypeEnum.COMPACT` |

## Example (as JSON)

```json
{
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "id": "id0",
  "formatType": null
}
```

