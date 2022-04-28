
# Connection Columns Shema

## Structure

`ConnectionColumnsShema`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the table | String getName() | setName(String name) |
| `DbName` | `String` | Optional | Name of the database | String getDbName() | setDbName(String dbName) |
| `SchemaName` | `String` | Optional | Name of the schema | String getSchemaName() | setSchemaName(String schemaName) |
| `Columns` | [`List<TableColumns>`](../../doc/models/table-columns.md) | Optional | List of columns in the table | List<TableColumns> getColumns() | setColumns(List<TableColumns> columns) |

## Example (as JSON)

```json
{
  "name": null,
  "dbName": null,
  "schemaName": null,
  "columns": null
}
```

