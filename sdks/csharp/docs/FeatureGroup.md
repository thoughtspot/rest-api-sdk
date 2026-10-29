# ThoughtSpot.RestApi.Sdk.Model.FeatureGroup
A named group of related features. Returned by searchFeatures; the contents of features depend on the requested scope (cluster-admin vs. org-admin view).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarFeatureGroup** | **string** | Display name of the feature group. | [optional] 
**DocsUrl** | **string** | Documentation URL of the feature group itself, when it has one. Not inherited from, or by, the features in the group. | [optional] 
**DocsNewWindow** | **bool?** | &#x60;true&#x60; when the group&#39;s documentation link should open in a new browser tab, the default, or &#x60;false&#x60; for the same tab. Omitted when there is no &#x60;docs_url&#x60;. | [optional] 
**Features** | [**List&lt;FeatureDetail&gt;**](FeatureDetail.md) | Feature details within this group. Each entry contains the fields relevant to the requested scope; org-admin-only and cluster-admin-only fields are null in the other view. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

