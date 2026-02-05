

# UpdateCollectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the collection. |  [optional] |
|**description** | **String** | Description of the collection. |  [optional] |
|**metadata** | [**List&lt;CollectionMetadataInput&gt;**](CollectionMetadataInput.md) | Metadata objects to add, remove, or replace in the collection. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Type of update operation. Default operation type is REPLACE. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |


## Implemented Interfaces

* Serializable


