# ThoughtSpotRestApiSdk.Class950ClApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomAction**](Class950ClApi.md#createCustomAction) | **POST** /api/rest/2.0/customization/custom-actions | 
[**createRole**](Class950ClApi.md#createRole) | **POST** /api/rest/2.0/roles/create | 
[**deleteCustomAction**](Class950ClApi.md#deleteCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete | 
[**deleteRole**](Class950ClApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete | 
[**searchCustomActions**](Class950ClApi.md#searchCustomActions) | **POST** /api/rest/2.0/customization/custom-actions/search | 
[**searchRoles**](Class950ClApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search | 
[**updateCustomAction**](Class950ClApi.md#updateCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update | 
[**updateRole**](Class950ClApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update | 


# **createCustomAction**
> ResponseCustomAction createCustomAction(createCustomActionRequest)

Create a custom action  Equivalent to POST /customization/custom-actions <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiCreateCustomActionRequest = {
  // CreateCustomActionRequest
  createCustomActionRequest: {
    name: "name_example",
    actionDetails: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          aPIKey: {
            key: "key_example",
            value: "value_example",
          },
          basicAuth: {
            password: "password_example",
            username: "username_example",
          },
          bearerToken: "bearerToken_example",
          noAuth: "noAuth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
      },
    },
    associateMetadata: [
      {
        actionConfig: {
          position: "position_example",
          visibility: true,
        },
        identifier: "identifier_example",
        type: "type_example",
      },
    ],
    defaultActionConfig: {
      visibility: true,
    },
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
  },
};

apiInstance.createCustomAction(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCustomActionRequest** | **CreateCustomActionRequest**|  |


### Return type

**ResponseCustomAction**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom action created successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createRole**
> RoleResponse createRole(createRoleRequest)

Creates a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiCreateRoleRequest = {
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

# **deleteCustomAction**
> void deleteCustomAction()

Deletes a custom action from the current organization  Equivalent to DELETE /customization/custom-actions/{custom_action_identifier} <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiDeleteCustomActionRequest = {
  // string | Unique ID or name of the Custom action.
  customActionIdentifier: "custom_action_identifier_example",
};

apiInstance.deleteCustomAction(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customActionIdentifier** | [**string**] | Unique ID or name of the Custom action. | defaults to undefined


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
**204** | Custom action is successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteRole**
> void deleteRole()

Deletes a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiDeleteRoleRequest = {
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

# **searchCustomActions**
> Array<ResponseCustomAction> searchCustomActions()

Search custom actions  Equivalent to POST /customization/custom-actions/search <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiSearchCustomActionsRequest = {
  // SearchCustomActionsRequest (optional)
  searchCustomActionsRequest: {
    customActionIdentifier: "customActionIdentifier_example",
    defaultActionConfig: {
      visibility: true,
    },
    includeGroupAssociations: true,
    includeMetadataAssociations: true,
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    type: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          aPIKey: {
            key: "key_example",
            value: "value_example",
          },
          basicAuth: {
            password: "password_example",
            username: "username_example",
          },
          bearerToken: "bearerToken_example",
          noAuth: "noAuth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
      },
    },
  },
};

apiInstance.searchCustomActions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCustomActionsRequest** | **SearchCustomActionsRequest**|  |


### Return type

**Array<ResponseCustomAction>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom action search is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchRoles**
> Array<SearchRoleResponse> searchRoles()

Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiSearchRolesRequest = {
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

# **updateCustomAction**
> void updateCustomAction()

Update a custom action for the current organization. Equivalent to PUT /customization/custom-actions/{custom_action_identifier} <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiUpdateCustomActionRequest = {
  // string | Unique ID or name of the custom action.
  customActionIdentifier: "custom_action_identifier_example",
  // UpdateCustomActionRequest (optional)
  updateCustomActionRequest: {
    actionDetails: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          aPIKey: {
            key: "key_example",
            value: "value_example",
          },
          basicAuth: {
            password: "password_example",
            username: "username_example",
          },
          bearerToken: "bearerToken_example",
          noAuth: "noAuth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
      },
    },
    associateMetadata: [
      {
        actionConfig: {
          position: "position_example",
          visibility: true,
        },
        identifier: "identifier_example",
        type: "type_example",
      },
    ],
    defaultActionConfig: {
      visibility: true,
    },
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    name: "name_example",
  },
};

apiInstance.updateCustomAction(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustomActionRequest** | **UpdateCustomActionRequest**|  |
 **customActionIdentifier** | [**string**] | Unique ID or name of the custom action. | defaults to undefined


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
**204** | Custom action updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateRole**
> RoleResponse updateRole(updateRoleRequest)

Updates a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class950ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class950ClApiUpdateRoleRequest = {
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

