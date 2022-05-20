
# Access Level Input

## Structure

`AccessLevelInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username or name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the user or user group | String getId() | setId(String id) |
| `Type` | [`AccessLevelInputTypeEnum`](../../doc/models/access-level-input-type-enum.md) | Optional | Type of access detail provided | AccessLevelInputTypeEnum getType() | setType(AccessLevelInputTypeEnum type) |
| `Access` | [`AccessLevelInputAccessEnum`](../../doc/models/access-level-input-access-enum.md) | Optional | Minimum access level that the specified user or user group has. If no input is provided then minimum access of READ_ONLY will be considered. | AccessLevelInputAccessEnum getAccess() | setAccess(AccessLevelInputAccessEnum access) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "type": null,
  "access": null
}
```

