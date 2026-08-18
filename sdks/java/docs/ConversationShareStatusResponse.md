

# ConversationShareStatusResponse

Response returned by getShareInfo.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationId** | **String** | Unique identifier of the source conversation. |  |
|**isSharedContentOutdated** | **Boolean** | &#x60;true&#x60; when the shared view was generated before the last edit to the conversation and does not reflect the latest content. &#x60;null&#x60; when the conversation has never been shared. |  [optional] |
|**principals** | [**List&lt;ConversationPrincipalInfo&gt;**](ConversationPrincipalInfo.md) | List of principals that currently have access to this shared conversation. Empty when no principals have been granted access. |  |


## Implemented Interfaces

* Serializable


