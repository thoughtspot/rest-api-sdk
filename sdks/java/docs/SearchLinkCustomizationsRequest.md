

# SearchLinkCustomizationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope to retrieve. CLUSTER returns the cluster templates and is available only in the primary org. ORG returns the templates for the org the caller is signed in to. Omit to return whichever of these the caller can access. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


