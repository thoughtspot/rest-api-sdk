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

Create schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

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
    metadataType: "LIVEBOARD",
    metadataIdentifier: "metadataIdentifier_example",
    fileFormat: "PDF",
    liveboardOptions: {
      visualizationIdentifiers: [
        "visualizationIdentifiers_example",
      ],
    },
    pdfOptions: {
      completeLiveboard: true,
      includeCoverPage: true,
      includeCustomLogo: true,
      includeFilterPage: true,
      includePageNumber: true,
      pageFooterText: "pageFooterText_example",
      pageOrientation: "pageOrientation_example",
      pageSize: "A4",
      truncateTable: true,
    },
    timeZone: "America/Los_Angeles",
    frequency: {
      cronExpression: {
        dayOfMonth: "dayOfMonth_example",
        dayOfWeek: "dayOfWeek_example",
        hour: "hour_example",
        minute: "minute_example",
        month: "month_example",
        second: "second_example",
      },
    },
    recipientDetails: {
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

Deletes a schedule <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

### Example


```typescript
import { createConfiguration, SchedulesApi, DeleteScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new SchedulesApi(configuration);

apiInstance.deleteSchedule(
  // string | Unique ID or name of the schedule.
  "schedule_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleIdentifier** | [**string**] | Unique ID or name of the schedule. | defaults to undefined


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

Search Schedules <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

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
    recordOffset: 1,
    recordSize: 1,
    sortOptions: {
      fieldName: "fieldName_example",
      order: "order_example",
    },
    historyRunsOptions: {
      includeHistoryRuns: false,
      recordSize: 10,
      recordOffset: 0,
    },
    scheduleIdentifiers: [
      "scheduleIdentifiers_example",
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

Update schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

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
    metadataType: "LIVEBOARD",
    metadataIdentifier: "metadataIdentifier_example",
    fileFormat: "CSV",
    liveboardOptions: {
      visualizationIdentifiers: [
        "visualizationIdentifiers_example",
      ],
    },
    pdfOptions: {
      completeLiveboard: true,
      includeCoverPage: true,
      includeCustomLogo: true,
      includeFilterPage: true,
      includePageNumber: true,
      pageFooterText: "pageFooterText_example",
      pageOrientation: "pageOrientation_example",
      pageSize: "A4",
      truncateTable: true,
    },
    timeZone: "timeZone_example",
    frequency: {
      cronExpression: {
        dayOfMonth: "dayOfMonth_example",
        dayOfWeek: "dayOfWeek_example",
        hour: "hour_example",
        minute: "minute_example",
        month: "month_example",
        second: "second_example",
      },
    },
    recipientDetails: {
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

