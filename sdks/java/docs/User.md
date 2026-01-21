

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the user. |  |
|**name** | **String** | Name of the user. |  |
|**displayName** | **String** | Display name of the user. |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the users. The &#x60;SHARABLE&#x60; property makes a user visible to other users and group, who can share objects with the user. |  |
|**authorId** | **String** | Unique identifier of author of the user. |  [optional] |
|**canChangePassword** | **Boolean** | Defines whether the user can change their password. |  [optional] |
|**completeDetail** | **Boolean** | Defines whether the response has complete detail of the user. |  [optional] |
|**creationTimeInMillis** | **Float** | Creation time of the user in milliseconds. |  [optional] |
|**currentOrg** | [**Org**](Org.md) |  |  [optional] |
|**deleted** | **Boolean** | Indicates whether the user is deleted. |  [optional] |
|**deprecated** | **Boolean** | Indicates whether the user is deprecated. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of the user account. |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Status of the user account. |  [optional] |
|**email** | **String** | Email of the user. |  [optional] |
|**expirationTimeInMillis** | **Float** | Expiration time of the user in milliseconds. |  [optional] |
|**external** | **Boolean** | Indicates whether the user is external. |  [optional] |
|**favoriteMetadata** | [**List&lt;FavoriteMetadataItem&gt;**](FavoriteMetadataItem.md) | Metadata objects to add to the users&#39; favorites list. |  [optional] |
|**firstLoginTimeInMillis** | **Float** | Timestamp of the first login session of the user in milliseconds. |  [optional] |
|**groupMask** | **Integer** | Group mask of the user. |  [optional] |
|**hidden** | **Boolean** | Indicates whether the user is hidden. |  [optional] |
|**homeLiveboard** | [**ObjectIDAndName**](ObjectIDAndName.md) |  |  [optional] |
|**incompleteDetails** | **Object** | Incomplete details of user if any present. |  [optional] |
|**isFirstLogin** | **Boolean** | Indicates whether it is first login of the user. |  [optional] |
|**modificationTimeInMillis** | **Float** | Last modified time of the user in milliseconds. |  [optional] |
|**modifierId** | **String** | Unique identifier of modifier of the user. |  [optional] |
|**notifyOnShare** | **Boolean** | User preference for receiving email notifications on shared Answers or Liveboard. |  [optional] |
|**onboardingExperienceCompleted** | **Boolean** | The user preference for turning off the onboarding experience. |  [optional] |
|**orgs** | [**List&lt;Org&gt;**](Org.md) | Orgs to which the user belongs. |  [optional] |
|**ownerId** | **String** | Unique identifier of owner of the user. |  [optional] |
|**parentType** | [**ParentTypeEnum**](#ParentTypeEnum) | Parent type of the user. |  [optional] |
|**privileges** | **List&lt;String&gt;** | Privileges which are assigned to the user. |  [optional] |
|**showOnboardingExperience** | **Boolean** | User&#39;s preference to revisit the new user onboarding experience. |  [optional] |
|**superUser** | **Boolean** | Indicates whether the user is a super user. |  [optional] |
|**systemUser** | **Boolean** | Indicates whether the user is a system user. |  [optional] |
|**tags** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Tags associated with the user. |  [optional] |
|**tenantId** | **String** | Unique identifier of tenant of the user. |  [optional] |
|**userGroups** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Groups to which the user is assigned. |  [optional] |
|**userInheritedGroups** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Inherited User Groups which the user is part of. |  [optional] |
|**welcomeEmailSent** | **Boolean** | Indicates whether welcome email is sent for the user. |  [optional] |
|**orgPrivileges** | **Object** | Privileges which are assigned to the user with org. |  [optional] |
|**preferredLocale** | **String** | Locale for the user. |  [optional] |
|**useBrowserLanguage** | **Boolean** | Flag to indicate whether to use the browser locale for the user in the UI. When set to true, the preferred_locale value is unset and the browser&#39;s language setting takes precedence. |  [optional] |
|**extendedProperties** | **Object** | Properties for the user |  [optional] |
|**extendedPreferences** | **Object** | Preferences for the user |  [optional] |
|**userParameters** | **Object** | User Parameters which are specified for the user via JWToken |  [optional] |
|**accessControlProperties** | **Object** | Access Control Properties which are specified for the user via JWToken |  [optional] |
|**variableValues** | **Object** | Formula Variables which are specified for the user via JWToken |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |



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



## Enum: ParentTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| GROUP | &quot;GROUP&quot; |


## Implemented Interfaces

* Serializable


