# ThoughtSpotRestApiSdk.VersionControlV2Api

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCommit**](VersionControlV2Api.md#createCommit) | **POST** /api/rest/2.0/version-control/commit | 
[**createVersionControlConfig**](VersionControlV2Api.md#createVersionControlConfig) | **POST** /api/rest/2.0/version-control/config/create | 
[**deleteVersionControlConfig**](VersionControlV2Api.md#deleteVersionControlConfig) | **POST** /api/rest/2.0/version-control/config/delete | 
[**deployRevision**](VersionControlV2Api.md#deployRevision) | **POST** /api/rest/2.0/version-control/deploy | 
[**promoteBranch**](VersionControlV2Api.md#promoteBranch) | **POST** /api/rest/2.0/version-control/branch/promote | 
[**restoreRevision**](VersionControlV2Api.md#restoreRevision) | **POST** /api/rest/2.0/version-control/commit/restore | 
[**searchVersionControlConfigs**](VersionControlV2Api.md#searchVersionControlConfigs) | **POST** /api/rest/2.0/version-control/config/search | 
[**searchVersionControlRuns**](VersionControlV2Api.md#searchVersionControlRuns) | **POST** /api/rest/2.0/version-control/runs/search | 
[**updateVersionControlConfig**](VersionControlV2Api.md#updateVersionControlConfig) | **POST** /api/rest/2.0/version-control/config/update | 


# **createCommit**
> VersionControlCommitResponse createCommit(createCommitRequest)

 Version: 26.12.0.cl or later   Starts a versioning run that exports the named objects, such as Liveboards and Answers, and commits them to the branch your Org versions to. Name each object by GUID, object ID, or name with its type; it is resolved in your Org and committed by its cross-Org object ID, so object IDs must be enabled on the cluster. An object named more than once is committed once. The run is asynchronous: the response is an admission receipt carrying a `run_id`, and nothing is committed or pushed before it returns.  Admission is all or nothing, so a 4xx means nothing was admitted and the request is safe to correct and retry. Read the per-object outcomes from the run search endpoint using the returned `run_id`.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, CreateCommitRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.createCommit(
  // CreateCommitRequest
  {
    objects: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    commit_message: "commit_message_example",
    prune_deleted_object_files: false,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCommitRequest** | **CreateCommitRequest**|  |


### Return type

**VersionControlCommitResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was admitted and the versioning run has started. The body is a receipt, not a result: nothing is committed or pushed yet. |  -  |
**400** | Invalid request, and nothing was admitted. Covers a malformed body, object ids not enabled, an object that does not resolve or has no object id, a name given without its type, a type that does not match the object, a paused repository, and an org whose disabled_operations holds COMMIT. error.message names the reason. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | The caller\&#39;s org has no version control configuration. |  -  |
**409** | Conflict. A name matches more than one object of the given type; name the object by GUID or object id instead. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createVersionControlConfig**
> VersionControlConfig createVersionControlConfig(createVersionControlConfigRequest)

 Version: 26.12.0.cl or later   Configures version control for your Org, connecting it to a Git repository and the branch that versioning runs commit to.  Use this once per Org before any commit, deploy or restore. To stop versioning without discarding the settings, send `disabled_operations` on the update endpoint instead of deleting the configuration.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, CreateVersionControlConfigRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.createVersionControlConfig(
  // CreateVersionControlConfigRequest
  {
    provider: "GITHUB",
    repository_url: "repository_url_example",
    commit_branch: "commit_branch_example",
    root_dir: "root_dir_example",
    credential: null,
    disabled_operations: [
      "COMMIT",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVersionControlConfigRequest** | **CreateVersionControlConfigRequest**|  |


### Return type

**VersionControlConfig**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The stored configuration. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**409** | Conflict. The org is already configured, another org already commits to this repository and branch, or the org is still served by the legacy Callosum VCS surface. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteVersionControlConfig**
> void deleteVersionControlConfig()

 Version: 26.12.0.cl or later   Revokes version control for your Org. The configuration is deleted, the stored credential is destroyed, and any versioning run in flight for the Org fails.  Use this to disconnect an Org from its repository for good. To stop versioning but keep the settings and credential, set `disabled_operations` on the update endpoint instead.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, DeleteVersionControlConfigRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.deleteVersionControlConfig().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully revoked version control for the Org. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deployRevision**
> VersionControlDeployResponse deployRevision(deployRevisionRequest)

 Version: 26.12.0.cl or later   Starts a run that imports repository content from the branch your Org versions to into the Org itself. The run is asynchronous: the response is an admission receipt carrying a `run_id` and the pinned revision.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, DeployRevisionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.deployRevision(
  // DeployRevisionRequest
  {
    target_revision: "target_revision_example",
    deploy_type: "DELTA",
    deploy_policy: "ALL_OR_NONE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployRevisionRequest** | **DeployRevisionRequest**|  |


### Return type

**VersionControlDeployResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was admitted and the deploy run has started. The body is a receipt, not a result: nothing is imported yet. |  -  |
**400** | Invalid request, and nothing was admitted. Covers a malformed body, an unknown, ambiguous or unreachable target_revision, a paused repository, and an org whose disabled_operations holds DEPLOY. error.message names the reason. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | The caller\&#39;s org has no version control configuration. |  -  |
**409** | Conflict. Another deploy, restore or versioning run is already in flight for the caller\&#39;s org. Nothing was started; retry once it finishes. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **promoteBranch**
> VersionControlPromotionResponse promoteBranch(promoteBranchRequest)

 Version: 26.12.0.cl or later   Merges content from another Org\'s branch, or from a branch named directly, into the branch your Org versions to, and pushes the result. This is a repository-only operation: no Org\'s live content changes until a deploy.  `dry_run` defaults to true, so a request that omits it reports what would change and writes nothing. Name the source by Org or by branch; a branch must be the one some Org in your repository versions to, and the source Org must use the same repository as yours. Promoting from any Org other than your own also requires tenant administration privilege, or `ADMINISTRATION` privilege in the source Org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, PromoteBranchRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.promoteBranch(
  // PromoteBranchRequest
  {
    source: null,
    strategy: null,
    commit_message: "commit_message_example",
    dry_run: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promoteBranchRequest** | **PromoteBranchRequest**|  |


### Return type

**VersionControlPromotionResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The promotion was carried out, or with dry_run true would have been. Conflicting content appears here only when conflict_policy resolved it. |  -  |
**400** | The promotion could not be carried out, and nothing was written. Covers a source that names both or neither of an org and a branch, a cherry-pick with no source_revision, a source org that versions to a different repository, a source_branch that no org in the caller\&#39;s repository versions to, an unknown branch or commit, content that conflicts while conflict_policy is FAIL_REQUEST, which is equally a 400 on a dry run because the real promotion could not have completed either, branches with unrelated histories, and a target branch the provider protects. error.message names the reason. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. Also returned when the caller is neither a tenant administrator nor an administrator of the source org. |  -  |
**404** | An org involved has no version control configuration: the caller\&#39;s org, which then has no branch to promote into, or the org named by source.org_identifier, which then has none to promote from. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **restoreRevision**
> VersionControlRestoreResponse restoreRevision(restoreRevisionRequest)

 Version: 26.12.0.cl or later   Starts a run that restores the branch your Org versions to, and the Org itself, to an earlier revision. The revision must be reachable from the configured branch and must not be its head. The run is asynchronous and returns an admission receipt carrying a `run_id`.  Use this to roll an Org back to a known-good revision. It both commits and deploys, so it carries the same consequences as a deploy: the Org is overwritten, and objects whose files are not present at the target revision are deleted.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, RestoreRevisionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.restoreRevision(
  // RestoreRevisionRequest
  {
    target_revision: "target_revision_example",
    restore_policy: "ALL_OR_NONE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restoreRevisionRequest** | **RestoreRevisionRequest**|  |


### Return type

**VersionControlRestoreResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was admitted and the restore run has started. The body is a receipt, not a result: nothing is committed or imported yet. |  -  |
**400** | Invalid request, and nothing was admitted. Covers a malformed body, a target_revision that is unknown, ambiguous, unreachable from the branch or is its head, a paused repository, and an org whose disabled_operations holds COMMIT or DEPLOY. error.message names the reason. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | The caller\&#39;s org has no version control configuration. |  -  |
**409** | Conflict. Another restore, deploy or versioning run is already in flight for the caller\&#39;s org. Nothing was started; retry once it finishes. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchVersionControlConfigs**
> VersionControlConfigList searchVersionControlConfigs()

 Version: 26.12.0.cl or later   Returns your Org\'s version control configuration, or an empty list when the Org is not configured. The stored credential is never included; only its type and username are reported.  Use this to confirm which repository and branch an Org versions to before starting a run. The response is a list because the scope will widen to several Orgs in a later release.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, SearchVersionControlConfigsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.searchVersionControlConfigs().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**VersionControlConfigList**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Zero or one configuration. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchVersionControlRuns**
> VersionControlRunList searchVersionControlRuns(searchVersionControlRunsRequest)

 Version: 26.12.0.cl or later   Returns the commit, deploy and restore runs for your Org, newest first, each with its current state and its per-object outcomes. This is the only place per-object results are reported: a commit, deploy or restore receipt carries only a `run_id`.  Use this to follow a run to completion, to explain a `PARTIAL_SUCCESS`, or to read an Org\'s commit history by filtering on `run_type` `COMMIT`. Filters combine with AND. Filter by object using object IDs; a deleted object can still be named, so its history stays searchable. Page through the results with `record_offset` and `record_size`, which accepts between 1 and 100 runs.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, SearchVersionControlRunsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.searchVersionControlRuns(
  // SearchVersionControlRunsRequest
  {
    run_identifiers: [
      "run_identifiers_example",
    ],
    run_type: "COMMIT",
    objects: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    record_offset: 0,
    record_size: 10,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchVersionControlRunsRequest** | **SearchVersionControlRunsRequest**|  |


### Return type

**VersionControlRunList**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The runs\&#39; current outcomes. A run identifier that does not exist in the caller\&#39;s org is left out, not reported as an error. |  -  |
**400** | Invalid request. Covers a malformed body, a run identifier that is not a UUID, more than 100 run_identifiers, more than 50 objects, an object identifier that is not a well-formed object id, an object type other than LIVEBOARD, ANSWER or LOGICAL_TABLE, an unknown run_type, and a record_offset or record_size out of range. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateVersionControlConfig**
> void updateVersionControlConfig(updateVersionControlConfigRequest)

 Version: 26.12.0.cl or later   Changes your Org\'s version control configuration. Every field is optional and an omitted field keeps its stored value, so nothing is reset by leaving it out.  Use this to rotate a credential, move to a different branch, or turn individual operations off through `disabled_operations`. Changing the provider, repository, branch, directory or credential fails any versioning run already in flight.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, VersionControlV2Api, UpdateVersionControlConfigRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new VersionControlV2Api(configuration);

apiInstance.updateVersionControlConfig(
  // UpdateVersionControlConfigRequest
  {
    provider: "GITHUB",
    repository_url: "repository_url_example",
    commit_branch: "commit_branch_example",
    root_dir: "root_dir_example",
    credential: null,
    disabled_operations: [
      "COMMIT",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateVersionControlConfigRequest** | **UpdateVersionControlConfigRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully updated the version control configuration for the Org. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

