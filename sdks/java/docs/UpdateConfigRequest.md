

# UpdateConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username to authenticate connection to version control system |  [optional] |
|**accessToken** | **String** | Access token corresponding to the user to authenticate connection to version control system |  [optional] |
|**orgIdentifier** | **String** |    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\&quot;OrgID1-or-Name1\&quot;, \&quot;OrgID2-or-Name2\&quot;]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later  |  [optional] |
|**branchNames** | **List&lt;String&gt;** | List the remote branches to configure. Example:[development, production] |  [optional] |
|**commitBranchName** | **String** | Name of the remote branch where objects from this Thoughtspot instance will be versioned.    Version: 9.7.0.cl or later  |  [optional] |
|**enableGuidMapping** | **Boolean** | Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later  |  [optional] |
|**configurationBranchName** | **String** | Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.    Version: 9.7.0.cl or later  |  [optional] |



