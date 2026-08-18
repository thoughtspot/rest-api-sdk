# ThoughtSpot.RestApi.Sdk.Model.ResponseCustomAction
Custom action details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionDetails** | [**ActionDetails**](ActionDetails.md) |  | 
**DefaultActionConfig** | [**DefaultActionConfig**](DefaultActionConfig.md) |  | 
**Id** | **string** | Unique Id of the custom action. | 
**ObjId** | **string** | Custom object ID (obj_id) of the custom action, if one is set.    Version: 26.9.0.cl or later  | [optional] 
**MetadataAssociation** | [**List&lt;MetadataAssociationItem&gt;**](MetadataAssociationItem.md) | Metadata objects to assign the the custom action to. | [optional] 
**Name** | **string** | Unique name of the custom action. | 
**UserGroups** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Unique ID or name of the User groups which are associated with the custom action. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

