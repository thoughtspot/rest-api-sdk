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

/** Token */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Token implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TOKEN = "token";

    @SerializedName(SERIALIZED_NAME_TOKEN)
    @javax.annotation.Nonnull
    private String token;

    public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";

    @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
    @javax.annotation.Nonnull
    private Float creationTimeInMillis;

    public static final String SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS =
            "expiration_time_in_millis";

    @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS)
    @javax.annotation.Nonnull
    private Float expirationTimeInMillis;

    public static final String SERIALIZED_NAME_SCOPE = "scope";

    @SerializedName(SERIALIZED_NAME_SCOPE)
    @javax.annotation.Nonnull
    private Scope scope;

    public static final String SERIALIZED_NAME_VALID_FOR_USER_ID = "valid_for_user_id";

    @SerializedName(SERIALIZED_NAME_VALID_FOR_USER_ID)
    @javax.annotation.Nonnull
    private String validForUserId;

    public static final String SERIALIZED_NAME_VALID_FOR_USERNAME = "valid_for_username";

    @SerializedName(SERIALIZED_NAME_VALID_FOR_USERNAME)
    @javax.annotation.Nonnull
    private String validForUsername;

    public Token() {}

    public Token token(@javax.annotation.Nonnull String token) {
        this.token = token;
        return this;
    }

    /**
     * Bearer auth token.
     *
     * @return token
     */
    @javax.annotation.Nonnull
    public String getToken() {
        return token;
    }

    public void setToken(@javax.annotation.Nonnull String token) {
        this.token = token;
    }

    public Token creationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
        return this;
    }

    /**
     * Token creation time in milliseconds.
     *
     * @return creationTimeInMillis
     */
    @javax.annotation.Nonnull
    public Float getCreationTimeInMillis() {
        return creationTimeInMillis;
    }

    public void setCreationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    public Token expirationTimeInMillis(@javax.annotation.Nonnull Float expirationTimeInMillis) {
        this.expirationTimeInMillis = expirationTimeInMillis;
        return this;
    }

    /**
     * Token expiration time in milliseconds.
     *
     * @return expirationTimeInMillis
     */
    @javax.annotation.Nonnull
    public Float getExpirationTimeInMillis() {
        return expirationTimeInMillis;
    }

    public void setExpirationTimeInMillis(@javax.annotation.Nonnull Float expirationTimeInMillis) {
        this.expirationTimeInMillis = expirationTimeInMillis;
    }

    public Token scope(@javax.annotation.Nonnull Scope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get scope
     *
     * @return scope
     */
    @javax.annotation.Nonnull
    public Scope getScope() {
        return scope;
    }

    public void setScope(@javax.annotation.Nonnull Scope scope) {
        this.scope = scope;
    }

    public Token validForUserId(@javax.annotation.Nonnull String validForUserId) {
        this.validForUserId = validForUserId;
        return this;
    }

    /**
     * Username to whom the token is issued.
     *
     * @return validForUserId
     */
    @javax.annotation.Nonnull
    public String getValidForUserId() {
        return validForUserId;
    }

    public void setValidForUserId(@javax.annotation.Nonnull String validForUserId) {
        this.validForUserId = validForUserId;
    }

    public Token validForUsername(@javax.annotation.Nonnull String validForUsername) {
        this.validForUsername = validForUsername;
        return this;
    }

    /**
     * Unique identifier of the user to whom the token is issued.
     *
     * @return validForUsername
     */
    @javax.annotation.Nonnull
    public String getValidForUsername() {
        return validForUsername;
    }

    public void setValidForUsername(@javax.annotation.Nonnull String validForUsername) {
        this.validForUsername = validForUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Token token = (Token) o;
        return Objects.equals(this.token, token.token)
                && Objects.equals(this.creationTimeInMillis, token.creationTimeInMillis)
                && Objects.equals(this.expirationTimeInMillis, token.expirationTimeInMillis)
                && Objects.equals(this.scope, token.scope)
                && Objects.equals(this.validForUserId, token.validForUserId)
                && Objects.equals(this.validForUsername, token.validForUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                token,
                creationTimeInMillis,
                expirationTimeInMillis,
                scope,
                validForUserId,
                validForUsername);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Token {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    creationTimeInMillis: ")
                .append(toIndentedString(creationTimeInMillis))
                .append("\n");
        sb.append("    expirationTimeInMillis: ")
                .append(toIndentedString(expirationTimeInMillis))
                .append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    validForUserId: ").append(toIndentedString(validForUserId)).append("\n");
        sb.append("    validForUsername: ").append(toIndentedString(validForUsername)).append("\n");
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
        openapiFields.add("token");
        openapiFields.add("creation_time_in_millis");
        openapiFields.add("expiration_time_in_millis");
        openapiFields.add("scope");
        openapiFields.add("valid_for_user_id");
        openapiFields.add("valid_for_username");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("token");
        openapiRequiredFields.add("creation_time_in_millis");
        openapiRequiredFields.add("expiration_time_in_millis");
        openapiRequiredFields.add("scope");
        openapiRequiredFields.add("valid_for_user_id");
        openapiRequiredFields.add("valid_for_username");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Token
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Token.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Token is not found in the empty JSON"
                                        + " string",
                                Token.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Token.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Token`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Token.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("token").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `token` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("token").toString()));
        }
        // validate the required field `scope`
        Scope.validateJsonElement(jsonObj.get("scope"));
        if (!jsonObj.get("valid_for_user_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `valid_for_user_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("valid_for_user_id").toString()));
        }
        if (!jsonObj.get("valid_for_username").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `valid_for_username` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("valid_for_username").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Token.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Token' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Token> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Token.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Token>() {
                        @Override
                        public void write(JsonWriter out, Token value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Token read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Token given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Token
     * @throws IOException if the JSON string is invalid with respect to Token
     */
    public static Token fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Token.class);
    }

    /**
     * Convert an instance of Token to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
