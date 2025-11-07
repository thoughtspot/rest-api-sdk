

# SearchWebhookConfigurationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | Unique ID or name of the org. |  [optional] |
|**webhookIdentifier** | **String** | Unique ID or name of the webhook. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of webhook event to filter by. |  [optional] |
|**recordOffset** | **Integer** | The offset point, starting from where the webhooks should be included in the response. |  [optional] |
|**recordSize** | **Integer** | The number of webhooks that should be included in the response starting from offset position. |  [optional] |
|**sortOptions** | [**WebhookSortOptionsInput**](WebhookSortOptionsInput.md) | Sort option includes sort field and sort order. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |


## Implemented Interfaces

* Serializable


