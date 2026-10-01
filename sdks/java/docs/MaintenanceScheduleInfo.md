

# MaintenanceScheduleInfo

Details of a maintenance window scheduled for the cluster.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTimeInMillis** | **Float** | Start time of the maintenance window, in milliseconds since epoch. |  [optional] |
|**durationInSeconds** | **Integer** | Expected duration of the maintenance window, in seconds. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the maintenance event. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the maintenance event. |  [optional] |
|**description** | **String** | Description of the maintenance event. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |
| AD_HOC | &quot;AD_HOC&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPGRADE | &quot;UPGRADE&quot; |
| PATCH | &quot;PATCH&quot; |


## Implemented Interfaces

* Serializable


