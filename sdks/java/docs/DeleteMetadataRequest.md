

# DeleteMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;DeleteMetadataTypeInput&gt;**](DeleteMetadataTypeInput.md) | Metadata objects. |  |
|**deleteDisabledObjects** | **Boolean** | Indicates whether to delete disabled metadata objects. |  [optional] |
|**deleteMode** | [**DeleteModeEnum**](#DeleteModeEnum) | How to delete the objects. SOFT_DELETE moves them to the Recycle Bin, from where they can be restored; HARD_DELETE removes them permanently.    Version: 27.1.0.cl or later  |  [optional] |
|**deleteReason** | **String** | Reason for the delete, recorded with the Recycle Bin entry. At most 32 characters.    Version: 27.1.0.cl or later  |  [optional] |



## Enum: DeleteModeEnum

| Name | Value |
|---- | -----|
| SOFT_DELETE | &quot;SOFT_DELETE&quot; |
| HARD_DELETE | &quot;HARD_DELETE&quot; |


## Implemented Interfaces

* Serializable


