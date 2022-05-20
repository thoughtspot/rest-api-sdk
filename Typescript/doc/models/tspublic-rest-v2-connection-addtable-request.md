
# Tspublic Rest V2 Connection Addtable Request

## Structure

`TspublicRestV2ConnectionAddtableRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | GUID of the connection |
| `table` | [`AddTableInput[]`](../../doc/models/add-table-input.md) | Required | - |

## Example (as JSON)

```json
{
  "id": "id0",
  "table": [
    {
      "name": "name6",
      "dbName": "dbName4",
      "schemaName": "schemaName0",
      "columns": [
        {
          "name": "name6",
          "dataType": "dataType8"
        }
      ]
    }
  ]
}
```

