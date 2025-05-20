/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
import org.thoughtspot.client.JSON;

/** GetObjectAccessTokenRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetObjectAccessTokenRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    @javax.annotation.Nonnull
    private String username;

    public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";

    @SerializedName(SERIALIZED_NAME_OBJECT_ID)
    @javax.annotation.Nullable
    private String objectId;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    @javax.annotation.Nullable
    private String password = "";

    public static final String SERIALIZED_NAME_SECRET_KEY = "secret_key";

    @SerializedName(SERIALIZED_NAME_SECRET_KEY)
    @javax.annotation.Nullable
    private String secretKey = "";

    public static final String SERIALIZED_NAME_VALIDITY_TIME_IN_SEC = "validity_time_in_sec";

    @SerializedName(SERIALIZED_NAME_VALIDITY_TIME_IN_SEC)
    @javax.annotation.Nullable
    private Integer validityTimeInSec = 300;

    public static final String SERIALIZED_NAME_ORG_ID = "org_id";

    @SerializedName(SERIALIZED_NAME_ORG_ID)
    @javax.annotation.Nullable
    private Integer orgId;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @javax.annotation.Nullable
    private String email;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nullable
    private String displayName;

    public static final String SERIALIZED_NAME_AUTO_CREATE = "auto_create";

    @SerializedName(SERIALIZED_NAME_AUTO_CREATE)
    @javax.annotation.Nullable
    private Boolean autoCreate = false;

    public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";

    @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> groupIdentifiers;

    public GetObjectAccessTokenRequest() {}

    public GetObjectAccessTokenRequest username(@javax.annotation.Nonnull String username) {
        this.username = username;
        return this;
    }

    /**
     * Username of the ThoughtSpot user. The username is stored in the &#x60;name&#x60; attribute of
     * the user object.
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

    public GetObjectAccessTokenRequest objectId(@javax.annotation.Nullable String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * GUID of the ThoughtSpot metadata object that the user can access. The bearer will only have
     * access to the object specified in the API request.
     *
     * @return objectId
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(@javax.annotation.Nullable String objectId) {
        this.objectId = objectId;
    }

    public GetObjectAccessTokenRequest password(@javax.annotation.Nullable String password) {
        this.password = password;
        return this;
    }

    /**
     * Password of the user account
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

    public GetObjectAccessTokenRequest secretKey(@javax.annotation.Nullable String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a
     * secret key when Trusted authentication is enabled.
     *
     * @return secretKey
     */
    @javax.annotation.Nullable
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(@javax.annotation.Nullable String secretKey) {
        this.secretKey = secretKey;
    }

    public GetObjectAccessTokenRequest validityTimeInSec(
            @javax.annotation.Nullable Integer validityTimeInSec) {
        this.validityTimeInSec = validityTimeInSec;
        return this;
    }

    /**
     * Token validity duration in seconds
     *
     * @return validityTimeInSec
     */
    @javax.annotation.Nullable
    public Integer getValidityTimeInSec() {
        return validityTimeInSec;
    }

    public void setValidityTimeInSec(@javax.annotation.Nullable Integer validityTimeInSec) {
        this.validityTimeInSec = validityTimeInSec;
    }

    public GetObjectAccessTokenRequest orgId(@javax.annotation.Nullable Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * ID of the Org context to log in to. If the Org ID is not specified and secret key is provided
     * then user will be logged into the org corresponding to the secret key, and if secret key is
     * not provided then user will be logged in to the Org context of their previous login session.
     *
     * @return orgId
     */
    @javax.annotation.Nullable
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(@javax.annotation.Nullable Integer orgId) {
        this.orgId = orgId;
    }

    public GetObjectAccessTokenRequest email(@javax.annotation.Nullable String email) {
        this.email = email;
        return this;
    }

    /**
     * Email address of the user. Specify this attribute when creating a new user (just-in-time
     * (JIT) provisioning).
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

    public GetObjectAccessTokenRequest displayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the user. Specify this attribute when creating a new user (just-in-time (JIT)
     * provisioning).
     *
     * @return displayName
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
    }

    public GetObjectAccessTokenRequest autoCreate(@javax.annotation.Nullable Boolean autoCreate) {
        this.autoCreate = autoCreate;
        return this;
    }

    /**
     * Creates a new user if the specified username does not exist in ThoughtSpot. To provision a
     * user just-in-time (JIT), set this attribute to true. Note: For JIT provisioning of a user,
     * the secret_key is required.
     *
     * @return autoCreate
     */
    @javax.annotation.Nullable
    public Boolean getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(@javax.annotation.Nullable Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    public GetObjectAccessTokenRequest groupIdentifiers(
            @javax.annotation.Nullable List<String> groupIdentifiers) {
        this.groupIdentifiers = groupIdentifiers;
        return this;
    }

    public GetObjectAccessTokenRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
        if (this.groupIdentifiers == null) {
            this.groupIdentifiers = new ArrayList<>();
        }
        this.groupIdentifiers.add(groupIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the groups to which you want to assign the new user. You can specify
     * this attribute to dynamically assign privileges during just-in-time (JIT) provisioning.
     *
     * @return groupIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getGroupIdentifiers() {
        return groupIdentifiers;
    }

    public void setGroupIdentifiers(@javax.annotation.Nullable List<String> groupIdentifiers) {
        this.groupIdentifiers = groupIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetObjectAccessTokenRequest getObjectAccessTokenRequest = (GetObjectAccessTokenRequest) o;
        return Objects.equals(this.username, getObjectAccessTokenRequest.username)
                && Objects.equals(this.objectId, getObjectAccessTokenRequest.objectId)
                && Objects.equals(this.password, getObjectAccessTokenRequest.password)
                && Objects.equals(this.secretKey, getObjectAccessTokenRequest.secretKey)
                && Objects.equals(
                        this.validityTimeInSec, getObjectAccessTokenRequest.validityTimeInSec)
                && Objects.equals(this.orgId, getObjectAccessTokenRequest.orgId)
                && Objects.equals(this.email, getObjectAccessTokenRequest.email)
                && Objects.equals(this.displayName, getObjectAccessTokenRequest.displayName)
                && Objects.equals(this.autoCreate, getObjectAccessTokenRequest.autoCreate)
                && Objects.equals(
                        this.groupIdentifiers, getObjectAccessTokenRequest.groupIdentifiers);
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
        return Objects.hash(
                username,
                objectId,
                password,
                secretKey,
                validityTimeInSec,
                orgId,
                email,
                displayName,
                autoCreate,
                groupIdentifiers);
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
        sb.append("class GetObjectAccessTokenRequest {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    validityTimeInSec: ")
                .append(toIndentedString(validityTimeInSec))
                .append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    autoCreate: ").append(toIndentedString(autoCreate)).append("\n");
        sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
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
        openapiFields.add("object_id");
        openapiFields.add("password");
        openapiFields.add("secret_key");
        openapiFields.add("validity_time_in_sec");
        openapiFields.add("org_id");
        openapiFields.add("email");
        openapiFields.add("display_name");
        openapiFields.add("auto_create");
        openapiFields.add("group_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("username");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetObjectAccessTokenRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetObjectAccessTokenRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetObjectAccessTokenRequest is not"
                                        + " found in the empty JSON string",
                                GetObjectAccessTokenRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetObjectAccessTokenRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GetObjectAccessTokenRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetObjectAccessTokenRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("object_id") != null && !jsonObj.get("object_id").isJsonNull())
                && !jsonObj.get("object_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `object_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("object_id").toString()));
        }
        if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull())
                && !jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `password` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("password").toString()));
        }
        if ((jsonObj.get("secret_key") != null && !jsonObj.get("secret_key").isJsonNull())
                && !jsonObj.get("secret_key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `secret_key` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("secret_key").toString()));
        }
        if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
                && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
        if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull())
                && !jsonObj.get("display_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("display_name").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("group_identifiers") != null
                && !jsonObj.get("group_identifiers").isJsonNull()
                && !jsonObj.get("group_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `group_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("group_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetObjectAccessTokenRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetObjectAccessTokenRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetObjectAccessTokenRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GetObjectAccessTokenRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetObjectAccessTokenRequest>() {
                        @Override
                        public void write(JsonWriter out, GetObjectAccessTokenRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetObjectAccessTokenRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetObjectAccessTokenRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetObjectAccessTokenRequest
     * @throws IOException if the JSON string is invalid with respect to GetObjectAccessTokenRequest
     */
    public static GetObjectAccessTokenRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetObjectAccessTokenRequest.class);
    }

    /**
     * Convert an instance of GetObjectAccessTokenRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
