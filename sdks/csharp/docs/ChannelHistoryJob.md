# ThoughtSpot.RestApi.Sdk.Model.ChannelHistoryJob
A single job execution record for a channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier for this job. | 
**Status** | **string** | Delivery status of this job. | 
**CreationTimeInMillis** | **float** | Timestamp when this job was created (epoch milliseconds). | 
**Event** | [**ChannelHistoryEventInfo**](ChannelHistoryEventInfo.md) |  | [optional] 
**Recipients** | [**List&lt;JobRecipient&gt;**](JobRecipient.md) | The users, groups or external recipients for this job. | [optional] 
**Detail** | **string** | Additional delivery details such as HTTP response code or error message. | [optional] 
**TryCount** | **int?** | Number of attempts made. 1 indicates first attempt. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

