
# Tspublic Rest V2 Connection Addtable Request

## Structure

`TspublicRestV2ConnectionAddtableRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the connection | String getId() | setId(String id) |
| `Table` | [`List<AddTableInput>`](../../doc/models/add-table-input.md) | Required | - | List<AddTableInput> getTable() | setTable(List<AddTableInput> table) |

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

