
# Tspublic Rest V2 Group Update Request

## Structure

`TspublicRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the user group |
| `Id` | `string` | Optional | GUID of the group to update |
| `DisplayName` | `string` | Optional | A unique display name string for the user group, for example, Developer group. |
| `Visibility` | [`Models.UpdateGroupVisibilityEnum?`](../../doc/models/update-group-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `UpdateGroupVisibilityEnum.DEFAULT` |
| `Description` | `string` | Optional | Description text for the group. |
| `Privileges` | [`List<Models.UpdateGroupPrivilegesEnum>`](../../doc/models/update-group-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `Users` | [`List<Models.UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |
| `AssignedLiveboards` | `List<string>` | Optional | An array of liveboard ids to be assigned to the group. |
| `Type` | [`Models.UpdateGroupTypeEnum?`](../../doc/models/update-group-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `UpdateGroupTypeEnum.LOCAL_GROUP` |

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

