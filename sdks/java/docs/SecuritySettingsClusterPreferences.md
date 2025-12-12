

# SecuritySettingsClusterPreferences

Cluster-level security preferences.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enablePartitionedCookies** | **Boolean** | Support embedded access when third-party cookies are blocked. |  [optional] |
|**corsWhitelistedUrls** | **List&lt;String&gt;** | Allowed origins for CORS. |  [optional] |
|**cspSettings** | [**CspSettings**](CspSettings.md) |  |  [optional] |
|**samlRedirectUrls** | **List&lt;String&gt;** | Allowed redirect hosts for SAML login. |  [optional] |
|**nonEmbedAccess** | [**ClusterNonEmbedAccess**](ClusterNonEmbedAccess.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


