

# SearchCommitsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataIdentifier** | **String** | Unique ID or name of the metadata. |  |
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of metadata. |  [optional] |
|**branchName** | **String** |    Name of the branch from which commit history needs to be displayed.      Note: If no branch_name is specified, then commits will be returned for the default branch for this configuration. |  [optional] |
|**recordOffset** | **Integer** |     Record offset point in the commit history to display the response.       Note: If no record offset is specified, the beginning of the record will be considered. |  [optional] |
|**recordSize** | **Integer** |     Number of history records from record offset point to be displayed in the response.       Note: If no record size is specified, then all the records will be considered. |  [optional] |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| CUSTOM_ACTION | &quot;CUSTOM_ACTION&quot; |


## Implemented Interfaces

* Serializable


