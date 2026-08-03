# ThoughtSpot.RestApi.Sdk.Model.UpdateUserGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the group to modify. | [optional] 
**DefaultLiveboardIdentifiers** | **List&lt;string&gt;** | ID of the Liveboards to be assigned as default Liveboards to the users in the group. | [optional] 
**Description** | **string** | Description for the group. | [optional] 
**DisplayName** | **string** | Display name of the group. | [optional] 
**Privileges** | **List&lt;UpdateUserGroupRequest.PrivilegesEnum&gt;** | Privileges to assign to the group. Note: AUTHORING is a no-op — always inherited via ALL_GROUP, assigning it has no effect. | [optional] 
**SubGroupIdentifiers** | **List&lt;string&gt;** | GUID or name of the sub groups. A subgroup is a group assigned to a parent group. | [optional] 
**Type** | **string** | Type of the group | [optional] 
**UserIdentifiers** | **List&lt;string&gt;** | GUID or name of the users to assign to the group. | [optional] 
**Visibility** | **string** | Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE. | [optional] 
**RoleIdentifiers** | **List&lt;string&gt;** | Role identifiers of the Roles that should be assigned to the group. | [optional] 
**Operation** | **string** | Type of update operation. Default operation type is REPLACE | [optional] [default to OperationEnum.REPLACE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

