# ThoughtSpot.RestApi.Sdk.Model.SearchAuthSettingsResponse
Response for searchAuthSettings. Contains auth type and cluster/org-level preferences.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthType** | **string** | Type of authentication mechanism returned. | [optional] 
**ClusterPreferences** | [**AuthClusterPreferences**](AuthClusterPreferences.md) |  | [optional] 
**OrgPreferences** | [**List&lt;AuthOrgPreference&gt;**](AuthOrgPreference.md) | Org-level authentication configurations. Present when org scope was requested and per-org auth feature is enabled. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

