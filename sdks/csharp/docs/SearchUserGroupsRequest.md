# ThoughtSpot.RestApi.Sdk.Model.SearchUserGroupsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultLiveboardIdentifiers** | **List&lt;string&gt;** | GUID of Liveboards that are assigned as default Liveboards to the users in the group. | [optional] 
**Description** | **string** | Description of the group | [optional] 
**DisplayName** | **string** | Display name of the group | [optional] 
**NamePattern** | **string** | A pattern to match case-insensitive name of the Group object. | [optional] 
**GroupIdentifier** | **string** | GUID or name of the group | [optional] 
**OrgIdentifiers** | **List&lt;string&gt;** | ID or name of the Org to which the group belongs | [optional] 
**Privileges** | **List&lt;SearchUserGroupsRequest.PrivilegesEnum&gt;** | Privileges assigned to the group. | [optional] 
**SubGroupIdentifiers** | **List&lt;string&gt;** | GUID or name of the sub groups. A subgroup is a group assigned to a parent group. | [optional] 
**Type** | **string** | Group type. | [optional] 
**UserIdentifiers** | **List&lt;string&gt;** | GUID or name of the users assigned to the group. | [optional] 
**Visibility** | **string** | Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE. | [optional] 
**RoleIdentifiers** | **List&lt;string&gt;** | Filter groups with a list of Roles assigned to a group | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included. | [optional] [default to 10]
**SortOptions** | [**SortOptions**](SortOptions.md) | Sort options to filter group details. | [optional] 
**IncludeUsers** | **bool?** | &lt;div&gt;Version: 10.10.0.cl or later &lt;/div&gt;  Define Parameter to consider if the users should be included in group search response. | [optional] [default to true]
**IncludeSubGroups** | **bool?** | &lt;div&gt;Version: 10.10.0.cl or later &lt;/div&gt;  Define Parameter to consider if the sub groups should be included in group search response. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

