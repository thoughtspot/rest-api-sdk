// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { DeleteStyleFontsRequest } from '../models/DeleteStyleFontsRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { ExportStyleLogosRequest } from '../models/ExportStyleLogosRequest';
import { NavigationPanelInput } from '../models/NavigationPanelInput';
import { SearchStyleCustomizationsRequest } from '../models/SearchStyleCustomizationsRequest';
import { SearchStyleFontsRequest } from '../models/SearchStyleFontsRequest';
import { StyleColorPaletteInput } from '../models/StyleColorPaletteInput';
import { StyleFontDeleteData } from '../models/StyleFontDeleteData';
import { StyleFontRecord } from '../models/StyleFontRecord';
import { StyleFontUploadData } from '../models/StyleFontUploadData';
import { StylePreference } from '../models/StylePreference';
import { StyleResetOptionsInput } from '../models/StyleResetOptionsInput';
import { UpdateStyleFontRequest } from '../models/UpdateStyleFontRequest';
import { VisualizationFontsInput } from '../models/VisualizationFontsInput';

/**
 * no description
 */
export class StyleCustomizationApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 26.7.0.cl or later   Deletes one or more custom fonts from the cluster-level or org-level font library. If a deleted font is assigned to visualization areas, those assignments automatically fallback to the cluster/system default font. The response lists all affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually delete fonts, you must explicitly pass dry_run: false.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Provide one or more font UUIDs or names in `font_identifiers`. - Set `scope` to `CLUSTER` to delete from the cluster-level library. Set `scope` to `ORG` (default) to delete from the authenticated user\'s org library. - Use `dry_run: true` to preview which visualization areas would be affected without actually deleting the font. The response lists affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the font file using `uploadStyleFont` if needed.      
     * @param deleteStyleFontsRequest 
     */
    public async deleteStyleFonts(deleteStyleFontsRequest: DeleteStyleFontsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'deleteStyleFontsRequest' is not null or undefined
        if (deleteStyleFontsRequest === null || deleteStyleFontsRequest === undefined) {
            throw new RequiredError("StyleCustomizationApi", "deleteStyleFonts", "deleteStyleFontsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/fonts/delete';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(deleteStyleFontsRequest, "DeleteStyleFontsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.7.0.cl or later   Downloads the active logos (default and wide slots) at the requested scope as a single ZIP archive containing both logo image files. If no custom logo has been uploaded at the ORG scope, the archive contains the resolved logo falling through from the cluster. If no cluster logo has been uploaded, no file is returned.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to download cluster-level logos. - Set `scope` to `ORG` (default) to download logos for the authenticated user\'s org. - The response is a ZIP archive (`application/zip`). Save the response body directly to a `.zip` file. - The archive always contains two files — one for the DEFAULT slot and one for the WIDE slot — even if no custom logo is set at the requested scope.      
     * @param exportStyleLogosRequest 
     * @param accept 
     */
    public async exportStyleLogos(exportStyleLogosRequest: ExportStyleLogosRequest, accept?: 'application/zip', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'exportStyleLogosRequest' is not null or undefined
        if (exportStyleLogosRequest === null || exportStyleLogosRequest === undefined) {
            throw new RequiredError("StyleCustomizationApi", "exportStyleLogos", "exportStyleLogosRequest");
        }



        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/logos/export';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")

        // Header Params
        requestContext.setHeaderParam("Accept", ObjectSerializer.serialize(accept, "'application/zip'", ""));


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(exportStyleLogosRequest, "ExportStyleLogosRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.7.0.cl or later   Retrieves style preferences at cluster level or for the authenticated user\'s org. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to retrieve cluster-level style defaults. - Set `scope` to `ORG` (default) to retrieve preferences for the authenticated user\'s org. - Each field in the response includes an `is_overridden` flag indicating whether the value was explicitly set at the requested scope or inherited from a parent scope (cluster or system default).      
     * @param searchStyleCustomizationsRequest 
     */
    public async searchStyleCustomizations(searchStyleCustomizationsRequest: SearchStyleCustomizationsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchStyleCustomizationsRequest' is not null or undefined
        if (searchStyleCustomizationsRequest === null || searchStyleCustomizationsRequest === undefined) {
            throw new RequiredError("StyleCustomizationApi", "searchStyleCustomizations", "searchStyleCustomizationsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchStyleCustomizationsRequest, "SearchStyleCustomizationsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.7.0.cl or later   Returns custom fonts from the cluster-level or org-level font library. Omitting all filter fields returns all fonts in the target scope.  When `include_font_assignments` is `true`, the response includes only the visualization areas explicitly assigned to each font. For cluster-scoped fonts, `org` is returned as `null`.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to search the cluster-level library. Set `scope` to `ORG` (default) to search the authenticated user\'s org library. - Use `font_identifier` to look up a specific font by UUID or name. - Use `name_pattern` for partial, case-insensitive name matching. - Set `include_font_assignments` to `true` to include visualization areas this font is currently assigned to. Defaults to `false`.      
     * @param searchStyleFontsRequest 
     */
    public async searchStyleFonts(searchStyleFontsRequest: SearchStyleFontsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchStyleFontsRequest' is not null or undefined
        if (searchStyleFontsRequest === null || searchStyleFontsRequest === undefined) {
            throw new RequiredError("StyleCustomizationApi", "searchStyleFonts", "searchStyleFontsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/fonts/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchStyleFontsRequest, "SearchStyleFontsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.7.0.cl or later   Updates style preferences at cluster level or for the authenticated user\'s org, including navigation panel color, chart color palette, embedded footer text, logo, and font assignments per visualization area. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an Org-level preference falls back to Cluster-level preference, which on reset falls back to system defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**)  privilege.  #### Usage guidelines  Two operations are supported via the `operation` field:  - **REPLACE** (default): Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**: Reverts specific fields to defaults. Specify which fields to reset using `reset_options.style` (for style fields) and `reset_options.visualization_areas` (for font assignments). Fields not listed in `reset_options` are not affected.  #### Logo upload  Logo files are uploaded as binary fields using `multipart/form-data`:  - `default_logo`: Square app icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. - `wide_logo`: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted formats: PNG, JPG.  To reset a logo to the default, use `operation: RESET` with `reset_options.style` set to `DEFAULT_LOGO` or `WIDE_LOGO`.  #### Navigation panel color  Set `navigation_panel.theme` to one of:  - `DARK`: Default dark theme. - `TWO_TONE`: Dual-tone panel style. - `CUSTOM`: User-defined color. Provide `navigation_panel.base_color` as a 6-digit hex string (e.g. `#2359B6`).  #### Chart color palette  Provide exactly 8 color entries in `chart_color_palette.colors`. Each entry requires a `primary` hex color. If `secondary` shades are omitted, the server auto-generates 4 shades from the primary color.  #### Font assignments  Specify `visualization_fonts.chart_visualization_fonts`, `visualization_fonts.table_visualization_fonts`, and `visualization_fonts.advanced_chart_visualization_fonts` to assign custom fonts to specific visualization areas. Only provide the areas you want to update; omitted areas remain unchanged.      
     * @param scope Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user\\\&#39;s org.
     * @param operation Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults.
     * @param resetOptions Fields to reset when operation is RESET. Specify style fields and visualization areas to revert to defaults.
     * @param navigationPanel Navigation panel color. Provide theme and, when theme is CUSTOM, also provide base_color.
     * @param chartColorPalette Chart color palette. When provided with operation REPLACE, exactly 8 color entries must be specified in colors.
     * @param embeddedFooterText Custom footer text for the embedded application. An empty string clears the footer.
     * @param visualizationFonts Font assignments per visualization area. Provide only the areas to update; omitted areas remain unchanged.
     * @param defaultLogo Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG.
     * @param wideLogo Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG.
     */
    public async updateStyleCustomization(scope: string, operation?: string, resetOptions?: StyleResetOptionsInput, navigationPanel?: NavigationPanelInput, chartColorPalette?: StyleColorPaletteInput, embeddedFooterText?: string, visualizationFonts?: VisualizationFontsInput, defaultLogo?: HttpFile, wideLogo?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'scope' is not null or undefined
        if (scope === null || scope === undefined) {
            throw new RequiredError("StyleCustomizationApi", "updateStyleCustomization", "scope");
        }










        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/update';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (scope !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('scope', scope as any);
        }
        if (operation !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('operation', operation as any);
        }
        if (resetOptions !== undefined) {
             // TODO: replace .append with .set
             // Object form field declared with encoding: application/json in the
             // spec — serialize as a JSON string (the generator does not honor
             // multipart `encoding.contentType`, and the backend parses JSON here).
             localVarFormParams.append('reset_options', JSON.stringify(resetOptions));
        }
        if (navigationPanel !== undefined) {
             // TODO: replace .append with .set
             // Object form field declared with encoding: application/json in the
             // spec — serialize as a JSON string (the generator does not honor
             // multipart `encoding.contentType`, and the backend parses JSON here).
             localVarFormParams.append('navigation_panel', JSON.stringify(navigationPanel));
        }
        if (chartColorPalette !== undefined) {
             // TODO: replace .append with .set
             // Object form field declared with encoding: application/json in the
             // spec — serialize as a JSON string (the generator does not honor
             // multipart `encoding.contentType`, and the backend parses JSON here).
             localVarFormParams.append('chart_color_palette', JSON.stringify(chartColorPalette));
        }
        if (embeddedFooterText !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('embedded_footer_text', embeddedFooterText as any);
        }
        if (visualizationFonts !== undefined) {
             // TODO: replace .append with .set
             // Object form field declared with encoding: application/json in the
             // spec — serialize as a JSON string (the generator does not honor
             // multipart `encoding.contentType`, and the backend parses JSON here).
             localVarFormParams.append('visualization_fonts', JSON.stringify(visualizationFonts));
        }
        if (defaultLogo !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('default_logo', defaultLogo, defaultLogo.name);
             }
        }
        if (wideLogo !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('wide_logo', wideLogo, wideLogo.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.7.0.cl or later   Updates the metadata of an existing custom font in the cluster-level or org-level font library. Only the fields provided in the request are modified; omitted fields remain unchanged.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Identify the font using `font_identifier` (UUID or name). - Set `scope` to `CLUSTER` to target the cluster-level library. Set `scope` to `ORG` (default) to target the authenticated user\'s org library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and re-upload using `uploadStyleFont`. - `color` must be a valid 6-digit hex string (e.g. `#333333`) if provided.      
     * @param fontIdentifier UUID or name of the font to update.
     * @param updateStyleFontRequest 
     */
    public async updateStyleFont(fontIdentifier: string, updateStyleFontRequest: UpdateStyleFontRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fontIdentifier' is not null or undefined
        if (fontIdentifier === null || fontIdentifier === undefined) {
            throw new RequiredError("StyleCustomizationApi", "updateStyleFont", "fontIdentifier");
        }


        // verify required parameter 'updateStyleFontRequest' is not null or undefined
        if (updateStyleFontRequest === null || updateStyleFontRequest === undefined) {
            throw new RequiredError("StyleCustomizationApi", "updateStyleFont", "updateStyleFontRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/fonts/{font_identifier}/update'
            .replace('{font_identifier}', encodeURIComponent(String(fontIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateStyleFontRequest, "UpdateStyleFontRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.7.0.cl or later   Uploads a custom font to the cluster-level or org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only available within that org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are rejected with an error. - Set `scope` to `CLUSTER` to upload to the cluster-level library. Set `scope` to `ORG` (default) to upload to the authenticated user\'s org library. - `weight` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `LIGHT`, `BOLD`. - `style` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `ITALIC`, `OBLIQUE`. - `color` defaults to `#000000` (black) if omitted. Provide as a 6-digit hex string (e.g. `#333333`). - The uploaded font can be assigned to visualization areas using the `updateStyleCustomization` endpoint.      
     * @param name Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). Must be unique within the target scope; returns an error if a font with this name already exists.
     * @param fileContent Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload.
     * @param scope Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user\\\&#39;s org library. Defaults to ORG if omitted.
     * @param weight Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted.
     * @param style Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted.
     * @param color Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed.
     */
    public async uploadStyleFont(name: string, fileContent: HttpFile, scope?: string, weight?: string, style?: string, color?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("StyleCustomizationApi", "uploadStyleFont", "name");
        }


        // verify required parameter 'fileContent' is not null or undefined
        if (fileContent === null || fileContent === undefined) {
            throw new RequiredError("StyleCustomizationApi", "uploadStyleFont", "fileContent");
        }






        // Path Params
        const localVarPath = '/api/rest/2.0/customization/styles/fonts/upload';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (scope !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('scope', scope as any);
        }
        if (name !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('name', name as any);
        }
        if (weight !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('weight', weight as any);
        }
        if (style !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('style', style as any);
        }
        if (color !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('color', color as any);
        }
        if (fileContent !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('file_content', fileContent, fileContent.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class StyleCustomizationApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteStyleFonts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteStyleFontsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<StyleFontDeleteData >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: StyleFontDeleteData = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StyleFontDeleteData", ""
            ) as StyleFontDeleteData;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: StyleFontDeleteData = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StyleFontDeleteData", ""
            ) as StyleFontDeleteData;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportStyleLogos
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async exportStyleLogosWithHttpInfo(response: ResponseContext): Promise<HttpInfo<HttpFile >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: HttpFile = await response.getBodyAsFile() as any as HttpFile;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: HttpFile = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "HttpFile", "binary"
            ) as HttpFile;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchStyleCustomizations
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchStyleCustomizationsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<StylePreference> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<StylePreference> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<StylePreference>", ""
            ) as Array<StylePreference>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<StylePreference> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<StylePreference>", ""
            ) as Array<StylePreference>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchStyleFonts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchStyleFontsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<StyleFontRecord> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<StyleFontRecord> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<StyleFontRecord>", ""
            ) as Array<StyleFontRecord>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<StyleFontRecord> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<StyleFontRecord>", ""
            ) as Array<StyleFontRecord>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateStyleCustomization
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateStyleCustomizationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateStyleFont
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateStyleFontWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to uploadStyleFont
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async uploadStyleFontWithHttpInfo(response: ResponseContext): Promise<HttpInfo<StyleFontUploadData >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: StyleFontUploadData = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StyleFontUploadData", ""
            ) as StyleFontUploadData;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: StyleFontUploadData = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StyleFontUploadData", ""
            ) as StyleFontUploadData;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
