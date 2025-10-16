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

/** AuthorType */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AuthorType implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @javax.annotation.Nullable
    private String email;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    @javax.annotation.Nullable
    private String username;

    public AuthorType() {}

    public AuthorType email(@javax.annotation.Nullable String email) {
        this.email = email;
        return this;
    }

    /**
     * Email id of the committer
     *
     * @return email
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@javax.annotation.Nullable String email) {
        this.email = email;
    }

    public AuthorType username(@javax.annotation.Nullable String username) {
        this.username = username;
        return this;
    }

    /**
     * Username of the committer
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
        AuthorType authorType = (AuthorType) o;
        return Objects.equals(this.email, authorType.email)
                && Objects.equals(this.username, authorType.username);
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
        return Objects.hash(email, username);
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
        sb.append("class AuthorType {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
        openapiFields.add("email");
        openapiFields.add("username");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AuthorType
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AuthorType.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AuthorType is not found in the empty"
                                        + " JSON string",
                                AuthorType.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AuthorType.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AuthorType` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
                && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
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
            if (!AuthorType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AuthorType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AuthorType> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AuthorType.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AuthorType>() {
                        @Override
                        public void write(JsonWriter out, AuthorType value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AuthorType read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AuthorType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AuthorType
     * @throws IOException if the JSON string is invalid with respect to AuthorType
     */
    public static AuthorType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AuthorType.class);
    }

    /**
     * Convert an instance of AuthorType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
