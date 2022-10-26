
# Tspublic Rest V2 Group Addgroup Request

## Structure

`TspublicRestV2GroupAddgroupRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the group |
| `Id` | `string` | Optional | The GUID of the group to query. |
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

