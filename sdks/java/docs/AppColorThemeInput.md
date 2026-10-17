

# AppColorThemeInput

App color theme configuration -- the same stored color navigation_panel writes, expressed as a brand color plus how it is applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandColor** | **String** | Brand color as a 6-digit hex string (e.g. \&quot;#2359B6\&quot;). Omit to leave the stored color unchanged. To clear it, use operation RESET with reset_options.style: [\&quot;APP_COLOR_THEME\&quot;].    Version: 26.10.0.cl or later  |  [optional] |
|**applyAsTopNavColor** | **Boolean** | Whether the brand color is painted on the top navigation bar literally, instead of the surface shade derived from it. Omit to leave the stored choice unchanged.    Version: 26.10.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


