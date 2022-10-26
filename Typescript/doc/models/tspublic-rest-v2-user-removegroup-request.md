
# Tspublic Rest V2 User Removegroup Request

## Structure

`TspublicRestV2UserRemovegroupRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | User name of the user account |
| `id` | `string \| undefined` | Optional | The GUID of the user account |
| `groups` | [`GroupNameAndIDInput[]`](../../doc/models/group-name-and-id-input.md) | Required | Array of objects of groups that the user belong to. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "groups": [
    {
      "name": null,
      "id": null
    },
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

