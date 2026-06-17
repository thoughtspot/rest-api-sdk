# ThoughtSpot.Client.Model.ConversationMessageResponse
Response body of getConversation. `messages` is ordered oldest to newest. `code_execution_files` is a list of sanitized code-execution file metadata entries, keyed in upstream by `file_id`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**List&lt;ConversationMessage&gt;**](ConversationMessage.md) | Ordered conversation messages. Empty array when the conversation has no messages. | [optional] 
**CodeExecutionFiles** | [**List&lt;CodeExecutionFileMetadata&gt;**](CodeExecutionFileMetadata.md) | Sanitized code-execution file metadata for files referenced by this conversation. Empty array when the conversation has no code-execution files. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

