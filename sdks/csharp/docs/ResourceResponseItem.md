# ThoughtSpot.RestApi.Sdk.Model.ResourceResponseItem
MCP (Model Context Protocol) resource — typically a connector-provided artifact such as a document excerpt.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Variant discriminator. Always &#x60;\&quot;resource\&quot;&#x60;. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. | 
**IsThinking** | **bool?** | True when the item represents internal agent reasoning rather than user-facing output. | [optional] 
**StepTitle** | **string** | Human-readable label for the agent step producing this item. | [optional] 
**Title** | **string** | Human-readable title of the resource. | 
**Uri** | **string** | Resource URI. | 
**Name** | **string** | Original name or filename. | [optional] 
**MimeType** | **string** | MIME type. | [optional] 
**Description** | **string** | Short description. | [optional] 
**Size** | **int?** | Size in bytes. | [optional] 
**ConnectorId** | **string** | Connector instance identifier. | [optional] 
**ConnectorName** | **string** | Human-readable connector name. | [optional] 
**ConnectorSlug** | **string** | Connector slug or type key. | [optional] 
**TransportType** | **string** | Underlying transport protocol used by the MCP connector. See &#x60;TransportType&#x60; for accepted values. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

