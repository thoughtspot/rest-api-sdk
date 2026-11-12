

# VersionControlPromoteStrategyInput

How a promotion is applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | How the source is applied to the target branch. |  |
|**conflictPolicy** | [**ConflictPolicyEnum**](#ConflictPolicyEnum) | What to do when files conflict. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MERGE | &quot;MERGE&quot; |
| SQUASH | &quot;SQUASH&quot; |
| FAST_FORWARD | &quot;FAST_FORWARD&quot; |
| CHERRY_PICK | &quot;CHERRY_PICK&quot; |



## Enum: ConflictPolicyEnum

| Name | Value |
|---- | -----|
| FAIL_REQUEST | &quot;FAIL_REQUEST&quot; |
| USE_SOURCE | &quot;USE_SOURCE&quot; |
| USE_TARGET | &quot;USE_TARGET&quot; |


## Implemented Interfaces

* Serializable


