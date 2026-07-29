# ThoughtSpot.RestApi.Sdk.Model.FeatureGroup
A named group of related features. Returned by searchFeatures; the contents of features depend on the requested scope (cluster-admin vs. org-admin view).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarFeatureGroup** | **string** | Display name of the feature group. | [optional] 
**DocsUrl** | **string** | Documentation URL for the feature group, when available. | [optional] 
**Features** | [**List&lt;FeatureDetail&gt;**](FeatureDetail.md) | Feature details within this group. Each entry contains the fields relevant to the requested scope; org-admin-only and cluster-admin-only fields are null in the other view. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

