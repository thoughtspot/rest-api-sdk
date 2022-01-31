
# Add Table Input

## Structure

`AddTableInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the table |
| `dbName` | `string` | Required | Name of the database in the data platform |
| `schemaName` | `string` | Required | Name of the schema in the database |
| `columns` | [`ColumnsInput[]`](/doc/models/columns-input.md) | Required | A JSON array of column details |

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

