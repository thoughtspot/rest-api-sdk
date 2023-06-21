# ThoughtSpotRestApiSdk.CustomActionApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomAction**](CustomActionApi.md#createCustomAction) | **POST** /api/rest/2.0/customization/custom-actions | 
[**deleteCustomAction**](CustomActionApi.md#deleteCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete | 
[**searchCustomActions**](CustomActionApi.md#searchCustomActions) | **POST** /api/rest/2.0/customization/custom-actions/search | 
[**updateCustomAction**](CustomActionApi.md#updateCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update | 


# **createCustomAction**
> ResponseCustomAction createCustomAction(createCustomActionRequest)

Create a custom action  Equivalent to POST /customization/custom-actions <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.CustomActionApi(configuration);

let body:ThoughtSpotRestApiSdk.CustomActionApiCreateCustomActionRequest = {
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

# **deleteCustomAction**
> void deleteCustomAction()

Deletes a custom action from the current organization  Equivalent to DELETE /customization/custom-actions/{custom_action_identifier} <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.CustomActionApi(configuration);

let body:ThoughtSpotRestApiSdk.CustomActionApiDeleteCustomActionRequest = {
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

# **searchCustomActions**
> Array<ResponseCustomAction> searchCustomActions()

Search custom actions  Equivalent to POST /customization/custom-actions/search <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.CustomActionApi(configuration);

let body:ThoughtSpotRestApiSdk.CustomActionApiSearchCustomActionsRequest = {
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

# **updateCustomAction**
> void updateCustomAction()

Update a custom action for the current organization. Equivalent to PUT /customization/custom-actions/{custom_action_identifier} <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.CustomActionApi(configuration);

let body:ThoughtSpotRestApiSdk.CustomActionApiUpdateCustomActionRequest = {
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

