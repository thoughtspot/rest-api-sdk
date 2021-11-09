
# Api Rest V2 Group Create Request

## Structure

`ApiRestV2GroupCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the user group. The group name string must be unique. | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | A unique display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`Visibility3Enum`](/doc/models/visibility-3-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `Visibility3Enum.DEFAULT`<br>*Default: `Visibility3Enum.DEFAULT`* | Visibility3Enum getVisibility() | setVisibility(Visibility3Enum visibility) |
| `Description` | `String` | Optional | Description text for the group | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<PrivilegeEnum>`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges to be assigned to the group | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |
| `GroupNames` | `List<String>` | Optional | A JSON array of group names | List<String> getGroupNames() | setGroupNames(List<String> groupNames) |
| `UserNames` | `List<String>` | Optional | A JSON array of usernames to be added to the group | List<String> getUserNames() | setUserNames(List<String> userNames) |
| `Type` | [`Type3Enum`](/doc/models/type-3-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the group is created locally in the ThoughtSpot system.<br>**Default**: `Type3Enum.LOCAL_GROUP`<br>*Default: `Type3Enum.LOCAL_GROUP`* | Type3Enum getType() | setType(Type3Enum type) |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "description": null,
  "privileges": null,
  "groupNames": null,
  "userNames": null,
  "type": null
}
```

