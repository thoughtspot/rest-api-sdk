
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the group |
| `displayName` | `string \| undefined` | Optional | A unique display name string for the user group |
| `id` | `string \| undefined` | Optional | GUID of the group |
| `visibility` | `string \| undefined` | Optional | Visibility of the group |
| `description` | `string \| undefined` | Optional | Description of the group |
| `privileges` | `string[] \| undefined` | Optional | Privileges assigned to the group |
| `groups` | [`GroupNameAndID[] \| undefined`](../../doc/models/group-name-and-id.md) | Optional | Name of the group to which is added |
| `users` | [`UserNameAndID[] \| undefined`](../../doc/models/user-name-and-id.md) | Optional | User Group Information by Id or Name. |
| `assignedLiveboards` | [`LiveboardNameAndID[] \| undefined`](../../doc/models/liveboard-name-and-id.md) | Optional | Liveboards assigned to the group |
| `userGroupContent` | `unknown \| undefined` | Optional | - |
| `tags` | `string[] \| undefined` | Optional | Tags assigned to the group |
| `isDeleted` | `boolean \| undefined` | Optional | Indicates if the group is deleted |
| `isHidden` | `boolean \| undefined` | Optional | Indicates if the group is hidden |
| `isExternal` | `boolean \| undefined` | Optional | Indicates if the group is from external system |
| `isDeprecated` | `boolean \| undefined` | Optional | - |
| `complete` | `boolean \| undefined` | Optional | Indicates if the all the properties of group is provided |
| `isSystemPrincipal` | `boolean \| undefined` | Optional | Indicates if the group is system principal |
| `type` | `string \| undefined` | Optional | Indicates the type of group |
| `parenttype` | `string \| undefined` | Optional | Indicates the type of parent object |
| `groupIdx` | `number \| undefined` | Optional | - |
| `metadataVersion` | `number \| undefined` | Optional | - |
| `tenantId` | `string \| undefined` | Optional | Tenant id associated with the group |
| `indexVersion` | `number \| undefined` | Optional | - |
| `generationNum` | `number \| undefined` | Optional | - |
| `created` | `number \| undefined` | Optional | Date and time when group was created |
| `modified` | `number \| undefined` | Optional | Date and time of last modification of the group |
| `author` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `modifiedBy` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID \| undefined`](../../doc/models/user-name-and-id.md) | Optional | - |

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
  "author": null,
  "modifiedBy": null,
  "owner": null
}
```

