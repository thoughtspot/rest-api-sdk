

# SecuritySettingsClusterPreferencesInput

Input for cluster-level security preferences configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enablePartitionedCookies** | **Boolean** | Support embedded access when third-party cookies are blocked. |  [optional] |
|**corsWhitelistedUrls** | **List&lt;String&gt;** | Allowed origins for CORS. Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**cspSettings** | [**CspSettingsInput**](CspSettingsInput.md) |  |  [optional] |
|**samlRedirectUrls** | **List&lt;String&gt;** | Allowed redirect hosts for SAML login. Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**nonEmbedAccess** | [**ClusterNonEmbedAccessInput**](ClusterNonEmbedAccessInput.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


