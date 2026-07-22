# ThoughtSpot.RestApi.Sdk.Model.SecuritySettingsClusterPreferencesInput
Input for cluster-level security preferences configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnablePartitionedCookies** | **bool?** | Support embedded access when third-party cookies are blocked. | [optional] 
**CorsWhitelistedUrls** | **List&lt;string&gt;** | Allowed origins for CORS. | [optional] 
**CspSettings** | [**CspSettingsInput**](CspSettingsInput.md) |  | [optional] 
**SamlRedirectUrls** | **List&lt;string&gt;** | Allowed redirect hosts for SAML login. | [optional] 
**NonEmbedAccess** | [**ClusterNonEmbedAccessInput**](ClusterNonEmbedAccessInput.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

