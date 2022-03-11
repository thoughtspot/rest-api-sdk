
# Tspublic Rest V2 Metadata Detail Search Request

## Structure

`TspublicRestV2MetadataDetailSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type11Enum`](../../doc/models/type-11-enum.md) | Required | Type of the metadata object being searched. Valid values | Type11Enum getType() | setType(Type11Enum type) |
| `Id` | `List<String>` | Required | A JSON array of GUIDs of the objects. | List<String> getId() | setId(List<String> id) |
| `ShowHidden` | [`ShowHiddenEnum`](../../doc/models/show-hidden-enum.md) | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `ShowHiddenEnum.ENUM_FALSE` | ShowHiddenEnum getShowHidden() | setShowHidden(ShowHiddenEnum showHidden) |
| `DropQuestionDetails` | [`DropQuestionDetailsEnum`](../../doc/models/drop-question-details-enum.md) | Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for DATAOBJECT data type.<br>**Default**: `DropQuestionDetailsEnum.ENUM_FALSE` | DropQuestionDetailsEnum getDropQuestionDetails() | setDropQuestionDetails(DropQuestionDetailsEnum dropQuestionDetails) |
| `Version` | `String` | Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. | String getVersion() | setVersion(String version) |

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

