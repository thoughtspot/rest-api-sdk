

# AssociateMetadataInputCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionConfig** | [**ActionConfigInputCreate**](ActionConfigInputCreate.md) |  |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata. |  |
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VISUALIZATION | &quot;VISUALIZATION&quot; |
| ANSWER | &quot;ANSWER&quot; |
| WORKSHEET | &quot;WORKSHEET&quot; |



