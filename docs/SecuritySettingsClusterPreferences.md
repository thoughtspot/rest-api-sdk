# ThoughtSpot.Client.Model.SecuritySettingsClusterPreferences
Cluster-level security preferences.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnablePartitionedCookies** | **bool?** | Support embedded access when third-party cookies are blocked. | [optional] 
**CorsWhitelistedUrls** | **List&lt;string&gt;** | Allowed origins for CORS. | [optional] 
**CspSettings** | [**CspSettings**](CspSettings.md) |  | [optional] 
**SamlRedirectUrls** | **List&lt;string&gt;** | Allowed redirect hosts for SAML login. | [optional] 
**NonEmbedAccess** | [**ClusterNonEmbedAccess**](ClusterNonEmbedAccess.md) |  | [optional] 
**TrustedAuthStatus** | **string** | Trusted authentication status at the cluster level.    Version: 26.6.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

