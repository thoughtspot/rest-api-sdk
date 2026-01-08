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

/** Storage destination configuration for webhook payload delivery. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StorageDestination implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of storage destination (e.g., AWS_S3). */
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
    private StorageConfig storageConfig;

    public StorageDestination() {}

    public StorageDestination storageType(@javax.annotation.Nonnull StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Type of storage destination (e.g., AWS_S3).
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

    public StorageDestination storageConfig(@javax.annotation.Nonnull StorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }

    /**
     * Get storageConfig
     *
     * @return storageConfig
     */
    @javax.annotation.Nonnull
    public StorageConfig getStorageConfig() {
        return storageConfig;
    }

    public void setStorageConfig(@javax.annotation.Nonnull StorageConfig storageConfig) {
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
        StorageDestination storageDestination = (StorageDestination) o;
        return Objects.equals(this.storageType, storageDestination.storageType)
                && Objects.equals(this.storageConfig, storageDestination.storageConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType, storageConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageDestination {\n");
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
     * @throws IOException if the JSON Element is invalid with respect to StorageDestination
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StorageDestination.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StorageDestination is not found in"
                                        + " the empty JSON string",
                                StorageDestination.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!StorageDestination.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `StorageDestination` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : StorageDestination.openapiRequiredFields) {
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
        StorageConfig.validateJsonElement(jsonObj.get("storage_config"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StorageDestination.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StorageDestination' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StorageDestination> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StorageDestination.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StorageDestination>() {
                        @Override
                        public void write(JsonWriter out, StorageDestination value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public StorageDestination read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of StorageDestination given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StorageDestination
     * @throws IOException if the JSON string is invalid with respect to StorageDestination
     */
    public static StorageDestination fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StorageDestination.class);
    }

    /**
     * Convert an instance of StorageDestination to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
