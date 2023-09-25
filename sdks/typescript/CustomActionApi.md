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

  Version: 9.6.0.cl or later  Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, CustomActionApi, CreateCustomActionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new CustomActionApi(configuration);

apiInstance.createCustomAction(
  // CreateCustomActionRequest
  {
    name: "name_example",
    action_details: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          API_Key: {
            key: "key_example",
            value: "value_example",
          },
          Basic_Auth: {
            password: "password_example",
            username: "username_example",
          },
          Bearer_Token: "Bearer_Token_example",
          No_Auth: "No_Auth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
        reference: "reference_example",
      },
    },
    associate_metadata: [
      {
        action_config: {
          position: "MENU",
          visibility: true,
        },
        identifier: "identifier_example",
        type: "VISUALIZATION",
      },
    ],
    default_action_config: {
      visibility: true,
    },
    group_identifiers: [
      "group_identifiers_example",
    ],
  } 
).then((data:any) => {
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

  Version: 9.6.0.cl or later  Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, CustomActionApi, DeleteCustomActionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new CustomActionApi(configuration);

apiInstance.deleteCustomAction(
  // string | Unique ID or name of the custom action.
  "custom_action_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customActionIdentifier** | [**string**] | Unique ID or name of the custom action. | defaults to undefined


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

  Version: 9.6.0.cl or later  Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, CustomActionApi, SearchCustomActionsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new CustomActionApi(configuration);

apiInstance.searchCustomActions(
  // SearchCustomActionsRequest (optional)
  {
    custom_action_identifier: "custom_action_identifier_example",
    name_pattern: "name_pattern_example",
    default_action_config: {
      visibility: true,
    },
    include_group_associations: false,
    include_metadata_associations: false,
    metadata: [
      {
        type: "VISUALIZATION",
        identifier: "identifier_example",
      },
    ],
    type: "CALLBACK",
  } 
).then((data:any) => {
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

  Version: 9.6.0.cl or later  Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, CustomActionApi, UpdateCustomActionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new CustomActionApi(configuration);

apiInstance.updateCustomAction(
  // string | Unique ID or name of the custom action.
  "custom_action_identifier_example" , 
  // UpdateCustomActionRequest (optional)
  {
    action_details: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          API_Key: {
            key: "key_example",
            value: "value_example",
          },
          Basic_Auth: {
            password: "password_example",
            username: "username_example",
          },
          Bearer_Token: "Bearer_Token_example",
          No_Auth: "No_Auth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
        reference: "reference_example",
      },
    },
    associate_metadata: [
      {
        action_config: {
          position: "MENU",
          visibility: true,
        },
        identifier: "identifier_example",
        type: "VISUALIZATION",
      },
    ],
    default_action_config: {
      visibility: true,
    },
    group_identifiers: [
      "group_identifiers_example",
    ],
    name: "name_example",
    operation: "ADD",
  } 
).then((data:any) => {
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

