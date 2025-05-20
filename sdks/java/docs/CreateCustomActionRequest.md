

# CreateCustomActionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the custom action. The custom action name must be unique. |  |
|**actionDetails** | [**ActionDetailsInputCreate**](ActionDetailsInputCreate.md) | Action details includes &#x60;Type&#x60; and Configuration data for Custom Actions, either Callback or URL is required. |  |
|**associateMetadata** | [**List&lt;AssociateMetadataInputCreate&gt;**](AssociateMetadataInputCreate.md) | Metadata objects to which the custom action needs to be associated. |  [optional] |
|**defaultActionConfig** | [**DefaultActionConfigInputCreate**](DefaultActionConfigInputCreate.md) | Default Custom action configuration. This includes if the custom action is available on all visualizations. By default, a custom action is added to all visualizations and Answers. |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique ID or name of the groups that can view and access the custom action. |  [optional] |


## Implemented Interfaces

* Serializable


