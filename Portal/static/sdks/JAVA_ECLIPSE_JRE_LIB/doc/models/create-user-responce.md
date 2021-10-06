
# Create User Responce

## Structure

`CreateUserResponce`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username of the user account | String getName() | setName(String name) |
| `DisplayName` | `String` | Optional | Display name of the user account | String getDisplayName() | setDisplayName(String displayName) |
| `Id` | `String` | Optional | GUID of the user account | String getId() | setId(String id) |
| `Visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user account | VisibilityEnum getVisibility() | setVisibility(VisibilityEnum visibility) |
| `Mail` | `String` | Optional | Email of the user account | String getMail() | setMail(String mail) |
| `Groups` | `List<String>` | Optional | Username of the owner of the user account | List<String> getGroups() | setGroups(List<String> groups) |
| `Privileges` | `List<String>` | Optional | Privileges assigned to user account | List<String> getPrivileges() | setPrivileges(List<String> privileges) |
| `Tags` | `List<String>` | Optional | - | List<String> getTags() | setTags(List<String> tags) |
| `State` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Indicates if the user account is active or inactive | StateEnum getState() | setState(StateEnum state) |
| `NotifyOnShare` | `Boolean` | Optional | Indicates if the email should be sent when object is shared with the user | Boolean getNotifyOnShare() | setNotifyOnShare(Boolean notifyOnShare) |
| `ShowWalkMe` | `Boolean` | Optional | Indicates if the walk me should be shown when logging in | Boolean getShowWalkMe() | setShowWalkMe(Boolean showWalkMe) |
| `AnalystOnboardingComplete` | `Boolean` | Optional | Indicates if the onboarding is completed for the user | Boolean getAnalystOnboardingComplete() | setAnalystOnboardingComplete(Boolean analystOnboardingComplete) |
| `FirstLogin` | `Integer` | Optional | Indicates if the use is logging in for the first time | Integer getFirstLogin() | setFirstLogin(Integer firstLogin) |
| `WelcomeEmailSent` | `Boolean` | Optional | Indicates if the welcome email is sent to email associated with the user account | Boolean getWelcomeEmailSent() | setWelcomeEmailSent(Boolean welcomeEmailSent) |
| `IsDeleted` | `Boolean` | Optional | Indicates if the user account is deleted | Boolean getIsDeleted() | setIsDeleted(Boolean isDeleted) |
| `IsHidden` | `Boolean` | Optional | Indicates if the user account is hidden | Boolean getIsHidden() | setIsHidden(Boolean isHidden) |
| `IsExternal` | `Boolean` | Optional | Indicates if the user account is from external system | Boolean getIsExternal() | setIsExternal(Boolean isExternal) |
| `IsDeprecated` | `Boolean` | Optional | - | Boolean getIsDeprecated() | setIsDeprecated(Boolean isDeprecated) |
| `Complete` | `Boolean` | Optional | Indicates if the all the properties of user account is provided | Boolean getComplete() | setComplete(Boolean complete) |
| `IsSuperUser` | `Boolean` | Optional | Indicates if the user account is super user | Boolean getIsSuperUser() | setIsSuperUser(Boolean isSuperUser) |
| `IsSystemPrincipal` | `Boolean` | Optional | Indicates if the user account is system principal | Boolean getIsSystemPrincipal() | setIsSystemPrincipal(Boolean isSystemPrincipal) |
| `Type` | [`TypeEnum`](/doc/models/type-enum.md) | Optional | Indicates the type of user account | TypeEnum getType() | setType(TypeEnum type) |
| `Parenttype` | `String` | Optional | Indicates the type of parent object | String getParenttype() | setParenttype(String parenttype) |
| `TenantId` | `String` | Optional | Tenant id associated with the user account | String getTenantId() | setTenantId(String tenantId) |
| `IndexVersion` | `Integer` | Optional | - | Integer getIndexVersion() | setIndexVersion(Integer indexVersion) |
| `GenerationNum` | `Integer` | Optional | - | Integer getGenerationNum() | setGenerationNum(Integer generationNum) |
| `Created` | `Double` | Optional | Date and time when user account was created | Double getCreated() | setCreated(Double created) |
| `Modified` | `Double` | Optional | Date and time of last modification of user account | Double getModified() | setModified(Double modified) |
| `Author` | [`AuthorProperties`](/doc/models/author-properties.md) | Optional | - | AuthorProperties getAuthor() | setAuthor(AuthorProperties author) |
| `ModifiedBy` | [`ModifiedProperties`](/doc/models/modified-properties.md) | Optional | - | ModifiedProperties getModifiedBy() | setModifiedBy(ModifiedProperties modifiedBy) |
| `Owner` | [`OwenerProperties`](/doc/models/owener-properties.md) | Optional | - | OwenerProperties getOwner() | setOwner(OwenerProperties owner) |

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

