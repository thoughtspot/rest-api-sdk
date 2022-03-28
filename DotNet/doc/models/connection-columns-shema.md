
# Connection Columns Shema

## Structure

`ConnectionColumnsShema`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the table |
| `DbName` | `string` | Optional | Name of the database |
| `SchemaName` | `string` | Optional | Name of the schema |
| `Columns` | [`List<Models.TableColumns>`](../../doc/models/table-columns.md) | Optional | List of columns in the table |

## Example (as JSON)

```json
{
  "name": null,
  "dbName": null,
  "schemaName": null,
  "columns": null
}
```

