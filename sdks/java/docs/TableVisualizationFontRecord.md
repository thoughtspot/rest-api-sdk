

# TableVisualizationFontRecord

Font assignment for a table visualization area in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**visualizationArea** | [**VisualizationAreaEnum**](#VisualizationAreaEnum) | Table visualization area. |  [optional] |
|**fontId** | **String** | UUID of the font assigned to this area. Null when the system default font is active. |  [optional] |
|**fontName** | **String** | Display name of the font assigned to this area. Null when the system default font is active. |  [optional] |
|**isOverridden** | **Boolean** | True if explicitly set at this scope, overriding any inherited value. |  [optional] |



## Enum: VisualizationAreaEnum

| Name | Value |
|---- | -----|
| TABLE_VALUE_CELLS | &quot;TABLE_VALUE_CELLS&quot; |


## Implemented Interfaces

* Serializable


