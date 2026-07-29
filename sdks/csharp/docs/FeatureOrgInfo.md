# ThoughtSpot.RestApi.Sdk.Model.FeatureOrgInfo
Lightweight Org identifier and display name, as returned in feature assignment responses. The field names org_id / org_name intentionally deviate from the bare id / name used by the shared Org type: they are the literal wire keys emitted by the Callosum backend, so they are load-bearing for Prism's response field mapping and cannot be renamed without a backend change.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgId** | **int** | Numeric ID of the Org. | 
**OrgName** | **string** | Display name of the Org. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

