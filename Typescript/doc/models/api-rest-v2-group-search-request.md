
# Api Rest V2 Group Search Request

## Structure

`ApiRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the user group |
| `id` | `string \| undefined` | Optional | GUID of the group |
| `displayName` | `string \| undefined` | Optional | A display name string for the user group, for example, Developer group. |
| `visibility` | [`Visibility4Enum \| undefined`](/doc/models/visibility-4-enum.md) | Optional | Visibility of the group. The visibility attribute is set to DEFAULT when creating a group. Setting this to DEFAULT makes a group visible to other users and user groups, and thus allows them to share objects |
| `description` | `string \| undefined` | Optional | Description text for the group |
| `privileges` | [`PrivilegeEnum[] \| undefined`](/doc/models/privilege-enum.md) | Optional | Privileges assigned to the group |
| `groupNames` | `string[] \| undefined` | Optional | A JSON array of group names |
| `userNames` | `string[] \| undefined` | Optional | A JSON array of user names |
| `type` | [`Type4Enum \| undefined`](/doc/models/type-4-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. |

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

