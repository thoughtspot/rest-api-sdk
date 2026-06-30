

# AgentConversationList

A saved agent conversation item returned in list responses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationIdentifier** | **String** | Unique identifier of the conversation. |  |
|**conversationTitle** | **String** | Display title of the conversation. |  [optional] |
|**createdAt** | **String** | ISO 8601 timestamp when the conversation was created. |  [optional] |
|**updatedAt** | **String** | ISO 8601 timestamp when the conversation was last updated. |  [optional] |
|**dataSourceIdentifiers** | **List&lt;String&gt;** | Unique identifiers of the data sources associated with the conversation. |  [optional] |
|**dataSourceNames** | [**List&lt;DataSourceEntry&gt;**](DataSourceEntry.md) | Data sources associated with the conversation, each with an &#x60;id&#x60; and &#x60;name&#x60;. |  [optional] |


## Implemented Interfaces

* Serializable


