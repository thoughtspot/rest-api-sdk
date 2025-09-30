

# SearchUsersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userIdentifier** | **String** | GUID / name of the user to search |  [optional] |
|**displayName** | **String** | A unique display name string for the user account, usually their first and last name |  [optional] |
|**namePattern** | **String** | A pattern to match case-insensitive name of the User object. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the user |  [optional] |
|**email** | **String** | Email of the user account |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | GUID or name of the group to which the user belongs |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges assigned to the user |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of the account |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Current status of the user account. |  [optional] |
|**notifyOnShare** | **Boolean** | User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet. |  [optional] |
|**showOnboardingExperience** | **Boolean** | The user preference for revisiting the onboarding experience |  [optional] |
|**onboardingExperienceCompleted** | **Boolean** | Indicates if the user has completed the onboarding walkthrough |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | IDs or names of the Orgs to which the user belongs |  [optional] |
|**homeLiveboardIdentifier** | **String** | Unique ID or name of the user&#39;s home Liveboard. |  [optional] |
|**favoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects which are assigned as favorites of the user. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included. |  [optional] |
|**sortOptions** | [**SortOptions**](SortOptions.md) | Sort options. |  [optional] |
|**roleIdentifiers** | **List&lt;String&gt;** | Filters by the role assigned to the user. |  [optional] |
|**includeFavoriteMetadata** | **Boolean** | Indicates if the user&#39;s favorite objects should be displayed. |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |



## Enum: List&lt;PrivilegesEnum&gt;

| Name | Value |
|---- | -----|
| ADMINISTRATION | &quot;ADMINISTRATION&quot; |
| AUTHORING | &quot;AUTHORING&quot; |
| USERDATAUPLOADING | &quot;USERDATAUPLOADING&quot; |
| DATADOWNLOADING | &quot;DATADOWNLOADING&quot; |
| USERMANAGEMENT | &quot;USERMANAGEMENT&quot; |
| DATAMANAGEMENT | &quot;DATAMANAGEMENT&quot; |
| SHAREWITHALL | &quot;SHAREWITHALL&quot; |
| JOBSCHEDULING | &quot;JOBSCHEDULING&quot; |
| A3_ANALYSIS | &quot;A3ANALYSIS&quot; |
| EXPERIMENTALFEATUREPRIVILEGE | &quot;EXPERIMENTALFEATUREPRIVILEGE&quot; |
| BYPASSRLS | &quot;BYPASSRLS&quot; |
| RANALYSIS | &quot;RANALYSIS&quot; |
| DEVELOPER | &quot;DEVELOPER&quot; |
| USER_ADMINISTRATION | &quot;USER_ADMINISTRATION&quot; |
| GROUP_ADMINISTRATION | &quot;GROUP_ADMINISTRATION&quot; |
| SYNCMANAGEMENT | &quot;SYNCMANAGEMENT&quot; |
| CAN_CREATE_CATALOG | &quot;CAN_CREATE_CATALOG&quot; |
| DISABLE_PINBOARD_CREATION | &quot;DISABLE_PINBOARD_CREATION&quot; |
| LIVEBOARD_VERIFIER | &quot;LIVEBOARD_VERIFIER&quot; |
| PREVIEW_THOUGHTSPOT_SAGE | &quot;PREVIEW_THOUGHTSPOT_SAGE&quot; |
| APPLICATION_ADMINISTRATION | &quot;APPLICATION_ADMINISTRATION&quot; |
| SYSTEM_INFO_ADMINISTRATION | &quot;SYSTEM_INFO_ADMINISTRATION&quot; |
| ORG_ADMINISTRATION | &quot;ORG_ADMINISTRATION&quot; |
| ROLE_ADMINISTRATION | &quot;ROLE_ADMINISTRATION&quot; |
| AUTHENTICATION_ADMINISTRATION | &quot;AUTHENTICATION_ADMINISTRATION&quot; |
| BILLING_INFO_ADMINISTRATION | &quot;BILLING_INFO_ADMINISTRATION&quot; |
| CAN_MANAGE_CUSTOM_CALENDAR | &quot;CAN_MANAGE_CUSTOM_CALENDAR&quot; |
| CAN_CREATE_OR_EDIT_CONNECTIONS | &quot;CAN_CREATE_OR_EDIT_CONNECTIONS&quot; |
| CAN_MANAGE_WORKSHEET_VIEWS_TABLES | &quot;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&quot; |
| CAN_MANAGE_VERSION_CONTROL | &quot;CAN_MANAGE_VERSION_CONTROL&quot; |
| THIRDPARTY_ANALYSIS | &quot;THIRDPARTY_ANALYSIS&quot; |
| ALLOW_NON_EMBED_FULL_APP_ACCESS | &quot;ALLOW_NON_EMBED_FULL_APP_ACCESS&quot; |
| CAN_ACCESS_ANALYST_STUDIO | &quot;CAN_ACCESS_ANALYST_STUDIO&quot; |
| CAN_MANAGE_ANALYST_STUDIO | &quot;CAN_MANAGE_ANALYST_STUDIO&quot; |
| PREVIEW_DOCUMENT_SEARCH | &quot;PREVIEW_DOCUMENT_SEARCH&quot; |
| CAN_SETUP_VERSION_CONTROL | &quot;CAN_SETUP_VERSION_CONTROL&quot; |
| CAN_MANAGE_WEBHOOKS | &quot;CAN_MANAGE_WEBHOOKS&quot; |
| CAN_DOWNLOAD_VISUALS | &quot;CAN_DOWNLOAD_VISUALS&quot; |
| CAN_DOWNLOAD_DETAILED_DATA | &quot;CAN_DOWNLOAD_DETAILED_DATA&quot; |



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


## Implemented Interfaces

* Serializable


