
# Tspublic Rest V2 Connection Removetable Request

## Structure

`TspublicRestV2ConnectionRemovetableRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Required | GUID of the connection |
| `Table` | [`List<Models.TableInput>`](../../doc/models/table-input.md) | Required | A JSON array of name or GUIDs of the table or both. At least one input is required. Provide either table name or id. When both are given then id is considered |

## Example (as JSON)

```json
{
  "id": "id0",
  "table": [
    {
      "name": null,
      "id": null
    }
  ]
}
```

