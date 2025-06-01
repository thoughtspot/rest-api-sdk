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

/**
 * Basic Auth: Basic authentication involves sending a verified username and password with your
 * request.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class BasicAuth implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    @javax.annotation.Nullable
    private String password;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    @javax.annotation.Nullable
    private String username;

    public BasicAuth() {}

    public BasicAuth password(@javax.annotation.Nullable String password) {
        this.password = password;
        return this;
    }

    /**
     * Password for the basic authentication
     *
     * @return password
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@javax.annotation.Nullable String password) {
        this.password = password;
    }

    public BasicAuth username(@javax.annotation.Nullable String username) {
        this.username = username;
        return this;
    }

    /**
     * Username for the basic authentication
     *
     * @return username
     */
    @javax.annotation.Nullable
    public String getUsername() {
        return username;
    }

    public void setUsername(@javax.annotation.Nullable String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasicAuth basicAuth = (BasicAuth) o;
        return Objects.equals(this.password, basicAuth.password)
                && Objects.equals(this.username, basicAuth.username);
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
        return Objects.hash(password, username);
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
        sb.append("class BasicAuth {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
        openapiFields.add("password");
        openapiFields.add("username");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to BasicAuth
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!BasicAuth.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in BasicAuth is not found in the empty"
                                        + " JSON string",
                                BasicAuth.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!BasicAuth.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `BasicAuth` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull())
                && !jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `password` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("password").toString()));
        }
        if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull())
                && !jsonObj.get("username").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `username` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("username").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BasicAuth.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BasicAuth' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BasicAuth> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(BasicAuth.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<BasicAuth>() {
                        @Override
                        public void write(JsonWriter out, BasicAuth value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public BasicAuth read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of BasicAuth given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BasicAuth
     * @throws IOException if the JSON string is invalid with respect to BasicAuth
     */
    public static BasicAuth fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, BasicAuth.class);
    }

    /**
     * Convert an instance of BasicAuth to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
