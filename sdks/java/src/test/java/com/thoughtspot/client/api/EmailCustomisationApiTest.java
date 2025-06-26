/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateEmailCustomisationRequest;
import com.thoughtspot.client.model.CreateEmailCustomisationResponse;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for EmailCustomisationApi */
@Disabled
public class EmailCustomisationApiTest {

    private final EmailCustomisationApi api = new EmailCustomisationApi();

    /**
     * Version: 10.10.0.cl or later Creates a custom configuration for the email customisation ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the
     * cluster. #### Usage guidelines To create a custom confuguration: 1. Pass these parameters in
     * your API request. - A JSON map of configuration attributes &#x60;template_properties&#x60;.
     * The following example shows the configuration attribures for a csutom configuration:
     * &#x60;&#x60;&#x60; { { \&quot;logoUrl\&quot;: \&quot;&lt;logo_url&gt;\&quot;,
     * \&quot;homeUrl\&quot;: \&quot;&lt;home_url&gt;\&quot;, \&quot;productName\&quot;:
     * \&quot;&lt;Company Name in the Mail&gt;\&quot;, \&quot;footerAddress\&quot;:
     * \&quot;&lt;address to be visible in the footer&gt;\&quot;, \&quot;ctaButtonBgColor\&quot;:
     * \&quot;#444DEA\&quot;, \&quot;ctaTextFontColor\&quot;: \&quot;#FFFFFF\&quot;,
     * \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;, \&quot;hideMobileAppNudge\&quot;:
     * &lt;true/false&gt;, \&quot;hideTsVocabularyDefinitions\&quot;: &lt;true/false&gt;e,
     * \&quot;hideProductName\&quot;: &lt;true/false&gt;, \&quot;hideFooterPhone\&quot;:
     * &lt;true/false&gt;, \&quot;hideFooterAddress\&quot;: &lt;true/false&gt;,
     * \&quot;hidePrivacyPolicy\&quot;: &lt;true/false&gt;, \&quot;hideManageNotification\&quot;:
     * &lt;true/false&gt;, \&quot;fontfamily\&quot;: \&quot;&lt;to maintain a single font in the
     * entire email&gt;\&quot; } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmailCustomisationTest() throws ApiException {
        CreateEmailCustomisationRequest createEmailCustomisationRequest = null;
        CreateEmailCustomisationResponse response =
                api.createEmailCustomisation(createEmailCustomisationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Deletes the configuration for the email customisation. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the
     * cluster. #### Usage guidelines Deletes the configuration available for the cluster/org. Pass
     * the &#x60;template_identifier&#x60; in the API request. Note: &#x60;template_identifier&#x60;
     * can be fetched from search API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmailCustomisationTest() throws ApiException {
        String templateIdentifier = null;
        api.deleteEmailCustomisation(templateIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Search the email customisation configuration if any set for the
     * ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should
     * be enabled on the cluster. #### Usage guidelines To get the list of configurations set in the
     * cluster/org.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchEmailCustomisationTest() throws ApiException {
        List<CreateEmailCustomisationResponse> response = api.searchEmailCustomisation();
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Validates the email customisation configuration if any set for
     * the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should
     * be enabled on the cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateEmailCustomisationTest() throws ApiException {
        api.validateEmailCustomisation();
        // TODO: test validations
    }
}
