# ThoughtSpot.Client.Api.AuthenticationApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ConfigureAuthSettings**](AuthenticationApi.md#configureauthsettings) | **POST** /api/rest/2.0/auth/configure |  |
| [**GetCurrentUserInfo**](AuthenticationApi.md#getcurrentuserinfo) | **GET** /api/rest/2.0/auth/session/user |  |
| [**GetCurrentUserToken**](AuthenticationApi.md#getcurrentusertoken) | **GET** /api/rest/2.0/auth/session/token |  |
| [**GetCustomAccessToken**](AuthenticationApi.md#getcustomaccesstoken) | **POST** /api/rest/2.0/auth/token/custom |  |
| [**GetFullAccessToken**](AuthenticationApi.md#getfullaccesstoken) | **POST** /api/rest/2.0/auth/token/full |  |
| [**GetObjectAccessToken**](AuthenticationApi.md#getobjectaccesstoken) | **POST** /api/rest/2.0/auth/token/object |  |
| [**Login**](AuthenticationApi.md#login) | **POST** /api/rest/2.0/auth/session/login |  |
| [**Logout**](AuthenticationApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout |  |
| [**RevokeToken**](AuthenticationApi.md#revoketoken) | **POST** /api/rest/2.0/auth/token/revoke |  |
| [**SearchAuthSettings**](AuthenticationApi.md#searchauthsettings) | **POST** /api/rest/2.0/auth/search |  |
| [**ValidateToken**](AuthenticationApi.md#validatetoken) | **POST** /api/rest/2.0/auth/token/validate |  |

<a id="configureauthsettings"></a>
# **ConfigureAuthSettings**
> void ConfigureAuthSettings (ConfigureAuthSettingsRequest configureAuthSettingsRequest)



  Version: 26.6.0.cl or later   Enables or disables authentication at cluster or org level for the specified auth type. Currently supports `TRUSTED_AUTH`.  #### Required privileges  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` privilege is required.  #### Usage guidelines  Use `cluster_preferences` to enable or disable authentication at the cluster level. Cluster-level settings can only be configured from the Primary Org. - `ENABLED` — Generates a new access token if one does not exist. An existing token is preserved. - `DISABLED` — Revokes the existing cluster-level access token.  Use `org_preferences` to enable or disable authentication for one or more Orgs. Each entry must include an `org_identifier` (unique ID or name) and an `auth_status`. Org-level configuration requires the per-Org authentication feature to be enabled on your instance. - `ENABLED` — Generates a new org-level access token if one does not exist. - `DISABLED` — Revokes the existing org-level access token for that Org.  Both `cluster_preferences` and `org_preferences` are optional. Omitting a field leaves the corresponding settings unchanged. If both are omitted, the API returns `204 No Content` without making any changes.  **Note**: Cluster-level and org-level settings are independent of each other. Enabling or disabling one does not affect the other.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class ConfigureAuthSettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var configureAuthSettingsRequest = new ConfigureAuthSettingsRequest(); // ConfigureAuthSettingsRequest | 

            try
            {
                apiInstance.ConfigureAuthSettings(configureAuthSettingsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.ConfigureAuthSettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConfigureAuthSettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ConfigureAuthSettingsWithHttpInfo(configureAuthSettingsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.ConfigureAuthSettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configureAuthSettingsRequest** | [**ConfigureAuthSettingsRequest**](ConfigureAuthSettingsRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Trusted authentication settings configured successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcurrentuserinfo"></a>
# **GetCurrentUserInfo**
> User GetCurrentUserInfo ()



  Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user's privilege and object access permissions.  **NOTE**: In ThoughtSpot, users with cluster administration privileges can access all Orgs by default. However, unless the administrator is explicitly added to an Org, the Orgs list in the session information returned by the API will include only the Primary Org. To include other Orgs in the API response, you must explicitly add the administrator to each Org in the Admin settings page in the UI or via user REST API.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class GetCurrentUserInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);

            try
            {
                User result = apiInstance.GetCurrentUserInfo();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.GetCurrentUserInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCurrentUserInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<User> response = apiInstance.GetCurrentUserInfoWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetCurrentUserInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch current session user detail successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcurrentusertoken"></a>
# **GetCurrentUserToken**
> GetTokenResponse GetCurrentUserToken ()



  Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class GetCurrentUserTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);

            try
            {
                GetTokenResponse result = apiInstance.GetCurrentUserToken();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.GetCurrentUserToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCurrentUserTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<GetTokenResponse> response = apiInstance.GetCurrentUserTokenWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetCurrentUserTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**GetTokenResponse**](GetTokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching token for current user successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcustomaccesstoken"></a>
# **GetCustomAccessToken**
> AccessToken GetCustomAccessToken (GetCustomAccessTokenRequest getCustomAccessTokenRequest)



  Version: 10.4.0.cl or later   Creates an authentication token that provides values for the formula variables in the Row Level Security (RLS) rules for a given user. Recommended for use cases that require Attribute-based access control (ABAC) via RLS.  #### Required privileges  To add a new user and assign privileges during auto-creation, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source are required.  To configure formula variables for all Orgs on your instance or the Primary Org, cluster administration privileges are required. Org administrators can configure formula variables for their respective Orgs. If Role-Based Access Control (RBAC) is enabled, users with the `CAN_MANAGE_VARIABLES` (**Can manage variables**) role privilege can also create and manage variables for their Org context.  #### Usage guidelines  You can generate a token by providing a `username` and `password`, or by using a `secret_key`. To generate a `secret_key`, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: * When both `password` and `secret_key` are included in the API request, `password` takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with `username`  and `password` returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### ABAC via RLS  To implement ABAC via RLS and assign security entitlements to users during session creation, generate a token with custom variable values. The values set in the authentication token are applied to the formula variables referenced in RLS rules at the table level, which determines the data each user can access based on their entitlements.  The variable values can be configured to persist for a specific set of Models in user sessions initiated with the token, allowing different RLS rules to be set for different data models. Once defined, the rules are added to the user's `variable_values` object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/abac-via-rls-variables).  ##### Formula variables Before defining variable values, ensure the variables are created and available on your instance. To create a formula variable, you can use the **Create variable** (`/api/rest/2.0/template/variables/create`) REST API endpoint, with the variable `type` set as `Formula_Variable` in the API request.  The API doesn't support `\"persist_option\": \"RESET\"` and `\"persist_option\": \"NONE\"` when `variable_values` are defined  in the request. If you are using `variable_values` for token generation, you must use other supported persist options such as `APPEND` or `REPLACE`.  If you want to use `RESET` or `NONE`, do not pass any `variable_values`. In such cases, `variable_values` will remain unaffected.  #### Supported objects  The supported object type is `LOGICAL_TABLE`. When using `object_id` with `variable_values`, models are supported.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the username does not exist in ThoughtSpot. If the username already exists in ThoughtSpot and `auto_create` is set to `true`, user properties such as display name, email, Org and group entitlements will not be updated with new values. Setting `auto_create` to `true` does not create formula variables. Hence, this setting will not be applicable to `variable_values`.  #### Important point to note All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as `APPEND` and `REPLACE` will persist `variable_values` on the user profile when the token is created.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class GetCustomAccessTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var getCustomAccessTokenRequest = new GetCustomAccessTokenRequest(); // GetCustomAccessTokenRequest | 

            try
            {
                AccessToken result = apiInstance.GetCustomAccessToken(getCustomAccessTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.GetCustomAccessToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCustomAccessTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AccessToken> response = apiInstance.GetCustomAccessTokenWithHttpInfo(getCustomAccessTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetCustomAccessTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getCustomAccessTokenRequest** | [**GetCustomAccessTokenRequest**](GetCustomAccessTokenRequest.md) |  |  |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ABAC token creation was successful. |  -  |
| **400** | Invalid request. This could be due to missing or incorrect parameters. |  -  |
| **401** | Unauthorized access. The request could not be authenticated. |  -  |
| **403** | Forbidden access. The user does not have permission to access this resource. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getfullaccesstoken"></a>
# **GetFullAccessToken**
> Token GetFullAccessToken (GetFullAccessTokenRequest getFullAccessTokenRequest)



  Version: 9.0.0.cl or later   Generates an authentication token for creating a full session in ThoughtSpot for a given user. Recommended for use cases that do not require Attribute-based access control (ABAC) via Row Level Security (RLS).  #### Usage guidelines  You can generate a token for a user by providing a `username` and `password`, or by using the `secret_key` generated for your instance. To generate a `secret_key`, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: * When both `password` and `secret_key` are included in the API request, `password` takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with `username` and `password` returns an error. You can switch to token-based authentication with  `secret_key` or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `true` if the username does not exist in ThoughtSpot. If the user already exists in ThoughtSpot and `auto_create` is set to `true`, user properties such as display name, email and group assignment will be updated.  To add a new user and assign privileges during auto-creation, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class GetFullAccessTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var getFullAccessTokenRequest = new GetFullAccessTokenRequest(); // GetFullAccessTokenRequest | 

            try
            {
                Token result = apiInstance.GetFullAccessToken(getFullAccessTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.GetFullAccessToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetFullAccessTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Token> response = apiInstance.GetFullAccessTokenWithHttpInfo(getFullAccessTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetFullAccessTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getFullAccessTokenRequest** | [**GetFullAccessTokenRequest**](GetFullAccessTokenRequest.md) |  |  |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bearer auth token creation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getobjectaccesstoken"></a>
# **GetObjectAccessToken**
> Token GetObjectAccessToken (GetObjectAccessTokenRequest getObjectAccessTokenRequest)



  Version: 9.0.0.cl or later   Generates an authentication token that provides access to a specific metadata object. This object list is intersected with the list of objects the user is allowed to access via group membership. For more information, see [Object security](https://docs.thoughtspot.com/cloud/latest/security-data-object#object_security).  #### Usage guidelines  You can generate a token for a user by providing a `username` and `password`, or by using the `secret_key` generated for your instance. To generate a `secret_key`, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: * When both `password` and `secret_key` are included in the API request, `password` takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with `username` and `password` returns an error. You can switch to token-based authentication with `secret_key` or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, user properties such as display name, email, and group assignment will be updated.  To add a new user and assign privileges, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note  All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class GetObjectAccessTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var getObjectAccessTokenRequest = new GetObjectAccessTokenRequest(); // GetObjectAccessTokenRequest | 

            try
            {
                Token result = apiInstance.GetObjectAccessToken(getObjectAccessTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.GetObjectAccessToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetObjectAccessTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Token> response = apiInstance.GetObjectAccessTokenWithHttpInfo(getObjectAccessTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetObjectAccessTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getObjectAccessTokenRequest** | [**GetObjectAccessTokenRequest**](GetObjectAccessTokenRequest.md) |  |  |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bearer auth token creation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="login"></a>
# **Login**
> void Login (LoginRequest loginRequest)



  Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class LoginExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var loginRequest = new LoginRequest(); // LoginRequest | 

            try
            {
                apiInstance.Login(loginRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.Login: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LoginWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.LoginWithHttpInfo(loginRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.LoginWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **loginRequest** | [**LoginRequest**](LoginRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User login successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="logout"></a>
# **Logout**
> void Logout ()



  Version: 9.0.0.cl or later    Logs out a user from their current session.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class LogoutExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);

            try
            {
                apiInstance.Logout();
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.Logout: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LogoutWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.LogoutWithHttpInfo();
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.LogoutWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User logout successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="revoketoken"></a>
# **RevokeToken**
> void RevokeToken (RevokeTokenRequest revokeTokenRequest)



  Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class RevokeTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var revokeTokenRequest = new RevokeTokenRequest(); // RevokeTokenRequest | 

            try
            {
                apiInstance.RevokeToken(revokeTokenRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.RevokeToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RevokeTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.RevokeTokenWithHttpInfo(revokeTokenRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.RevokeTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **revokeTokenRequest** | [**RevokeTokenRequest**](RevokeTokenRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Token successfully revoked. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchauthsettings"></a>
# **SearchAuthSettings**
> SearchAuthSettingsResponse SearchAuthSettings (SearchAuthSettingsRequest searchAuthSettingsRequest)



  Version: 26.6.0.cl or later   Returns the authentication configuration for the specified auth type at cluster and org level. Currently supports `TRUSTED_AUTH`.  #### Required privileges  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` privilege is required.  #### Usage guidelines  Use `scope` to control which level of settings are returned: - `CLUSTER` — Returns cluster-level authentication status and access tokens. Accessible only from the Primary Org. - `ORG` — Returns org-level authentication status and access tokens for the current Org. Requires the per-Org authentication feature to be enabled on your instance. - If `scope` is omitted, both cluster and org-level settings are returned based on the caller's org context and feature availability.  The `access_tokens` array in `cluster_preferences` or `org_preferences` is omitted when no token is configured at that level.  **Note**: Access tokens returned in the response are sensitive credentials. Treat them with the same care as passwords.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class SearchAuthSettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var searchAuthSettingsRequest = new SearchAuthSettingsRequest(); // SearchAuthSettingsRequest | 

            try
            {
                SearchAuthSettingsResponse result = apiInstance.SearchAuthSettings(searchAuthSettingsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.SearchAuthSettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchAuthSettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SearchAuthSettingsResponse> response = apiInstance.SearchAuthSettingsWithHttpInfo(searchAuthSettingsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.SearchAuthSettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchAuthSettingsRequest** | [**SearchAuthSettingsRequest**](SearchAuthSettingsRequest.md) |  |  |

### Return type

[**SearchAuthSettingsResponse**](SearchAuthSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication settings retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="validatetoken"></a>
# **ValidateToken**
> TokenValidationResponse ValidateToken (ValidateTokenRequest validateTokenRequest)



  Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class ValidateTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new AuthenticationApi(httpClient, config, httpClientHandler);
            var validateTokenRequest = new ValidateTokenRequest(); // ValidateTokenRequest | 

            try
            {
                TokenValidationResponse result = apiInstance.ValidateToken(validateTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthenticationApi.ValidateToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ValidateTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<TokenValidationResponse> response = apiInstance.ValidateTokenWithHttpInfo(validateTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.ValidateTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **validateTokenRequest** | [**ValidateTokenRequest**](ValidateTokenRequest.md) |  |  |

### Return type

[**TokenValidationResponse**](TokenValidationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token validation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

