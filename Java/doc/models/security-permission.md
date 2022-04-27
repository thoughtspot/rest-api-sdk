
# Security Permission

## Structure

`SecurityPermission`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | GUID of the user or user group | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name of the user or user group | String getName() | setName(String name) |
| `Type` | `String` | Optional | Indicates the type of principal | String getType() | setType(String type) |
| `Permission` | `String` | Optional | Indicates the permission which user or user group has on the object | String getPermission() | setPermission(String permission) |
| `SharedPermission` | `String` | Optional | Indicates the permission which user or user group has on the object through sharing of the object with this user or user group | String getSharedPermission() | setSharedPermission(String sharedPermission) |
| `GroupPermission` | [`List<GroupPermission>`](../../doc/models/group-permission.md) | Optional | An array of object with details of permission on the user groups to which the user or user group belongs | List<GroupPermission> getGroupPermission() | setGroupPermission(List<GroupPermission> groupPermission) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "permission": null,
  "sharedPermission": null,
  "groupPermission": null
}
```

