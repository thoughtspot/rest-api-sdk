# ThoughtSpot.RestApi.Sdk.Model.UsageData
A Spotter usage pool: the question allowance configured for a user, user group, or Org, and how much of it has been consumed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | [**UsagePoolKey**](UsagePoolKey.md) |  | 
**Usage** | **Object** | Number of Spotter questions consumed from the pool. | [optional] 
**WarningLimit** | **Object** | Usage level at which users drawing from the pool are warned that they are approaching the limit. Absent when no warning is configured. | [optional] 
**Limit** | **Object** | Maximum number of Spotter questions the pool allows. Absent when the pool is unlimited. | [optional] 
**UpdatedTimeInMillis** | **Object** | Epoch milliseconds of the last change to the pool&#39;s configuration. | [optional] 
**UpdatedBy** | **string** | ID of the user who last changed the pool&#39;s configuration. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

