

# NavigationPanelInput

Navigation panel color configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**theme** | [**ThemeEnum**](#ThemeEnum) | Color mode for the navigation panel. DARK applies the default dark theme. TWO_TONE applies a dual-tone style. CUSTOM enables a user-defined base color; base_color is required when theme is CUSTOM. |  [optional] |
|**baseColor** | **String** | Base color as a 6-digit hex string (e.g. \&quot;#2359B6\&quot;). Required when theme is CUSTOM. |  [optional] |



## Enum: ThemeEnum

| Name | Value |
|---- | -----|
| DARK | &quot;DARK&quot; |
| TWO_TONE | &quot;TWO_TONE&quot; |
| CUSTOM | &quot;CUSTOM&quot; |


## Implemented Interfaces

* Serializable


