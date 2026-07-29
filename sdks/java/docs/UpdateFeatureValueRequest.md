

# UpdateFeatureValueRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Determines the scope at which the value is set. Use CLUSTER to set the cluster-level value; use ORG to set a per-Org value override. |  |
|**orgIdentifier** | **Integer** | Numeric ID of the Org for which to set the value. Required when scope is ORG; ignored when scope is CLUSTER. |  [optional] |
|**featureIdentifier** | **String** | User-friendly feature name (feature_name) or the underlying feature ID (feature_id) of the feature whose value should be set. |  |
|**featureValue** | **String** | New value to set for the feature. |  |
|**resetOrgOverrides** | **Boolean** | Applicable only when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. When &#x60;true&#x60;, any existing per-Org value overrides for this feature are removed so that all Orgs inherit the new cluster-level value. Required when &#x60;scope&#x60; is &#x60;CLUSTER&#x60; for an org-aware feature. Must be omitted when &#x60;scope&#x60; is &#x60;ORG&#x60;; passing it at &#x60;ORG&#x60; scope returns a 400 error. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


