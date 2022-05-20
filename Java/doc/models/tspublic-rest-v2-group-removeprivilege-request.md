
# Tspublic Rest V2 Group Removeprivilege Request

## Structure

`TspublicRestV2GroupRemoveprivilegeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Privileges` | [`List<RemovePrivilegesFromGroupPrivilegesEnum>`](../../doc/models/remove-privileges-from-group-privileges-enum.md) | Optional | List of privileges | List<RemovePrivilegesFromGroupPrivilegesEnum> getPrivileges() | setPrivileges(List<RemovePrivilegesFromGroupPrivilegesEnum> privileges) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

