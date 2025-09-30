

# SearchUserGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultLiveboardIdentifiers** | **List&lt;String&gt;** | GUID of Liveboards that are assigned as default Liveboards to the users in the group. |  [optional] |
|**description** | **String** | Description of the group |  [optional] |
|**displayName** | **String** | Display name of the group |  [optional] |
|**namePattern** | **String** | A pattern to match case-insensitive name of the Group object. |  [optional] |
|**groupIdentifier** | **String** | GUID or name of the group |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | ID or name of the Org to which the group belongs |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges assigned to the group. |  [optional] |
|**subGroupIdentifiers** | **List&lt;String&gt;** | GUID or name of the sub groups. A subgroup is a group assigned to a parent group. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Group type. |  [optional] |
|**userIdentifiers** | **List&lt;String&gt;** | GUID or name of the users assigned to the group. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE. |  [optional] |
|**roleIdentifiers** | **List&lt;String&gt;** | Filter groups with a list of Roles assigned to a group |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included. |  [optional] |
|**sortOptions** | [**SortOptions**](SortOptions.md) | Sort options to filter group details. |  [optional] |
|**includeUsers** | **Boolean** | &lt;div&gt;Version: 10.10.0.cl or later &lt;/div&gt;  Define Parameter to consider if the users should be included in group search response. |  [optional] |
|**includeSubGroups** | **Boolean** | &lt;div&gt;Version: 10.10.0.cl or later &lt;/div&gt;  Define Parameter to consider if the sub groups should be included in group search response. |  [optional] |



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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOCAL_GROUP | &quot;LOCAL_GROUP&quot; |
| LDAP_GROUP | &quot;LDAP_GROUP&quot; |
| TEAM_GROUP | &quot;TEAM_GROUP&quot; |
| TENANT_GROUP | &quot;TENANT_GROUP&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |


## Implemented Interfaces

* Serializable


