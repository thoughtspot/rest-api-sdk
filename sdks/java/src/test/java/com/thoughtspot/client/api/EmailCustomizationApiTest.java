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
     * \&quot;ctaButtonBgColor\&quot;: \&quot;#444DEA\&quot;, \&quot;ctaTextFontColor\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;hideMobileAppNudge\&quot;: false, \&quot;fontFamily\&quot; : \&quot;\&quot;,
     * \&quot;hideProductName\&quot; : false, \&quot;hideFooterPhone\&quot; : false,
     * \&quot;hideFooterAddress\&quot; : false, \&quot;hidePrivacyPolicy\&quot; : false,
     * \&quot;hideManageNotification\&quot; : false, \&quot;hideTsVocabularyDefinitions\&quot;:
     * false, \&quot;hideNotificationStatus\&quot; : false, \&quot;hideErrorMessage\&quot;: false,
     * \&quot;hideUnsubscribeLink\&quot; : false, \&quot;hideModifyAlert\&quot;: false,
     * \&quot;textTransform\&quot;: \&quot;\&quot;, \&quot;replacementValueForLiveboard\&quot;:
     * \&quot;LB dashboard\&quot;, \&quot;replacementValueForAnswer\&quot;: \&quot;Answer
     * dashboard\&quot;, \&quot;replacementValueForSpotIQ\&quot;: \&quot;SpotIQ dashboard\&quot;,
     * \&quot;logoUrl\&quot;:\&quot;\&quot;, \&quot;productName\&quot;:\&quot;ThoughtSpot\&quot;,
     * \&quot;footerPhone\&quot;:\&quot;(800) 508-7008\&quot;,
     * \&quot;footerAddress\&quot;:\&quot;444 Castro St, Suite 1000 Mountain View, CA 94041\&quot;,
     * \&quot;companyWebsiteUrl\&quot;:\&quot;\&quot;,
     * \&quot;companyPrivacyPolicyUrl\&quot;:\&quot;\&quot; } } &#x60;&#x60;&#x60;
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
     * \&quot;ctaButtonBgColor\&quot;: \&quot;#444DEA\&quot;, \&quot;ctaTextFontColor\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;hideMobileAppNudge\&quot;: false, \&quot;fontFamily\&quot; : \&quot;\&quot;,
     * \&quot;hideProductName\&quot; : false, \&quot;hideFooterPhone\&quot; : false,
     * \&quot;hideFooterAddress\&quot; : false, \&quot;hidePrivacyPolicy\&quot; : false,
     * \&quot;hideManageNotification\&quot; : false, \&quot;hideTsVocabularyDefinitions\&quot;:
     * false, \&quot;hideNotificationStatus\&quot; : false, \&quot;hideErrorMessage\&quot;: false,
     * \&quot;hideUnsubscribeLink\&quot; : false, \&quot;hideModifyAlert\&quot;: false,
     * \&quot;textTransform\&quot;: \&quot;\&quot;, \&quot;replacementValueForLiveboard\&quot;:
     * \&quot;LB dashboard\&quot;, \&quot;replacementValueForAnswer\&quot;: \&quot;Answer
     * dashboard\&quot;, \&quot;replacementValueForSpotIQ\&quot;: \&quot;SpotIQ dashboard\&quot;,
     * \&quot;logoUrl\&quot;:\&quot;\&quot;, \&quot;productName\&quot;:\&quot;ThoughtSpot\&quot;,
     * \&quot;footerPhone\&quot;:\&quot;(800) 508-7008\&quot;,
     * \&quot;footerAddress\&quot;:\&quot;444 Castro St, Suite 1000 Mountain View, CA 94041\&quot;,
     * \&quot;companyWebsiteUrl\&quot;:\&quot;\&quot;,
     * \&quot;companyPrivacyPolicyUrl\&quot;:\&quot;\&quot; } } &#x60;&#x60;&#x60;
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
