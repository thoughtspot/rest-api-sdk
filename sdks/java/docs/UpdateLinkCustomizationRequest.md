

# UpdateLinkCustomizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope to apply the templates at. CLUSTER sets the defaults inherited by all orgs and is available only in the primary org. ORG applies to the authenticated user&#39;s org. |  |
|**operation** | [**OperationEnum**](#OperationEnum) | Operation to perform. REPLACE sets each listed type to its value. RESET reverts each listed type to the value its scope inherits. |  [optional] |
|**templates** | [**List&lt;LinkTemplateInput&gt;**](LinkTemplateInput.md) | Link types to act on. Types not listed are left unchanged. Duplicate entries for the same type are rejected. |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;REPLACE&quot; |
| RESET | &quot;RESET&quot; |


## Implemented Interfaces

* Serializable


