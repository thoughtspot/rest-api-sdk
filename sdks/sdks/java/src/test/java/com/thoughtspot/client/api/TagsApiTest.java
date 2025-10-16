/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AssignTagRequest;
import com.thoughtspot.client.model.CreateTagRequest;
import com.thoughtspot.client.model.SearchTagsRequest;
import com.thoughtspot.client.model.Tag;
import com.thoughtspot.client.model.UpdateTagRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for TagsApi */
@Disabled
public class TagsApiTest {

    private final TagsApi api = new TagsApi();

    /**
     * Version: 9.0.0.cl or later Assigns tags to Liveboards, Answers, Tables, and Worksheets.
     * Requires edit access to the metadata object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignTagTest() throws ApiException {
        AssignTagRequest assignTagRequest = null;
        api.assignTag(assignTagRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates a tag object. Tags are labels that identify a metadata
     * object. For example, you can create a tag to designate subject areas, such as sales, HR,
     * marketing, and finance. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and
     * delete tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        CreateTagRequest createTagRequest = null;
        Tag response = api.createTag(createTagRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Deletes a tag object from the ThoughtSpot system Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit,
     * and delete tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tagIdentifier = null;
        api.deleteTag(tagIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of tag objects available on the ThoughtSpot system. To
     * get details of a specific tag object, specify the GUID or name. Any authenticated user can
     * search for tag objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTagsTest() throws ApiException {
        SearchTagsRequest searchTagsRequest = null;
        List<Tag> response = api.searchTags(searchTagsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Removes the tags applied to a Liveboard, Answer, Table, or
     * Worksheet. Requires edit access to the metadata object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignTagTest() throws ApiException {
        AssignTagRequest assignTagRequest = null;
        api.unassignTag(assignTagRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates a tag object. You can modify the &#x60;name&#x60; and
     * &#x60;color&#x60; properties of a tag object. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and
     * delete tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTagTest() throws ApiException {
        String tagIdentifier = null;
        UpdateTagRequest updateTagRequest = null;
        api.updateTag(tagIdentifier, updateTagRequest);
        // TODO: test validations
    }
}
