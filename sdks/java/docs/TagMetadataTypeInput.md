

# TagMetadataTypeInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.   1. LIVEBOARD   2. ANSWERS   3. LOGICAL_TABLE for any data object such as table, worksheet or view.   4. LOGICAL_COLUMN for a column of any data object such as tables, worksheets or views. |  [optional] |
|**identifier** | **String** | Unique ID or name of the metadata. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| CONNECTION | &quot;CONNECTION&quot; |



