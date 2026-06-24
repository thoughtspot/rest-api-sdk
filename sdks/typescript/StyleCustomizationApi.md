# ThoughtSpotRestApiSdk.StyleCustomizationApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteStyleFonts**](StyleCustomizationApi.md#deleteStyleFonts) | **POST** /api/rest/2.0/customization/styles/fonts/delete | 
[**exportStyleLogos**](StyleCustomizationApi.md#exportStyleLogos) | **POST** /api/rest/2.0/customization/styles/logos/export | 
[**searchStyleCustomizations**](StyleCustomizationApi.md#searchStyleCustomizations) | **POST** /api/rest/2.0/customization/styles/search | 
[**searchStyleFonts**](StyleCustomizationApi.md#searchStyleFonts) | **POST** /api/rest/2.0/customization/styles/fonts/search | 
[**updateStyleCustomization**](StyleCustomizationApi.md#updateStyleCustomization) | **POST** /api/rest/2.0/customization/styles/update | 
[**updateStyleFont**](StyleCustomizationApi.md#updateStyleFont) | **POST** /api/rest/2.0/customization/styles/fonts/{font_identifier}/update | 
[**uploadStyleFont**](StyleCustomizationApi.md#uploadStyleFont) | **POST** /api/rest/2.0/customization/styles/fonts/upload | 


# **deleteStyleFonts**
> StyleFontDeleteData deleteStyleFonts(deleteStyleFontsRequest)

  Version: 26.7.0.cl or later   Deletes one or more custom fonts from the cluster-level or org-level font library. If a deleted font is assigned to visualization areas, those assignments automatically fallback to the cluster/system default font. The response lists all affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually delete fonts, you must explicitly pass dry_run: false.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Provide one or more font UUIDs or names in `font_identifiers`. - Set `scope` to `CLUSTER` to delete from the cluster-level library. Set `scope` to `ORG` (default) to delete from the authenticated user\'s org library. - Use `dry_run: true` to preview which visualization areas would be affected without actually deleting the font. The response lists affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the font file using `uploadStyleFont` if needed.      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, DeleteStyleFontsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.deleteStyleFonts(
  // DeleteStyleFontsRequest
  {
    scope: "ORG",
    font_identifiers: [
      "font_identifiers_example",
    ],
    dry_run: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteStyleFontsRequest** | **DeleteStyleFontsRequest**|  |


### Return type

**StyleFontDeleteData**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Font deleted successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **exportStyleLogos**
> void exportStyleLogos(exportStyleLogosRequest)

  Version: 26.7.0.cl or later   Downloads the active logos (default and wide slots) at the requested scope as a single ZIP archive containing both logo image files. If no custom logo has been uploaded at the ORG scope, the archive contains the resolved logo falling through from the cluster. If no cluster logo has been uploaded, no file is returned.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to download cluster-level logos. - Set `scope` to `ORG` (default) to download logos for the authenticated user\'s org. - The response is a ZIP archive (`application/zip`). Save the response body directly to a `.zip` file. - The archive always contains two files — one for the DEFAULT slot and one for the WIDE slot — even if no custom logo is set at the requested scope.      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, ExportStyleLogosRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.exportStyleLogos(
  // ExportStyleLogosRequest
  {
    scope: "ORG",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportStyleLogosRequest** | **ExportStyleLogosRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Logo ZIP archive retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchStyleCustomizations**
> Array<StylePreference> searchStyleCustomizations(searchStyleCustomizationsRequest)

  Version: 26.7.0.cl or later   Retrieves style preferences at cluster level or for the authenticated user\'s org. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to retrieve cluster-level style defaults. - Set `scope` to `ORG` (default) to retrieve preferences for the authenticated user\'s org. - Each field in the response includes an `is_overridden` flag indicating whether the value was explicitly set at the requested scope or inherited from a parent scope (cluster or system default).      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, SearchStyleCustomizationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.searchStyleCustomizations(
  // SearchStyleCustomizationsRequest
  {
    scope: "CLUSTER",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchStyleCustomizationsRequest** | **SearchStyleCustomizationsRequest**|  |


### Return type

**Array<StylePreference>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Style preferences retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchStyleFonts**
> Array<StyleFontRecord> searchStyleFonts(searchStyleFontsRequest)

  Version: 26.7.0.cl or later   Returns custom fonts from the cluster-level or org-level font library. Omitting all filter fields returns all fonts in the target scope.  When `include_font_assignments` is `true`, the response includes only the visualization areas explicitly assigned to each font. For cluster-scoped fonts, `org` is returned as `null`.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to search the cluster-level library. Set `scope` to `ORG` (default) to search the authenticated user\'s org library. - Use `font_identifier` to look up a specific font by UUID or name. - Use `name_pattern` for partial, case-insensitive name matching. - Set `include_font_assignments` to `true` to include visualization areas this font is currently assigned to. Defaults to `false`.      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, SearchStyleFontsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.searchStyleFonts(
  // SearchStyleFontsRequest
  {
    scope: "CLUSTER",
    font_identifier: "font_identifier_example",
    name_pattern: "name_pattern_example",
    include_font_assignments: false,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchStyleFontsRequest** | **SearchStyleFontsRequest**|  |


### Return type

**Array<StyleFontRecord>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom fonts retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateStyleCustomization**
> void updateStyleCustomization()

  Version: 26.7.0.cl or later   Updates style preferences at cluster level or for the authenticated user\'s org, including navigation panel color, chart color palette, embedded footer text, logo, and font assignments per visualization area. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an Org-level preference falls back to Cluster-level preference, which on reset falls back to system defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**)  privilege.  #### Usage guidelines  Two operations are supported via the `operation` field:  - **REPLACE** (default): Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**: Reverts specific fields to defaults. Specify which fields to reset using `reset_options.style` (for style fields) and `reset_options.visualization_areas` (for font assignments). Fields not listed in `reset_options` are not affected.  #### Logo upload  Logo files are uploaded as binary fields using `multipart/form-data`:  - `default_logo`: Square app icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. - `wide_logo`: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted formats: PNG, JPG.  To reset a logo to the default, use `operation: RESET` with `reset_options.style` set to `DEFAULT_LOGO` or `WIDE_LOGO`.  #### Navigation panel color  Set `navigation_panel.theme` to one of:  - `DARK`: Default dark theme. - `TWO_TONE`: Dual-tone panel style. - `CUSTOM`: User-defined color. Provide `navigation_panel.base_color` as a 6-digit hex string (e.g. `#2359B6`).  #### Chart color palette  Provide exactly 8 color entries in `chart_color_palette.colors`. Each entry requires a `primary` hex color. If `secondary` shades are omitted, the server auto-generates 4 shades from the primary color.  #### Font assignments  Specify `visualization_fonts.chart_visualization_fonts`, `visualization_fonts.table_visualization_fonts`, and `visualization_fonts.advanced_chart_visualization_fonts` to assign custom fonts to specific visualization areas. Only provide the areas you want to update; omitted areas remain unchanged.      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, UpdateStyleCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.updateStyleCustomization(
  // string | Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user\\\'s org.
  "ORG" , 
  // string | Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults. (optional)
  "REPLACE" , 
  // UpdateStyleCustomizationRequestResetOptions (optional)
  null , 
  // UpdateStyleCustomizationRequestNavigationPanel (optional)
  null , 
  // UpdateStyleCustomizationRequestChartColorPalette (optional)
  null , 
  // string | Custom footer text for the embedded application. An empty string clears the footer. (optional)
  "embeddedFooterText_example" , 
  // UpdateStyleCustomizationRequestVisualizationFonts (optional)
  null , 
  // HttpFile | Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG. (optional)
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } , 
  // HttpFile | Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG. (optional)
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | [**string**]**Array<&#39;CLUSTER&#39; &#124; &#39;ORG&#39;>** | Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user\\\&#39;s org. | defaults to 'ORG'
 **operation** | [**string**]**Array<&#39;REPLACE&#39; &#124; &#39;RESET&#39;>** | Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults. | (optional) defaults to 'REPLACE'
 **resetOptions** | **UpdateStyleCustomizationRequestResetOptions** |  | (optional) defaults to undefined
 **navigationPanel** | **UpdateStyleCustomizationRequestNavigationPanel** |  | (optional) defaults to undefined
 **chartColorPalette** | **UpdateStyleCustomizationRequestChartColorPalette** |  | (optional) defaults to undefined
 **embeddedFooterText** | [**string**] | Custom footer text for the embedded application. An empty string clears the footer. | (optional) defaults to undefined
 **visualizationFonts** | **UpdateStyleCustomizationRequestVisualizationFonts** |  | (optional) defaults to undefined
 **defaultLogo** | [**HttpFile**] | Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG. | (optional) defaults to undefined
 **wideLogo** | [**HttpFile**] | Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Style preferences updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateStyleFont**
> void updateStyleFont(updateStyleFontRequest)

  Version: 26.7.0.cl or later   Updates the metadata of an existing custom font in the cluster-level or org-level font library. Only the fields provided in the request are modified; omitted fields remain unchanged.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Identify the font using `font_identifier` (UUID or name). - Set `scope` to `CLUSTER` to target the cluster-level library. Set `scope` to `ORG` (default) to target the authenticated user\'s org library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and re-upload using `uploadStyleFont`. - `color` must be a valid 6-digit hex string (e.g. `#333333`) if provided.      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, UpdateStyleFontRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.updateStyleFont(
  // string | UUID or name of the font to update.
  "font_identifier_example" , 
  // UpdateStyleFontRequest
  {
    scope: "ORG",
    name: "name_example",
    weight: "NORMAL",
    style: "NORMAL",
    color: "color_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateStyleFontRequest** | **UpdateStyleFontRequest**|  |
 **fontIdentifier** | [**string**] | UUID or name of the font to update. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Font metadata updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **uploadStyleFont**
> StyleFontUploadData uploadStyleFont()

  Version: 26.7.0.cl or later   Uploads a custom font to the cluster-level or org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only available within that org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are rejected with an error. - Set `scope` to `CLUSTER` to upload to the cluster-level library. Set `scope` to `ORG` (default) to upload to the authenticated user\'s org library. - `weight` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `LIGHT`, `BOLD`. - `style` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `ITALIC`, `OBLIQUE`. - `color` defaults to `#000000` (black) if omitted. Provide as a 6-digit hex string (e.g. `#333333`). - The uploaded font can be assigned to visualization areas using the `updateStyleCustomization` endpoint.      

### Example


```typescript
import { createBearerAuthenticationConfig, StyleCustomizationApi, UploadStyleFontRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new StyleCustomizationApi(configuration);

apiInstance.uploadStyleFont(
  // string | Display name for the font (e.g. \\\"Acme Sans\\\").
  "name_example" , 
  // HttpFile | Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload.
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } , 
  // string | Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user\\\'s org library. Defaults to ORG if omitted. (optional)
  "ORG" , 
  // string | Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted. (optional)
  "NORMAL" , 
  // string | Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted. (optional)
  "NORMAL" , 
  // string | Color of the font as a 6-digit hex string (e.g. \\\"#333333\\\"). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed. (optional)
  "color_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**string**] | Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). | defaults to undefined
 **fileContent** | [**HttpFile**] | Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload. | defaults to undefined
 **scope** | [**string**]**Array<&#39;CLUSTER&#39; &#124; &#39;ORG&#39;>** | Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user\\\&#39;s org library. Defaults to ORG if omitted. | (optional) defaults to 'ORG'
 **weight** | [**string**]**Array<&#39;NORMAL&#39; &#124; &#39;LIGHT&#39; &#124; &#39;BOLD&#39;>** | Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted. | (optional) defaults to 'NORMAL'
 **style** | [**string**]**Array<&#39;NORMAL&#39; &#124; &#39;ITALIC&#39; &#124; &#39;OBLIQUE&#39;>** | Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted. | (optional) defaults to 'NORMAL'
 **color** | [**string**] | Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed. | (optional) defaults to undefined


### Return type

**StyleFontUploadData**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Font uploaded successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

