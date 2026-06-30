

# EurekaImportDiagnostic

A group of importMemory diagnostic messages that share a severity / disposition. This is the single, uniform channel for fatal errors, rollbacks, and non-fatal observations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subStatus** | [**SubStatusEnum**](#SubStatusEnum) | Severity / disposition category these messages share (e.g. &#x60;WARNING&#x60;, &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;). |  [optional] |
|**messages** | **List&lt;String&gt;** | Human-readable messages for this category (e.g. the residual-orphan doc ids for a &#x60;WARNING&#x60;, or the failure cause for a &#x60;FAILURE&#x60;). |  [optional] |



## Enum: SubStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| FAILURE | &quot;FAILURE&quot; |
| WARNING | &quot;WARNING&quot; |
| ROLLED_BACK | &quot;ROLLED_BACK&quot; |


## Implemented Interfaces

* Serializable


