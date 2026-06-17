# ThoughtSpot.Client.Model.SearchAuthSettingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthType** | **string** | Type of authentication mechanism to retrieve settings for. Currently supports TRUSTED_AUTH. | 
**Scope** | **string** | Scope of auth settings to retrieve. When absent, both cluster and org settings are returned (subject to caller privileges). Set to CLUSTER to retrieve only cluster-level settings, or ORG to retrieve only org-level settings. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

