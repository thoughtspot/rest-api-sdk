# TagsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**assignTag**](TagsApi.md#assignTag) | **POST** /api/rest/2.0/tags/assign |
| [**createTag**](TagsApi.md#createTag) | **POST** /api/rest/2.0/tags/create |
| [**deleteTag**](TagsApi.md#deleteTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete |
| [**searchTags**](TagsApi.md#searchTags) | **POST** /api/rest/2.0/tags/search |
| [**unassignTag**](TagsApi.md#unassignTag) | **POST** /api/rest/2.0/tags/unassign |
| [**updateTag**](TagsApi.md#updateTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update |


<a id="assignTag"></a>
# **assignTag**
> assignTag(assignTagRequest)



  Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **assignTagRequest** | [**AssignTagRequest**](AssignTagRequest.md)

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
| **204** | Tags successfully assigned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createTag"></a>
# **createTag**
> Tag createTag(createTagRequest)



  Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createTagRequest** | [**CreateTagRequest**](CreateTagRequest.md)

### Return type

[**Tag**](Tag.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tag successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteTag"></a>
# **deleteTag**
> deleteTag(tagIdentifier)



  Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **tagIdentifier** | **String**

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Tag successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchTags"></a>
# **searchTags**
> List&lt;Tag&gt; searchTags(searchTagsRequest)



  Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchTagsRequest** | [**SearchTagsRequest**](SearchTagsRequest.md)

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="unassignTag"></a>
# **unassignTag**
> unassignTag(assignTagRequest)



  Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **assignTagRequest** | [**AssignTagRequest**](AssignTagRequest.md)

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
| **204** | Tags successfully unassigned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateTag"></a>
# **updateTag**
> updateTag(tagIdentifier, updateTagRequest)



  Version: 9.0.0.cl or later   Updates a tag object.  You can modify the &#x60;name&#x60; and &#x60;color&#x60; properties of a tag object.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **tagIdentifier** | **String**
| **updateTagRequest** | [**UpdateTagRequest**](UpdateTagRequest.md)

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
| **204** | Tag successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

