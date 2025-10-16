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

/** ChangeUserPasswordRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ChangeUserPasswordRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CURRENT_PASSWORD = "current_password";

    @SerializedName(SERIALIZED_NAME_CURRENT_PASSWORD)
    @javax.annotation.Nonnull
    private String currentPassword;

    public static final String SERIALIZED_NAME_NEW_PASSWORD = "new_password";

    @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
    @javax.annotation.Nonnull
    private String newPassword;

    public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
    @javax.annotation.Nonnull
    private String userIdentifier;

    public ChangeUserPasswordRequest() {}

    public ChangeUserPasswordRequest currentPassword(
            @javax.annotation.Nonnull String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    /**
     * Current password of the user.
     *
     * @return currentPassword
     */
    @javax.annotation.Nonnull
    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(@javax.annotation.Nonnull String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public ChangeUserPasswordRequest newPassword(@javax.annotation.Nonnull String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * New password for the user.
     *
     * @return newPassword
     */
    @javax.annotation.Nonnull
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(@javax.annotation.Nonnull String newPassword) {
        this.newPassword = newPassword;
    }

    public ChangeUserPasswordRequest userIdentifier(
            @javax.annotation.Nonnull String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    /**
     * GUID or name of the user.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeUserPasswordRequest changeUserPasswordRequest = (ChangeUserPasswordRequest) o;
        return Objects.equals(this.currentPassword, changeUserPasswordRequest.currentPassword)
                && Objects.equals(this.newPassword, changeUserPasswordRequest.newPassword)
                && Objects.equals(this.userIdentifier, changeUserPasswordRequest.userIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPassword, newPassword, userIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeUserPasswordRequest {\n");
        sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
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
        openapiFields.add("current_password");
        openapiFields.add("new_password");
        openapiFields.add("user_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("current_password");
        openapiRequiredFields.add("new_password");
        openapiRequiredFields.add("user_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChangeUserPasswordRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChangeUserPasswordRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ChangeUserPasswordRequest is not"
                                        + " found in the empty JSON string",
                                ChangeUserPasswordRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ChangeUserPasswordRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ChangeUserPasswordRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ChangeUserPasswordRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("current_password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `current_password` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("current_password").toString()));
        }
        if (!jsonObj.get("new_password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `new_password` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("new_password").toString()));
        }
        if (!jsonObj.get("user_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("user_identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChangeUserPasswordRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChangeUserPasswordRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChangeUserPasswordRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ChangeUserPasswordRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ChangeUserPasswordRequest>() {
                        @Override
                        public void write(JsonWriter out, ChangeUserPasswordRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ChangeUserPasswordRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ChangeUserPasswordRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChangeUserPasswordRequest
     * @throws IOException if the JSON string is invalid with respect to ChangeUserPasswordRequest
     */
    public static ChangeUserPasswordRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChangeUserPasswordRequest.class);
    }

    /**
     * Convert an instance of ChangeUserPasswordRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
