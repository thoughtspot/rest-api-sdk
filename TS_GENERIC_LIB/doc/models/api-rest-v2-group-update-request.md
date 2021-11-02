
# Api Rest V2 Group Update Request

## Structure

`ApiRestV2GroupUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the user group |
| `id` | `string \| undefined` | Optional | GUID of the group to update |
| `displayName` | `string \| undefined` | Optional | A unique display name string for the user group, for example, Developer group. |
| `visibility` | [`VisibilityEnum \| undefined`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `VisibilityEnum.DEFAULT` |
| `description` | `string \| undefined` | Optional | Description text for the group. |
| `privileges` | [`Privilege1Enum[] \| undefined`](/doc/models/privilege-1-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `groupNames` | `string[] \| undefined` | Optional | A JSON array of group names |
| `userNames` | `string[] \| undefined` | Optional | A JSON array of user names |
| `assignedPinboards` | `string[] \| undefined` | Optional | An array of pinboard ids to be assigned to the group. |
| `type` | [`Type3Enum \| undefined`](/doc/models/type-3-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type3Enum.LOCALGROUP` |

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

