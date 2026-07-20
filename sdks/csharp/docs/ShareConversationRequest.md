# ThoughtSpot.RestApi.Sdk.Model.ShareConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshSharedContent** | **bool?** | When &#x60;true&#x60;, always regenerates the shared view from the latest conversation state, even if one already exists. When &#x60;false&#x60; (default), reuses the existing shared view. | [optional] [default to false]
**Grant** | [**List&lt;PrincipalRefInput&gt;**](PrincipalRefInput.md) | Principals to grant read-only access to the conversation. | 
**Revoke** | [**List&lt;PrincipalRefInput&gt;**](PrincipalRefInput.md) | Principals to revoke access from the conversation. | 
**NotifyOnShare** | **bool?** | &lt;div&gt;Version: 26.10.0.cl or later &lt;/div&gt;  When &#x60;true&#x60; (default), newly granted principals are notified of the share. When &#x60;false&#x60;, access is granted without sending a notification. Has no effect on principals passed in &#x60;revoke&#x60;. Does not re-notify a principal who already had access. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

