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

/** WebhookAuthOAuth2Input */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookAuthOAuth2Input implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AUTHORIZATION_URL = "authorization_url";

    @SerializedName(SERIALIZED_NAME_AUTHORIZATION_URL)
    @javax.annotation.Nonnull
    private String authorizationUrl;

    public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";

    @SerializedName(SERIALIZED_NAME_CLIENT_ID)
    @javax.annotation.Nonnull
    private String clientId;

    public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";

    @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
    @javax.annotation.Nonnull
    private String clientSecret;

    public WebhookAuthOAuth2Input() {}

    public WebhookAuthOAuth2Input authorizationUrl(
            @javax.annotation.Nonnull String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }

    /**
     * OAuth2 authorization server URL.
     *
     * @return authorizationUrl
     */
    @javax.annotation.Nonnull
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public void setAuthorizationUrl(@javax.annotation.Nonnull String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public WebhookAuthOAuth2Input clientId(@javax.annotation.Nonnull String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * OAuth2 client identifier.
     *
     * @return clientId
     */
    @javax.annotation.Nonnull
    public String getClientId() {
        return clientId;
    }

    public void setClientId(@javax.annotation.Nonnull String clientId) {
        this.clientId = clientId;
    }

    public WebhookAuthOAuth2Input clientSecret(@javax.annotation.Nonnull String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * OAuth2 client secret key.
     *
     * @return clientSecret
     */
    @javax.annotation.Nonnull
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(@javax.annotation.Nonnull String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookAuthOAuth2Input webhookAuthOAuth2Input = (WebhookAuthOAuth2Input) o;
        return Objects.equals(this.authorizationUrl, webhookAuthOAuth2Input.authorizationUrl)
                && Objects.equals(this.clientId, webhookAuthOAuth2Input.clientId)
                && Objects.equals(this.clientSecret, webhookAuthOAuth2Input.clientSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationUrl, clientId, clientSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookAuthOAuth2Input {\n");
        sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
        openapiFields.add("authorization_url");
        openapiFields.add("client_id");
        openapiFields.add("client_secret");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("authorization_url");
        openapiRequiredFields.add("client_id");
        openapiRequiredFields.add("client_secret");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookAuthOAuth2Input
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookAuthOAuth2Input.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookAuthOAuth2Input is not found"
                                        + " in the empty JSON string",
                                WebhookAuthOAuth2Input.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!WebhookAuthOAuth2Input.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `WebhookAuthOAuth2Input` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookAuthOAuth2Input.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("authorization_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `authorization_url` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("authorization_url").toString()));
        }
        if (!jsonObj.get("client_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `client_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("client_id").toString()));
        }
        if (!jsonObj.get("client_secret").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `client_secret` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("client_secret").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookAuthOAuth2Input.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookAuthOAuth2Input' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookAuthOAuth2Input> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookAuthOAuth2Input.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookAuthOAuth2Input>() {
                        @Override
                        public void write(JsonWriter out, WebhookAuthOAuth2Input value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WebhookAuthOAuth2Input read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WebhookAuthOAuth2Input given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookAuthOAuth2Input
     * @throws IOException if the JSON string is invalid with respect to WebhookAuthOAuth2Input
     */
    public static WebhookAuthOAuth2Input fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookAuthOAuth2Input.class);
    }

    /**
     * Convert an instance of WebhookAuthOAuth2Input to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
