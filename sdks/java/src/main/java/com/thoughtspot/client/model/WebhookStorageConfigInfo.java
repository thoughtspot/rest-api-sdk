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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Cluster-level storage setup information for configuring customer-managed storage. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookStorageConfigInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of storage destination. */
    @JsonAdapter(StorageTypeEnum.Adapter.class)
    public enum StorageTypeEnum {
        OBJECT_STORAGE("OBJECT_STORAGE");

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

    /** Storage destination provider. */
    @JsonAdapter(ProviderEnum.Adapter.class)
    public enum ProviderEnum {
        AWS_S3("AWS_S3"),

        GCP_GCS("GCP_GCS");

        private String value;

        ProviderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ProviderEnum fromValue(String value) {
            for (ProviderEnum b : ProviderEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ProviderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ProviderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ProviderEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ProviderEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PROVIDER = "provider";

    @SerializedName(SERIALIZED_NAME_PROVIDER)
    @javax.annotation.Nonnull
    private ProviderEnum provider;

    public static final String SERIALIZED_NAME_CONFIG = "config";

    @SerializedName(SERIALIZED_NAME_CONFIG)
    @javax.annotation.Nonnull
    private WebhookStorageSetupConfig config;

    public WebhookStorageConfigInfo() {}

    public WebhookStorageConfigInfo storageType(
            @javax.annotation.Nonnull StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Type of storage destination.
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

    public WebhookStorageConfigInfo provider(@javax.annotation.Nonnull ProviderEnum provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Storage destination provider.
     *
     * @return provider
     */
    @javax.annotation.Nonnull
    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(@javax.annotation.Nonnull ProviderEnum provider) {
        this.provider = provider;
    }

    public WebhookStorageConfigInfo config(
            @javax.annotation.Nonnull WebhookStorageSetupConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     *
     * @return config
     */
    @javax.annotation.Nonnull
    public WebhookStorageSetupConfig getConfig() {
        return config;
    }

    public void setConfig(@javax.annotation.Nonnull WebhookStorageSetupConfig config) {
        this.config = config;
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
     * @return the WebhookStorageConfigInfo instance itself
     */
    public WebhookStorageConfigInfo putAdditionalProperty(String key, Object value) {
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
        WebhookStorageConfigInfo webhookStorageConfigInfo = (WebhookStorageConfigInfo) o;
        return Objects.equals(this.storageType, webhookStorageConfigInfo.storageType)
                && Objects.equals(this.provider, webhookStorageConfigInfo.provider)
                && Objects.equals(this.config, webhookStorageConfigInfo.config)
                && Objects.equals(
                        this.additionalProperties, webhookStorageConfigInfo.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType, provider, config, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStorageConfigInfo {\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
        openapiFields.add("storage_type");
        openapiFields.add("provider");
        openapiFields.add("config");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("storage_type");
        openapiRequiredFields.add("provider");
        openapiRequiredFields.add("config");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookStorageConfigInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookStorageConfigInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookStorageConfigInfo is not found"
                                        + " in the empty JSON string",
                                WebhookStorageConfigInfo.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookStorageConfigInfo.openapiRequiredFields) {
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
        if (!jsonObj.get("provider").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `provider` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("provider").toString()));
        }
        // validate the required field `provider`
        ProviderEnum.validateJsonElement(jsonObj.get("provider"));
        // validate the required field `config`
        WebhookStorageSetupConfig.validateJsonElement(jsonObj.get("config"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookStorageConfigInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookStorageConfigInfo' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookStorageConfigInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookStorageConfigInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookStorageConfigInfo>() {
                        @Override
                        public void write(JsonWriter out, WebhookStorageConfigInfo value)
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
                        public WebhookStorageConfigInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            WebhookStorageConfigInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of WebhookStorageConfigInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookStorageConfigInfo
     * @throws IOException if the JSON string is invalid with respect to WebhookStorageConfigInfo
     */
    public static WebhookStorageConfigInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookStorageConfigInfo.class);
    }

    /**
     * Convert an instance of WebhookStorageConfigInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
