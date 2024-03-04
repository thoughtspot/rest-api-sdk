

# CreateUserGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the group. The group name must be unique. |  |
|**displayName** | **String** | Display name for the group. |  |
|**defaultLiveboardIdentifiers** | **List&lt;String&gt;** | GUID of the Liveboards to assign as default Liveboards to the users in the group. |  [optional] |
|**description** | **String** | Description of the group |  [optional] |
|**privileges** | [**List&lt;PrivilegesEnum&gt;**](#List&lt;PrivilegesEnum&gt;) | Privileges to assign to the group |  [optional] |
|**subGroupIdentifiers** | **List&lt;String&gt;** | GUID or name of the sub groups. A subgroup is a group assigned to a parent group. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Group type. |  [optional] |
|**userIdentifiers** | **List&lt;String&gt;** | GUID or name of the users to assign to the group. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE. |  [optional] |
|**roleIdentifiers** | **List&lt;String&gt;** | Role identifiers of the roles that should be assigned to the group. |  [optional] |



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
| A3ANALYSIS | &quot;A3ANALYSIS&quot; |
| EXPERIMENTALFEATUREPRIVILEGE | &quot;EXPERIMENTALFEATUREPRIVILEGE&quot; |
| BYPASSRLS | &quot;BYPASSRLS&quot; |
| RANALYSIS | &quot;RANALYSIS&quot; |
| DEVELOPER | &quot;DEVELOPER&quot; |
| USER_ADMINISTRATION | &quot;USER_ADMINISTRATION&quot; |
| GROUP_ADMINISTRATION | &quot;GROUP_ADMINISTRATION&quot; |
| SYNCMANAGEMENT | &quot;SYNCMANAGEMENT&quot; |
| CAN_CREATE_CATALOG | &quot;CAN_CREATE_CATALOG&quot; |
| DISABLE_PINBOARD_CREATION | &quot;DISABLE_PINBOARD_CREATION&quot; |
| ENABLESPOTAPPCREATION | &quot;ENABLESPOTAPPCREATION&quot; |
| LIVEBOARD_VERIFIER | &quot;LIVEBOARD_VERIFIER&quot; |
| PREVIEW_THOUGHTSPOT_SAGE | &quot;PREVIEW_THOUGHTSPOT_SAGE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOCAL_GROUP | &quot;LOCAL_GROUP&quot; |
| LDAP_GROUP | &quot;LDAP_GROUP&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |



