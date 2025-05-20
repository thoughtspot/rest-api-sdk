/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.api;


import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.model.CommitBranchRequest;
import org.thoughtspot.client.model.CommitHistoryResponse;
import org.thoughtspot.client.model.CommitResponse;
import org.thoughtspot.client.model.CreateConfigRequest;
import org.thoughtspot.client.model.DeleteConfigRequest;
import org.thoughtspot.client.model.DeployCommitRequest;
import org.thoughtspot.client.model.DeployResponse;
import org.thoughtspot.client.model.RepoConfigObject;
import org.thoughtspot.client.model.RevertCommitRequest;
import org.thoughtspot.client.model.RevertResponse;
import org.thoughtspot.client.model.SearchCommitsRequest;
import org.thoughtspot.client.model.SearchConfigRequest;
import org.thoughtspot.client.model.UpdateConfigRequest;
import org.thoughtspot.client.model.ValidateMergeRequest;

/** API tests for VersionControlApi */
@Disabled
public class VersionControlApiTest {

    private final VersionControlApi api = new VersionControlApi();

    /**
     * Version: 9.2.0.cl or later Commits TML files of metadata objects to the Git branch configured
     * on your instance. Requires at least edit access to objects used in the commit operation.
     * Before using this endpoint to push your commits: * Enable Git integration on your instance. *
     * Make sure the Git repository and branch details are configured on your instance. For more
     * information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/git-integration).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commitBranchTest() throws ApiException {
        CommitBranchRequest commitBranchRequest = null;
        CommitResponse response = api.commitBranch(commitBranchRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Allows you to connect a ThoughtSpot instance to a Git repository.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up
     * version control**) privilege. You can use this API endpoint to connect your ThoughtSpot
     * development and production environments to the development and production branches of a Git
     * repository. Before using this endpoint to connect your ThoughtSpot instance to a Git
     * repository, check the following prerequisites: * You have a Git repository. If you are using
     * GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to
     * GitHub. For information about generating a token, see [GitHub
     * Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).
     * * Your access token has &#x60;repo&#x60; scope that grants full access to public and private
     * repositories. * Your Git repository has a branch that can be configured as a default branch
     * in ThoughtSpot. For more information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/?pageid&#x3D;git-integration).
     * **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConfigTest() throws ApiException {
        CreateConfigRequest createConfigRequest = null;
        RepoConfigObject response = api.createConfig(createConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Deletes Git repository configuration from your ThoughtSpot
     * instance. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up
     * version control**) privilege.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConfigTest() throws ApiException {
        DeleteConfigRequest deleteConfigRequest = null;
        api.deleteConfig(deleteConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Allows you to deploy a commit and publish TML content to your
     * ThoughtSpot instance. Requires at least edit access to the objects used in the deploy
     * operation. The API deploys the head of the branch unless a &#x60;commit_id&#x60; is specified
     * in the API request. If the branch name is not defined in the request, the default branch is
     * considered for deploying commits. For more information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/git-integration).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deployCommitTest() throws ApiException {
        DeployCommitRequest deployCommitRequest = null;
        List<DeployResponse> response = api.deployCommit(deployCommitRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Reverts TML objects to a previous commit specified in the API
     * request. Requires at least edit access to objects. In the API request, specify the
     * &#x60;commit_id&#x60;. If the branch name is not specified in the request, the API will
     * consider the default branch configured on your instance. By default, the API reverts all
     * objects. If the revert operation fails for one of the objects provided in the commit, the API
     * returns an error and does not revert any object. For more information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/git-integration).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revertCommitTest() throws ApiException {
        String commitId = null;
        RevertCommitRequest revertCommitRequest = null;
        RevertResponse response = api.revertCommit(commitId, revertCommitRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets a list of commits for a given metadata object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your
     * instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     * privilege and edit access to the metadata objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCommitsTest() throws ApiException {
        SearchCommitsRequest searchCommitsRequest = null;
        List<CommitHistoryResponse> response = api.searchCommits(searchCommitsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets Git repository connections configured on the ThoughtSpot
     * instance. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up
     * version control**) privilege.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchConfigTest() throws ApiException {
        SearchConfigRequest searchConfigRequest = null;
        List<RepoConfigObject> response = api.searchConfig(searchConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Updates Git repository configuration settings. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on
     * your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**)
     * privilege.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigTest() throws ApiException {
        UpdateConfigRequest updateConfigRequest = null;
        RepoConfigObject response = api.updateConfig(updateConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Validates the content of your source branch against the objects in
     * your destination environment. Before merging content from your source branch to the
     * destination branch, run this API operation from your destination environment and ensure that
     * the changes from the source branch function in the destination environment. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your
     * instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     * privilege and edit access to the metadata objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateMergeTest() throws ApiException {
        ValidateMergeRequest validateMergeRequest = null;
        List<DeployResponse> response = api.validateMerge(validateMergeRequest);
        // TODO: test validations
    }
}
