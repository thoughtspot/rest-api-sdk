/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;


import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.ActivateUserRequest;
import com.thoughtspot.client.model.ChangeUserPasswordRequest;
import com.thoughtspot.client.model.CreateUserRequest;
import com.thoughtspot.client.model.DeactivateUserRequest;
import com.thoughtspot.client.model.ForceLogoutUsersRequest;
import com.thoughtspot.client.model.ImportUsersRequest;
import com.thoughtspot.client.model.ImportUsersResponse;
import com.thoughtspot.client.model.ResetUserPasswordRequest;
import com.thoughtspot.client.model.ResponseActivationURL;
import com.thoughtspot.client.model.SearchUsersRequest;
import com.thoughtspot.client.model.UpdateUserRequest;
import com.thoughtspot.client.model.User;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for UsersApi */
@Disabled
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Version: 9.7.0.cl or later Activates a deactivated user account. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To activate
     * an inactive user account, the API request body must include the following information: -
     * Username or the GUID of the user account. - Auth token generated for the deactivated user.
     * The auth token is sent in the API response when a user is deactivated. - Password for the
     * user account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateUserTest() throws ApiException {
        ActivateUserRequest activateUserRequest = null;
        User response = api.activateUser(activateUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates the current password of the user. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeUserPasswordTest() throws ApiException {
        ChangeUserPasswordRequest changeUserPasswordRequest = null;
        api.changeUserPassword(changeUserPasswordRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates a user in ThoughtSpot. The API endpoint allows you to
     * configure several user properties such as email address, account status, share notification
     * preferences, and sharing visibility. You can provision the user to
     * [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard,
     * Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for
     * the user, and set user preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        CreateUserRequest createUserRequest = null;
        User response = api.createUser(createUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.7.0.cl or later Deactivates a user account. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To deactivate a
     * user account, the API request body must include the following information: - Username or the
     * GUID of the user account - Base URL of the ThoughtSpot instance If the API request is
     * successful, ThoughtSpot returns the activation URL in the response. The activation URL is
     * valid for 14 days and can be used to re-activate the account and reset the password of the
     * deactivated account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateUserTest() throws ApiException {
        DeactivateUserRequest deactivateUserRequest = null;
        ResponseActivationURL response = api.deactivateUser(deactivateUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Deletes a user from the ThoughtSpot system. If you want to remove
     * a user from a specific Org but not from ThoughtSpot, update the group and Org mapping
     * properties of the user object via a POST API call to the
     * [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user)
     * endpoint. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userIdentifier = null;
        api.deleteUser(userIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Enforces logout on current user sessions. Use this API with
     * caution as it may invalidate active user sessions and force users to re-login. Make sure you
     * specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on
     * your cluster become invalid, and the users are forced to re-login. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void forceLogoutUsersTest() throws ApiException {
        ForceLogoutUsersRequest forceLogoutUsersRequest = null;
        api.forceLogoutUsers(forceLogoutUsersRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Imports user data from external databases into ThoughtSpot. During
     * the user import operation: * If the specified users are not available in ThoughtSpot, the
     * users are created and assigned a default password. Defining a &#x60;default_password&#x60; in
     * the API request is optional. * If &#x60;delete_unspecified_users&#x60; is set to
     * &#x60;true&#x60;, the users not specified in the API request, excluding the
     * &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and &#x60;su&#x60; users, are
     * deleted. * If the specified user objects are already available in ThoughtSpot, the object
     * properties are updated and synchronized as per the input data in the API request. A
     * successful API call returns the object that represents the changes made in the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importUsersTest() throws ApiException {
        ImportUsersRequest importUsersRequest = null;
        ImportUsersResponse response = api.importUsers(importUsersRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Resets the password of a user account. Administrators can reset
     * password on behalf of a user. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetUserPasswordTest() throws ApiException {
        ResetUserPasswordRequest resetUserPasswordRequest = null;
        api.resetUserPassword(resetUserPasswordRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of users available on the ThoughtSpot system. To get
     * details of a specific user, specify the user GUID or name. You can also filter the API
     * response based on groups, Org ID, user visibility, account status, user type, and user
     * preference settings and favorites. Available to all users. Users with
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users
     * properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. **NOTE**: If
     * the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60;
     * parameter. To search across all available users, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUsersTest() throws ApiException {
        SearchUsersRequest searchUsersRequest = null;
        List<User> response = api.searchUsers(searchUsersRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a user object. You can modify user
     * properties such as username, email, and share notification settings. You can also assign new
     * groups and Orgs, remove the user from a group or Org, reset password, and modify user
     * preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**)
     * privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userIdentifier = null;
        UpdateUserRequest updateUserRequest = null;
        api.updateUser(userIdentifier, updateUserRequest);
        // TODO: test validations
    }
}
