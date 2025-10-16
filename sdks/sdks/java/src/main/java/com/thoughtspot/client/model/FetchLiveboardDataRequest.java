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

/** FetchLiveboardDataRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchLiveboardDataRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nonnull
    private String metadataIdentifier;

    public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS =
            "visualization_identifiers";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> visualizationIdentifiers;

    public static final String SERIALIZED_NAME_TRANSIENT_CONTENT = "transient_content";

    @SerializedName(SERIALIZED_NAME_TRANSIENT_CONTENT)
    @javax.annotation.Nullable
    private String transientContent;

    /**
     * JSON output in compact or full format. The FULL option is available in 9.12.5.cl or later.
     */
    @JsonAdapter(DataFormatEnum.Adapter.class)
    public enum DataFormatEnum {
        FULL("FULL"),

        COMPACT("COMPACT");

        private String value;

        DataFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataFormatEnum fromValue(String value) {
            for (DataFormatEnum b : DataFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DataFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataFormatEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DataFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DataFormatEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DataFormatEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DATA_FORMAT = "data_format";

    @SerializedName(SERIALIZED_NAME_DATA_FORMAT)
    @javax.annotation.Nullable
    private DataFormatEnum dataFormat = DataFormatEnum.COMPACT;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 10;

    public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";

    @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
    @javax.annotation.Nullable
    private Object runtimeFilter;

    public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";

    @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
    @javax.annotation.Nullable
    private Object runtimeSort;

    public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";

    @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
    @javax.annotation.Nullable
    private Object runtimeParamOverride;

    public FetchLiveboardDataRequest() {}

    public FetchLiveboardDataRequest metadataIdentifier(
            @javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * GUID or name of the Liveboard.
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

    public FetchLiveboardDataRequest visualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
        return this;
    }

    public FetchLiveboardDataRequest addVisualizationIdentifiersItem(
            String visualizationIdentifiersItem) {
        if (this.visualizationIdentifiers == null) {
            this.visualizationIdentifiers = new ArrayList<>();
        }
        this.visualizationIdentifiers.add(visualizationIdentifiersItem);
        return this;
    }

    /**
     * GUIDs or names of the visualizations on the Liveboard.
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

    public FetchLiveboardDataRequest transientContent(
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

    public FetchLiveboardDataRequest dataFormat(
            @javax.annotation.Nullable DataFormatEnum dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * JSON output in compact or full format. The FULL option is available in 9.12.5.cl or later.
     *
     * @return dataFormat
     */
    @javax.annotation.Nullable
    public DataFormatEnum getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(@javax.annotation.Nullable DataFormatEnum dataFormat) {
        this.dataFormat = dataFormat;
    }

    public FetchLiveboardDataRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public FetchLiveboardDataRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records to include in a batch.
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    public FetchLiveboardDataRequest runtimeFilter(
            @javax.annotation.Nullable Object runtimeFilter) {
        this.runtimeFilter = runtimeFilter;
        return this;
    }

    /**
     * JSON object with representing filter condition to apply filters at runtime. For example,
     * &lt;code&gt; {\&quot;col1\&quot;: \&quot;item type\&quot;, \&quot;op1\&quot;:
     * \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;Bags\&quot;} &lt;/code&gt;. You can add multiple
     * keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3,
     * val3. For more information, see [API
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

    public FetchLiveboardDataRequest runtimeSort(@javax.annotation.Nullable Object runtimeSort) {
        this.runtimeSort = runtimeSort;
        return this;
    }

    /**
     * JSON object representing columns to sort data at runtime. For example, &lt;code&gt;
     * {\&quot;sortCol1\&quot;: \&quot;sales\&quot;, \&quot;asc1\&quot;: true} &lt;/code&gt;. You
     * can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For
     * more information, see [API
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

    public FetchLiveboardDataRequest runtimeParamOverride(
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchLiveboardDataRequest fetchLiveboardDataRequest = (FetchLiveboardDataRequest) o;
        return Objects.equals(this.metadataIdentifier, fetchLiveboardDataRequest.metadataIdentifier)
                && Objects.equals(
                        this.visualizationIdentifiers,
                        fetchLiveboardDataRequest.visualizationIdentifiers)
                && Objects.equals(this.transientContent, fetchLiveboardDataRequest.transientContent)
                && Objects.equals(this.dataFormat, fetchLiveboardDataRequest.dataFormat)
                && Objects.equals(this.recordOffset, fetchLiveboardDataRequest.recordOffset)
                && Objects.equals(this.recordSize, fetchLiveboardDataRequest.recordSize)
                && Objects.equals(this.runtimeFilter, fetchLiveboardDataRequest.runtimeFilter)
                && Objects.equals(this.runtimeSort, fetchLiveboardDataRequest.runtimeSort)
                && Objects.equals(
                        this.runtimeParamOverride, fetchLiveboardDataRequest.runtimeParamOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadataIdentifier,
                visualizationIdentifiers,
                transientContent,
                dataFormat,
                recordOffset,
                recordSize,
                runtimeFilter,
                runtimeSort,
                runtimeParamOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchLiveboardDataRequest {\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    visualizationIdentifiers: ")
                .append(toIndentedString(visualizationIdentifiers))
                .append("\n");
        sb.append("    transientContent: ").append(toIndentedString(transientContent)).append("\n");
        sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
        sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
        sb.append("    runtimeParamOverride: ")
                .append(toIndentedString(runtimeParamOverride))
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
        openapiFields.add("metadata_identifier");
        openapiFields.add("visualization_identifiers");
        openapiFields.add("transient_content");
        openapiFields.add("data_format");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("runtime_filter");
        openapiFields.add("runtime_sort");
        openapiFields.add("runtime_param_override");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FetchLiveboardDataRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchLiveboardDataRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FetchLiveboardDataRequest is not"
                                        + " found in the empty JSON string",
                                FetchLiveboardDataRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FetchLiveboardDataRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FetchLiveboardDataRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FetchLiveboardDataRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("data_format") != null && !jsonObj.get("data_format").isJsonNull())
                && !jsonObj.get("data_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_format` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("data_format").toString()));
        }
        // validate the optional field `data_format`
        if (jsonObj.get("data_format") != null && !jsonObj.get("data_format").isJsonNull()) {
            DataFormatEnum.validateJsonElement(jsonObj.get("data_format"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchLiveboardDataRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FetchLiveboardDataRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchLiveboardDataRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FetchLiveboardDataRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchLiveboardDataRequest>() {
                        @Override
                        public void write(JsonWriter out, FetchLiveboardDataRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchLiveboardDataRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchLiveboardDataRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchLiveboardDataRequest
     * @throws IOException if the JSON string is invalid with respect to FetchLiveboardDataRequest
     */
    public static FetchLiveboardDataRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FetchLiveboardDataRequest.class);
    }

    /**
     * Convert an instance of FetchLiveboardDataRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
