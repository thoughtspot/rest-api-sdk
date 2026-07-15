# ThoughtSpot.RestApi.Sdk.Model.CreateCalendarRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the custom calendar. | 
**CreationMethod** | **string** | Type of create operation. | 
**TableReference** | [**ExternalTableInput**](ExternalTableInput.md) | Table reference containing connection identifier and table details in this format: &#x60;{\&quot;connection_identifier\&quot;:\&quot;conn1\&quot;, \&quot;database_name\&quot;:\&quot;db1\&quot;, \&quot;schema_name\&quot;:\&quot;sc1\&quot;, \&quot;table_name\&quot;:\&quot;tb1\&quot;}&#x60;. The given table will be created if &#x60;creation_method&#x60; is set as &#x60;FROM_INPUT_PARAMS&#x60;. | 
**StartDate** | **string** | Start date for the calendar in &#x60;MM/dd/yyyy&#x60; format. This parameter is mandatory if &#x60;creation_method&#x60; is set as &#x60;FROM_INPUT_PARAMS&#x60;. | [optional] 
**EndDate** | **string** | End date for the calendar in &#x60;MM/dd/yyyy&#x60; format. This parameter is mandatory if &#x60;creation_method&#x60; is set as &#x60;FROM_INPUT_PARAMS&#x60;. | [optional] 
**CalendarType** | **string** | Type of the calendar. | [optional] [default to CalendarTypeEnum.MONTHOFFSET]
**MonthOffset** | **string** | Specify the month in which the fiscal or custom calendar year should start. For example, if you set &#x60;month_offset&#x60; to \&quot;April\&quot;, the custom calendar will treat \&quot;April\&quot; as the first month of the year, and the related attributes such as quarters and start date will be based on this offset. The default value is &#x60;January&#x60;, which represents the standard calendar year (January to December). | [optional] [default to MonthOffsetEnum.January]
**StartDayOfWeek** | **string** | Specify the starting day of the week. | [optional] [default to StartDayOfWeekEnum.Sunday]
**QuarterNamePrefix** | **string** | Prefix to add before the quarter. | [optional] [default to ""]
**YearNamePrefix** | **string** | Prefix to add before the year. | [optional] [default to ""]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

