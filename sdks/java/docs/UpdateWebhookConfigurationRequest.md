

# UpdateWebhookConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the webhook configuration. |  [optional] |
|**description** | **String** | Description of the webhook configuration. |  [optional] |
|**url** | **String** | The webhook endpoint URL. |  [optional] |
|**urlParams** | **Object** | Additional URL parameters as key-value pairs. |  [optional] |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | List of events to subscribe to. |  [optional] |
|**authentication** | [**WebhookAuthenticationInput**](WebhookAuthenticationInput.md) | Authorization configuration for the webhook. |  [optional] |
|**signatureVerification** | [**WebhookSignatureVerificationInput**](WebhookSignatureVerificationInput.md) | Configuration for webhook signature verification. |  [optional] |
|**storageDestination** | [**StorageDestinationInput**](StorageDestinationInput.md) | Configuration for storage destination. Example: {\&quot;storage_type\&quot;: \&quot;AWS_S3\&quot;, \&quot;storage_config\&quot;: {\&quot;aws_s3_config\&quot;: {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;region\&quot;: \&quot;us-west-2\&quot;, \&quot;role_arn\&quot;: \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot;, \&quot;external_id\&quot;: \&quot;ts-webhook-a1b2c3d4-7890\&quot;, \&quot;path_prefix\&quot;: \&quot;thoughtspot-webhooks/\&quot;}}}    Version: 26.3.0.cl or later  |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |


## Implemented Interfaces

* Serializable


