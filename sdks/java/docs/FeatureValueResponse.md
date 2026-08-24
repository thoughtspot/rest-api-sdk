

# FeatureValueResponse

Response returned when a feature's value is set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureId** | **String** | Underlying unique feature ID. The dotted-path format (for example, &#x60;orion.embraceConfig.doIndexing&#x60;) is internal and subject to change without notice; use &#x60;feature_name&#x60; as the stable display identifier where possible. |  |
|**featureName** | **String** | User-friendly feature name. Present when the feature declares one. |  [optional] |
|**featureValue** | **String** | The value that was written. |  |


## Implemented Interfaces

* Serializable


