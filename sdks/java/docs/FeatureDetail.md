

# FeatureDetail

Detail for a single feature. Fields are populated according to the scope of the search: cluster-admin (CLUSTER) responses populate assigned_orgs, is_org_aware, and (for non-org-aware features) feature_value; org-admin (ORG) responses populate element_type, element_config, and element_value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureId** | **String** | Underlying unique feature ID. The dotted-path format (for example, &#x60;orion.embraceConfig.doIndexing&#x60;) is internal and subject to change without notice; use &#x60;feature_name&#x60; as the stable display identifier where possible. |  |
|**featureName** | **String** | User-friendly feature name. Present when the feature declares one. |  [optional] |
|**assignedOrgs** | [**List&lt;FeatureOrgInfo&gt;**](FeatureOrgInfo.md) | Orgs currently assigned to this feature. Populated in the cluster-admin view. |  [optional] |
|**isOrgAware** | **Boolean** | Whether the feature is Org-aware. Org-aware features are managed via per-Org assignment; non-org-aware features are cluster-level toggles. Populated in the cluster-admin view. |  [optional] |
|**featureValue** | **String** | Current cluster-level value of the feature. Populated in the cluster-admin view for non-org-aware features; null for Org-aware features. Values are always returned as strings; for boolean toggles this is &#x60;\&quot;true\&quot;&#x60; or &#x60;\&quot;false\&quot;&#x60;. |  [optional] |
|**elementType** | **String** | UI element type hint for the feature. Populated in the org-admin view. |  [optional] |
|**elementConfig** | **Object** | UI element configuration for the feature. Populated in the org-admin view. An opaque blob whose structure varies by &#x60;element_type&#x60;; a &#x60;label&#x60; string is the common envelope field. |  [optional] |
|**elementValue** | **String** | Current value of the feature for the requested Org. Populated in the org-admin view. |  [optional] |
|**docsUrl** | **String** | Per-feature documentation URL, when available. |  [optional] |


## Implemented Interfaces

* Serializable


