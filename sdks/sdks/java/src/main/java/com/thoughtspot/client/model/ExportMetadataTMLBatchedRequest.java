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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ExportMetadataTMLBatchedRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExportMetadataTMLBatchedRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of metadata object to export, can be one of USER | ROLE | USER_GROUP */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        USER("USER"),

        USER_GROUP("USER_GROUP"),

        ROLE("ROLE");

        private String value;

        MetadataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MetadataTypeEnum fromValue(String value) {
            for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MetadataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MetadataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nonnull
    private MetadataTypeEnum metadataType;

    public static final String SERIALIZED_NAME_BATCH_OFFSET = "batch_offset";

    @SerializedName(SERIALIZED_NAME_BATCH_OFFSET)
    @javax.annotation.Nullable
    private Integer batchOffset = 0;

    public static final String SERIALIZED_NAME_BATCH_SIZE = "batch_size";

    @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
    @javax.annotation.Nullable
    private Integer batchSize = 20;

    /** TML EDOC content format. */
    @JsonAdapter(EdocFormatEnum.Adapter.class)
    public enum EdocFormatEnum {
        JSON("JSON"),

        YAML("YAML");

        private String value;

        EdocFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EdocFormatEnum fromValue(String value) {
            for (EdocFormatEnum b : EdocFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<EdocFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EdocFormatEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EdocFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EdocFormatEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            EdocFormatEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_EDOC_FORMAT = "edoc_format";

    @SerializedName(SERIALIZED_NAME_EDOC_FORMAT)
    @javax.annotation.Nullable
    private EdocFormatEnum edocFormat = EdocFormatEnum.JSON;

    public static final String SERIALIZED_NAME_EXPORT_DEPENDENT = "export_dependent";

    @SerializedName(SERIALIZED_NAME_EXPORT_DEPENDENT)
    @javax.annotation.Nullable
    private Boolean exportDependent = false;

    public static final String SERIALIZED_NAME_ALL_ORGS_OVERRIDE = "all_orgs_override";

    @SerializedName(SERIALIZED_NAME_ALL_ORGS_OVERRIDE)
    @javax.annotation.Nullable
    private Boolean allOrgsOverride = false;

    public ExportMetadataTMLBatchedRequest() {}

    public ExportMetadataTMLBatchedRequest metadataType(
            @javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of metadata object to export, can be one of USER | ROLE | USER_GROUP
     *
     * @return metadataType
     */
    @javax.annotation.Nonnull
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public ExportMetadataTMLBatchedRequest batchOffset(
            @javax.annotation.Nullable Integer batchOffset) {
        this.batchOffset = batchOffset;
        return this;
    }

    /**
     * Indicates the position within the complete set from where the API should begin returning
     * objects.
     *
     * @return batchOffset
     */
    @javax.annotation.Nullable
    public Integer getBatchOffset() {
        return batchOffset;
    }

    public void setBatchOffset(@javax.annotation.Nullable Integer batchOffset) {
        this.batchOffset = batchOffset;
    }

    public ExportMetadataTMLBatchedRequest batchSize(@javax.annotation.Nullable Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Determines the number of objects or items to be retrieved in a single request.
     *
     * @return batchSize
     */
    @javax.annotation.Nullable
    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(@javax.annotation.Nullable Integer batchSize) {
        this.batchSize = batchSize;
    }

    public ExportMetadataTMLBatchedRequest edocFormat(
            @javax.annotation.Nullable EdocFormatEnum edocFormat) {
        this.edocFormat = edocFormat;
        return this;
    }

    /**
     * TML EDOC content format.
     *
     * @return edocFormat
     */
    @javax.annotation.Nullable
    public EdocFormatEnum getEdocFormat() {
        return edocFormat;
    }

    public void setEdocFormat(@javax.annotation.Nullable EdocFormatEnum edocFormat) {
        this.edocFormat = edocFormat;
    }

    public ExportMetadataTMLBatchedRequest exportDependent(
            @javax.annotation.Nullable Boolean exportDependent) {
        this.exportDependent = exportDependent;
        return this;
    }

    /**
     * Indicates whether to export dependent metadata objects of specified metadata objects.
     *
     * @return exportDependent
     */
    @javax.annotation.Nullable
    public Boolean getExportDependent() {
        return exportDependent;
    }

    public void setExportDependent(@javax.annotation.Nullable Boolean exportDependent) {
        this.exportDependent = exportDependent;
    }

    public ExportMetadataTMLBatchedRequest allOrgsOverride(
            @javax.annotation.Nullable Boolean allOrgsOverride) {
        this.allOrgsOverride = allOrgsOverride;
        return this;
    }

    /**
     * Indicates whether to export is happening from all orgs context.
     *
     * @return allOrgsOverride
     */
    @javax.annotation.Nullable
    public Boolean getAllOrgsOverride() {
        return allOrgsOverride;
    }

    public void setAllOrgsOverride(@javax.annotation.Nullable Boolean allOrgsOverride) {
        this.allOrgsOverride = allOrgsOverride;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest =
                (ExportMetadataTMLBatchedRequest) o;
        return Objects.equals(this.metadataType, exportMetadataTMLBatchedRequest.metadataType)
                && Objects.equals(this.batchOffset, exportMetadataTMLBatchedRequest.batchOffset)
                && Objects.equals(this.batchSize, exportMetadataTMLBatchedRequest.batchSize)
                && Objects.equals(this.edocFormat, exportMetadataTMLBatchedRequest.edocFormat)
                && Objects.equals(
                        this.exportDependent, exportMetadataTMLBatchedRequest.exportDependent)
                && Objects.equals(
                        this.allOrgsOverride, exportMetadataTMLBatchedRequest.allOrgsOverride);
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
                metadataType, batchOffset, batchSize, edocFormat, exportDependent, allOrgsOverride);
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
        sb.append("class ExportMetadataTMLBatchedRequest {\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    batchOffset: ").append(toIndentedString(batchOffset)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    edocFormat: ").append(toIndentedString(edocFormat)).append("\n");
        sb.append("    exportDependent: ").append(toIndentedString(exportDependent)).append("\n");
        sb.append("    allOrgsOverride: ").append(toIndentedString(allOrgsOverride)).append("\n");
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
        openapiFields.add("metadata_type");
        openapiFields.add("batch_offset");
        openapiFields.add("batch_size");
        openapiFields.add("edoc_format");
        openapiFields.add("export_dependent");
        openapiFields.add("all_orgs_override");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ExportMetadataTMLBatchedRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExportMetadataTMLBatchedRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ExportMetadataTMLBatchedRequest is"
                                        + " not found in the empty JSON string",
                                ExportMetadataTMLBatchedRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ExportMetadataTMLBatchedRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ExportMetadataTMLBatchedRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ExportMetadataTMLBatchedRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the required field `metadata_type`
        MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        if ((jsonObj.get("edoc_format") != null && !jsonObj.get("edoc_format").isJsonNull())
                && !jsonObj.get("edoc_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `edoc_format` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("edoc_format").toString()));
        }
        // validate the optional field `edoc_format`
        if (jsonObj.get("edoc_format") != null && !jsonObj.get("edoc_format").isJsonNull()) {
            EdocFormatEnum.validateJsonElement(jsonObj.get("edoc_format"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExportMetadataTMLBatchedRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExportMetadataTMLBatchedRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExportMetadataTMLBatchedRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ExportMetadataTMLBatchedRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExportMetadataTMLBatchedRequest>() {
                        @Override
                        public void write(JsonWriter out, ExportMetadataTMLBatchedRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ExportMetadataTMLBatchedRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ExportMetadataTMLBatchedRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ExportMetadataTMLBatchedRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ExportMetadataTMLBatchedRequest
     */
    public static ExportMetadataTMLBatchedRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ExportMetadataTMLBatchedRequest.class);
    }

    /**
     * Convert an instance of ExportMetadataTMLBatchedRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
