/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateCustomActionRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.ResponseCustomAction;
import com.thoughtspot.client.model.SearchCustomActionsRequest;
import com.thoughtspot.client.model.UpdateCustomActionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomActionApi
 */
@Disabled
public class CustomActionApiTest {

    private final CustomActionApi api = new CustomActionApi();

    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in &#x60;group_identifiers&#x60;.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in &#x60;default_action_config&#x60; property and specify the GUID or name of the object in &#x60;associate_metadata&#x60;.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomActionTest() throws ApiException {
        CreateCustomActionRequest createCustomActionRequest = null;
        ResponseCustomAction response = api.createCustomAction(createCustomActionRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomActionTest() throws ApiException {
        String customActionIdentifier = null;
        api.deleteCustomAction(customActionIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCustomActionsTest() throws ApiException {
        SearchCustomActionsRequest searchCustomActionsRequest = null;
        List<ResponseCustomAction> response = api.searchCustomActions(searchCustomActionsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomActionTest() throws ApiException {
        String customActionIdentifier = null;
        UpdateCustomActionRequest updateCustomActionRequest = null;
        api.updateCustomAction(customActionIdentifier, updateCustomActionRequest);
        // TODO: test validations
    }

}
