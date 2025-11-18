/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateEmailCustomizationRequest;
import com.thoughtspot.client.model.CreateEmailCustomizationResponse;
import com.thoughtspot.client.model.DeleteOrgEmailCustomizationRequest;
import com.thoughtspot.client.model.SearchEmailCustomizationRequest;
import com.thoughtspot.client.model.UpdateEmailCustomizationRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for EmailCustomizationApi */
@Disabled
public class EmailCustomizationApiTest {

    private final EmailCustomizationApi api = new EmailCustomizationApi();

    /**
     * Version: 10.10.0.cl or later Creates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To create a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmailCustomizationTest() throws ApiException {
        CreateEmailCustomizationRequest createEmailCustomizationRequest = null;
        CreateEmailCustomizationResponse response =
                api.createEmailCustomization(createEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the
     * &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60;
     * as a parameter in this API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmailCustomizationTest() throws ApiException {
        String templateIdentifier = null;
        api.deleteEmailCustomization(templateIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the &#x60;org_identifier&#x60;
     * from the response. - Use that &#x60;org_identifier&#x60; as a parameter in this API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgEmailCustomizationTest() throws ApiException {
        DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest = null;
        api.deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Search the email customization configuration if any set for the
     * ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchEmailCustomizationTest() throws ApiException {
        SearchEmailCustomizationRequest searchEmailCustomizationRequest = null;
        List<CreateEmailCustomizationResponse> response =
                api.searchEmailCustomization(searchEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Updates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To update a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmailCustomizationTest() throws ApiException {
        UpdateEmailCustomizationRequest updateEmailCustomizationRequest = null;
        api.updateEmailCustomization(updateEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Validates the email customization configuration if any set for
     * the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateEmailCustomizationTest() throws ApiException {
        api.validateEmailCustomization();
        // TODO: test validations
    }
}
