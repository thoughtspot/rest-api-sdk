
# Tspublic Rest V2 Connection Removetable Request

## Structure

`TspublicRestV2ConnectionRemovetableRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Required | GUID of the connection |
| `Table` | [`List<Models.TableInput>`](../../doc/models/table-input.md) | Required | - |

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

