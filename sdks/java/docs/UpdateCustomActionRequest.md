

# UpdateCustomActionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionDetails** | [**ActionDetailsInput**](ActionDetailsInput.md) | Action details includes &#x60;Type&#x60; and Configuration for Custom Actions, either Callback or URL is required. |  [optional] |
|**associateMetadata** | [**List&lt;AssociateMetadataInput&gt;**](AssociateMetadataInput.md) | Metadata objects to which the custom action needs to be associated. |  [optional] |
|**defaultActionConfig** | [**DefaultActionConfigInput**](DefaultActionConfigInput.md) | Default Custom action configuration. This includes if the custom action available on visualizations and Answers. By default, a custom action is added to all visualizations and Answers. |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique ID or name of the groups that can view and access the custom action. |  [optional] |
|**name** | **String** | Name of the custom action. The custom action name must be unique. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Type of update operation. Default operation type is ADD |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |


## Implemented Interfaces

* Serializable


