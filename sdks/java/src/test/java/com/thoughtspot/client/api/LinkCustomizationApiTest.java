/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.LinkPreference;
import com.thoughtspot.client.model.SearchLinkCustomizationsRequest;
import com.thoughtspot.client.model.UpdateLinkCustomizationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for LinkCustomizationApi
 */
@Disabled
public class LinkCustomizationApiTest {

    private final LinkCustomizationApi api = new LinkCustomizationApi();

    /**
     *   Version: 26.11.0.cl or later   Retrieves the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to verify what an Org has customized before modifying it, or to confirm the destination URLs used in scheduled emails and the Share dialog.  Cluster-level templates serve as the default that Orgs inherit. Org-level templates override that default.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; returns the cluster templates, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; returns the templates for the Org the caller is signed in to, and requires Orgs to be enabled. - Omit &#x60;scope&#x60; to return whichever of these the caller can access. - Every link type is always returned, customized or not. &#x60;is_overridden&#x60; is &#x60;true&#x60; when the scope you asked for stores a value that differs from the one it would otherwise inherit — the cluster template for &#x60;ORG&#x60;, the ThoughtSpot default for &#x60;CLUSTER&#x60; — and &#x60;false&#x60; when it matches.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchLinkCustomizationsTest() throws ApiException {
        SearchLinkCustomizationsRequest searchLinkCustomizationsRequest = null;
        List<LinkPreference> response = api.searchLinkCustomizations(searchLinkCustomizationsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at cluster level or for the authenticated user&#39;s org. Use it to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; changes the defaults inherited by all orgs, and is available only to callers in the primary org. - &#x60;scope: ORG&#x60; (default) changes the authenticated user&#39;s org, and requires Orgs to be enabled. - List only the types you want to change in &#x60;templates&#x60;. Unlisted types are left unchanged by either operation, and a repeated type is rejected. - **REPLACE** (default) sets each listed type to its &#x60;value&#x60;. - **RESET** reverts each listed type to the value its scope inherits: the ThoughtSpot default at cluster scope, and the cluster template at org scope. Supply only &#x60;type&#x60;; a &#x60;value&#x60; alongside &#x60;RESET&#x60; is rejected. To clear every override, list all types with &#x60;RESET&#x60;.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires:  | Link type | Required | | --- | --- | | &#x60;LIVEBOARD_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | | &#x60;VISUALIZATION_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{sub-object-id}&#x60;, &#x60;{ts-query-params}&#x60; | | &#x60;ANSWER_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | | &#x60;SPOTIQ_ANALYSIS_URL&#x60; | &#x60;{object-id}&#x60; | | &#x60;CONVERSATION_SHARE_URL&#x60; | &#x60;{conversation-id}&#x60;, &#x60;{ts-query-params}&#x60; | | &#x60;GENERIC_URL&#x60; | &#x60;{path}&#x60; | | &#x60;UNSUBSCRIBE_URL&#x60; | none |  &#x60;{ts-query-params}&#x60; is optional on any type that does not require it, including &#x60;SPOTIQ_ANALYSIS_URL&#x60; and &#x60;UNSUBSCRIBE_URL&#x60;: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLinkCustomizationTest() throws ApiException {
        UpdateLinkCustomizationRequest updateLinkCustomizationRequest = null;
        api.updateLinkCustomization(updateLinkCustomizationRequest);
        // TODO: test validations
    }

}
