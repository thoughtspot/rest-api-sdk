

# CreateWebhookConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the webhook configuration. |  |
|**description** | **String** | Description of the webhook configuration. |  [optional] |
|**url** | **String** | The webhook endpoint URL. |  |
|**urlParams** | **Object** | Additional URL parameters as key-value pairs. |  [optional] |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | List of events to subscribe to. |  |
|**authentication** | [**WebhookAuthenticationInput**](WebhookAuthenticationInput.md) | Authorization configuration for the webhook. |  [optional] |
|**signatureVerification** | [**WebhookSignatureVerificationInput**](WebhookSignatureVerificationInput.md) | Configuration for webhook signature verification. |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |


## Implemented Interfaces

* Serializable


