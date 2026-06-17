# ThoughtSpot.Client.Api.StyleCustomizationApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteStyleFonts**](StyleCustomizationApi.md#deletestylefonts) | **POST** /api/rest/2.0/customization/styles/fonts/delete |  |
| [**ExportStyleLogos**](StyleCustomizationApi.md#exportstylelogos) | **POST** /api/rest/2.0/customization/styles/logos/export |  |
| [**SearchStyleCustomizations**](StyleCustomizationApi.md#searchstylecustomizations) | **POST** /api/rest/2.0/customization/styles/search |  |
| [**SearchStyleFonts**](StyleCustomizationApi.md#searchstylefonts) | **POST** /api/rest/2.0/customization/styles/fonts/search |  |
| [**UpdateStyleCustomization**](StyleCustomizationApi.md#updatestylecustomization) | **POST** /api/rest/2.0/customization/styles/update |  |
| [**UpdateStyleFont**](StyleCustomizationApi.md#updatestylefont) | **POST** /api/rest/2.0/customization/styles/fonts/{font_identifier}/update |  |
| [**UploadStyleFont**](StyleCustomizationApi.md#uploadstylefont) | **POST** /api/rest/2.0/customization/styles/fonts/upload |  |

<a id="deletestylefonts"></a>
# **DeleteStyleFonts**
> StyleFontDeleteData DeleteStyleFonts (DeleteStyleFontsRequest deleteStyleFontsRequest)



  Version: 26.7.0.cl or later   Deletes one or more custom fonts from the cluster-level or org-level font library. If a deleted font is assigned to visualization areas, those assignments automatically fallback to the cluster/system default font. The response lists all affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually delete fonts, you must explicitly pass dry_run: false.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Provide one or more font UUIDs or names in `font_identifiers`. - Set `scope` to `CLUSTER` to delete from the cluster-level library. Set `scope` to `ORG` (default) to delete from the authenticated user's org library. - Use `dry_run: true` to preview which visualization areas would be affected without actually deleting the font. The response lists affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the font file using `uploadStyleFont` if needed.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class DeleteStyleFontsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var deleteStyleFontsRequest = new DeleteStyleFontsRequest(); // DeleteStyleFontsRequest | 

            try
            {
                StyleFontDeleteData result = apiInstance.DeleteStyleFonts(deleteStyleFontsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.DeleteStyleFonts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteStyleFontsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<StyleFontDeleteData> response = apiInstance.DeleteStyleFontsWithHttpInfo(deleteStyleFontsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.DeleteStyleFontsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteStyleFontsRequest** | [**DeleteStyleFontsRequest**](DeleteStyleFontsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportstylelogos"></a>
# **ExportStyleLogos**
> FileParameter ExportStyleLogos (ExportStyleLogosRequest exportStyleLogosRequest)



  Version: 26.7.0.cl or later   Downloads the active logos (default and wide slots) at the requested scope as a single ZIP archive containing both logo image files. If no custom logo has been uploaded at the ORG scope, the archive contains the resolved logo falling through from the cluster. If no cluster logo has been uploaded, no file is returned.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to download cluster-level logos. - Set `scope` to `ORG` (default) to download logos for the authenticated user's org. - The response is a ZIP archive (`application/zip`). Save the response body directly to a `.zip` file. - The archive always contains two files — one for the DEFAULT slot and one for the WIDE slot — even if no custom logo is set at the requested scope.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class ExportStyleLogosExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var exportStyleLogosRequest = new ExportStyleLogosRequest(); // ExportStyleLogosRequest | 

            try
            {
                FileParameter result = apiInstance.ExportStyleLogos(exportStyleLogosRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.ExportStyleLogos: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportStyleLogosWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.ExportStyleLogosWithHttpInfo(exportStyleLogosRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.ExportStyleLogosWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportStyleLogosRequest** | [**ExportStyleLogosRequest**](ExportStyleLogosRequest.md) |  |  |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Logo ZIP archive retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchstylecustomizations"></a>
# **SearchStyleCustomizations**
> List&lt;StylePreference&gt; SearchStyleCustomizations (SearchStyleCustomizationsRequest searchStyleCustomizationsRequest)



  Version: 26.7.0.cl or later   Retrieves style preferences at cluster level or for the authenticated user's org. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to retrieve cluster-level style defaults. - Set `scope` to `ORG` (default) to retrieve preferences for the authenticated user's org. - Each field in the response includes an `is_overridden` flag indicating whether the value was explicitly set at the requested scope or inherited from a parent scope (cluster or system default).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class SearchStyleCustomizationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var searchStyleCustomizationsRequest = new SearchStyleCustomizationsRequest(); // SearchStyleCustomizationsRequest | 

            try
            {
                List<StylePreference> result = apiInstance.SearchStyleCustomizations(searchStyleCustomizationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.SearchStyleCustomizations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchStyleCustomizationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<StylePreference>> response = apiInstance.SearchStyleCustomizationsWithHttpInfo(searchStyleCustomizationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.SearchStyleCustomizationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchStyleCustomizationsRequest** | [**SearchStyleCustomizationsRequest**](SearchStyleCustomizationsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchstylefonts"></a>
# **SearchStyleFonts**
> List&lt;StyleFontRecord&gt; SearchStyleFonts (SearchStyleFontsRequest searchStyleFontsRequest)



  Version: 26.7.0.cl or later   Returns custom fonts from the cluster-level or org-level font library. Omitting all filter fields returns all fonts in the target scope.  When `include_font_assignments` is `true`, the response includes only the visualization areas explicitly assigned to each font. For cluster-scoped fonts, `org` is returned as `null`.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to search the cluster-level library. Set `scope` to `ORG` (default) to search the authenticated user's org library. - Use `font_identifier` to look up a specific font by UUID or name. - Use `name_pattern` for partial, case-insensitive name matching. - Set `include_font_assignments` to `true` to include visualization areas this font is currently assigned to. Defaults to `false`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class SearchStyleFontsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var searchStyleFontsRequest = new SearchStyleFontsRequest(); // SearchStyleFontsRequest | 

            try
            {
                List<StyleFontRecord> result = apiInstance.SearchStyleFonts(searchStyleFontsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.SearchStyleFonts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchStyleFontsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<StyleFontRecord>> response = apiInstance.SearchStyleFontsWithHttpInfo(searchStyleFontsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.SearchStyleFontsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchStyleFontsRequest** | [**SearchStyleFontsRequest**](SearchStyleFontsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatestylecustomization"></a>
# **UpdateStyleCustomization**
> void UpdateStyleCustomization (string scope, string? operation = null, StyleResetOptionsInput? resetOptions = null, NavigationPanelInput? navigationPanel = null, StyleColorPaletteInput? chartColorPalette = null, string? embeddedFooterText = null, VisualizationFontsInput? visualizationFonts = null, FileParameter? defaultLogo = null, FileParameter? wideLogo = null)



  Version: 26.7.0.cl or later   Updates style preferences at cluster level or for the authenticated user's org, including navigation panel color, chart color palette, embedded footer text, logo, and font assignments per visualization area. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an Org-level preference falls back to Cluster-level preference, which on reset falls back to system defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**)  privilege.  #### Usage guidelines  Two operations are supported via the `operation` field:  - **REPLACE** (default): Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**: Reverts specific fields to defaults. Specify which fields to reset using `reset_options.style` (for style fields) and `reset_options.visualization_areas` (for font assignments). Fields not listed in `reset_options` are not affected.  #### Logo upload  Logo files are uploaded as binary fields using `multipart/form-data`:  - `default_logo`: Square app icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. - `wide_logo`: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted formats: PNG, JPG.  To reset a logo to the default, use `operation: RESET` with `reset_options.style` set to `DEFAULT_LOGO` or `WIDE_LOGO`.  #### Navigation panel color  Set `navigation_panel.theme` to one of:  - `DARK`: Default dark theme. - `TWO_TONE`: Dual-tone panel style. - `CUSTOM`: User-defined color. Provide `navigation_panel.base_color` as a 6-digit hex string (e.g. `#2359B6`).  #### Chart color palette  Provide exactly 8 color entries in `chart_color_palette.colors`. Each entry requires a `primary` hex color. If `secondary` shades are omitted, the server auto-generates 4 shades from the primary color.  #### Font assignments  Specify `visualization_fonts.chart_visualization_fonts` and `visualization_fonts.table_visualization_fonts` to assign custom fonts to specific visualization areas. Only provide the areas you want to update; omitted areas remain unchanged.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class UpdateStyleCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var scope = "CLUSTER";  // string | Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user's org. (default to ORG)
            var operation = "REPLACE";  // string? | Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults. (optional)  (default to REPLACE)
            var resetOptions = new StyleResetOptionsInput?(); // StyleResetOptionsInput? | Fields to reset when operation is RESET. Specify style fields and visualization areas to revert to defaults. (optional) 
            var navigationPanel = new NavigationPanelInput?(); // NavigationPanelInput? | Navigation panel color. Provide theme and, when theme is CUSTOM, also provide base_color. (optional) 
            var chartColorPalette = new StyleColorPaletteInput?(); // StyleColorPaletteInput? | Chart color palette. When provided with operation REPLACE, exactly 8 color entries must be specified in colors. (optional) 
            var embeddedFooterText = "embeddedFooterText_example";  // string? | Custom footer text for the embedded application. An empty string clears the footer. (optional) 
            var visualizationFonts = new VisualizationFontsInput?(); // VisualizationFontsInput? | Font assignments per visualization area. Provide only the areas to update; omitted areas remain unchanged. (optional) 
            var defaultLogo = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG. (optional) 
            var wideLogo = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG. (optional) 

            try
            {
                apiInstance.UpdateStyleCustomization(scope, operation, resetOptions, navigationPanel, chartColorPalette, embeddedFooterText, visualizationFonts, defaultLogo, wideLogo);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.UpdateStyleCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateStyleCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateStyleCustomizationWithHttpInfo(scope, operation, resetOptions, navigationPanel, chartColorPalette, embeddedFooterText, visualizationFonts, defaultLogo, wideLogo);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.UpdateStyleCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **scope** | **string** | Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user&#39;s org. | [default to ORG] |
| **operation** | **string?** | Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults. | [optional] [default to REPLACE] |
| **resetOptions** | [**StyleResetOptionsInput?**](StyleResetOptionsInput?.md) | Fields to reset when operation is RESET. Specify style fields and visualization areas to revert to defaults. | [optional]  |
| **navigationPanel** | [**NavigationPanelInput?**](NavigationPanelInput?.md) | Navigation panel color. Provide theme and, when theme is CUSTOM, also provide base_color. | [optional]  |
| **chartColorPalette** | [**StyleColorPaletteInput?**](StyleColorPaletteInput?.md) | Chart color palette. When provided with operation REPLACE, exactly 8 color entries must be specified in colors. | [optional]  |
| **embeddedFooterText** | **string?** | Custom footer text for the embedded application. An empty string clears the footer. | [optional]  |
| **visualizationFonts** | [**VisualizationFontsInput?**](VisualizationFontsInput?.md) | Font assignments per visualization area. Provide only the areas to update; omitted areas remain unchanged. | [optional]  |
| **defaultLogo** | **FileParameter?****FileParameter?** | Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG. | [optional]  |
| **wideLogo** | **FileParameter?****FileParameter?** | Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG. | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatestylefont"></a>
# **UpdateStyleFont**
> void UpdateStyleFont (string fontIdentifier, UpdateStyleFontRequest updateStyleFontRequest)



  Version: 26.7.0.cl or later   Updates the metadata of an existing custom font in the cluster-level or org-level font library. Only the fields provided in the request are modified; omitted fields remain unchanged.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Identify the font using `font_identifier` (UUID or name). - Set `scope` to `CLUSTER` to target the cluster-level library. Set `scope` to `ORG` (default) to target the authenticated user's org library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and re-upload using `uploadStyleFont`. - `name` must be unique within the target scope if provided. - `color` must be a valid 6-digit hex string (e.g. `#333333`) if provided.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class UpdateStyleFontExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var fontIdentifier = "fontIdentifier_example";  // string | UUID or name of the font to update.
            var updateStyleFontRequest = new UpdateStyleFontRequest(); // UpdateStyleFontRequest | 

            try
            {
                apiInstance.UpdateStyleFont(fontIdentifier, updateStyleFontRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.UpdateStyleFont: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateStyleFontWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateStyleFontWithHttpInfo(fontIdentifier, updateStyleFontRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.UpdateStyleFontWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fontIdentifier** | **string** | UUID or name of the font to update. |  |
| **updateStyleFontRequest** | [**UpdateStyleFontRequest**](UpdateStyleFontRequest.md) |  |  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="uploadstylefont"></a>
# **UploadStyleFont**
> StyleFontUploadData UploadStyleFont (string name, FileParameter fileContent, string? scope = null, string? weight = null, string? style = null, string? color = null)



  Version: 26.7.0.cl or later   Uploads a custom font to the cluster-level or org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only available within that org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are rejected with an error. - The `name` field must be unique within the target scope. Uploading a font with a name that already exists returns an error. - Set `scope` to `CLUSTER` to upload to the cluster-level library. Set `scope` to `ORG` (default) to upload to the authenticated user's org library. - `weight` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `LIGHT`, `BOLD`. - `style` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `ITALIC`, `OBLIQUE`. - `color` defaults to `#000000` (black) if omitted. Provide as a 6-digit hex string (e.g. `#333333`). - The uploaded font can be assigned to visualization areas using the `updateStyleCustomization` endpoint.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class UploadStyleFontExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new StyleCustomizationApi(httpClient, config, httpClientHandler);
            var name = "name_example";  // string | Display name for the font (e.g. \\\"Acme Sans\\\"). Must be unique within the target scope; returns an error if a font with this name already exists.
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter | Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload.
            var scope = "CLUSTER";  // string? | Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user's org library. Defaults to ORG if omitted. (optional)  (default to ORG)
            var weight = "NORMAL";  // string? | Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted. (optional)  (default to NORMAL)
            var style = "NORMAL";  // string? | Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted. (optional)  (default to NORMAL)
            var color = "color_example";  // string? | Color of the font as a 6-digit hex string (e.g. \\\"#333333\\\"). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed. (optional) 

            try
            {
                StyleFontUploadData result = apiInstance.UploadStyleFont(name, fileContent, scope, weight, style, color);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StyleCustomizationApi.UploadStyleFont: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UploadStyleFontWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<StyleFontUploadData> response = apiInstance.UploadStyleFontWithHttpInfo(name, fileContent, scope, weight, style, color);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StyleCustomizationApi.UploadStyleFontWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** | Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). Must be unique within the target scope; returns an error if a font with this name already exists. |  |
| **fileContent** | **FileParameter****FileParameter** | Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload. |  |
| **scope** | **string?** | Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user&#39;s org library. Defaults to ORG if omitted. | [optional] [default to ORG] |
| **weight** | **string?** | Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted. | [optional] [default to NORMAL] |
| **style** | **string?** | Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted. | [optional] [default to NORMAL] |
| **color** | **string?** | Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

