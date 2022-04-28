
# Security Permission

## Structure

`SecurityPermission`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Optional | GUID of the user or user group |
| `Name` | `string` | Optional | Name of the user or user group |
| `Type` | `string` | Optional | Indicates the type of principal |
| `Permission` | `string` | Optional | Indicates the permission which user or user group has on the object |
| `SharedPermission` | `string` | Optional | Indicates the permission which user or user group has on the object through sharing of the object with this user or user group |
| `GroupPermission` | [`List<Models.GroupPermission>`](../../doc/models/group-permission.md) | Optional | An array of object with details of permission on the user groups to which the user or user group belongs |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "permission": null,
  "sharedPermission": null,
  "groupPermission": null
}
```

