# ThoughtSpot.RestApi.Sdk.Model.AgentConversationList
A saved agent conversation item returned in list responses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversationIdentifier** | **string** | Unique identifier of the conversation. | 
**ConversationTitle** | **string** | Display title of the conversation. | [optional] 
**CreatedAt** | **string** | ISO 8601 timestamp when the conversation was created. | [optional] 
**UpdatedAt** | **string** | ISO 8601 timestamp when the conversation was last updated. | [optional] 
**DataSourceIdentifiers** | **List&lt;string&gt;** | Unique identifiers of the data sources associated with the conversation. | [optional] 
**DataSourceNames** | [**List&lt;DataSourceEntry&gt;**](DataSourceEntry.md) | Data sources associated with the conversation, each with an &#x60;id&#x60; and &#x60;name&#x60;. | [optional] 
**IsPinned** | **bool?** | Whether the current user has pinned this conversation. Pinned conversations are surfaced first in the list.    Version: 26.10.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

