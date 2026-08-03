# ThoughtSpot.RestApi.Sdk.Model.WebhookResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier of the webhook configuration. | 
**Name** | **string** | Name of the webhook configuration. | 
**Description** | **string** | Description of the webhook configuration. | [optional] 
**Org** | [**WebhookOrg**](WebhookOrg.md) |  | [optional] 
**Url** | **string** | The webhook endpoint URL. | 
**UrlParams** | **Object** | Additional URL parameters as key-value pairs. | [optional] 
**Events** | **List&lt;WebhookResponse.EventsEnum&gt;** | List of events this webhook subscribes to. | 
**Authentication** | [**WebhookAuthentication**](WebhookAuthentication.md) |  | [optional] 
**SignatureVerification** | [**WebhookSignatureVerification**](WebhookSignatureVerification.md) |  | [optional] 
**AdditionalHeaders** | [**List&lt;WebhookKeyValuePair&gt;**](WebhookKeyValuePair.md) | Additional headers as an array of key-value pairs.    Version: 26.4.0.cl or later  | [optional] 
**CreationTimeInMillis** | **float** | Creation time of the webhook configuration in milliseconds. | 
**ModificationTimeInMillis** | **float** | Last modified time of the webhook configuration in milliseconds. | 
**CreatedBy** | [**WebhookUser**](WebhookUser.md) |  | [optional] 
**LastModifiedBy** | [**WebhookUser**](WebhookUser.md) |  | [optional] 
**StorageDestination** | [**StorageDestination**](StorageDestination.md) |  | [optional] 
**Status** | **string** | Status of the webhook (ENABLED or DISABLED). Only present when explicitly set.    Version: 26.7.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

