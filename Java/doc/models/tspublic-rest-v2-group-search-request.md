
# Tspublic Rest V2 Group Search Request

## Structure

`TspublicRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OutputFields` | `List<String>` | Optional | Array of field names that need to be included in the response | List<String> getOutputFields() | setOutputFields(List<String> outputFields) |
| `Name` | `String` | Optional | Name of the user group | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the group to update | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user group, for example, Developer group. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | `String` | Optional | Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects. | String getVisibility() | setVisibility(String visibility) |
| `Description` | `String` | Optional | Description text for the group. | String getDescription() | setDescription(String description) |
| `Privileges` | [`List<PrivilegeEnum>`](../../doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the group | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the user belong to. | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `Users` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | Array of user name that associated with group. | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |
| `Type` | `String` | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. | String getType() | setType(String type) |

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

