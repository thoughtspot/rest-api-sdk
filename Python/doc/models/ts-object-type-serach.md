
# Ts Object Type Serach

## Structure

`TsObjectTypeSerach`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Optional | GUID of the object |
| `name` | `string` | Optional | Name of the object |
| `owner` | `string` | Optional | Owner of the object |
| `author` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `permission` | `string` | Optional | Indicates the permission which user or user group has on the object |
| `shared_permission` | `string` | Optional | Indicates the permission which user or user group has on the object through sharing of the object with the user or user group |
| `group_permission` | [`List of GroupPermission`](../../doc/models/group-permission.md) | Optional | An array of object with details of permission on the user groups to which the user or user group belongs |

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

