
# Api Rest V2 Connection Removetable Request

## Structure

`ApiRestV2ConnectionRemovetableRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | GUID of the connection |
| `tables` | [`List of TableInput`](/doc/models/table-input.md) | Required | A JSON array of name or GUIDs of the table or both.<br><br>At least one input is required. Provide either table name or id. When both are given then id is considered |

## Example (as JSON)

```json
{
  "id": "id0",
  "tables": [
    {
      "name": null,
      "id": null
    },
    {
      "name": null,
      "id": null
    }
  ]
}
```

