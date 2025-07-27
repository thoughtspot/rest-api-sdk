# VersionControlApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**commitBranch**](VersionControlApi.md#commitBranch) | **POST** /api/rest/2.0/vcs/git/branches/commit |
| [**createConfig**](VersionControlApi.md#createConfig) | **POST** /api/rest/2.0/vcs/git/config/create |
| [**deleteConfig**](VersionControlApi.md#deleteConfig) | **POST** /api/rest/2.0/vcs/git/config/delete |
| [**deployCommit**](VersionControlApi.md#deployCommit) | **POST** /api/rest/2.0/vcs/git/commits/deploy |
| [**revertCommit**](VersionControlApi.md#revertCommit) | **POST** /api/rest/2.0/vcs/git/commits/{commit_id}/revert |
| [**searchCommits**](VersionControlApi.md#searchCommits) | **POST** /api/rest/2.0/vcs/git/commits/search |
| [**searchConfig**](VersionControlApi.md#searchConfig) | **POST** /api/rest/2.0/vcs/git/config/search |
| [**updateConfig**](VersionControlApi.md#updateConfig) | **POST** /api/rest/2.0/vcs/git/config/update |
| [**validateMerge**](VersionControlApi.md#validateMerge) | **POST** /api/rest/2.0/vcs/git/branches/validate |


<a id="commitBranch"></a>
# **commitBranch**
> CommitResponse commitBranch(commitBranchRequest)



  Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **commitBranchRequest** | [**CommitBranchRequest**](CommitBranchRequest.md)

### Return type

[**CommitResponse**](CommitResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully committed the metadata objects |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createConfig"></a>
# **createConfig**
> RepoConfigObject createConfig(createConfigRequest)



  Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has &#x60;repo&#x60; scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid&#x3D;git-integration).  **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConfigRequest** | [**CreateConfigRequest**](CreateConfigRequest.md)

### Return type

[**RepoConfigObject**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully configured local repository |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteConfig"></a>
# **deleteConfig**
> deleteConfig(deleteConfigRequest)



  Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteConfigRequest** | [**DeleteConfigRequest**](DeleteConfigRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deployCommit"></a>
# **deployCommit**
> List&lt;DeployResponse&gt; deployCommit(deployCommitRequest)



  Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a &#x60;commit_id&#x60; is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deployCommitRequest** | [**DeployCommitRequest**](DeployCommitRequest.md)

### Return type

[**List&lt;DeployResponse&gt;**](DeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deployed the changes |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="revertCommit"></a>
# **revertCommit**
> RevertResponse revertCommit(commitId, revertCommitRequest)



  Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the &#x60;commit_id&#x60;. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **commitId** | **String**
| **revertCommitRequest** | [**RevertCommitRequest**](RevertCommitRequest.md)

### Return type

[**RevertResponse**](RevertResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reverted the object to the commit point specified |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchCommits"></a>
# **searchCommits**
> List&lt;CommitHistoryResponse&gt; searchCommits(searchCommitsRequest)



  Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege and edit access to the metadata objects.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCommitsRequest** | [**SearchCommitsRequest**](SearchCommitsRequest.md)

### Return type

[**List&lt;CommitHistoryResponse&gt;**](CommitHistoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Commit history of the metadata object |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchConfig"></a>
# **searchConfig**
> List&lt;RepoConfigObject&gt; searchConfig(searchConfigRequest)



  Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchConfigRequest** | [**SearchConfigRequest**](SearchConfigRequest.md)

### Return type

[**List&lt;RepoConfigObject&gt;**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateConfig"></a>
# **updateConfig**
> RepoConfigObject updateConfig(updateConfigRequest)



  Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateConfigRequest** | [**UpdateConfigRequest**](UpdateConfigRequest.md)

### Return type

[**RepoConfigObject**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="validateMerge"></a>
# **validateMerge**
> List&lt;DeployResponse&gt; validateMerge(validateMergeRequest)



  Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege and edit access to the metadata objects.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **validateMergeRequest** | [**ValidateMergeRequest**](ValidateMergeRequest.md)

### Return type

[**List&lt;DeployResponse&gt;**](DeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | validation done successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

