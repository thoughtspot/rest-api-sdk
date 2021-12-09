
# Api Rest V2 Group Create Request

## Structure

`ApiRestV2GroupCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the user group. The group name string must be unique. |
| `display_name` | `string` | Required | A unique display name string for the user group, for example, Developer group. |
| `visibility` | [`Visibility3Enum`](/doc/models/visibility-3-enum.md) | Optional | The visibility attribute is set to DEFAULT when creating a group. Setting this to DEFAULT makes a group visible to other users and user groups, and thus allows them to share objects<br>**Default**: `'DEFAULT'` |
| `description` | `string` | Optional | Description text for the group. |
| `privileges` | [`List of PrivilegeEnum`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `groups` | [`List of GroupNameAndIDInput`](/doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `users` | [`List of UserNameAndIDInput`](/doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |
| `mtype` | [`Type5Enum`](/doc/models/type-5-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `'LOCAL_GROUP'` |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "users": null,
  "type": null
}
```

