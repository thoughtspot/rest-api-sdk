

# CreateConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**repositoryUrl** | **String** | URL for connecting to remote repository |  |
|**username** | **String** | Username to authenticate connection to remote repository |  |
|**accessToken** | **String** | Access token corresponding to the user to authenticate connection to remote repository |  |
|**orgIdentifier** | **String** |    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\&quot;OrgID1-or-Name1\&quot;, \&quot;OrgID2-or-Name2\&quot;]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later  |  [optional] |
|**branchNames** | **List&lt;String&gt;** | List the remote branches to configure. Example:[development, production] |  [optional] |
|**commitBranchName** | **String** | Name of the remote branch where objects from this Thoughtspot instance will be versioned.    Version: 9.7.0.cl or later  |  [optional] |
|**defaultBranchName** | **String** |    Use commit_branch_name instead.      Name of the remote branch where objects from this Thoughtspot instance will be versioned.        *Deprecated from 10.0.0.cl : Replaced by commit_branch_name*  |  [optional] |
|**enableGuidMapping** | **Boolean** | Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later  |  [optional] |
|**configurationBranchName** | **String** |    Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.      Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.    Version: 9.7.0.cl or later  |  [optional] |
|**guidMappingBranchName** | **String** |    Use configuration_branch_name instead.      Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.        Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.         *Deprecated from 10.0.0.cl : Replaced by configuration_branch_name*     Version: 9.4.0.cl or later  |  [optional] |



