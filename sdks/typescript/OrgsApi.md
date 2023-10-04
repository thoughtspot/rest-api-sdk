# ThoughtSpotRestApiSdk.OrgsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrg**](OrgsApi.md#createOrg) | **POST** /api/rest/2.0/orgs/create | 
[**deleteOrg**](OrgsApi.md#deleteOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/delete | 
[**searchOrgs**](OrgsApi.md#searchOrgs) | **POST** /api/rest/2.0/orgs/search | 
[**updateOrg**](OrgsApi.md#updateOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/update | 


# **createOrg**
> OrgResponse createOrg(createOrgRequest)

  Version: 9.0.0.cl or later  Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.      

### Example


```typescript
import { createBearerAuthenticationConfig, OrgsApi, CreateOrgRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new OrgsApi(configuration);

apiInstance.createOrg(
  // CreateOrgRequest
  {
    name: "name_example",
    description: "description_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrgRequest** | **CreateOrgRequest**|  |


### Return type

**OrgResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteOrg**
> void deleteOrg()

  Version: 9.0.0.cl or later  Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      

### Example


```typescript
import { createBearerAuthenticationConfig, OrgsApi, DeleteOrgRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new OrgsApi(configuration);

apiInstance.deleteOrg(
  // string | ID or name of the Org
  "org_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgIdentifier** | [**string**] | ID or name of the Org | defaults to undefined


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
**204** | Organization successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchOrgs**
> Array<OrgResponse> searchOrgs()

  Version: 9.0.0.cl or later  Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.      

### Example


```typescript
import { createBearerAuthenticationConfig, OrgsApi, SearchOrgsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new OrgsApi(configuration);

apiInstance.searchOrgs(
  // SearchOrgsRequest (optional)
  {
    org_identifier: "org_identifier_example",
    description: "description_example",
    visibility: "SHOW",
    status: "ACTIVE",
    user_identifiers: [
      "user_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchOrgsRequest** | **SearchOrgsRequest**|  |


### Return type

**Array<OrgResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateOrg**
> void updateOrg()

  Version: 9.0.0.cl or later  Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.      

### Example


```typescript
import { createBearerAuthenticationConfig, OrgsApi, UpdateOrgRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new OrgsApi(configuration);

apiInstance.updateOrg(
  // string | ID or name of the Org
  "org_identifier_example" , 
  // UpdateOrgRequest (optional)
  {
    name: "name_example",
    description: "description_example",
    user_identifiers: [
      "user_identifiers_example",
    ],
    group_identifiers: [
      "group_identifiers_example",
    ],
    operation: "ADD",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateOrgRequest** | **UpdateOrgRequest**|  |
 **orgIdentifier** | [**string**] | ID or name of the Org | defaults to undefined


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
**204** | Organization successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

