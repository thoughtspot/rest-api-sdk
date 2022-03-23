
# Metadata Tag Response

## Structure

`MetadataTagResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the tag |
| `Id` | `string` | Optional | GUID of the tag |
| `ClientState` | [`Models.ClientState`](../../doc/models/client-state.md) | Optional | - |
| `IndexVersion` | `double?` | Optional | - |
| `GenerationNum` | `double?` | Optional | - |
| `IsDeleted` | `bool?` | Optional | Indicates if the tag is deleted |
| `IsHidden` | `bool?` | Optional | Indicates if the tag is hidden |
| `IsExternal` | `bool?` | Optional | Indicates if the tag is from external system |
| `IsDeprecated` | `bool?` | Optional | - |
| `Created` | `double?` | Optional | Date and time when group was created |
| `Modified` | `double?` | Optional | Date and time of last modification of the group |
| `ModifiedBy` | [`Models.TagNameAndID`](../../doc/models/tag-name-and-id.md) | Optional | - |
| `Author` | [`Models.TagNameAndID`](../../doc/models/tag-name-and-id.md) | Optional | - |
| `Owner` | [`Models.TagNameAndID`](../../doc/models/tag-name-and-id.md) | Optional | - |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "clientState": null,
  "indexVersion": null,
  "generationNum": null,
  "isDeleted": null,
  "isHidden": null,
  "isExternal": null,
  "isDeprecated": null,
  "created": null,
  "modified": null,
  "modifiedBy": null,
  "author": null,
  "owner": null
}
```

