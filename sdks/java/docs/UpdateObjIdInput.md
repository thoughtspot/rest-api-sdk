

# UpdateObjIdInput

Input for updating object ID of a metadata object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataIdentifier** | **String** | GUID or name of the metadata object. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of metadata. Required if metadata_identifier is name of the object. |  [optional] |
|**currentObjId** | **String** | Current object ID value. |  [optional] |
|**newObjId** | **String** | New object ID value to set. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ACTION_OBJECT | &quot;ACTION_OBJECT&quot; |
| DATA_SOURCE | &quot;DATA_SOURCE&quot; |
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |



