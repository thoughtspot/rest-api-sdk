

# ShareMetadataTypeInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Type of metadata. Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| CONNECTION | &quot;CONNECTION&quot; |



