

# OrgChannelConfigInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | Unique identifier or name of the org |  |
|**operation** | [**OperationEnum**](#OperationEnum) | Operation to perform. REPLACE: Update preferences (default). RESET: Remove org-specific configurations, causing fallback to cluster-level preferences. |  [optional] |
|**preferences** | [**List&lt;EventChannelConfigInput&gt;**](EventChannelConfigInput.md) | Event-specific configurations. Required for REPLACE operation. |  [optional] |
|**resetEvents** | [**List&lt;ResetEventsEnum&gt;**](#List&lt;ResetEventsEnum&gt;) | Event types to reset. Required for RESET operation. Org-specific configurations for these events will be removed, causing fallback to cluster-level preferences. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;REPLACE&quot; |
| RESET | &quot;RESET&quot; |



## Enum: List&lt;ResetEventsEnum&gt;

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |


## Implemented Interfaces

* Serializable


