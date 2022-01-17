
# Api Rest V2 Group Removeuser Request

## Structure

`ApiRestV2GroupRemoveuserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Users` | [`List<UserNameAndIDInput>`](/doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "users": null
}
```

