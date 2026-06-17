# ThoughtSpot.Client.Model.UpdateConfigRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **string** | Username to authenticate connection to version control system | [optional] 
**AccessToken** | **string** | Access token corresponding to the user to authenticate connection to version control system | [optional] 
**OrgIdentifier** | **string** |    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\&quot;OrgID1-or-Name1\&quot;, \&quot;OrgID2-or-Name2\&quot;]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later  | [optional] 
**BranchNames** | **List&lt;string&gt;** | List the remote branches to configure. Example:[development, production] | [optional] 
**CommitBranchName** | **string** | Name of the remote branch where objects from this Thoughtspot instance will be versioned.    Version: 9.7.0.cl or later  | [optional] 
**EnableGuidMapping** | **bool?** | Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later  | [optional] 
**ConfigurationBranchName** | **string** | Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.    Version: 9.7.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

