# ThoughtSpot.RestApi.Sdk.Model.TextResponseItem
Agent text output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Variant discriminator. Always &#x60;\&quot;text\&quot;&#x60;. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. | 
**IsThinking** | **bool?** | True when the item represents internal agent reasoning rather than user-facing output. | [optional] 
**StepTitle** | **string** | Human-readable label for the agent step producing this item. | [optional] 
**Content** | **string** | The text body. | 
**ContentType** | **string** | Rendering hint for the text content. See &#x60;ContentMimeType&#x60; for accepted values. | [optional] 
**FileReference** | [**FileReference**](FileReference.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

