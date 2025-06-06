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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** SearchCommitsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchCommitsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nonnull
    private String metadataIdentifier;

    /** Type of metadata. */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LIVEBOARD("LIVEBOARD"),

        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        CUSTOM_ACTION("CUSTOM_ACTION");

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
    @javax.annotation.Nullable
    private MetadataTypeEnum metadataType;

    public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";

    @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
    @javax.annotation.Nullable
    private String branchName;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize;

    public SearchCommitsRequest() {}

    public SearchCommitsRequest metadataIdentifier(
            @javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the metadata.
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

    public SearchCommitsRequest metadataType(
            @javax.annotation.Nullable MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of metadata.
     *
     * @return metadataType
     */
    @javax.annotation.Nullable
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nullable MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public SearchCommitsRequest branchName(@javax.annotation.Nullable String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * Name of the branch from which commit history needs to be displayed. Note: If no branch_name
     * is specified, then commits will be returned for the default branch for this configuration.
     *
     * @return branchName
     */
    @javax.annotation.Nullable
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(@javax.annotation.Nullable String branchName) {
        this.branchName = branchName;
    }

    public SearchCommitsRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * Record offset point in the commit history to display the response. Note: If no record offset
     * is specified, the beginning of the record will be considered.
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

    public SearchCommitsRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * Number of history records from record offset point to be displayed in the response. Note: If
     * no record size is specified, then all the records will be considered.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchCommitsRequest searchCommitsRequest = (SearchCommitsRequest) o;
        return Objects.equals(this.metadataIdentifier, searchCommitsRequest.metadataIdentifier)
                && Objects.equals(this.metadataType, searchCommitsRequest.metadataType)
                && Objects.equals(this.branchName, searchCommitsRequest.branchName)
                && Objects.equals(this.recordOffset, searchCommitsRequest.recordOffset)
                && Objects.equals(this.recordSize, searchCommitsRequest.recordSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataIdentifier, metadataType, branchName, recordOffset, recordSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCommitsRequest {\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
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
        openapiFields.add("metadata_type");
        openapiFields.add("branch_name");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SearchCommitsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchCommitsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchCommitsRequest is not found in"
                                        + " the empty JSON string",
                                SearchCommitsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchCommitsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchCommitsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SearchCommitsRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull())
                && !jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the optional field `metadata_type`
        if (jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull()) {
            MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        }
        if ((jsonObj.get("branch_name") != null && !jsonObj.get("branch_name").isJsonNull())
                && !jsonObj.get("branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `branch_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("branch_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchCommitsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchCommitsRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchCommitsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchCommitsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchCommitsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchCommitsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchCommitsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchCommitsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchCommitsRequest
     * @throws IOException if the JSON string is invalid with respect to SearchCommitsRequest
     */
    public static SearchCommitsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchCommitsRequest.class);
    }

    /**
     * Convert an instance of SearchCommitsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
