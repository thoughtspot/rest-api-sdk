/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AccessToken;
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

/** API tests for AuthenticationApi */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * Version: 9.0.0.cl or later Retrieves details of the current user session for the token
     * provided in the request header. Any ThoughtSpot user can access this endpoint and send an API
     * request. The data returned in the API response varies according to user&#39;s privilege and
     * object access permissions. **NOTE**: In ThoughtSpot, users with cluster administration
     * privileges can access all Orgs by default. However, unless the administrator is explicitly
     * added to an Org, the Orgs list in the session information returned by the API will include
     * only the Primary Org. To include other Orgs in the API response, you must explicitly add the
     * administrator to each Org in the Admin settings page in the UI or via user REST API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserInfoTest() throws ApiException {
        User response = api.getCurrentUserInfo();
        // TODO: test validations
    }

    /**
     * Version: 9.4.0.cl or later Retrieves details of the current session token for the bearer
     * token provided in the request header. This API endpoint does not create a new token. Instead,
     * it returns details about the token, including the token string, creation time, expiration
     * time, and the associated user. Use this endpoint to introspect your current session token,
     * debug authentication issues, or when a frontend application needs session token details. Any
     * ThoughtSpot user with a valid bearer token can access this endpoint and send an API request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserTokenTest() throws ApiException {
        GetTokenResponse response = api.getCurrentUserToken();
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Creates an authentication token that provides values for the
     * formula variables in the Row Level Security (RLS) rules for a given user. Recommended for use
     * cases that require Attribute-based access control (ABAC) via RLS. #### Required privileges To
     * add a new user and assign privileges during auto-creation, the &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60; (**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source are required. To configure formula variables for all Orgs
     * on your instance or the Primary Org, cluster administration privileges are required. Org
     * administrators can configure formula variables for their respective Orgs. If Role-Based
     * Access Control (RBAC) is enabled, users with the &#x60;CAN_MANAGE_VARIABLES&#x60; (**Can
     * manage variables**) role privilege can also create and manage variables for their Org
     * context. #### Usage guidelines You can generate a token by providing a &#x60;username&#x60;
     * and &#x60;password&#x60;, or by using a &#x60;secret_key&#x60;. To generate a
     * &#x60;secret_key&#x60;, the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the
     * **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: * When both
     * &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. * If [Multi-Factor Authentication
     * (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your
     * instance, the API login request with &#x60;username&#x60; and &#x60;password&#x60; returns an
     * error. You can switch to token-based authentication with &#x60;secret_key&#x60; or contact
     * ThoughtSpot Support for assistance. The token obtained from ThoughtSpot is valid for 5
     * minutes by default. You can configure the token expiration time as required. #### ABAC via
     * RLS To implement ABAC via RLS and assign security entitlements to users during session
     * creation, generate a token with custom variable values. The values set in the authentication
     * token are applied to the formula variables referenced in RLS rules at the table level, which
     * determines the data each user can access based on their entitlements. The variable values can
     * be configured to persist for a specific set of Models in user sessions initiated with the
     * token, allowing different RLS rules to be set for different data models. Once defined, the
     * rules are added to the user&#39;s &#x60;variable_values&#x60; object, after which all
     * sessions will use the persisted values. For more information, see [ABAC via tokens
     * Documentation](https://developers.thoughtspot.com/docs/abac-via-rls-variables). ##### Formula
     * variables Before defining variable values, ensure the variables are created and available on
     * your instance. To create a formula variable, you can use the **Create variable**
     * (&#x60;/api/rest/2.0/template/variables/create&#x60;) REST API endpoint, with the variable
     * &#x60;type&#x60; set as &#x60;Formula_Variable&#x60; in the API request. The API doesn&#39;t
     * support &#x60;\&quot;persist_option\&quot;: \&quot;RESET\&quot;&#x60; and
     * &#x60;\&quot;persist_option\&quot;: \&quot;NONE\&quot;&#x60; when &#x60;variable_values&#x60;
     * are defined in the request. If you are using &#x60;variable_values&#x60; for token
     * generation, you must use other supported persist options such as &#x60;APPEND&#x60; or
     * &#x60;REPLACE&#x60;. If you want to use &#x60;RESET&#x60; or &#x60;NONE&#x60;, do not pass
     * any &#x60;variable_values&#x60;. In such cases, &#x60;variable_values&#x60; will remain
     * unaffected. #### Supported objects The supported object type is &#x60;LOGICAL_TABLE&#x60;.
     * When using &#x60;object_id&#x60; with &#x60;variable_values&#x60;, models are supported. ####
     * Just-in-time provisioning For [just-in-time user creation and
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the
     * following attributes in the API request: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60; Set &#x60;auto_create&#x60;
     * to &#x60;true&#x60; if the username does not exist in ThoughtSpot. If the username already
     * exists in ThoughtSpot and &#x60;auto_create&#x60; is set to &#x60;true&#x60;, user properties
     * such as display name, email, Org and group entitlements will not be updated with new values.
     * Setting &#x60;auto_create&#x60; to &#x60;true&#x60; does not create formula variables. Hence,
     * this setting will not be applicable to &#x60;variable_values&#x60;. #### Important point to
     * note All options in the token creation APIs that define user access to data in ThoughtSpot
     * will take effect during token creation, not when the token is used for authentication. For
     * example, &#x60;auto_create:true&#x60; will create the user when the authentication token is
     * created. Persist options such as &#x60;APPEND&#x60; and &#x60;REPLACE&#x60; will persist
     * &#x60;variable_values&#x60; on the user profile when the token is created.
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
     * Version: 9.0.0.cl or later Generates an authentication token for creating a full session in
     * ThoughtSpot for a given user. Recommended for use cases that do not require Attribute-based
     * access control (ABAC) via Row Level Security (RLS). #### Usage guidelines You can generate a
     * token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using
     * the &#x60;secret_key&#x60; generated for your instance. To generate a &#x60;secret_key&#x60;,
     * the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the
     * **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: * When both
     * &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. * If [Multi-Factor Authentication
     * (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your
     * instance, the API login request with &#x60;username&#x60; and &#x60;password&#x60; returns an
     * error. You can switch to token-based authentication with &#x60;secret_key&#x60; or contact
     * ThoughtSpot Support for assistance. The token obtained from ThoughtSpot is valid for 5
     * minutes by default. You can configure the token expiration time as required. ####
     * Just-in-time provisioning For [just-in-time user creation and
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the
     * following attributes in the API request: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;true&#x60; if the username does not exist in ThoughtSpot. If
     * the user already exists in ThoughtSpot and &#x60;auto_create&#x60; is set to
     * &#x60;true&#x60;, user properties such as display name, email and group assignment will be
     * updated. To add a new user and assign privileges during auto-creation, the
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled,
     * the &#x60;CONTROL_TRUSTED_AUTH&#x60; (**Can Enable or Disable Trusted Authentication**)
     * privilege is required. #### Important point to note All options in the token creation APIs
     * that define user access to data in ThoughtSpot will take effect during token creation, not
     * when the token is used for authentication. For example, &#x60;auto_create:true&#x60; will
     * create the user when the authentication token is created.
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
     * Version: 9.0.0.cl or later Generates an authentication token that provides access to a
     * specific metadata object. This object list is intersected with the list of objects the user
     * is allowed to access via group membership. For more information, see [Object
     * security](https://docs.thoughtspot.com/cloud/latest/security-data-object#object_security).
     * #### Usage guidelines You can generate a token for a user by providing a &#x60;username&#x60;
     * and &#x60;password&#x60;, or by using the &#x60;secret_key&#x60; generated for your instance.
     * To generate a &#x60;secret_key&#x60;, the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the
     * **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: * When both
     * &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. * If [Multi-Factor Authentication
     * (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your
     * instance, the API login request with &#x60;username&#x60; and &#x60;password&#x60; returns an
     * error. You can switch to token-based authentication with &#x60;secret_key&#x60; or contact
     * ThoughtSpot Support for assistance. The token obtained from ThoughtSpot is valid for 5
     * minutes by default. You can configure the token expiration time as required. ####
     * Just-in-time provisioning For [just-in-time user creation and
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the
     * following attributes in the API request: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;true&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, user properties such as display name, email, and group assignment will be
     * updated. To add a new user and assign privileges, the &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege is required. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs that define
     * user access to data in ThoughtSpot will take effect during token creation, not when the token
     * is used for authentication. For example, &#x60;auto_create:true&#x60; will create the user
     * when the authentication token is created.
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
     * Version: 9.0.0.cl or later Creates a login session for a ThoughtSpot user with Basic
     * authentication. In Basic authentication method, REST clients log in to ThoughtSpot using
     * &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with
     * Orgs, users can pass the ID of the Org in the API request to log in to a specific Org
     * context. **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API
     * login request with basic authentication (&#x60;username&#x60; and &#x60;password&#x60; )
     * returns an error. Contact ThoughtSpot Support for assistance. A successful login returns a
     * session cookie that can be used in your subsequent API requests.
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
     * Version: 9.0.0.cl or later Logs out a user from their current session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        api.logout();
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Revokes the authentication token issued for current user session.
     * The token of your current session expires when you make a call to the
     * &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access
     * ThoughtSpot objects until a new token is obtained. To restart your session, request for a new
     * token from ThoughtSpot. See [Get Full Access
     * Token](#/http/api-endpoints/authentication/get-full-access-token).
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
     * Version: 9.12.0.cl or later Validates the authentication token specified in the API request.
     * If your token is not valid, [Get a new
     * token](#/http/api-endpoints/authentication/get-full-access-token).
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
