

# CreateCustomActionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the custom action. The custom action name must be unique. |  |
|**actionDetails** | [**CreateCustomActionRequestActionDetails**](CreateCustomActionRequestActionDetails.md) |  |  |
|**associateMetadata** | [**List&lt;AssociateMetadataInputCreate&gt;**](AssociateMetadataInputCreate.md) | Metadata objects to which the custom action needs to be associated. |  [optional] |
|**defaultActionConfig** | [**CreateCustomActionRequestDefaultActionConfig**](CreateCustomActionRequestDefaultActionConfig.md) |  |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique ID or name of the groups that can view and access the custom action. |  [optional] |



