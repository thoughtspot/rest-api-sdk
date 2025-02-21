

# MetadataSearchResponse

Metadata Search Response Object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataId** | **String** | Unique identifier of the metadata. |  [optional] |
|**metadataName** | **String** | Name of the metadata. |  [optional] |
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of the metadata. |  |
|**dependentObjects** | **Object** | Details of dependent objects of the metadata objects. |  [optional] |
|**incompleteObjects** | **List&lt;Object&gt;** | Details of incomplete information of the metadata objects if any. |  [optional] |
|**metadataDetail** | **Object** | Complete details of the metadata objects. |  [optional] |
|**metadataHeader** | **Object** | Header information of the metadata objects. |  [optional] |
|**visualizationHeaders** | **List&lt;Object&gt;** | Visualization header information of the metadata objects. |  [optional] |
|**stats** | **Object** | Stats of the metadata object. Includes views, favorites, last_accessed. |  [optional] |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| CONNECTION | &quot;CONNECTION&quot; |
| TAG | &quot;TAG&quot; |
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |
| LOGICAL_RELATIONSHIP | &quot;LOGICAL_RELATIONSHIP&quot; |
| INSIGHT_SPEC | &quot;INSIGHT_SPEC&quot; |



