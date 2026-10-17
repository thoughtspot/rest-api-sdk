

# CreateVersionControlConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | [**ProviderEnum**](#ProviderEnum) | Version control provider hosting the repository. Only SaaS-hosted ThoughtSpot instances can reach an external provider. |  |
|**repositoryUrl** | **String** | HTTPS URL of the repository your Org versions to, for example https://github.com/example-org/example-repo.git. Plain HTTP is rejected. |  |
|**commitBranch** | **String** | Branch that versioning runs commit to, for example main or prod. Every commit, deploy and restore for this Org uses this branch. |  |
|**rootDir** | **String** | Repository-relative directory that every write must resolve under, for example analytics/prod. The path must be relative, and each segment must begin with a letter, digit, underscore or hyphen, which keeps writes inside the directory. |  [optional] |
|**credential** | [**VersionControlCredentialInput**](VersionControlCredentialInput.md) | Credential ThoughtSpot uses to reach the repository. |  |
|**disabledOperations** | [**List&lt;DisabledOperationsEnum&gt;**](#List&lt;DisabledOperationsEnum&gt;) | Operations to turn off for this Org. COMMIT stops the commit endpoint and DEPLOY stops the deploy endpoint; restore performs both, so disabling either one also stops a restore. Send an empty array to disable nothing. |  [optional] |



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


