

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
|**trustedAuthStatus** | [**TrustedAuthStatusEnum**](#TrustedAuthStatusEnum) | Trusted authentication status at the cluster level.    Version: 26.6.0.cl or later  |  [optional] |



## Enum: TrustedAuthStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |


## Implemented Interfaces

* Serializable


