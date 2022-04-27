
# Tspublic Rest V2 Group Search Request

## Structure

`TspublicRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OutputFields` | `List<String>` | Optional | Array of field names that need to be included in the response. | List<String> getOutputFields() | setOutputFields(List<String> outputFields) |
| `Name` | `String` | Optional | Name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the group to update | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`SearchGroupsVisibilityEnum`](../../doc/models/search-groups-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects. | SearchGroupsVisibilityEnum getVisibility() | setVisibility(SearchGroupsVisibilityEnum visibility) |
| `Description` | `String` | Optional | Description text for the group. | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<SearchGroupsPrivilegesEnum>`](../../doc/models/search-groups-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group | List<SearchGroupsPrivilegesEnum> getPrivileges() | setPrivileges(List<SearchGroupsPrivilegesEnum> privileges) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `Users` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |
| `Type` | [`SearchGroupsTypeEnum`](../../doc/models/search-groups-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. | SearchGroupsTypeEnum getType() | setType(SearchGroupsTypeEnum type) |

## Example (as JSON)

```json
{
  "outputFields": null,
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "users": null,
  "type": null
}
```

