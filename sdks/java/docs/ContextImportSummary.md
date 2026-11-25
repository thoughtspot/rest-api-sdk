

# ContextImportSummary

What an import changes for one owner, or would change in a dry run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ContextScope**](ContextScope.md) |  |  [optional] |
|**existingRecordCount** | **Integer** | Number of entities with this owner in this environment before the import. |  [optional] |
|**deletedRecordCount** | **Integer** | Number of entities deleted, or to be deleted in a dry run. |  [optional] |
|**insertedRecordCount** | **Integer** | Number of entities inserted from the file, or to be inserted in a dry run. |  [optional] |


## Implemented Interfaces

* Serializable


