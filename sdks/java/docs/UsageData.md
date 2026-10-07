

# UsageData

A Spotter usage pool: the question allowance configured for a user, user group, or Org, and how much of it has been consumed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | [**UsagePoolKey**](UsagePoolKey.md) |  |  |
|**usage** | **Object** | Number of Spotter questions consumed from the pool. |  [optional] |
|**warningLimit** | **Object** | Usage level at which users drawing from the pool are warned that they are approaching the limit. Absent when no warning is configured. |  [optional] |
|**limit** | **Object** | Maximum number of Spotter questions the pool allows. Absent when the pool is unlimited. |  [optional] |
|**updatedTimeInMillis** | **Object** | Epoch milliseconds of the last change to the pool&#39;s configuration. |  [optional] |
|**updatedBy** | **String** | ID of the user who last changed the pool&#39;s configuration. |  [optional] |


## Implemented Interfaces

* Serializable


