
# Security Permission Response

## Structure

`SecurityPermissionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | GUID of the object | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name of the object | String getName() | setName(String name) |
| `Type` | `String` | Optional | Indicates the type of the object | String getType() | setType(String type) |
| `Owner` | `String` | Optional | GUID of the owner of the object | String getOwner() | setOwner(String owner) |
| `Author` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `Permissions` | [`List<SecurityPermission>`](../../doc/models/security-permission.md) | Optional | An array of object with details of permission on users and user groups | List<SecurityPermission> getPermissions() | setPermissions(List<SecurityPermission> permissions) |
| `Dependents` | [`List<SecuirityDependents>`](../../doc/models/secuirity-dependents.md) | Optional | The objects on which the primary object is dependent on | List<SecuirityDependents> getDependents() | setDependents(List<SecuirityDependents> dependents) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "owner": null,
  "author": null,
  "permissions": null,
  "dependents": null
}
```

