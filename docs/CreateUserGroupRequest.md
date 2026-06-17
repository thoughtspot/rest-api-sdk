# ThoughtSpot.Client.Model.CreateUserGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the group. The group name must be unique. | 
**DisplayName** | **string** | Display name for the group. | 
**DefaultLiveboardIdentifiers** | **List&lt;string&gt;** | GUID of the Liveboards to assign as default Liveboards to the users in the group. | [optional] 
**Description** | **string** | Description of the group | [optional] 
**Privileges** | **List&lt;CreateUserGroupRequest.PrivilegesEnum&gt;** | Privileges to assign to the group. Note: AUTHORING is a no-op — always inherited via ALL_GROUP, assigning it has no effect. | [optional] 
**SubGroupIdentifiers** | **List&lt;string&gt;** | GUID or name of the sub groups. A subgroup is a group assigned to a parent group. | [optional] 
**Type** | **string** | Group type. | [optional] [default to TypeEnum.LOCALGROUP]
**UserIdentifiers** | **List&lt;string&gt;** | GUID or name of the users to assign to the group. | [optional] 
**Visibility** | **string** | Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE. | [optional] [default to VisibilityEnum.SHARABLE]
**RoleIdentifiers** | **List&lt;string&gt;** | Role identifiers of the roles that should be assigned to the group. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

