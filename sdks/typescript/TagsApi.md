# ThoughtSpotRestApiSdk.TagsApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignTag**](TagsApi.md#assignTag) | **POST** /api/rest/2.0/tags/assign | 
[**createTag**](TagsApi.md#createTag) | **POST** /api/rest/2.0/tags/create | 
[**deleteTag**](TagsApi.md#deleteTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete | 
[**searchTags**](TagsApi.md#searchTags) | **POST** /api/rest/2.0/tags/search | 
[**unassignTag**](TagsApi.md#unassignTag) | **POST** /api/rest/2.0/tags/unassign | 
[**updateTag**](TagsApi.md#updateTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update | 


# **assignTag**
> void assignTag(assignTagRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.TagsApi(configuration);

let body:ThoughtSpotRestApiSdk.TagsApiAssignTagRequest = {
  // AssignTagRequest
  assignTagRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
  },
};

apiInstance.assignTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignTagRequest** | **AssignTagRequest**|  |


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
**204** | Tags successfully assigned. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createTag**
> Tag createTag(createTagRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.TagsApi(configuration);

let body:ThoughtSpotRestApiSdk.TagsApiCreateTagRequest = {
  // CreateTagRequest
  createTagRequest: {
    name: "name_example",
    color: "color_example",
  },
};

apiInstance.createTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTagRequest** | **CreateTagRequest**|  |


### Return type

**Tag**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tag successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteTag**
> void deleteTag()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.TagsApi(configuration);

let body:ThoughtSpotRestApiSdk.TagsApiDeleteTagRequest = {
  // string | Tag identifier Tag name or Tag id.
  tagIdentifier: "tag_identifier_example",
};

apiInstance.deleteTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagIdentifier** | [**string**] | Tag identifier Tag name or Tag id. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Tag successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchTags**
> Array<Tag> searchTags()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.TagsApi(configuration);

let body:ThoughtSpotRestApiSdk.TagsApiSearchTagsRequest = {
  // SearchTagsRequest (optional)
  searchTagsRequest: {
    tagIdentifier: "tagIdentifier_example",
    color: "color_example",
  },
};

apiInstance.searchTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTagsRequest** | **SearchTagsRequest**|  |


### Return type

**Array<Tag>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tags search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **unassignTag**
> void unassignTag(assignTagRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.TagsApi(configuration);

let body:ThoughtSpotRestApiSdk.TagsApiUnassignTagRequest = {
  // AssignTagRequest
  assignTagRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
  },
};

apiInstance.unassignTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignTagRequest** | **AssignTagRequest**|  |


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
**204** | Tags successfully unassigned. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateTag**
> void updateTag()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.TagsApi(configuration);

let body:ThoughtSpotRestApiSdk.TagsApiUpdateTagRequest = {
  // string | Name or Id of the tag.
  tagIdentifier: "tag_identifier_example",
  // UpdateTagRequest (optional)
  updateTagRequest: {
    name: "name_example",
    color: "color_example",
  },
};

apiInstance.updateTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateTagRequest** | **UpdateTagRequest**|  |
 **tagIdentifier** | [**string**] | Name or Id of the tag. | defaults to undefined


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
**204** | Tag successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

