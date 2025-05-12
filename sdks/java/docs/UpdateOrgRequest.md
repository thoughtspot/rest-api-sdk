

# UpdateOrgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the Org |  [optional] |
|**description** | **String** | Description of the Org |  [optional] |
|**userIdentifiers** | **List&lt;String&gt;** | Add Users to an Org |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Add Default Groups to an Org |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Type of update operation. Default operation type is ADD |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |


## Implemented Interfaces

* Serializable


