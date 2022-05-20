
# Add Table Input

## Structure

`AddTableInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the table |
| `db_name` | `string` | Required | Name of the database in the data platform |
| `schema_name` | `string` | Required | Name of the schema in the database |
| `columns` | [`List of ColumnsInput`](../../doc/models/columns-input.md) | Required | A JSON array of column details |

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

