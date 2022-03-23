
# Tspublic Rest V2 Group Update Request

## Structure

`TspublicRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the user group |
| `Id` | `string` | Optional | GUID of the group to update |
| `DisplayName` | `string` | Optional | A unique display name string for the user group, for example, Developer group. |
| `Visibility` | [`Models.Visibility3Enum?`](../../doc/models/visibility-3-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `Visibility3Enum.DEFAULT` |
| `Description` | `string` | Optional | Description text for the group. |
| `Privileges` | [`List<Models.PrivilegeEnum>`](../../doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `Users` | [`List<Models.UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |
| `AssignedLiveboards` | `List<string>` | Optional | An array of liveboard ids to be assigned to the group. |
| `Type` | [`Models.Type5Enum?`](../../doc/models/type-5-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type5Enum.LOCAL_GROUP` |

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

