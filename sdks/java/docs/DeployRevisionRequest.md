

# DeployRevisionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetRevision** | **String** | Revision to deploy, for example a Git commit SHA. Omit this to resolve and pin the head of your Org&#39;s configured branch. Either way the revision must be reachable from that branch. |  [optional] |
|**deployType** | [**DeployTypeEnum**](#DeployTypeEnum) | What to compare the revision against. DELTA compares it with the revision this Org last received, which is what makes the Org converge on the branch. FULL ignores the deploy marker, treats every object at the revision as a change, and observes no removals. |  [optional] |
|**deployPolicy** | [**DeployPolicyEnum**](#DeployPolicyEnum) | How far the run goes and how it settles per-object failures. |  [optional] |



## Enum: DeployTypeEnum

| Name | Value |
|---- | -----|
| DELTA | &quot;DELTA&quot; |
| FULL | &quot;FULL&quot; |



## Enum: DeployPolicyEnum

| Name | Value |
|---- | -----|
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |


## Implemented Interfaces

* Serializable


