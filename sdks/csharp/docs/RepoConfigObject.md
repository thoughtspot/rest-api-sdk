# ThoughtSpot.RestApi.Sdk.Model.RepoConfigObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RepositoryUrl** | **string** | Remote repository URL configured | [optional] 
**Username** | **string** | Username to authenticate connection to the version control system | [optional] 
**CommitBranchName** | **string** | Name of the remote branch where objects from this Thoughtspot instance will be versioned. | [optional] 
**Branches** | **List&lt;string&gt;** | Branches that have been pulled in local repository | [optional] 
**EnableGuidMapping** | **bool?** | Maintain mapping of guid for the deployment to an instance | [optional] 
**ConfigurationBranchName** | **string** | Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained. | [optional] 
**Org** | [**Org**](Org.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

