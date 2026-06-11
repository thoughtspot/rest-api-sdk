/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.google.gson.reflect.TypeToken;
import com.thoughtspot.client.ApiCallback;
import com.thoughtspot.client.ApiClient;
import com.thoughtspot.client.ApiClientConfiguration;
import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.ApiResponse;
import com.thoughtspot.client.Configuration;
import com.thoughtspot.client.Pair;
import com.thoughtspot.client.model.Collection;
import com.thoughtspot.client.model.CollectionDeleteResponse;
import com.thoughtspot.client.model.CollectionSearchResponse;
import com.thoughtspot.client.model.CreateCollectionRequest;
import com.thoughtspot.client.model.DeleteCollectionRequest;
import com.thoughtspot.client.model.SearchCollectionsRequest;
import com.thoughtspot.client.model.UpdateCollectionRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CollectionsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CollectionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CollectionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public CollectionsApi(ApiClientConfiguration apiClientConfiguration) {
        this.localVarApiClientConfiguration = apiClientConfiguration;
        this.localVarApiClient = new ApiClient(apiClientConfiguration);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClientConfiguration getApiClientConfiguration() {
        return localVarApiClientConfiguration;
    }

    public void applyApiClientConfiguration(ApiClientConfiguration apiClientConfiguration) {
        this.localVarApiClientConfiguration = apiClientConfiguration;
        if (localVarApiClient != null) {
            localVarApiClient.applyApiClientConfiguration(apiClientConfiguration);
        } else {
            localVarApiClient = new ApiClient(apiClientConfiguration);
        }
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createCollection
     *
     * @param createCollectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collection created successfully </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCollectionCall(
            CreateCollectionRequest createCollectionRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createCollectionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/collections/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCollectionValidateBeforeCall(
            CreateCollectionRequest createCollectionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createCollectionRequest' is set
        if (createCollectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createCollectionRequest' when calling"
                            + " createCollection(Async)");
        }

        return createCollectionCall(createCollectionRequest, _callback);
    }

    /**
     * Version: 26.4.0.cl or later Creates a new collection in ThoughtSpot. Collections allow you to
     * organize and group related metadata objects such as Liveboards, Answers, worksheets, and
     * other data objects. You can also create nested collections (sub-collections) to build a
     * hierarchical structure. #### Supported operations The API endpoint lets you perform the
     * following operations: * Create a new collection * Add metadata objects (Liveboards, Answers,
     * Logical Tables) to the collection * Create nested collections by adding sub-collections
     *
     * @param createCollectionRequest (required)
     * @return Collection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collection created successfully </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Collection createCollection(CreateCollectionRequest createCollectionRequest)
            throws ApiException {
        ApiResponse<Collection> localVarResp =
                createCollectionWithHttpInfo(createCollectionRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.4.0.cl or later Creates a new collection in ThoughtSpot. Collections allow you to
     * organize and group related metadata objects such as Liveboards, Answers, worksheets, and
     * other data objects. You can also create nested collections (sub-collections) to build a
     * hierarchical structure. #### Supported operations The API endpoint lets you perform the
     * following operations: * Create a new collection * Add metadata objects (Liveboards, Answers,
     * Logical Tables) to the collection * Create nested collections by adding sub-collections
     *
     * @param createCollectionRequest (required)
     * @return ApiResponse&lt;Collection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collection created successfully </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Collection> createCollectionWithHttpInfo(
            CreateCollectionRequest createCollectionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createCollectionValidateBeforeCall(createCollectionRequest, null);
        Type localVarReturnType = new TypeToken<Collection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.4.0.cl or later Creates a new collection in ThoughtSpot.
     * Collections allow you to organize and group related metadata objects such as Liveboards,
     * Answers, worksheets, and other data objects. You can also create nested collections
     * (sub-collections) to build a hierarchical structure. #### Supported operations The API
     * endpoint lets you perform the following operations: * Create a new collection * Add metadata
     * objects (Liveboards, Answers, Logical Tables) to the collection * Create nested collections
     * by adding sub-collections
     *
     * @param createCollectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collection created successfully </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCollectionAsync(
            CreateCollectionRequest createCollectionRequest,
            final ApiCallback<Collection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createCollectionValidateBeforeCall(createCollectionRequest, _callback);
        Type localVarReturnType = new TypeToken<Collection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCollection
     *
     * @param deleteCollectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collections deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCollectionCall(
            DeleteCollectionRequest deleteCollectionRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteCollectionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/collections/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCollectionValidateBeforeCall(
            DeleteCollectionRequest deleteCollectionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'deleteCollectionRequest' is set
        if (deleteCollectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'deleteCollectionRequest' when calling"
                            + " deleteCollection(Async)");
        }

        return deleteCollectionCall(deleteCollectionRequest, _callback);
    }

    /**
     * Version: 26.4.0.cl or later Deletes one or more collections from ThoughtSpot. #### Delete
     * options * **delete_children**: When set to &#x60;true&#x60;, deletes the child objects
     * (metadata items) within the collection that the user has access to. Objects that the user
     * does not have permission to delete will be skipped. * **dry_run**: When set to
     * &#x60;true&#x60;, performs a preview of the deletion operation without actually deleting
     * anything. The response shows what would be deleted, allowing you to review before committing
     * the deletion. #### Response The response includes: * **metadata_deleted**: List of metadata
     * objects that were successfully deleted * **metadata_skipped**: List of metadata objects that
     * were skipped due to lack of permissions or other constraints
     *
     * @param deleteCollectionRequest (required)
     * @return CollectionDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collections deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public CollectionDeleteResponse deleteCollection(
            DeleteCollectionRequest deleteCollectionRequest) throws ApiException {
        ApiResponse<CollectionDeleteResponse> localVarResp =
                deleteCollectionWithHttpInfo(deleteCollectionRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.4.0.cl or later Deletes one or more collections from ThoughtSpot. #### Delete
     * options * **delete_children**: When set to &#x60;true&#x60;, deletes the child objects
     * (metadata items) within the collection that the user has access to. Objects that the user
     * does not have permission to delete will be skipped. * **dry_run**: When set to
     * &#x60;true&#x60;, performs a preview of the deletion operation without actually deleting
     * anything. The response shows what would be deleted, allowing you to review before committing
     * the deletion. #### Response The response includes: * **metadata_deleted**: List of metadata
     * objects that were successfully deleted * **metadata_skipped**: List of metadata objects that
     * were skipped due to lack of permissions or other constraints
     *
     * @param deleteCollectionRequest (required)
     * @return ApiResponse&lt;CollectionDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collections deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CollectionDeleteResponse> deleteCollectionWithHttpInfo(
            DeleteCollectionRequest deleteCollectionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteCollectionValidateBeforeCall(deleteCollectionRequest, null);
        Type localVarReturnType = new TypeToken<CollectionDeleteResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.4.0.cl or later Deletes one or more collections from
     * ThoughtSpot. #### Delete options * **delete_children**: When set to &#x60;true&#x60;, deletes
     * the child objects (metadata items) within the collection that the user has access to. Objects
     * that the user does not have permission to delete will be skipped. * **dry_run**: When set to
     * &#x60;true&#x60;, performs a preview of the deletion operation without actually deleting
     * anything. The response shows what would be deleted, allowing you to review before committing
     * the deletion. #### Response The response includes: * **metadata_deleted**: List of metadata
     * objects that were successfully deleted * **metadata_skipped**: List of metadata objects that
     * were skipped due to lack of permissions or other constraints
     *
     * @param deleteCollectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Collections deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCollectionAsync(
            DeleteCollectionRequest deleteCollectionRequest,
            final ApiCallback<CollectionDeleteResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteCollectionValidateBeforeCall(deleteCollectionRequest, _callback);
        Type localVarReturnType = new TypeToken<CollectionDeleteResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchCollections
     *
     * @param searchCollectionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully retrieved list of collections </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCollectionsCall(
            SearchCollectionsRequest searchCollectionsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchCollectionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/collections/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchCollectionsValidateBeforeCall(
            SearchCollectionsRequest searchCollectionsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchCollectionsRequest' is set
        if (searchCollectionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchCollectionsRequest' when calling"
                            + " searchCollections(Async)");
        }

        return searchCollectionsCall(searchCollectionsRequest, _callback);
    }

    /**
     * Version: 26.4.0.cl or later Gets a list of collections available in ThoughtSpot. To get
     * details of a specific collection, specify the collection GUID or name. You can also filter
     * the API response based on the collection name pattern, author, and other criteria. ####
     * Search options * **name_pattern**: Use &#39;%&#39; as a wildcard character to match
     * collection names * **collection_identifiers**: Search for specific collections by their GUIDs
     * or names * **include_metadata**: When set to &#x60;true&#x60;, includes the metadata objects
     * within each collection in the response **NOTE**: If the API returns an empty list, consider
     * increasing the value of the &#x60;record_size&#x60; parameter. To search across all available
     * collections, set &#x60;record_size&#x60; to &#x60;-1&#x60;.
     *
     * @param searchCollectionsRequest (required)
     * @return CollectionSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully retrieved list of collections </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public CollectionSearchResponse searchCollections(
            SearchCollectionsRequest searchCollectionsRequest) throws ApiException {
        ApiResponse<CollectionSearchResponse> localVarResp =
                searchCollectionsWithHttpInfo(searchCollectionsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.4.0.cl or later Gets a list of collections available in ThoughtSpot. To get
     * details of a specific collection, specify the collection GUID or name. You can also filter
     * the API response based on the collection name pattern, author, and other criteria. ####
     * Search options * **name_pattern**: Use &#39;%&#39; as a wildcard character to match
     * collection names * **collection_identifiers**: Search for specific collections by their GUIDs
     * or names * **include_metadata**: When set to &#x60;true&#x60;, includes the metadata objects
     * within each collection in the response **NOTE**: If the API returns an empty list, consider
     * increasing the value of the &#x60;record_size&#x60; parameter. To search across all available
     * collections, set &#x60;record_size&#x60; to &#x60;-1&#x60;.
     *
     * @param searchCollectionsRequest (required)
     * @return ApiResponse&lt;CollectionSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully retrieved list of collections </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CollectionSearchResponse> searchCollectionsWithHttpInfo(
            SearchCollectionsRequest searchCollectionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchCollectionsValidateBeforeCall(searchCollectionsRequest, null);
        Type localVarReturnType = new TypeToken<CollectionSearchResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.4.0.cl or later Gets a list of collections available in
     * ThoughtSpot. To get details of a specific collection, specify the collection GUID or name.
     * You can also filter the API response based on the collection name pattern, author, and other
     * criteria. #### Search options * **name_pattern**: Use &#39;%&#39; as a wildcard character to
     * match collection names * **collection_identifiers**: Search for specific collections by their
     * GUIDs or names * **include_metadata**: When set to &#x60;true&#x60;, includes the metadata
     * objects within each collection in the response **NOTE**: If the API returns an empty list,
     * consider increasing the value of the &#x60;record_size&#x60; parameter. To search across all
     * available collections, set &#x60;record_size&#x60; to &#x60;-1&#x60;.
     *
     * @param searchCollectionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully retrieved list of collections </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCollectionsAsync(
            SearchCollectionsRequest searchCollectionsRequest,
            final ApiCallback<CollectionSearchResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchCollectionsValidateBeforeCall(searchCollectionsRequest, _callback);
        Type localVarReturnType = new TypeToken<CollectionSearchResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCollection
     *
     * @param collectionIdentifier Unique GUID of the collection. Note: Collection names cannot be
     *     used as identifiers since duplicate names are allowed. (required)
     * @param updateCollectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Collection updated successfully. No content returned. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCollectionCall(
            String collectionIdentifier,
            UpdateCollectionRequest updateCollectionRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateCollectionRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/collections/{collection_identifier}/update"
                        .replace(
                                "{" + "collection_identifier" + "}",
                                localVarApiClient.escapeString(collectionIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateCollectionValidateBeforeCall(
            String collectionIdentifier,
            UpdateCollectionRequest updateCollectionRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'collectionIdentifier' is set
        if (collectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'collectionIdentifier' when calling"
                            + " updateCollection(Async)");
        }

        // verify the required parameter 'updateCollectionRequest' is set
        if (updateCollectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateCollectionRequest' when calling"
                            + " updateCollection(Async)");
        }

        return updateCollectionCall(collectionIdentifier, updateCollectionRequest, _callback);
    }

    /**
     * Version: 26.4.0.cl or later Updates an existing collection in ThoughtSpot. #### Supported
     * operations This API endpoint lets you perform the following operations: * Update collection
     * name and description * Change visibility settings * Add metadata objects to the collection
     * (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace
     * all metadata objects in the collection (operation: REPLACE) #### Operation types * **ADD**:
     * Adds the specified metadata objects to the existing collection without removing current items
     * * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**:
     * Replaces all existing metadata objects with the specified items (default behavior)
     *
     * @param collectionIdentifier Unique GUID of the collection. Note: Collection names cannot be
     *     used as identifiers since duplicate names are allowed. (required)
     * @param updateCollectionRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Collection updated successfully. No content returned. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateCollection(
            String collectionIdentifier, UpdateCollectionRequest updateCollectionRequest)
            throws ApiException {
        updateCollectionWithHttpInfo(collectionIdentifier, updateCollectionRequest);
    }

    /**
     * Version: 26.4.0.cl or later Updates an existing collection in ThoughtSpot. #### Supported
     * operations This API endpoint lets you perform the following operations: * Update collection
     * name and description * Change visibility settings * Add metadata objects to the collection
     * (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace
     * all metadata objects in the collection (operation: REPLACE) #### Operation types * **ADD**:
     * Adds the specified metadata objects to the existing collection without removing current items
     * * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**:
     * Replaces all existing metadata objects with the specified items (default behavior)
     *
     * @param collectionIdentifier Unique GUID of the collection. Note: Collection names cannot be
     *     used as identifiers since duplicate names are allowed. (required)
     * @param updateCollectionRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Collection updated successfully. No content returned. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateCollectionWithHttpInfo(
            String collectionIdentifier, UpdateCollectionRequest updateCollectionRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateCollectionValidateBeforeCall(
                        collectionIdentifier, updateCollectionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 26.4.0.cl or later Updates an existing collection in ThoughtSpot.
     * #### Supported operations This API endpoint lets you perform the following operations: *
     * Update collection name and description * Change visibility settings * Add metadata objects to
     * the collection (operation: ADD) * Remove metadata objects from the collection (operation:
     * REMOVE) * Replace all metadata objects in the collection (operation: REPLACE) #### Operation
     * types * **ADD**: Adds the specified metadata objects to the existing collection without
     * removing current items * **REMOVE**: Removes only the specified metadata objects from the
     * collection * **REPLACE**: Replaces all existing metadata objects with the specified items
     * (default behavior)
     *
     * @param collectionIdentifier Unique GUID of the collection. Note: Collection names cannot be
     *     used as identifiers since duplicate names are allowed. (required)
     * @param updateCollectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Collection updated successfully. No content returned. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCollectionAsync(
            String collectionIdentifier,
            UpdateCollectionRequest updateCollectionRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateCollectionValidateBeforeCall(
                        collectionIdentifier, updateCollectionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
