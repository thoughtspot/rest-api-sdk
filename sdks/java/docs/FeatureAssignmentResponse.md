

# FeatureAssignmentResponse

Response returned when a feature's Org assignments are updated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureId** | **String** | Underlying unique feature ID. |  |
|**featureName** | **String** | User-friendly feature name. Present when the feature declares one. |  [optional] |
|**assignedOrgs** | [**List&lt;FeatureOrgInfo&gt;**](FeatureOrgInfo.md) | Updated set of Orgs assigned to the feature. |  |


## Implemented Interfaces

* Serializable


