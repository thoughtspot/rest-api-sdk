/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
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

/** GCP GCS storage configuration details. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GcpGcsConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BUCKET_NAME = "bucket_name";

    @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
    @javax.annotation.Nonnull
    private String bucketName;

    public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_EMAIL = "service_account_email";

    @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_EMAIL)
    @javax.annotation.Nonnull
    private String serviceAccountEmail;

    public static final String SERIALIZED_NAME_PATH_PREFIX = "path_prefix";

    @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
    @javax.annotation.Nullable
    private String pathPrefix;

    public GcpGcsConfig() {}

    public GcpGcsConfig bucketName(@javax.annotation.Nonnull String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Name of the GCS bucket where webhook payloads are stored.
     *
     * @return bucketName
     */
    @javax.annotation.Nonnull
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(@javax.annotation.Nonnull String bucketName) {
        this.bucketName = bucketName;
    }

    public GcpGcsConfig serviceAccountEmail(@javax.annotation.Nonnull String serviceAccountEmail) {
        this.serviceAccountEmail = serviceAccountEmail;
        return this;
    }

    /**
     * Email of the GCP service account to impersonate for bucket access.
     *
     * @return serviceAccountEmail
     */
    @javax.annotation.Nonnull
    public String getServiceAccountEmail() {
        return serviceAccountEmail;
    }

    public void setServiceAccountEmail(@javax.annotation.Nonnull String serviceAccountEmail) {
        this.serviceAccountEmail = serviceAccountEmail;
    }

    public GcpGcsConfig pathPrefix(@javax.annotation.Nullable String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Path prefix for organizing objects within the bucket.
     *
     * @return pathPrefix
     */
    @javax.annotation.Nullable
    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(@javax.annotation.Nullable String pathPrefix) {
        this.pathPrefix = pathPrefix;
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
     * @return the GcpGcsConfig instance itself
     */
    public GcpGcsConfig putAdditionalProperty(String key, Object value) {
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
        GcpGcsConfig gcpGcsConfig = (GcpGcsConfig) o;
        return Objects.equals(this.bucketName, gcpGcsConfig.bucketName)
                && Objects.equals(this.serviceAccountEmail, gcpGcsConfig.serviceAccountEmail)
                && Objects.equals(this.pathPrefix, gcpGcsConfig.pathPrefix)
                && Objects.equals(this.additionalProperties, gcpGcsConfig.additionalProperties);
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
        return Objects.hash(bucketName, serviceAccountEmail, pathPrefix, additionalProperties);
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
        sb.append("class GcpGcsConfig {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    serviceAccountEmail: ")
                .append(toIndentedString(serviceAccountEmail))
                .append("\n");
        sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
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
        openapiFields.add("bucket_name");
        openapiFields.add("service_account_email");
        openapiFields.add("path_prefix");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("bucket_name");
        openapiRequiredFields.add("service_account_email");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GcpGcsConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GcpGcsConfig.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GcpGcsConfig is not found in the"
                                        + " empty JSON string",
                                GcpGcsConfig.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GcpGcsConfig.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("bucket_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `bucket_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("bucket_name").toString()));
        }
        if (!jsonObj.get("service_account_email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `service_account_email` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("service_account_email").toString()));
        }
        if ((jsonObj.get("path_prefix") != null && !jsonObj.get("path_prefix").isJsonNull())
                && !jsonObj.get("path_prefix").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `path_prefix` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("path_prefix").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GcpGcsConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GcpGcsConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GcpGcsConfig> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GcpGcsConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GcpGcsConfig>() {
                        @Override
                        public void write(JsonWriter out, GcpGcsConfig value) throws IOException {
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
                        public GcpGcsConfig read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            GcpGcsConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of GcpGcsConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GcpGcsConfig
     * @throws IOException if the JSON string is invalid with respect to GcpGcsConfig
     */
    public static GcpGcsConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GcpGcsConfig.class);
    }

    /**
     * Convert an instance of GcpGcsConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
