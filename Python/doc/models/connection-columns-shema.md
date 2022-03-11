
# Connection Columns Shema

## Structure

`ConnectionColumnsShema`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the table |
| `db_name` | `string` | Optional | Name of the database |
| `schema_name` | `string` | Optional | Name of the schema |
| `columns` | [`List of TableColumns`](../../doc/models/table-columns.md) | Optional | List of columns in the table |

## Example (as JSON)

```json
{
  "name": null,
  "dbName": null,
  "schemaName": null,
  "columns": null
}
```

