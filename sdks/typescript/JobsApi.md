# ThoughtSpotRestApiSdk.JobsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchChannelHistory**](JobsApi.md#searchChannelHistory) | **POST** /api/rest/2.0/jobs/history/communication-channels/search | 


# **searchChannelHistory**
> SearchChannelHistoryResponse searchChannelHistory(searchChannelHistoryRequest)

  Version: 26.4.0.cl or later   Searches delivery history for communication channels such as webhooks. Returns channel-level delivery status for each job execution record. Use this to monitor channel health and delivery success rates across events.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.  **NOTE**: When `channel_type` is `WEBHOOK`, the following constraints apply:  - `job_ids`, `channel_identifiers`, and `events` each accept at most one element. - When `job_ids` is provided, it is used as the sole lookup key and other filter fields are ignored. - When `job_ids` is not provided, `channel_identifiers` and `events` are both required. Each must contain exactly one element, and the event object must include the `identifier` field. - Records older than the configured retention period are not returned.      

### Example


```typescript
import { createBearerAuthenticationConfig, JobsApi, SearchChannelHistoryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new JobsApi(configuration);

apiInstance.searchChannelHistory(
  // SearchChannelHistoryRequest
  {
    channel_type: "WEBHOOK",
    job_ids: [
      "job_ids_example",
    ],
    channel_identifiers: [
      "channel_identifiers_example",
    ],
    channel_status: "PENDING",
    events: [
      {
        type: "LIVEBOARD_SCHEDULE",
        identifier: "identifier_example",
      },
    ],
    start_epoch_time_in_millis: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchChannelHistoryRequest** | **SearchChannelHistoryRequest**|  |


### Return type

**SearchChannelHistoryResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Channel status logs retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

