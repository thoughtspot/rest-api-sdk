# ThoughtSpot.RestApi.Sdk.Model.AgentStreamError
A failure that ended the turn.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Machine-readable status, always a string. Quote it when reporting an issue.    Version: 26.12.0.cl or later  | [optional] 
**Message** | **string** | Diagnostic detail. Not written for end users — render &#x60;display_message&#x60;.    Version: 26.12.0.cl or later  | [optional] 
**Source** | **string** | Which layer produced the failure.    Version: 26.12.0.cl or later  | [optional] 
**DisplayMessage** | **string** | Text safe to show a user.    Version: 26.12.0.cl or later  | [optional] 
**ErrorBucket** | **string** | What the caller should do: &#x60;RETRY&#x60;, &#x60;REFRESH&#x60;, &#x60;NEW_CHAT&#x60; or &#x60;SUPPORT&#x60;. Treat an unrecognized value as &#x60;SUPPORT&#x60;.    Version: 26.12.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

