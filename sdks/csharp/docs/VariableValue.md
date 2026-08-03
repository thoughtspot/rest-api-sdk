# ThoughtSpot.RestApi.Sdk.Model.VariableValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **string** | The value of the variable | [optional] 
**ValueList** | **List&lt;string&gt;** | The value of the variable if it is a list type | [optional] 
**OrgIdentifier** | **string** | The unique name of the org | 
**PrincipalType** | **string** | Type of principal to which this value applies. Use USER to assign the value to a specific user, or USER_GROUP to assign it to a group. | [optional] 
**PrincipalIdentifier** | **string** | Unique ID or name of the principal | [optional] 
**ModelIdentifier** | **string** | Unique ID of the model   Version: 26.3.0.cl or later  | [optional] 
**Priority** | **int?** | The priority assigned to this value. If there are 2 matching values, the one with the higher priority will be picked. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

