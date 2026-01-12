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

/** Input type for storage destination configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StorageDestinationInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of storage destination. Example: \&quot;AWS_S3\&quot; */
    @JsonAdapter(StorageTypeEnum.Adapter.class)
    public enum StorageTypeEnum {
        AWS_S3("AWS_S3");

        private String value;

        StorageTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StorageTypeEnum fromValue(String value) {
            for (StorageTypeEnum b : StorageTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StorageTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StorageTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            StorageTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_STORAGE_TYPE = "storage_type";

    @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
    @javax.annotation.Nonnull
    private StorageTypeEnum storageType;

    public static final String SERIALIZED_NAME_STORAGE_CONFIG = "storage_config";

    @SerializedName(SERIALIZED_NAME_STORAGE_CONFIG)
    @javax.annotation.Nonnull
    private StorageConfigInput storageConfig;

    public StorageDestinationInput() {}

    public StorageDestinationInput storageType(
            @javax.annotation.Nonnull StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Type of storage destination. Example: \&quot;AWS_S3\&quot;
     *
     * @return storageType
     */
    @javax.annotation.Nonnull
    public StorageTypeEnum getStorageType() {
        return storageType;
    }

    public void setStorageType(@javax.annotation.Nonnull StorageTypeEnum storageType) {
        this.storageType = storageType;
    }

    public StorageDestinationInput storageConfig(
            @javax.annotation.Nonnull StorageConfigInput storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }

    /**
     * Get storageConfig
     *
     * @return storageConfig
     */
    @javax.annotation.Nonnull
    public StorageConfigInput getStorageConfig() {
        return storageConfig;
    }

    public void setStorageConfig(@javax.annotation.Nonnull StorageConfigInput storageConfig) {
        this.storageConfig = storageConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageDestinationInput storageDestinationInput = (StorageDestinationInput) o;
        return Objects.equals(this.storageType, storageDestinationInput.storageType)
                && Objects.equals(this.storageConfig, storageDestinationInput.storageConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType, storageConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageDestinationInput {\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
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
        openapiFields.add("storage_type");
        openapiFields.add("storage_config");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("storage_type");
        openapiRequiredFields.add("storage_config");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StorageDestinationInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StorageDestinationInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StorageDestinationInput is not found"
                                        + " in the empty JSON string",
                                StorageDestinationInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!StorageDestinationInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `StorageDestinationInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : StorageDestinationInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("storage_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `storage_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("storage_type").toString()));
        }
        // validate the required field `storage_type`
        StorageTypeEnum.validateJsonElement(jsonObj.get("storage_type"));
        // validate the required field `storage_config`
        StorageConfigInput.validateJsonElement(jsonObj.get("storage_config"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StorageDestinationInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StorageDestinationInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StorageDestinationInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StorageDestinationInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StorageDestinationInput>() {
                        @Override
                        public void write(JsonWriter out, StorageDestinationInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public StorageDestinationInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of StorageDestinationInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StorageDestinationInput
     * @throws IOException if the JSON string is invalid with respect to StorageDestinationInput
     */
    public static StorageDestinationInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StorageDestinationInput.class);
    }

    /**
     * Convert an instance of StorageDestinationInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
