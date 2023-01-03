
# Tspublic Rest V2 User Addgroup Request

## Structure

`TspublicRestV2UserAddgroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | User name of the user account | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account | String getId() | setId(String id) |
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

