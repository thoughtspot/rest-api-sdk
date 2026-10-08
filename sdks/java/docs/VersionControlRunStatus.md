

# VersionControlRunStatus

Current outcome of one run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the run, as returned when it was admitted. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Which operation admitted the run. |  |
|**state** | [**StateEnum**](#StateEnum) | Where the run stands. |  |
|**message** | **String** | What happened, in prose. Always present when state is FAILED. |  [optional] |
|**acceptedTimeInMillis** | **Float** | Admission time, in milliseconds since the Unix epoch. |  |
|**endTimeInMillis** | **Float** | Time the run reached a terminal state, in milliseconds since the Unix epoch. Absent while state is RUNNING. |  [optional] |
|**author** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  |  |
|**branch** | **String** | Branch the run used, which is the Org&#39;s configured branch at admission. A later edit to the Org&#39;s configuration does not change it. |  |
|**revision** | **String** | On a commit, the commit this run produced. On a deploy, the revision being deployed. On a restore, the restore commit. Absent until the commit is pushed, and on a run that failed before pushing. |  [optional] |
|**objects** | [**List&lt;VersionControlObjectResult&gt;**](VersionControlObjectResult.md) | Per-object outcomes known so far. This grows while state is RUNNING, and is complete once the run is terminal. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMIT | &quot;COMMIT&quot; |
| DEPLOY | &quot;DEPLOY&quot; |
| RESTORE | &quot;RESTORE&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;RUNNING&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| PARTIAL_SUCCESS | &quot;PARTIAL_SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


