

# ImportUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userIdentifier** | **String** | Unique ID or name of the user. |  |
|**displayName** | **String** | Display name of the user. |  |
|**password** | **String** | Password of the user. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of the user account. |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Status of the user account. |  [optional] |
|**email** | **String** | Email address of the user. |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | ID or name of the Orgs to which the user belongs. |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | ID or name of the groups to which the user belongs. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the users. The SHARABLE property makes a user visible to other users and group, who can share objects with the user. |  [optional] |
|**notifyOnShare** | **Boolean** | Notify user when other users or groups share metadata objects |  [optional] |
|**showOnboardingExperience** | **Boolean** | Show or hide the new user onboarding walkthroughs |  [optional] |
|**onboardingExperienceCompleted** | **Boolean** | Revisit the new user onboarding walkthroughs |  [optional] |
|**homeLiveboardIdentifier** | **String** | Unique ID or name of the default Liveboard assigned to the user. |  [optional] |
|**favoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects to add to the user&#39;s favorites list. |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| LOCAL_USER | &quot;LOCAL_USER&quot; |
| LDAP_USER | &quot;LDAP_USER&quot; |
| SAML_USER | &quot;SAML_USER&quot; |
| OIDC_USER | &quot;OIDC_USER&quot; |
| REMOTE_USER | &quot;REMOTE_USER&quot; |



## Enum: AccountStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| LOCKED | &quot;LOCKED&quot; |
| PENDING | &quot;PENDING&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |


## Implemented Interfaces

* Serializable


