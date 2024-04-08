

# SearchRoleResponse

Response for search role api should handle hidden privileges as well.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique Id of the role. |  |
|**name** | **String** | Name of the role |  |
|**description** | **String** | Description of the role |  |
|**groupsAssignedCount** | **Integer** | number of groups assigned with this role |  [optional] |
|**orgs** | [**List&lt;GenericInfo&gt;**](GenericInfo.md) | Orgs in which role exists. |  [optional] |
|**groups** | [**List&lt;GenericInfo&gt;**](GenericInfo.md) | Details of groups assigned with this role |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges granted to the role. |  |
|**permission** | [**PermissionEnum**](#PermissionEnum) | Permission details of the Role |  [optional] |
|**authorId** | **String** | Unique identifier of author of the role. |  [optional] |
|**modifierId** | **String** | Unique identifier of modifier of the role. |  [optional] |
|**creationTimeInMillis** | **Object** | Creation time of the role in milliseconds. |  [optional] |
|**modificationTimeInMillis** | **Object** | Last modified time of the role in milliseconds. |  [optional] |
|**deleted** | **Boolean** | Indicates whether the role is deleted. |  [optional] |
|**deprecated** | **Boolean** | Indicates whether the role is deprecated. |  [optional] |
|**external** | **Boolean** | Indicates whether the role is external. |  [optional] |
|**hidden** | **Boolean** | Indicates whether the role is hidden. |  [optional] |
|**sharedViaConnection** | **Boolean** | Indicates whether the role is shared via connection |  [optional] |



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



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| READ_ONLY | &quot;READ_ONLY&quot; |
| MODIFY | &quot;MODIFY&quot; |
| NO_ACCESS | &quot;NO_ACCESS&quot; |



