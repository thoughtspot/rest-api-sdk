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

/** RevokeTokenRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RevokeTokenRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
    @javax.annotation.Nullable
    private String userIdentifier;

    public static final String SERIALIZED_NAME_TOKEN = "token";

    @SerializedName(SERIALIZED_NAME_TOKEN)
    @javax.annotation.Nullable
    private String token;

    public RevokeTokenRequest() {}

    public RevokeTokenRequest userIdentifier(@javax.annotation.Nullable String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    /**
     * Get userIdentifier
     *
     * @return userIdentifier
     */
    @javax.annotation.Nullable
    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(@javax.annotation.Nullable String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    public RevokeTokenRequest token(@javax.annotation.Nullable String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     */
    @javax.annotation.Nullable
    public String getToken() {
        return token;
    }

    public void setToken(@javax.annotation.Nullable String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeTokenRequest revokeTokenRequest = (RevokeTokenRequest) o;
        return Objects.equals(this.userIdentifier, revokeTokenRequest.userIdentifier)
                && Objects.equals(this.token, revokeTokenRequest.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIdentifier, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeTokenRequest {\n");
        sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
        openapiFields.add("token");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RevokeTokenRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RevokeTokenRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RevokeTokenRequest is not found in"
                                        + " the empty JSON string",
                                RevokeTokenRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RevokeTokenRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RevokeTokenRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("user_identifier") != null && !jsonObj.get("user_identifier").isJsonNull())
                && !jsonObj.get("user_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("user_identifier").toString()));
        }
        if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull())
                && !jsonObj.get("token").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `token` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("token").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RevokeTokenRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RevokeTokenRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RevokeTokenRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RevokeTokenRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RevokeTokenRequest>() {
                        @Override
                        public void write(JsonWriter out, RevokeTokenRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RevokeTokenRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RevokeTokenRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RevokeTokenRequest
     * @throws IOException if the JSON string is invalid with respect to RevokeTokenRequest
     */
    public static RevokeTokenRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RevokeTokenRequest.class);
    }

    /**
     * Convert an instance of RevokeTokenRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
