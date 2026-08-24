# ThoughtSpot.RestApi.Sdk.Model.UpdateConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | **string** | New display title for the conversation. Omit to leave the title unchanged. An empty or whitespace-only value is replaced with a default title rather than rejected. | [optional] 
**IsPinned** | **bool?** | Pinned state of the conversation for the current user. Pinning marks a conversation for quick access: pinned conversations are surfaced first in &#x60;getConversationList&#x60;. Set to &#x60;true&#x60; to pin the conversation, &#x60;false&#x60; to unpin it, or omit to leave the pinned state unchanged. Applying the state the conversation is already in is a no-op success.    Version: 26.10.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

