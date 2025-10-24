

# WebhookDeleteResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deletedCount** | **Integer** | Number of webhooks successfully deleted. |  |
|**failedCount** | **Integer** | Number of webhooks that failed to delete. |  |
|**deletedWebhooks** | [**List&lt;WebhookResponse&gt;**](WebhookResponse.md) | List of successfully deleted webhooks. |  |
|**failedWebhooks** | [**List&lt;WebhookDeleteFailure&gt;**](WebhookDeleteFailure.md) | List of webhooks that failed to delete with error details. |  |


## Implemented Interfaces

* Serializable


