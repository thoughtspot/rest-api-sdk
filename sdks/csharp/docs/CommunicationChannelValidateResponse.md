# ThoughtSpot.RestApi.Sdk.Model.CommunicationChannelValidateResponse
Response containing validation results for communication channel configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChannelType** | **string** | Type of communication channel that was validated. | 
**ChannelId** | **string** | ID of the communication channel (e.g., webhook_id). | 
**ChannelName** | **string** | Name of the communication channel (e.g., webhook name). | [optional] 
**EventType** | **string** | Event type that was validated. | 
**JobId** | **string** | Unique Job Id of the validation. | 
**ResultCode** | **string** | Overall result of the validation. | 
**Details** | [**List&lt;ChannelValidationDetail&gt;**](ChannelValidationDetail.md) | Detailed results of various validation sub-steps. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

