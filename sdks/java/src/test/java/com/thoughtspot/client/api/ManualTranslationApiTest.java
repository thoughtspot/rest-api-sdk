/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.DeleteManualTranslationsRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.ExportManualTranslationTemplateRequest;
import com.thoughtspot.client.model.ExportManualTranslationsRequest;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for ManualTranslationApi
 */
@Disabled
public class ManualTranslationApiTest {

    private final ManualTranslationApi api = new ManualTranslationApi();

    /**
     *  Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete translations uploaded in the All-Org context.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteManualTranslationsTest() throws ApiException {
        DeleteManualTranslationsRequest deleteManualTranslationsRequest = null;
        api.deleteManualTranslations(deleteManualTranslationsRequest);
        // TODO: test validations
    }

    /**
     *  Export a CSV template of the translatable strings of Liveboards.    Version: 27.1.0.cl or later   Exports a CSV template with the translatable strings of one or more Liveboards. Translate the strings in the template and upload it with the API that imports manual translations.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file has the same columns as the import file: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Each row lists one string in &#x60;content&#x60; and leaves &#x60;locale&#x60; and &#x60;translated-content&#x60; empty. Fill them in, then upload the file with &#x60;POST /api/rest/2.0/localizations/manual-translation/import&#x60;. - The template includes the Liveboard title and description, tab names, the names of the Liveboard&#39;s personalized views, the titles and descriptions of visualizations and groups, and the text of note tiles. - Note tile text is listed the way it is matched when the Liveboard is displayed: each heading, paragraph, list item, table cell, and line is a separate row, and so is each part of a line that has its own formatting or link. Manual translations are applied to a note tile only when every one of its rows is translated. - A string that appears more than once is listed once. - Strings that the import does not accept are left out: text longer than 2000 characters, text that starts with &#x60;&#x3D;&#x60;, &#x60;+&#x60;, &#x60;-&#x60;, &#x60;@&#x60;, a tab, or a carriage return, and text that contains HTML tags, script content, or control characters. The number of strings left out is returned in the &#x60;X-ThoughtSpot-Excluded-Content-Count&#x60; response header. - Specify 1 to 50 Liveboards by GUID or name. Names are resolved in the current Org; if more than one Liveboard has the given name, use its GUID. If a Liveboard is not found or you cannot access it, the request fails and no file is returned.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportManualTranslationTemplateTest() throws ApiException {
        ExportManualTranslationTemplateRequest exportManualTranslationTemplateRequest = null;
        api.exportManualTranslationTemplate(exportManualTranslationTemplateRequest);
        // TODO: test validations
    }

    /**
     *  Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to export translations from the All-Org context. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error. - Returns a &#x60;400&#x60; error if no translations exist for the targeted org or cluster scope.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportManualTranslationsTest() throws ApiException {
        ExportManualTranslationsRequest exportManualTranslationsRequest = null;
        File response = api.exportManualTranslations(exportManualTranslationsRequest);
        // TODO: test validations
    }

    /**
     *  Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - &#x60;locale&#x60; parameter must be a hyphenated locale code, in any case (for example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;). - Returns a JSON object with a &#x60;translations&#x60; map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty &#x60;translations&#x60; map (not an error) if no entries exist at either level.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getManualTranslationBundleTest() throws ApiException {
        String locale = null;
        Object response = api.getManualTranslationBundle(locale);
        // TODO: test validations
    }

    /**
     *  Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only &#x60;.csv&#x60; files are accepted. - The import performs an **upsert**: existing entries matched by &#x60;(org_id, locale, content)&#x60; are updated; new entries are inserted. Entries not in the upload are left untouched. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importManualTranslationsTest() throws ApiException {
        File translationsFile = null;
        String scope = null;
        api.importManualTranslations(translationsFile, scope);
        // TODO: test validations
    }

}
