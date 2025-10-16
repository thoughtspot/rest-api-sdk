

# UserObject

Objects to apply the User_Object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |   Type of object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.      Specify the object type as &#x60;LOGICAL_TABLE&#x60;. |  [optional] |
|**identifier** | **String** | Unique name/id of the object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |


## Implemented Interfaces

* Serializable


