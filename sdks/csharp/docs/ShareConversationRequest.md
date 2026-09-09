# ThoughtSpot.RestApi.Sdk.Model.ShareConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshSharedContent** | **bool?** | When &#x60;true&#x60;, always regenerates the shared view from the latest conversation state, even if one already exists. When &#x60;false&#x60; (default), reuses the existing shared view. | [optional] [default to false]
**Grant** | [**List&lt;PrincipalRefInput&gt;**](PrincipalRefInput.md) | Principals to grant read-only access to the conversation. | 
**Revoke** | [**List&lt;PrincipalRefInput&gt;**](PrincipalRefInput.md) | Principals to revoke access from the conversation. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

