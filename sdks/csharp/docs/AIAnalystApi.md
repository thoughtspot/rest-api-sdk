# ThoughtSpot.RestApi.Sdk.Api.AIAnalystApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateAnalyst**](AIAnalystApi.md#createanalyst) | **POST** /api/rest/2.0/ai/agent/analysts/create |  |
| [**DeleteAnalyst**](AIAnalystApi.md#deleteanalyst) | **POST** /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/delete |  |
| [**SearchAnalysts**](AIAnalystApi.md#searchanalysts) | **POST** /api/rest/2.0/ai/agent/analysts/search |  |
| [**ShareAnalyst**](AIAnalystApi.md#shareanalyst) | **POST** /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/share |  |
| [**UpdateAnalyst**](AIAnalystApi.md#updateanalyst) | **POST** /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/update |  |

<a id="createanalyst"></a>
# **CreateAnalyst**
> Analyst CreateAnalyst (CreateAnalystRequest createAnalystRequest)



 Creates a Spotter Analyst: a configured agent with a name, description, at least one data source, and optional agent instructions, MCP connectors, and starter prompts. Analysts created via API use the default icon until one is set in the UI. Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges, plus view access to every data source referenced in `sources`.   Version: 26.10.0.cl or later   Creates a Spotter Analyst: a configured agent with a name, description, data sources, and optional agent instructions, MCP connectors, and starter prompts that your users converse with in Spotter.  Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges, plus view access to every data source referenced in `sources`. Use a bearer token for the Org in which the analyst should be created.  #### Usage guidelines  The request body is flat — all fields are top-level:  - `name` (required): display name of the analyst. - `description` (required): up to 200 characters. - `instructions` (optional): natural-language instructions that guide the agent's behavior for this analyst. Instructions that conflict with system guardrails are rejected with `409`. - `sources` (required): at least one data source the analyst can query, each with an `identifier`, an optional `name`, and a `type` (`MODEL`, `ANSWER`, `LIVEBOARD`, or `CONVERSATION`). The caller must have view access to every referenced source. - `mcp_connector_identifiers` (optional): identifiers of MCP connectors to link to the analyst. - `starter_prompts` (optional): up to 4 plain-text prompts shown on the analyst landing page, each between 10 and 250 characters. Display order follows list position.  If the request is successful, the response contains the created analyst, including the server-assigned `id`. In responses, sources are returned with `id` and `type`, connector identifiers as `mcp_connectors`, starter prompts as structured objects (`label`, `text`, `order`, `is_ai_generated`), the last-update time as `updated_time_in_millis` (epoch milliseconds), and the `created_by` and `updated_by` users.  #### Error conditions  - `403` — missing privileges, or no view access to a referenced data source. - `409` — `instructions` conflict with system guardrails. - `422` — validation failure, such as a missing required field (`name`, `description`, or `sources`), an empty `sources` list, too many starter prompts, or field-length violations. - `429` — rate limit exceeded.      

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
    public class CreateAnalystExample
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
            var apiInstance = new AIAnalystApi(httpClient, config, httpClientHandler);
            var createAnalystRequest = new CreateAnalystRequest(); // CreateAnalystRequest | 

            try
            {
                Analyst result = apiInstance.CreateAnalyst(createAnalystRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AIAnalystApi.CreateAnalyst: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateAnalystWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Analyst> response = apiInstance.CreateAnalystWithHttpInfo(createAnalystRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AIAnalystApi.CreateAnalystWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createAnalystRequest** | [**CreateAnalystRequest**](CreateAnalystRequest.md) |  |  |

### Return type

[**Analyst**](Analyst.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteanalyst"></a>
# **DeleteAnalyst**
> AnalystDeleteResponse DeleteAnalyst (string analystIdentifier)



 Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered. The request has no body; the response contains the `id` of the deleted analyst. Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges.   Version: 26.10.0.cl or later   Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered.  Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Users the analyst is shared with cannot delete it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request has no body — the analyst to delete is identified by the `analyst_identifier` path parameter, as returned by the create analyst API.  A successful request returns the `id` of the deleted analyst.  #### Error conditions  - `400` — malformed analyst identifier. - `403` — the caller is not the analyst's author and lacks admin / Spotter-management privileges. - `404` — no analyst with the given identifier exists in the caller's Org. - `429` — rate limit exceeded.      

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
    public class DeleteAnalystExample
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
            var apiInstance = new AIAnalystApi(httpClient, config, httpClientHandler);
            var analystIdentifier = "analystIdentifier_example";  // string | Unique identifier of the analyst to delete.

            try
            {
                AnalystDeleteResponse result = apiInstance.DeleteAnalyst(analystIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AIAnalystApi.DeleteAnalyst: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteAnalystWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AnalystDeleteResponse> response = apiInstance.DeleteAnalystWithHttpInfo(analystIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AIAnalystApi.DeleteAnalystWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **analystIdentifier** | **string** | Unique identifier of the analyst to delete. |  |

### Return type

[**AnalystDeleteResponse**](AnalystDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchanalysts"></a>
# **SearchAnalysts**
> AnalystSearchResponse SearchAnalysts (SearchAnalystsRequest searchAnalystsRequest)



 Searches Spotter Analysts. Two modes: - Fetch mode: when `analyst_identifier` is provided, the response contains   exactly that analyst and all other filters are ignored. - List mode: returns a paginated list of analysts visible to the caller,   optionally filtered by a case-insensitive substring match on the   analyst name (`query`) and by ownership (`type`). Results are ordered   by most recently accessed. Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges.   Version: 26.10.0.cl or later   Searches Spotter Analysts. Use this endpoint to page through the analysts visible to you, or to fetch a single analyst by its identifier.  Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges. Use a bearer token for the Org whose analysts should be searched.  #### Usage guidelines  The endpoint operates in one of two modes:  **Fetch mode** — when `analyst_identifier` is provided, the response contains exactly that analyst (`total_size` is 1) and all other filters are ignored. The caller must have access to the analyst (owner, shared with, or admin/Spotter-management privileges).  **List mode** — when `analyst_identifier` is omitted, the response is a paginated list of analysts the caller can see, ordered by most recently accessed:  - `record_size` (optional): number of records per page. Default 50, between 1 and 500. - `record_offset` (optional): zero-based index of the first record. Default 0, maximum 10000. - `query` (optional): case-insensitive substring match applied to the analyst **name only**. - `type` (optional): ownership filter — `ALL` (default; created by or shared with me), `CREATED_BY_ME`, or `SHARED_TO_ME`.  The response contains `analysts` — the page of matching analysts — and `total_size`, the total number of matches before pagination. Each analyst includes its `id`, `name`, `description`, `instructions`, `sources` (with `id`, `type`, and display `name`), enriched `mcp_connectors` (with `id`, `name`, and `icon_url`), `icon_id`, `starter_prompts` (including the server-managed fixed prompt, marked `is_fixed`), `updated_time_in_millis` and `last_accessed_time_in_millis` (epoch milliseconds), and `created_by` / `updated_by` user references (with `id`, `name`, and `display_name`).  #### Error conditions  - `403` — missing privileges, or (fetch mode) no access to the requested analyst. - `404` — (fetch mode) no analyst with the given identifier exists in the caller's Org. - `422` — validation failure, such as `record_size` or `record_offset` out of range.      

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
    public class SearchAnalystsExample
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
            var apiInstance = new AIAnalystApi(httpClient, config, httpClientHandler);
            var searchAnalystsRequest = new SearchAnalystsRequest(); // SearchAnalystsRequest | 

            try
            {
                AnalystSearchResponse result = apiInstance.SearchAnalysts(searchAnalystsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AIAnalystApi.SearchAnalysts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchAnalystsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AnalystSearchResponse> response = apiInstance.SearchAnalystsWithHttpInfo(searchAnalystsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AIAnalystApi.SearchAnalystsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchAnalystsRequest** | [**SearchAnalystsRequest**](SearchAnalystsRequest.md) |  |  |

### Return type

[**AnalystSearchResponse**](AnalystSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="shareanalyst"></a>
# **ShareAnalyst**
> Object ShareAnalyst (string analystIdentifier, ShareAnalystRequest shareAnalystRequest)



 Updates share permissions on a Spotter Analyst, one entry per principal (user or group). `READ_ONLY` and `MODIFY` grant or change the principal's access; `NO_ACCESS` revokes it. Granting access also shares the analyst's data sources with the principal so the analyst keeps working for them. A successful share returns an empty `204 No Content` response. Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges.   Version: 26.10.0.cl or later   Updates share permissions on a Spotter Analyst for one or more principals (users or groups).  Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The analyst is identified by the `analyst_identifier` path parameter. The request body contains a `permissions` array with one entry per principal:  - `principal.identifier` (required): unique identifier of the user or group. - `principal.type` (required): `USER` or `USER_GROUP`. - `share_mode` (required): `READ_ONLY` or `MODIFY` grants (or changes) the principal's access; `NO_ACCESS` revokes it.  A principal may appear at most once per request. When access is granted, the analyst's data sources are automatically shared with the principal as well, so the analyst keeps working for them.  A successful request returns an empty `204 No Content` response.  #### Error conditions  - `400` — malformed analyst identifier. - `403` — the caller is not the analyst's author and lacks admin / Spotter-management privileges. - `404` — no analyst with the given identifier exists in the caller's Org. - `422` — validation failure, such as an empty `permissions` array, a duplicate principal, or a missing field. - `429` — rate limit exceeded.      

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
    public class ShareAnalystExample
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
            var apiInstance = new AIAnalystApi(httpClient, config, httpClientHandler);
            var analystIdentifier = "analystIdentifier_example";  // string | Unique identifier of the analyst to share.
            var shareAnalystRequest = new ShareAnalystRequest(); // ShareAnalystRequest | 

            try
            {
                Object result = apiInstance.ShareAnalyst(analystIdentifier, shareAnalystRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AIAnalystApi.ShareAnalyst: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ShareAnalystWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.ShareAnalystWithHttpInfo(analystIdentifier, shareAnalystRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AIAnalystApi.ShareAnalystWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **analystIdentifier** | **string** | Unique identifier of the analyst to share. |  |
| **shareAnalystRequest** | [**ShareAnalystRequest**](ShareAnalystRequest.md) |  |  |

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
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateanalyst"></a>
# **UpdateAnalyst**
> Analyst UpdateAnalyst (string analystIdentifier, UpdateAnalystRequest updateAnalystRequest)



 Updates a Spotter Analyst. The request body is identical to `createAnalyst` and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset (no instructions, no MCP connectors, no starter prompts). Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Users the analyst is shared with cannot edit it.   Version: 26.10.0.cl or later   Updates a Spotter Analyst. The request body is identical to the create analyst API, and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset.  Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Users the analyst is shared with can use it but cannot edit it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request body is flat — all fields are top-level:  - `name` (required): display name of the analyst. - `description` (required): up to 200 characters. - `instructions` (optional): natural-language instructions that guide the agent's behavior. Instructions that conflict with system guardrails are rejected with `409`. Omitting this field clears any existing instructions. - `sources` (required): at least one data source the analyst can query, each with an `identifier`, an optional `name`, and a `type` (`MODEL`, `ANSWER`, `LIVEBOARD`, or `CONVERSATION`). Replaces the existing list in full. When new sources are added, they are automatically shared with users the analyst was previously shared with, so those users keep a working analyst. - `mcp_connector_identifiers` (optional): identifiers of MCP connectors. Replaces the existing list in full; omit or pass an empty array to clear. - `starter_prompts` (optional): up to 4 plain-text prompts, each between 10 and 250 characters; display order follows list position. Replaces the existing list in full; omit or pass an empty array to clear.  If the request is successful, the response contains the updated analyst, including the refreshed `updated_time_in_millis` timestamp (epoch milliseconds) and `updated_by` user. In responses, sources are returned with `id` and `type`, connector identifiers as `mcp_connectors`, and starter prompts as structured objects (`label`, `text`, `order`, `is_ai_generated`).  #### Error conditions  - `400` — malformed analyst identifier. - `403` — the caller is not the analyst's author and lacks admin / Spotter-management privileges. - `404` — no analyst with the given identifier exists in the caller's Org. - `409` — `instructions` conflict with system guardrails. - `422` — validation failure, such as a missing required field (`name`, `description`, or `sources`), an empty `sources` list, too many starter prompts, or field-length violations. - `429` — rate limit exceeded.      

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
    public class UpdateAnalystExample
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
            var apiInstance = new AIAnalystApi(httpClient, config, httpClientHandler);
            var analystIdentifier = "analystIdentifier_example";  // string | Unique identifier of the analyst to update.
            var updateAnalystRequest = new UpdateAnalystRequest(); // UpdateAnalystRequest | 

            try
            {
                Analyst result = apiInstance.UpdateAnalyst(analystIdentifier, updateAnalystRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AIAnalystApi.UpdateAnalyst: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateAnalystWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Analyst> response = apiInstance.UpdateAnalystWithHttpInfo(analystIdentifier, updateAnalystRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AIAnalystApi.UpdateAnalystWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **analystIdentifier** | **string** | Unique identifier of the analyst to update. |  |
| **updateAnalystRequest** | [**UpdateAnalystRequest**](UpdateAnalystRequest.md) |  |  |

### Return type

[**Analyst**](Analyst.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

