
# Tspublic Rest V2 Group Removeprivilege Request

## Structure

`TspublicRestV2GroupRemoveprivilegeRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the group |
| `Id` | `string` | Optional | The GUID of the group to query. |
| `Privileges` | [`List<Models.RemovePrivilegesFromGroupPrivilegesEnum>`](../../doc/models/remove-privileges-from-group-privileges-enum.md) | Optional | List of privileges |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

