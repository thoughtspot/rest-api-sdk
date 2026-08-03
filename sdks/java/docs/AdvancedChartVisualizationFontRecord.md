

# AdvancedChartVisualizationFontRecord

Font assignment for an advanced chart visualization area in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**visualizationArea** | [**VisualizationAreaEnum**](#VisualizationAreaEnum) | Advanced chart visualization area. |  [optional] |
|**fontId** | **String** | UUID of the font assigned to this area. Null when the system default font is active. |  [optional] |
|**fontName** | **String** | Display name of the font assigned to this area. Null when the system default font is active. |  [optional] |
|**isOverridden** | **Boolean** | True if explicitly set at this scope, overriding any inherited value. |  [optional] |



## Enum: VisualizationAreaEnum

| Name | Value |
|---- | -----|
| ADVANCED_CHART_LABELS | &quot;ADVANCED_CHART_LABELS&quot; |


## Implemented Interfaces

* Serializable


