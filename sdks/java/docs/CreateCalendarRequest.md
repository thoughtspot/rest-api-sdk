

# CreateCalendarRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the custom calendar. |  |
|**creationMethod** | [**CreationMethodEnum**](#CreationMethodEnum) | Type of create operation. |  |
|**tableReference** | [**ExternalTableInput**](ExternalTableInput.md) | Table reference containing connection identifier and table details in this format: &#x60;{\&quot;connection_identifier\&quot;:\&quot;conn1\&quot;, \&quot;database_name\&quot;:\&quot;db1\&quot;, \&quot;schema_name\&quot;:\&quot;sc1\&quot;, \&quot;table_name\&quot;:\&quot;tb1\&quot;}&#x60;. The given table will be created if &#x60;creation_method&#x60; is set as &#x60;FROM_INPUT_PARAMS&#x60;. |  |
|**startDate** | **String** | Start date for the calendar in &#x60;MM/dd/yyyy&#x60; format. This parameter is mandatory if &#x60;creation_method&#x60; is set as &#x60;FROM_INPUT_PARAMS&#x60;. |  [optional] |
|**endDate** | **String** | End date for the calendar in &#x60;MM/dd/yyyy&#x60; format. This parameter is mandatory if &#x60;creation_method&#x60; is set as &#x60;FROM_INPUT_PARAMS&#x60;. |  [optional] |
|**calendarType** | [**CalendarTypeEnum**](#CalendarTypeEnum) | Type of the calendar. |  [optional] |
|**monthOffset** | [**MonthOffsetEnum**](#MonthOffsetEnum) | Specify the month in which the fiscal or custom calendar year should start. For example, if you set &#x60;month_offset&#x60; to \&quot;April\&quot;, the custom calendar will treat \&quot;April\&quot; as the first month of the year, and the related attributes such as quarters and start date will be based on this offset. The default value is &#x60;January&#x60;, which represents the standard calendar year (January to December). |  [optional] |
|**startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum) | Specify the starting day of the week. |  [optional] |
|**quarterNamePrefix** | **String** | Prefix to add before the quarter. |  [optional] |
|**yearNamePrefix** | **String** | Prefix to add before the year. |  [optional] |



## Enum: CreationMethodEnum

| Name | Value |
|---- | -----|
| FROM_INPUT_PARAMS | &quot;FROM_INPUT_PARAMS&quot; |
| FROM_EXISTING_TABLE | &quot;FROM_EXISTING_TABLE&quot; |



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


