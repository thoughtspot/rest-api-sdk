# ThoughtSpot.RestApi.Sdk.Model.SearchChannelHistoryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChannelType** | **string** | Type of communication channel to search history for. | 
**JobIds** | **List&lt;string&gt;** | List of job execution record IDs to retrieve. | [optional] 
**ChannelIdentifiers** | **List&lt;string&gt;** | List of channel IDs or names to filter by. | [optional] 
**ChannelStatus** | **string** | Filter by channel delivery status. | [optional] 
**Events** | [**List&lt;ChannelHistoryEventInput&gt;**](ChannelHistoryEventInput.md) | Filter by events that triggered the channel. | [optional] 
**StartEpochTimeInMillis** | **float** | Filter records created on or after this time (epoch milliseconds). | [optional] 
**EndEpochTimeInMillis** | **float** | Filter records created before this time (epoch milliseconds).    Version: 26.7.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

