# ThoughtSpot.RestApi.Sdk.Model.SearchWebhookConfigurationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgIdentifier** | **string** | Unique ID or name of the org. | [optional] 
**WebhookIdentifier** | **string** | Unique ID or name of the webhook. | [optional] 
**EventType** | **string** | Type of webhook event to filter by. | [optional] 
**RecordOffset** | **int** | The offset point, starting from where the webhooks should be included in the response. | [optional] [default to 0]
**RecordSize** | **int** | The number of webhooks that should be included in the response starting from offset position. | [optional] [default to 50]
**SortOptions** | [**WebhookSortOptionsInput**](WebhookSortOptionsInput.md) | Sort option includes sort field and sort order. | [optional] 
**Status** | **string** | Filter webhooks by status (ENABLED or DISABLED).    Version: 26.7.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

