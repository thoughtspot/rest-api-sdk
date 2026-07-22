# ThoughtSpot.RestApi.Sdk.Api.SchedulesApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateSchedule**](SchedulesApi.md#createschedule) | **POST** /api/rest/2.0/schedules/create |  |
| [**DeleteSchedule**](SchedulesApi.md#deleteschedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete |  |
| [**SearchSchedules**](SchedulesApi.md#searchschedules) | **POST** /api/rest/2.0/schedules/search |  |
| [**UpdateSchedule**](SchedulesApi.md#updateschedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update |  |

<a id="createschedule"></a>
# **CreateSchedule**
> ResponseSchedule CreateSchedule (CreateScheduleRequest createScheduleRequest)



 Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  If RBAC is enabled, creating a schedule also requires the download privilege that corresponds to the selected `file_format`: `CSV` and `XLSX` require the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege, and `PDF` requires the `CAN_DOWNLOAD_VISUALS` (**Can download visuals**) privilege.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If `PDF` is set as the `file_format`, enable `pdf_options` to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server's time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateScheduleExample
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
            var apiInstance = new SchedulesApi(httpClient, config, httpClientHandler);
            var createScheduleRequest = new CreateScheduleRequest(); // CreateScheduleRequest | 

            try
            {
                ResponseSchedule result = apiInstance.CreateSchedule(createScheduleRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SchedulesApi.CreateSchedule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateScheduleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseSchedule> response = apiInstance.CreateScheduleWithHttpInfo(createScheduleRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SchedulesApi.CreateScheduleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md) |  |  |

### Return type

[**ResponseSchedule**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteschedule"></a>
# **DeleteSchedule**
> void DeleteSchedule (string scheduleIdentifier)



 Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteScheduleExample
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
            var apiInstance = new SchedulesApi(httpClient, config, httpClientHandler);
            var scheduleIdentifier = "scheduleIdentifier_example";  // string | Unique ID or name of the scheduled job.

            try
            {
                apiInstance.DeleteSchedule(scheduleIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SchedulesApi.DeleteSchedule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteScheduleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteScheduleWithHttpInfo(scheduleIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SchedulesApi.DeleteScheduleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **scheduleIdentifier** | **string** | Unique ID or name of the scheduled job. |  |

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
| **204** | Schedule successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchschedules"></a>
# **SearchSchedules**
> List&lt;ResponseSchedule&gt; SearchSchedules (SearchSchedulesRequest searchSchedulesRequest)



 Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchSchedulesExample
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
            var apiInstance = new SchedulesApi(httpClient, config, httpClientHandler);
            var searchSchedulesRequest = new SearchSchedulesRequest(); // SearchSchedulesRequest | 

            try
            {
                List<ResponseSchedule> result = apiInstance.SearchSchedules(searchSchedulesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SchedulesApi.SearchSchedules: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchSchedulesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ResponseSchedule>> response = apiInstance.SearchSchedulesWithHttpInfo(searchSchedulesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SchedulesApi.SearchSchedulesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchSchedulesRequest** | [**SearchSchedulesRequest**](SearchSchedulesRequest.md) |  |  |

### Return type

[**List&lt;ResponseSchedule&gt;**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateschedule"></a>
# **UpdateSchedule**
> void UpdateSchedule (string scheduleIdentifier, UpdateScheduleRequest updateScheduleRequest)



 Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  If RBAC is enabled, changing a schedule's `file_format` also requires the download privilege that corresponds to the selected format: `CSV` and `XLSX` require the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege, and `PDF` requires the `CAN_DOWNLOAD_VISUALS` (**Can download visuals**) privilege.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateScheduleExample
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
            var apiInstance = new SchedulesApi(httpClient, config, httpClientHandler);
            var scheduleIdentifier = "scheduleIdentifier_example";  // string | Unique ID or name of the schedule.
            var updateScheduleRequest = new UpdateScheduleRequest(); // UpdateScheduleRequest | 

            try
            {
                apiInstance.UpdateSchedule(scheduleIdentifier, updateScheduleRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SchedulesApi.UpdateSchedule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateScheduleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateScheduleWithHttpInfo(scheduleIdentifier, updateScheduleRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SchedulesApi.UpdateScheduleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **scheduleIdentifier** | **string** | Unique ID or name of the schedule. |  |
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md) |  |  |

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
| **204** | Schedule successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

