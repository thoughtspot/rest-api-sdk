

# FeatureGroup

A named group of related features. Returned by searchFeatures; the contents of features depend on the requested scope (cluster-admin vs. org-admin view).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureGroup** | **String** | Display name of the feature group. |  [optional] |
|**docsUrl** | **String** | Documentation URL for the feature group, when available. |  [optional] |
|**features** | [**List&lt;FeatureDetail&gt;**](FeatureDetail.md) | Feature details within this group. Each entry contains the fields relevant to the requested scope; org-admin-only and cluster-admin-only fields are null in the other view. |  |


## Implemented Interfaces

* Serializable


