

# WebhookResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the webhook configuration. |  |
|**name** | **String** | Name of the webhook configuration. |  |
|**description** | **String** | Description of the webhook configuration. |  [optional] |
|**org** | [**WebhookOrg**](WebhookOrg.md) |  |  [optional] |
|**url** | **String** | The webhook endpoint URL. |  |
|**urlParams** | **Object** | Additional URL parameters as key-value pairs. |  [optional] |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | List of events this webhook subscribes to. |  |
|**authentication** | [**WebhookAuthentication**](WebhookAuthentication.md) |  |  [optional] |
|**signatureVerification** | [**WebhookSignatureVerification**](WebhookSignatureVerification.md) |  |  [optional] |
|**creationTimeInMillis** | **Float** | Creation time of the webhook configuration in milliseconds. |  |
|**modificationTimeInMillis** | **Float** | Last modified time of the webhook configuration in milliseconds. |  |
|**createdBy** | [**WebhookUser**](WebhookUser.md) |  |  [optional] |
|**lastModifiedBy** | [**WebhookUser**](WebhookUser.md) |  |  [optional] |
|**storageDestination** | [**StorageDestination**](StorageDestination.md) |  |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |


## Implemented Interfaces

* Serializable


