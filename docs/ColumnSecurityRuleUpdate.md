# ThoughtSpot.Client.Model.ColumnSecurityRuleUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ColumnIdentifier** | **string** | Column identifier (col_id or name) | 
**IsUnsecured** | **bool?** | If true, the column will be marked as unprotected and all groups associated with it will be removed | [optional] 
**GroupAccess** | [**List&lt;ColumnSecurityRuleGroupOperation&gt;**](ColumnSecurityRuleGroupOperation.md) | Array of group operation objects that specifies the actions for groups to be associated with a column | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

