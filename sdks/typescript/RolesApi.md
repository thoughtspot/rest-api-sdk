# ThoughtSpotRestApiSdk.RolesApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RolesApi.md#createRole) | **POST** /api/rest/2.0/roles/create | 
[**deleteRole**](RolesApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete | 
[**searchRoles**](RolesApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search | 
[**updateRole**](RolesApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update | 


# **createRole**
> RoleResponse createRole(createRoleRequest)

Creates a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later

### Example


```typescript
import { createBearerAuthenticationConfig, RolesApi, CreateRoleRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new RolesApi(configuration);

apiInstance.createRole(
  // CreateRoleRequest
  {
    name: "name_example",
    description: "description_example",
    privileges: [
      "USERDATAUPLOADING",
    ],
  } 
).then((data:any) => {
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

Deletes a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later

### Example


```typescript
import { createBearerAuthenticationConfig, RolesApi, DeleteRoleRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new RolesApi(configuration);

apiInstance.deleteRole(
  // string | Unique ID or name of the role.
  "role_identifier_example" 
).then((data:any) => {
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

Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges. /n  Version: 9.5.0.cl or later

### Example


```typescript
import { createBearerAuthenticationConfig, RolesApi, SearchRolesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new RolesApi(configuration);

apiInstance.searchRoles(
  // SearchRolesRequest (optional)
  {
    role_identifiers: [
      "role_identifiers_example",
    ],
    org_identifiers: [
      "org_identifiers_example",
    ],
    group_identifiers: [
      "group_identifiers_example",
    ],
    privileges: [
      "UNKNOWN",
    ],
    deprecated: true,
    external: true,
    shared_via_connection: true,
    permissions: [
      "READ_ONLY",
    ],
  } 
).then((data:any) => {
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

Updates a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later

### Example


```typescript
import { createBearerAuthenticationConfig, RolesApi, UpdateRoleRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new RolesApi(configuration);

apiInstance.updateRole(
  // string | Unique ID or name of the role.
  "role_identifier_example" , 
  // UpdateRoleRequest
  {
    name: "name_example",
    description: "description_example",
    privileges: [
      "USERDATAUPLOADING",
    ],
  } 
).then((data:any) => {
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

