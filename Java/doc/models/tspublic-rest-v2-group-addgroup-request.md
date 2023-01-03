
# Tspublic Rest V2 Group Addgroup Request

## Structure

`TspublicRestV2GroupAddgroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Required | Array of objects of groups that the user belong to. | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |

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

