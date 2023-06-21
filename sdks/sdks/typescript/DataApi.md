# ThoughtSpotRestApiSdk.DataApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAnswerData**](DataApi.md#fetchAnswerData) | **POST** /api/rest/2.0/metadata/answer/data | 
[**fetchLiveboardData**](DataApi.md#fetchLiveboardData) | **POST** /api/rest/2.0/metadata/liveboard/data | 
[**searchData**](DataApi.md#searchData) | **POST** /api/rest/2.0/searchdata | 


# **fetchAnswerData**
> AnswerDataResponse fetchAnswerData(fetchAnswerDataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches data from a saved Answer.  Requires at least view access to the saved Answer.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DataApi, FetchAnswerDataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DataApi(configuration);

apiInstance.fetchAnswerData(
  // FetchAnswerDataRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchAnswerDataRequest** | **FetchAnswerDataRequest**|  |


### Return type

**AnswerDataResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching data of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchLiveboardData**
> LiveboardDataResponse fetchLiveboardData(fetchLiveboardDataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DataApi, FetchLiveboardDataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DataApi(configuration);

apiInstance.fetchLiveboardData(
  // FetchLiveboardDataRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
    visualizationIdentifiers: [
      "visualizationIdentifiers_example",
    ],
    transientContent: "transientContent_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchLiveboardDataRequest** | **FetchLiveboardDataRequest**|  |


### Return type

**LiveboardDataResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching data of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchData**
> SearchDataResponse searchData(searchDataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DataApi, SearchDataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DataApi(configuration);

apiInstance.searchData(
  // SearchDataRequest
  {
    queryString: "queryString_example",
    logicalTableIdentifier: "logicalTableIdentifier_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchDataRequest** | **SearchDataRequest**|  |


### Return type

**SearchDataResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching data of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

