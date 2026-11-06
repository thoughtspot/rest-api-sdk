

# VersionControlObjectInput

One object a versioning run can report, used to filter run search.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Object ID of the metadata object, such as a Liveboard, an Answer or a Model. This is the cross-Org object ID, not the Org-local GUID and not the object name. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the metadata object. LOGICAL_TABLE matches runs that exported a logical table as a dependency. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |


## Implemented Interfaces

* Serializable


