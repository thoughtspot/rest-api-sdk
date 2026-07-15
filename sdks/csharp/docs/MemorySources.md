# ThoughtSpot.RestApi.Sdk.Model.MemorySources
A single typed scope group identifying objects whose memory entries should be exported. One group binds a single `type` to a set of `identifiers`; pass one or more data-model identifiers in a group to scope the memory export to multiple data-models in one call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Source object type for this group. Must be &#x60;DATA_MODEL&#x60;. | 
**Identifiers** | **List&lt;string&gt;** | Data-models to export memory for. Each entry may be a GUID or a human-readable obj_id; obj_ids are resolved server-side. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

