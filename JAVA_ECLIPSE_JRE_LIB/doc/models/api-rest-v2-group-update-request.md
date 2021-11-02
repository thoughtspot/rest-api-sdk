
# Api Rest V2 Group Update Request

## Structure

`ApiRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the group to update | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `VisibilityEnum.DEFAULT` | VisibilityEnum getVisibility() | setVisibility(VisibilityEnum visibility) |
| `Description` | `String` | Optional | Description text for the group. | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<Privilege1Enum>`](/doc/models/privilege-1-enum.md) | Optional | A JSON array of privileges assigned to the group | List<Privilege1Enum> getPrivileges() | setPrivileges(List<Privilege1Enum> privileges) |
| `GroupNames` | `List<String>` | Optional | A JSON array of group names | List<String> getGroupNames() | setGroupNames(List<String> groupNames) |
| `UserNames` | `List<String>` | Optional | A JSON array of user names | List<String> getUserNames() | setUserNames(List<String> userNames) |
| `AssignedPinboards` | `List<String>` | Optional | An array of pinboard ids to be assigned to the group. | List<String> getAssignedPinboards() | setAssignedPinboards(List<String> assignedPinboards) |
| `Type` | [`Type3Enum`](/doc/models/type-3-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type3Enum.LOCAL_GROUP` | Type3Enum getType() | setType(Type3Enum type) |

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
  "assignedPinboards": null,
  "type": null
}
```

