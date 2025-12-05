/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ExportLiveboardReportRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExportLiveboardReportRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nonnull
    private String metadataIdentifier;

    public static final String SERIALIZED_NAME_TAB_IDENTIFIERS = "tab_identifiers";

    @SerializedName(SERIALIZED_NAME_TAB_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> tabIdentifiers;

    public static final String SERIALIZED_NAME_PERSONALISED_VIEW_IDENTIFIER =
            "personalised_view_identifier";

    @SerializedName(SERIALIZED_NAME_PERSONALISED_VIEW_IDENTIFIER)
    @javax.annotation.Nullable
    private String personalisedViewIdentifier;

    public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS =
            "visualization_identifiers";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> visualizationIdentifiers;

    public static final String SERIALIZED_NAME_TRANSIENT_CONTENT = "transient_content";

    @SerializedName(SERIALIZED_NAME_TRANSIENT_CONTENT)
    @javax.annotation.Nullable
    private String transientContent;

    /** Export file format. */
    @JsonAdapter(FileFormatEnum.Adapter.class)
    public enum FileFormatEnum {
        PDF("PDF"),

        PNG("PNG"),

        CSV("CSV");

        private String value;

        FileFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FileFormatEnum fromValue(String value) {
            for (FileFormatEnum b : FileFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<FileFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FileFormatEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FileFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FileFormatEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            FileFormatEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";

    @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
    @javax.annotation.Nullable
    private FileFormatEnum fileFormat = FileFormatEnum.PDF;

    public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";

    @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
    @javax.annotation.Nullable
    private Object runtimeFilter;

    public static final String SERIALIZED_NAME_OVERRIDE_FILTERS = "override_filters";

    @SerializedName(SERIALIZED_NAME_OVERRIDE_FILTERS)
    @javax.annotation.Nullable
    private Object overrideFilters;

    public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";

    @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
    @javax.annotation.Nullable
    private Object runtimeSort;

    public static final String SERIALIZED_NAME_PDF_OPTIONS = "pdf_options";

    @SerializedName(SERIALIZED_NAME_PDF_OPTIONS)
    @javax.annotation.Nullable
    private PdfOptionsInput pdfOptions;

    public static final String SERIALIZED_NAME_PNG_OPTIONS = "png_options";

    @SerializedName(SERIALIZED_NAME_PNG_OPTIONS)
    @javax.annotation.Nullable
    private PngOptionsInput pngOptions;

    public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";

    @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
    @javax.annotation.Nullable
    private Object runtimeParamOverride;

    public static final String SERIALIZED_NAME_REGIONAL_SETTINGS = "regional_settings";

    @SerializedName(SERIALIZED_NAME_REGIONAL_SETTINGS)
    @javax.annotation.Nullable
    private RegionalSettingsInput regionalSettings;

    public ExportLiveboardReportRequest() {}

    public ExportLiveboardReportRequest metadataIdentifier(
            @javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * GUID or name of the Liveboard object.
     *
     * @return metadataIdentifier
     */
    @javax.annotation.Nonnull
    public String getMetadataIdentifier() {
        return metadataIdentifier;
    }

    public void setMetadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
    }

    public ExportLiveboardReportRequest tabIdentifiers(
            @javax.annotation.Nullable List<String> tabIdentifiers) {
        this.tabIdentifiers = tabIdentifiers;
        return this;
    }

    public ExportLiveboardReportRequest addTabIdentifiersItem(String tabIdentifiersItem) {
        if (this.tabIdentifiers == null) {
            this.tabIdentifiers = new ArrayList<>();
        }
        this.tabIdentifiers.add(tabIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of the tab of the Liveboard object. Version: 10.9.0.cl or later
     *
     * @return tabIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getTabIdentifiers() {
        return tabIdentifiers;
    }

    public void setTabIdentifiers(@javax.annotation.Nullable List<String> tabIdentifiers) {
        this.tabIdentifiers = tabIdentifiers;
    }

    public ExportLiveboardReportRequest personalisedViewIdentifier(
            @javax.annotation.Nullable String personalisedViewIdentifier) {
        this.personalisedViewIdentifier = personalisedViewIdentifier;
        return this;
    }

    /**
     * GUID or name of the personalised view of the Liveboard object. Version: 10.9.0.cl or later
     *
     * @return personalisedViewIdentifier
     */
    @javax.annotation.Nullable
    public String getPersonalisedViewIdentifier() {
        return personalisedViewIdentifier;
    }

    public void setPersonalisedViewIdentifier(
            @javax.annotation.Nullable String personalisedViewIdentifier) {
        this.personalisedViewIdentifier = personalisedViewIdentifier;
    }

    public ExportLiveboardReportRequest visualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
        return this;
    }

    public ExportLiveboardReportRequest addVisualizationIdentifiersItem(
            String visualizationIdentifiersItem) {
        if (this.visualizationIdentifiers == null) {
            this.visualizationIdentifiers = new ArrayList<>();
        }
        this.visualizationIdentifiers.add(visualizationIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of visualizations on the Liveboard. If this parameter is not defined, the API
     * returns a report with all visualizations saved on a Liveboard.
     *
     * @return visualizationIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getVisualizationIdentifiers() {
        return visualizationIdentifiers;
    }

    public void setVisualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
    }

    public ExportLiveboardReportRequest transientContent(
            @javax.annotation.Nullable String transientContent) {
        this.transientContent = transientContent;
        return this;
    }

    /**
     * Transient content of the Liveboard.
     *
     * @return transientContent
     */
    @javax.annotation.Nullable
    public String getTransientContent() {
        return transientContent;
    }

    public void setTransientContent(@javax.annotation.Nullable String transientContent) {
        this.transientContent = transientContent;
    }

    public ExportLiveboardReportRequest fileFormat(
            @javax.annotation.Nullable FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Export file format.
     *
     * @return fileFormat
     */
    @javax.annotation.Nullable
    public FileFormatEnum getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(@javax.annotation.Nullable FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
    }

    public ExportLiveboardReportRequest runtimeFilter(
            @javax.annotation.Nullable Object runtimeFilter) {
        this.runtimeFilter = runtimeFilter;
        return this;
    }

    /**
     * JSON object with representing filter condition to apply filters at runtime. For example,
     * {\&quot;col1\&quot;: \&quot;region\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;,
     * \&quot;val1\&quot;: \&quot;northeast\&quot; }. You can add multiple keys by incrementing the
     * number at the end, for example, col2, op2, val2. For more information, see [API
     * Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
     *
     * @return runtimeFilter
     */
    @javax.annotation.Nullable
    public Object getRuntimeFilter() {
        return runtimeFilter;
    }

    public void setRuntimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
        this.runtimeFilter = runtimeFilter;
    }

    public ExportLiveboardReportRequest overrideFilters(
            @javax.annotation.Nullable Object overrideFilters) {
        this.overrideFilters = overrideFilters;
        return this;
    }

    /**
     * Applied to the liveboard and overrides any filters already applied on the same columns in
     * liveboard. Following example illustrate different kinds of filters: {
     * \&quot;override_filters\&quot;: [ { \&quot;column_name\&quot;: \&quot;Color\&quot;,
     * \&quot;generic_filter\&quot;: { \&quot;op\&quot;: \&quot;IN\&quot;, \&quot;values\&quot;: [
     * \&quot;almond\&quot;, \&quot;turquoise\&quot; ] }, \&quot;negate\&quot;: false }, {
     * \&quot;column_name\&quot;: \&quot;Commit Date\&quot;, \&quot;date_filter\&quot;: {
     * \&quot;datePeriod\&quot;: \&quot;HOUR\&quot;, \&quot;number\&quot;: 3, \&quot;type\&quot;:
     * \&quot;LAST_N_PERIOD\&quot;, \&quot;op\&quot;: \&quot;EQ\&quot; } }, {
     * \&quot;column_name\&quot;: \&quot;Sales\&quot;, \&quot;generic_filter\&quot;: {
     * \&quot;op\&quot;: \&quot;BW_INC\&quot;, \&quot;values\&quot;: [ \&quot;100000\&quot;,
     * \&quot;70000\&quot; ] }, \&quot;negate\&quot;: true } ] }
     *
     * @return overrideFilters
     */
    @javax.annotation.Nullable
    public Object getOverrideFilters() {
        return overrideFilters;
    }

    public void setOverrideFilters(@javax.annotation.Nullable Object overrideFilters) {
        this.overrideFilters = overrideFilters;
    }

    public ExportLiveboardReportRequest runtimeSort(@javax.annotation.Nullable Object runtimeSort) {
        this.runtimeSort = runtimeSort;
        return this;
    }

    /**
     * JSON string representing runtime sort. For example, {\&quot;sortCol1\&quot;:
     * \&quot;region\&quot;, \&quot;asc1\&quot; : true}. For more information, see [API
     * Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
     *
     * @return runtimeSort
     */
    @javax.annotation.Nullable
    public Object getRuntimeSort() {
        return runtimeSort;
    }

    public void setRuntimeSort(@javax.annotation.Nullable Object runtimeSort) {
        this.runtimeSort = runtimeSort;
    }

    public ExportLiveboardReportRequest pdfOptions(
            @javax.annotation.Nullable PdfOptionsInput pdfOptions) {
        this.pdfOptions = pdfOptions;
        return this;
    }

    /**
     * Options for PDF export.
     *
     * @return pdfOptions
     */
    @javax.annotation.Nullable
    public PdfOptionsInput getPdfOptions() {
        return pdfOptions;
    }

    public void setPdfOptions(@javax.annotation.Nullable PdfOptionsInput pdfOptions) {
        this.pdfOptions = pdfOptions;
    }

    public ExportLiveboardReportRequest pngOptions(
            @javax.annotation.Nullable PngOptionsInput pngOptions) {
        this.pngOptions = pngOptions;
        return this;
    }

    /**
     * Options for PNG export.
     *
     * @return pngOptions
     */
    @javax.annotation.Nullable
    public PngOptionsInput getPngOptions() {
        return pngOptions;
    }

    public void setPngOptions(@javax.annotation.Nullable PngOptionsInput pngOptions) {
        this.pngOptions = pngOptions;
    }

    public ExportLiveboardReportRequest runtimeParamOverride(
            @javax.annotation.Nullable Object runtimeParamOverride) {
        this.runtimeParamOverride = runtimeParamOverride;
        return this;
    }

    /**
     * JSON object for setting values of parameters at runtime. For example, &lt;code&gt;
     * {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;:
     * 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for
     * example, param2, paramVal2. For more information, see [API
     * Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
     *
     * @return runtimeParamOverride
     */
    @javax.annotation.Nullable
    public Object getRuntimeParamOverride() {
        return runtimeParamOverride;
    }

    public void setRuntimeParamOverride(@javax.annotation.Nullable Object runtimeParamOverride) {
        this.runtimeParamOverride = runtimeParamOverride;
    }

    public ExportLiveboardReportRequest regionalSettings(
            @javax.annotation.Nullable RegionalSettingsInput regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    /**
     * Options for specific region specific overrides to support date/number/string/currency
     * formatting.
     *
     * @return regionalSettings
     */
    @javax.annotation.Nullable
    public RegionalSettingsInput getRegionalSettings() {
        return regionalSettings;
    }

    public void setRegionalSettings(
            @javax.annotation.Nullable RegionalSettingsInput regionalSettings) {
        this.regionalSettings = regionalSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportLiveboardReportRequest exportLiveboardReportRequest =
                (ExportLiveboardReportRequest) o;
        return Objects.equals(
                        this.metadataIdentifier, exportLiveboardReportRequest.metadataIdentifier)
                && Objects.equals(this.tabIdentifiers, exportLiveboardReportRequest.tabIdentifiers)
                && Objects.equals(
                        this.personalisedViewIdentifier,
                        exportLiveboardReportRequest.personalisedViewIdentifier)
                && Objects.equals(
                        this.visualizationIdentifiers,
                        exportLiveboardReportRequest.visualizationIdentifiers)
                && Objects.equals(
                        this.transientContent, exportLiveboardReportRequest.transientContent)
                && Objects.equals(this.fileFormat, exportLiveboardReportRequest.fileFormat)
                && Objects.equals(this.runtimeFilter, exportLiveboardReportRequest.runtimeFilter)
                && Objects.equals(
                        this.overrideFilters, exportLiveboardReportRequest.overrideFilters)
                && Objects.equals(this.runtimeSort, exportLiveboardReportRequest.runtimeSort)
                && Objects.equals(this.pdfOptions, exportLiveboardReportRequest.pdfOptions)
                && Objects.equals(this.pngOptions, exportLiveboardReportRequest.pngOptions)
                && Objects.equals(
                        this.runtimeParamOverride,
                        exportLiveboardReportRequest.runtimeParamOverride)
                && Objects.equals(
                        this.regionalSettings, exportLiveboardReportRequest.regionalSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadataIdentifier,
                tabIdentifiers,
                personalisedViewIdentifier,
                visualizationIdentifiers,
                transientContent,
                fileFormat,
                runtimeFilter,
                overrideFilters,
                runtimeSort,
                pdfOptions,
                pngOptions,
                runtimeParamOverride,
                regionalSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportLiveboardReportRequest {\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    tabIdentifiers: ").append(toIndentedString(tabIdentifiers)).append("\n");
        sb.append("    personalisedViewIdentifier: ")
                .append(toIndentedString(personalisedViewIdentifier))
                .append("\n");
        sb.append("    visualizationIdentifiers: ")
                .append(toIndentedString(visualizationIdentifiers))
                .append("\n");
        sb.append("    transientContent: ").append(toIndentedString(transientContent)).append("\n");
        sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
        sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
        sb.append("    overrideFilters: ").append(toIndentedString(overrideFilters)).append("\n");
        sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
        sb.append("    pdfOptions: ").append(toIndentedString(pdfOptions)).append("\n");
        sb.append("    pngOptions: ").append(toIndentedString(pngOptions)).append("\n");
        sb.append("    runtimeParamOverride: ")
                .append(toIndentedString(runtimeParamOverride))
                .append("\n");
        sb.append("    regionalSettings: ").append(toIndentedString(regionalSettings)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("metadata_identifier");
        openapiFields.add("tab_identifiers");
        openapiFields.add("personalised_view_identifier");
        openapiFields.add("visualization_identifiers");
        openapiFields.add("transient_content");
        openapiFields.add("file_format");
        openapiFields.add("runtime_filter");
        openapiFields.add("override_filters");
        openapiFields.add("runtime_sort");
        openapiFields.add("pdf_options");
        openapiFields.add("png_options");
        openapiFields.add("runtime_param_override");
        openapiFields.add("regional_settings");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ExportLiveboardReportRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExportLiveboardReportRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ExportLiveboardReportRequest is not"
                                        + " found in the empty JSON string",
                                ExportLiveboardReportRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ExportLiveboardReportRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ExportLiveboardReportRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ExportLiveboardReportRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("metadata_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("tab_identifiers") != null
                && !jsonObj.get("tab_identifiers").isJsonNull()
                && !jsonObj.get("tab_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tab_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("tab_identifiers").toString()));
        }
        if ((jsonObj.get("personalised_view_identifier") != null
                        && !jsonObj.get("personalised_view_identifier").isJsonNull())
                && !jsonObj.get("personalised_view_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `personalised_view_identifier` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("personalised_view_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("visualization_identifiers") != null
                && !jsonObj.get("visualization_identifiers").isJsonNull()
                && !jsonObj.get("visualization_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_identifiers").toString()));
        }
        if ((jsonObj.get("transient_content") != null
                        && !jsonObj.get("transient_content").isJsonNull())
                && !jsonObj.get("transient_content").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `transient_content` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("transient_content").toString()));
        }
        if ((jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull())
                && !jsonObj.get("file_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_format` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_format").toString()));
        }
        // validate the optional field `file_format`
        if (jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull()) {
            FileFormatEnum.validateJsonElement(jsonObj.get("file_format"));
        }
        // validate the optional field `pdf_options`
        if (jsonObj.get("pdf_options") != null && !jsonObj.get("pdf_options").isJsonNull()) {
            PdfOptionsInput.validateJsonElement(jsonObj.get("pdf_options"));
        }
        // validate the optional field `png_options`
        if (jsonObj.get("png_options") != null && !jsonObj.get("png_options").isJsonNull()) {
            PngOptionsInput.validateJsonElement(jsonObj.get("png_options"));
        }
        // validate the optional field `regional_settings`
        if (jsonObj.get("regional_settings") != null
                && !jsonObj.get("regional_settings").isJsonNull()) {
            RegionalSettingsInput.validateJsonElement(jsonObj.get("regional_settings"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExportLiveboardReportRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExportLiveboardReportRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExportLiveboardReportRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ExportLiveboardReportRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExportLiveboardReportRequest>() {
                        @Override
                        public void write(JsonWriter out, ExportLiveboardReportRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ExportLiveboardReportRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ExportLiveboardReportRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ExportLiveboardReportRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ExportLiveboardReportRequest
     */
    public static ExportLiveboardReportRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ExportLiveboardReportRequest.class);
    }

    /**
     * Convert an instance of ExportLiveboardReportRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
