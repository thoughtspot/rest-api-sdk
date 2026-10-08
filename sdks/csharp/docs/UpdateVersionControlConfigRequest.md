# ThoughtSpot.RestApi.Sdk.Model.UpdateVersionControlConfigRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Provider** | **string** | Version control provider hosting the repository. Omit this to leave the stored provider unchanged. | [optional] 
**RepositoryUrl** | **string** | HTTPS URL of the repository your Org versions to. Omit this to leave the stored repository unchanged. | [optional] 
**CommitBranch** | **string** | Branch that versioning runs commit to. Omit this to leave the stored branch unchanged. | [optional] 
**RootDir** | **string** | Repository-relative directory that every write must resolve under. Omit this to leave the stored directory unchanged. | [optional] 
**Credential** | [**VersionControlCredentialInput**](VersionControlCredentialInput.md) | Credential ThoughtSpot uses to reach the repository. Omit this to keep the stored credential, unless the provider, host or repository owner changed, in which case a new credential is required. | [optional] 
**DisabledOperations** | **List&lt;UpdateVersionControlConfigRequest.DisabledOperationsEnum&gt;** | Operations to turn off for this Org, replacing whatever is stored. Send an empty array to disable nothing. Omit this to leave the stored set unchanged. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

