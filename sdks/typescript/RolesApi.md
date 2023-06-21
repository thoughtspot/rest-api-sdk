# ThoughtSpotRestApiSdk.RolesApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RolesApi.md#createRole) | **POST** /api/rest/2.0/roles/create | 
[**deleteRole**](RolesApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete | 
[**searchRoles**](RolesApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search | 
[**updateRole**](RolesApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update | 


# **createRole**
> RoleResponse createRole(createRoleRequest)

Creates a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.RolesApi(configuration);

let body:ThoughtSpotRestApiSdk.RolesApiCreateRoleRequest = {
  // CreateRoleRequest
  createRoleRequest: {
    name: "name_example",
    description: "description_example",
    privileges: [
      "USERDATAUPLOADING",
    ],
  },
};

apiInstance.createRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRoleRequest** | **CreateRoleRequest**|  |


### Return type

**RoleResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Role successfully created. |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteRole**
> void deleteRole()

Deletes a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.RolesApi(configuration);

let body:ThoughtSpotRestApiSdk.RolesApiDeleteRoleRequest = {
  // string | Unique ID or name of the role.
  roleIdentifier: "role_identifier_example",
};

apiInstance.deleteRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleIdentifier** | [**string**] | Unique ID or name of the role. | defaults to undefined


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
**204** | Role successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchRoles**
> Array<SearchRoleResponse> searchRoles()

Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.RolesApi(configuration);

let body:ThoughtSpotRestApiSdk.RolesApiSearchRolesRequest = {
  // SearchRolesRequest (optional)
  searchRolesRequest: {
    roleIdentifiers: [
      "roleIdentifiers_example",
    ],
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    privileges: [
      "UNKNOWN",
    ],
    deprecated: true,
    external: true,
    sharedViaConnection: true,
    permissions: [
      "READ_ONLY",
    ],
  },
};

apiInstance.searchRoles(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRolesRequest** | **SearchRolesRequest**|  |


### Return type

**Array<SearchRoleResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Roles search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateRole**
> RoleResponse updateRole(updateRoleRequest)

Updates a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.RolesApi(configuration);

let body:ThoughtSpotRestApiSdk.RolesApiUpdateRoleRequest = {
  // string | Unique ID or name of the role.
  roleIdentifier: "role_identifier_example",
  // UpdateRoleRequest
  updateRoleRequest: {
    name: "name_example",
    description: "description_example",
    privileges: [
      "USERDATAUPLOADING",
    ],
  },
};

apiInstance.updateRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateRoleRequest** | **UpdateRoleRequest**|  |
 **roleIdentifier** | [**string**] | Unique ID or name of the role. | defaults to undefined


### Return type

**RoleResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Role successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

