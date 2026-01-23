# SystemApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**configureCommunicationChannelPreferences**](SystemApi.md#configureCommunicationChannelPreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/configure |
| [**configureSecuritySettings**](SystemApi.md#configureSecuritySettings) | **POST** /api/rest/2.0/system/security-settings/configure |
| [**getSystemConfig**](SystemApi.md#getSystemConfig) | **GET** /api/rest/2.0/system/config |
| [**getSystemInformation**](SystemApi.md#getSystemInformation) | **GET** /api/rest/2.0/system |
| [**getSystemOverrideInfo**](SystemApi.md#getSystemOverrideInfo) | **GET** /api/rest/2.0/system/config-overrides |
| [**searchCommunicationChannelPreferences**](SystemApi.md#searchCommunicationChannelPreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/search |
| [**searchSecuritySettings**](SystemApi.md#searchSecuritySettings) | **POST** /api/rest/2.0/system/security-settings/search |
| [**updateSystemConfig**](SystemApi.md#updateSystemConfig) | **POST** /api/rest/2.0/system/config-update |


<a id="configureCommunicationChannelPreferences"></a>
# **configureCommunicationChannelPreferences**
> configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest)



 Version: 10.14.0.cl or later   Configure communication channel preferences. - Use &#x60;cluster_preferences&#x60; to update the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use &#x60;org_preferences&#x60; to specify Org-specific preferences that override the defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **configureCommunicationChannelPreferencesRequest** | [**ConfigureCommunicationChannelPreferencesRequest**](ConfigureCommunicationChannelPreferencesRequest.md)

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
| **204** | Communication channel preferences successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="configureSecuritySettings"></a>
# **configureSecuritySettings**
> configureSecuritySettings(configureSecuritySettingsRequest)



 Version: 26.2.0.cl or later   Configure security settings for your ThoughtSpot application instance. - Use &#x60;cluster_preferences&#x60; to update cluster-level security settings including CORS whitelisted URLs, CSP settings, SAML redirect URLs, partitioned cookies, and non-embed access configuration. - Use &#x60;org_preferences&#x60; to configure Org-specific security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this allows configuring CORS and non-embed access settings specific to the Org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. Cluster-level SAML and script-src settings require &#x60;ADMINISTRATION&#x60; privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **configureSecuritySettingsRequest** | [**ConfigureSecuritySettingsRequest**](ConfigureSecuritySettingsRequest.md)

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
| **204** | Successfully configured the security settings. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getSystemConfig"></a>
# **getSystemConfig**
> SystemConfig getSystemConfig()



  Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires &#x60;ADMINISTRATION&#x60;(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemConfig**](SystemConfig.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster config information. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getSystemInformation"></a>
# **getSystemInformation**
> SystemInfo getSystemInformation()



  Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemInfo**](SystemInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster information. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getSystemOverrideInfo"></a>
# **getSystemOverrideInfo**
> SystemOverrideInfo getSystemOverrideInfo()



  Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemOverrideInfo**](SystemOverrideInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster configuration which can be overridden. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchCommunicationChannelPreferences"></a>
# **searchCommunicationChannelPreferences**
> CommunicationChannelPreferencesResponse searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest)



 Version: 10.14.0.cl or later   Fetch communication channel preferences. - Use &#x60;cluster_preferences&#x60; to fetch the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use &#x60;org_preferences&#x60; to fetch any Org-specific preferences that override the defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCommunicationChannelPreferencesRequest** | [**SearchCommunicationChannelPreferencesRequest**](SearchCommunicationChannelPreferencesRequest.md)

### Return type

[**CommunicationChannelPreferencesResponse**](CommunicationChannelPreferencesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Communication channel preferences retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchSecuritySettings"></a>
# **searchSecuritySettings**
> SecuritySettingsResponse searchSecuritySettings(searchSecuritySettingsRequest)



 Version: 26.2.0.cl or later   Fetch security settings for your ThoughtSpot application instance. - Use &#x60;scope: CLUSTER&#x60; to retrieve cluster-level security settings, including CORS and CSP allowlists, SAML redirect URLs, and settings that control access to non-embedded pages. - Use &#x60;scope: ORG&#x60; to retrieve Org-level security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this returns CORS and non-embed access settings specific to the Org. - If &#x60;scope&#x60; is not specified, returns both cluster and Org-specific settings based on user privileges.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchSecuritySettingsRequest** | [**SearchSecuritySettingsRequest**](SearchSecuritySettingsRequest.md)

### Return type

[**SecuritySettingsResponse**](SecuritySettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of security settings. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateSystemConfig"></a>
# **updateSystemConfig**
> updateSystemConfig(updateSystemConfigRequest)



  Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateSystemConfigRequest** | [**UpdateSystemConfigRequest**](UpdateSystemConfigRequest.md)

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
| **204** | Configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

