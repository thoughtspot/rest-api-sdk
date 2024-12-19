

# ExportMetadataTypeInput

MetadataType InputType used in Export MetadataType API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| CONNECTION | &quot;CONNECTION&quot; |
| CUSTOM_ACTION | &quot;CUSTOM_ACTION&quot; |
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |
| ROLE | &quot;ROLE&quot; |



