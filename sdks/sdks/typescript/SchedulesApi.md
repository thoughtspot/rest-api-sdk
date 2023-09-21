# ThoughtSpotRestApiSdk.SchedulesApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSchedule**](SchedulesApi.md#createSchedule) | **POST** /api/rest/2.0/schedules/create | 
[**deleteSchedule**](SchedulesApi.md#deleteSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete | 
[**searchSchedules**](SchedulesApi.md#searchSchedules) | **POST** /api/rest/2.0/schedules/search | 
[**updateSchedule**](SchedulesApi.md#updateSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update | 


# **createSchedule**
> ResponseSchedule createSchedule(createScheduleRequest)

 Create schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>  Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, SchedulesApi, CreateScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new SchedulesApi(configuration);

apiInstance.createSchedule(
  // CreateScheduleRequest
  {
    name: "name_example",
    description: "description_example",
    metadata_type: "LIVEBOARD",
    metadata_identifier: "metadata_identifier_example",
    file_format: "PDF",
    liveboard_options: {
      visualization_identifiers: [
        "visualization_identifiers_example",
      ],
    },
    pdf_options: {
      complete_liveboard: true,
      include_cover_page: true,
      include_custom_logo: true,
      include_filter_page: true,
      include_page_number: true,
      page_footer_text: "page_footer_text_example",
      page_orientation: "page_orientation_example",
      page_size: "A4",
      truncate_table: true,
    },
    time_zone: "America/Los_Angeles",
    frequency: {
      cron_expression: {
        day_of_month: "day_of_month_example",
        day_of_week: "day_of_week_example",
        hour: "hour_example",
        minute: "minute_example",
        month: "month_example",
        second: "second_example",
      },
    },
    recipient_details: {
      emails: [
        "emails_example",
      ],
      principals: [
        {
          identifier: "identifier_example",
          type: "type_example",
        },
      ],
    },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createScheduleRequest** | **CreateScheduleRequest**|  |


### Return type

**ResponseSchedule**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Schedule successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteSchedule**
> void deleteSchedule()

 Deletes a scheduled job. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>  Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.        #### Endpoint URL 

### Example


```typescript
import { createConfiguration, SchedulesApi, DeleteScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new SchedulesApi(configuration);

apiInstance.deleteSchedule(
  // string | Unique ID or name of the scheduled job.
  "schedule_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleIdentifier** | [**string**] | Unique ID or name of the scheduled job. | defaults to undefined


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
**204** | Schedule successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchSchedules**
> Array<ResponseSchedule> searchSchedules()

 Search Schedules <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>  Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, SchedulesApi, SearchSchedulesRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new SchedulesApi(configuration);

apiInstance.searchSchedules(
  // SearchSchedulesRequest (optional)
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    record_offset: 1,
    record_size: 1,
    sort_options: {
      field_name: "field_name_example",
      order: "order_example",
    },
    history_runs_options: {
      include_history_runs: false,
      record_size: 10,
      record_offset: 0,
    },
    schedule_identifiers: [
      "schedule_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchSchedulesRequest** | **SearchSchedulesRequest**|  |


### Return type

**Array<ResponseSchedule>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Schedule search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateSchedule**
> void updateSchedule()

 Update schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>  Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, SchedulesApi, UpdateScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new SchedulesApi(configuration);

apiInstance.updateSchedule(
  // string | Unique ID or name of the schedule.
  "schedule_identifier_example" , 
  // UpdateScheduleRequest (optional)
  {
    name: "name_example",
    description: "description_example",
    metadata_type: "LIVEBOARD",
    metadata_identifier: "metadata_identifier_example",
    file_format: "CSV",
    liveboard_options: {
      visualization_identifiers: [
        "visualization_identifiers_example",
      ],
    },
    pdf_options: {
      complete_liveboard: true,
      include_cover_page: true,
      include_custom_logo: true,
      include_filter_page: true,
      include_page_number: true,
      page_footer_text: "page_footer_text_example",
      page_orientation: "page_orientation_example",
      page_size: "A4",
      truncate_table: true,
    },
    time_zone: "Africa/Abidjan",
    frequency: {
      cron_expression: {
        day_of_month: "day_of_month_example",
        day_of_week: "day_of_week_example",
        hour: "hour_example",
        minute: "minute_example",
        month: "month_example",
        second: "second_example",
      },
    },
    recipient_details: {
      emails: [
        "emails_example",
      ],
      principals: [
        {
          identifier: "identifier_example",
          type: "type_example",
        },
      ],
    },
    status: "ACTIVE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateScheduleRequest** | **UpdateScheduleRequest**|  |
 **scheduleIdentifier** | [**string**] | Unique ID or name of the schedule. | defaults to undefined


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
**204** | Schedule successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

