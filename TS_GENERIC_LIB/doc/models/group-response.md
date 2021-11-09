
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Username of the user account |
| `displayName` | `string \| undefined` | Optional | Display name of the user account |
| `id` | `string \| undefined` | Optional | GUID of the user account |
| `visibility` | `string \| undefined` | Optional | Visibility of the user account |
| `description` | `string \| undefined` | Optional | Description of the group |
| `privileges` | `string[] \| undefined` | Optional | Privileges assigned to the group |
| `groups` | [`GroupNameAndID[] \| undefined`](/doc/models/group-name-and-id.md) | Optional | Groups to which usergroup is added |
| `assignedPinboards` | [`PinboardNameAndID[] \| undefined`](/doc/models/pinboard-name-and-id.md) | Optional | Pinboards assigned to the group |
| `userGroupContent` | `string \| undefined` | Optional | - |
| `tags` | `string[] \| undefined` | Optional | Tags assigned to the usergroup |
| `isDeleted` | `boolean \| undefined` | Optional | Indicates if the user account is deleted |
| `isHidden` | `boolean \| undefined` | Optional | Indicates if the user account is hidden |
| `isExternal` | `boolean \| undefined` | Optional | Indicates if the user account is from external system |
| `isDeprecated` | `boolean \| undefined` | Optional | - |
| `complete` | `boolean \| undefined` | Optional | Indicates if the all the properties of group is provided |
| `isSystemPrincipal` | `boolean \| undefined` | Optional | Indicates if the user account is system principal |
| `type` | `string \| undefined` | Optional | Indicates the type of user account |
| `parenttype` | `string \| undefined` | Optional | Indicates the type of parent object |
| `groupIdx` | `number \| undefined` | Optional | - |
| `metadataVersion` | `string \| undefined` | Optional | - |
| `tenantId` | `string \| undefined` | Optional | Tenant id associated with the user account |
| `generationNum` | `string \| undefined` | Optional | - |
| `indexVersion` | `number \| undefined` | Optional | - |
| `created` | `number \| undefined` | Optional | Date and time when usergroup was created |
| `modified` | `number \| undefined` | Optional | Date and time of last modification of usergroup |
| `author` | [`UserNameAndID \| undefined`](/doc/models/user-name-and-id.md) | Optional | - |
| `modifiedBy` | [`UserNameAndID \| undefined`](/doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID \| undefined`](/doc/models/user-name-and-id.md) | Optional | - |

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

