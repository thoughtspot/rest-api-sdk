

# DeployCommitRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commitId** | **String** |    Commit_id against which the files should be picked to deploy.      Note: If no commit_id is specified, then the head of the branch is considered. |  [optional] |
|**branchName** | **String** | Name of the remote branch where changes should be picked |  |
|**deployType** | [**DeployTypeEnum**](#DeployTypeEnum) | Indicates if all files or only modified file at specified commit point should be considered |  [optional] |
|**deployPolicy** | [**DeployPolicyEnum**](#DeployPolicyEnum) | Define the policy to follow while importing TML in the ThoughtSpot environment. Use “ALL_OR_NONE” to cancel the deployment of all ThoughtSpot objects if at least one of them fails to import. Use “Partial” to import ThoughtSpot objects that validate successfully even if other objects in the same deploy operations fail to import. |  [optional] |



## Enum: DeployTypeEnum

| Name | Value |
|---- | -----|
| FULL | &quot;FULL&quot; |
| DELTA | &quot;DELTA&quot; |



## Enum: DeployPolicyEnum

| Name | Value |
|---- | -----|
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |


## Implemented Interfaces

* Serializable


