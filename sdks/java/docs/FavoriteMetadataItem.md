

# FavoriteMetadataItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID of the metadata object. |  |
|**name** | **String** | name of the metadata object. |  |
|**type** | [**TypeEnum**](#TypeEnum) |   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| CONNECTION | &quot;CONNECTION&quot; |
| TAG | &quot;TAG&quot; |
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |
| LOGICAL_RELATIONSHIP | &quot;LOGICAL_RELATIONSHIP&quot; |



