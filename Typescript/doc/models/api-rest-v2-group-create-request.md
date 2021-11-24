
# Api Rest V2 Group Create Request

## Structure

`ApiRestV2GroupCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the user group. The group name string must be unique. |
| `displayName` | `string` | Required | A unique display name string for the user group, for example, Developer group. |
| `visibility` | [`Visibility3Enum \| undefined`](/doc/models/visibility-3-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `Visibility3Enum.DEFAULT`<br>*Default: `Visibility3Enum.DEFAULT`* |
| `description` | `string \| undefined` | Optional | Description text for the group |
| `privileges` | [`PrivilegeEnum[] \| undefined`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges to be assigned to the group |
| `groupNames` | `string[] \| undefined` | Optional | A JSON array of group names |
| `userNames` | `string[] \| undefined` | Optional | A JSON array of usernames to be added to the group |
| `type` | [`Type3Enum \| undefined`](/doc/models/type-3-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the group is created locally in the ThoughtSpot system.<br>**Default**: `Type3Enum.LOCALGROUP`<br>*Default: `Type3Enum.LOCALGROUP`* |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "description": null,
  "privileges": null,
  "groupNames": null,
  "userNames": null,
  "type": null
}
```

