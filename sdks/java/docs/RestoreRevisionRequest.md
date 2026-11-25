

# RestoreRevisionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetRevision** | **String** | Revision whose content the branch and the Org are restored to, for example a Git commit SHA. It must be reachable from your Org&#39;s configured branch, and must not be its head, since restoring the head changes nothing. |  |
|**restorePolicy** | [**RestorePolicyEnum**](#RestorePolicyEnum) | How far the run goes and how it settles per-object failures. Same values and meaning as deploy_policy on the deploy endpoint; under VALIDATE_ONLY nothing is committed either. |  [optional] |



## Enum: RestorePolicyEnum

| Name | Value |
|---- | -----|
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |


## Implemented Interfaces

* Serializable


