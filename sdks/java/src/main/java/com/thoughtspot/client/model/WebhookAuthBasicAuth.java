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

/** WebhookAuthBasicAuth */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookAuthBasicAuth implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    @javax.annotation.Nonnull
    private String username;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    @javax.annotation.Nonnull
    private String password;

    public WebhookAuthBasicAuth() {}

    public WebhookAuthBasicAuth username(@javax.annotation.Nonnull String username) {
        this.username = username;
        return this;
    }

    /**
     * Username for basic authentication.
     *
     * @return username
     */
    @javax.annotation.Nonnull
    public String getUsername() {
        return username;
    }

    public void setUsername(@javax.annotation.Nonnull String username) {
        this.username = username;
    }

    public WebhookAuthBasicAuth password(@javax.annotation.Nonnull String password) {
        this.password = password;
        return this;
    }

    /**
     * Password for basic authentication.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookAuthBasicAuth webhookAuthBasicAuth = (WebhookAuthBasicAuth) o;
        return Objects.equals(this.username, webhookAuthBasicAuth.username)
                && Objects.equals(this.password, webhookAuthBasicAuth.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookAuthBasicAuth {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
        openapiFields.add("username");
        openapiFields.add("password");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("username");
        openapiRequiredFields.add("password");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookAuthBasicAuth
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookAuthBasicAuth.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookAuthBasicAuth is not found in"
                                        + " the empty JSON string",
                                WebhookAuthBasicAuth.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!WebhookAuthBasicAuth.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `WebhookAuthBasicAuth` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookAuthBasicAuth.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("username").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `username` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("username").toString()));
        }
        if (!jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `password` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("password").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookAuthBasicAuth.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookAuthBasicAuth' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookAuthBasicAuth> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookAuthBasicAuth.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookAuthBasicAuth>() {
                        @Override
                        public void write(JsonWriter out, WebhookAuthBasicAuth value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WebhookAuthBasicAuth read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WebhookAuthBasicAuth given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookAuthBasicAuth
     * @throws IOException if the JSON string is invalid with respect to WebhookAuthBasicAuth
     */
    public static WebhookAuthBasicAuth fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookAuthBasicAuth.class);
    }

    /**
     * Convert an instance of WebhookAuthBasicAuth to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
