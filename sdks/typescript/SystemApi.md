# ThoughtSpotRestApiSdk.SystemApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureCommunicationChannelPreferences**](SystemApi.md#configureCommunicationChannelPreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/configure | 
[**getSystemConfig**](SystemApi.md#getSystemConfig) | **GET** /api/rest/2.0/system/config | 
[**getSystemInformation**](SystemApi.md#getSystemInformation) | **GET** /api/rest/2.0/system | 
[**getSystemOverrideInfo**](SystemApi.md#getSystemOverrideInfo) | **GET** /api/rest/2.0/system/config-overrides | 
[**searchCommunicationChannelPreferences**](SystemApi.md#searchCommunicationChannelPreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/search | 
[**updateSystemConfig**](SystemApi.md#updateSystemConfig) | **POST** /api/rest/2.0/system/config-update | 


# **configureCommunicationChannelPreferences**
> void configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest)

 Version: 10.14.0.cl or later   Configure communication channel preferences. - Use `cluster_preferences` to update the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to specify Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      

### Example


```typescript
import { createBearerAuthenticationConfig, SystemApi, ConfigureCommunicationChannelPreferencesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SystemApi(configuration);

apiInstance.configureCommunicationChannelPreferences(
  // ConfigureCommunicationChannelPreferencesRequest
  {
    cluster_preferences: [
      {
        event_type: "LIVEBOARD_SCHEDULE",
        channels: [
          "EMAIL",
        ],
      },
    ],
    org_preferences: [
      {
        org_identifier: "org_identifier_example",
        operation: "REPLACE",
        preferences: [
          {
            event_type: "LIVEBOARD_SCHEDULE",
            channels: [
              "EMAIL",
            ],
          },
        ],
        reset_events: [
          "LIVEBOARD_SCHEDULE",
        ],
      },
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configureCommunicationChannelPreferencesRequest** | **ConfigureCommunicationChannelPreferencesRequest**|  |


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
**204** | Communication channel preferences successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSystemConfig**
> SystemConfig getSystemConfig()

  Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      

### Example


```typescript
import { createBearerAuthenticationConfig, SystemApi, GetSystemConfigRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SystemApi(configuration);

apiInstance.getSystemConfig().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**SystemConfig**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster config information. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSystemInformation**
> SystemInfo getSystemInformation()

  Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Example


```typescript
import { createBearerAuthenticationConfig, SystemApi, GetSystemInformationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SystemApi(configuration);

apiInstance.getSystemInformation().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**SystemInfo**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster information. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSystemOverrideInfo**
> SystemOverrideInfo getSystemOverrideInfo()

  Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Example


```typescript
import { createBearerAuthenticationConfig, SystemApi, GetSystemOverrideInfoRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SystemApi(configuration);

apiInstance.getSystemOverrideInfo().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**SystemOverrideInfo**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster configuration which can be overridden. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchCommunicationChannelPreferences**
> CommunicationChannelPreferencesResponse searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest)

 Version: 10.14.0.cl or later   Fetch communication channel preferences. - Use `cluster_preferences` to fetch the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to fetch any Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      

### Example


```typescript
import { createBearerAuthenticationConfig, SystemApi, SearchCommunicationChannelPreferencesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SystemApi(configuration);

apiInstance.searchCommunicationChannelPreferences(
  // SearchCommunicationChannelPreferencesRequest
  {
    cluster_preferences: [
      "LIVEBOARD_SCHEDULE",
    ],
    org_preferences: [
      {
        org_identifier: "org_identifier_example",
        event_types: [
          "LIVEBOARD_SCHEDULE",
        ],
      },
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCommunicationChannelPreferencesRequest** | **SearchCommunicationChannelPreferencesRequest**|  |


### Return type

**CommunicationChannelPreferencesResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Communication channel preferences retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateSystemConfig**
> void updateSystemConfig(updateSystemConfigRequest)

  Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.      

### Example


```typescript
import { createBearerAuthenticationConfig, SystemApi, UpdateSystemConfigRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SystemApi(configuration);

apiInstance.updateSystemConfig(
  // UpdateSystemConfigRequest
  {
    configuration: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSystemConfigRequest** | **UpdateSystemConfigRequest**|  |


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
**204** | Configuration successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

