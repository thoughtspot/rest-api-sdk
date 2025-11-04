

# GenerateCSVRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **String** | Start date for the calendar in &#x60;MM/dd/yyyy&#x60; format. |  |
|**endDate** | **String** | End date for the calendar in &#x60;MM/dd/yyyy&#x60; format. |  |
|**calendarType** | [**CalendarTypeEnum**](#CalendarTypeEnum) | Type of the calendar. |  [optional] |
|**monthOffset** | [**MonthOffsetEnum**](#MonthOffsetEnum) | Month offset to start calendar from &#x60;January&#x60;. |  [optional] |
|**startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum) | Specify the starting day of the week. |  [optional] |
|**quarterNamePrefix** | **String** | Prefix to add before the quarter. |  [optional] |
|**yearNamePrefix** | **String** | Prefix to add before the year. |  [optional] |



## Enum: CalendarTypeEnum

| Name | Value |
|---- | -----|
| MONTH_OFFSET | &quot;MONTH_OFFSET&quot; |
| FOUR_FOUR_FIVE | &quot;FOUR_FOUR_FIVE&quot; |
| FOUR_FIVE_FOUR | &quot;FOUR_FIVE_FOUR&quot; |
| FIVE_FOUR_FOUR | &quot;FIVE_FOUR_FOUR&quot; |



## Enum: MonthOffsetEnum

| Name | Value |
|---- | -----|
| JANUARY | &quot;January&quot; |
| FEBRUARY | &quot;February&quot; |
| MARCH | &quot;March&quot; |
| APRIL | &quot;April&quot; |
| MAY | &quot;May&quot; |
| JUNE | &quot;June&quot; |
| JULY | &quot;July&quot; |
| AUGUST | &quot;August&quot; |
| SEPTEMBER | &quot;September&quot; |
| OCTOBER | &quot;October&quot; |
| NOVEMBER | &quot;November&quot; |
| DECEMBER | &quot;December&quot; |



## Enum: StartDayOfWeekEnum

| Name | Value |
|---- | -----|
| SUNDAY | &quot;Sunday&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |


## Implemented Interfaces

* Serializable


