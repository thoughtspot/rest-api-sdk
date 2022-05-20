
# Tspublic Rest V2 Metadata Detail Search Request

## Structure

`TspublicRestV2MetadataDetailSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`SearchObjectDetailTypeEnum`](../../doc/models/search-object-detail-type-enum.md) | Required | Type of the metadata object being searched. Valid values |
| `id` | `string[]` | Required | A JSON array of GUIDs of the objects. |
| `showHidden` | [`SearchObjectDetailShowHiddenEnum \| undefined`](../../doc/models/search-object-detail-show-hidden-enum.md) | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `SearchObjectDetailShowHiddenEnum.False` |
| `dropQuestionDetails` | [`SearchObjectDetailDropQuestionDetailsEnum \| undefined`](../../doc/models/search-object-detail-drop-question-details-enum.md) | Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for DATAOBJECT data type.<br>**Default**: `SearchObjectDetailDropQuestionDetailsEnum.False` |
| `version` | `string \| undefined` | Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. |

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

