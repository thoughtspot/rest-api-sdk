

# ExportMetadataTypeInput

MetadataType InputType used in Export MetadataType API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata object. Not required if the metadata type is ANSWER when session_id and generation_number is set. |  [optional] |
|**sessionIdentifier** | **String** | Unique ID of the Answer session. Required if the metadata type is ANSWER and identifier is not set. |  [optional] |
|**generationNumber** | **Integer** | Generation Number of the Answer session. Required if the metadata type is ANSWER and identifier is not set. |  [optional] |



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
| FEEDBACK | &quot;FEEDBACK&quot; |


## Implemented Interfaces

* Serializable


