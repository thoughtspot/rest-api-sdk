

# VersionControlObjectResult

Outcome for one object in a run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Object ID of the object. The same object carries the same ID in every Org, so this is not the Org-local GUID. On a commit this is the resolved object ID even when the request named the object by name or GUID. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the object. |  [optional] |
|**fileName** | **String** | Repository path of the object&#39;s file. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | What the run did to the object. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Outcome for the object. |  |
|**message** | **String** | Why the object is FAILED or SKIPPED, always present then. It may also carry a warning on SUCCESS or VALIDATED. |  [optional] |
|**isDependency** | **Boolean** | True for an object the request did not name, exported because a requested object depends on it. Commit runs only. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| UPSERT | &quot;UPSERT&quot; |
| DELETE | &quot;DELETE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| VALIDATED | &quot;VALIDATED&quot; |
| FAILED | &quot;FAILED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |


## Implemented Interfaces

* Serializable


