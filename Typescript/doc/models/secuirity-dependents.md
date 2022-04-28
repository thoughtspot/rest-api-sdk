
# Secuirity Dependents

## Structure

`SecuirityDependents`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string \| undefined` | Optional | GUID of the object |
| `name` | `string \| undefined` | Optional | Name of the object |
| `type` | `string \| undefined` | Optional | Indicates the type of the object |
| `owner` | `string \| undefined` | Optional | Owner of the object |
| `author` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `permissions` | [`DependentPermission[] \| undefined`](../../doc/models/dependent-permission.md) | Optional | - |

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

