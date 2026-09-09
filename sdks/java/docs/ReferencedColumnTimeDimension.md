

# ReferencedColumnTimeDimension

Pins a referenced model date column to a specific time dimension (grain) in the created input table.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnIdentifier** | **String** | The referenced model column to restrict, named exactly as it is in referenced_columns. |  |
|**timeDimension** | [**TimeDimensionEnum**](#TimeDimensionEnum) | Time dimension (grain) to lock the column to. Applies to DATE and DATE_TIME columns; a grain on a TIME (time-of-day) column has no meaning and is not supported. HOURLY needs a DATE_TIME column — on a plain DATE column it is ignored and the column stays detailed. |  |



## Enum: TimeDimensionEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;HOURLY&quot; |
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| YEARLY | &quot;YEARLY&quot; |


## Implemented Interfaces

* Serializable


