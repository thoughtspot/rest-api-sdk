

# UpdateVersionControlConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | [**ProviderEnum**](#ProviderEnum) | Version control provider hosting the repository. Omit this to leave the stored provider unchanged. |  [optional] |
|**repositoryUrl** | **String** | HTTPS URL of the repository your Org versions to. Omit this to leave the stored repository unchanged. |  [optional] |
|**commitBranch** | **String** | Branch that versioning runs commit to. Omit this to leave the stored branch unchanged. |  [optional] |
|**rootDir** | **String** | Repository-relative directory that every write must resolve under. Omit this to leave the stored directory unchanged. |  [optional] |
|**credential** | [**VersionControlCredentialInput**](VersionControlCredentialInput.md) | Credential ThoughtSpot uses to reach the repository. Omit this to keep the stored credential, unless the provider, host or repository owner changed, in which case a new credential is required. |  [optional] |
|**disabledOperations** | [**List&lt;DisabledOperationsEnum&gt;**](#List&lt;DisabledOperationsEnum&gt;) | Operations to turn off for this Org, replacing whatever is stored. Send an empty array to disable nothing. Omit this to leave the stored set unchanged. |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| GITHUB | &quot;GITHUB&quot; |
| GITLAB | &quot;GITLAB&quot; |
| BITBUCKET | &quot;BITBUCKET&quot; |
| AZURE_DEVOPS | &quot;AZURE_DEVOPS&quot; |



## Enum: List&lt;DisabledOperationsEnum&gt;

| Name | Value |
|---- | -----|
| COMMIT | &quot;COMMIT&quot; |
| DEPLOY | &quot;DEPLOY&quot; |


## Implemented Interfaces

* Serializable


