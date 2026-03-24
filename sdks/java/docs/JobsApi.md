# JobsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**searchChannelHistory**](JobsApi.md#searchChannelHistory) | **POST** /api/rest/2.0/jobs/history/communication-channels/search |


<a id="searchChannelHistory"></a>
# **searchChannelHistory**
> SearchChannelHistoryResponse searchChannelHistory(searchChannelHistoryRequest)



  Version: 26.4.0.cl or later   Searches delivery history for communication channels such as webhooks. Returns channel-level delivery status for each job execution record. Use this to monitor channel health and delivery success rates across events.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.  **NOTE**: When &#x60;channel_type&#x60; is &#x60;WEBHOOK&#x60;, the following constraints apply:  - &#x60;job_ids&#x60;, &#x60;channel_identifiers&#x60;, and &#x60;events&#x60; each accept at most one element. - When &#x60;job_ids&#x60; is provided, it is used as the sole lookup key and other filter fields are ignored. - When &#x60;job_ids&#x60; is not provided, &#x60;channel_identifiers&#x60; and &#x60;events&#x60; are both required. Each must contain exactly one element, and the event object must include the &#x60;identifier&#x60; field. - Records older than the configured retention period are not returned.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchChannelHistoryRequest** | [**SearchChannelHistoryRequest**](SearchChannelHistoryRequest.md)

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

