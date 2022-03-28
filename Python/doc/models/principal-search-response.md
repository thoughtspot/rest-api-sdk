
# Principal Search Response

## Structure

`PrincipalSearchResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Optional | GUID of the user or user group |
| `name` | `string` | Optional | Name of the user or user group |
| `mtype` | `string` | Optional | Indicates the type of principal |
| `permissions` | [`List of PermissionsTypeSearch`](../../doc/models/permissions-type-search.md) | Optional | Indicates the permission which user or user group has on the object |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "permissions": null
}
```

