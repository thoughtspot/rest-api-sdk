# ThoughtSpot.RestApi.Sdk.Model.VersionControlCredentialInput
Credential ThoughtSpot uses to reach an Org's repository.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | How the credential is held. | 
**Username** | **string** | Username presented with the token over HTTPS, for example svc-version-control. | [optional] 
**AccessToken** | **string** | Access token granting repository contents read and write, and metadata read. Add the provider&#39;s repository-rules read permission for rule-aware validation. Required when type is ACCESS_TOKEN. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

