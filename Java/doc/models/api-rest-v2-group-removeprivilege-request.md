
# Api Rest V2 Group Removeprivilege Request

## Structure

`ApiRestV2GroupRemoveprivilegeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Privileges` | [`List<PrivilegeEnum>`](/doc/models/privilege-enum.md) | Optional | List of privileges | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

