
# Access Level Input

## Structure

`AccessLevelInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Username or name of the user group |
| `id` | `string \| undefined` | Optional | GUID of the user or user group |
| `type` | [`AccessLevelInputTypeEnum \| undefined`](../../doc/models/access-level-input-type-enum.md) | Optional | Type of access detail provided |
| `access` | [`AccessLevelInputAccessEnum \| undefined`](../../doc/models/access-level-input-access-enum.md) | Optional | Minimum access level that the specified user or user group has. If no input is provided then minimum access of READ_ONLY will be considered. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "type": null,
  "access": null
}
```

