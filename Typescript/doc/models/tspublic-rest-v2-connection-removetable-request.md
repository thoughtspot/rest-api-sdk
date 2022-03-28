
# Tspublic Rest V2 Connection Removetable Request

## Structure

`TspublicRestV2ConnectionRemovetableRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | GUID of the connection |
| `table` | [`TableInput[]`](../../doc/models/table-input.md) | Required | - |

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

