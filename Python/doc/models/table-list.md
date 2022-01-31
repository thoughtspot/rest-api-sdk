
# Table List

## Structure

`TableList`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the table |
| `mtype` | `string` | Optional | Type of the table |
| `id` | `string` | Optional | GUID of the table |
| `database_stripe` | `string` | Optional | Name of the database to which the table belongs |
| `schema_stripe` | `string` | Optional | Name of the schema to which the table belongs |
| `is_external` | `bool` | Optional | - |
| `is_deprecated` | `bool` | Optional | Indicates if the table is deprecated |
| `is_deleted` | `bool` | Optional | Indicates if the table is deleted |
| `is_hidden` | `bool` | Optional | Indicates if the table is hideen |
| `index_version` | `int` | Optional | - |
| `generation_num` | `int` | Optional | - |
| `created` | `string` | Optional | Date and time when the table was created |
| `modified` | `string` | Optional | Date and time of last modification of the table |
| `author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `modified_by` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `tags` | `List of string` | Optional | List of tags assigned to the table |

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

