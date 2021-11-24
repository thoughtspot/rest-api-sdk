
# Api Rest V2 Group Addprivilege Request

## Structure

`ApiRestV2GroupAddprivilegeRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the group |
| `id` | `string` | Optional | The GUID of the group. |
| `privileges` | [`List of PrivilegeEnum`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges to be assigned to the group |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```
