

# SearchFeaturesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Determines the administrative view for the search. Use CLUSTER for the cluster-admin view (returns org assignments per feature); use ORG for the org-admin view (returns the current value of each feature assigned to the org). |  |
|**orgIdentifier** | **Integer** | Numeric ID of the Org to scope the search to. Required when scope is ORG; ignored when scope is CLUSTER. |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | Category of features to return. GENERAL_ACCESS returns features that are generally available; EARLY_ACCESS returns features still in early access. Defaults to GENERAL_ACCESS. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| GENERAL_ACCESS | &quot;GENERAL_ACCESS&quot; |
| EARLY_ACCESS | &quot;EARLY_ACCESS&quot; |


## Implemented Interfaces

* Serializable


