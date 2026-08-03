# ThoughtSpot.RestApi.Sdk.Model.UpdateVariableValuesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VariableAssignment** | [**List&lt;VariableUpdateAssignmentInput&gt;**](VariableUpdateAssignmentInput.md) | Array of variable assignment objects specifying the variable identifier, values to assign, and the operation type (ADD, REMOVE, REPLACE, or RESET) to perform on each variable. | 
**VariableValueScope** | [**List&lt;VariableUpdateScopeInput&gt;**](VariableUpdateScopeInput.md) | Array of scope objects defining where the variable values apply, including organization context, optional principal constraints (user or group), model reference for formula variables, and priority for conflict resolution. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

