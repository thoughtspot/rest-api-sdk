

# ImportSummary

Per (memory type, target source) summary of what importMemory did — or would do, in DRY_RUN. `deleted_record_count` and `inserted_record_count` are previews in DRY_RUN and actuals in EXECUTE_IMPORT.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memoryType** | [**MemoryTypeEnum**](#MemoryTypeEnum) | The kind of memory (&#x60;RULES&#x60;, &#x60;RECIPES&#x60;, or &#x60;ALWAYS_APPLY_RULES&#x60;) these counts apply to. |  [optional] |
|**source** | [**ImportTargetSource**](ImportTargetSource.md) |  |  [optional] |
|**existingRecordCount** | **Integer** | Number of memory entries of this type that already existed on the target object before the import. |  [optional] |
|**deletedRecordCount** | **Integer** | Number of existing entries that will be (DRY_RUN) or were (EXECUTE_IMPORT) deleted as part of the replacement. |  [optional] |
|**insertedRecordCount** | **Integer** | Number of entries from the payload that will be (DRY_RUN) or were (EXECUTE_IMPORT) inserted. |  [optional] |
|**failedRecordCount** | **Integer** | Number of records of this type that failed validation or processing. |  [optional] |



## Enum: MemoryTypeEnum

| Name | Value |
|---- | -----|
| RULES | &quot;RULES&quot; |
| RECIPES | &quot;RECIPES&quot; |
| ALWAYS_APPLY_RULES | &quot;ALWAYS_APPLY_RULES&quot; |


## Implemented Interfaces

* Serializable


