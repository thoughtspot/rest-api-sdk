# ThoughtSpot.RestApi.Sdk.Api.LinkCustomizationApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SearchLinkCustomizations**](LinkCustomizationApi.md#searchlinkcustomizations) | **POST** /api/rest/2.0/customization/links/search |  |
| [**UpdateLinkCustomization**](LinkCustomizationApi.md#updatelinkcustomization) | **POST** /api/rest/2.0/customization/links/update |  |

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

<a id="updatelinkcustomization"></a>
# **UpdateLinkCustomization**
> void UpdateLinkCustomization (UpdateLinkCustomizationRequest updateLinkCustomizationRequest)



  Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at cluster level or for the authenticated user's org. Use it to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - `scope: CLUSTER` changes the defaults inherited by all orgs, and is available only to callers in the primary org. - `scope: ORG` (default) changes the authenticated user's org, and requires Orgs to be enabled. - List only the types you want to change in `templates`. Unlisted types are left unchanged by either operation, and a repeated type is rejected. - **REPLACE** (default) sets each listed type to its `value`. - **RESET** reverts each listed type to the value its scope inherits: the ThoughtSpot default at cluster scope, and the cluster template at org scope. Supply only `type`; a `value` alongside `RESET` is rejected. To clear every override, list all types with `RESET`.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires:  | Link type | Required | | - -- | - -- | | `LIVEBOARD_SHARE_URL` | `{object-id}`, `{ts-query-params}` | | `VISUALIZATION_SHARE_URL` | `{object-id}`, `{sub-object-id}`, `{ts-query-params}` | | `ANSWER_SHARE_URL` | `{object-id}`, `{ts-query-params}` | | `SPOTIQ_ANALYSIS_URL` | `{object-id}` | | `CONVERSATION_SHARE_URL` | `{conversation-id}`, `{ts-query-params}` | | `GENERIC_URL` | `{path}` | | `UNSUBSCRIBE_URL` | none |  `{ts-query-params}` is optional on any type that does not require it, including `SPOTIQ_ANALYSIS_URL` and `UNSUBSCRIBE_URL`: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      

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
    public class UpdateLinkCustomizationExample
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
            var updateLinkCustomizationRequest = new UpdateLinkCustomizationRequest(); // UpdateLinkCustomizationRequest | 

            try
            {
                apiInstance.UpdateLinkCustomization(updateLinkCustomizationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LinkCustomizationApi.UpdateLinkCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateLinkCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateLinkCustomizationWithHttpInfo(updateLinkCustomizationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LinkCustomizationApi.UpdateLinkCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateLinkCustomizationRequest** | [**UpdateLinkCustomizationRequest**](UpdateLinkCustomizationRequest.md) |  |  |

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

