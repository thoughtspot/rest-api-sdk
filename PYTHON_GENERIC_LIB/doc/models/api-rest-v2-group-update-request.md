
# Api Rest V2 Group Update Request

## Structure

`ApiRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the user group |
| `id` | `string` | Optional | GUID of the group to update |
| `display_name` | `string` | Optional | A unique display name string for the user group, for example, Developer group. |
| `visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `'DEFAULT'` |
| `description` | `string` | Optional | Description text for the group. |
| `privileges` | [`List of Privilege1Enum`](/doc/models/privilege-1-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `group_names` | `List of string` | Optional | A JSON array of group names |
| `user_names` | `List of string` | Optional | A JSON array of user names |
| `assigned_pinboards` | `List of string` | Optional | An array of pinboard ids to be assigned to the group. |
| `mtype` | [`Type3Enum`](/doc/models/type-3-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `'LOCAL_GROUP'` |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groupNames": null,
  "userNames": null,
  "assignedPinboards": null,
  "type": null
}
```

