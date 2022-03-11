
# Access Level Input

## Structure

`AccessLevelInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Username or name of the user group |
| `id` | `string \| undefined` | Optional | GUID of the user or user group |
| `type` | [`Type1Enum \| undefined`](../../doc/models/type-1-enum.md) | Optional | Type of access detail provided |
| `access` | [`AccessEnum \| undefined`](../../doc/models/access-enum.md) | Optional | Minimum access level that the specified user or user group has. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "type": null,
  "access": null
}
```

