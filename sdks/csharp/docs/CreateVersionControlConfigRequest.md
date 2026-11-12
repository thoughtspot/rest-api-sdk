# ThoughtSpot.RestApi.Sdk.Model.CreateVersionControlConfigRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Provider** | **string** | Version control provider hosting the repository. Only SaaS-hosted ThoughtSpot instances can reach an external provider. | 
**RepositoryUrl** | **string** | HTTPS URL of the repository your Org versions to, for example https://github.com/example-org/example-repo.git. Plain HTTP is rejected. | 
**CommitBranch** | **string** | Branch that versioning runs commit to, for example main or prod. Every commit, deploy and restore for this Org uses this branch. | 
**RootDir** | **string** | Repository-relative directory that every write must resolve under, for example analytics/prod. The path must be relative, and each segment must begin with a letter, digit, underscore or hyphen, which keeps writes inside the directory. | [optional] 
**Credential** | [**VersionControlCredentialInput**](VersionControlCredentialInput.md) | Credential ThoughtSpot uses to reach the repository. | 
**DisabledOperations** | **List&lt;CreateVersionControlConfigRequest.DisabledOperationsEnum&gt;** | Operations to turn off for this Org. COMMIT stops the commit endpoint and DEPLOY stops the deploy endpoint; restore performs both, so disabling either one also stops a restore. Send an empty array to disable nothing. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

