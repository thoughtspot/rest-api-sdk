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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Cluster-level authentication preferences. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AuthClusterPreferences implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Whether authentication is enabled or disabled at the cluster level. */
    @JsonAdapter(AuthStatusEnum.Adapter.class)
    public enum AuthStatusEnum {
        ENABLED("ENABLED"),

        DISABLED("DISABLED");

        private String value;

        AuthStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AuthStatusEnum fromValue(String value) {
            for (AuthStatusEnum b : AuthStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<AuthStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AuthStatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AuthStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AuthStatusEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AuthStatusEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";

    @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
    @javax.annotation.Nullable
    private AuthStatusEnum authStatus;

    public static final String SERIALIZED_NAME_ACCESS_TOKENS = "access_tokens";

    @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS)
    @javax.annotation.Nullable
    private List<AuthSettingsAccessToken> accessTokens;

    public AuthClusterPreferences() {}

    public AuthClusterPreferences authStatus(@javax.annotation.Nullable AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * Whether authentication is enabled or disabled at the cluster level.
     *
     * @return authStatus
     */
    @javax.annotation.Nullable
    public AuthStatusEnum getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(@javax.annotation.Nullable AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
    }

    public AuthClusterPreferences accessTokens(
            @javax.annotation.Nullable List<AuthSettingsAccessToken> accessTokens) {
        this.accessTokens = accessTokens;
        return this;
    }

    public AuthClusterPreferences addAccessTokensItem(AuthSettingsAccessToken accessTokensItem) {
        if (this.accessTokens == null) {
            this.accessTokens = new ArrayList<>();
        }
        this.accessTokens.add(accessTokensItem);
        return this;
    }

    /**
     * Cluster-level access tokens. Absent when no token is configured.
     *
     * @return accessTokens
     */
    @javax.annotation.Nullable
    public List<AuthSettingsAccessToken> getAccessTokens() {
        return accessTokens;
    }

    public void setAccessTokens(
            @javax.annotation.Nullable List<AuthSettingsAccessToken> accessTokens) {
        this.accessTokens = accessTokens;
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
     * @return the AuthClusterPreferences instance itself
     */
    public AuthClusterPreferences putAdditionalProperty(String key, Object value) {
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
        AuthClusterPreferences authClusterPreferences = (AuthClusterPreferences) o;
        return Objects.equals(this.authStatus, authClusterPreferences.authStatus)
                && Objects.equals(this.accessTokens, authClusterPreferences.accessTokens)
                && Objects.equals(
                        this.additionalProperties, authClusterPreferences.additionalProperties);
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
        return Objects.hash(authStatus, accessTokens, additionalProperties);
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
        sb.append("class AuthClusterPreferences {\n");
        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
        sb.append("    accessTokens: ").append(toIndentedString(accessTokens)).append("\n");
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
        openapiFields.add("auth_status");
        openapiFields.add("access_tokens");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AuthClusterPreferences
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AuthClusterPreferences.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AuthClusterPreferences is not found"
                                        + " in the empty JSON string",
                                AuthClusterPreferences.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("auth_status") != null && !jsonObj.get("auth_status").isJsonNull())
                && !jsonObj.get("auth_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `auth_status` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("auth_status").toString()));
        }
        // validate the optional field `auth_status`
        if (jsonObj.get("auth_status") != null && !jsonObj.get("auth_status").isJsonNull()) {
            AuthStatusEnum.validateJsonElement(jsonObj.get("auth_status"));
        }
        if (jsonObj.get("access_tokens") != null && !jsonObj.get("access_tokens").isJsonNull()) {
            JsonArray jsonArrayaccessTokens = jsonObj.getAsJsonArray("access_tokens");
            if (jsonArrayaccessTokens != null) {
                // ensure the json data is an array
                if (!jsonObj.get("access_tokens").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `access_tokens` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("access_tokens").toString()));
                }

                // validate the optional field `access_tokens` (array)
                for (int i = 0; i < jsonArrayaccessTokens.size(); i++) {
                    AuthSettingsAccessToken.validateJsonElement(jsonArrayaccessTokens.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AuthClusterPreferences.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AuthClusterPreferences' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AuthClusterPreferences> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AuthClusterPreferences.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AuthClusterPreferences>() {
                        @Override
                        public void write(JsonWriter out, AuthClusterPreferences value)
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
                        public AuthClusterPreferences read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AuthClusterPreferences instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AuthClusterPreferences given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AuthClusterPreferences
     * @throws IOException if the JSON string is invalid with respect to AuthClusterPreferences
     */
    public static AuthClusterPreferences fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AuthClusterPreferences.class);
    }

    /**
     * Convert an instance of AuthClusterPreferences to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
