/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.DeleteStyleFontsRequest;
import com.thoughtspot.client.model.ExportStyleLogosRequest;
import com.thoughtspot.client.model.NavigationPanelInput;
import com.thoughtspot.client.model.SearchStyleCustomizationsRequest;
import com.thoughtspot.client.model.SearchStyleFontsRequest;
import com.thoughtspot.client.model.StyleColorPaletteInput;
import com.thoughtspot.client.model.StyleFontDeleteData;
import com.thoughtspot.client.model.StyleFontRecord;
import com.thoughtspot.client.model.StyleFontUploadData;
import com.thoughtspot.client.model.StylePreference;
import com.thoughtspot.client.model.StyleResetOptionsInput;
import com.thoughtspot.client.model.UpdateStyleFontRequest;
import com.thoughtspot.client.model.VisualizationFontsInput;
import java.io.File;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for StyleCustomizationApi */
@Disabled
public class StyleCustomizationApiTest {

    private final StyleCustomizationApi api = new StyleCustomizationApi();

    /**
     * Version: 26.7.0.cl or later Deletes one or more custom fonts from the cluster-level or
     * org-level font library. If a deleted font is assigned to visualization areas, those
     * assignments automatically fallback to the cluster/system default font. The response lists all
     * affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually
     * delete fonts, you must explicitly pass dry_run: false. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**)
     * privilege. #### Usage guidelines - Provide one or more font UUIDs or names in
     * &#x60;font_identifiers&#x60;. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete from
     * the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to delete from
     * the authenticated user&#39;s org library. - Use &#x60;dry_run: true&#x60; to preview which
     * visualization areas would be affected without actually deleting the font. The response lists
     * affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the
     * font file using &#x60;uploadStyleFont&#x60; if needed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteStyleFontsTest() throws ApiException {
        DeleteStyleFontsRequest deleteStyleFontsRequest = null;
        StyleFontDeleteData response = api.deleteStyleFonts(deleteStyleFontsRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.7.0.cl or later Downloads the active logos (default and wide slots) at the
     * requested scope as a single ZIP archive containing both logo image files. If no custom logo
     * has been uploaded at the ORG scope, the archive contains the resolved logo falling through
     * from the cluster. If no cluster logo has been uploaded, no file is returned. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. #### Usage guidelines - Set &#x60;scope&#x60; to
     * &#x60;CLUSTER&#x60; to download cluster-level logos. - Set &#x60;scope&#x60; to
     * &#x60;ORG&#x60; (default) to download logos for the authenticated user&#39;s org. - The
     * response is a ZIP archive (&#x60;application/zip&#x60;). Save the response body directly to a
     * &#x60;.zip&#x60; file. - The archive always contains two files — one for the DEFAULT slot and
     * one for the WIDE slot — even if no custom logo is set at the requested scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportStyleLogosTest() throws ApiException {
        ExportStyleLogosRequest exportStyleLogosRequest = null;
        api.exportStyleLogos(exportStyleLogosRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.7.0.cl or later Retrieves style preferences at cluster level or for the
     * authenticated user&#39;s org. Cluster-level preferences serve as defaults for all orgs.
     * Org-level preferences override cluster defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to retrieve
     * cluster-level style defaults. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to
     * retrieve preferences for the authenticated user&#39;s org. - Each field in the response
     * includes an &#x60;is_overridden&#x60; flag indicating whether the value was explicitly set at
     * the requested scope or inherited from a parent scope (cluster or system default).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchStyleCustomizationsTest() throws ApiException {
        SearchStyleCustomizationsRequest searchStyleCustomizationsRequest = null;
        List<StylePreference> response =
                api.searchStyleCustomizations(searchStyleCustomizationsRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.7.0.cl or later Returns custom fonts from the cluster-level or org-level font
     * library. Omitting all filter fields returns all fonts in the target scope. When
     * &#x60;include_font_assignments&#x60; is &#x60;true&#x60;, the response includes only the
     * visualization areas explicitly assigned to each font. For cluster-scoped fonts,
     * &#x60;org&#x60; is returned as &#x60;null&#x60;. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to search the
     * cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to search the
     * authenticated user&#39;s org library. - Use &#x60;font_identifier&#x60; to look up a specific
     * font by UUID or name. - Use &#x60;name_pattern&#x60; for partial, case-insensitive name
     * matching. - Set &#x60;include_font_assignments&#x60; to &#x60;true&#x60; to include
     * visualization areas this font is currently assigned to. Defaults to &#x60;false&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchStyleFontsTest() throws ApiException {
        SearchStyleFontsRequest searchStyleFontsRequest = null;
        List<StyleFontRecord> response = api.searchStyleFonts(searchStyleFontsRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.7.0.cl or later Updates style preferences at cluster level or for the
     * authenticated user&#39;s org, including navigation panel color, chart color palette, embedded
     * footer text, logo, and font assignments per visualization area. Cluster-level preferences
     * serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an
     * Org-level preference falls back to Cluster-level preference, which on reset falls back to
     * system defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage guidelines Two
     * operations are supported via the &#x60;operation&#x60; field: - **REPLACE** (default):
     * Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**:
     * Reverts specific fields to defaults. Specify which fields to reset using
     * &#x60;reset_options.style&#x60; (for style fields) and
     * &#x60;reset_options.visualization_areas&#x60; (for font assignments). Fields not listed in
     * &#x60;reset_options&#x60; are not affected. #### Logo upload Logo files are uploaded as
     * binary fields using &#x60;multipart/form-data&#x60;: - &#x60;default_logo&#x60;: Square app
     * icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. -
     * &#x60;wide_logo&#x60;: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted
     * formats: PNG, JPG. To reset a logo to the default, use &#x60;operation: RESET&#x60; with
     * &#x60;reset_options.style&#x60; set to &#x60;DEFAULT_LOGO&#x60; or &#x60;WIDE_LOGO&#x60;.
     * #### Navigation panel color Set &#x60;navigation_panel.theme&#x60; to one of: -
     * &#x60;DARK&#x60;: Default dark theme. - &#x60;TWO_TONE&#x60;: Dual-tone panel style. -
     * &#x60;CUSTOM&#x60;: User-defined color. Provide &#x60;navigation_panel.base_color&#x60; as a
     * 6-digit hex string (e.g. &#x60;#2359B6&#x60;). #### Chart color palette Provide exactly 8
     * color entries in &#x60;chart_color_palette.colors&#x60;. Each entry requires a
     * &#x60;primary&#x60; hex color. If &#x60;secondary&#x60; shades are omitted, the server
     * auto-generates 4 shades from the primary color. #### Font assignments Specify
     * &#x60;visualization_fonts.chart_visualization_fonts&#x60;,
     * &#x60;visualization_fonts.table_visualization_fonts&#x60;, and
     * &#x60;visualization_fonts.advanced_chart_visualization_fonts&#x60; to assign custom fonts to
     * specific visualization areas. Only provide the areas you want to update; omitted areas remain
     * unchanged.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStyleCustomizationTest() throws ApiException {
        String scope = null;
        String operation = null;
        StyleResetOptionsInput resetOptions = null;
        NavigationPanelInput navigationPanel = null;
        StyleColorPaletteInput chartColorPalette = null;
        String embeddedFooterText = null;
        VisualizationFontsInput visualizationFonts = null;
        File defaultLogo = null;
        File wideLogo = null;
        api.updateStyleCustomization(
                scope,
                operation,
                resetOptions,
                navigationPanel,
                chartColorPalette,
                embeddedFooterText,
                visualizationFonts,
                defaultLogo,
                wideLogo);
        // TODO: test validations
    }

    /**
     * Version: 26.7.0.cl or later Updates the metadata of an existing custom font in the
     * cluster-level or org-level font library. Only the fields provided in the request are
     * modified; omitted fields remain unchanged. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Identify the font using &#x60;font_identifier&#x60; (UUID or name). -
     * Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to target the cluster-level library. Set
     * &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to target the authenticated user&#39;s org
     * library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and
     * re-upload using &#x60;uploadStyleFont&#x60;. - &#x60;name&#x60; must be unique within the
     * target scope if provided. - &#x60;color&#x60; must be a valid 6-digit hex string (e.g.
     * &#x60;#333333&#x60;) if provided.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStyleFontTest() throws ApiException {
        String fontIdentifier = null;
        UpdateStyleFontRequest updateStyleFontRequest = null;
        api.updateStyleFont(fontIdentifier, updateStyleFontRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.7.0.cl or later Uploads a custom font to the cluster-level or org-level font
     * library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only
     * available within that org. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage
     * guidelines - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are
     * rejected with an error. - The &#x60;name&#x60; field must be unique within the target scope.
     * Uploading a font with a name that already exists returns an error. - Set &#x60;scope&#x60; to
     * &#x60;CLUSTER&#x60; to upload to the cluster-level library. Set &#x60;scope&#x60; to
     * &#x60;ORG&#x60; (default) to upload to the authenticated user&#39;s org library. -
     * &#x60;weight&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values:
     * &#x60;NORMAL&#x60;, &#x60;LIGHT&#x60;, &#x60;BOLD&#x60;. - &#x60;style&#x60; defaults to
     * &#x60;NORMAL&#x60; if omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;ITALIC&#x60;,
     * &#x60;OBLIQUE&#x60;. - &#x60;color&#x60; defaults to &#x60;#000000&#x60; (black) if omitted.
     * Provide as a 6-digit hex string (e.g. &#x60;#333333&#x60;). - The uploaded font can be
     * assigned to visualization areas using the &#x60;updateStyleCustomization&#x60; endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadStyleFontTest() throws ApiException {
        String name = null;
        File fileContent = null;
        String scope = null;
        String weight = null;
        String style = null;
        String color = null;
        StyleFontUploadData response =
                api.uploadStyleFont(name, fileContent, scope, weight, style, color);
        // TODO: test validations
    }
}
