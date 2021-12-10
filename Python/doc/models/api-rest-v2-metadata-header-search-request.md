
# Api Rest V2 Metadata Header Search Request

## Structure

`ApiRestV2MetadataHeaderSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `output_fields` | `List of string` | Optional | Array of header field names that need to be included in the header response |
| `offset` | `string` | Optional | The offset point, starting from where the records should be included in the response. If no input is provided then offset starts from 0.<br>**Default**: `'0'` |
| `batch_size` | `string` | Optional | The number of records that should be included in the response starting from offset position. If no input is provided, then all records starting from the value provided in offset is included in the response. |
| `sort_by` | [`SortByEnum`](/doc/models/sort-by-enum.md) | Optional | Field based on which the response needs to be ordered.<br>**Default**: `'DEFAULT'` |
| `sort_order` | [`SortOrderEnum`](/doc/models/sort-order-enum.md) | Optional | Order in which sortBy should be applied.<br>**Default**: `'DEFAULT'` |
| `mtype` | [`Type9Enum`](/doc/models/type-9-enum.md) | Required | Type of the metadata object being searched. |
| `name_pattern` | `string` | Optional | A pattern to match the name of the metadata object. This parameter supports matching case-insensitive strings. For a wildcard match, use %. |
| `fetch_id` | `List of string` | Optional | A JSON array containing the GUIDs of the metadata objects that you want to fetch. |
| `skip_id` | `List of string` | Optional | A JSON array containing the GUIDs of the metadata objects that you want to skip. |
| `show_hidden` | `bool` | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `False` |
| `auto_created` | [`AutoCreatedEnum`](/doc/models/auto-created-enum.md) | Optional | String for UI and backend boolean- A flag to indicate whether to list only the auto created objects. When no value is provided as input then all objects are returned. |
| `access_level` | [`List of AccessLevelInput`](/doc/models/access-level-input.md) | Optional | A JSON array of objects with user details for which the metadata objects should be considered from the repository If you specify ID or name of user and set the type parameter to USER, the API returns metadata objects associated with the user If you specify ID or name of user group and set the type parameter to USER_GROUP, the API returns metadata objects for all the users mapped to the specified user group. If the id or name parameter is not defined, but the type attribute is set to USER or USER_GROUP, then the API will not return and response. If no input is provided for any field for this object, then the API returns headers for all users. If both name and id is provided, then id will be considered. |
| `tag` | [`List of TagNameAndIdInput`](/doc/models/tag-name-and-id-input.md) | Optional | A JSON array of name or GUID of tags or both. When both are given then id is considered. |
| `favorite_for` | [`List of NameAndIdInput`](/doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both for whom the object is assigned as favorite. When both are given then id is considered. |
| `created_by` | [`List of NameAndIdInput`](/doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who created the object. When both are given then id is considered. |
| `last_modified_by` | [`List of NameAndIdInput`](/doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who last modified the object. When both are given then id is considered. |
| `owned_by` | [`List of NameAndIdInput`](/doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who last modified the object. When both are given then id is considered. |

## Example (as JSON)

```json
{
  "outputFields": null,
  "offset": null,
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
  "createdBy": null,
  "lastModifiedBy": null,
  "ownedBy": null
}
```

