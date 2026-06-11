# CollectionsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createCollection**](CollectionsApi.md#createCollection) | **POST** /api/rest/2.0/collections/create |
| [**deleteCollection**](CollectionsApi.md#deleteCollection) | **POST** /api/rest/2.0/collections/delete |
| [**searchCollections**](CollectionsApi.md#searchCollections) | **POST** /api/rest/2.0/collections/search |
| [**updateCollection**](CollectionsApi.md#updateCollection) | **POST** /api/rest/2.0/collections/{collection_identifier}/update |


<a id="createCollection"></a>
# **createCollection**
> Collection createCollection(createCollectionRequest)



  Version: 26.4.0.cl or later   Creates a new collection in ThoughtSpot.  Collections allow you to organize and group related metadata objects such as Liveboards, Answers, worksheets, and other data objects. You can also create nested collections (sub-collections) to build a hierarchical structure.  #### Supported operations  The API endpoint lets you perform the following operations:  * Create a new collection * Add metadata objects (Liveboards, Answers, Logical Tables) to the collection * Create nested collections by adding sub-collections      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createCollectionRequest** | [**CreateCollectionRequest**](CreateCollectionRequest.md)

### Return type

[**Collection**](Collection.md)

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

<a id="deleteCollection"></a>
# **deleteCollection**
> CollectionDeleteResponse deleteCollection(deleteCollectionRequest)



  Version: 26.4.0.cl or later   Deletes one or more collections from ThoughtSpot.  #### Delete options  * **delete_children**: When set to &#x60;true&#x60;, deletes the child objects (metadata items) within the collection that the user has access to. Objects that the user does not have permission to delete will be skipped. * **dry_run**: When set to &#x60;true&#x60;, performs a preview of the deletion operation without actually deleting anything. The response shows what would be deleted, allowing you to review before committing the deletion.  #### Response  The response includes: * **metadata_deleted**: List of metadata objects that were successfully deleted * **metadata_skipped**: List of metadata objects that were skipped due to lack of permissions or other constraints      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteCollectionRequest** | [**DeleteCollectionRequest**](DeleteCollectionRequest.md)

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

<a id="searchCollections"></a>
# **searchCollections**
> CollectionSearchResponse searchCollections(searchCollectionsRequest)



  Version: 26.4.0.cl or later   Gets a list of collections available in ThoughtSpot.  To get details of a specific collection, specify the collection GUID or name. You can also filter the API response based on the collection name pattern, author, and other criteria.  #### Search options  * **name_pattern**: Use &#39;%&#39; as a wildcard character to match collection names * **collection_identifiers**: Search for specific collections by their GUIDs or names * **include_metadata**: When set to &#x60;true&#x60;, includes the metadata objects within each collection in the response  **NOTE**: If the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60; parameter. To search across all available collections, set &#x60;record_size&#x60; to &#x60;-1&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCollectionsRequest** | [**SearchCollectionsRequest**](SearchCollectionsRequest.md)

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

<a id="updateCollection"></a>
# **updateCollection**
> updateCollection(collectionIdentifier, updateCollectionRequest)



  Version: 26.4.0.cl or later   Updates an existing collection in ThoughtSpot.  #### Supported operations  This API endpoint lets you perform the following operations:  * Update collection name and description * Change visibility settings * Add metadata objects to the collection (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace all metadata objects in the collection (operation: REPLACE)  #### Operation types  * **ADD**: Adds the specified metadata objects to the existing collection without removing current items * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**: Replaces all existing metadata objects with the specified items (default behavior)      

### Parameters

| Name | Type |
|------------- | ------------- |
| **collectionIdentifier** | **String**
| **updateCollectionRequest** | [**UpdateCollectionRequest**](UpdateCollectionRequest.md)

### Return type

null (empty response body)

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

