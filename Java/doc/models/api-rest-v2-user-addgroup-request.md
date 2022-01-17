
# Api Rest V2 User Addgroup Request

## Structure

`ApiRestV2UserAddgroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username of the user account | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account | String getId() | setId(String id) |
| `Groups` | [`List<GroupNameAndIDInput>`](/doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "groups": null
}
```

