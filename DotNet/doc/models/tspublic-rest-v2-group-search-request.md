
# Tspublic Rest V2 Group Search Request

## Structure

`TspublicRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `OutputFields` | `List<string>` | Optional | Array of field names that need to be included in the response. |
| `Name` | `string` | Optional | Name of the user group |
| `Id` | `string` | Optional | GUID of the group to update |
| `DisplayName` | `string` | Optional | A unique display name string for the user group, for example, Developer group. |
| `Visibility` | [`Models.SearchGroupsVisibilityEnum?`](../../doc/models/search-groups-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects. |
| `Description` | `string` | Optional | Description text for the group. |
| `Privileges` | [`List<Models.SearchGroupsPrivilegesEnum>`](../../doc/models/search-groups-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `Users` | [`List<Models.UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |
| `Type` | [`Models.SearchGroupsTypeEnum?`](../../doc/models/search-groups-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. |

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

