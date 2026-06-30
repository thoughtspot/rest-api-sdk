

# ExportStyleLogosRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the logos to export. CLUSTER exports cluster-level logos. ORG exports logos for the authenticated user&#39;s org, falling back to cluster or defaults if no custom logo is set. Defaults to ORG if omitted. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


