
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the group |
| `display_name` | `string` | Optional | A unique display name string for the user group |
| `id` | `string` | Optional | GUID of the group |
| `visibility` | `string` | Optional | Visibility of the group |
| `description` | `string` | Optional | Description of the group |
| `privileges` | `List of string` | Optional | Privileges assigned to the group |
| `groups` | [`List of GroupNameAndID`](/doc/models/group-name-and-id.md) | Optional | Name of the group to which is added |
| `users` | [`List of UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | User Group Information by Id or Name. |
| `assigned_liveboards` | [`List of LiveboardNameAndID`](/doc/models/liveboard-name-and-id.md) | Optional | Liveboards assigned to the group |
| `user_group_content` | `object` | Optional | - |
| `tags` | `List of string` | Optional | Tags assigned to the group |
| `is_deleted` | `bool` | Optional | Indicates if the group is deleted |
| `is_hidden` | `bool` | Optional | Indicates if the group is hidden |
| `is_external` | `bool` | Optional | Indicates if the group is from external system |
| `is_deprecated` | `bool` | Optional | - |
| `complete` | `bool` | Optional | Indicates if the all the properties of group is provided |
| `is_system_principal` | `bool` | Optional | Indicates if the group is system principal |
| `mtype` | `string` | Optional | Indicates the type of group |
| `parenttype` | `string` | Optional | Indicates the type of parent object |
| `group_idx` | `int` | Optional | - |
| `metadata_version` | `int` | Optional | - |
| `tenant_id` | `string` | Optional | Tenant id associated with the group |
| `index_version` | `int` | Optional | - |
| `generation_num` | `int` | Optional | - |
| `created` | `float` | Optional | Date and time when group was created |
| `modified` | `float` | Optional | Date and time of last modification of the group |
| `modified_by` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
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
  "users": null,
  "assignedLiveboards": null,
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
  "indexVersion": null,
  "generationNum": null,
  "created": null,
  "modified": null,
  "modifiedBy": null,
  "author": null,
  "owner": null
}
```

