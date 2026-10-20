# ThoughtSpot.RestApi.Sdk.Model.UsageDataUpdateInput
A change to one Spotter usage pool. The pool is created if it does not exist. Fields that are omitted keep their current value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | [**UsagePoolKeyInput**](UsagePoolKeyInput.md) |  | 
**Limit** | **Object** | Maximum number of Spotter questions the pool allows. | [optional] 
**WarningLimit** | **Object** | Usage level at which users drawing from the pool are warned that they are approaching the limit. | [optional] 
**Usage** | **Object** | Number of questions consumed from the pool. Set to &#x60;0&#x60; to reset the pool&#39;s usage, for example at the start of a billing period. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

