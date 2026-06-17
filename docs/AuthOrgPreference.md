# ThoughtSpot.Client.Model.AuthOrgPreference
Org-level authentication preferences for a single org.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Org** | [**AuthOrgInfo**](AuthOrgInfo.md) |  | [optional] 
**AuthStatus** | **string** | Whether authentication is enabled or disabled for this org. | [optional] 
**AccessTokens** | [**List&lt;AuthSettingsAccessToken&gt;**](AuthSettingsAccessToken.md) | Org-level access tokens. Absent when no token is configured or the feature flag is off. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

