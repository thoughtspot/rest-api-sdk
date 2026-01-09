

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
|**preferredLocale** | [**PreferredLocaleEnum**](#PreferredLocaleEnum) | Locale for the user. |  [optional] |
|**useBrowserLanguage** | **Boolean** | Flag to indicate whether to use the browser locale for the user in the UI. When set to true, the preferred_locale value is unset and the browser&#39;s language setting takes precedence. |  [optional] |



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


## Implemented Interfaces

* Serializable


