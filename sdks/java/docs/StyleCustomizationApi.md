# StyleCustomizationApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**deleteStyleFonts**](StyleCustomizationApi.md#deleteStyleFonts) | **POST** /api/rest/2.0/customization/styles/fonts/delete |
| [**exportStyleLogos**](StyleCustomizationApi.md#exportStyleLogos) | **POST** /api/rest/2.0/customization/styles/logos/export |
| [**searchStyleCustomizations**](StyleCustomizationApi.md#searchStyleCustomizations) | **POST** /api/rest/2.0/customization/styles/search |
| [**searchStyleFonts**](StyleCustomizationApi.md#searchStyleFonts) | **POST** /api/rest/2.0/customization/styles/fonts/search |
| [**updateStyleCustomization**](StyleCustomizationApi.md#updateStyleCustomization) | **POST** /api/rest/2.0/customization/styles/update |
| [**updateStyleFont**](StyleCustomizationApi.md#updateStyleFont) | **POST** /api/rest/2.0/customization/styles/fonts/{font_identifier}/update |
| [**uploadStyleFont**](StyleCustomizationApi.md#uploadStyleFont) | **POST** /api/rest/2.0/customization/styles/fonts/upload |


<a id="deleteStyleFonts"></a>
# **deleteStyleFonts**
> StyleFontDeleteData deleteStyleFonts(deleteStyleFontsRequest)



  Version: 26.7.0.cl or later   Deletes one or more custom fonts from the cluster-level or org-level font library. If a deleted font is assigned to visualization areas, those assignments automatically fallback to the cluster/system default font. The response lists all affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually delete fonts, you must explicitly pass dry_run: false.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Provide one or more font UUIDs or names in &#x60;font_identifiers&#x60;. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete from the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to delete from the authenticated user&#39;s org library. - Use &#x60;dry_run: true&#x60; to preview which visualization areas would be affected without actually deleting the font. The response lists affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the font file using &#x60;uploadStyleFont&#x60; if needed.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteStyleFontsRequest** | [**DeleteStyleFontsRequest**](DeleteStyleFontsRequest.md)

### Return type

[**StyleFontDeleteData**](StyleFontDeleteData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Font deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="exportStyleLogos"></a>
# **exportStyleLogos**
> File exportStyleLogos(exportStyleLogosRequest, accept)



  Version: 26.7.0.cl or later   Downloads the active logos (default and wide slots) at the requested scope as a single ZIP archive containing both logo image files. If no custom logo has been uploaded at the ORG scope, the archive contains the resolved logo falling through from the cluster. If no cluster logo has been uploaded, no file is returned.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to download cluster-level logos. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to download logos for the authenticated user&#39;s org. - The response is a ZIP archive (&#x60;application/zip&#x60;). Save the response body directly to a &#x60;.zip&#x60; file. - The archive always contains two files — one for the DEFAULT slot and one for the WIDE slot — even if no custom logo is set at the requested scope.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportStyleLogosRequest** | [**ExportStyleLogosRequest**](ExportStyleLogosRequest.md)
| **accept** | **String**

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Logo ZIP archive retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchStyleCustomizations"></a>
# **searchStyleCustomizations**
> List&lt;StylePreference&gt; searchStyleCustomizations(searchStyleCustomizationsRequest)



  Version: 26.7.0.cl or later   Retrieves style preferences at cluster level or for the authenticated user&#39;s org. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to retrieve cluster-level style defaults. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to retrieve preferences for the authenticated user&#39;s org. - Each field in the response includes an &#x60;is_overridden&#x60; flag indicating whether the value was explicitly set at the requested scope or inherited from a parent scope (cluster or system default).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchStyleCustomizationsRequest** | [**SearchStyleCustomizationsRequest**](SearchStyleCustomizationsRequest.md)

### Return type

[**List&lt;StylePreference&gt;**](StylePreference.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Style preferences retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchStyleFonts"></a>
# **searchStyleFonts**
> List&lt;StyleFontRecord&gt; searchStyleFonts(searchStyleFontsRequest)



  Version: 26.7.0.cl or later   Returns custom fonts from the cluster-level or org-level font library. Omitting all filter fields returns all fonts in the target scope.  When &#x60;include_font_assignments&#x60; is &#x60;true&#x60;, the response includes only the visualization areas explicitly assigned to each font. For cluster-scoped fonts, &#x60;org&#x60; is returned as &#x60;null&#x60;.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to search the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to search the authenticated user&#39;s org library. - Use &#x60;font_identifier&#x60; to look up a specific font by UUID or name. - Use &#x60;name_pattern&#x60; for partial, case-insensitive name matching. - Set &#x60;include_font_assignments&#x60; to &#x60;true&#x60; to include visualization areas this font is currently assigned to. Defaults to &#x60;false&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchStyleFontsRequest** | [**SearchStyleFontsRequest**](SearchStyleFontsRequest.md)

### Return type

[**List&lt;StyleFontRecord&gt;**](StyleFontRecord.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom fonts retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateStyleCustomization"></a>
# **updateStyleCustomization**
> updateStyleCustomization(scope, operation, resetOptions, navigationPanel, chartColorPalette, embeddedFooterText, visualizationFonts, defaultLogo, wideLogo)



  Version: 26.7.0.cl or later   Updates style preferences at cluster level or for the authenticated user&#39;s org, including navigation panel color, chart color palette, embedded footer text, logo, and font assignments per visualization area. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an Org-level preference falls back to Cluster-level preference, which on reset falls back to system defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**)  privilege.  #### Usage guidelines  Two operations are supported via the &#x60;operation&#x60; field:  - **REPLACE** (default): Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**: Reverts specific fields to defaults. Specify which fields to reset using &#x60;reset_options.style&#x60; (for style fields) and &#x60;reset_options.visualization_areas&#x60; (for font assignments). Fields not listed in &#x60;reset_options&#x60; are not affected.  #### Logo upload  Logo files are uploaded as binary fields using &#x60;multipart/form-data&#x60;:  - &#x60;default_logo&#x60;: Square app icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. - &#x60;wide_logo&#x60;: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted formats: PNG, JPG.  To reset a logo to the default, use &#x60;operation: RESET&#x60; with &#x60;reset_options.style&#x60; set to &#x60;DEFAULT_LOGO&#x60; or &#x60;WIDE_LOGO&#x60;.  #### Navigation panel color  Set &#x60;navigation_panel.theme&#x60; to one of:  - &#x60;DARK&#x60;: Default dark theme. - &#x60;TWO_TONE&#x60;: Dual-tone panel style. - &#x60;CUSTOM&#x60;: User-defined color. Provide &#x60;navigation_panel.base_color&#x60; as a 6-digit hex string (e.g. &#x60;#2359B6&#x60;).  #### Chart color palette  Provide exactly 8 color entries in &#x60;chart_color_palette.colors&#x60;. Each entry requires a &#x60;primary&#x60; hex color. If &#x60;secondary&#x60; shades are omitted, the server auto-generates 4 shades from the primary color.  #### Font assignments  Specify &#x60;visualization_fonts.chart_visualization_fonts&#x60;, &#x60;visualization_fonts.table_visualization_fonts&#x60;, and &#x60;visualization_fonts.advanced_chart_visualization_fonts&#x60; to assign custom fonts to specific visualization areas. Only provide the areas you want to update; omitted areas remain unchanged.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **scope** | **String**
| **operation** | **String**
| **resetOptions** | [**StyleResetOptionsInput**](StyleResetOptionsInput.md)
| **navigationPanel** | [**NavigationPanelInput**](NavigationPanelInput.md)
| **chartColorPalette** | [**StyleColorPaletteInput**](StyleColorPaletteInput.md)
| **embeddedFooterText** | **String**
| **visualizationFonts** | [**VisualizationFontsInput**](VisualizationFontsInput.md)
| **defaultLogo** | **File**
| **wideLogo** | **File**

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Style preferences updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateStyleFont"></a>
# **updateStyleFont**
> updateStyleFont(fontIdentifier, updateStyleFontRequest)



  Version: 26.7.0.cl or later   Updates the metadata of an existing custom font in the cluster-level or org-level font library. Only the fields provided in the request are modified; omitted fields remain unchanged.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Identify the font using &#x60;font_identifier&#x60; (UUID or name). - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to target the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to target the authenticated user&#39;s org library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and re-upload using &#x60;uploadStyleFont&#x60;. - &#x60;color&#x60; must be a valid 6-digit hex string (e.g. &#x60;#333333&#x60;) if provided.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fontIdentifier** | **String**
| **updateStyleFontRequest** | [**UpdateStyleFontRequest**](UpdateStyleFontRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Font metadata updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error. |  -  |

<a id="uploadStyleFont"></a>
# **uploadStyleFont**
> StyleFontUploadData uploadStyleFont(name, fileContent, scope, weight, style, color)



  Version: 26.7.0.cl or later   Uploads a custom font to the cluster-level or org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only available within that org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are rejected with an error. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload to the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to upload to the authenticated user&#39;s org library. - &#x60;weight&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;LIGHT&#x60;, &#x60;BOLD&#x60;. - &#x60;style&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;ITALIC&#x60;, &#x60;OBLIQUE&#x60;. - &#x60;color&#x60; defaults to &#x60;#000000&#x60; (black) if omitted. Provide as a 6-digit hex string (e.g. &#x60;#333333&#x60;). - The uploaded font can be assigned to visualization areas using the &#x60;updateStyleCustomization&#x60; endpoint.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **name** | **String**
| **fileContent** | **File**
| **scope** | **String**
| **weight** | **String**
| **style** | **String**
| **color** | **String**

### Return type

[**StyleFontUploadData**](StyleFontUploadData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Font uploaded successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

