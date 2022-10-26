
# Access Level Input

## Structure

`AccessLevelInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username or name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the user or user group | String getId() | setId(String id) |
| `Type` | [`Type1Enum`](../../doc/models/type-1-enum.md) | Optional | Type of access detail provided | Type1Enum getType() | setType(Type1Enum type) |
| `Access` | [`AccessEnum`](../../doc/models/access-enum.md) | Optional | Minimum access level that the specified user or user group has. If no input is provided then minimum access of READ_ONLY will be considered. | AccessEnum getAccess() | setAccess(AccessEnum access) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "type": null,
  "access": null
}
```

