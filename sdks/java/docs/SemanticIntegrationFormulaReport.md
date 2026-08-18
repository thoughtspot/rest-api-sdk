

# SemanticIntegrationFormulaReport

Import details for a single formula.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Formula ID in the model. |  [optional] |
|**name** | **String** | Formula name. |  [optional] |
|**description** | **String** | Formula description. |  [optional] |
|**sourceExpression** | **String** | CDW source expression. |  [optional] |
|**translatedFormula** | **String** | ThoughtSpot formula equivalent. |  [optional] |
|**importStatus** | [**ImportStatusEnum**](#ImportStatusEnum) | Import status. |  [optional] |
|**changeStatus** | [**ChangeStatusEnum**](#ChangeStatusEnum) | Change status since last import. Null on initial create. |  [optional] |



## Enum: ImportStatusEnum

| Name | Value |
|---- | -----|
| IMPORTED | &quot;IMPORTED&quot; |
| FAILED | &quot;FAILED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |



## Enum: ChangeStatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| UPDATED | &quot;UPDATED&quot; |
| UNCHANGED | &quot;UNCHANGED&quot; |


## Implemented Interfaces

* Serializable


