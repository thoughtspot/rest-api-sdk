

# MetadataSearchReadinessResponse

Search readiness of a metadata object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Readiness state of the object. OBJECT_READY means the object is available in Search; OBJECT_NOT_READY means Search has not yet indexed its latest version; OBJECT_NOT_VALID means the identifier is not a valid GUID or no such object exists. |  |
|**metadataId** | **String** | GUID of the metadata object that was checked. |  |
|**objectVersion** | **Float** | Metadata commit version at which the object was last written. Returns -1 when the state is OBJECT_NOT_VALID or TYPE_NOT_SUPPORTED. |  |
|**indexedVersion** | **Float** | Latest metadata version indexed by Search. The object is ready once this is greater than or equal to object_version. Returns -1 when the state is OBJECT_NOT_VALID or TYPE_NOT_SUPPORTED, or when the Search service is unavailable. |  |
|**detail** | **String** | Human-readable explanation of the readiness state. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OBJECT_NOT_VALID | &quot;OBJECT_NOT_VALID&quot; |
| TYPE_NOT_SUPPORTED | &quot;TYPE_NOT_SUPPORTED&quot; |
| OBJECT_NOT_READY | &quot;OBJECT_NOT_READY&quot; |
| OBJECT_READY | &quot;OBJECT_READY&quot; |


## Implemented Interfaces

* Serializable


