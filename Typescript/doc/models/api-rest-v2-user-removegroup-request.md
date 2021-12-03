
# Api Rest V2 User Removegroup Request

## Structure

`ApiRestV2UserRemovegroupRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | User name of the user account |
| `id` | `string \| undefined` | Optional | The GUID of the user account |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](/doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "groups": null
}
```

