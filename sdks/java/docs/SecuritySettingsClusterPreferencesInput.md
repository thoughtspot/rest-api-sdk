

# SecuritySettingsClusterPreferencesInput

Input for cluster-level security preferences configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enablePartitionedCookies** | **Boolean** | Support embedded access when third-party cookies are blocked. |  [optional] |
|**corsWhitelistedUrls** | **List&lt;String&gt;** | Allowed origins for CORS. |  [optional] |
|**cspSettings** | [**CspSettingsInput**](CspSettingsInput.md) |  |  [optional] |
|**samlRedirectUrls** | **List&lt;String&gt;** | Allowed redirect hosts for SAML login. |  [optional] |
|**nonEmbedAccess** | [**ClusterNonEmbedAccessInput**](ClusterNonEmbedAccessInput.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


