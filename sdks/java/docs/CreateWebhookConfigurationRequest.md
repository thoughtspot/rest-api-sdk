

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
|**storageDestination** | [**StorageDestinationInput**](StorageDestinationInput.md) | Configuration for storage destination. Example: {\&quot;storage_type\&quot;: \&quot;AWS_S3\&quot;, \&quot;storage_config\&quot;: {\&quot;aws_s3_config\&quot;: {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;region\&quot;: \&quot;us-west-2\&quot;, \&quot;role_arn\&quot;: \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot;, \&quot;external_id\&quot;: \&quot;ts-webhook-a1b2c3d4-7890\&quot;, \&quot;path_prefix\&quot;: \&quot;thoughtspot-webhooks/\&quot;}}}    Version: 26.3.0.cl or later  |  [optional] |
|**additionalHeaders** | [**List&lt;WebhookKeyValuePairInput&gt;**](WebhookKeyValuePairInput.md) | Additional headers as an array of key-value pairs. Example: [{\&quot;key\&quot;: \&quot;X-Custom-Header\&quot;, \&quot;value\&quot;: \&quot;custom_value\&quot;}]    Version: 26.4.0.cl or later  |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |


## Implemented Interfaces

* Serializable


