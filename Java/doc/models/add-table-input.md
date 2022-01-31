
# Add Table Input

## Structure

`AddTableInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the table | String getName() | setName(String name) |
| `DbName` | `String` | Required | Name of the database in the data platform | String getDbName() | setDbName(String dbName) |
| `SchemaName` | `String` | Required | Name of the schema in the database | String getSchemaName() | setSchemaName(String schemaName) |
| `Columns` | [`List<ColumnsInput>`](/doc/models/columns-input.md) | Required | A JSON array of column details | List<ColumnsInput> getColumns() | setColumns(List<ColumnsInput> columns) |

## Example (as JSON)

```json
{
  "name": "name0",
  "dbName": "dbName8",
  "schemaName": "schemaName4",
  "columns": [
    {
      "name": "name0",
      "dataType": "dataType2"
    }
  ]
}
```

