
# Ts Object Type Serach

## Structure

`TsObjectTypeSerach`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | GUID of the object | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name of the object | String getName() | setName(String name) |
| `Owner` | `String` | Optional | Owner of the object | String getOwner() | setOwner(String owner) |
| `Author` | [`UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `Permission` | `String` | Optional | Indicates the permission which user or user group has on the object | String getPermission() | setPermission(String permission) |
| `SharedPermission` | `String` | Optional | Indicates the permission which user or user group has on the object through sharing of the object with the user or user group | String getSharedPermission() | setSharedPermission(String sharedPermission) |
| `GroupPermission` | [`List<GroupPermission>`](../../doc/models/group-permission.md) | Optional | An array of object with details of permission on the user groups to which the user or user group belongs | List<GroupPermission> getGroupPermission() | setGroupPermission(List<GroupPermission> groupPermission) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "owner": null,
  "author": null,
  "permission": null,
  "sharedPermission": null,
  "groupPermission": null
}
```

