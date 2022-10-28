
# Tspublic Rest V2 Group Create Request

## Structure

`TspublicRestV2GroupCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Required | Name of the user group. The group name string must be unique. |
| `DisplayName` | `string` | Required | A unique display name string for the user group, for example, Developer group. |
| `Visibility` | [`Models.Visibility2Enum?`](../../doc/models/visibility-2-enum.md) | Optional | Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `Visibility2Enum.DEFAULT` |
| `Description` | `string` | Optional | Description text for the group. |
| `Privileges` | [`List<Models.PrivilegeEnum>`](../../doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `OrgId` | `int?` | Optional | Unique identifier of the organization. If no value is provided then group will be created in the organization associated with the login session. |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the group belong to. |
| `Users` | [`List<Models.UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | Array of names of user names that the group belong to. |
| `Type` | [`Models.Type10Enum?`](../../doc/models/type-10-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type10Enum.LOCAL_GROUP` |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "description": null,
  "privileges": null,
  "orgId": null,
  "groups": null,
  "users": null,
  "type": null
}
```

