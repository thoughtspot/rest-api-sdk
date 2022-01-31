
# Api Rest V2 Connection Search Request

## Structure

`ApiRestV2ConnectionSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offset` | `Integer` | Optional | The offset point, starting from where the records should be included in the response.<br><br>If no input is provided then offset starts from 0.<br>**Default**: `0` | Integer getOffset() | setOffset(Integer offset) |
| `BatchNumber` | `Integer` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber. | Integer getBatchNumber() | setBatchNumber(Integer batchNumber) |
| `BatchSize` | `Integer` | Optional | The number of records that should be included in the response starting from offset position. If no input is provided, then all records starting from the value provided in offset is included in the response. | Integer getBatchSize() | setBatchSize(Integer batchSize) |
| `SortBy` | [`SortByEnum`](/doc/models/sort-by-enum.md) | Optional | Field based on which the response needs to be ordered.<br>**Default**: `SortByEnum.DEFAULT` | SortByEnum getSortBy() | setSortBy(SortByEnum sortBy) |
| `SortOrder` | [`SortOrderEnum`](/doc/models/sort-order-enum.md) | Optional | Order in which sortBy should be applied.<br>**Default**: `SortOrderEnum.DEFAULT` | SortOrderEnum getSortOrder() | setSortOrder(SortOrderEnum sortOrder) |
| `Type` | [`Type14Enum`](/doc/models/type-14-enum.md) | Required | Type of the connect being searched. Valid values: | Type14Enum getType() | setType(Type14Enum type) |
| `NamePattern` | `String` | Optional | A pattern to match the name of the connection. This parameter supports matching case-insensitive strings. For a wildcard match, use %. | String getNamePattern() | setNamePattern(String namePattern) |
| `FetchId` | `List<String>` | Optional | A JSON array containing the GUIDs of the connections that you want to fetch. | List<String> getFetchId() | setFetchId(List<String> fetchId) |
| `SkipId` | `List<String>` | Optional | A JSON array containing the GUIDs of the connections that you want to skip. | List<String> getSkipId() | setSkipId(List<String> skipId) |
| `Tag` | [`List<TagNameAndIdInput>`](/doc/models/tag-name-and-id-input.md) | Optional | A JSON array of name or GUID of tags or both. When both are given then id is considered | List<TagNameAndIdInput> getTag() | setTag(List<TagNameAndIdInput> tag) |

## Example (as JSON)

```json
{
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "sortBy": null,
  "sortOrder": null,
  "type": "SNOWFLAKE",
  "namePattern": null,
  "fetchId": null,
  "skipId": null,
  "tag": null
}
```

