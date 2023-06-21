# ThoughtSpotRestApiSdk.Class940ClApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSchedule**](Class940ClApi.md#createSchedule) | **POST** /api/rest/2.0/schedules/create | 
[**deleteSchedule**](Class940ClApi.md#deleteSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete | 
[**getCurrentUserToken**](Class940ClApi.md#getCurrentUserToken) | **GET** /api/rest/2.0/auth/session/token | 
[**searchSchedules**](Class940ClApi.md#searchSchedules) | **POST** /api/rest/2.0/schedules/search | 
[**updateSchedule**](Class940ClApi.md#updateSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update | 


# **createSchedule**
> ResponseSchedule createSchedule(createScheduleRequest)

Create schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class940ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class940ClApiCreateScheduleRequest = {
  // CreateScheduleRequest
  createScheduleRequest: {
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
  },
};

apiInstance.createSchedule(body).then((data:any) => {
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
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class940ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class940ClApiDeleteScheduleRequest = {
  // string | Unique ID or name of the schedule.
  scheduleIdentifier: "schedule_identifier_example",
};

apiInstance.deleteSchedule(body).then((data:any) => {
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

# **getCurrentUserToken**
> GetTokenResponse getCurrentUserToken()

 Get token for the currently logged-in user. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>  Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class940ClApi(configuration);

let body:any = {};

apiInstance.getCurrentUserToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetTokenResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching token for current user successful. |  -  |
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
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class940ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class940ClApiSearchSchedulesRequest = {
  // SearchSchedulesRequest (optional)
  searchSchedulesRequest: {
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
  },
};

apiInstance.searchSchedules(body).then((data:any) => {
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
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class940ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class940ClApiUpdateScheduleRequest = {
  // string | Unique ID or name of the schedule.
  scheduleIdentifier: "schedule_identifier_example",
  // UpdateScheduleRequest (optional)
  updateScheduleRequest: {
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
  },
};

apiInstance.updateSchedule(body).then((data:any) => {
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

