/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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

/** FetchPermissionsOfPrincipalsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchPermissionsOfPrincipalsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PRINCIPALS = "principals";

    @SerializedName(SERIALIZED_NAME_PRINCIPALS)
    @javax.annotation.Nonnull
    private List<PrincipalsInput> principals;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nullable
    private List<PermissionsMetadataTypeInput> metadata;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = -1;

    /** When no metadata objects input is passed, metadata objects of this type are fetched. */
    @JsonAdapter(DefaultMetadataTypeEnum.Adapter.class)
    public enum DefaultMetadataTypeEnum {
        ALL("ALL"),

        LIVEBOARD("LIVEBOARD"),

        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        LOGICAL_COLUMN("LOGICAL_COLUMN"),

        CONNECTION("CONNECTION");

        private String value;

        DefaultMetadataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DefaultMetadataTypeEnum fromValue(String value) {
            for (DefaultMetadataTypeEnum b : DefaultMetadataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DefaultMetadataTypeEnum> {
            @Override
            public void write(
                    final JsonWriter jsonWriter, final DefaultMetadataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DefaultMetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DefaultMetadataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DefaultMetadataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DEFAULT_METADATA_TYPE = "default_metadata_type";

    @SerializedName(SERIALIZED_NAME_DEFAULT_METADATA_TYPE)
    @javax.annotation.Nullable
    private DefaultMetadataTypeEnum defaultMetadataType;

    public FetchPermissionsOfPrincipalsRequest() {}

    public FetchPermissionsOfPrincipalsRequest principals(
            @javax.annotation.Nonnull List<PrincipalsInput> principals) {
        this.principals = principals;
        return this;
    }

    public FetchPermissionsOfPrincipalsRequest addPrincipalsItem(PrincipalsInput principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    /**
     * GUID or name of the user or group.
     *
     * @return principals
     */
    @javax.annotation.Nonnull
    public List<PrincipalsInput> getPrincipals() {
        return principals;
    }

    public void setPrincipals(@javax.annotation.Nonnull List<PrincipalsInput> principals) {
        this.principals = principals;
    }

    public FetchPermissionsOfPrincipalsRequest metadata(
            @javax.annotation.Nullable List<PermissionsMetadataTypeInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public FetchPermissionsOfPrincipalsRequest addMetadataItem(
            PermissionsMetadataTypeInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects for which you want to fetch permission details. If not specified, the API
     * returns permission details for all metadata objects that the specified users and groups can
     * access.
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    public List<PermissionsMetadataTypeInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(
            @javax.annotation.Nullable List<PermissionsMetadataTypeInput> metadata) {
        this.metadata = metadata;
    }

    public FetchPermissionsOfPrincipalsRequest recordOffset(
            @javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included for each metadata type.
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

    public FetchPermissionsOfPrincipalsRequest recordSize(
            @javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included for each metadata type.
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

    public FetchPermissionsOfPrincipalsRequest defaultMetadataType(
            @javax.annotation.Nullable DefaultMetadataTypeEnum defaultMetadataType) {
        this.defaultMetadataType = defaultMetadataType;
        return this;
    }

    /**
     * When no metadata objects input is passed, metadata objects of this type are fetched.
     *
     * @return defaultMetadataType
     */
    @javax.annotation.Nullable
    public DefaultMetadataTypeEnum getDefaultMetadataType() {
        return defaultMetadataType;
    }

    public void setDefaultMetadataType(
            @javax.annotation.Nullable DefaultMetadataTypeEnum defaultMetadataType) {
        this.defaultMetadataType = defaultMetadataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest =
                (FetchPermissionsOfPrincipalsRequest) o;
        return Objects.equals(this.principals, fetchPermissionsOfPrincipalsRequest.principals)
                && Objects.equals(this.metadata, fetchPermissionsOfPrincipalsRequest.metadata)
                && Objects.equals(
                        this.recordOffset, fetchPermissionsOfPrincipalsRequest.recordOffset)
                && Objects.equals(this.recordSize, fetchPermissionsOfPrincipalsRequest.recordSize)
                && Objects.equals(
                        this.defaultMetadataType,
                        fetchPermissionsOfPrincipalsRequest.defaultMetadataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principals, metadata, recordOffset, recordSize, defaultMetadataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchPermissionsOfPrincipalsRequest {\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    defaultMetadataType: ")
                .append(toIndentedString(defaultMetadataType))
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
        openapiFields.add("principals");
        openapiFields.add("metadata");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("default_metadata_type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("principals");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     FetchPermissionsOfPrincipalsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchPermissionsOfPrincipalsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FetchPermissionsOfPrincipalsRequest"
                                        + " is not found in the empty JSON string",
                                FetchPermissionsOfPrincipalsRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FetchPermissionsOfPrincipalsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FetchPermissionsOfPrincipalsRequest` properties. JSON:"
                                        + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FetchPermissionsOfPrincipalsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("principals").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `principals` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("principals").toString()));
        }

        JsonArray jsonArrayprincipals = jsonObj.getAsJsonArray("principals");
        // validate the required field `principals` (array)
        for (int i = 0; i < jsonArrayprincipals.size(); i++) {
            PrincipalsInput.validateJsonElement(jsonArrayprincipals.get(i));
        }
        ;
        if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
            JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
            if (jsonArraymetadata != null) {
                // ensure the json data is an array
                if (!jsonObj.get("metadata").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `metadata` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("metadata").toString()));
                }

                // validate the optional field `metadata` (array)
                for (int i = 0; i < jsonArraymetadata.size(); i++) {
                    PermissionsMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("default_metadata_type") != null
                        && !jsonObj.get("default_metadata_type").isJsonNull())
                && !jsonObj.get("default_metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `default_metadata_type` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("default_metadata_type").toString()));
        }
        // validate the optional field `default_metadata_type`
        if (jsonObj.get("default_metadata_type") != null
                && !jsonObj.get("default_metadata_type").isJsonNull()) {
            DefaultMetadataTypeEnum.validateJsonElement(jsonObj.get("default_metadata_type"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchPermissionsOfPrincipalsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FetchPermissionsOfPrincipalsRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchPermissionsOfPrincipalsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(FetchPermissionsOfPrincipalsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchPermissionsOfPrincipalsRequest>() {
                        @Override
                        public void write(JsonWriter out, FetchPermissionsOfPrincipalsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchPermissionsOfPrincipalsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchPermissionsOfPrincipalsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchPermissionsOfPrincipalsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     FetchPermissionsOfPrincipalsRequest
     */
    public static FetchPermissionsOfPrincipalsRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, FetchPermissionsOfPrincipalsRequest.class);
    }

    /**
     * Convert an instance of FetchPermissionsOfPrincipalsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
