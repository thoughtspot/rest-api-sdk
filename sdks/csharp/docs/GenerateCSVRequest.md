# ThoughtSpot.RestApi.Sdk.Model.GenerateCSVRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Start date for the calendar in &#x60;MM/dd/yyyy&#x60; format. | 
**EndDate** | **string** | End date for the calendar in &#x60;MM/dd/yyyy&#x60; format. | 
**CalendarType** | **string** | Type of the calendar. | [optional] [default to CalendarTypeEnum.MONTHOFFSET]
**MonthOffset** | **string** | Month offset to start calendar from &#x60;January&#x60;. | [optional] [default to MonthOffsetEnum.January]
**StartDayOfWeek** | **string** | Specify the starting day of the week. | [optional] [default to StartDayOfWeekEnum.Sunday]
**QuarterNamePrefix** | **string** | Prefix to add before the quarter. | [optional] 
**YearNamePrefix** | **string** | Prefix to add before the year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

