# ThoughtSpot.RestApi.Sdk.Api.VersionControlV2Api

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateCommit**](VersionControlV2Api.md#createcommit) | **POST** /api/rest/2.0/version-control/commit |  |
| [**CreateVersionControlConfig**](VersionControlV2Api.md#createversioncontrolconfig) | **POST** /api/rest/2.0/version-control/config/create |  |
| [**DeleteVersionControlConfig**](VersionControlV2Api.md#deleteversioncontrolconfig) | **POST** /api/rest/2.0/version-control/config/delete |  |
| [**DeployRevision**](VersionControlV2Api.md#deployrevision) | **POST** /api/rest/2.0/version-control/deploy |  |
| [**PromoteBranch**](VersionControlV2Api.md#promotebranch) | **POST** /api/rest/2.0/version-control/branch/promote |  |
| [**RestoreRevision**](VersionControlV2Api.md#restorerevision) | **POST** /api/rest/2.0/version-control/commit/restore |  |
| [**SearchVersionControlConfigs**](VersionControlV2Api.md#searchversioncontrolconfigs) | **POST** /api/rest/2.0/version-control/config/search |  |
| [**SearchVersionControlRuns**](VersionControlV2Api.md#searchversioncontrolruns) | **POST** /api/rest/2.0/version-control/runs/search |  |
| [**UpdateVersionControlConfig**](VersionControlV2Api.md#updateversioncontrolconfig) | **POST** /api/rest/2.0/version-control/config/update |  |

<a id="createcommit"></a>
# **CreateCommit**
> VersionControlCommitResponse CreateCommit (CreateCommitRequest createCommitRequest)



 Version: 26.12.0.cl or later   Starts a versioning run that exports the named objects, such as Liveboards and Answers, and commits them to the branch your Org versions to. Name each object by GUID, object ID, or name with its type; it is resolved in your Org and committed by its cross-Org object ID, so object IDs must be enabled on the cluster. An object named more than once is committed once. The run is asynchronous: the response is an admission receipt carrying a `run_id`, and nothing is committed or pushed before it returns.  Admission is all or nothing, so a 4xx means nothing was admitted and the request is safe to correct and retry. Read the per-object outcomes from the run search endpoint using the returned `run_id`.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class CreateCommitExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var createCommitRequest = new CreateCommitRequest(); // CreateCommitRequest | 

            try
            {
                VersionControlCommitResponse result = apiInstance.CreateCommit(createCommitRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.CreateCommit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCommitWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlCommitResponse> response = apiInstance.CreateCommitWithHttpInfo(createCommitRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.CreateCommitWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCommitRequest** | [**CreateCommitRequest**](CreateCommitRequest.md) |  |  |

### Return type

[**VersionControlCommitResponse**](VersionControlCommitResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was admitted and the versioning run has started. The body is a receipt, not a result: nothing is committed or pushed yet. |  -  |
| **400** | Invalid request, and nothing was admitted. Covers a malformed body, object ids not enabled, an object that does not resolve or has no object id, a name given without its type, a type that does not match the object, a paused repository, and an org whose disabled_operations holds COMMIT. error.message names the reason. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | The caller&#39;s org has no version control configuration. |  -  |
| **409** | Conflict. A name matches more than one object of the given type; name the object by GUID or object id instead. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createversioncontrolconfig"></a>
# **CreateVersionControlConfig**
> VersionControlConfig CreateVersionControlConfig (CreateVersionControlConfigRequest createVersionControlConfigRequest)



 Version: 26.12.0.cl or later   Configures version control for your Org, connecting it to a Git repository and the branch that versioning runs commit to.  Use this once per Org before any commit, deploy or restore. To stop versioning without discarding the settings, send `disabled_operations` on the update endpoint instead of deleting the configuration.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class CreateVersionControlConfigExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var createVersionControlConfigRequest = new CreateVersionControlConfigRequest(); // CreateVersionControlConfigRequest | 

            try
            {
                VersionControlConfig result = apiInstance.CreateVersionControlConfig(createVersionControlConfigRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.CreateVersionControlConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateVersionControlConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlConfig> response = apiInstance.CreateVersionControlConfigWithHttpInfo(createVersionControlConfigRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.CreateVersionControlConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createVersionControlConfigRequest** | [**CreateVersionControlConfigRequest**](CreateVersionControlConfigRequest.md) |  |  |

### Return type

[**VersionControlConfig**](VersionControlConfig.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The stored configuration. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **409** | Conflict. The org is already configured, another org already commits to this repository and branch, or the org is still served by the legacy Callosum VCS surface. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteversioncontrolconfig"></a>
# **DeleteVersionControlConfig**
> void DeleteVersionControlConfig ()



 Version: 26.12.0.cl or later   Revokes version control for your Org. The configuration is deleted, the stored credential is destroyed, and any versioning run in flight for the Org fails.  Use this to disconnect an Org from its repository for good. To stop versioning but keep the settings and credential, set `disabled_operations` on the update endpoint instead.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class DeleteVersionControlConfigExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);

            try
            {
                apiInstance.DeleteVersionControlConfig();
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.DeleteVersionControlConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteVersionControlConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteVersionControlConfigWithHttpInfo();
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.DeleteVersionControlConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully revoked version control for the Org. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deployrevision"></a>
# **DeployRevision**
> VersionControlDeployResponse DeployRevision (DeployRevisionRequest deployRevisionRequest)



 Version: 26.12.0.cl or later   Starts a run that imports repository content from the branch your Org versions to into the Org itself. The run is asynchronous: the response is an admission receipt carrying a `run_id` and the pinned revision.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class DeployRevisionExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var deployRevisionRequest = new DeployRevisionRequest(); // DeployRevisionRequest | 

            try
            {
                VersionControlDeployResponse result = apiInstance.DeployRevision(deployRevisionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.DeployRevision: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeployRevisionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlDeployResponse> response = apiInstance.DeployRevisionWithHttpInfo(deployRevisionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.DeployRevisionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deployRevisionRequest** | [**DeployRevisionRequest**](DeployRevisionRequest.md) |  |  |

### Return type

[**VersionControlDeployResponse**](VersionControlDeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was admitted and the deploy run has started. The body is a receipt, not a result: nothing is imported yet. |  -  |
| **400** | Invalid request, and nothing was admitted. Covers a malformed body, an unknown, ambiguous or unreachable target_revision, a paused repository, and an org whose disabled_operations holds DEPLOY. error.message names the reason. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | The caller&#39;s org has no version control configuration. |  -  |
| **409** | Conflict. Another deploy, restore or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="promotebranch"></a>
# **PromoteBranch**
> VersionControlPromotionResponse PromoteBranch (PromoteBranchRequest promoteBranchRequest)



 Version: 26.12.0.cl or later   Merges content from another Org's branch, or from a branch named directly, into the branch your Org versions to, and pushes the result. This is a repository-only operation: no Org's live content changes until a deploy.  `dry_run` defaults to true, so a request that omits it reports what would change and writes nothing. Name the source by Org or by branch; a branch must be the one some Org in your repository versions to, and the source Org must use the same repository as yours. Promoting from any Org other than your own also requires tenant administration privilege, or `ADMINISTRATION` privilege in the source Org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class PromoteBranchExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var promoteBranchRequest = new PromoteBranchRequest(); // PromoteBranchRequest | 

            try
            {
                VersionControlPromotionResponse result = apiInstance.PromoteBranch(promoteBranchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.PromoteBranch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PromoteBranchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlPromotionResponse> response = apiInstance.PromoteBranchWithHttpInfo(promoteBranchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.PromoteBranchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **promoteBranchRequest** | [**PromoteBranchRequest**](PromoteBranchRequest.md) |  |  |

### Return type

[**VersionControlPromotionResponse**](VersionControlPromotionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The promotion was carried out, or with dry_run true would have been. Conflicting content appears here only when conflict_policy resolved it. |  -  |
| **400** | The promotion could not be carried out, and nothing was written. Covers a source that names both or neither of an org and a branch, a cherry-pick with no source_revision, a source org that versions to a different repository, a source_branch that no org in the caller&#39;s repository versions to, an unknown branch or commit, content that conflicts while conflict_policy is FAIL_REQUEST, which is equally a 400 on a dry run because the real promotion could not have completed either, branches with unrelated histories, and a target branch the provider protects. error.message names the reason. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. Also returned when the caller is neither a tenant administrator nor an administrator of the source org. |  -  |
| **404** | An org involved has no version control configuration: the caller&#39;s org, which then has no branch to promote into, or the org named by source.org_identifier, which then has none to promote from. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="restorerevision"></a>
# **RestoreRevision**
> VersionControlRestoreResponse RestoreRevision (RestoreRevisionRequest restoreRevisionRequest)



 Version: 26.12.0.cl or later   Starts a run that restores the branch your Org versions to, and the Org itself, to an earlier revision. The revision must be reachable from the configured branch and must not be its head. The run is asynchronous and returns an admission receipt carrying a `run_id`.  Use this to roll an Org back to a known-good revision. It both commits and deploys, so it carries the same consequences as a deploy: the Org is overwritten, and objects whose files are not present at the target revision are deleted.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class RestoreRevisionExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var restoreRevisionRequest = new RestoreRevisionRequest(); // RestoreRevisionRequest | 

            try
            {
                VersionControlRestoreResponse result = apiInstance.RestoreRevision(restoreRevisionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.RestoreRevision: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RestoreRevisionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlRestoreResponse> response = apiInstance.RestoreRevisionWithHttpInfo(restoreRevisionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.RestoreRevisionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **restoreRevisionRequest** | [**RestoreRevisionRequest**](RestoreRevisionRequest.md) |  |  |

### Return type

[**VersionControlRestoreResponse**](VersionControlRestoreResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was admitted and the restore run has started. The body is a receipt, not a result: nothing is committed or imported yet. |  -  |
| **400** | Invalid request, and nothing was admitted. Covers a malformed body, a target_revision that is unknown, ambiguous, unreachable from the branch or is its head, a paused repository, and an org whose disabled_operations holds COMMIT or DEPLOY. error.message names the reason. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | The caller&#39;s org has no version control configuration. |  -  |
| **409** | Conflict. Another restore, deploy or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchversioncontrolconfigs"></a>
# **SearchVersionControlConfigs**
> VersionControlConfigList SearchVersionControlConfigs ()



 Version: 26.12.0.cl or later   Returns your Org's version control configuration, or an empty list when the Org is not configured. The stored credential is never included; only its type and username are reported.  Use this to confirm which repository and branch an Org versions to before starting a run. The response is a list because the scope will widen to several Orgs in a later release.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class SearchVersionControlConfigsExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);

            try
            {
                VersionControlConfigList result = apiInstance.SearchVersionControlConfigs();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.SearchVersionControlConfigs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchVersionControlConfigsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlConfigList> response = apiInstance.SearchVersionControlConfigsWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.SearchVersionControlConfigsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**VersionControlConfigList**](VersionControlConfigList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Zero or one configuration. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchversioncontrolruns"></a>
# **SearchVersionControlRuns**
> VersionControlRunList SearchVersionControlRuns (SearchVersionControlRunsRequest searchVersionControlRunsRequest)



 Version: 26.12.0.cl or later   Returns the commit, deploy and restore runs for your Org, newest first, each with its current state and its per-object outcomes. This is the only place per-object results are reported: a commit, deploy or restore receipt carries only a `run_id`.  Use this to follow a run to completion, to explain a `PARTIAL_SUCCESS`, or to read an Org's commit history by filtering on `run_type` `COMMIT`. Filters combine with AND. Filter by object using object IDs; a deleted object can still be named, so its history stays searchable. Page through the results with `record_offset` and `record_size`, which accepts between 1 and 100 runs.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class SearchVersionControlRunsExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var searchVersionControlRunsRequest = new SearchVersionControlRunsRequest(); // SearchVersionControlRunsRequest | 

            try
            {
                VersionControlRunList result = apiInstance.SearchVersionControlRuns(searchVersionControlRunsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.SearchVersionControlRuns: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchVersionControlRunsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VersionControlRunList> response = apiInstance.SearchVersionControlRunsWithHttpInfo(searchVersionControlRunsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.SearchVersionControlRunsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchVersionControlRunsRequest** | [**SearchVersionControlRunsRequest**](SearchVersionControlRunsRequest.md) |  |  |

### Return type

[**VersionControlRunList**](VersionControlRunList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The runs&#39; current outcomes. A run identifier that does not exist in the caller&#39;s org is left out, not reported as an error. |  -  |
| **400** | Invalid request. Covers a malformed body, a run identifier that is not a UUID, more than 100 run_identifiers, more than 50 objects, an object identifier that is not a well-formed object id, an object type other than LIVEBOARD, ANSWER or LOGICAL_TABLE, an unknown run_type, and a record_offset or record_size out of range. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateversioncontrolconfig"></a>
# **UpdateVersionControlConfig**
> void UpdateVersionControlConfig (UpdateVersionControlConfigRequest updateVersionControlConfigRequest)



 Version: 26.12.0.cl or later   Changes your Org's version control configuration. Every field is optional and an omitted field keeps its stored value, so nothing is reset by leaving it out.  Use this to rotate a credential, move to a different branch, or turn individual operations off through `disabled_operations`. Changing the provider, repository, branch, directory or credential fails any versioning run already in flight.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

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
    public class UpdateVersionControlConfigExample
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
            var apiInstance = new VersionControlV2Api(httpClient, config, httpClientHandler);
            var updateVersionControlConfigRequest = new UpdateVersionControlConfigRequest(); // UpdateVersionControlConfigRequest | 

            try
            {
                apiInstance.UpdateVersionControlConfig(updateVersionControlConfigRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VersionControlV2Api.UpdateVersionControlConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateVersionControlConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateVersionControlConfigWithHttpInfo(updateVersionControlConfigRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VersionControlV2Api.UpdateVersionControlConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateVersionControlConfigRequest** | [**UpdateVersionControlConfigRequest**](UpdateVersionControlConfigRequest.md) |  |  |

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
| **204** | Successfully updated the version control configuration for the Org. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

