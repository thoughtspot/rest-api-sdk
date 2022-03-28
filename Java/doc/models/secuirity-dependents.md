
# Secuirity Dependents

## Structure

`SecuirityDependents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | GUID of the object | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name of the object | String getName() | setName(String name) |
| `Type` | `String` | Optional | Indicates the type of the object | String getType() | setType(String type) |
| `Owner` | `String` | Optional | Owner of the object | String getOwner() | setOwner(String owner) |
| `Author` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `Permissions` | [`List<DependentPermission>`](../../doc/models/dependent-permission.md) | Optional | - | List<DependentPermission> getPermissions() | setPermissions(List<DependentPermission> permissions) |

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

