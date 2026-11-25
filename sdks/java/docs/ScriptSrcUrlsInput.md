

# ScriptSrcUrlsInput

Input for script-src CSP settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether script-src customization is enabled. |  [optional] |
|**urls** | **List&lt;String&gt;** | Allowed URLs for script-src directive. Can only be set if enabled is true. Replaces the existing list. Values not included in the request are removed. |  [optional] |


## Implemented Interfaces

* Serializable


