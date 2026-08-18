

# SearchAnalystsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analystIdentifier** | **String** | Unique identifier of an analyst. When provided, fetch mode: the response contains exactly that analyst and the other filters are ignored. |  [optional] |
|**recordSize** | **Integer** | List mode: number of records per page. Default 50, maximum 500. |  [optional] |
|**recordOffset** | **Integer** | List mode: zero-based index of the first record to return. Maximum 10000. |  [optional] |
|**query** | **String** | List mode: case-insensitive substring match on the analyst name. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | List mode: ownership filter — ALL (created by or shared with me), CREATED_BY_ME, or SHARED_TO_ME. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| CREATED_BY_ME | &quot;CREATED_BY_ME&quot; |
| SHARED_TO_ME | &quot;SHARED_TO_ME&quot; |


## Implemented Interfaces

* Serializable


