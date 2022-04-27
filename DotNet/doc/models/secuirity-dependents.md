
# Secuirity Dependents

## Structure

`SecuirityDependents`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Optional | GUID of the object |
| `Name` | `string` | Optional | Name of the object |
| `Type` | `string` | Optional | Indicates the type of the object |
| `Owner` | `string` | Optional | Owner of the object |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Permissions` | [`List<Models.DependentPermission>`](../../doc/models/dependent-permission.md) | Optional | - |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "owner": null,
  "author": null,
  "permissions": null
}
```

