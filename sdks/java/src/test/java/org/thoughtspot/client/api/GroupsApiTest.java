/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.api;

import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.model.CreateUserGroupRequest;
import org.thoughtspot.client.model.ErrorResponse;
import org.thoughtspot.client.model.ImportUserGroupsRequest;
import org.thoughtspot.client.model.ImportUserGroupsResponse;
import org.thoughtspot.client.model.SearchUserGroupsRequest;
import org.thoughtspot.client.model.UpdateUserGroupRequest;
import org.thoughtspot.client.model.UserGroupResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Disabled
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserGroupTest() throws ApiException {
        CreateUserGroupRequest createUserGroupRequest = null;
        UserGroupResponse response = api.createUserGroup(createUserGroupRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserGroupTest() throws ApiException {
        String groupIdentifier = null;
        api.deleteUserGroup(groupIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importUserGroupsTest() throws ApiException {
        ImportUserGroupsRequest importUserGroupsRequest = null;
        ImportUserGroupsResponse response = api.importUserGroups(importUserGroupsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUserGroupsTest() throws ApiException {
        SearchUserGroupsRequest searchUserGroupsRequest = null;
        List<UserGroupResponse> response = api.searchUserGroups(searchUserGroupsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserGroupTest() throws ApiException {
        String groupIdentifier = null;
        UpdateUserGroupRequest updateUserGroupRequest = null;
        api.updateUserGroup(groupIdentifier, updateUserGroupRequest);
        // TODO: test validations
    }

}
