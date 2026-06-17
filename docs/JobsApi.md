# ThoughtSpot.Client.Api.JobsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SearchChannelHistory**](JobsApi.md#searchchannelhistory) | **POST** /api/rest/2.0/jobs/history/communication-channels/search |  |

<a id="searchchannelhistory"></a>
# **SearchChannelHistory**
> SearchChannelHistoryResponse SearchChannelHistory (SearchChannelHistoryRequest searchChannelHistoryRequest)



  Version: 26.4.0.cl or later   Searches delivery history for communication channels such as webhooks. Returns channel-level delivery status for each job execution record. Use this to monitor channel health and delivery success rates across events.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.  **NOTE**: When `channel_type` is `WEBHOOK`, the following constraints apply:  - `job_ids`, `channel_identifiers`, and `events` each accept at most one element. - When `job_ids` is provided, it is used as the sole lookup key and other filter fields are ignored. - When `job_ids` is not provided, `channel_identifiers` and `events` are both required, each containing exactly one element. - Records older than the configured retention period are not returned. - Use `start_epoch_time_in_millis` and/or `end_epoch_time_in_millis` to narrow results to a specific time window.      

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
    public class SearchChannelHistoryExample
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
            var apiInstance = new JobsApi(httpClient, config, httpClientHandler);
            var searchChannelHistoryRequest = new SearchChannelHistoryRequest(); // SearchChannelHistoryRequest | 

            try
            {
                SearchChannelHistoryResponse result = apiInstance.SearchChannelHistory(searchChannelHistoryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling JobsApi.SearchChannelHistory: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchChannelHistoryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SearchChannelHistoryResponse> response = apiInstance.SearchChannelHistoryWithHttpInfo(searchChannelHistoryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling JobsApi.SearchChannelHistoryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchChannelHistoryRequest** | [**SearchChannelHistoryRequest**](SearchChannelHistoryRequest.md) |  |  |

### Return type

[**SearchChannelHistoryResponse**](SearchChannelHistoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel status logs retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

