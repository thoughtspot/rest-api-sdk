# ThoughtSpotRestApiSdk.CustomCalendarsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCalendar**](CustomCalendarsApi.md#createCalendar) | **POST** /api/rest/2.0/calendars/create | 
[**deleteCalendar**](CustomCalendarsApi.md#deleteCalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/delete | 
[**generateCSV**](CustomCalendarsApi.md#generateCSV) | **POST** /api/rest/2.0/calendars/generate-csv | 
[**searchCalendars**](CustomCalendarsApi.md#searchCalendars) | **POST** /api/rest/2.0/calendars/search | 
[**updateCalendar**](CustomCalendarsApi.md#updateCalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/update | 


# **createCalendar**
> CalendarResponse createCalendar(createCalendarRequest)

  Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - `FROM_EXISTING_TABLE` - Creates calendar from the table reference provided in the API request.  - `FROM_INPUT_PARAMS` - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * `MONTH_OFFSET`. The default calendar type. A `MONTH_OFFSET` calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the `month_offset` value is set as `April`, the calendar year begins in April.  * `4-4-5`. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * `4-5-4`. Each quarter in the calendar will include two 4-week months with a 5-week month between. * `5-4-4`. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the `MM/DD/YYYY` format. For `MONTH_OFFSET` calendars, ensure that the `start_date` matches the month specified in the `month_offset` attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_EXISTING_TABLE\", } ```  To create a calendar from scratch:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_INPUT_PARAMS\",   \"calendar_type\": \"MONTH_OFFSET\",   \"month_offset\": \"April\",   \"start_day_of_week\": \"Monday\",   \"quarter_name_prefix\": \"Q\",   \"year_name_prefix\": \"FY\",   \"start_date\": \"04/01/2025\",   \"end_date\": \"04/31/2025\" } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, CustomCalendarsApi, CreateCalendarRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CustomCalendarsApi(configuration);

apiInstance.createCalendar(
  // CreateCalendarRequest
  {
    name: "name_example",
    creation_method: "FROM_INPUT_PARAMS",
    table_reference: null,
    start_date: "start_date_example",
    end_date: "end_date_example",
    calendar_type: "MONTH_OFFSET",
    month_offset: "January",
    start_day_of_week: "Sunday",
    quarter_name_prefix: "",
    year_name_prefix: "",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCalendarRequest** | **CreateCalendarRequest**|  |


### Return type

**CalendarResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom calendar created successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteCalendar**
> void deleteCalendar()

  Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        

### Example


```typescript
import { createBearerAuthenticationConfig, CustomCalendarsApi, DeleteCalendarRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CustomCalendarsApi(configuration);

apiInstance.deleteCalendar(
  // string | Unique ID or name of the Calendar.
  "calendar_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calendarIdentifier** | [**string**] | Unique ID or name of the Calendar. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Custom calendar successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateCSV**
> any generateCSV(generateCSVRequest)

  Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \"month offset\" calendars, the start date must match the month defined in the `month_offset` attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      

### Example


```typescript
import { createBearerAuthenticationConfig, CustomCalendarsApi, GenerateCSVRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CustomCalendarsApi(configuration);

apiInstance.generateCSV(
  // GenerateCSVRequest
  {
    start_date: "start_date_example",
    end_date: "end_date_example",
    calendar_type: "MONTH_OFFSET",
    month_offset: "January",
    start_day_of_week: "Sunday",
    quarter_name_prefix: "quarter_name_prefix_example",
    year_name_prefix: "year_name_prefix_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCSVRequest** | **GenerateCSVRequest**|  |


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Generate custom calendar data based on specifications, as a CSV file. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchCalendars**
> Array<CalendarResponse> searchCalendars(searchCalendarsRequest)

  Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as `name_pattern` and `sort_options` as search filters.  The `name_pattern` parameter filters and returns only those objects that match the specified pattern. Use `%` as a wildcard for pattern matching.      

### Example


```typescript
import { createBearerAuthenticationConfig, CustomCalendarsApi, SearchCalendarsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CustomCalendarsApi(configuration);

apiInstance.searchCalendars(
  // SearchCalendarsRequest
  {
    connection_identifier: "connection_identifier_example",
    name_pattern: "name_pattern_example",
    record_offset: 0,
    record_size: 10,
    sort_options: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCalendarsRequest** | **SearchCalendarsRequest**|  |


### Return type

**Array<CalendarResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom calendar fetched successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateCalendar**
> void updateCalendar(updateCalendarRequest)

  Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * `FROM_INPUT_PARAMS` to update the calendar properties with the values defined in the API request. * `FROM_EXISTING_TABLE` Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  ``` {   \"update_method\": \"FROM_EXISTING_TABLE\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   } } ```  Update a custom calendar with the attributes defined in the API request:  ``` {   \"update_method\": \"FROM_INPUT_PARAMS\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   },   \"month_offset\": \"August\",   \"start_day_of_week\": \"Monday\",   \"start_date\": \"08/01/2025\",   \"end_date\": \"07/31/2026\" } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, CustomCalendarsApi, UpdateCalendarRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CustomCalendarsApi(configuration);

apiInstance.updateCalendar(
  // string | Unique Id or name of the calendar.
  "calendar_identifier_example" , 
  // UpdateCalendarRequest
  {
    update_method: "FROM_INPUT_PARAMS",
    table_reference: null,
    start_date: "start_date_example",
    end_date: "end_date_example",
    calendar_type: "MONTH_OFFSET",
    month_offset: "January",
    start_day_of_week: "Sunday",
    quarter_name_prefix: "",
    year_name_prefix: "",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCalendarRequest** | **UpdateCalendarRequest**|  |
 **calendarIdentifier** | [**string**] | Unique Id or name of the calendar. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Custom calendar updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

