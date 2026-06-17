# ThoughtSpot.Client.Api.CustomCalendarsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateCalendar**](CustomCalendarsApi.md#createcalendar) | **POST** /api/rest/2.0/calendars/create |  |
| [**DeleteCalendar**](CustomCalendarsApi.md#deletecalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/delete |  |
| [**GenerateCSV**](CustomCalendarsApi.md#generatecsv) | **POST** /api/rest/2.0/calendars/generate-csv |  |
| [**SearchCalendars**](CustomCalendarsApi.md#searchcalendars) | **POST** /api/rest/2.0/calendars/search |  |
| [**UpdateCalendar**](CustomCalendarsApi.md#updatecalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/update |  |

<a id="createcalendar"></a>
# **CreateCalendar**
> CalendarResponse CreateCalendar (CreateCalendarRequest createCalendarRequest)



  Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - `FROM_EXISTING_TABLE` - Creates calendar from the table reference provided in the API request.  - `FROM_INPUT_PARAMS` - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * `MONTH_OFFSET`. The default calendar type. A `MONTH_OFFSET` calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the `month_offset` value is set as `April`, the calendar year begins in April.  * `4-4-5`. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * `4-5-4`. Each quarter in the calendar will include two 4-week months with a 5-week month between. * `5-4-4`. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the `MM/DD/YYYY` format. For `MONTH_OFFSET` calendars, ensure that the `start_date` matches the month specified in the `month_offset` attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_EXISTING_TABLE\", } ```  To create a calendar from scratch:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_INPUT_PARAMS\",   \"calendar_type\": \"MONTH_OFFSET\",   \"month_offset\": \"April\",   \"start_day_of_week\": \"Monday\",   \"quarter_name_prefix\": \"Q\",   \"year_name_prefix\": \"FY\",   \"start_date\": \"04/01/2025\",   \"end_date\": \"04/31/2025\" } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class CreateCalendarExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new CustomCalendarsApi(httpClient, config, httpClientHandler);
            var createCalendarRequest = new CreateCalendarRequest(); // CreateCalendarRequest | 

            try
            {
                CalendarResponse result = apiInstance.CreateCalendar(createCalendarRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CustomCalendarsApi.CreateCalendar: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCalendarWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CalendarResponse> response = apiInstance.CreateCalendarWithHttpInfo(createCalendarRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CustomCalendarsApi.CreateCalendarWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCalendarRequest** | [**CreateCalendarRequest**](CreateCalendarRequest.md) |  |  |

### Return type

[**CalendarResponse**](CalendarResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom calendar created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletecalendar"></a>
# **DeleteCalendar**
> void DeleteCalendar (string calendarIdentifier)



  Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class DeleteCalendarExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new CustomCalendarsApi(httpClient, config, httpClientHandler);
            var calendarIdentifier = "calendarIdentifier_example";  // string | Unique ID or name of the Calendar.

            try
            {
                apiInstance.DeleteCalendar(calendarIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CustomCalendarsApi.DeleteCalendar: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteCalendarWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteCalendarWithHttpInfo(calendarIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CustomCalendarsApi.DeleteCalendarWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **calendarIdentifier** | **string** | Unique ID or name of the Calendar. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom calendar successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="generatecsv"></a>
# **GenerateCSV**
> Object GenerateCSV (GenerateCSVRequest generateCSVRequest)



  Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \"month offset\" calendars, the start date must match the month defined in the `month_offset` attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class GenerateCSVExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new CustomCalendarsApi(httpClient, config, httpClientHandler);
            var generateCSVRequest = new GenerateCSVRequest(); // GenerateCSVRequest | 

            try
            {
                Object result = apiInstance.GenerateCSV(generateCSVRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CustomCalendarsApi.GenerateCSV: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GenerateCSVWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.GenerateCSVWithHttpInfo(generateCSVRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CustomCalendarsApi.GenerateCSVWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **generateCSVRequest** | [**GenerateCSVRequest**](GenerateCSVRequest.md) |  |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Generate custom calendar data based on specifications, as a CSV file. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcalendars"></a>
# **SearchCalendars**
> List&lt;CalendarResponse&gt; SearchCalendars (SearchCalendarsRequest searchCalendarsRequest)



  Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as `name_pattern` and `sort_options` as search filters.  The `name_pattern` parameter filters and returns only those objects that match the specified pattern. Use `%` as a wildcard for pattern matching.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class SearchCalendarsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new CustomCalendarsApi(httpClient, config, httpClientHandler);
            var searchCalendarsRequest = new SearchCalendarsRequest(); // SearchCalendarsRequest | 

            try
            {
                List<CalendarResponse> result = apiInstance.SearchCalendars(searchCalendarsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CustomCalendarsApi.SearchCalendars: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCalendarsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<CalendarResponse>> response = apiInstance.SearchCalendarsWithHttpInfo(searchCalendarsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CustomCalendarsApi.SearchCalendarsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCalendarsRequest** | [**SearchCalendarsRequest**](SearchCalendarsRequest.md) |  |  |

### Return type

[**List&lt;CalendarResponse&gt;**](CalendarResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom calendar fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecalendar"></a>
# **UpdateCalendar**
> void UpdateCalendar (string calendarIdentifier, UpdateCalendarRequest updateCalendarRequest)



  Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * `FROM_INPUT_PARAMS` to update the calendar properties with the values defined in the API request. * `FROM_EXISTING_TABLE` Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  ``` {   \"update_method\": \"FROM_EXISTING_TABLE\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   } } ```  Update a custom calendar with the attributes defined in the API request:  ``` {   \"update_method\": \"FROM_INPUT_PARAMS\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   },   \"month_offset\": \"August\",   \"start_day_of_week\": \"Monday\",   \"start_date\": \"08/01/2025\",   \"end_date\": \"07/31/2026\" } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class UpdateCalendarExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new CustomCalendarsApi(httpClient, config, httpClientHandler);
            var calendarIdentifier = "calendarIdentifier_example";  // string | Unique Id or name of the calendar.
            var updateCalendarRequest = new UpdateCalendarRequest(); // UpdateCalendarRequest | 

            try
            {
                apiInstance.UpdateCalendar(calendarIdentifier, updateCalendarRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CustomCalendarsApi.UpdateCalendar: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateCalendarWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateCalendarWithHttpInfo(calendarIdentifier, updateCalendarRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CustomCalendarsApi.UpdateCalendarWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **calendarIdentifier** | **string** | Unique Id or name of the calendar. |  |
| **updateCalendarRequest** | [**UpdateCalendarRequest**](UpdateCalendarRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom calendar updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

