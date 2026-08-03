# ThoughtSpot.RestApi.Sdk.Model.GroupsImportListInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisplayName** | **string** | Unique display name of the group. | 
**GroupIdentifier** | **string** | Unique ID or name of the group. | 
**DefaultLiveboardIdentifiers** | **List&lt;string&gt;** | Unique ID of Liveboards that will be assigned as default Liveboards to the users in the group. | [optional] 
**Description** | **string** | Description of the group. | [optional] 
**Privileges** | **List&lt;GroupsImportListInput.PrivilegesEnum&gt;** | Privileges that will be assigned to the group. Note: AUTHORING is a no-op — always inherited via ALL_GROUP, assigning it has no effect. | [optional] 
**SubGroupIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the sub-groups to add to the group. | [optional] 
**Type** | **string** | Type of the group. | [optional] 
**UserIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the users to assign to the group. | [optional] 
**Visibility** | **string** | Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

