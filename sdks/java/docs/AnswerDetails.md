

# AnswerDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Display title of the answer. |  [optional] |
|**description** | **String** | Description of the answer. |  [optional] |
|**sessionIdentifier** | **String** | Unique identifier of the session. |  [optional] |
|**generationNumber** | **Integer** | Generation number of the answer. |  [optional] |
|**tokens** | **List&lt;String&gt;** | Ordered list of TML token strings that make up the answer query. |  [optional] |
|**visualizationType** | [**VisualizationTypeEnum**](#VisualizationTypeEnum) | Visualization type for the answer. |  [optional] |
|**formulas** | **List&lt;String&gt;** | List of formulas used in the answer. |  [optional] |
|**parameters** | **List&lt;String&gt;** | List of parameters used in the answer. |  [optional] |
|**subQueries** | **List&lt;Object&gt;** | List of sub-queries used in the answer. |  [optional] |
|**acState** | [**ACState**](ACState.md) |  |  [optional] |



## Enum: VisualizationTypeEnum

| Name | Value |
|---- | -----|
| CHART | &quot;Chart&quot; |
| CHART2 | &quot;CHART&quot; |
| TABLE | &quot;Table&quot; |
| TABLE2 | &quot;TABLE&quot; |
| UNDEFINED | &quot;Undefined&quot; |
| UNDEFINED2 | &quot;UNDEFINED&quot; |


## Implemented Interfaces

* Serializable


