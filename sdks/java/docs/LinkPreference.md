

# LinkPreference

Link templates for a single scope.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope these link templates apply to. |  |
|**org** | [**Org**](Org.md) |  |  [optional] |
|**templates** | [**List&lt;LinkTemplate&gt;**](LinkTemplate.md) | Effective URL template for every link type at this scope. All types are always present. |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


