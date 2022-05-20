
# Principal Search Response

## Structure

`PrincipalSearchResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string \| undefined` | Optional | GUID of the user or user group |
| `name` | `string \| undefined` | Optional | Name of the user or user group |
| `type` | `string \| undefined` | Optional | Indicates the type of principal |
| `permissions` | [`PermissionsTypeSearch[] \| undefined`](../../doc/models/permissions-type-search.md) | Optional | Indicates the permission which user or user group has on the object |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "permissions": null
}
```

