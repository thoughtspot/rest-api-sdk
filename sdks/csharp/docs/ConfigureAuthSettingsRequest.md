# ThoughtSpot.RestApi.Sdk.Model.ConfigureAuthSettingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthType** | **string** | Type of authentication mechanism to configure. Currently supports TRUSTED_AUTH. | 
**ClusterPreferences** | [**AuthClusterPreferencesInput**](AuthClusterPreferencesInput.md) | Cluster-level authentication preferences. Omit to leave the existing cluster setting unchanged. | [optional] 
**OrgPreferences** | [**List&lt;AuthOrgPreferenceInput&gt;**](AuthOrgPreferenceInput.md) | Org-level authentication preferences. Each entry identifies an org and the desired status. Omit to leave existing org settings unchanged. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

