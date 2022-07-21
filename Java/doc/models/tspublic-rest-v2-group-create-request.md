
# Tspublic Rest V2 Group Create Request

## Structure

`TspublicRestV2GroupCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the user group. The group name string must be unique. | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | A unique display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`CreateGroupVisibilityEnum`](../../doc/models/create-group-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `CreateGroupVisibilityEnum.DEFAULT` | CreateGroupVisibilityEnum getVisibility() | setVisibility(CreateGroupVisibilityEnum visibility) |
| `Description` | `String` | Optional | Description text for the group. | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<CreateGroupPrivilegesEnum>`](../../doc/models/create-group-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group | List<CreateGroupPrivilegesEnum> getPrivileges() | setPrivileges(List<CreateGroupPrivilegesEnum> privileges) |
| `Org` | [`OrgInput`](../../doc/models/org-input.md) | Optional | This is applicable only if organization feature is enabled in the cluster.<br><br>A JSON object of organization name, id or both, in which the object should be created. When both are given then id is considered. If no value is provided then object will be created in the organization associated with the login session. | OrgInput getOrg() | setOrg(OrgInput org) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `Users` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |
| `Type` | [`CreateGroupTypeEnum`](../../doc/models/create-group-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `CreateGroupTypeEnum.LOCAL_GROUP` | CreateGroupTypeEnum getType() | setType(CreateGroupTypeEnum type) |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "description": null,
  "privileges": null,
  "org": null,
  "groups": null,
  "users": null,
  "type": null
}
```

