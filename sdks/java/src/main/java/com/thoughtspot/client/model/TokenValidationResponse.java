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

/** TokenValidationResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class TokenValidationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";

    @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
    @javax.annotation.Nonnull
    private String tokenType;

    public TokenValidationResponse() {}

    public TokenValidationResponse creationTimeInMillis(
            @javax.annotation.Nonnull Float creationTimeInMillis) {
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

    public TokenValidationResponse expirationTimeInMillis(
            @javax.annotation.Nonnull Float expirationTimeInMillis) {
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

    public TokenValidationResponse scope(@javax.annotation.Nonnull Scope scope) {
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

    public TokenValidationResponse validForUserId(@javax.annotation.Nonnull String validForUserId) {
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

    public TokenValidationResponse tokenType(@javax.annotation.Nonnull String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Type of token.
     *
     * @return tokenType
     */
    @javax.annotation.Nonnull
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(@javax.annotation.Nonnull String tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenValidationResponse tokenValidationResponse = (TokenValidationResponse) o;
        return Objects.equals(
                        this.creationTimeInMillis, tokenValidationResponse.creationTimeInMillis)
                && Objects.equals(
                        this.expirationTimeInMillis, tokenValidationResponse.expirationTimeInMillis)
                && Objects.equals(this.scope, tokenValidationResponse.scope)
                && Objects.equals(this.validForUserId, tokenValidationResponse.validForUserId)
                && Objects.equals(this.tokenType, tokenValidationResponse.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                creationTimeInMillis, expirationTimeInMillis, scope, validForUserId, tokenType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenValidationResponse {\n");
        sb.append("    creationTimeInMillis: ")
                .append(toIndentedString(creationTimeInMillis))
                .append("\n");
        sb.append("    expirationTimeInMillis: ")
                .append(toIndentedString(expirationTimeInMillis))
                .append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    validForUserId: ").append(toIndentedString(validForUserId)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
        openapiFields.add("creation_time_in_millis");
        openapiFields.add("expiration_time_in_millis");
        openapiFields.add("scope");
        openapiFields.add("valid_for_user_id");
        openapiFields.add("token_type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("creation_time_in_millis");
        openapiRequiredFields.add("expiration_time_in_millis");
        openapiRequiredFields.add("scope");
        openapiRequiredFields.add("valid_for_user_id");
        openapiRequiredFields.add("token_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TokenValidationResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!TokenValidationResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in TokenValidationResponse is not found"
                                        + " in the empty JSON string",
                                TokenValidationResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!TokenValidationResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `TokenValidationResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : TokenValidationResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `scope`
        Scope.validateJsonElement(jsonObj.get("scope"));
        if (!jsonObj.get("valid_for_user_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `valid_for_user_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("valid_for_user_id").toString()));
        }
        if (!jsonObj.get("token_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `token_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("token_type").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TokenValidationResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TokenValidationResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TokenValidationResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(TokenValidationResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<TokenValidationResponse>() {
                        @Override
                        public void write(JsonWriter out, TokenValidationResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public TokenValidationResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of TokenValidationResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TokenValidationResponse
     * @throws IOException if the JSON string is invalid with respect to TokenValidationResponse
     */
    public static TokenValidationResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TokenValidationResponse.class);
    }

    /**
     * Convert an instance of TokenValidationResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
