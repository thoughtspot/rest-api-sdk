
# Table List

## Structure

`TableList`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the table |
| `Type` | `string` | Optional | Type of the table |
| `Id` | `string` | Optional | GUID of the table |
| `DatabaseStripe` | `string` | Optional | Name of the database to which the table belongs |
| `SchemaStripe` | `string` | Optional | Name of the schema to which the table belongs |
| `IsExternal` | [`Models.TableListIsExternalEnum?`](../../doc/models/table-list-is-external-enum.md) | Optional | - |
| `IsDeprecated` | [`Models.TableListIsDeprecatedEnum?`](../../doc/models/table-list-is-deprecated-enum.md) | Optional | Indicates if the table is deprecated |
| `IsDeleted` | [`Models.TableListIsDeletedEnum?`](../../doc/models/table-list-is-deleted-enum.md) | Optional | Indicates if the table is deleted |
| `IsHidden` | [`Models.TableListIsHiddenEnum?`](../../doc/models/table-list-is-hidden-enum.md) | Optional | Indicates if the table is hideen |
| `IndexVersion` | `double?` | Optional | - |
| `GenerationNum` | `double?` | Optional | - |
| `Created` | `string` | Optional | Date and time when the table was created |
| `Modified` | `string` | Optional | Date and time of last modification of the table |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `ModifiedBy` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Owner` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Tags` | `List<string>` | Optional | List of tags assigned to the table |

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

