
# Security Permission Response

## Structure

`SecurityPermissionResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Optional | GUID of the object |
| `name` | `string` | Optional | Name of the object |
| `mtype` | `string` | Optional | Indicates the type of the object |
| `owner` | `string` | Optional | GUID of the owner of the object |
| `author` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `permissions` | [`List of SecurityPermission`](../../doc/models/security-permission.md) | Optional | An array of object with details of permission on users and user groups |
| `dependents` | [`List of SecuirityDependents`](../../doc/models/secuirity-dependents.md) | Optional | The objects on which the primary object is dependent on |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "owner": null,
  "author": null,
  "permissions": null,
  "dependents": null
}
```

