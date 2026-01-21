/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CommunicationChannelPreferencesResponse;
import com.thoughtspot.client.model.ConfigureCommunicationChannelPreferencesRequest;
import com.thoughtspot.client.model.ConfigureSecuritySettingsRequest;
import com.thoughtspot.client.model.SearchCommunicationChannelPreferencesRequest;
import com.thoughtspot.client.model.SearchSecuritySettingsRequest;
import com.thoughtspot.client.model.SecuritySettingsResponse;
import com.thoughtspot.client.model.SystemConfig;
import com.thoughtspot.client.model.SystemInfo;
import com.thoughtspot.client.model.SystemOverrideInfo;
import com.thoughtspot.client.model.UpdateSystemConfigRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for SystemApi */
@Disabled
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    /**
     * Version: 10.14.0.cl or later Configure communication channel preferences. - Use
     * &#x60;cluster_preferences&#x60; to update the default preferences for your ThoughtSpot
     * application instance. - If your instance has
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use
     * &#x60;org_preferences&#x60; to specify Org-specific preferences that override the defaults.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60;
     * (**Has developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are
     * also authorized to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void configureCommunicationChannelPreferencesTest() throws ApiException {
        ConfigureCommunicationChannelPreferencesRequest
                configureCommunicationChannelPreferencesRequest = null;
        api.configureCommunicationChannelPreferences(
                configureCommunicationChannelPreferencesRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.2.0.cl or later Configure security settings for your ThoughtSpot application
     * instance. - Use &#x60;cluster_preferences&#x60; to update cluster-level security settings
     * including CORS whitelisted URLs, CSP settings, SAML redirect URLs, partitioned cookies, and
     * non-embed access configuration. - Use &#x60;org_preferences&#x60; to configure Org-specific
     * security settings. If your instance has
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this allows configuring CORS
     * and non-embed access settings specific to the Org. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * Cluster-level SAML and script-src settings require &#x60;ADMINISTRATION&#x60; privilege. See
     * [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more
     * details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void configureSecuritySettingsTest() throws ApiException {
        ConfigureSecuritySettingsRequest configureSecuritySettingsRequest = null;
        api.configureSecuritySettings(configureSecuritySettingsRequest);
        // TODO: test validations
    }

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
        SystemOverrideInfo response = api.getSystemOverrideInfo();
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Fetch communication channel preferences. - Use
     * &#x60;cluster_preferences&#x60; to fetch the default preferences for your ThoughtSpot
     * application instance. - If your instance has
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use
     * &#x60;org_preferences&#x60; to fetch any Org-specific preferences that override the defaults.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60;
     * (**Has developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are
     * also authorized to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCommunicationChannelPreferencesTest() throws ApiException {
        SearchCommunicationChannelPreferencesRequest searchCommunicationChannelPreferencesRequest =
                null;
        CommunicationChannelPreferencesResponse response =
                api.searchCommunicationChannelPreferences(
                        searchCommunicationChannelPreferencesRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.2.0.cl or later Fetch security settings for your ThoughtSpot application
     * instance. - Use &#x60;scope: CLUSTER&#x60; to retrieve cluster-level security settings,
     * including CORS and CSP allowlists, SAML redirect URLs, and settings that control access to
     * non-embedded pages. - Use &#x60;scope: ORG&#x60; to retrieve Org-level security settings. If
     * your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this
     * returns CORS and non-embed access settings specific to the Org. - If &#x60;scope&#x60; is not
     * specified, returns both cluster and Org-specific settings based on user privileges. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. See [Security
     * Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSecuritySettingsTest() throws ApiException {
        SearchSecuritySettingsRequest searchSecuritySettingsRequest = null;
        SecuritySettingsResponse response =
                api.searchSecuritySettings(searchSecuritySettingsRequest);
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
