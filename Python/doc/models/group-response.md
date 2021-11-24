
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Username of the user account |
| `display_name` | `string` | Optional | Display name of the user account |
| `id` | `string` | Optional | GUID of the user account |
| `visibility` | `string` | Optional | Visibility of the user account |
| `description` | `string` | Optional | Description of the group |
| `privileges` | `List of string` | Optional | Privileges assigned to the group |
| `groups` | [`List of GroupNameAndID`](/doc/models/group-name-and-id.md) | Optional | Groups to which usergroup is added |
| `assigned_pinboards` | [`List of PinboardNameAndID`](/doc/models/pinboard-name-and-id.md) | Optional | Pinboards assigned to the group |
| `user_group_content` | `string` | Optional | - |
| `tags` | `List of string` | Optional | Tags assigned to the usergroup |
| `is_deleted` | `bool` | Optional | Indicates if the user account is deleted |
| `is_hidden` | `bool` | Optional | Indicates if the user account is hidden |
| `is_external` | `bool` | Optional | Indicates if the user account is from external system |
| `is_deprecated` | `bool` | Optional | - |
| `complete` | `bool` | Optional | Indicates if the all the properties of group is provided |
| `is_system_principal` | `bool` | Optional | Indicates if the user account is system principal |
| `mtype` | `string` | Optional | Indicates the type of user account |
| `parenttype` | `string` | Optional | Indicates the type of parent object |
| `group_idx` | `int` | Optional | - |
| `metadata_version` | `string` | Optional | - |
| `tenant_id` | `string` | Optional | Tenant id associated with the user account |
| `generation_num` | `string` | Optional | - |
| `index_version` | `int` | Optional | - |
| `created` | `float` | Optional | Date and time when usergroup was created |
| `modified` | `float` | Optional | Date and time of last modification of usergroup |
| `author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `modified_by` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |

## Example (as JSON)

```json
{
  "name": null,
  "displayName": null,
  "id": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "assignedPinboards": null,
  "userGroupContent": null,
  "tags": null,
  "isDeleted": null,
  "isHidden": null,
  "isExternal": null,
  "isDeprecated": null,
  "complete": null,
  "isSystemPrincipal": null,
  "type": null,
  "parenttype": null,
  "groupIdx": null,
  "metadataVersion": null,
  "tenantId": null,
  "generationNum": null,
  "indexVersion": null,
  "created": null,
  "modified": null,
  "author": null,
  "modifiedBy": null,
  "owner": null
}
```

