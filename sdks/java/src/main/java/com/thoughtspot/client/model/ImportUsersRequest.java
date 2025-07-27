/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ImportUsersRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ImportUsersRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USERS = "users";

    @SerializedName(SERIALIZED_NAME_USERS)
    @javax.annotation.Nonnull
    private List<ImportUser> users;

    public static final String SERIALIZED_NAME_DEFAULT_PASSWORD = "default_password";

    @SerializedName(SERIALIZED_NAME_DEFAULT_PASSWORD)
    @javax.annotation.Nullable
    private String defaultPassword;

    public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    @javax.annotation.Nullable
    private Boolean dryRun = true;

    public static final String SERIALIZED_NAME_DELETE_UNSPECIFIED_USERS =
            "delete_unspecified_users";

    @SerializedName(SERIALIZED_NAME_DELETE_UNSPECIFIED_USERS)
    @javax.annotation.Nullable
    private Boolean deleteUnspecifiedUsers = false;

    public ImportUsersRequest() {}

    public ImportUsersRequest users(@javax.annotation.Nonnull List<ImportUser> users) {
        this.users = users;
        return this;
    }

    public ImportUsersRequest addUsersItem(ImportUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * List of users needs to be imported.
     *
     * @return users
     */
    @javax.annotation.Nonnull
    public List<ImportUser> getUsers() {
        return users;
    }

    public void setUsers(@javax.annotation.Nonnull List<ImportUser> users) {
        this.users = users;
    }

    public ImportUsersRequest defaultPassword(@javax.annotation.Nullable String defaultPassword) {
        this.defaultPassword = defaultPassword;
        return this;
    }

    /**
     * The default password to assign to users if they do not have a password assigned in
     * ThoughtSpot.
     *
     * @return defaultPassword
     */
    @javax.annotation.Nullable
    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(@javax.annotation.Nullable String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public ImportUsersRequest dryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * If true, the API performs a test operation and returns user IDs whose data will be edited
     * after the import.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public ImportUsersRequest deleteUnspecifiedUsers(
            @javax.annotation.Nullable Boolean deleteUnspecifiedUsers) {
        this.deleteUnspecifiedUsers = deleteUnspecifiedUsers;
        return this;
    }

    /**
     * If set to true, removes the users that are not specified in the API request.
     *
     * @return deleteUnspecifiedUsers
     */
    @javax.annotation.Nullable
    public Boolean getDeleteUnspecifiedUsers() {
        return deleteUnspecifiedUsers;
    }

    public void setDeleteUnspecifiedUsers(
            @javax.annotation.Nullable Boolean deleteUnspecifiedUsers) {
        this.deleteUnspecifiedUsers = deleteUnspecifiedUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportUsersRequest importUsersRequest = (ImportUsersRequest) o;
        return Objects.equals(this.users, importUsersRequest.users)
                && Objects.equals(this.defaultPassword, importUsersRequest.defaultPassword)
                && Objects.equals(this.dryRun, importUsersRequest.dryRun)
                && Objects.equals(
                        this.deleteUnspecifiedUsers, importUsersRequest.deleteUnspecifiedUsers);
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
        return Objects.hash(users, defaultPassword, dryRun, deleteUnspecifiedUsers);
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
        sb.append("class ImportUsersRequest {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    defaultPassword: ").append(toIndentedString(defaultPassword)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    deleteUnspecifiedUsers: ")
                .append(toIndentedString(deleteUnspecifiedUsers))
                .append("\n");
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
        openapiFields.add("users");
        openapiFields.add("default_password");
        openapiFields.add("dry_run");
        openapiFields.add("delete_unspecified_users");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("users");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ImportUsersRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImportUsersRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImportUsersRequest is not found in"
                                        + " the empty JSON string",
                                ImportUsersRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ImportUsersRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ImportUsersRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ImportUsersRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `users` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("users").toString()));
        }

        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        // validate the required field `users` (array)
        for (int i = 0; i < jsonArrayusers.size(); i++) {
            ImportUser.validateJsonElement(jsonArrayusers.get(i));
        }
        ;
        if ((jsonObj.get("default_password") != null
                        && !jsonObj.get("default_password").isJsonNull())
                && !jsonObj.get("default_password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `default_password` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("default_password").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImportUsersRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImportUsersRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportUsersRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImportUsersRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImportUsersRequest>() {
                        @Override
                        public void write(JsonWriter out, ImportUsersRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ImportUsersRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ImportUsersRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImportUsersRequest
     * @throws IOException if the JSON string is invalid with respect to ImportUsersRequest
     */
    public static ImportUsersRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImportUsersRequest.class);
    }

    /**
     * Convert an instance of ImportUsersRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
