/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateCommitRequest;
import com.thoughtspot.client.model.CreateVersionControlConfigRequest;
import com.thoughtspot.client.model.DeployRevisionRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.PromoteBranchRequest;
import com.thoughtspot.client.model.RestoreRevisionRequest;
import com.thoughtspot.client.model.SearchVersionControlRunsRequest;
import com.thoughtspot.client.model.UpdateVersionControlConfigRequest;
import com.thoughtspot.client.model.VersionControlCommitResponse;
import com.thoughtspot.client.model.VersionControlConfig;
import com.thoughtspot.client.model.VersionControlConfigList;
import com.thoughtspot.client.model.VersionControlDeployResponse;
import com.thoughtspot.client.model.VersionControlPromotionResponse;
import com.thoughtspot.client.model.VersionControlRestoreResponse;
import com.thoughtspot.client.model.VersionControlRunList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for VersionControlV2Api
 */
@Disabled
public class VersionControlV2ApiTest {

    private final VersionControlV2Api api = new VersionControlV2Api();

    /**
     *  Version: 26.12.0.cl or later   Starts a versioning run that exports the named objects, such as Liveboards and Answers, and commits them to the branch your Org versions to. Name each object by GUID, object ID, or name with its type; it is resolved in your Org and committed by its cross-Org object ID, so object IDs must be enabled on the cluster. An object named more than once is committed once. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60;, and nothing is committed or pushed before it returns.  Admission is all or nothing, so a 4xx means nothing was admitted and the request is safe to correct and retry. Read the per-object outcomes from the run search endpoint using the returned &#x60;run_id&#x60;.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCommitTest() throws ApiException {
        CreateCommitRequest createCommitRequest = null;
        VersionControlCommitResponse response = api.createCommit(createCommitRequest);
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Configures version control for your Org, connecting it to a Git repository and the branch that versioning runs commit to.  Use this once per Org before any commit, deploy or restore. To stop versioning without discarding the settings, send &#x60;disabled_operations&#x60; on the update endpoint instead of deleting the configuration.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVersionControlConfigTest() throws ApiException {
        CreateVersionControlConfigRequest createVersionControlConfigRequest = null;
        VersionControlConfig response = api.createVersionControlConfig(createVersionControlConfigRequest);
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Revokes version control for your Org. The configuration is deleted, the stored credential is destroyed, and any versioning run in flight for the Org fails.  Use this to disconnect an Org from its repository for good. To stop versioning but keep the settings and credential, set &#x60;disabled_operations&#x60; on the update endpoint instead.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVersionControlConfigTest() throws ApiException {
        api.deleteVersionControlConfig();
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Starts a run that imports repository content from the branch your Org versions to into the Org itself. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60; and the pinned revision.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deployRevisionTest() throws ApiException {
        DeployRevisionRequest deployRevisionRequest = null;
        VersionControlDeployResponse response = api.deployRevision(deployRevisionRequest);
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Merges content from another Org&#39;s branch, or from a branch named directly, into the branch your Org versions to, and pushes the result. This is a repository-only operation: no Org&#39;s live content changes until a deploy.  &#x60;dry_run&#x60; defaults to true, so a request that omits it reports what would change and writes nothing. Name the source by Org or by branch; a branch must be the one some Org in your repository versions to, and the source Org must use the same repository as yours. Promoting from any Org other than your own also requires tenant administration privilege, or &#x60;ADMINISTRATION&#x60; privilege in the source Org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void promoteBranchTest() throws ApiException {
        PromoteBranchRequest promoteBranchRequest = null;
        VersionControlPromotionResponse response = api.promoteBranch(promoteBranchRequest);
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Starts a run that restores the branch your Org versions to, and the Org itself, to an earlier revision. The revision must be reachable from the configured branch and must not be its head. The run is asynchronous and returns an admission receipt carrying a &#x60;run_id&#x60;.  Use this to roll an Org back to a known-good revision. It both commits and deploys, so it carries the same consequences as a deploy: the Org is overwritten, and objects whose files are not present at the target revision are deleted.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restoreRevisionTest() throws ApiException {
        RestoreRevisionRequest restoreRevisionRequest = null;
        VersionControlRestoreResponse response = api.restoreRevision(restoreRevisionRequest);
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Returns your Org&#39;s version control configuration, or an empty list when the Org is not configured. The stored credential is never included; only its type and username are reported.  Use this to confirm which repository and branch an Org versions to before starting a run. The response is a list because the scope will widen to several Orgs in a later release.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchVersionControlConfigsTest() throws ApiException {
        VersionControlConfigList response = api.searchVersionControlConfigs();
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Returns the commit, deploy and restore runs for your Org, newest first, each with its current state and its per-object outcomes. This is the only place per-object results are reported: a commit, deploy or restore receipt carries only a &#x60;run_id&#x60;.  Use this to follow a run to completion, to explain a &#x60;PARTIAL_SUCCESS&#x60;, or to read an Org&#39;s commit history by filtering on &#x60;run_type&#x60; &#x60;COMMIT&#x60;. Filters combine with AND. Filter by object using object IDs; a deleted object can still be named, so its history stays searchable. Page through the results with &#x60;record_offset&#x60; and &#x60;record_size&#x60;, which accepts between 1 and 100 runs.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchVersionControlRunsTest() throws ApiException {
        SearchVersionControlRunsRequest searchVersionControlRunsRequest = null;
        VersionControlRunList response = api.searchVersionControlRuns(searchVersionControlRunsRequest);
        // TODO: test validations
    }

    /**
     *  Version: 26.12.0.cl or later   Changes your Org&#39;s version control configuration. Every field is optional and an omitted field keeps its stored value, so nothing is reset by leaving it out.  Use this to rotate a credential, move to a different branch, or turn individual operations off through &#x60;disabled_operations&#x60;. Changing the provider, repository, branch, directory or credential fails any versioning run already in flight.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVersionControlConfigTest() throws ApiException {
        UpdateVersionControlConfigRequest updateVersionControlConfigRequest = null;
        api.updateVersionControlConfig(updateVersionControlConfigRequest);
        // TODO: test validations
    }

}
