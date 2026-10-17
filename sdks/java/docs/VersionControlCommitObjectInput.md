

# VersionControlCommitObjectInput

One object to version on the commit endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | GUID, object ID, or name of the metadata object, such as a Liveboard or an Answer. It is resolved in your Org and sent to version control by its cross-Org object ID, so object IDs must be enabled on the cluster. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the metadata object. Required when the identifier is a name, since a name can belong to more than one type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |


## Implemented Interfaces

* Serializable


