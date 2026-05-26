

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
|**storageDestination** | [**StorageDestinationInput**](StorageDestinationInput.md) | Configuration for storage destination. AWS S3 example: {\&quot;storage_type\&quot;: \&quot;AWS_S3\&quot;, \&quot;storage_config\&quot;: {\&quot;aws_s3_config\&quot;: {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;region\&quot;: \&quot;us-west-2\&quot;, \&quot;role_arn\&quot;: \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot;, \&quot;external_id\&quot;: \&quot;ts-webhook-a1b2c3d4-7890\&quot;, \&quot;path_prefix\&quot;: \&quot;thoughtspot-webhooks/\&quot;}}} GCP GCS example: {\&quot;storage_type\&quot;: \&quot;GCP_GCS\&quot;, \&quot;storage_config\&quot;: {\&quot;gcp_gcs_config\&quot;: {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;service_account_email\&quot;: \&quot;my-sa@my-project.iam.gserviceaccount.com\&quot;, \&quot;path_prefix\&quot;: \&quot;webhooks/\&quot;}}}    Version: 26.3.0.cl or later  |  [optional] |
|**additionalHeaders** | [**List&lt;WebhookKeyValuePairInput&gt;**](WebhookKeyValuePairInput.md) | Additional headers as an array of key-value pairs. Example: [{\&quot;key\&quot;: \&quot;X-Custom-Header\&quot;, \&quot;value\&quot;: \&quot;custom_value\&quot;}]    Version: 26.4.0.cl or later  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the webhook (ENABLED or DISABLED).    Version: 26.7.0.cl or later  |  [optional] |
|**resetOptions** | [**List&lt;ResetOptionsEnum&gt;**](#List&lt;ResetOptionsEnum&gt;) | List of optional configuration sections to clear. Each value removes the corresponding configuration entirely from the webhook: AUTHENTICATION removes the authentication config, SIGNATURE_VERIFICATION removes the signature verification config, STORAGE_DESTINATION removes the storage destination config.    Version: 26.7.0.cl or later  |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |



## Enum: List&lt;ResetOptionsEnum&gt;

| Name | Value |
|---- | -----|
| AUTHENTICATION | &quot;AUTHENTICATION&quot; |
| SIGNATURE_VERIFICATION | &quot;SIGNATURE_VERIFICATION&quot; |
| STORAGE_DESTINATION | &quot;STORAGE_DESTINATION&quot; |


## Implemented Interfaces

* Serializable


