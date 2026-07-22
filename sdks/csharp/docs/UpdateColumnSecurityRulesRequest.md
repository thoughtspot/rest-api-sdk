# ThoughtSpot.RestApi.Sdk.Model.UpdateColumnSecurityRulesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | **string** | GUID or name of the table for which we want to create column security rules | [optional] 
**ObjIdentifier** | **string** | The object ID of the table | [optional] 
**ClearCsr** | **bool?** | If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed | [optional] 
**ColumnSecurityRules** | [**List&lt;ColumnSecurityRuleUpdate&gt;**](ColumnSecurityRuleUpdate.md) | Array where each object defines the security rule for a specific column | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

