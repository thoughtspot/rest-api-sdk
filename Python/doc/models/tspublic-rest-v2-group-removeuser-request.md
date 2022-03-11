
# Tspublic Rest V2 Group Removeuser Request

## Structure

`TspublicRestV2GroupRemoveuserRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the group |
| `id` | `string` | Optional | The GUID of the group to query. |
| `users` | [`List of UserNameAndIDInput`](../../doc/models/user-name-and-id-input.md) | Required | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "users": [
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

