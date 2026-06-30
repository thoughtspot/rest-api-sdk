

# DeleteStyleFontsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the font library to delete from. CLUSTER deletes from the cluster-level library. ORG deletes from the authenticated user&#39;s org library. Defaults to ORG if omitted. |  [optional] |
|**fontIdentifiers** | **List&lt;String&gt;** | UUIDs or names of the fonts to delete. At least one identifier is required. |  |
|**dryRun** | **Boolean** | When true, returns affected assignments without applying the deletion. Use this to preview the impact before committing. Defaults to true if omitted. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


