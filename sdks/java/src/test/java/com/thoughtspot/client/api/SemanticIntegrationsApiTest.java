/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateSemanticIntegrationRequest;
import com.thoughtspot.client.model.SearchSemanticIntegrationsRequest;
import com.thoughtspot.client.model.SemanticIntegrationResponse;
import com.thoughtspot.client.model.SemanticIntegrationSearchResponse;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for SemanticIntegrationsApi */
@Disabled
public class SemanticIntegrationsApiTest {

    private final SemanticIntegrationsApi api = new SemanticIntegrationsApi();

    /**
     * Version: 26.9.0.cl or later Creates a new semantic integration in ThoughtSpot from a CDW
     * semantic view. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege
     * or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About create semantic integration A semantic integration imports an
     * externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API
     * resolves the source semantic view from the specified &#x60;connection_identifier&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, and &#x60;semantic_view_name&#x60;,
     * generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula
     * import report (&#x60;semantic_report&#x60;) summarizing how many formulas were successfully
     * imported, failed, or skipped. - &#x60;connection_identifier&#x60;, &#x60;name&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, &#x60;semantic_view_name&#x60;, and
     * &#x60;type&#x60; are required. - &#x60;name&#x60; must be unique across the user&#39;s
     * organization. The integration&#39;s display name is also used as the generated model name. -
     * Supported &#x60;type&#x60; values are listed in the &#x60;SemanticIntegrationType&#x60; enum.
     * - The response includes a &#x60;semantic_report.summary&#x60; with &#x60;total&#x60;,
     * &#x60;imported&#x60;, &#x60;failed&#x60;, and &#x60;skipped&#x60; counts, and a
     * &#x60;formulas&#x60; array with the per-formula translation details. &gt; **Note:** Creating
     * a semantic integration using a YAML file upload is not supported through the public API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSemanticIntegrationTest() throws ApiException {
        CreateSemanticIntegrationRequest createSemanticIntegrationRequest = null;
        SemanticIntegrationResponse response =
                api.createSemanticIntegration(createSemanticIntegrationRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.9.0.cl or later Deletes a semantic integration and its associated ThoughtSpot
     * model. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About delete semantic integration Removes the specified semantic
     * integration and its generated ThoughtSpot model from the system. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to delete.
     * - Deletions cannot be undone. Re-import the integration with
     * &#x60;createSemanticIntegration&#x60; if needed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSemanticIntegrationTest() throws ApiException {
        String semanticIntegrationIdentifier = null;
        api.deleteSemanticIntegration(semanticIntegrationIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 26.9.0.cl or later Imports semantic updates for an existing semantic integration
     * from its CDW source and refreshes the associated ThoughtSpot model. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About import semantic integration Re-imports the semantic view from the
     * CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this
     * after the source semantic view has been updated in the CDW (added, removed, or modified
     * formulas, dimensions, or measures) to bring the ThoughtSpot model back in line. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to import
     * updates for. - Import preserves the integration&#39;s GUID, name, and &#x60;model_id&#x60;;
     * only the underlying formula set is refreshed. - The response includes the same
     * &#x60;semantic_report&#x60; as create, with an additional &#x60;change_status&#x60; per
     * formula indicating whether each formula is &#x60;NEW&#x60;, &#x60;UPDATED&#x60;, or
     * &#x60;UNCHANGED&#x60; since the previous import. &gt; **Note:** Importing updates for a
     * semantic integration that was created using the file upload option in the ThoughtSpot UI is
     * not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importSemanticIntegrationTest() throws ApiException {
        String semanticIntegrationIdentifier = null;
        SemanticIntegrationResponse response =
                api.importSemanticIntegration(semanticIntegrationIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 26.9.0.cl or later Searches and lists semantic integrations available to the
     * authenticated user in the current organization, with optional filters, sort, and pagination.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About search semantic integrations Returns a paginated batch of semantic
     * integrations, each with its identifier, name, description, source connection, generated model
     * identifier, author, creation/modification timestamps, and associated tags. Use the filters to
     * narrow results by author, connection, tag, or name pattern. - &#x60;pattern&#x60; matches the
     * integration name as a case-insensitive substring. - &#x60;author_identifiers&#x60; and
     * &#x60;connection_identifiers&#x60; accept either GUIDs or names. -
     * &#x60;sort_options.field_name&#x60; defaults to &#x60;MODIFIED_TIME&#x60;; set
     * &#x60;sort_options.order&#x60; to &#x60;ASC&#x60; or &#x60;DESC&#x60; to control sort
     * direction. - &#x60;record_offset&#x60; and &#x60;record_size&#x60; control pagination. Use
     * &#x60;record_size: 0&#x60; to return all matching records in a single response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSemanticIntegrationsTest() throws ApiException {
        SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest = null;
        List<SemanticIntegrationSearchResponse> response =
                api.searchSemanticIntegrations(searchSemanticIntegrationsRequest);
        // TODO: test validations
    }
}
