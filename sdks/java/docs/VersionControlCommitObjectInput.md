

# VersionControlCommitObjectInput

One object to version on the commit endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Object ID of the metadata object, such as a Liveboard or an Answer. This is the cross-Org object ID, not the Org-local GUID and not the object name, and it requires object IDs to be enabled on the cluster. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the metadata object. Required when the identifier is a name, since a name can belong to more than one type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |


## Implemented Interfaces

* Serializable


