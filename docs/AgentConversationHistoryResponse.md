# ThoughtSpot.Client.Model.AgentConversationHistoryResponse
Response returned by getConversationList.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversations** | [**List&lt;AgentConversationList&gt;**](AgentConversationList.md) | List of saved agent conversations for the current user. | [optional] 
**HasMore** | **bool?** | Whether additional conversations exist beyond this page. &#x60;true&#x60; when one or more conversations remain after the current page; &#x60;false&#x60; when the current page is the last. Use &#x60;offset&#x60; to fetch the next page. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

