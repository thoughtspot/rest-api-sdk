
# Api Rest V2 Group Removeprivilege Request

## Structure

`ApiRestV2GroupRemoveprivilegeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Privileges` | [`List<Privilege1Enum>`](/doc/models/privilege-1-enum.md) | Optional | List of privileges | List<Privilege1Enum> getPrivileges() | setPrivileges(List<Privilege1Enum> privileges) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

