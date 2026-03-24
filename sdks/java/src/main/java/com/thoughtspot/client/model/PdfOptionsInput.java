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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PdfOptionsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PdfOptionsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Size of PDF page. &#x60;A4&#x60; generates a paginated A4 PDF. &#x60;CONTINUOUS&#x60;
     * generates a continuous PDF that matches the Liveboard layout. Each Liveboard tab has its own
     * page of variable length. Defaults to &#x60;A4&#x60; if not specified. Version: 26.5.0.cl or
     * later
     */
    @JsonAdapter(PageSizeEnum.Adapter.class)
    public enum PageSizeEnum {
        A4("A4"),

        CONTINUOUS("CONTINUOUS");

        private String value;

        PageSizeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PageSizeEnum fromValue(String value) {
            for (PageSizeEnum b : PageSizeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PageSizeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PageSizeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PageSizeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PageSizeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PageSizeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";

    @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
    @javax.annotation.Nullable
    private PageSizeEnum pageSize;

    public static final String SERIALIZED_NAME_ZOOM_LEVEL = "zoom_level";

    @SerializedName(SERIALIZED_NAME_ZOOM_LEVEL)
    @javax.annotation.Nullable
    private Integer zoomLevel;

    public static final String SERIALIZED_NAME_INCLUDE_COVER_PAGE = "include_cover_page";

    @SerializedName(SERIALIZED_NAME_INCLUDE_COVER_PAGE)
    @javax.annotation.Nullable
    private Boolean includeCoverPage = true;

    public static final String SERIALIZED_NAME_INCLUDE_CUSTOM_LOGO = "include_custom_logo";

    @SerializedName(SERIALIZED_NAME_INCLUDE_CUSTOM_LOGO)
    @javax.annotation.Nullable
    private Boolean includeCustomLogo = true;

    public static final String SERIALIZED_NAME_INCLUDE_FILTER_PAGE = "include_filter_page";

    @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER_PAGE)
    @javax.annotation.Nullable
    private Boolean includeFilterPage = true;

    public static final String SERIALIZED_NAME_INCLUDE_PAGE_NUMBER = "include_page_number";

    @SerializedName(SERIALIZED_NAME_INCLUDE_PAGE_NUMBER)
    @javax.annotation.Nullable
    private Boolean includePageNumber = true;

    /** Page orientation of the PDF. */
    @JsonAdapter(PageOrientationEnum.Adapter.class)
    public enum PageOrientationEnum {
        PORTRAIT("PORTRAIT"),

        LANDSCAPE("LANDSCAPE");

        private String value;

        PageOrientationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PageOrientationEnum fromValue(String value) {
            for (PageOrientationEnum b : PageOrientationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PageOrientationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PageOrientationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PageOrientationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PageOrientationEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PageOrientationEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PAGE_ORIENTATION = "page_orientation";

    @SerializedName(SERIALIZED_NAME_PAGE_ORIENTATION)
    @javax.annotation.Nullable
    private PageOrientationEnum pageOrientation = PageOrientationEnum.PORTRAIT;

    public static final String SERIALIZED_NAME_TRUNCATE_TABLE = "truncate_table";

    @SerializedName(SERIALIZED_NAME_TRUNCATE_TABLE)
    @javax.annotation.Nullable
    private Boolean truncateTable = false;

    public static final String SERIALIZED_NAME_PAGE_FOOTER_TEXT = "page_footer_text";

    @SerializedName(SERIALIZED_NAME_PAGE_FOOTER_TEXT)
    @javax.annotation.Nullable
    private String pageFooterText;

    public PdfOptionsInput() {}

    public PdfOptionsInput pageSize(@javax.annotation.Nullable PageSizeEnum pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Size of PDF page. &#x60;A4&#x60; generates a paginated A4 PDF. &#x60;CONTINUOUS&#x60;
     * generates a continuous PDF that matches the Liveboard layout. Each Liveboard tab has its own
     * page of variable length. Defaults to &#x60;A4&#x60; if not specified. Version: 26.5.0.cl or
     * later
     *
     * @return pageSize
     */
    @javax.annotation.Nullable
    public PageSizeEnum getPageSize() {
        return pageSize;
    }

    public void setPageSize(@javax.annotation.Nullable PageSizeEnum pageSize) {
        this.pageSize = pageSize;
    }

    public PdfOptionsInput zoomLevel(@javax.annotation.Nullable Integer zoomLevel) {
        this.zoomLevel = zoomLevel;
        return this;
    }

    /**
     * Zoom level percentage for the PDF. Only applicable when &#x60;page_size&#x60; is
     * &#x60;CONTINUOUS&#x60;. Acceptable values are integers in the range [45, 175]. Defaults to
     * 100 if not specified. Version: 26.5.0.cl or later
     *
     * @return zoomLevel
     */
    @javax.annotation.Nullable
    public Integer getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(@javax.annotation.Nullable Integer zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public PdfOptionsInput includeCoverPage(@javax.annotation.Nullable Boolean includeCoverPage) {
        this.includeCoverPage = includeCoverPage;
        return this;
    }

    /**
     * Indicates whether to include the cover page with the Liveboard title.
     *
     * @return includeCoverPage
     */
    @javax.annotation.Nullable
    public Boolean getIncludeCoverPage() {
        return includeCoverPage;
    }

    public void setIncludeCoverPage(@javax.annotation.Nullable Boolean includeCoverPage) {
        this.includeCoverPage = includeCoverPage;
    }

    public PdfOptionsInput includeCustomLogo(@javax.annotation.Nullable Boolean includeCustomLogo) {
        this.includeCustomLogo = includeCustomLogo;
        return this;
    }

    /**
     * Indicates whether to include customized wide logo in the footer if available.
     *
     * @return includeCustomLogo
     */
    @javax.annotation.Nullable
    public Boolean getIncludeCustomLogo() {
        return includeCustomLogo;
    }

    public void setIncludeCustomLogo(@javax.annotation.Nullable Boolean includeCustomLogo) {
        this.includeCustomLogo = includeCustomLogo;
    }

    public PdfOptionsInput includeFilterPage(@javax.annotation.Nullable Boolean includeFilterPage) {
        this.includeFilterPage = includeFilterPage;
        return this;
    }

    /**
     * Indicates whether to include a page with all applied filters. For &#x60;CONTINUOUS&#x60;
     * page_size, this parameter indicates whether to include the filter header.
     *
     * @return includeFilterPage
     */
    @javax.annotation.Nullable
    public Boolean getIncludeFilterPage() {
        return includeFilterPage;
    }

    public void setIncludeFilterPage(@javax.annotation.Nullable Boolean includeFilterPage) {
        this.includeFilterPage = includeFilterPage;
    }

    public PdfOptionsInput includePageNumber(@javax.annotation.Nullable Boolean includePageNumber) {
        this.includePageNumber = includePageNumber;
        return this;
    }

    /**
     * Indicates whether to include page number in the footer of each page.
     *
     * @return includePageNumber
     */
    @javax.annotation.Nullable
    public Boolean getIncludePageNumber() {
        return includePageNumber;
    }

    public void setIncludePageNumber(@javax.annotation.Nullable Boolean includePageNumber) {
        this.includePageNumber = includePageNumber;
    }

    public PdfOptionsInput pageOrientation(
            @javax.annotation.Nullable PageOrientationEnum pageOrientation) {
        this.pageOrientation = pageOrientation;
        return this;
    }

    /**
     * Page orientation of the PDF.
     *
     * @return pageOrientation
     */
    @javax.annotation.Nullable
    public PageOrientationEnum getPageOrientation() {
        return pageOrientation;
    }

    public void setPageOrientation(@javax.annotation.Nullable PageOrientationEnum pageOrientation) {
        this.pageOrientation = pageOrientation;
    }

    public PdfOptionsInput truncateTable(@javax.annotation.Nullable Boolean truncateTable) {
        this.truncateTable = truncateTable;
        return this;
    }

    /**
     * Indicates whether to include only the first page of the tables.
     *
     * @return truncateTable
     */
    @javax.annotation.Nullable
    public Boolean getTruncateTable() {
        return truncateTable;
    }

    public void setTruncateTable(@javax.annotation.Nullable Boolean truncateTable) {
        this.truncateTable = truncateTable;
    }

    public PdfOptionsInput pageFooterText(@javax.annotation.Nullable String pageFooterText) {
        this.pageFooterText = pageFooterText;
        return this;
    }

    /**
     * Text to include in the footer of each page.
     *
     * @return pageFooterText
     */
    @javax.annotation.Nullable
    public String getPageFooterText() {
        return pageFooterText;
    }

    public void setPageFooterText(@javax.annotation.Nullable String pageFooterText) {
        this.pageFooterText = pageFooterText;
    }

    /**
     * A container for additional, undeclared properties. This is a holder for any undeclared
     * properties as specified with the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value. If the property
     * does not already exist, create it otherwise replace it.
     *
     * @param key name of the property
     * @param value value of the property
     * @return the PdfOptionsInput instance itself
     */
    public PdfOptionsInput putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     *
     * @return a map of objects
     */
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     *
     * @param key name of the property
     * @return an object
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PdfOptionsInput pdfOptionsInput = (PdfOptionsInput) o;
        return Objects.equals(this.pageSize, pdfOptionsInput.pageSize)
                && Objects.equals(this.zoomLevel, pdfOptionsInput.zoomLevel)
                && Objects.equals(this.includeCoverPage, pdfOptionsInput.includeCoverPage)
                && Objects.equals(this.includeCustomLogo, pdfOptionsInput.includeCustomLogo)
                && Objects.equals(this.includeFilterPage, pdfOptionsInput.includeFilterPage)
                && Objects.equals(this.includePageNumber, pdfOptionsInput.includePageNumber)
                && Objects.equals(this.pageOrientation, pdfOptionsInput.pageOrientation)
                && Objects.equals(this.truncateTable, pdfOptionsInput.truncateTable)
                && Objects.equals(this.pageFooterText, pdfOptionsInput.pageFooterText)
                && Objects.equals(this.additionalProperties, pdfOptionsInput.additionalProperties);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pageSize,
                zoomLevel,
                includeCoverPage,
                includeCustomLogo,
                includeFilterPage,
                includePageNumber,
                pageOrientation,
                truncateTable,
                pageFooterText,
                additionalProperties);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PdfOptionsInput {\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    zoomLevel: ").append(toIndentedString(zoomLevel)).append("\n");
        sb.append("    includeCoverPage: ").append(toIndentedString(includeCoverPage)).append("\n");
        sb.append("    includeCustomLogo: ")
                .append(toIndentedString(includeCustomLogo))
                .append("\n");
        sb.append("    includeFilterPage: ")
                .append(toIndentedString(includeFilterPage))
                .append("\n");
        sb.append("    includePageNumber: ")
                .append(toIndentedString(includePageNumber))
                .append("\n");
        sb.append("    pageOrientation: ").append(toIndentedString(pageOrientation)).append("\n");
        sb.append("    truncateTable: ").append(toIndentedString(truncateTable)).append("\n");
        sb.append("    pageFooterText: ").append(toIndentedString(pageFooterText)).append("\n");
        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
                .append("\n");
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
        openapiFields.add("page_size");
        openapiFields.add("zoom_level");
        openapiFields.add("include_cover_page");
        openapiFields.add("include_custom_logo");
        openapiFields.add("include_filter_page");
        openapiFields.add("include_page_number");
        openapiFields.add("page_orientation");
        openapiFields.add("truncate_table");
        openapiFields.add("page_footer_text");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PdfOptionsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PdfOptionsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PdfOptionsInput is not found in the"
                                        + " empty JSON string",
                                PdfOptionsInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonNull())
                && !jsonObj.get("page_size").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `page_size` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("page_size").toString()));
        }
        // validate the optional field `page_size`
        if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonNull()) {
            PageSizeEnum.validateJsonElement(jsonObj.get("page_size"));
        }
        if ((jsonObj.get("page_orientation") != null
                        && !jsonObj.get("page_orientation").isJsonNull())
                && !jsonObj.get("page_orientation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `page_orientation` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("page_orientation").toString()));
        }
        // validate the optional field `page_orientation`
        if (jsonObj.get("page_orientation") != null
                && !jsonObj.get("page_orientation").isJsonNull()) {
            PageOrientationEnum.validateJsonElement(jsonObj.get("page_orientation"));
        }
        if ((jsonObj.get("page_footer_text") != null
                        && !jsonObj.get("page_footer_text").isJsonNull())
                && !jsonObj.get("page_footer_text").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `page_footer_text` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("page_footer_text").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PdfOptionsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PdfOptionsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PdfOptionsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PdfOptionsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PdfOptionsInput>() {
                        @Override
                        public void write(JsonWriter out, PdfOptionsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            obj.remove("additionalProperties");
                            // serialize additional properties
                            if (value.getAdditionalProperties() != null) {
                                for (Map.Entry<String, Object> entry :
                                        value.getAdditionalProperties().entrySet()) {
                                    if (entry.getValue() instanceof String)
                                        obj.addProperty(entry.getKey(), (String) entry.getValue());
                                    else if (entry.getValue() instanceof Number)
                                        obj.addProperty(entry.getKey(), (Number) entry.getValue());
                                    else if (entry.getValue() instanceof Boolean)
                                        obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                                    else if (entry.getValue() instanceof Character)
                                        obj.addProperty(
                                                entry.getKey(), (Character) entry.getValue());
                                    else {
                                        JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                                        if (jsonElement.isJsonArray()) {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                                        } else {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                                        }
                                    }
                                }
                            }
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PdfOptionsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            PdfOptionsInput instance = thisAdapter.fromJsonTree(jsonObj);
                            for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
                                if (!openapiFields.contains(entry.getKey())) {
                                    if (entry.getValue().isJsonPrimitive()) { // primitive type
                                        if (entry.getValue().getAsJsonPrimitive().isString())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsString());
                                        else if (entry.getValue().getAsJsonPrimitive().isNumber())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsNumber());
                                        else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(),
                                                    entry.getValue().getAsBoolean());
                                        else
                                            throw new IllegalArgumentException(
                                                    String.format(
                                                            "The field `%s` has unknown primitive"
                                                                    + " type. Value: %s",
                                                            entry.getKey(),
                                                            entry.getValue().toString()));
                                    } else if (entry.getValue().isJsonArray()) {
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), List.class));
                                    } else { // JSON object
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), HashMap.class));
                                    }
                                }
                            }
                            return instance;
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PdfOptionsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PdfOptionsInput
     * @throws IOException if the JSON string is invalid with respect to PdfOptionsInput
     */
    public static PdfOptionsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PdfOptionsInput.class);
    }

    /**
     * Convert an instance of PdfOptionsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
