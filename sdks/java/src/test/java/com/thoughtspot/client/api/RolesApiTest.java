/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateRoleRequest;
import com.thoughtspot.client.model.RoleResponse;
import com.thoughtspot.client.model.SearchRoleResponse;
import com.thoughtspot.client.model.SearchRolesRequest;
import com.thoughtspot.client.model.UpdateRoleRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for RolesApi */
@Disabled
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    /**
     * Version: 9.5.0.cl or later Creates a Role object in ThoughtSpot. Available only if
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance. To create a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage
     * roles**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        CreateRoleRequest createRoleRequest = null;
        RoleResponse response = api.createRole(createRoleRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Deletes a Role object from the ThoughtSpot system. Available only
     * if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance. To delete a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage
     * roles**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        String roleIdentifier = null;
        api.deleteRole(roleIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Gets a list of Role objects from the ThoughtSpot system. Available
     * if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance. To search for Roles, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can
     * manage roles**) privilege is required. To get details of a specific Role object, specify the
     * GUID or name. You can also filter the API response based on user group and Org identifiers,
     * privileges assigned to the Role, and deprecation status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchRolesTest() throws ApiException {
        SearchRolesRequest searchRolesRequest = null;
        List<SearchRoleResponse> response = api.searchRoles(searchRolesRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Updates the properties of a Role object. Available only if
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance. To update a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage
     * roles**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        String roleIdentifier = null;
        UpdateRoleRequest updateRoleRequest = null;
        RoleResponse response = api.updateRole(roleIdentifier, updateRoleRequest);
        // TODO: test validations
    }
}
