

# SearchStyleCustomizationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the style preferences to retrieve. CLUSTER returns cluster-level defaults. ORG returns preferences for the authenticated user&#39;s org, which may override cluster defaults. If not specified, returns both cluster and org preferences based on user privileges. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


