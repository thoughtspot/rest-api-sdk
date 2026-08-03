# ThoughtSpot.RestApi.Sdk.Model.OrgChannelConfigInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgIdentifier** | **string** | Unique identifier or name of the org | 
**Operation** | **string** | Operation to perform. REPLACE: Update preferences (default). RESET: Remove org-specific configurations, causing fallback to cluster-level preferences. | [optional] [default to OperationEnum.REPLACE]
**Preferences** | [**List&lt;EventChannelConfigInput&gt;**](EventChannelConfigInput.md) | Event-specific configurations. Required for REPLACE operation. | [optional] 
**ResetEvents** | **List&lt;OrgChannelConfigInput.ResetEventsEnum&gt;** | Event types to reset. Required for RESET operation. Org-specific configurations for these events will be removed, causing fallback to cluster-level preferences. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

