
# Access Level Input

## Structure

`AccessLevelInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Username or name of the user group |
| `id` | `string` | Optional | GUID of the user or user group |
| `mtype` | [`Type1Enum`](/doc/models/type-1-enum.md) | Optional | Type of access detail provided |
| `access` | [`AccessEnum`](/doc/models/access-enum.md) | Optional | Minimum access level that the specified user or user group has. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "type": null,
  "access": null
}
```

