

# TokenAccessScopeObject

Objects on which the filter rules and parameters values should be applied to

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. |  [optional] |
|**identifier** | **String** | Unique name/id of the object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |


