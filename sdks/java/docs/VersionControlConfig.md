

# VersionControlConfig

An Org's stored version control configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**org** | [**Org**](Org.md) |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Version control provider hosting the repository. |  |
|**repositoryUrl** | **String** | HTTPS URL of the repository this Org versions to. |  |
|**commitBranch** | **String** | Branch that versioning runs commit to. |  |
|**rootDir** | **String** | Repository-relative directory that every write resolves under. Empty when writes go to the repository root. |  [optional] |
|**credential** | [**VersionControlCredentialStatus**](VersionControlCredentialStatus.md) |  |  |
|**disabledOperations** | [**List&lt;DisabledOperationsEnum&gt;**](#List&lt;DisabledOperationsEnum&gt;) | Operations turned off for this Org. Empty when none are. |  |
|**createdBy** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  |  |
|**creationTimeInMillis** | **Float** | Creation time, in milliseconds since the Unix epoch. |  |
|**lastModifiedBy** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  |  |
|**modificationTimeInMillis** | **Float** | Last write time, in milliseconds since the Unix epoch. |  |



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


