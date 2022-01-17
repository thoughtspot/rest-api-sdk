
# Metadata Tag Response

## Structure

`MetadataTagResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the tag | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the tag | String getId() | setId(String id) |
| `ClientState` | [`ClientState`](/doc/models/client-state.md) | Optional | - | ClientState getClientState() | setClientState(ClientState clientState) |
| `IndexVersion` | `Integer` | Optional | - | Integer getIndexVersion() | setIndexVersion(Integer indexVersion) |
| `GenerationNum` | `Integer` | Optional | - | Integer getGenerationNum() | setGenerationNum(Integer generationNum) |
| `IsDeleted` | `Boolean` | Optional | Indicates if the tag is deleted | Boolean getIsDeleted() | setIsDeleted(Boolean isDeleted) |
| `IsHidden` | `Boolean` | Optional | Indicates if the tag is hidden | Boolean getIsHidden() | setIsHidden(Boolean isHidden) |
| `IsExternal` | `Boolean` | Optional | Indicates if the tag is from external system | Boolean getIsExternal() | setIsExternal(Boolean isExternal) |
| `IsDeprecated` | `Boolean` | Optional | - | Boolean getIsDeprecated() | setIsDeprecated(Boolean isDeprecated) |
| `Created` | `Double` | Optional | Date and time when group was created | Double getCreated() | setCreated(Double created) |
| `Modified` | `Double` | Optional | Date and time of last modification of the group | Double getModified() | setModified(Double modified) |
| `ModifiedBy` | [`TagNameAndID`](/doc/models/tag-name-and-id.md) | Optional | - | TagNameAndID getModifiedBy() | setModifiedBy(TagNameAndID modifiedBy) |
| `Author` | [`TagNameAndID`](/doc/models/tag-name-and-id.md) | Optional | - | TagNameAndID getAuthor() | setAuthor(TagNameAndID author) |
| `Owner` | [`TagNameAndID`](/doc/models/tag-name-and-id.md) | Optional | - | TagNameAndID getOwner() | setOwner(TagNameAndID owner) |

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

