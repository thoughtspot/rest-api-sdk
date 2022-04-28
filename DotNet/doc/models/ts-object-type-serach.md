
# Ts Object Type Serach

## Structure

`TsObjectTypeSerach`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Optional | GUID of the object |
| `Name` | `string` | Optional | Name of the object |
| `Owner` | `string` | Optional | Owner of the object |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Permission` | `string` | Optional | Indicates the permission which user or user group has on the object |
| `SharedPermission` | `string` | Optional | Indicates the permission which user or user group has on the object through sharing of the object with the user or user group |
| `GroupPermission` | [`List<Models.GroupPermission>`](../../doc/models/group-permission.md) | Optional | An array of object with details of permission on the user groups to which the user or user group belongs |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "owner": null,
  "author": null,
  "permission": null,
  "sharedPermission": null,
  "groupPermission": null
}
```

