# ThoughtSpot.RestApi.Sdk.Model.FeatureValueResponse
Response returned when a feature's value is set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeatureId** | **string** | Underlying unique feature ID. The dotted-path format (for example, &#x60;orion.embraceConfig.doIndexing&#x60;) is internal and subject to change without notice; use &#x60;feature_name&#x60; as the stable display identifier where possible. | 
**FeatureName** | **string** | User-friendly feature name. Present when the feature declares one. | [optional] 
**FeatureValue** | **string** | The value that was written. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

