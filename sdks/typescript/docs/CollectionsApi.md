# ThoughtSpotRestApiSdk.CollectionsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCollection**](CollectionsApi.md#createCollection) | **POST** /api/rest/2.0/collections/create | 
[**deleteCollection**](CollectionsApi.md#deleteCollection) | **POST** /api/rest/2.0/collections/delete | 
[**searchCollections**](CollectionsApi.md#searchCollections) | **POST** /api/rest/2.0/collections/search | 
[**updateCollection**](CollectionsApi.md#updateCollection) | **POST** /api/rest/2.0/collections/{collection_identifier}/update | 


# **createCollection**
> Collection createCollection(createCollectionRequest)

  Version: 26.4.0.cl or later   Creates a new collection in ThoughtSpot.  Collections allow you to organize and group related metadata objects such as Liveboards, Answers, worksheets, and other data objects. You can also create nested collections (sub-collections) to build a hierarchical structure.  #### Supported operations  The API endpoint lets you perform the following operations:  * Create a new collection * Add metadata objects (Liveboards, Answers, Logical Tables) to the collection * Create nested collections by adding sub-collections      

### Example


```typescript
import { createBearerAuthenticationConfig, CollectionsApi, CreateCollectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CollectionsApi(configuration);

apiInstance.createCollection(
  // CreateCollectionRequest
  {
    name: "name_example",
    description: "description_example",
    metadata: [
      {
        type: "LIVEBOARD",
        identifiers: [
          "identifiers_example",
        ],
      },
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCollectionRequest** | **CreateCollectionRequest**|  |


### Return type

**Collection**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection created successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteCollection**
> CollectionDeleteResponse deleteCollection(deleteCollectionRequest)

  Version: 26.4.0.cl or later   Deletes one or more collections from ThoughtSpot.  #### Delete options  * **delete_children**: When set to `true`, deletes the child objects (metadata items) within the collection that the user has access to. Objects that the user does not have permission to delete will be skipped. * **dry_run**: When set to `true`, performs a preview of the deletion operation without actually deleting anything. The response shows what would be deleted, allowing you to review before committing the deletion.  #### Response  The response includes: * **metadata_deleted**: List of metadata objects that were successfully deleted * **metadata_skipped**: List of metadata objects that were skipped due to lack of permissions or other constraints      

### Example


```typescript
import { createBearerAuthenticationConfig, CollectionsApi, DeleteCollectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CollectionsApi(configuration);

apiInstance.deleteCollection(
  // DeleteCollectionRequest
  {
    collection_identifiers: [
      "collection_identifiers_example",
    ],
    delete_children: false,
    dry_run: false,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteCollectionRequest** | **DeleteCollectionRequest**|  |


### Return type

**CollectionDeleteResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collections deleted successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | Resource not found. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchCollections**
> CollectionSearchResponse searchCollections(searchCollectionsRequest)

  Version: 26.4.0.cl or later   Gets a list of collections available in ThoughtSpot.  To get details of a specific collection, specify the collection GUID or name. You can also filter the API response based on the collection name pattern, author, and other criteria.  #### Search options  * **name_pattern**: Use \'%\' as a wildcard character to match collection names * **collection_identifiers**: Search for specific collections by their GUIDs or names * **include_metadata**: When set to `true`, includes the metadata objects within each collection in the response  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available collections, set `record_size` to `-1`.      

### Example


```typescript
import { createBearerAuthenticationConfig, CollectionsApi, SearchCollectionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CollectionsApi(configuration);

apiInstance.searchCollections(
  // SearchCollectionsRequest
  {
    name_pattern: "name_pattern_example",
    record_offset: 0,
    record_size: 10,
    collection_identifiers: [
      "collection_identifiers_example",
    ],
    created_by_user_identifiers: [
      "created_by_user_identifiers_example",
    ],
    include_metadata: false,
    sort_options: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCollectionsRequest** | **SearchCollectionsRequest**|  |


### Return type

**CollectionSearchResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved list of collections |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateCollection**
> void updateCollection(updateCollectionRequest)

  Version: 26.4.0.cl or later   Updates an existing collection in ThoughtSpot.  #### Supported operations  This API endpoint lets you perform the following operations:  * Update collection name and description * Change visibility settings * Add metadata objects to the collection (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace all metadata objects in the collection (operation: REPLACE)  #### Operation types  * **ADD**: Adds the specified metadata objects to the existing collection without removing current items * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**: Replaces all existing metadata objects with the specified items (default behavior)      

### Example


```typescript
import { createBearerAuthenticationConfig, CollectionsApi, UpdateCollectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new CollectionsApi(configuration);

apiInstance.updateCollection(
  // string | Unique GUID of the collection. Note: Collection names cannot be used as identifiers since duplicate names are allowed.
  "collection_identifier_example" , 
  // UpdateCollectionRequest
  {
    name: "name_example",
    description: "description_example",
    metadata: [
      {
        type: "LIVEBOARD",
        identifiers: [
          "identifiers_example",
        ],
      },
    ],
    operation: "REPLACE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCollectionRequest** | **UpdateCollectionRequest**|  |
 **collectionIdentifier** | [**string**] | Unique GUID of the collection. Note: Collection names cannot be used as identifiers since duplicate names are allowed. | defaults to undefined


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
**204** | Collection updated successfully. No content returned. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | Resource not found. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

