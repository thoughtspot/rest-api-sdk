
# Api Rest V2 Group Adduser Request

## Structure

`ApiRestV2GroupAdduserRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the group |
| `id` | `string \| undefined` | Optional | The GUID of the group |
| `users` | [`UserNameAndIDInput[] \| undefined`](/doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "users": null
}
```

