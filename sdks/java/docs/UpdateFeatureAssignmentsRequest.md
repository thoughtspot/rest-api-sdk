

# UpdateFeatureAssignmentsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureIdentifier** | **String** | User-friendly feature name (feature_name) or the underlying feature ID (feature_id) of the feature whose Org assignments should be updated. |  |
|**orgIdentifiers** | **List&lt;Integer&gt;** | Numeric IDs of the Orgs to assign to the feature. Send an empty array with operation REPLACE to clear all Org assignments for this feature. |  |
|**operation** | [**OperationEnum**](#OperationEnum) | Type of update to apply to the Org assignments. ADD assigns the given Orgs in addition to existing ones; REMOVE unassigns the given Orgs; REPLACE sets the assignment to exactly the given Orgs. Defaults to REPLACE. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |


## Implemented Interfaces

* Serializable


