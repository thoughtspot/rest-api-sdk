

# UpdateUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the user. The username string must be unique. |  [optional] |
|**displayName** | **String** | A unique display name string for the user account, usually their first and last name |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object. |  [optional] |
|**email** | **String** | Email of the user account |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a transitional state applicable to IAMv2 users only. |  [optional] |
|**notifyOnShare** | **Boolean** | User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet. |  [optional] |
|**showOnboardingExperience** | **Boolean** | The user preference for revisiting the onboarding experience. |  [optional] |
|**onboardingExperienceCompleted** | **Boolean** | Indicates if the user has completed the onboarding and allows turning off the onboarding walkthrough. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of the account. |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | GUIDs or names of the groups. |  [optional] |
|**homeLiveboardIdentifier** | **String** | GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in. |  [optional] |
|**favoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects to add to the user&#39;s favorites list. |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | IDs of the Orgs. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Type of update operation. Default operation type is REPLACE |  [optional] |
|**preferredLocale** | [**PreferredLocaleEnum**](#PreferredLocaleEnum) | Locale for the user. |  [optional] |
|**extendedProperties** | **Object** | Properties for the user |  [optional] |
|**extendedPreferences** | **Object** | Preferences for the user |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |



## Enum: AccountStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| LOCKED | &quot;LOCKED&quot; |
| PENDING | &quot;PENDING&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| LOCAL_USER | &quot;LOCAL_USER&quot; |
| LDAP_USER | &quot;LDAP_USER&quot; |
| SAML_USER | &quot;SAML_USER&quot; |
| OIDC_USER | &quot;OIDC_USER&quot; |
| REMOTE_USER | &quot;REMOTE_USER&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |



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
| USE_BROWSER_LANGUAGE | &quot;USE_BROWSER_LANGUAGE&quot; |


## Implemented Interfaces

* Serializable


