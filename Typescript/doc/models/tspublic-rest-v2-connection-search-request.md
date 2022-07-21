
# Tspublic Rest V2 Connection Search Request

## Structure

`TspublicRestV2ConnectionSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `offset` | `number \| undefined` | Optional | The offset point, starting from where the records should be included in the response.<br><br>If no input is provided then offset starts from 0.<br>**Default**: `0` |
| `batchNumber` | `number \| undefined` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber. |
| `batchSize` | `number \| undefined` | Optional | The number of records that should be included in the response starting from offset position. If no input is provided, then all records starting from the value provided in offset is included in the response. |
| `sortBy` | [`SearchConnectionSortByEnum \| undefined`](../../doc/models/search-connection-sort-by-enum.md) | Optional | Field based on which the response needs to be ordered.<br>**Default**: `SearchConnectionSortByEnum.DEFAULT` |
| `sortOrder` | [`SearchConnectionSortOrderEnum \| undefined`](../../doc/models/search-connection-sort-order-enum.md) | Optional | Order in which sortBy should be applied.<br>**Default**: `SearchConnectionSortOrderEnum.DEFAULT` |
| `type` | [`SearchConnectionTypeEnum`](../../doc/models/search-connection-type-enum.md) | Required | Type of the connect being searched. Valid values: |
| `namePattern` | `string \| undefined` | Optional | A pattern to match the name of the connection. This parameter supports matching case-insensitive strings. For a wildcard match, use %. |
| `fetchId` | `string[] \| undefined` | Optional | A JSON array containing the GUIDs of the connections that you want to fetch. |
| `skipId` | `string[] \| undefined` | Optional | A JSON array containing the GUIDs of the connections that you want to skip. |
| `tag` | [`TagNameAndIdInput[] \| undefined`](../../doc/models/tag-name-and-id-input.md) | Optional | A JSON array of name or GUID of tags or both. When both are given then id is considered |

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

