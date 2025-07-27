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
import com.google.gson.annotations.JsonAdapter;
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

/** GetCustomAccessTokenRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetCustomAccessTokenRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    @javax.annotation.Nonnull
    private String username;

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

    public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
    @javax.annotation.Nullable
    private String orgIdentifier;

    /** Indicates whether the specified attributes should be persisted or not. */
    @JsonAdapter(PersistOptionEnum.Adapter.class)
    public enum PersistOptionEnum {
        APPEND("APPEND"),

        NONE("NONE"),

        REPLACE("REPLACE"),

        RESET("RESET");

        private String value;

        PersistOptionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PersistOptionEnum fromValue(String value) {
            for (PersistOptionEnum b : PersistOptionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PersistOptionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PersistOptionEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PersistOptionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PersistOptionEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PersistOptionEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PERSIST_OPTION = "persist_option";

    @SerializedName(SERIALIZED_NAME_PERSIST_OPTION)
    @javax.annotation.Nonnull
    private PersistOptionEnum persistOption;

    public static final String SERIALIZED_NAME_FILTER_RULES = "filter_rules";

    @SerializedName(SERIALIZED_NAME_FILTER_RULES)
    @javax.annotation.Nullable
    private List<FilterRules> filterRules;

    public static final String SERIALIZED_NAME_PARAMETER_VALUES = "parameter_values";

    @SerializedName(SERIALIZED_NAME_PARAMETER_VALUES)
    @javax.annotation.Nullable
    private List<ParameterValues> parameterValues;

    public static final String SERIALIZED_NAME_OBJECTS = "objects";

    @SerializedName(SERIALIZED_NAME_OBJECTS)
    @javax.annotation.Nullable
    private List<TokenAccessScopeObject> objects;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @javax.annotation.Nullable
    private String email;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nullable
    private String displayName;

    public static final String SERIALIZED_NAME_GROUPS = "groups";

    @SerializedName(SERIALIZED_NAME_GROUPS)
    @javax.annotation.Nullable
    private List<GroupObject> groups;

    public static final String SERIALIZED_NAME_AUTO_CREATE = "auto_create";

    @SerializedName(SERIALIZED_NAME_AUTO_CREATE)
    @javax.annotation.Nullable
    private Boolean autoCreate = true;

    public GetCustomAccessTokenRequest() {}

    public GetCustomAccessTokenRequest username(@javax.annotation.Nonnull String username) {
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

    public GetCustomAccessTokenRequest password(@javax.annotation.Nullable String password) {
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

    public GetCustomAccessTokenRequest secretKey(@javax.annotation.Nullable String secretKey) {
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

    public GetCustomAccessTokenRequest validityTimeInSec(
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

    public GetCustomAccessTokenRequest orgIdentifier(
            @javax.annotation.Nullable String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
        return this;
    }

    /**
     * ID of the Org context to log in to. If the Org ID is not specified and secret key is provided
     * then user will be logged into the org corresponding to the secret key, and if secret key is
     * not provided then user will be logged in to the Org context of their previous login session.
     *
     * @return orgIdentifier
     */
    @javax.annotation.Nullable
    public String getOrgIdentifier() {
        return orgIdentifier;
    }

    public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
    }

    public GetCustomAccessTokenRequest persistOption(
            @javax.annotation.Nonnull PersistOptionEnum persistOption) {
        this.persistOption = persistOption;
        return this;
    }

    /**
     * Indicates whether the specified attributes should be persisted or not.
     *
     * @return persistOption
     */
    @javax.annotation.Nonnull
    public PersistOptionEnum getPersistOption() {
        return persistOption;
    }

    public void setPersistOption(@javax.annotation.Nonnull PersistOptionEnum persistOption) {
        this.persistOption = persistOption;
    }

    public GetCustomAccessTokenRequest filterRules(
            @javax.annotation.Nullable List<FilterRules> filterRules) {
        this.filterRules = filterRules;
        return this;
    }

    public GetCustomAccessTokenRequest addFilterRulesItem(FilterRules filterRulesItem) {
        if (this.filterRules == null) {
            this.filterRules = new ArrayList<>();
        }
        this.filterRules.add(filterRulesItem);
        return this;
    }

    /**
     * Filter rules.
     *
     * @return filterRules
     */
    @javax.annotation.Nullable
    public List<FilterRules> getFilterRules() {
        return filterRules;
    }

    public void setFilterRules(@javax.annotation.Nullable List<FilterRules> filterRules) {
        this.filterRules = filterRules;
    }

    public GetCustomAccessTokenRequest parameterValues(
            @javax.annotation.Nullable List<ParameterValues> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    public GetCustomAccessTokenRequest addParameterValuesItem(ParameterValues parameterValuesItem) {
        if (this.parameterValues == null) {
            this.parameterValues = new ArrayList<>();
        }
        this.parameterValues.add(parameterValuesItem);
        return this;
    }

    /**
     * Parameter values.
     *
     * @return parameterValues
     */
    @javax.annotation.Nullable
    public List<ParameterValues> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(
            @javax.annotation.Nullable List<ParameterValues> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public GetCustomAccessTokenRequest objects(
            @javax.annotation.Nullable List<TokenAccessScopeObject> objects) {
        this.objects = objects;
        return this;
    }

    public GetCustomAccessTokenRequest addObjectsItem(TokenAccessScopeObject objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    /**
     * Objects on which the filter rules and parameters values should be applied to
     *
     * @return objects
     */
    @javax.annotation.Nullable
    public List<TokenAccessScopeObject> getObjects() {
        return objects;
    }

    public void setObjects(@javax.annotation.Nullable List<TokenAccessScopeObject> objects) {
        this.objects = objects;
    }

    public GetCustomAccessTokenRequest email(@javax.annotation.Nullable String email) {
        this.email = email;
        return this;
    }

    /**
     * (just-in-time (JIT) provisioning)Email address of the user. Specify this attribute when
     * creating a new user.
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

    public GetCustomAccessTokenRequest displayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * (just-in-time (JIT) provisioning) Indicates display name of the user. Specify this attribute
     * when creating a new user.
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

    public GetCustomAccessTokenRequest groups(@javax.annotation.Nullable List<GroupObject> groups) {
        this.groups = groups;
        return this;
    }

    public GetCustomAccessTokenRequest addGroupsItem(GroupObject groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * (just-in-time (JIT) provisioning) ID or name of the groups to which the newly created user
     * belongs. Specify this attribute when creating a new user.
     *
     * @return groups
     */
    @javax.annotation.Nullable
    public List<GroupObject> getGroups() {
        return groups;
    }

    public void setGroups(@javax.annotation.Nullable List<GroupObject> groups) {
        this.groups = groups;
    }

    public GetCustomAccessTokenRequest autoCreate(@javax.annotation.Nullable Boolean autoCreate) {
        this.autoCreate = autoCreate;
        return this;
    }

    /**
     * Creates a new user if the specified username does not exist in ThoughtSpot. To provision a
     * user just-in-time (JIT), set this attribute to true. Note: For JIT provisioning of a user,
     * the secret_key is required. Version: 10.5.0.cl or later
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCustomAccessTokenRequest getCustomAccessTokenRequest = (GetCustomAccessTokenRequest) o;
        return Objects.equals(this.username, getCustomAccessTokenRequest.username)
                && Objects.equals(this.password, getCustomAccessTokenRequest.password)
                && Objects.equals(this.secretKey, getCustomAccessTokenRequest.secretKey)
                && Objects.equals(
                        this.validityTimeInSec, getCustomAccessTokenRequest.validityTimeInSec)
                && Objects.equals(this.orgIdentifier, getCustomAccessTokenRequest.orgIdentifier)
                && Objects.equals(this.persistOption, getCustomAccessTokenRequest.persistOption)
                && Objects.equals(this.filterRules, getCustomAccessTokenRequest.filterRules)
                && Objects.equals(this.parameterValues, getCustomAccessTokenRequest.parameterValues)
                && Objects.equals(this.objects, getCustomAccessTokenRequest.objects)
                && Objects.equals(this.email, getCustomAccessTokenRequest.email)
                && Objects.equals(this.displayName, getCustomAccessTokenRequest.displayName)
                && Objects.equals(this.groups, getCustomAccessTokenRequest.groups)
                && Objects.equals(this.autoCreate, getCustomAccessTokenRequest.autoCreate);
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
                password,
                secretKey,
                validityTimeInSec,
                orgIdentifier,
                persistOption,
                filterRules,
                parameterValues,
                objects,
                email,
                displayName,
                groups,
                autoCreate);
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
        sb.append("class GetCustomAccessTokenRequest {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    validityTimeInSec: ")
                .append(toIndentedString(validityTimeInSec))
                .append("\n");
        sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
        sb.append("    persistOption: ").append(toIndentedString(persistOption)).append("\n");
        sb.append("    filterRules: ").append(toIndentedString(filterRules)).append("\n");
        sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    autoCreate: ").append(toIndentedString(autoCreate)).append("\n");
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
        openapiFields.add("secret_key");
        openapiFields.add("validity_time_in_sec");
        openapiFields.add("org_identifier");
        openapiFields.add("persist_option");
        openapiFields.add("filter_rules");
        openapiFields.add("parameter_values");
        openapiFields.add("objects");
        openapiFields.add("email");
        openapiFields.add("display_name");
        openapiFields.add("groups");
        openapiFields.add("auto_create");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("username");
        openapiRequiredFields.add("persist_option");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetCustomAccessTokenRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetCustomAccessTokenRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetCustomAccessTokenRequest is not"
                                        + " found in the empty JSON string",
                                GetCustomAccessTokenRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetCustomAccessTokenRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GetCustomAccessTokenRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetCustomAccessTokenRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull())
                && !jsonObj.get("org_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("org_identifier").toString()));
        }
        if (!jsonObj.get("persist_option").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `persist_option` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("persist_option").toString()));
        }
        // validate the required field `persist_option`
        PersistOptionEnum.validateJsonElement(jsonObj.get("persist_option"));
        if (jsonObj.get("filter_rules") != null && !jsonObj.get("filter_rules").isJsonNull()) {
            JsonArray jsonArrayfilterRules = jsonObj.getAsJsonArray("filter_rules");
            if (jsonArrayfilterRules != null) {
                // ensure the json data is an array
                if (!jsonObj.get("filter_rules").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `filter_rules` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("filter_rules").toString()));
                }

                // validate the optional field `filter_rules` (array)
                for (int i = 0; i < jsonArrayfilterRules.size(); i++) {
                    FilterRules.validateJsonElement(jsonArrayfilterRules.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("parameter_values") != null
                && !jsonObj.get("parameter_values").isJsonNull()) {
            JsonArray jsonArrayparameterValues = jsonObj.getAsJsonArray("parameter_values");
            if (jsonArrayparameterValues != null) {
                // ensure the json data is an array
                if (!jsonObj.get("parameter_values").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `parameter_values` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("parameter_values").toString()));
                }

                // validate the optional field `parameter_values` (array)
                for (int i = 0; i < jsonArrayparameterValues.size(); i++) {
                    ParameterValues.validateJsonElement(jsonArrayparameterValues.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
            JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
            if (jsonArrayobjects != null) {
                // ensure the json data is an array
                if (!jsonObj.get("objects").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `objects` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("objects").toString()));
                }

                // validate the optional field `objects` (array)
                for (int i = 0; i < jsonArrayobjects.size(); i++) {
                    TokenAccessScopeObject.validateJsonElement(jsonArrayobjects.get(i));
                }
                ;
            }
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
        if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
            JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
            if (jsonArraygroups != null) {
                // ensure the json data is an array
                if (!jsonObj.get("groups").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `groups` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("groups").toString()));
                }

                // validate the optional field `groups` (array)
                for (int i = 0; i < jsonArraygroups.size(); i++) {
                    GroupObject.validateJsonElement(jsonArraygroups.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetCustomAccessTokenRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetCustomAccessTokenRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCustomAccessTokenRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GetCustomAccessTokenRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetCustomAccessTokenRequest>() {
                        @Override
                        public void write(JsonWriter out, GetCustomAccessTokenRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetCustomAccessTokenRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetCustomAccessTokenRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetCustomAccessTokenRequest
     * @throws IOException if the JSON string is invalid with respect to GetCustomAccessTokenRequest
     */
    public static GetCustomAccessTokenRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetCustomAccessTokenRequest.class);
    }

    /**
     * Convert an instance of GetCustomAccessTokenRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
