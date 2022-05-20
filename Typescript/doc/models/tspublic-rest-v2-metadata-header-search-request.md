
# Tspublic Rest V2 Metadata Header Search Request

## Structure

`TspublicRestV2MetadataHeaderSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `outputFields` | `string[] \| undefined` | Optional | Array of header field names that need to be included in the header response |
| `offset` | `number \| undefined` | Optional | The offset point, starting from where the records should be included in the response.<br><br>If no input is provided then offset starts from 0.<br>**Default**: `0` |
| `batchNumber` | `number \| undefined` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber.<br><br>Example:<br><br>Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered. |
| `batchSize` | `number \| undefined` | Optional | The number of records that should be included in the response starting from offset position.<br><br>If no input is provided, then all records starting from the value provided in offset is included in the response. |
| `sortBy` | [`SearchObjectHeaderSortByEnum \| undefined`](../../doc/models/search-object-header-sort-by-enum.md) | Optional | Field based on which the response needs to be ordered.<br>**Default**: `SearchObjectHeaderSortByEnum.DEFAULT` |
| `sortOrder` | [`SearchObjectHeaderSortOrderEnum \| undefined`](../../doc/models/search-object-header-sort-order-enum.md) | Optional | Order in which sortBy should be applied.<br>**Default**: `SearchObjectHeaderSortOrderEnum.DEFAULT` |
| `type` | [`SearchObjectHeaderTypeEnum`](../../doc/models/search-object-header-type-enum.md) | Required | Type of the metadata object being searched. |
| `namePattern` | `string \| undefined` | Optional | A pattern to match the name of the metadata object. This parameter supports matching case-insensitive strings. For a wildcard match, use %. |
| `fetchId` | `string[] \| undefined` | Optional | A JSON array containing the GUIDs of the metadata objects that you want to fetch. |
| `skipId` | `string[] \| undefined` | Optional | A JSON array containing the GUIDs of the metadata objects that you want to skip. |
| `showHidden` | [`SearchObjectHeaderShowHiddenEnum \| undefined`](../../doc/models/search-object-header-show-hidden-enum.md) | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `SearchObjectHeaderShowHiddenEnum.False` |
| `autoCreated` | [`SearchObjectHeaderAutoCreatedEnum \| undefined`](../../doc/models/search-object-header-auto-created-enum.md) | Optional | A flag to indicate whether to list only the auto created objects. When no value is provided as input then all objects are returned. |
| `accessLevel` | [`AccessLevelInput[] \| undefined`](../../doc/models/access-level-input.md) | Optional | A JSON array of objects with user details for which the metadata objects should be considered from the repository If you specify ID or name of user and set the type parameter to USER, the API returns metadata objects associated with the user If you specify ID or name of user group and set the type parameter to USER_GROUP, the API returns metadata objects for all the users mapped to the specified user group. If the id or name parameter is not defined, but the type attribute is set to USER or USER_GROUP, then the API will not return and response. If no input is provided for any field for this object, then the API returns headers for all users. If both name and id is provided, then id will be considered. |
| `tag` | [`TagNameAndIdInput[] \| undefined`](../../doc/models/tag-name-and-id-input.md) | Optional | A JSON array of name or GUID of tags or both. When both are given then id is considered. |
| `favoriteFor` | [`NameAndIdInput[] \| undefined`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both for whom the object is assigned as favorite. When both are given then id is considered. |
| `author` | [`NameAndIdInput[] \| undefined`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who created the object. When both are given then id is considered. |
| `lastModifiedBy` | [`NameAndIdInput[] \| undefined`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who last modified the object. When both are given then id is considered. |

## Example (as JSON)

```json
{
  "outputFields": null,
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "sortBy": null,
  "sortOrder": null,
  "type": "COLUMN_ALL",
  "namePattern": null,
  "fetchId": null,
  "skipId": null,
  "showHidden": null,
  "autoCreated": null,
  "accessLevel": null,
  "tag": null,
  "favoriteFor": null,
  "author": null,
  "lastModifiedBy": null
}
```
