

# StyleNavigationPanel

Navigation panel color configuration for a specific scope.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**theme** | [**ThemeEnum**](#ThemeEnum) | Navigation panel color mode. |  [optional] |
|**baseColor** | **String** | Base color as a 6-digit hex string. Present only when theme is CUSTOM. |  [optional] |
|**isOverridden** | **Boolean** | True if explicitly set at this scope, overriding any inherited value. |  [optional] |



## Enum: ThemeEnum

| Name | Value |
|---- | -----|
| DARK | &quot;DARK&quot; |
| TWO_TONE | &quot;TWO_TONE&quot; |
| CUSTOM | &quot;CUSTOM&quot; |


## Implemented Interfaces

* Serializable


