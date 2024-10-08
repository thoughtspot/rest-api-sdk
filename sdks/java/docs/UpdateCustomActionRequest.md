

# UpdateCustomActionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionDetails** | [**UpdateCustomActionRequestActionDetails**](UpdateCustomActionRequestActionDetails.md) |  |  [optional] |
|**associateMetadata** | [**List&lt;AssociateMetadataInput&gt;**](AssociateMetadataInput.md) | Metadata objects to which the custom action needs to be associated. |  [optional] |
|**defaultActionConfig** | [**UpdateCustomActionRequestDefaultActionConfig**](UpdateCustomActionRequestDefaultActionConfig.md) |  |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique ID or name of the groups that can view and access the custom action. |  [optional] |
|**name** | **String** | Name of the custom action. The custom action name must be unique. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Type of update operation. Default operation type is ADD |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |



