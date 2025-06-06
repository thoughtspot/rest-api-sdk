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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ForceLogoutUsersRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ForceLogoutUsersRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USER_IDENTIFIERS = "user_identifiers";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> userIdentifiers;

    public ForceLogoutUsersRequest() {}

    public ForceLogoutUsersRequest userIdentifiers(
            @javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
        return this;
    }

    public ForceLogoutUsersRequest addUserIdentifiersItem(String userIdentifiersItem) {
        if (this.userIdentifiers == null) {
            this.userIdentifiers = new ArrayList<>();
        }
        this.userIdentifiers.add(userIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of the users for force logging out their sessions.
     *
     * @return userIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getUserIdentifiers() {
        return userIdentifiers;
    }

    public void setUserIdentifiers(@javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForceLogoutUsersRequest forceLogoutUsersRequest = (ForceLogoutUsersRequest) o;
        return Objects.equals(this.userIdentifiers, forceLogoutUsersRequest.userIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForceLogoutUsersRequest {\n");
        sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
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
        openapiFields.add("user_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ForceLogoutUsersRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ForceLogoutUsersRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ForceLogoutUsersRequest is not found"
                                        + " in the empty JSON string",
                                ForceLogoutUsersRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ForceLogoutUsersRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ForceLogoutUsersRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("user_identifiers") != null
                && !jsonObj.get("user_identifiers").isJsonNull()
                && !jsonObj.get("user_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("user_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ForceLogoutUsersRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ForceLogoutUsersRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ForceLogoutUsersRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ForceLogoutUsersRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ForceLogoutUsersRequest>() {
                        @Override
                        public void write(JsonWriter out, ForceLogoutUsersRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ForceLogoutUsersRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ForceLogoutUsersRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ForceLogoutUsersRequest
     * @throws IOException if the JSON string is invalid with respect to ForceLogoutUsersRequest
     */
    public static ForceLogoutUsersRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ForceLogoutUsersRequest.class);
    }

    /**
     * Convert an instance of ForceLogoutUsersRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
