

# CreateUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the user. The username string must be unique. |  |
|**displayName** | **String** | A unique display name string for the user account, usually their first and last name |  |
|**password** | **String** | Password for the user account. For IAMv2 users, you must set this password if you do not want to trigger an activation email. |  [optional] |
|**email** | **String** | Email of the user account |  |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of the account. |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a transitional state applicable to IAMv2 users only. |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | List of Org IDs to which the user belongs. |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | GUIDs or names of the groups to which the newly created user belongs. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object. |  [optional] |
|**notifyOnShare** | **Boolean** | User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet. |  [optional] |
|**showOnboardingExperience** | **Boolean** | The user preference for revisiting the onboarding experience. |  [optional] |
|**onboardingExperienceCompleted** | **Boolean** | flag to get the on-boarding experience is completed or not. |  [optional] |
|**homeLiveboardIdentifier** | **String** | GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in. |  [optional] |
|**favoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects to add to the user&#39;s favorites list. |  [optional] |
|**preferredLocale** | [**PreferredLocaleEnum**](#PreferredLocaleEnum) | Locale for the user. |  [optional] |
|**extendedProperties** | **Object** | Properties for the user |  [optional] |
|**extendedPreferences** | **Object** | Preferences for the user |  [optional] |
|**triggerWelcomeEmail** | **Boolean** | Flag to indicate whether welcome email should be sent to user. This parameter is applied only on clusters on which IAM is disabled. |  [optional] |
|**triggerActivationEmail** | **Boolean** | Flag to indicate whether activation email should be sent to the user. Default value for IAMv2 users is set to true. Users must either set this to false, or enter a valid  password if they do not want to trigger an activation email. |  [optional] |



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



## Enum: PreferredLocaleEnum

| Name | Value |
|---- | -----|
| EN_CA | &quot;en-CA&quot; |
| EN_GB | &quot;en-GB&quot; |
| EN_US | &quot;en-US&quot; |
| DE_DE | &quot;de-DE&quot; |
| JA_JP | &quot;ja-JP&quot; |
| ZH_CN | &quot;zh-CN&quot; |
| PT_BR | &quot;pt-BR&quot; |
| FR_FR | &quot;fr-FR&quot; |
| FR_CA | &quot;fr-CA&quot; |
| ES_US | &quot;es-US&quot; |
| DA_DK | &quot;da-DK&quot; |
| ES_ES | &quot;es-ES&quot; |
| FI_FI | &quot;fi-FI&quot; |
| SV_SE | &quot;sv-SE&quot; |
| NB_NO | &quot;nb-NO&quot; |
| PT_PT | &quot;pt-PT&quot; |
| NL_NL | &quot;nl-NL&quot; |
| IT_IT | &quot;it-IT&quot; |
| RU_RU | &quot;ru-RU&quot; |
| EN_IN | &quot;en-IN&quot; |
| DE_CH | &quot;de-CH&quot; |
| EN_NZ | &quot;en-NZ&quot; |
| ES_MX | &quot;es-MX&quot; |
| EN_AU | &quot;en-AU&quot; |
| ZH_HANT | &quot;zh-Hant&quot; |
| KO_KR | &quot;ko-KR&quot; |
| EN_DE | &quot;en-DE&quot; |



