

# ResponseMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionIdentifier** | **String** | Unique identifier of the generated response. |  [optional] |
|**generationNumber** | **Integer** | Generate number of the response. |  [optional] |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Type of the generated response. |  |
|**visualizationType** | [**VisualizationTypeEnum**](#VisualizationTypeEnum) | Generated visualization type. |  [optional] |
|**tokens** | **String** | Tokens for the response. |  [optional] |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| TSANSWER | &quot;TSAnswer&quot; |



## Enum: VisualizationTypeEnum

| Name | Value |
|---- | -----|
| CHART | &quot;Chart&quot; |
| TABLE | &quot;Table&quot; |
| UNDEFINED | &quot;Undefined&quot; |



