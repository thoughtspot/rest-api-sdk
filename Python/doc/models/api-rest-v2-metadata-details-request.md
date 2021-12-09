
# Api Rest V2 Metadata Details Request

## Structure

`ApiRestV2MetadataDetailsRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mtype` | [`Type9Enum`](/doc/models/type-9-enum.md) | Required | Type of the metadata object being searched. Valid values |
| `id` | `List of string` | Required | A JSON array of GUIDs of the objects. |
| `show_hidden` | `bool` | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `False` |
| `drop_question_details` | `bool` | Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for LOGICAL_TABLE data type.<br>**Default**: `False` |
| `version` | `string` | Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. |

## Example (as JSON)

```json
{
  "type": "DATAOBJECT",
  "id": [
    "id0"
  ],
  "showHidden": null,
  "dropQuestionDetails": null,
  "version": null
}
```

