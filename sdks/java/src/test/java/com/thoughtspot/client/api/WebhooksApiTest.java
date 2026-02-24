/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateWebhookConfigurationRequest;
import com.thoughtspot.client.model.DeleteWebhookConfigurationsRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.SearchWebhookConfigurationsRequest;
import com.thoughtspot.client.model.UpdateWebhookConfigurationRequest;
import com.thoughtspot.client.model.WebhookDeleteResponse;
import com.thoughtspot.client.model.WebhookResponse;
import com.thoughtspot.client.model.WebhookSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     *  Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookConfigurationTest() throws ApiException {
        CreateWebhookConfigurationRequest createWebhookConfigurationRequest = null;
        WebhookResponse response = api.createWebhookConfiguration(createWebhookConfigurationRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookConfigurationsTest() throws ApiException {
        DeleteWebhookConfigurationsRequest deleteWebhookConfigurationsRequest = null;
        WebhookDeleteResponse response = api.deleteWebhookConfigurations(deleteWebhookConfigurationsRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchWebhookConfigurationsTest() throws ApiException {
        SearchWebhookConfigurationsRequest searchWebhookConfigurationsRequest = null;
        WebhookSearchResponse response = api.searchWebhookConfigurations(searchWebhookConfigurationsRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookConfigurationTest() throws ApiException {
        String webhookIdentifier = null;
        UpdateWebhookConfigurationRequest updateWebhookConfigurationRequest = null;
        api.updateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest);
        // TODO: test validations
    }

}
