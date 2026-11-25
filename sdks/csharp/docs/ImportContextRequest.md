# ThoughtSpot.RestApi.Sdk.Model.ImportContextRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | The YAML file to import, usually the &#x60;content&#x60; returned by exportContext, edited or as is. The file&#39;s own selection decides what is replaced, so no other identifiers are needed. Up to 10 MiB. | 
**DryRun** | **bool** | Required. When &#x60;true&#x60;, validates the file and returns what the import would change, without writing anything. When &#x60;false&#x60;, applies the import. There is no default, so a real import is never triggered by omission. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

