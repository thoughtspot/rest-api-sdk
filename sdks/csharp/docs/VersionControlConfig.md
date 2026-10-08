# ThoughtSpot.RestApi.Sdk.Model.VersionControlConfig
An Org's stored version control configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Org** | [**Org**](Org.md) |  | 
**Provider** | **string** | Version control provider hosting the repository. | 
**RepositoryUrl** | **string** | HTTPS URL of the repository this Org versions to. | 
**CommitBranch** | **string** | Branch that versioning runs commit to. | 
**RootDir** | **string** | Repository-relative directory that every write resolves under. Absent when writes go to the repository root. | [optional] 
**Credential** | [**VersionControlCredentialStatus**](VersionControlCredentialStatus.md) |  | 
**DisabledOperations** | **List&lt;VersionControlConfig.DisabledOperationsEnum&gt;** | Operations turned off for this Org. Empty when none are. | 
**CreatedBy** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  | 
**CreationTimeInMillis** | **float** | Creation time, in milliseconds since the Unix epoch. | 
**LastModifiedBy** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  | 
**ModificationTimeInMillis** | **float** | Last write time, in milliseconds since the Unix epoch. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

