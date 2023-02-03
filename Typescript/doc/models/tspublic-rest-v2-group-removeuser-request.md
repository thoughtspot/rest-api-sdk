
# Tspublic Rest V2 Group Removeuser Request

## Structure

`TspublicRestV2GroupRemoveuserRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the group |
| `id` | `string \| undefined` | Optional | The GUID of the group to query. |
| `users` | [`UserNameAndIDInput[]`](../../doc/models/user-name-and-id-input.md) | Required | Array of user name that you want to delete from user group. |

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
