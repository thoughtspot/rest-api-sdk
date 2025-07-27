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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ActivateUserRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ActivateUserRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
    @javax.annotation.Nonnull
    private String userIdentifier;

    public static final String SERIALIZED_NAME_AUTH_TOKEN = "auth_token";

    @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
    @javax.annotation.Nonnull
    private String authToken;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    @javax.annotation.Nonnull
    private String password;

    public static final String SERIALIZED_NAME_PROPERTIES = "properties";

    @SerializedName(SERIALIZED_NAME_PROPERTIES)
    @javax.annotation.Nullable
    private String properties;

    public ActivateUserRequest() {}

    public ActivateUserRequest userIdentifier(@javax.annotation.Nonnull String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the user.
     *
     * @return userIdentifier
     */
    @javax.annotation.Nonnull
    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(@javax.annotation.Nonnull String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    public ActivateUserRequest authToken(@javax.annotation.Nonnull String authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * Auth token for the user.
     *
     * @return authToken
     */
    @javax.annotation.Nonnull
    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(@javax.annotation.Nonnull String authToken) {
        this.authToken = authToken;
    }

    public ActivateUserRequest password(@javax.annotation.Nonnull String password) {
        this.password = password;
        return this;
    }

    /**
     * New password for the user to access the account.
     *
     * @return password
     */
    @javax.annotation.Nonnull
    public String getPassword() {
        return password;
    }

    public void setPassword(@javax.annotation.Nonnull String password) {
        this.password = password;
    }

    public ActivateUserRequest properties(@javax.annotation.Nullable String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Properties of the user.
     *
     * @return properties
     */
    @javax.annotation.Nullable
    public String getProperties() {
        return properties;
    }

    public void setProperties(@javax.annotation.Nullable String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivateUserRequest activateUserRequest = (ActivateUserRequest) o;
        return Objects.equals(this.userIdentifier, activateUserRequest.userIdentifier)
                && Objects.equals(this.authToken, activateUserRequest.authToken)
                && Objects.equals(this.password, activateUserRequest.password)
                && Objects.equals(this.properties, activateUserRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIdentifier, authToken, password, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivateUserRequest {\n");
        sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
        sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
        openapiFields.add("user_identifier");
        openapiFields.add("auth_token");
        openapiFields.add("password");
        openapiFields.add("properties");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("user_identifier");
        openapiRequiredFields.add("auth_token");
        openapiRequiredFields.add("password");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ActivateUserRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ActivateUserRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ActivateUserRequest is not found in"
                                        + " the empty JSON string",
                                ActivateUserRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ActivateUserRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ActivateUserRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ActivateUserRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("user_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("user_identifier").toString()));
        }
        if (!jsonObj.get("auth_token").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `auth_token` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("auth_token").toString()));
        }
        if (!jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `password` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("password").toString()));
        }
        if ((jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull())
                && !jsonObj.get("properties").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `properties` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("properties").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ActivateUserRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ActivateUserRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ActivateUserRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ActivateUserRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ActivateUserRequest>() {
                        @Override
                        public void write(JsonWriter out, ActivateUserRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ActivateUserRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ActivateUserRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ActivateUserRequest
     * @throws IOException if the JSON string is invalid with respect to ActivateUserRequest
     */
    public static ActivateUserRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ActivateUserRequest.class);
    }

    /**
     * Convert an instance of ActivateUserRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
