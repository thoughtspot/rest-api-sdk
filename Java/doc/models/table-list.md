
# Table List

## Structure

`TableList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the table | String getName() | setName(String name) |
| `Type` | `String` | Optional | Type of the table | String getType() | setType(String type) |
| `Id` | `String` | Optional | GUID of the table | String getId() | setId(String id) |
| `DatabaseStripe` | `String` | Optional | Name of the database to which the table belongs | String getDatabaseStripe() | setDatabaseStripe(String databaseStripe) |
| `SchemaStripe` | `String` | Optional | Name of the schema to which the table belongs | String getSchemaStripe() | setSchemaStripe(String schemaStripe) |
| `IsExternal` | [`TableListIsExternalEnum`](../../doc/models/table-list-is-external-enum.md) | Optional | - | TableListIsExternalEnum getIsExternal() | setIsExternal(TableListIsExternalEnum isExternal) |
| `IsDeprecated` | [`TableListIsDeprecatedEnum`](../../doc/models/table-list-is-deprecated-enum.md) | Optional | Indicates if the table is deprecated | TableListIsDeprecatedEnum getIsDeprecated() | setIsDeprecated(TableListIsDeprecatedEnum isDeprecated) |
| `IsDeleted` | [`TableListIsDeletedEnum`](../../doc/models/table-list-is-deleted-enum.md) | Optional | Indicates if the table is deleted | TableListIsDeletedEnum getIsDeleted() | setIsDeleted(TableListIsDeletedEnum isDeleted) |
| `IsHidden` | [`TableListIsHiddenEnum`](../../doc/models/table-list-is-hidden-enum.md) | Optional | Indicates if the table is hideen | TableListIsHiddenEnum getIsHidden() | setIsHidden(TableListIsHiddenEnum isHidden) |
| `IndexVersion` | `Double` | Optional | - | Double getIndexVersion() | setIndexVersion(Double indexVersion) |
| `GenerationNum` | `Double` | Optional | - | Double getGenerationNum() | setGenerationNum(Double generationNum) |
| `Created` | `String` | Optional | Date and time when the table was created | String getCreated() | setCreated(String created) |
| `Modified` | `String` | Optional | Date and time of last modification of the table | String getModified() | setModified(String modified) |
| `Author` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `ModifiedBy` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getModifiedBy() | setModifiedBy(UserNameAndID modifiedBy) |
| `Owner` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getOwner() | setOwner(UserNameAndID owner) |
| `Tags` | `List<String>` | Optional | List of tags assigned to the table | List<String> getTags() | setTags(List<String> tags) |

## Example (as JSON)

```json
{
  "name": null,
  "type": null,
  "id": null,
  "databaseStripe": null,
  "schemaStripe": null,
  "isExternal": null,
  "isDeprecated": null,
  "isDeleted": null,
  "isHidden": null,
  "indexVersion": null,
  "generationNum": null,
  "created": null,
  "modified": null,
  "author": null,
  "modifiedBy": null,
  "owner": null,
  "tags": null
}
```

