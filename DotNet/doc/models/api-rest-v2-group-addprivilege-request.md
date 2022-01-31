
# Api Rest V2 Group Addprivilege Request

## Structure

`ApiRestV2GroupAddprivilegeRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the group |
| `Id` | `string` | Optional | The GUID of the group to query. |
| `Privileges` | [`List<Models.PrivilegeEnum>`](/doc/models/privilege-enum.md) | Optional | List of privileges |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

