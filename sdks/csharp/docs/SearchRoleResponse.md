# ThoughtSpot.RestApi.Sdk.Model.SearchRoleResponse
Response for search role api should handle hidden privileges as well.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique Id of the role. | 
**Name** | **string** | Name of the role | 
**Description** | **string** | Description of the role | 
**GroupsAssignedCount** | **int?** | number of groups assigned with this role | [optional] 
**Orgs** | [**List&lt;GenericInfo&gt;**](GenericInfo.md) | Orgs in which role exists. | [optional] 
**Groups** | [**List&lt;GenericInfo&gt;**](GenericInfo.md) | Details of groups assigned with this role | [optional] 
**Privileges** | **List&lt;SearchRoleResponse.PrivilegesEnum&gt;** | Privileges granted to the role. | 
**Permission** | **string** | Permission details of the Role | [optional] 
**AuthorId** | **string** | Unique identifier of author of the role. | [optional] 
**ModifierId** | **string** | Unique identifier of modifier of the role. | [optional] 
**CreationTimeInMillis** | **Object** | Creation time of the role in milliseconds. | [optional] 
**ModificationTimeInMillis** | **Object** | Last modified time of the role in milliseconds. | [optional] 
**Deleted** | **bool?** | Indicates whether the role is deleted. | [optional] 
**Deprecated** | **bool?** | Indicates whether the role is deprecated. | [optional] 
**External** | **bool?** | Indicates whether the role is external. | [optional] 
**Hidden** | **bool?** | Indicates whether the role is hidden. | [optional] 
**SharedViaConnection** | **bool?** | Indicates whether the role is shared via connection | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

