

# DeleteMetadataTypeInput

MetadataType InputType used in Delete MetadataType API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of metadata (Optional when given identifier is ID). |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| LOGICAL_RELATIONSHIP | &quot;LOGICAL_RELATIONSHIP&quot; |



