

# SearchVersionControlRunsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runIdentifiers** | **List&lt;String&gt;** | Runs to read, as run IDs returned when each run was admitted, at most 100. Omit this to return your Org&#39;s runs, newest first. Paging applies either way. |  [optional] |
|**runType** | [**RunTypeEnum**](#RunTypeEnum) | Return only runs admitted by this operation. COMMIT is your Org&#39;s commit history, DEPLOY the content it received, RESTORE the rollbacks it ran. Omit this to return every type. |  [optional] |
|**objects** | [**List&lt;VersionControlObjectInput&gt;**](VersionControlObjectInput.md) | Return only runs that carry a result for at least one of these objects. Objects are named as on the commit endpoint, except that the type may also be LOGICAL_TABLE: a run can report a type that a commit does not accept. Omit this to return runs regardless of the objects they touched. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the runs should be included, in newest-first order. |  [optional] |
|**recordSize** | **Integer** | The number of runs that should be included, between 1 and 100. Applies to run_identifiers too: naming more runs than this returns only the first page. |  [optional] |



## Enum: RunTypeEnum

| Name | Value |
|---- | -----|
| COMMIT | &quot;COMMIT&quot; |
| DEPLOY | &quot;DEPLOY&quot; |
| RESTORE | &quot;RESTORE&quot; |


## Implemented Interfaces

* Serializable


