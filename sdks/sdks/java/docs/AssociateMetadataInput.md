

# AssociateMetadataInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionConfig** | [**ActionConfigInput**](ActionConfigInput.md) |  |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VISUALIZATION | &quot;VISUALIZATION&quot; |
| ANSWER | &quot;ANSWER&quot; |
| WORKSHEET | &quot;WORKSHEET&quot; |


## Implemented Interfaces

* Serializable


