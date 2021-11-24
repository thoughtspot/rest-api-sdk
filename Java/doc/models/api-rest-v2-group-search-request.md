
# Api Rest V2 Group Search Request

## Structure

`ApiRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the group | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`Visibility4Enum`](/doc/models/visibility-4-enum.md) | Optional | Visibility of the group. The visibility attribute is set to DEFAULT when creating a group. Setting this to DEFAULT makes a group visible to other users and user groups, and thus allows them to share objects | Visibility4Enum getVisibility() | setVisibility(Visibility4Enum visibility) |
| `Description` | `String` | Optional | Description text for the group | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<PrivilegeEnum>`](/doc/models/privilege-enum.md) | Optional | Privileges assigned to the group | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |
| `GroupNames` | `List<String>` | Optional | A JSON array of group names | List<String> getGroupNames() | setGroupNames(List<String> groupNames) |
| `UserNames` | `List<String>` | Optional | A JSON array of user names | List<String> getUserNames() | setUserNames(List<String> userNames) |
| `Type` | [`Type4Enum`](/doc/models/type-4-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. | Type4Enum getType() | setType(Type4Enum type) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groupNames": null,
  "userNames": null,
  "type": null
}
```

