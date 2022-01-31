
# Add Table Input

## Structure

`AddTableInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Required | Name of the table |
| `DbName` | `string` | Required | Name of the database in the data platform |
| `SchemaName` | `string` | Required | Name of the schema in the database |
| `Columns` | [`List<Models.ColumnsInput>`](/doc/models/columns-input.md) | Required | A JSON array of column details |

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

