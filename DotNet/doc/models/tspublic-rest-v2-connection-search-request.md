
# Tspublic Rest V2 Connection Search Request

## Structure

`TspublicRestV2ConnectionSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Offset` | `int?` | Optional | The offset point, starting from where the records should be included in the response. If no input is provided then offset starts from 0<br>**Default**: `0` |
| `BatchNumber` | `int?` | Optional | An alternate way to set offset for the starting point of the response. Offset field should be kept blank to use the value from this field. Offset value will be calculated as (batchNumber - 1) * batchSize. It is mandatory to provide a value for batchSize with batchNumber. Example: Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.<br>**Default**: `-1` |
| `BatchSize` | `int?` | Optional | The number of records that should be included in the response starting from offset position. If no input is provided, then all records starting from the value provided in offset is included in the response.<br>**Default**: `-1` |
| `SortBy` | [`Models.SortBy1Enum?`](../../doc/models/sort-by-1-enum.md) | Optional | Field based on which the re.sponse needs to be ordered. Valid values<br>**Default**: `SortBy1Enum.DEFAULT` |
| `SortOrder` | [`Models.SortOrder1Enum?`](../../doc/models/sort-order-1-enum.md) | Optional | Order in which sortBy should be applied. Valid values |
| `Type` | [`Models.Type15Enum`](../../doc/models/type-15-enum.md) | Required | Type of the connect being searched. Valid values: SNOWFLAKE\|AMAZON_REDSHIFT\|GOOGLE_BIGQUERY\|AZURE_SYNAPSE\|TERADATA\|STARBURST\|SAP_HANA\|ORACLE_ADW\|DATABRICKS\|DENODO |
| `NamePattern` | `string` | Optional | A pattern to match the name of the connection. This parameter supports matching case-insensitive strings. For a wildcard match, use %. |
| `FetchId` | `List<string>` | Optional | A JSON array containing the GUIDs of the connections that you want to fetch. |
| `SkipId` | `List<string>` | Optional | A JSON array containing the GUIDs of the connections that you want to skip. |
| `Tag` | [`List<Models.TagNameAndIdInput>`](../../doc/models/tag-name-and-id-input.md) | Optional | A JSON array of name or GUID of tags or both. When both are given then id is considered |

## Example (as JSON)

```json
{
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "sortBy": null,
  "sortOrder": null,
  "type": "DENODO",
  "namePattern": null,
  "fetchId": null,
  "skipId": null,
  "tag": null
}
```

