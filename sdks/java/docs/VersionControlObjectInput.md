

# VersionControlObjectInput

One object a versioning run can report, used to filter run search.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Object ID of the metadata object, such as a Liveboard, an Answer or a Model. This is the cross-Org object ID, not the Org-local GUID. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the metadata object. Required when the identifier is a name, since a name can belong to more than one type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |


## Implemented Interfaces

* Serializable


