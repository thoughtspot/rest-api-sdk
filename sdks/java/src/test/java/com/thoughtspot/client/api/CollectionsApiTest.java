/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.Collection;
import com.thoughtspot.client.model.CollectionDeleteResponse;
import com.thoughtspot.client.model.CollectionSearchResponse;
import com.thoughtspot.client.model.CreateCollectionRequest;
import com.thoughtspot.client.model.DeleteCollectionRequest;
import com.thoughtspot.client.model.SearchCollectionsRequest;
import com.thoughtspot.client.model.UpdateCollectionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for CollectionsApi */
@Disabled
public class CollectionsApiTest {

    private final CollectionsApi api = new CollectionsApi();

    /**
     * Version: 26.4.0.cl or later Creates a new collection in ThoughtSpot. Collections allow you to
     * organize and group related metadata objects such as Liveboards, Answers, worksheets, and
     * other data objects. You can also create nested collections (sub-collections) to build a
     * hierarchical structure. #### Supported operations The API endpoint lets you perform the
     * following operations: * Create a new collection * Add metadata objects (Liveboards, Answers,
     * Logical Tables) to the collection * Create nested collections by adding sub-collections
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCollectionTest() throws ApiException {
        CreateCollectionRequest createCollectionRequest = null;
        Collection response = api.createCollection(createCollectionRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.4.0.cl or later Deletes one or more collections from ThoughtSpot. #### Delete
     * options * **delete_children**: When set to &#x60;true&#x60;, deletes the child objects
     * (metadata items) within the collection that the user has access to. Objects that the user
     * does not have permission to delete will be skipped. * **dry_run**: When set to
     * &#x60;true&#x60;, performs a preview of the deletion operation without actually deleting
     * anything. The response shows what would be deleted, allowing you to review before committing
     * the deletion. #### Response The response includes: * **metadata_deleted**: List of metadata
     * objects that were successfully deleted * **metadata_skipped**: List of metadata objects that
     * were skipped due to lack of permissions or other constraints
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        DeleteCollectionRequest deleteCollectionRequest = null;
        CollectionDeleteResponse response = api.deleteCollection(deleteCollectionRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.4.0.cl or later Gets a list of collections available in ThoughtSpot. To get
     * details of a specific collection, specify the collection GUID or name. You can also filter
     * the API response based on the collection name pattern, author, and other criteria. ####
     * Search options * **name_pattern**: Use &#39;%&#39; as a wildcard character to match
     * collection names * **collection_identifiers**: Search for specific collections by their GUIDs
     * or names * **include_metadata**: When set to &#x60;true&#x60;, includes the metadata objects
     * within each collection in the response **NOTE**: If the API returns an empty list, consider
     * increasing the value of the &#x60;record_size&#x60; parameter. To search across all available
     * collections, set &#x60;record_size&#x60; to &#x60;-1&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCollectionsTest() throws ApiException {
        SearchCollectionsRequest searchCollectionsRequest = null;
        CollectionSearchResponse response = api.searchCollections(searchCollectionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.4.0.cl or later Updates an existing collection in ThoughtSpot. #### Supported
     * operations This API endpoint lets you perform the following operations: * Update collection
     * name and description * Change visibility settings * Add metadata objects to the collection
     * (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace
     * all metadata objects in the collection (operation: REPLACE) #### Operation types * **ADD**:
     * Adds the specified metadata objects to the existing collection without removing current items
     * * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**:
     * Replaces all existing metadata objects with the specified items (default behavior)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String collectionIdentifier = null;
        UpdateCollectionRequest updateCollectionRequest = null;
        api.updateCollection(collectionIdentifier, updateCollectionRequest);
        // TODO: test validations
    }
}
