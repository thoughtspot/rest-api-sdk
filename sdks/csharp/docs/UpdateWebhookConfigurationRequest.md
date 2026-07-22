# ThoughtSpot.RestApi.Sdk.Model.UpdateWebhookConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the webhook configuration. | [optional] 
**Description** | **string** | Description of the webhook configuration. | [optional] 
**Url** | **string** | The webhook endpoint URL. | [optional] 
**UrlParams** | **Object** | Additional URL parameters as key-value pairs. | [optional] 
**Events** | **List&lt;UpdateWebhookConfigurationRequest.EventsEnum&gt;** | List of events to subscribe to. | [optional] 
**Authentication** | [**WebhookAuthenticationInput**](WebhookAuthenticationInput.md) | Authorization configuration for the webhook. | [optional] 
**SignatureVerification** | [**WebhookSignatureVerificationInput**](WebhookSignatureVerificationInput.md) | Configuration for webhook signature verification. | [optional] 
**StorageDestination** | [**StorageDestinationInput**](StorageDestinationInput.md) | Configuration for storage destination. AWS S3 example: {\&quot;storage_type\&quot;: \&quot;AWS_S3\&quot;, \&quot;storage_config\&quot;: {\&quot;aws_s3_config\&quot;: {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;region\&quot;: \&quot;us-west-2\&quot;, \&quot;role_arn\&quot;: \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot;, \&quot;external_id\&quot;: \&quot;ts-webhook-a1b2c3d4-7890\&quot;, \&quot;path_prefix\&quot;: \&quot;thoughtspot-webhooks/\&quot;}}} GCP GCS example: {\&quot;storage_type\&quot;: \&quot;GCP_GCS\&quot;, \&quot;storage_config\&quot;: {\&quot;gcp_gcs_config\&quot;: {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;service_account_email\&quot;: \&quot;my-sa@my-project.iam.gserviceaccount.com\&quot;, \&quot;path_prefix\&quot;: \&quot;webhooks/\&quot;}}}    Version: 26.3.0.cl or later  | [optional] 
**AdditionalHeaders** | [**List&lt;WebhookKeyValuePairInput&gt;**](WebhookKeyValuePairInput.md) | Additional headers as an array of key-value pairs. Example: [{\&quot;key\&quot;: \&quot;X-Custom-Header\&quot;, \&quot;value\&quot;: \&quot;custom_value\&quot;}]    Version: 26.4.0.cl or later  | [optional] 
**Status** | **string** | Status of the webhook (ENABLED or DISABLED).    Version: 26.7.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

