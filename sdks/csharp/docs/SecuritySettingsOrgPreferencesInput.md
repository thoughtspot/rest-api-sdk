# ThoughtSpot.RestApi.Sdk.Model.SecuritySettingsOrgPreferencesInput
Input for org-level security preferences configuration. Note: cross-org operations are not supported currently.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgIdentifier** | **string** | Unique identifier or name of the org | 
**CorsWhitelistedUrls** | **List&lt;string&gt;** | Allowed origins for CORS for this org. Replaces the existing list. Values not included in the request are removed. | [optional] 
**NonEmbedAccess** | [**OrgNonEmbedAccessInput**](OrgNonEmbedAccessInput.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

