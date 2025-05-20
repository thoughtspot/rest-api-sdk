/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.api;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.model.AssignChangeAuthorRequest;
import org.thoughtspot.client.model.FetchPermissionsOfPrincipalsRequest;
import org.thoughtspot.client.model.FetchPermissionsOnMetadataRequest;
import org.thoughtspot.client.model.PermissionOfMetadataResponse;
import org.thoughtspot.client.model.PermissionOfPrincipalsResponse;
import org.thoughtspot.client.model.ShareMetadataRequest;

/** API tests for SecurityApi */
@Disabled
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    /**
     * Version: 9.0.0.cl or later Transfers the ownership of one or several objects from one user to
     * another. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and
     * edit access to the objects are required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignChangeAuthorTest() throws ApiException {
        AssignChangeAuthorRequest assignChangeAuthorRequest = null;
        api.assignChangeAuthor(assignChangeAuthorRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches object permission details for a given principal object
     * such as a user and group. Requires view access to the metadata object. #### Usage guidelines
     * * To get a list of all metadata objects that a user or group can access, specify the
     * &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a
     * specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API
     * request. Upon successful execution, the API returns a list of metadata objects and permission
     * details for each object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchPermissionsOfPrincipalsTest() throws ApiException {
        FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest = null;
        PermissionOfPrincipalsResponse response =
                api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches permission details for a given metadata object. Requires
     * view access to the metadata object. #### Usage guidelines * To fetch a list of users and
     * groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata
     * object. * To get permission details for a specific user or group, add &#x60;type&#x60; and
     * GUID or name of the principal object to your API request. Upon successful execution, the API
     * returns permission details and principal information for the object specified in the API
     * request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchPermissionsOnMetadataTest() throws ApiException {
        FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest = null;
        PermissionOfMetadataResponse response =
                api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Allows sharing one or several metadata objects with users and
     * groups in ThoughtSpot. Requires edit access to the metadata object. The API endpoint allows
     * sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers
     * * Worksheets * Views * Connections You can provide &#x60;READ_ONLY&#x60; or
     * &#x60;MODIFY&#x60; access when sharing an object with another user or group. With
     * &#x60;READ_ONLY&#x60; access grants view access to the shared object, whereas
     * &#x60;MODIFY&#x60; provides edit access. To prevent a user or group from accessing the shared
     * object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to
     * &#x60;NO_ACCESS&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void shareMetadataTest() throws ApiException {
        ShareMetadataRequest shareMetadataRequest = null;
        api.shareMetadata(shareMetadataRequest);
        // TODO: test validations
    }
}
