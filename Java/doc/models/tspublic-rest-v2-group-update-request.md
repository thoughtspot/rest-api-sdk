
# Tspublic Rest V2 Group Update Request

## Structure

`TspublicRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the group to update | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`UpdateGroupVisibilityEnum`](../../doc/models/update-group-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `UpdateGroupVisibilityEnum.DEFAULT` | UpdateGroupVisibilityEnum getVisibility() | setVisibility(UpdateGroupVisibilityEnum visibility) |
| `Description` | `String` | Optional | Description text for the group. | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<UpdateGroupPrivilegesEnum>`](../../doc/models/update-group-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group | List<UpdateGroupPrivilegesEnum> getPrivileges() | setPrivileges(List<UpdateGroupPrivilegesEnum> privileges) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `Users` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |
| `AssignedLiveboards` | `List<String>` | Optional | An array of liveboard ids to be assigned to the group. | List<String> getAssignedLiveboards() | setAssignedLiveboards(List<String> assignedLiveboards) |
| `Type` | [`UpdateGroupTypeEnum`](../../doc/models/update-group-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `UpdateGroupTypeEnum.LOCAL_GROUP` | UpdateGroupTypeEnum getType() | setType(UpdateGroupTypeEnum type) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "users": null,
  "assignedLiveboards": null,
  "type": null
}
```

