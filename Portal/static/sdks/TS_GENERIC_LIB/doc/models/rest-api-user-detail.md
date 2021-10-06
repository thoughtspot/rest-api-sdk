
# Rest API User Detail

## Structure

`RestAPIUserDetail`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Username of the user account |
| `displayName` | `string \| undefined` | Optional | Display name of the user account |
| `id` | `string \| undefined` | Optional | GUID of the user account |
| `visibility` | [`VisibilityEnum \| undefined`](/doc/models/visibility-enum.md) | Optional | Visibility of the user account |
| `mail` | `string \| undefined` | Optional | Email of the user account |
| `groups` | [`GroupProperties[] \| undefined`](/doc/models/group-properties.md) | Optional | Name of the group to which user account is added |
| `privileges` | `string[] \| undefined` | Optional | Privileges assigned to user account |
| `tags` | `string[] \| undefined` | Optional | Tags assigned to the user |
| `state` | `string \| undefined` | Optional | Indicates if the user account is active or inactive |
| `notifyOnShare` | `boolean \| undefined` | Optional | Indicates if the email should be sent when object is shared with the user |
| `showWalkMe` | `boolean \| undefined` | Optional | Indicates if the walk me should be shown when logging in |
| `analystOnboardingComplete` | `boolean \| undefined` | Optional | Indicates if the onboarding is completed for the user |
| `firstLogin` | `number \| undefined` | Optional | Indicates if the use is logging in for the first time |
| `welcomeEmailSent` | `boolean \| undefined` | Optional | Indicates if the welcome email is sent to email associated with the user account |
| `isDeleted` | `boolean \| undefined` | Optional | Indicates if the user account is deleted |
| `isHidden` | `boolean \| undefined` | Optional | Indicates if the user account is hidden |
| `isExternal` | `boolean \| undefined` | Optional | Indicates if the user account is from external system<br>isDeprecated |
| `isDeprecated` | `boolean \| undefined` | Optional | - |
| `complete` | `boolean \| undefined` | Optional | Indicates if the all the properties of user account is provided |
| `isSuperUser` | `boolean \| undefined` | Optional | Indicates if the user account is super user |
| `isSystemPrincipal` | `boolean \| undefined` | Optional | Indicates if the user account is system principal |
| `type` | [`TypeEnum \| undefined`](/doc/models/type-enum.md) | Optional | Indicates the type of user account |
| `parenttype` | `string \| undefined` | Optional | Indicates the type of parent object |
| `tenantId` | `string \| undefined` | Optional | Tenant id associated with the user account |
| `indexVersion` | `number \| undefined` | Optional | - |
| `generationNum` | `number \| undefined` | Optional | - |
| `created` | `number \| undefined` | Optional | Date and time when user account was created |
| `modified` | `number \| undefined` | Optional | Date and time of last modification of user account |
| `author` | [`AuthorProperties \| undefined`](/doc/models/author-properties.md) | Optional | - |
| `modifiedBy` | [`ModifiedProperties \| undefined`](/doc/models/modified-properties.md) | Optional | - |
| `owner` | [`OwenerProperties \| undefined`](/doc/models/owener-properties.md) | Optional | - |

## Example (as JSON)

```json
{
  "name": null,
  "displayName": null,
  "id": null,
  "visibility": null,
  "mail": null,
  "groups": null,
  "privileges": null,
  "tags": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "firstLogin": null,
  "welcomeEmailSent": null,
  "isDeleted": null,
  "isHidden": null,
  "isExternal": null,
  "isDeprecated": null,
  "complete": null,
  "isSuperUser": null,
  "isSystemPrincipal": null,
  "type": null,
  "parenttype": null,
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

