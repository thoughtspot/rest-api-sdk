
# Tspublic Rest V2 Group Update Request

## Structure

`TspublicRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the user group |
| `id` | `string \| undefined` | Optional | GUID of the group to update |
| `displayName` | `string \| undefined` | Optional | A unique display name string for the user group, for example, Developer group. |
| `visibility` | [`UpdateGroupVisibilityEnum \| undefined`](../../doc/models/update-group-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `UpdateGroupVisibilityEnum.DEFAULT` |
| `description` | `string \| undefined` | Optional | Description text for the group. |
| `privileges` | [`UpdateGroupPrivilegesEnum[] \| undefined`](../../doc/models/update-group-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `users` | [`UserNameAndIDInput[] \| undefined`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |
| `assignedLiveboards` | `string[] \| undefined` | Optional | An array of liveboard ids to be assigned to the group. |
| `type` | [`UpdateGroupTypeEnum \| undefined`](../../doc/models/update-group-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `UpdateGroupTypeEnum.LOCALGROUP` |

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

