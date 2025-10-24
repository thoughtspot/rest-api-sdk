

# CreateRoleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name of the Role. |  |
|**description** | **String** | Description of the Role. |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges granted to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges. |  [optional] |
|**readOnly** | **Boolean** | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Indicates whether the role is read only. A readonly role can neither be updated nor deleted. |  [optional] |



## Enum: List&lt;PrivilegesEnum&gt;

| Name | Value |
|---- | -----|
| USERDATAUPLOADING | &quot;USERDATAUPLOADING&quot; |
| DATADOWNLOADING | &quot;DATADOWNLOADING&quot; |
| DATAMANAGEMENT | &quot;DATAMANAGEMENT&quot; |
| SHAREWITHALL | &quot;SHAREWITHALL&quot; |
| JOBSCHEDULING | &quot;JOBSCHEDULING&quot; |
| A3_ANALYSIS | &quot;A3ANALYSIS&quot; |
| BYPASSRLS | &quot;BYPASSRLS&quot; |
| DISABLE_PINBOARD_CREATION | &quot;DISABLE_PINBOARD_CREATION&quot; |
| DEVELOPER | &quot;DEVELOPER&quot; |
| APPLICATION_ADMINISTRATION | &quot;APPLICATION_ADMINISTRATION&quot; |
| USER_ADMINISTRATION | &quot;USER_ADMINISTRATION&quot; |
| GROUP_ADMINISTRATION | &quot;GROUP_ADMINISTRATION&quot; |
| SYSTEM_INFO_ADMINISTRATION | &quot;SYSTEM_INFO_ADMINISTRATION&quot; |
| SYNCMANAGEMENT | &quot;SYNCMANAGEMENT&quot; |
| ORG_ADMINISTRATION | &quot;ORG_ADMINISTRATION&quot; |
| ROLE_ADMINISTRATION | &quot;ROLE_ADMINISTRATION&quot; |
| AUTHENTICATION_ADMINISTRATION | &quot;AUTHENTICATION_ADMINISTRATION&quot; |
| BILLING_INFO_ADMINISTRATION | &quot;BILLING_INFO_ADMINISTRATION&quot; |
| CONTROL_TRUSTED_AUTH | &quot;CONTROL_TRUSTED_AUTH&quot; |
| TAGMANAGEMENT | &quot;TAGMANAGEMENT&quot; |
| LIVEBOARD_VERIFIER | &quot;LIVEBOARD_VERIFIER&quot; |
| CAN_MANAGE_CUSTOM_CALENDAR | &quot;CAN_MANAGE_CUSTOM_CALENDAR&quot; |
| CAN_CREATE_OR_EDIT_CONNECTIONS | &quot;CAN_CREATE_OR_EDIT_CONNECTIONS&quot; |
| CAN_MANAGE_WORKSHEET_VIEWS_TABLES | &quot;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&quot; |
| CAN_MANAGE_VERSION_CONTROL | &quot;CAN_MANAGE_VERSION_CONTROL&quot; |
| THIRDPARTY_ANALYSIS | &quot;THIRDPARTY_ANALYSIS&quot; |
| CAN_CREATE_CATALOG | &quot;CAN_CREATE_CATALOG&quot; |
| ALLOW_NON_EMBED_FULL_APP_ACCESS | &quot;ALLOW_NON_EMBED_FULL_APP_ACCESS&quot; |
| CAN_ACCESS_ANALYST_STUDIO | &quot;CAN_ACCESS_ANALYST_STUDIO&quot; |
| CAN_MANAGE_ANALYST_STUDIO | &quot;CAN_MANAGE_ANALYST_STUDIO&quot; |
| PREVIEW_DOCUMENT_SEARCH | &quot;PREVIEW_DOCUMENT_SEARCH&quot; |
| CAN_MODIFY_FOLDERS | &quot;CAN_MODIFY_FOLDERS&quot; |
| CAN_VIEW_FOLDERS | &quot;CAN_VIEW_FOLDERS&quot; |
| CAN_SETUP_VERSION_CONTROL | &quot;CAN_SETUP_VERSION_CONTROL&quot; |
| PREVIEW_THOUGHTSPOT_SAGE | &quot;PREVIEW_THOUGHTSPOT_SAGE&quot; |
| CAN_MANAGE_WEBHOOKS | &quot;CAN_MANAGE_WEBHOOKS&quot; |
| CAN_DOWNLOAD_VISUALS | &quot;CAN_DOWNLOAD_VISUALS&quot; |
| CAN_DOWNLOAD_DETAILED_DATA | &quot;CAN_DOWNLOAD_DETAILED_DATA&quot; |


## Implemented Interfaces

* Serializable


