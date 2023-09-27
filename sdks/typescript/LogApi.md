# ThoughtSpotRestApiSdk.LogApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchLogs**](LogApi.md#fetchLogs) | **POST** /api/rest/2.0/logs/fetch | 


# **fetchLogs**
> Array<LogResponse> fetchLogs(fetchLogsRequest)

  Version: 9.0.0.cl or later  Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance      

### Example


```typescript
import { createBearerAuthenticationConfig, LogApi, FetchLogsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new LogApi(configuration);

apiInstance.fetchLogs(
  // FetchLogsRequest
  {
    log_type: "SECURITY_AUDIT",
    start_epoch_time_in_millis: 3.14,
    end_epoch_time_in_millis: 3.14,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchLogsRequest** | **FetchLogsRequest**|  |


### Return type

**Array<LogResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Log fetched successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

