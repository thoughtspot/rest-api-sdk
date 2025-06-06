/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;


import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateOrgRequest;
import com.thoughtspot.client.model.OrgResponse;
import com.thoughtspot.client.model.SearchOrgsRequest;
import com.thoughtspot.client.model.UpdateOrgRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for OrgsApi */
@Disabled
public class OrgsApiTest {

    private final OrgsApi api = new OrgsApi();

    /**
     * Version: 9.0.0.cl or later Creates an Org object. To use this API, the
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in
     * your cluster. Requires cluster administration (**Can administer Org**) privileges. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrgTest() throws ApiException {
        CreateOrgRequest createOrgRequest = null;
        OrgResponse response = api.createOrg(createOrgRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Deletes an Org object from the ThoughtSpot system. Requires
     * cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required. When you delete
     * an Org, all its users and objects created in that Org context are removed. However, if the
     * users in the deleted Org also exists in other Orgs, they are removed only from the deleted
     * Org.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgTest() throws ApiException {
        String orgIdentifier = null;
        api.deleteOrg(orgIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of Orgs configured on the ThoughtSpot system. To get
     * details of a specific Org, specify the Org ID or name. You can also pass parameters such as
     * status, visibility, and user identifiers to get a specific list of Orgs. Requires cluster
     * administration (**Can administer Org**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchOrgsTest() throws ApiException {
        SearchOrgsRequest searchOrgsRequest = null;
        List<OrgResponse> response = api.searchOrgs(searchOrgsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates an Org object. You can modify Org properties such as name,
     * description, and user associations. Requires cluster administration (**Can administer Org**)
     * privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrgTest() throws ApiException {
        String orgIdentifier = null;
        UpdateOrgRequest updateOrgRequest = null;
        api.updateOrg(orgIdentifier, updateOrgRequest);
        // TODO: test validations
    }
}
