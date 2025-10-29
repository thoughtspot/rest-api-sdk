

# SearchRolesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleIdentifiers** | **List&lt;String&gt;** | unique ID or name of the Roles |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | Unique Id or name of the Organisation |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique Id or name of the User Group |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges assigned to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges. |  [optional] |
|**deprecated** | **Boolean** | Indicates whether the Role is deprecated. |  [optional] |
|**external** | **Boolean** | Indicates whether the Role is external |  [optional] |
|**sharedViaConnection** | **Boolean** | Indicates whether the Role is shared via connection |  [optional] |
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | Permission details of the Role |  [optional] |



## Enum: List&lt;PrivilegesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| ADMINISTRATION | &quot;ADMINISTRATION&quot; |
| AUTHORING | &quot;AUTHORING&quot; |
| USERDATAUPLOADING | &quot;USERDATAUPLOADING&quot; |
| DATADOWNLOADING | &quot;DATADOWNLOADING&quot; |
| USERMANAGEMENT | &quot;USERMANAGEMENT&quot; |
| SECURITYMANAGEMENT | &quot;SECURITYMANAGEMENT&quot; |
| LOGICALMODELING | &quot;LOGICALMODELING&quot; |
| DATAMANAGEMENT | &quot;DATAMANAGEMENT&quot; |
| TAGMANAGEMENT | &quot;TAGMANAGEMENT&quot; |
| SHAREWITHALL | &quot;SHAREWITHALL&quot; |
| SYSTEMMANAGEMENT | &quot;SYSTEMMANAGEMENT&quot; |
| JOBSCHEDULING | &quot;JOBSCHEDULING&quot; |
| A3_ANALYSIS | &quot;A3ANALYSIS&quot; |
| EXPERIMENTALFEATUREPRIVILEGE | &quot;EXPERIMENTALFEATUREPRIVILEGE&quot; |
| BYPASSRLS | &quot;BYPASSRLS&quot; |
| RANALYSIS | &quot;RANALYSIS&quot; |
| DISABLE_PINBOARD_CREATION | &quot;DISABLE_PINBOARD_CREATION&quot; |
| DEVELOPER | &quot;DEVELOPER&quot; |
| APPLICATION_ADMINISTRATION | &quot;APPLICATION_ADMINISTRATION&quot; |
| USER_ADMINISTRATION | &quot;USER_ADMINISTRATION&quot; |
| GROUP_ADMINISTRATION | &quot;GROUP_ADMINISTRATION&quot; |
| BACKUP_ADMINISTRATION | &quot;BACKUP_ADMINISTRATION&quot; |
| SYSTEM_INFO_ADMINISTRATION | &quot;SYSTEM_INFO_ADMINISTRATION&quot; |
| ENABLESPOTAPPCREATION | &quot;ENABLESPOTAPPCREATION&quot; |
| SYNCMANAGEMENT | &quot;SYNCMANAGEMENT&quot; |
| ORG_ADMINISTRATION | &quot;ORG_ADMINISTRATION&quot; |
| ROLE_ADMINISTRATION | &quot;ROLE_ADMINISTRATION&quot; |
| AUTHENTICATION_ADMINISTRATION | &quot;AUTHENTICATION_ADMINISTRATION&quot; |
| BILLING_INFO_ADMINISTRATION | &quot;BILLING_INFO_ADMINISTRATION&quot; |
| PREVIEW_THOUGHTSPOT_SAGE | &quot;PREVIEW_THOUGHTSPOT_SAGE&quot; |
| LIVEBOARD_VERIFIER | &quot;LIVEBOARD_VERIFIER&quot; |
| CAN_MANAGE_CUSTOM_CALENDAR | &quot;CAN_MANAGE_CUSTOM_CALENDAR&quot; |
| CAN_CREATE_OR_EDIT_CONNECTIONS | &quot;CAN_CREATE_OR_EDIT_CONNECTIONS&quot; |
| CAN_CONFIGURE_CONNECTIONS | &quot;CAN_CONFIGURE_CONNECTIONS&quot; |
| CAN_MANAGE_WORKSHEET_VIEWS_TABLES | &quot;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&quot; |
| CAN_MANAGE_VERSION_CONTROL | &quot;CAN_MANAGE_VERSION_CONTROL&quot; |
| THIRDPARTY_ANALYSIS | &quot;THIRDPARTY_ANALYSIS&quot; |
| CONTROL_TRUSTED_AUTH | &quot;CONTROL_TRUSTED_AUTH&quot; |
| CAN_CREATE_CATALOG | &quot;CAN_CREATE_CATALOG&quot; |
| ALLOW_NON_EMBED_FULL_APP_ACCESS | &quot;ALLOW_NON_EMBED_FULL_APP_ACCESS&quot; |
| CAN_ACCESS_ANALYST_STUDIO | &quot;CAN_ACCESS_ANALYST_STUDIO&quot; |
| CAN_MANAGE_ANALYST_STUDIO | &quot;CAN_MANAGE_ANALYST_STUDIO&quot; |
| CAN_VIEW_FOLDERS | &quot;CAN_VIEW_FOLDERS&quot; |
| CAN_MODIDY_FOLDERS | &quot;CAN_MODIDY_FOLDERS&quot; |
| CAN_MANAGE_VARIABLES | &quot;CAN_MANAGE_VARIABLES&quot; |
| PREVIEW_DOCUMENT_SEARCH | &quot;PREVIEW_DOCUMENT_SEARCH&quot; |
| CAN_SETUP_VERSION_CONTROL | &quot;CAN_SETUP_VERSION_CONTROL&quot; |
| CAN_MANAGE_WEBHOOKS | &quot;CAN_MANAGE_WEBHOOKS&quot; |
| CAN_DOWNLOAD_VISUALS | &quot;CAN_DOWNLOAD_VISUALS&quot; |
| CAN_DOWNLOAD_DETAILED_DATA | &quot;CAN_DOWNLOAD_DETAILED_DATA&quot; |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| READ_ONLY | &quot;READ_ONLY&quot; |
| MODIFY | &quot;MODIFY&quot; |
| NO_ACCESS | &quot;NO_ACCESS&quot; |


## Implemented Interfaces

* Serializable


