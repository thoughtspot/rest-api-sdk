# ThoughtSpot.RestApi.Sdk.Model.FeatureAssignmentResponse
Response returned when a feature's Org assignments are updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeatureId** | **string** | Underlying unique feature ID. | 
**FeatureName** | **string** | User-friendly feature name. Present when the feature declares one. | [optional] 
**AssignedOrgs** | [**List&lt;FeatureOrgInfo&gt;**](FeatureOrgInfo.md) | Updated set of Orgs assigned to the feature. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

