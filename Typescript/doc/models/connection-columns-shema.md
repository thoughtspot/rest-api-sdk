
# Connection Columns Shema

## Structure

`ConnectionColumnsShema`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the table |
| `dbName` | `string \| undefined` | Optional | Name of the database |
| `schemaName` | `string \| undefined` | Optional | Name of the schema |
| `columns` | [`TableColumns[] \| undefined`](../../doc/models/table-columns.md) | Optional | List of columns in the table |

## Example (as JSON)

```json
{
  "name": null,
  "dbName": null,
  "schemaName": null,
  "columns": null
}
```

