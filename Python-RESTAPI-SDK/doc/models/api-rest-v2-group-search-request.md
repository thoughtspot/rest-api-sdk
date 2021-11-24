
# Api Rest V2 Group Search Request

## Structure

`ApiRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the user group |
| `id` | `string` | Optional | GUID of the group |
| `display_name` | `string` | Optional | A display name string for the user group, for example, Developer group. |
| `visibility` | [`Visibility4Enum`](/doc/models/visibility-4-enum.md) | Optional | Visibility of the group. The visibility attribute is set to DEFAULT when creating a group. Setting this to DEFAULT makes a group visible to other users and user groups, and thus allows them to share objects |
| `description` | `string` | Optional | Description text for the group |
| `privileges` | [`List of PrivilegeEnum`](/doc/models/privilege-enum.md) | Optional | Privileges assigned to the group |
| `group_names` | `List of string` | Optional | A JSON array of group names |
| `user_names` | `List of string` | Optional | A JSON array of user names |
| `mtype` | [`Type4Enum`](/doc/models/type-4-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. |

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
  "type": null
}
```

