# ThoughtSpot.RestApi.Sdk.Model.SearchVariablesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VariableDetails** | [**List&lt;VariableDetailInput&gt;**](VariableDetailInput.md) | Variable details | [optional] 
**ValueScope** | [**List&lt;ValueScopeInput&gt;**](ValueScopeInput.md) | Array of scope filters | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included | [optional] [default to 10]
**ResponseContent** | **string** | Format in which we want the output | [optional] [default to ResponseContentEnum.METADATA]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

