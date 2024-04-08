

# SearchRolesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleIdentifiers** | **List&lt;String&gt;** | unique ID or name of the roles |  [optional] |
|**orgIdentifiers** | **List&lt;String&gt;** | Unique Id or name of the Organisation |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique Id or name of the User Group |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges assigned to the Role. |  [optional] |
|**deprecated** | **Boolean** | Indicates whether the role is deprecated. |  [optional] |
|**external** | **Boolean** | Indicates whether the Role is external |  [optional] |
|**sharedViaConnection** | **Boolean** | Indicates whether the role is shared via connection |  [optional] |
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
| A3ANALYSIS | &quot;A3ANALYSIS&quot; |
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



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| READ_ONLY | &quot;READ_ONLY&quot; |
| MODIFY | &quot;MODIFY&quot; |
| NO_ACCESS | &quot;NO_ACCESS&quot; |



