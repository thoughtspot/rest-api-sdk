
# Tspublic Rest V2 Group Removeuser Request

## Structure

`TspublicRestV2GroupRemoveuserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Users` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Required | Array of user name that you want to delete from user group. | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |

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

