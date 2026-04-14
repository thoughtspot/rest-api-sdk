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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ConfigureAuthSettingsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConfigureAuthSettingsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of authentication mechanism to configure. Currently supports TRUSTED_AUTH. */
    @JsonAdapter(AuthTypeEnum.Adapter.class)
    public enum AuthTypeEnum {
        TRUSTED_AUTH("TRUSTED_AUTH");

        private String value;

        AuthTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AuthTypeEnum fromValue(String value) {
            for (AuthTypeEnum b : AuthTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AuthTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AuthTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AuthTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
    @javax.annotation.Nonnull
    private AuthTypeEnum authType;

    public static final String SERIALIZED_NAME_CLUSTER_PREFERENCES = "cluster_preferences";

    @SerializedName(SERIALIZED_NAME_CLUSTER_PREFERENCES)
    @javax.annotation.Nullable
    private AuthClusterPreferencesInput clusterPreferences;

    public static final String SERIALIZED_NAME_ORG_PREFERENCES = "org_preferences";

    @SerializedName(SERIALIZED_NAME_ORG_PREFERENCES)
    @javax.annotation.Nullable
    private List<AuthOrgPreferenceInput> orgPreferences;

    public ConfigureAuthSettingsRequest() {}

    public ConfigureAuthSettingsRequest authType(@javax.annotation.Nonnull AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Type of authentication mechanism to configure. Currently supports TRUSTED_AUTH.
     *
     * @return authType
     */
    @javax.annotation.Nonnull
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(@javax.annotation.Nonnull AuthTypeEnum authType) {
        this.authType = authType;
    }

    public ConfigureAuthSettingsRequest clusterPreferences(
            @javax.annotation.Nullable AuthClusterPreferencesInput clusterPreferences) {
        this.clusterPreferences = clusterPreferences;
        return this;
    }

    /**
     * Cluster-level authentication preferences. Omit to leave the existing cluster setting
     * unchanged.
     *
     * @return clusterPreferences
     */
    @javax.annotation.Nullable
    public AuthClusterPreferencesInput getClusterPreferences() {
        return clusterPreferences;
    }

    public void setClusterPreferences(
            @javax.annotation.Nullable AuthClusterPreferencesInput clusterPreferences) {
        this.clusterPreferences = clusterPreferences;
    }

    public ConfigureAuthSettingsRequest orgPreferences(
            @javax.annotation.Nullable List<AuthOrgPreferenceInput> orgPreferences) {
        this.orgPreferences = orgPreferences;
        return this;
    }

    public ConfigureAuthSettingsRequest addOrgPreferencesItem(
            AuthOrgPreferenceInput orgPreferencesItem) {
        if (this.orgPreferences == null) {
            this.orgPreferences = new ArrayList<>();
        }
        this.orgPreferences.add(orgPreferencesItem);
        return this;
    }

    /**
     * Org-level authentication preferences. Each entry identifies an org and the desired status.
     * Omit to leave existing org settings unchanged.
     *
     * @return orgPreferences
     */
    @javax.annotation.Nullable
    public List<AuthOrgPreferenceInput> getOrgPreferences() {
        return orgPreferences;
    }

    public void setOrgPreferences(
            @javax.annotation.Nullable List<AuthOrgPreferenceInput> orgPreferences) {
        this.orgPreferences = orgPreferences;
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
     * @return the ConfigureAuthSettingsRequest instance itself
     */
    public ConfigureAuthSettingsRequest putAdditionalProperty(String key, Object value) {
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
        ConfigureAuthSettingsRequest configureAuthSettingsRequest =
                (ConfigureAuthSettingsRequest) o;
        return Objects.equals(this.authType, configureAuthSettingsRequest.authType)
                && Objects.equals(
                        this.clusterPreferences, configureAuthSettingsRequest.clusterPreferences)
                && Objects.equals(this.orgPreferences, configureAuthSettingsRequest.orgPreferences)
                && Objects.equals(
                        this.additionalProperties,
                        configureAuthSettingsRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, clusterPreferences, orgPreferences, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigureAuthSettingsRequest {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    clusterPreferences: ")
                .append(toIndentedString(clusterPreferences))
                .append("\n");
        sb.append("    orgPreferences: ").append(toIndentedString(orgPreferences)).append("\n");
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
        openapiFields.add("auth_type");
        openapiFields.add("cluster_preferences");
        openapiFields.add("org_preferences");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("auth_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ConfigureAuthSettingsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConfigureAuthSettingsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConfigureAuthSettingsRequest is not"
                                        + " found in the empty JSON string",
                                ConfigureAuthSettingsRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ConfigureAuthSettingsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("auth_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `auth_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("auth_type").toString()));
        }
        // validate the required field `auth_type`
        AuthTypeEnum.validateJsonElement(jsonObj.get("auth_type"));
        // validate the optional field `cluster_preferences`
        if (jsonObj.get("cluster_preferences") != null
                && !jsonObj.get("cluster_preferences").isJsonNull()) {
            AuthClusterPreferencesInput.validateJsonElement(jsonObj.get("cluster_preferences"));
        }
        if (jsonObj.get("org_preferences") != null
                && !jsonObj.get("org_preferences").isJsonNull()) {
            JsonArray jsonArrayorgPreferences = jsonObj.getAsJsonArray("org_preferences");
            if (jsonArrayorgPreferences != null) {
                // ensure the json data is an array
                if (!jsonObj.get("org_preferences").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `org_preferences` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("org_preferences").toString()));
                }

                // validate the optional field `org_preferences` (array)
                for (int i = 0; i < jsonArrayorgPreferences.size(); i++) {
                    AuthOrgPreferenceInput.validateJsonElement(jsonArrayorgPreferences.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConfigureAuthSettingsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConfigureAuthSettingsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConfigureAuthSettingsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ConfigureAuthSettingsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConfigureAuthSettingsRequest>() {
                        @Override
                        public void write(JsonWriter out, ConfigureAuthSettingsRequest value)
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
                        public ConfigureAuthSettingsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ConfigureAuthSettingsRequest instance =
                                    thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ConfigureAuthSettingsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConfigureAuthSettingsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ConfigureAuthSettingsRequest
     */
    public static ConfigureAuthSettingsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConfigureAuthSettingsRequest.class);
    }

    /**
     * Convert an instance of ConfigureAuthSettingsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
