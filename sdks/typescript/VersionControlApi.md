# ThoughtSpotRestApiSdk.VersionControlApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commitBranch**](VersionControlApi.md#commitBranch) | **POST** /api/rest/2.0/vcs/git/branches/commit | 
[**createConfig**](VersionControlApi.md#createConfig) | **POST** /api/rest/2.0/vcs/git/config/create | 
[**deleteConfig**](VersionControlApi.md#deleteConfig) | **POST** /api/rest/2.0/vcs/git/config/delete | 
[**deployCommit**](VersionControlApi.md#deployCommit) | **POST** /api/rest/2.0/vcs/git/commits/deploy | 
[**revertCommit**](VersionControlApi.md#revertCommit) | **POST** /api/rest/2.0/vcs/git/commits/{commit_id}/revert | 
[**searchCommits**](VersionControlApi.md#searchCommits) | **POST** /api/rest/2.0/vcs/git/commits/search | 
[**searchConfig**](VersionControlApi.md#searchConfig) | **POST** /api/rest/2.0/vcs/git/config/search | 
[**updateConfig**](VersionControlApi.md#updateConfig) | **POST** /api/rest/2.0/vcs/git/config/update | 
[**validateMerge**](VersionControlApi.md#validateMerge) | **POST** /api/rest/2.0/vcs/git/branches/validate | 


# **commitBranch**
> CommitResponse commitBranch(commitBranchRequest)

  Version: 9.2.0.cl or later  Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, CommitBranchRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.commitBranch(
  // CommitBranchRequest
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    delete_aware: true,
    branch_name: "branch_name_example",
    comment: "comment_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitBranchRequest** | **CommitBranchRequest**|  |


### Return type

**CommitResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully committed the metadata objects |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createConfig**
> RepoConfigObject createConfig(createConfigRequest)

  Version: 9.2.0.cl or later  Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, CreateConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.createConfig(
  // CreateConfigRequest
  {
    repository_url: "repository_url_example",
    username: "username_example",
    access_token: "access_token_example",
    org_identifier: "org_identifier_example",
    branch_names: [
      "branch_names_example",
    ],
    commit_branch_name: "commit_branch_name_example",
    default_branch_name: "default_branch_name_example",
    enable_guid_mapping: true,
    configuration_branch_name: "configuration_branch_name_example",
    guid_mapping_branch_name: "guid_mapping_branch_name_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConfigRequest** | **CreateConfigRequest**|  |


### Return type

**RepoConfigObject**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully configured local repository |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteConfig**
> void deleteConfig()

  Version: 9.2.0.cl or later  Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, DeleteConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.deleteConfig(
  // DeleteConfigRequest (optional)
  {
    cluster_level: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteConfigRequest** | **DeleteConfigRequest**|  |


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
**204** | Successfully deleted local repository configuration |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deployCommit**
> Array<DeployResponse> deployCommit(deployCommitRequest)

  Version: 9.2.0.cl or later  Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, DeployCommitRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.deployCommit(
  // DeployCommitRequest
  {
    commit_id: "commit_id_example",
    branch_name: "branch_name_example",
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
 **deployCommitRequest** | **DeployCommitRequest**|  |


### Return type

**Array<DeployResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deployed the changes |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **revertCommit**
> RevertResponse revertCommit()

  Version: 9.2.0.cl or later  Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, RevertCommitRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.revertCommit(
  // string | Commit id to which the object should be reverted
  "commit_id_example" , 
  // RevertCommitRequest (optional)
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    branch_name: "branch_name_example",
    revert_policy: "ALL_OR_NONE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revertCommitRequest** | **RevertCommitRequest**|  |
 **commitId** | [**string**] | Commit id to which the object should be reverted | defaults to undefined


### Return type

**RevertResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Reverted the object to the commit point specified |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchCommits**
> Array<CommitHistoryResponse> searchCommits(searchCommitsRequest)

  Version: 9.2.0.cl or later  Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, SearchCommitsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.searchCommits(
  // SearchCommitsRequest
  {
    metadata_identifier: "metadata_identifier_example",
    metadata_type: "LIVEBOARD",
    branch_name: "branch_name_example",
    record_offset: 1,
    record_size: 1,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCommitsRequest** | **SearchCommitsRequest**|  |


### Return type

**Array<CommitHistoryResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Commit history of the metadata object |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchConfig**
> Array<RepoConfigObject> searchConfig()

  Version: 9.2.0.cl or later  Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, SearchConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.searchConfig(
  // SearchConfigRequest (optional)
  {
    org_identifiers: [
      "org_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchConfigRequest** | **SearchConfigRequest**|  |


### Return type

**Array<RepoConfigObject>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of local repository configuration |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateConfig**
> RepoConfigObject updateConfig()

  Version: 9.2.0.cl or later  Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, UpdateConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.updateConfig(
  // UpdateConfigRequest (optional)
  {
    username: "username_example",
    access_token: "access_token_example",
    org_identifier: "org_identifier_example",
    branch_names: [
      "branch_names_example",
    ],
    commit_branch_name: "commit_branch_name_example",
    default_branch_name: "default_branch_name_example",
    enable_guid_mapping: true,
    configuration_branch_name: "configuration_branch_name_example",
    guid_mapping_branch_name: "guid_mapping_branch_name_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConfigRequest** | **UpdateConfigRequest**|  |


### Return type

**RepoConfigObject**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated local repository configuration |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **validateMerge**
> Array<DeployResponse> validateMerge(validateMergeRequest)

  Version: 9.2.0.cl or later  Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, VersionControlApi, ValidateMergeRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new VersionControlApi(configuration);

apiInstance.validateMerge(
  // ValidateMergeRequest
  {
    source_branch_name: "source_branch_name_example",
    target_branch_name: "target_branch_name_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateMergeRequest** | **ValidateMergeRequest**|  |


### Return type

**Array<DeployResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | validation done successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

