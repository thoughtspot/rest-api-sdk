
# Security Permission Response

## Structure

`SecurityPermissionResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string \| undefined` | Optional | GUID of the object |
| `name` | `string \| undefined` | Optional | Name of the object |
| `type` | `string \| undefined` | Optional | Indicates the type of the object |
| `owner` | `string \| undefined` | Optional | GUID of the owner of the object |
| `author` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `permissions` | [`SecurityPermission[] \| undefined`](../../doc/models/security-permission.md) | Optional | An array of object with details of permission on users and user groups |
| `dependents` | [`SecuirityDependents[] \| undefined`](../../doc/models/secuirity-dependents.md) | Optional | The objects on which the primary object is dependent on |

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

