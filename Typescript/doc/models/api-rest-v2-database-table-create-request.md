
# Api Rest V2 Database Table Create Request

## Structure

`ApiRestV2DatabaseTableCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `createDatabase` | `boolean \| undefined` | Optional | Flag to indicate if the database and schema should be created if they do not exist in Falcon. (Valid values: True/False)<br>**Default**: `true` |
| `schema` | `string \| undefined` | Optional | DDL of the table to be created. |

## Example (as JSON)

```json
{
  "createDatabase": null,
  "schema": null
}
```

