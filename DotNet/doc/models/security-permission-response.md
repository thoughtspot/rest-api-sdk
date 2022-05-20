
# Security Permission Response

## Structure

`SecurityPermissionResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Optional | GUID of the object |
| `Name` | `string` | Optional | Name of the object |
| `Type` | `string` | Optional | Indicates the type of the object |
| `Owner` | `string` | Optional | GUID of the owner of the object |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Permissions` | [`List<Models.SecurityPermission>`](../../doc/models/security-permission.md) | Optional | An array of object with details of permission on users and user groups |
| `Dependents` | [`List<Models.SecuirityDependents>`](../../doc/models/secuirity-dependents.md) | Optional | The objects on which the primary object is dependent on |

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

