
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
| `IsExternal` | `bool?` | Optional | - |
| `IsDeprecated` | `bool?` | Optional | Indicates if the table is deprecated |
| `IsDeleted` | `bool?` | Optional | Indicates if the table is deleted |
| `IsHidden` | `bool?` | Optional | Indicates if the table is hideen |
| `IndexVersion` | `int?` | Optional | - |
| `GenerationNum` | `int?` | Optional | - |
| `Created` | `string` | Optional | Date and time when the table was created |
| `Modified` | `string` | Optional | Date and time of last modification of the table |
| `Author` | [`Models.UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `ModifiedBy` | [`Models.UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `Owner` | [`Models.UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
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

