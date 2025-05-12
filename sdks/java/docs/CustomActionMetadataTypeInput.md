

# CustomActionMetadataTypeInput

MetadataType InputType used in Custom Action API's

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VISUALIZATION | &quot;VISUALIZATION&quot; |
| ANSWER | &quot;ANSWER&quot; |
| WORKSHEET | &quot;WORKSHEET&quot; |


## Implemented Interfaces

* Serializable


