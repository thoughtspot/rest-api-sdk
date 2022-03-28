
# Dependent Permission

## Structure

`DependentPermission`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Optional | GUID of the object |
| `name` | `string` | Optional | Name of the object |
| `mtype` | `string` | Optional | Indicates the type of the object |
| `permission` | `string` | Optional | Indicates the permission which user or user group has on the object |
| `shared_permission` | `string` | Optional | Indicates the permission which user or user group has on the object through sharing of the object with this user or user group |
| `group_permission` | [`List of GroupPermission`](../../doc/models/group-permission.md) | Optional | An array of object with details of permission on the user groups to which the user or user group belongs |

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

