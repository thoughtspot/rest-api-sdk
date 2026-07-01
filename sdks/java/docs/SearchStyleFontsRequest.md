

# SearchStyleFontsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the font library to search. CLUSTER searches the cluster-level library. ORG searches the authenticated user&#39;s org library. Returns both Cluster and Org level font if omitted. |  [optional] |
|**fontIdentifier** | **String** | Filter by UUID or name of a specific font. |  [optional] |
|**namePattern** | **String** | Filter by font display name. Supports partial, case-insensitive matching. |  [optional] |
|**includeFontAssignments** | **Boolean** | When true, includes visualization areas this font is assigned to in the response. Defaults to false if omitted. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


