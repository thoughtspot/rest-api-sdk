
# Create User Responce

## Structure

`CreateUserResponce`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Username of the user account |
| `display_name` | `string` | Optional | Display name of the user account |
| `id` | `string` | Optional | GUID of the user account |
| `visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user account |
| `mail` | `string` | Optional | Email of the user account |
| `groups` | `List of string` | Optional | Username of the owner of the user account |
| `privileges` | `List of string` | Optional | Privileges assigned to user account |
| `tags` | `List of string` | Optional | - |
| `state` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Indicates if the user account is active or inactive |
| `notify_on_share` | `bool` | Optional | Indicates if the email should be sent when object is shared with the user |
| `show_walk_me` | `bool` | Optional | Indicates if the walk me should be shown when logging in |
| `analyst_onboarding_complete` | `bool` | Optional | Indicates if the onboarding is completed for the user |
| `first_login` | `int` | Optional | Indicates if the use is logging in for the first time |
| `welcome_email_sent` | `bool` | Optional | Indicates if the welcome email is sent to email associated with the user account |
| `is_deleted` | `bool` | Optional | Indicates if the user account is deleted |
| `is_hidden` | `bool` | Optional | Indicates if the user account is hidden |
| `is_external` | `bool` | Optional | Indicates if the user account is from external system |
| `is_deprecated` | `bool` | Optional | - |
| `complete` | `bool` | Optional | Indicates if the all the properties of user account is provided |
| `is_super_user` | `bool` | Optional | Indicates if the user account is super user |
| `is_system_principal` | `bool` | Optional | Indicates if the user account is system principal |
| `mtype` | [`TypeEnum`](/doc/models/type-enum.md) | Optional | Indicates the type of user account |
| `parenttype` | `string` | Optional | Indicates the type of parent object |
| `tenant_id` | `string` | Optional | Tenant id associated with the user account |
| `index_version` | `int` | Optional | - |
| `generation_num` | `int` | Optional | - |
| `created` | `float` | Optional | Date and time when user account was created |
| `modified` | `float` | Optional | Date and time of last modification of user account |
| `author` | [`AuthorProperties`](/doc/models/author-properties.md) | Optional | - |
| `modified_by` | [`ModifiedProperties`](/doc/models/modified-properties.md) | Optional | - |
| `owner` | [`OwenerProperties`](/doc/models/owener-properties.md) | Optional | - |

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

