# ThoughtSpotRestApiSdk.AuthenticationApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUserInfo**](AuthenticationApi.md#getCurrentUserInfo) | **GET** /api/rest/2.0/auth/session/user | 
[**getCurrentUserToken**](AuthenticationApi.md#getCurrentUserToken) | **GET** /api/rest/2.0/auth/session/token | 
[**getCustomAccessToken**](AuthenticationApi.md#getCustomAccessToken) | **POST** /api/rest/2.0/auth/token/custom | 
[**getFullAccessToken**](AuthenticationApi.md#getFullAccessToken) | **POST** /api/rest/2.0/auth/token/full | 
[**getObjectAccessToken**](AuthenticationApi.md#getObjectAccessToken) | **POST** /api/rest/2.0/auth/token/object | 
[**login**](AuthenticationApi.md#login) | **POST** /api/rest/2.0/auth/session/login | 
[**logout**](AuthenticationApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout | 
[**revokeToken**](AuthenticationApi.md#revokeToken) | **POST** /api/rest/2.0/auth/token/revoke | 
[**validateToken**](AuthenticationApi.md#validateToken) | **POST** /api/rest/2.0/auth/token/validate | 


# **getCurrentUserInfo**
> User getCurrentUserInfo()

  Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.     

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, GetCurrentUserInfoRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.getCurrentUserInfo().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**User**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetch current session user detail successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getCurrentUserToken**
> GetTokenResponse getCurrentUserToken()

  Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, GetCurrentUserTokenRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.getCurrentUserToken().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetTokenResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching token for current user successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getCustomAccessToken**
> AccessToken getCustomAccessToken(getCustomAccessTokenRequest)

  Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  Specify the object type as `LOGICAL_TABLE`.   For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values. If `auto_create` is set to `true`, it won\'t create formula variables and hence won\'t be applicable for `variable_values`.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.  ##### Formula Variables Before using variables_values, variables must be created using Create Variable API with type as Formula_Variable (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used when variable_values are provided in the request. If you are working with variable_values, you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do not pass any variable_values. In such cases, variable_values will remain unaffected. When using object_id with variable_values, models are supported.      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, GetCustomAccessTokenRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.getCustomAccessToken(
  // GetCustomAccessTokenRequest
  {
    username: "username_example",
    password: "",
    secret_key: "",
    validity_time_in_sec: 300,
    org_identifier: "org_identifier_example",
    persist_option: "REPLACE",
    filter_rules: [
      {
        column_name: "column_name_example",
        operator: "EQ",
        values: [
          {},
        ],
      },
    ],
    parameter_values: [
      {
        name: "name_example",
        values: [
          {},
        ],
      },
    ],
    objects: [
      {
        type: "LOGICAL_TABLE",
        identifier: "identifier_example",
      },
    ],
    email: "email_example",
    display_name: "display_name_example",
    groups: [
      {
        identifier: "identifier_example",
      },
    ],
    auto_create: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCustomAccessTokenRequest** | **GetCustomAccessTokenRequest**|  |


### Return type

**AccessToken**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ABAC token creation was successful. |  -  |
**400** | Invalid request. This could be due to missing or incorrect parameters. |  -  |
**401** | Unauthorized access. The request could not be authenticated. |  -  |
**403** | Forbidden access. The user does not have permission to access this resource. |  -  |
**500** | An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getFullAccessToken**
> Token getFullAccessToken(getFullAccessTokenRequest)

  Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, GetFullAccessTokenRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.getFullAccessToken(
  // GetFullAccessTokenRequest
  {
    username: "username_example",
    password: "",
    secret_key: "",
    validity_time_in_sec: 300,
    org_id: 1,
    email: "email_example",
    display_name: "display_name_example",
    auto_create: false,
    group_identifiers: [
      "group_identifiers_example",
    ],
    user_parameters: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getFullAccessTokenRequest** | **GetFullAccessTokenRequest**|  |


### Return type

**Token**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bearer auth token creation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getObjectAccessToken**
> Token getObjectAccessToken(getObjectAccessTokenRequest)

  Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, GetObjectAccessTokenRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.getObjectAccessToken(
  // GetObjectAccessTokenRequest
  {
    username: "username_example",
    object_id: "object_id_example",
    password: "",
    secret_key: "",
    validity_time_in_sec: 300,
    org_id: 1,
    email: "email_example",
    display_name: "display_name_example",
    auto_create: false,
    group_identifiers: [
      "group_identifiers_example",
    ],
    user_parameters: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getObjectAccessTokenRequest** | **GetObjectAccessTokenRequest**|  |


### Return type

**Token**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bearer auth token creation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **login**
> void login(loginRequest)

  Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, LoginRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.login(
  // LoginRequest
  {
    username: "username_example",
    password: "password_example",
    org_identifier: "org_identifier_example",
    remember_me: false,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginRequest** | **LoginRequest**|  |


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
**204** | User login successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **logout**
> void logout()

  Version: 9.0.0.cl or later    Logs out a user from their current session.      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, LogoutRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.logout().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


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
**204** | User logout successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **revokeToken**
> void revokeToken(revokeTokenRequest)

  Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, RevokeTokenRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.revokeToken(
  // RevokeTokenRequest
  {
    user_identifier: "user_identifier_example",
    token: "token_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revokeTokenRequest** | **RevokeTokenRequest**|  |


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
**204** | Token successfully revoked. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **validateToken**
> TokenValidationResponse validateToken(validateTokenRequest)

  Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example


```typescript
import { createBearerAuthenticationConfig, AuthenticationApi, ValidateTokenRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AuthenticationApi(configuration);

apiInstance.validateToken(
  // ValidateTokenRequest
  {
    token: "token_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateTokenRequest** | **ValidateTokenRequest**|  |


### Return type

**TokenValidationResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Token validation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

