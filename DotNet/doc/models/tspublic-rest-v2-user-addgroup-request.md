
# Tspublic Rest V2 User Addgroup Request

## Structure

`TspublicRestV2UserAddgroupRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | User name of the user account |
| `Id` | `string` | Optional | The GUID of the user account |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Required | Array of objects of groups that the user belong to. |

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

