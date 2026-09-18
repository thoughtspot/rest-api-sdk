/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.FeatureAssignmentResponse;
import com.thoughtspot.client.model.FeatureGroup;
import com.thoughtspot.client.model.FeatureValueResponse;
import com.thoughtspot.client.model.SearchFeaturesRequest;
import com.thoughtspot.client.model.UpdateFeatureAssignmentsRequest;
import com.thoughtspot.client.model.UpdateFeatureValueRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for FeatureManagementApi
 */
@Disabled
public class FeatureManagementApiTest {

    private final FeatureManagementApi api = new FeatureManagementApi();

    /**
     *   Version: 26.10.0.cl or later   Returns the feature configurations available on the ThoughtSpot system, grouped by feature group.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To retrieve feature configurations, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the administrative view. Use &#x60;CLUSTER&#x60; for the cluster-admin view (returns the Orgs assigned to each feature); use &#x60;ORG&#x60; for the org-admin view (returns the current value of each feature for a single Org). - &#x60;org_identifier&#x60; — Numeric ID of the Org. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;category&#x60; — Availability category of the features to return. &#x60;GENERAL_ACCESS&#x60; returns generally available features; &#x60;EARLY_ACCESS&#x60; returns features still in early access. Defaults to &#x60;GENERAL_ACCESS&#x60;.  The response fields populated depend on the requested scope. In the cluster-admin view (&#x60;scope&#x3D;CLUSTER&#x60;), each feature includes &#x60;assigned_orgs&#x60;, &#x60;is_org_aware&#x60;, and (for non-org-aware features) &#x60;feature_value&#x60;. In the org-admin view (&#x60;scope&#x3D;ORG&#x60;), each feature includes &#x60;element_type&#x60;, &#x60;element_config&#x60;, and &#x60;element_value&#x60;.  The following example retrieves the general-access features for the cluster-admin view:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;  For the org-admin view, set &#x60;scope&#x60; to &#x60;ORG&#x60; and pass the &#x60;org_identifier&#x60; of the Org to scope the search to (&#x60;org_identifier&#x60; is required when &#x60;scope&#x60; is &#x60;ORG&#x60;; omitting it returns a 400 error):  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchFeaturesTest() throws ApiException {
        SearchFeaturesRequest searchFeaturesRequest = null;
        List<FeatureGroup> response = api.searchFeatures(searchFeaturesRequest);
        // TODO: test validations
    }

    /**
     *   Version: 26.10.0.cl or later   Updates the Org assignments for a feature. Available to cluster admins only.  #### Pre-requisites  Requires the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege in the cluster-admin (All-Org / default-org) context. This endpoint manages Org assignments across the cluster, so it must be called by a cluster admin; org-scoped admins cannot call it. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To update the Org assignments for a feature, pass these parameters in your API request:  - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature to update. - &#x60;org_identifiers&#x60; — Numeric IDs of the Orgs to assign. Send an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; to clear all Org assignments for this feature. - &#x60;operation&#x60; — Type of update to apply. &#x60;ADD&#x60; assigns the given Orgs in addition to the existing ones; &#x60;REMOVE&#x60; unassigns the given Orgs; &#x60;REPLACE&#x60; sets the assignment to exactly the given Orgs. Defaults to &#x60;REPLACE&#x60;.  The following example assigns Orgs &#x60;1&#x60; and &#x60;2&#x60; to a feature, in addition to any Orgs already assigned:  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [1, 2],   \&quot;operation\&quot;: \&quot;ADD\&quot; } &#x60;&#x60;&#x60;  Clear all Org assignments for a feature by sending an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; (this is the only way to unassign every Org at once):  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [],   \&quot;operation\&quot;: \&quot;REPLACE\&quot; } &#x60;&#x60;&#x60;      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFeatureAssignmentsTest() throws ApiException {
        UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest = null;
        FeatureAssignmentResponse response = api.updateFeatureAssignments(updateFeatureAssignmentsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 26.10.0.cl or later   Sets the value of a feature at the cluster or Org scope.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To set a feature value, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the scope at which the value is set. Use &#x60;CLUSTER&#x60; to set the cluster-level value; use &#x60;ORG&#x60; to set a per-Org value override. - &#x60;org_identifier&#x60; — Numeric ID of the Org for which to set the value. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature whose value should be set. - &#x60;feature_value&#x60; — New value to set for the feature. - &#x60;reset_org_overrides&#x60; — Applicable only when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. When &#x60;true&#x60;, any existing per-Org value overrides for this feature are also removed so that all Orgs inherit the new cluster-level value. Required when &#x60;scope&#x60; is &#x60;CLUSTER&#x60; for an org-aware feature. Must be omitted when &#x60;scope&#x60; is &#x60;ORG&#x60;; passing it at &#x60;ORG&#x60; scope returns a 400 error.  The following example sets a per-Org value override for Org &#x60;1&#x60;:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot; } &#x60;&#x60;&#x60;  Set the cluster-level value and clear all per-Org overrides so every Org inherits the new value (CLUSTER scope). &#x60;reset_org_overrides: true&#x60; is destructive — it strips existing per-Org overrides cluster-wide:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot;,   \&quot;reset_org_overrides\&quot;: true } &#x60;&#x60;&#x60;      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFeatureValueTest() throws ApiException {
        UpdateFeatureValueRequest updateFeatureValueRequest = null;
        FeatureValueResponse response = api.updateFeatureValue(updateFeatureValueRequest);
        // TODO: test validations
    }

}
