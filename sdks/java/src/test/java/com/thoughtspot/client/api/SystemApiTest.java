/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.SystemConfig;
import com.thoughtspot.client.model.SystemInfo;
import com.thoughtspot.client.model.UpdateSystemConfigRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for SystemApi */
@Disabled
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    /**
     * Version: 9.0.0.cl or later Retrieves the current configuration details of the cluster. If the
     * request is successful, the API returns a list configuration settings applied on the cluster.
     * Requires &#x60;ADMINISTRATION&#x60;(**Can administer ThoughtSpot**) privilege to view these
     * complete configuration settings of the cluster. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is
     * required. This API does not require any parameters to be passed in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemConfigTest() throws ApiException {
        SystemConfig response = api.getSystemConfig();
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets system information such as the release version, locale, time
     * zone, deployment environment, date format, and date time format of the cluster. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is
     * required. This API does not require any parameters to be passed in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemInformationTest() throws ApiException {
        SystemInfo response = api.getSystemInformation();
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets a list of configuration overrides applied on the cluster.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application
     * settings**) privilege is required. This API does not require any parameters to be passed in
     * the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemOverrideInfoTest() throws ApiException {
        Object response = api.getSystemOverrideInfo();
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Updates the current configuration of the cluster. You must send
     * the configuration data in JSON format. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSystemConfigTest() throws ApiException {
        UpdateSystemConfigRequest updateSystemConfigRequest = null;
        api.updateSystemConfig(updateSystemConfigRequest);
        // TODO: test validations
    }
}
