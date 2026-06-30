

# ChartVisualizationFontRecord

Font assignment for a chart visualization area in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**visualizationArea** | [**VisualizationAreaEnum**](#VisualizationAreaEnum) | Chart visualization area. |  [optional] |
|**fontId** | **String** | UUID of the font assigned to this area. Null when the system default font is active. |  [optional] |
|**fontName** | **String** | Display name of the font assigned to this area. Null when the system default font is active. |  [optional] |
|**isOverridden** | **Boolean** | True if explicitly set at this scope, overriding any inherited value. |  [optional] |



## Enum: VisualizationAreaEnum

| Name | Value |
|---- | -----|
| CHART_X_AXIS_LABELS | &quot;CHART_X_AXIS_LABELS&quot; |
| CHART_X_AXIS_TITLE | &quot;CHART_X_AXIS_TITLE&quot; |
| CHART_Y_AXIS_LABELS | &quot;CHART_Y_AXIS_LABELS&quot; |
| CHART_Y_AXIS_TITLE | &quot;CHART_Y_AXIS_TITLE&quot; |
| CHART_TOOLTIP | &quot;CHART_TOOLTIP&quot; |
| CHART_SCATTER_DATA_LABELS | &quot;CHART_SCATTER_DATA_LABELS&quot; |
| CHART_DONUT_DATA_LABELS | &quot;CHART_DONUT_DATA_LABELS&quot; |
| CHART_LINE_DATA_LABELS | &quot;CHART_LINE_DATA_LABELS&quot; |
| CHART_COLUMN_DATA_LABELS | &quot;CHART_COLUMN_DATA_LABELS&quot; |
| CHART_BAR_DATA_LABELS | &quot;CHART_BAR_DATA_LABELS&quot; |
| CHART_AREA_DATA_LABELS | &quot;CHART_AREA_DATA_LABELS&quot; |


## Implemented Interfaces

* Serializable


