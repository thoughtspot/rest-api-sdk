

# FeatureGroup

A named group of related features. Returned by searchFeatures; the contents of features depend on the requested scope (cluster-admin vs. org-admin view).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureGroup** | **String** | Display name of the feature group. |  [optional] |
|**docsUrl** | **String** | Documentation URL of the feature group itself, when it has one. Not inherited from, or by, the features in the group. |  [optional] |
|**docsNewWindow** | **Boolean** | &#x60;true&#x60; when the group&#39;s documentation link should open in a new browser tab, the default, or &#x60;false&#x60; for the same tab. Omitted when there is no &#x60;docs_url&#x60;. |  [optional] |
|**features** | [**List&lt;FeatureDetail&gt;**](FeatureDetail.md) | Feature details within this group. Each entry contains the fields relevant to the requested scope; org-admin-only and cluster-admin-only fields are null in the other view. |  |


## Implemented Interfaces

* Serializable


