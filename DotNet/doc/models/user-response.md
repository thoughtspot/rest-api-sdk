
# User Response

## Structure

`UserResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Username of the user account |
| `DisplayName` | `string` | Optional | Display name of the user account |
| `Id` | `string` | Optional | GUID of the user account |
| `Visibility` | `string` | Optional | Visibility of the user account |
| `Mail` | `string` | Optional | Email of the user account |
| `Groups` | [`List<Models.GroupNameAndID>`](../../doc/models/group-name-and-id.md) | Optional | Name of the group to which user account is added |
| `Privileges` | `List<string>` | Optional | Privileges assigned to user account |
| `Tags` | `List<string>` | Optional | Tags assigned to the user |
| `State` | `string` | Optional | Indicates if the user account is active or inactive |
| `NotifyOnShare` | `bool?` | Optional | Indicates if the email should be sent when object is shared with the user |
| `ShowWalkMe` | `bool?` | Optional | Indicates if the walk me should be shown when logging in |
| `AnalystOnboardingComplete` | `bool?` | Optional | Indicates if the onboarding is completed for the user |
| `FirstLogin` | `int?` | Optional | Indicates if the use is logging in for the first time |
| `WelcomeEmailSent` | `bool?` | Optional | Indicates if the welcome email is sent to email associated with the user account |
| `IsDeleted` | `bool?` | Optional | Indicates if the user account is deleted |
| `IsHidden` | `bool?` | Optional | Indicates if the user account is hidden |
| `IsExternal` | `bool?` | Optional | Indicates if the user account is from external system<br>isDeprecated |
| `IsDeprecated` | `bool?` | Optional | - |
| `Complete` | `bool?` | Optional | Indicates if the all the properties of user account is provided |
| `IsSuperUser` | `bool?` | Optional | Indicates if the user account is super user |
| `IsSystemPrincipal` | `bool?` | Optional | Indicates if the user account is system principal |
| `Type` | `string` | Optional | Indicates the type of user account |
| `Parenttype` | `string` | Optional | Indicates the type of parent object |
| `TenantId` | `string` | Optional | Tenant id associated with the user account |
| `IndexVersion` | `double?` | Optional | - |
| `GenerationNum` | `double?` | Optional | - |
| `Created` | `double?` | Optional | Date and time when user account was created |
| `Modified` | `double?` | Optional | Date and time of last modification of user account |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `ModifiedBy` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Owner` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |

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

