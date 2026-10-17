# ThoughtSpot.RestApi.Sdk.Api.LinkCustomizationApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SearchLinkCustomizations**](LinkCustomizationApi.md#searchlinkcustomizations) | **POST** /api/rest/2.0/customization/links/search |  |
| [**UpdateLinkCustomizations**](LinkCustomizationApi.md#updatelinkcustomizations) | **POST** /api/rest/2.0/customization/links/update |  |

<a id="searchlinkcustomizations"></a>
# **SearchLinkCustomizations**
> List&lt;LinkPreference&gt; SearchLinkCustomizations (SearchLinkCustomizationsRequest searchLinkCustomizationsRequest)



  Version: 26.11.0.cl or later   Retrieves the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to verify what an Org has customized before modifying it, or to confirm the destination URLs used in scheduled emails and the Share dialog.  Cluster-level templates serve as the default that Orgs inherit. Org-level templates override that default.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - `scope: CLUSTER` returns the cluster templates, and is available only to callers in the primary Org. - `scope: ORG` returns the templates for the Org the caller is signed in to, and requires Orgs to be enabled. - Omit `scope` to return whichever of these the caller can access. - Every link type is always returned, customized or not. `is_overridden` is `true` when the scope you asked for stores a value that differs from the one it would otherwise inherit — the cluster template for `ORG`, the ThoughtSpot default for `CLUSTER` — and `false` when it matches.      

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
    public class SearchLinkCustomizationsExample
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
            var apiInstance = new LinkCustomizationApi(httpClient, config, httpClientHandler);
            var searchLinkCustomizationsRequest = new SearchLinkCustomizationsRequest(); // SearchLinkCustomizationsRequest | 

            try
            {
                List<LinkPreference> result = apiInstance.SearchLinkCustomizations(searchLinkCustomizationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LinkCustomizationApi.SearchLinkCustomizations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchLinkCustomizationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<LinkPreference>> response = apiInstance.SearchLinkCustomizationsWithHttpInfo(searchLinkCustomizationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LinkCustomizationApi.SearchLinkCustomizationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchLinkCustomizationsRequest** | [**SearchLinkCustomizationsRequest**](SearchLinkCustomizationsRequest.md) |  |  |

### Return type

[**List&lt;LinkPreference&gt;**](LinkPreference.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Link preferences retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatelinkcustomizations"></a>
# **UpdateLinkCustomizations**
> void UpdateLinkCustomizations (UpdateLinkCustomizationsRequest updateLinkCustomizationsRequest)



  Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - `scope: CLUSTER` changes the defaults inherited by all Orgs, and is available only to callers in the primary Org. - `scope: ORG` (default) changes the Org the caller is signed in to, and requires Orgs to be enabled. - This is a partial update. Only the types listed in `templates` change; every other type keeps its current value, whether set at this scope or inherited. A repeated type is rejected. - **REPLACE** (default) sets each listed type to the `value` provided in the request. - **RESET** clears each listed type, so an Org falls back to the cluster template and the cluster falls back to the ThoughtSpot default. Supply only `type`; a `value` alongside `RESET` is rejected. To clear every override, list all types with `RESET`. Resetting at cluster level changes only the cluster default: an Org that has set its own value keeps it.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires.  | Link type | Required | Example | | - -- | - -- | - -- | | `LIVEBOARD_SHARE_URL` | `{object-id}`, `{ts-query-params}` | `https://analytics.acme.com/dashboards/{object-id}?{ts-query-params}` | | `VISUALIZATION_SHARE_URL` | `{object-id}`, `{sub-object-id}`, `{ts-query-params}` | `https://analytics.acme.com/dashboards/{object-id}/charts/{sub-object-id}?{ts-query-params}` | | `ANSWER_SHARE_URL` | `{object-id}`, `{ts-query-params}` | `https://analytics.acme.com/answers/{object-id}?{ts-query-params}` | | `SPOTIQ_ANALYSIS_URL` | `{object-id}` | `https://analytics.acme.com/insights/{object-id}` | | `UNSUBSCRIBE_URL` | none | `https://analytics.acme.com/account/email-preferences` | | `GENERIC_URL` | `{path}` | `https://analytics.acme.com/{path}` | | `CONVERSATION_SHARE_URL` | `{conversation-id}`, `{ts-query-params}` | `https://analytics.acme.com/spotter/{conversation-id}?{ts-query-params}` |  `{ts-query-params}` is optional on any type that does not require it: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      

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
    public class UpdateLinkCustomizationsExample
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
            var apiInstance = new LinkCustomizationApi(httpClient, config, httpClientHandler);
            var updateLinkCustomizationsRequest = new UpdateLinkCustomizationsRequest(); // UpdateLinkCustomizationsRequest | 

            try
            {
                apiInstance.UpdateLinkCustomizations(updateLinkCustomizationsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LinkCustomizationApi.UpdateLinkCustomizations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateLinkCustomizationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateLinkCustomizationsWithHttpInfo(updateLinkCustomizationsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LinkCustomizationApi.UpdateLinkCustomizationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateLinkCustomizationsRequest** | [**UpdateLinkCustomizationsRequest**](UpdateLinkCustomizationsRequest.md) |  |  |

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
| **204** | Link preferences updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

