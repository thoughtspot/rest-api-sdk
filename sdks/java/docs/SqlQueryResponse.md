

# SqlQueryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataId** | **String** | Unique identifier of the metadata. |  |
|**metadataName** | **String** | Name of the metadata. |  |
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of the metadata. |  |
|**sqlQueries** | [**List&lt;SqlQuery&gt;**](SqlQuery.md) | SQL query details of metadata objects. |  |



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


## Implemented Interfaces

* Serializable


