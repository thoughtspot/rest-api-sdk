/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.ConnectionConfigurationResponse;
import com.thoughtspot.client.model.ConnectionConfigurationSearchRequest;
import com.thoughtspot.client.model.CreateConnectionConfigurationRequest;
import com.thoughtspot.client.model.DeleteConnectionConfigurationRequest;
import com.thoughtspot.client.model.UpdateConnectionConfigurationRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for ConnectionConfigurationsApi */
@Disabled
public class ConnectionConfigurationsApiTest {

    private final ConnectionConfigurationsApi api = new ConnectionConfigurationsApi();

    /**
     * Version: 10.12.0.cl or later Gets connection configuration objects. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. #### Usage guidelines * To get a list of all
     * configurations available in the ThoughtSpot system, send the API request with only the
     * connection name or GUID in the request body. * To fetch details of a configuration object,
     * specify the configuration object name or GUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void connectionConfigurationSearchTest() throws ApiException {
        ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest = null;
        List<ConnectionConfigurationResponse> response =
                api.connectionConfigurationSearch(connectionConfigurationSearchRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Creates an additional configuration to an existing connection to
     * a data warehouse. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. #### Usage guidelines * A JSON map of configuration attributes in
     * &#x60;configuration&#x60;. The following example shows the configuration attributes:
     * &#x60;&#x60;&#x60; { \&quot;user\&quot;:\&quot;DEV_USER\&quot;,
     * \&quot;password\&quot;:\&quot;TestConn123\&quot;, \&quot;role\&quot;:\&quot;DEV\&quot;,
     * \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot; } &#x60;&#x60;&#x60; * If the
     * &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a
     * required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then
     * &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is
     * &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60;
     * are not required fields. #### Parameterized Connection Support For parameterized connections
     * that use OAuth authentication, only the same_as_parent and policy_process_options attributes
     * are allowed in the API request. These attributes are not applicable to connections that are
     * not parameterized.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectionConfigurationTest() throws ApiException {
        CreateConnectionConfigurationRequest createConnectionConfigurationRequest = null;
        ConnectionConfigurationResponse response =
                api.createConnectionConfiguration(createConnectionConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Deletes connection configuration objects. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionConfigurationTest() throws ApiException {
        DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest = null;
        api.deleteConnectionConfiguration(deleteConnectionConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Updates a connection configuration object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. #### Supported operations This API endpoint lets you
     * perform the following operations in a single API request: * Edit the name or description of
     * the configuration * Edit the configuration properties * Edit the &#x60;policy_type&#x60; *
     * Edit the type of authentication * Enable or disable a configuration #### Parameterized
     * Connection Support For parameterized oauth based connections, only the
     * &#x60;same_as_parent&#x60; and &#x60;policy_process_options&#x60; attributes are allowed.
     * These attributes are not applicable to connections that are not parameterized. **NOTE**: When
     * updating a configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset
     * &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly
     * set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectionConfigurationTest() throws ApiException {
        String configurationIdentifier = null;
        UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest = null;
        api.updateConnectionConfiguration(
                configurationIdentifier, updateConnectionConfigurationRequest);
        // TODO: test validations
    }
}
