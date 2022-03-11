
# Table List

## Structure

`TableList`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the table |
| `type` | `string \| undefined` | Optional | Type of the table |
| `id` | `string \| undefined` | Optional | GUID of the table |
| `databaseStripe` | `string \| undefined` | Optional | Name of the database to which the table belongs |
| `schemaStripe` | `string \| undefined` | Optional | Name of the schema to which the table belongs |
| `isExternal` | `boolean \| undefined` | Optional | - |
| `isDeprecated` | `boolean \| undefined` | Optional | Indicates if the table is deprecated |
| `isDeleted` | `boolean \| undefined` | Optional | Indicates if the table is deleted |
| `isHidden` | `boolean \| undefined` | Optional | Indicates if the table is hideen |
| `indexVersion` | `number \| undefined` | Optional | - |
| `generationNum` | `number \| undefined` | Optional | - |
| `created` | `string \| undefined` | Optional | Date and time when the table was created |
| `modified` | `string \| undefined` | Optional | Date and time of last modification of the table |
| `author` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `modifiedBy` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `tags` | `string[] \| undefined` | Optional | List of tags assigned to the table |

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

