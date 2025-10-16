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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Authorization type for the custom action. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AuthenticationInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AP_I_KEY = "API_Key";

    @SerializedName(SERIALIZED_NAME_AP_I_KEY)
    @javax.annotation.Nullable
    private APIKeyInput apIKey;

    public static final String SERIALIZED_NAME_BASIC_AUTH = "Basic_Auth";

    @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
    @javax.annotation.Nullable
    private BasicAuthInput basicAuth;

    public static final String SERIALIZED_NAME_BEARER_TOKEN = "Bearer_Token";

    @SerializedName(SERIALIZED_NAME_BEARER_TOKEN)
    @javax.annotation.Nullable
    private String bearerToken;

    public static final String SERIALIZED_NAME_NO_AUTH = "No_Auth";

    @SerializedName(SERIALIZED_NAME_NO_AUTH)
    @javax.annotation.Nullable
    private String noAuth;

    public AuthenticationInput() {}

    public AuthenticationInput apIKey(@javax.annotation.Nullable APIKeyInput apIKey) {
        this.apIKey = apIKey;
        return this;
    }

    /**
     * Get apIKey
     *
     * @return apIKey
     */
    @javax.annotation.Nullable
    public APIKeyInput getApIKey() {
        return apIKey;
    }

    public void setApIKey(@javax.annotation.Nullable APIKeyInput apIKey) {
        this.apIKey = apIKey;
    }

    public AuthenticationInput basicAuth(@javax.annotation.Nullable BasicAuthInput basicAuth) {
        this.basicAuth = basicAuth;
        return this;
    }

    /**
     * Get basicAuth
     *
     * @return basicAuth
     */
    @javax.annotation.Nullable
    public BasicAuthInput getBasicAuth() {
        return basicAuth;
    }

    public void setBasicAuth(@javax.annotation.Nullable BasicAuthInput basicAuth) {
        this.basicAuth = basicAuth;
    }

    public AuthenticationInput bearerToken(@javax.annotation.Nullable String bearerToken) {
        this.bearerToken = bearerToken;
        return this;
    }

    /**
     * Bearer tokens enable requests to authenticate using an access key.
     *
     * @return bearerToken
     */
    @javax.annotation.Nullable
    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(@javax.annotation.Nullable String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public AuthenticationInput noAuth(@javax.annotation.Nullable String noAuth) {
        this.noAuth = noAuth;
        return this;
    }

    /**
     * No authorization. If your request doesn&#39;t require authorization.
     *
     * @return noAuth
     */
    @javax.annotation.Nullable
    public String getNoAuth() {
        return noAuth;
    }

    public void setNoAuth(@javax.annotation.Nullable String noAuth) {
        this.noAuth = noAuth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticationInput authenticationInput = (AuthenticationInput) o;
        return Objects.equals(this.apIKey, authenticationInput.apIKey)
                && Objects.equals(this.basicAuth, authenticationInput.basicAuth)
                && Objects.equals(this.bearerToken, authenticationInput.bearerToken)
                && Objects.equals(this.noAuth, authenticationInput.noAuth);
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
        return Objects.hash(apIKey, basicAuth, bearerToken, noAuth);
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
        sb.append("class AuthenticationInput {\n");
        sb.append("    apIKey: ").append(toIndentedString(apIKey)).append("\n");
        sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
        sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
        sb.append("    noAuth: ").append(toIndentedString(noAuth)).append("\n");
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
        openapiFields.add("API_Key");
        openapiFields.add("Basic_Auth");
        openapiFields.add("Bearer_Token");
        openapiFields.add("No_Auth");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AuthenticationInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AuthenticationInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AuthenticationInput is not found in"
                                        + " the empty JSON string",
                                AuthenticationInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AuthenticationInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AuthenticationInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `API_Key`
        if (jsonObj.get("API_Key") != null && !jsonObj.get("API_Key").isJsonNull()) {
            APIKeyInput.validateJsonElement(jsonObj.get("API_Key"));
        }
        // validate the optional field `Basic_Auth`
        if (jsonObj.get("Basic_Auth") != null && !jsonObj.get("Basic_Auth").isJsonNull()) {
            BasicAuthInput.validateJsonElement(jsonObj.get("Basic_Auth"));
        }
        if ((jsonObj.get("Bearer_Token") != null && !jsonObj.get("Bearer_Token").isJsonNull())
                && !jsonObj.get("Bearer_Token").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Bearer_Token` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Bearer_Token").toString()));
        }
        if ((jsonObj.get("No_Auth") != null && !jsonObj.get("No_Auth").isJsonNull())
                && !jsonObj.get("No_Auth").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `No_Auth` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("No_Auth").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AuthenticationInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AuthenticationInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AuthenticationInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AuthenticationInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AuthenticationInput>() {
                        @Override
                        public void write(JsonWriter out, AuthenticationInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AuthenticationInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AuthenticationInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AuthenticationInput
     * @throws IOException if the JSON string is invalid with respect to AuthenticationInput
     */
    public static AuthenticationInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AuthenticationInput.class);
    }

    /**
     * Convert an instance of AuthenticationInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
