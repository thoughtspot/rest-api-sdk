/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AccessToken;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.GetCustomAccessTokenRequest;
import com.thoughtspot.client.model.GetFullAccessTokenRequest;
import com.thoughtspot.client.model.GetObjectAccessTokenRequest;
import com.thoughtspot.client.model.GetTokenResponse;
import com.thoughtspot.client.model.LoginRequest;
import com.thoughtspot.client.model.RevokeTokenRequest;
import com.thoughtspot.client.model.Token;
import com.thoughtspot.client.model.TokenValidationResponse;
import com.thoughtspot.client.model.User;
import com.thoughtspot.client.model.ValidateTokenRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     *   Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user&#39;s privilege and object access permissions.     
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserInfoTest() throws ApiException {
        User response = api.getCurrentUserInfo();
        // TODO: test validations
    }

    /**
     *   Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserTokenTest() throws ApiException {
        GetTokenResponse response = api.getCurrentUserToken();
        // TODO: test validations
    }

    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you&#39;ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60;.  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable) in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (&#x60;username&#x60;  and &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with  &#x60;secret_key&#x60;  or contact ThoughtSpot Support for assistance.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the &#x60;filter_rules&#x60; and &#x60;parameter_values&#x60; array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user&#39;s &#x60;access_control_properties&#x60; object, after which all sessions will use the persisted values.  Specify the object type as &#x60;LOGICAL_TABLE&#x60;.   For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60;  Set &#x60;auto_create&#x60; to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60; in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values. If &#x60;auto_create&#x60; is set to &#x60;true&#x60;, it won&#39;t create formula variables and hence won&#39;t be applicable for &#x60;variable_values&#x60;.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created. Persist options such as  &#x60;APPEND&#x60;, &#x60;REPLACE&#x60;, &#x60;RESET&#x60; will persist security parameters on the user profile when the token is created, while Persist option &#x60;NONE&#x60; will not persist anything but will be honoured in the session.  ##### Formula Variables Before using variables_values, variables must be created using Create Variable API with type as Formula_Variable (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used when variable_values are provided in the request. If you are working with variable_values, you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do not pass any variable_values. In such cases, variable_values will remain unaffected. When using object_id with variable_values, models are supported.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomAccessTokenTest() throws ApiException {
        GetCustomAccessTokenRequest getCustomAccessTokenRequest = null;
        AccessToken response = api.getCustomAccessToken(getCustomAccessTokenRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60; (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (&#x60;username&#x60;  and &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with  &#x60;secret_key&#x60;  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60;  Set &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60;, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullAccessTokenTest() throws ApiException {
        GetFullAccessTokenRequest getFullAccessTokenRequest = null;
        Token response = api.getFullAccessToken(getFullAccessTokenRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s &#x60;secret key&#x60; (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,  &#x60;password&#x60; takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (&#x60;username&#x60;  and &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with  &#x60;secret_key&#x60;  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60;  Set &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60;, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getObjectAccessTokenTest() throws ApiException {
        GetObjectAccessTokenRequest getObjectAccessTokenRequest = null;
        Token response = api.getObjectAccessToken(getObjectAccessTokenRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (&#x60;username&#x60;  and &#x60;password&#x60; ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginRequest loginRequest = null;
        api.login(loginRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        api.logout();
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeTokenTest() throws ApiException {
        RevokeTokenRequest revokeTokenRequest = null;
        api.revokeToken(revokeTokenRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateTokenTest() throws ApiException {
        ValidateTokenRequest validateTokenRequest = null;
        TokenValidationResponse response = api.validateToken(validateTokenRequest);
        // TODO: test validations
    }

}
