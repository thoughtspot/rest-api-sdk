

# CspSettingsInput

Input for CSP (Content Security Policy) settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectSrcUrls** | **List&lt;String&gt;** | Allowed URLs for connect-src directive. Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**fontSrcUrls** | **List&lt;String&gt;** | Allowed URLs for font-src directive. Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**visualEmbedHosts** | **List&lt;String&gt;** | Allowed hosts for visual embed (frame-ancestors directive). Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**iframeSrcUrls** | **List&lt;String&gt;** | Allowed URLs for frame-src directive. Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**imgSrcUrls** | **List&lt;String&gt;** | Allowed URLs for img-src directive. Replaces the existing list. Values not included in the request are removed. |  [optional] |
|**scriptSrcUrls** | [**ScriptSrcUrlsInput**](ScriptSrcUrlsInput.md) |  |  [optional] |
|**styleSrcUrls** | **List&lt;String&gt;** | Allowed URLs for style-src directive. Replaces the existing list. Values not included in the request are removed. |  [optional] |


## Implemented Interfaces

* Serializable


