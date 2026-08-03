# ThoughtSpot.RestApi.Sdk.Api.CollectionsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateCollection**](CollectionsApi.md#createcollection) | **POST** /api/rest/2.0/collections/create |  |
| [**DeleteCollection**](CollectionsApi.md#deletecollection) | **POST** /api/rest/2.0/collections/delete |  |
| [**SearchCollections**](CollectionsApi.md#searchcollections) | **POST** /api/rest/2.0/collections/search |  |
| [**UpdateCollection**](CollectionsApi.md#updatecollection) | **POST** /api/rest/2.0/collections/{collection_identifier}/update |  |

<a id="createcollection"></a>
# **CreateCollection**
> Collection CreateCollection (CreateCollectionRequest createCollectionRequest)



  Version: 26.4.0.cl or later   Creates a new collection in ThoughtSpot.  Collections allow you to organize and group related metadata objects such as Liveboards, Answers, worksheets, and other data objects. You can also create nested collections (sub-collections) to build a hierarchical structure.  #### Supported operations  The API endpoint lets you perform the following operations:  * Create a new collection * Add metadata objects (Liveboards, Answers, Logical Tables) to the collection * Create nested collections by adding sub-collections      

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
    public class CreateCollectionExample
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
            var apiInstance = new CollectionsApi(httpClient, config, httpClientHandler);
            var createCollectionRequest = new CreateCollectionRequest(); // CreateCollectionRequest | 

            try
            {
                Collection result = apiInstance.CreateCollection(createCollectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CollectionsApi.CreateCollection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCollectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Collection> response = apiInstance.CreateCollectionWithHttpInfo(createCollectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CollectionsApi.CreateCollectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCollectionRequest** | [**CreateCollectionRequest**](CreateCollectionRequest.md) |  |  |

### Return type

**Collection**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection created successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletecollection"></a>
# **DeleteCollection**
> CollectionDeleteResponse DeleteCollection (DeleteCollectionRequest deleteCollectionRequest)



  Version: 26.4.0.cl or later   Deletes one or more collections from ThoughtSpot.  #### Delete options  * **delete_children**: When set to `true`, deletes the child objects (metadata items) within the collection that the user has access to. Objects that the user does not have permission to delete will be skipped. * **dry_run**: When set to `true`, performs a preview of the deletion operation without actually deleting anything. The response shows what would be deleted, allowing you to review before committing the deletion.  #### Response  The response includes: * **metadata_deleted**: List of metadata objects that were successfully deleted * **metadata_skipped**: List of metadata objects that were skipped due to lack of permissions or other constraints      

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
    public class DeleteCollectionExample
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
            var apiInstance = new CollectionsApi(httpClient, config, httpClientHandler);
            var deleteCollectionRequest = new DeleteCollectionRequest(); // DeleteCollectionRequest | 

            try
            {
                CollectionDeleteResponse result = apiInstance.DeleteCollection(deleteCollectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CollectionsApi.DeleteCollection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteCollectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CollectionDeleteResponse> response = apiInstance.DeleteCollectionWithHttpInfo(deleteCollectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CollectionsApi.DeleteCollectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteCollectionRequest** | [**DeleteCollectionRequest**](DeleteCollectionRequest.md) |  |  |

### Return type

[**CollectionDeleteResponse**](CollectionDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collections deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Resource not found. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcollections"></a>
# **SearchCollections**
> CollectionSearchResponse SearchCollections (SearchCollectionsRequest searchCollectionsRequest)



  Version: 26.4.0.cl or later   Gets a list of collections available in ThoughtSpot.  To get details of a specific collection, specify the collection GUID or name. You can also filter the API response based on the collection name pattern, author, and other criteria.  #### Search options  * **name_pattern**: Use '%' as a wildcard character to match collection names * **collection_identifiers**: Search for specific collections by their GUIDs or names * **include_metadata**: When set to `true`, includes the metadata objects within each collection in the response  **NOTE**: In addition to the GUID and name, `collection_identifiers` accepts a Custom object ID if one is configured for the collection. The response also includes the `obj_id` field for each collection that has one set.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available collections, set `record_size` to `-1`.      

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
    public class SearchCollectionsExample
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
            var apiInstance = new CollectionsApi(httpClient, config, httpClientHandler);
            var searchCollectionsRequest = new SearchCollectionsRequest(); // SearchCollectionsRequest | 

            try
            {
                CollectionSearchResponse result = apiInstance.SearchCollections(searchCollectionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CollectionsApi.SearchCollections: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCollectionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CollectionSearchResponse> response = apiInstance.SearchCollectionsWithHttpInfo(searchCollectionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CollectionsApi.SearchCollectionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCollectionsRequest** | [**SearchCollectionsRequest**](SearchCollectionsRequest.md) |  |  |

### Return type

[**CollectionSearchResponse**](CollectionSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved list of collections |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecollection"></a>
# **UpdateCollection**
> void UpdateCollection (string collectionIdentifier, UpdateCollectionRequest updateCollectionRequest)



  Version: 26.4.0.cl or later   Updates an existing collection in ThoughtSpot.  #### Supported operations  This API endpoint lets you perform the following operations:  * Update collection name and description * Change visibility settings * Add metadata objects to the collection (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace all metadata objects in the collection (operation: REPLACE)  #### Operation types  * **ADD**: Adds the specified metadata objects to the existing collection without removing current items * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**: Replaces all existing metadata objects with the specified items (default behavior)      

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
    public class UpdateCollectionExample
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
            var apiInstance = new CollectionsApi(httpClient, config, httpClientHandler);
            var collectionIdentifier = "collectionIdentifier_example";  // string | Unique GUID of the collection. Note: Collection names cannot be used as identifiers since duplicate names are allowed.
            var updateCollectionRequest = new UpdateCollectionRequest(); // UpdateCollectionRequest | 

            try
            {
                apiInstance.UpdateCollection(collectionIdentifier, updateCollectionRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CollectionsApi.UpdateCollection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateCollectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateCollectionWithHttpInfo(collectionIdentifier, updateCollectionRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CollectionsApi.UpdateCollectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **collectionIdentifier** | **string** | Unique GUID of the collection. Note: Collection names cannot be used as identifiers since duplicate names are allowed. |  |
| **updateCollectionRequest** | [**UpdateCollectionRequest**](UpdateCollectionRequest.md) |  |  |

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
| **204** | Collection updated successfully. No content returned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Resource not found. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

