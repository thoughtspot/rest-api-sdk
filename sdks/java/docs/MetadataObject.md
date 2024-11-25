

# MetadataObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Unique ID or name of the metadata |  |
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| CUSTOM_ACTION | &quot;CUSTOM_ACTION&quot; |



