# ThoughtSpot.RestApi.Sdk.Model.VariableUpdateScopeInput
Input for defining the scope of variable value assignments in batch update operations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgIdentifier** | **string** | The unique name of the org | 
**PrincipalType** | **string** | Type of principal to which the variable value applies. Use USER to assign values to a specific user, or USER_GROUP to assign values to a group. | [optional] 
**PrincipalIdentifier** | **string** | Unique ID or name of the principal | [optional] 
**ModelIdentifier** | **string** | Unique ID or name of the model. Required for FORMULA_VARIABLE type to scope the variable value to a specific worksheet. | [optional] 
**Priority** | **int?** | The priority level for this scope assignment, used for conflict resolution when multiple values match. Higher priority values (larger numbers) take precedence. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

