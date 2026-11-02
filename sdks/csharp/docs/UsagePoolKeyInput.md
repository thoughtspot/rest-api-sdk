# ThoughtSpot.RestApi.Sdk.Model.UsagePoolKeyInput
Identifies a Spotter usage pool by the entity it meters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityType** | **string** | Type of entity the pool meters: &#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;. Must match the scope the cluster meters at. | 
**EntityIdentifier** | **string** | GUID of the user or user group, or the ID of the Org, that the pool meters. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

