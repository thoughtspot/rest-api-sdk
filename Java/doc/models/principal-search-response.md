
# Principal Search Response

## Structure

`PrincipalSearchResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | GUID of the user or user group | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name of the user or user group | String getName() | setName(String name) |
| `Type` | `String` | Optional | Indicates the type of principal | String getType() | setType(String type) |
| `Permissions` | [`List<PermissionsTypeSearch>`](../../doc/models/permissions-type-search.md) | Optional | Indicates the permission which user or user group has on the object | List<PermissionsTypeSearch> getPermissions() | setPermissions(List<PermissionsTypeSearch> permissions) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "type": null,
  "permissions": null
}
```

