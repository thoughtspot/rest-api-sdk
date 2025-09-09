/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** UpdateUserGroupRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateUserGroupRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DEFAULT_LIVEBOARD_IDENTIFIERS =
            "default_liveboard_identifiers";

    @SerializedName(SERIALIZED_NAME_DEFAULT_LIVEBOARD_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> defaultLiveboardIdentifiers;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nullable
    private String displayName;

    /** Gets or Sets privileges */
    @JsonAdapter(PrivilegesEnum.Adapter.class)
    public enum PrivilegesEnum {
        ADMINISTRATION("ADMINISTRATION"),

        AUTHORING("AUTHORING"),

        USERDATAUPLOADING("USERDATAUPLOADING"),

        DATADOWNLOADING("DATADOWNLOADING"),

        USERMANAGEMENT("USERMANAGEMENT"),

        DATAMANAGEMENT("DATAMANAGEMENT"),

        SHAREWITHALL("SHAREWITHALL"),

        JOBSCHEDULING("JOBSCHEDULING"),

        A3_ANALYSIS("A3ANALYSIS"),

        BYPASSRLS("BYPASSRLS"),

        RANALYSIS("RANALYSIS"),

        DEVELOPER("DEVELOPER"),

        USER_ADMINISTRATION("USER_ADMINISTRATION"),

        GROUP_ADMINISTRATION("GROUP_ADMINISTRATION"),

        SYNCMANAGEMENT("SYNCMANAGEMENT"),

        CAN_CREATE_CATALOG("CAN_CREATE_CATALOG"),

        DISABLE_PINBOARD_CREATION("DISABLE_PINBOARD_CREATION"),

        LIVEBOARD_VERIFIER("LIVEBOARD_VERIFIER"),

        PREVIEW_THOUGHTSPOT_SAGE("PREVIEW_THOUGHTSPOT_SAGE"),

        CAN_MANAGE_VERSION_CONTROL("CAN_MANAGE_VERSION_CONTROL"),

        THIRDPARTY_ANALYSIS("THIRDPARTY_ANALYSIS"),

        ALLOW_NON_EMBED_FULL_APP_ACCESS("ALLOW_NON_EMBED_FULL_APP_ACCESS"),

        CAN_ACCESS_ANALYST_STUDIO("CAN_ACCESS_ANALYST_STUDIO"),

        CAN_MANAGE_ANALYST_STUDIO("CAN_MANAGE_ANALYST_STUDIO"),

        PREVIEW_DOCUMENT_SEARCH("PREVIEW_DOCUMENT_SEARCH"),

        CAN_SETUP_VERSION_CONTROL("CAN_SETUP_VERSION_CONTROL");

        private String value;

        PrivilegesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PrivilegesEnum fromValue(String value) {
            for (PrivilegesEnum b : PrivilegesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PrivilegesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PrivilegesEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PrivilegesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PrivilegesEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PrivilegesEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";

    @SerializedName(SERIALIZED_NAME_PRIVILEGES)
    @javax.annotation.Nullable
    private List<PrivilegesEnum> privileges;

    public static final String SERIALIZED_NAME_SUB_GROUP_IDENTIFIERS = "sub_group_identifiers";

    @SerializedName(SERIALIZED_NAME_SUB_GROUP_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> subGroupIdentifiers;

    /** Type of the group */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        LOCAL_GROUP("LOCAL_GROUP"),

        LDAP_GROUP("LDAP_GROUP");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nullable
    private TypeEnum type;

    public static final String SERIALIZED_NAME_USER_IDENTIFIERS = "user_identifiers";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> userIdentifiers;

    /**
     * Visibility of the group. To make a group visible to other users and groups, set the
     * visibility to SHAREABLE.
     */
    @JsonAdapter(VisibilityEnum.Adapter.class)
    public enum VisibilityEnum {
        SHARABLE("SHARABLE"),

        NON_SHARABLE("NON_SHARABLE");

        private String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<VisibilityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VisibilityEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            VisibilityEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VISIBILITY = "visibility";

    @SerializedName(SERIALIZED_NAME_VISIBILITY)
    @javax.annotation.Nullable
    private VisibilityEnum visibility;

    public static final String SERIALIZED_NAME_ROLE_IDENTIFIERS = "role_identifiers";

    @SerializedName(SERIALIZED_NAME_ROLE_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> roleIdentifiers;

    /** Type of update operation. Default operation type is REPLACE */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE"),

        REPLACE("REPLACE");

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperationEnum fromValue(String value) {
            for (OperationEnum b : OperationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OperationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OperationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OperationEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OperationEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OPERATION = "operation";

    @SerializedName(SERIALIZED_NAME_OPERATION)
    @javax.annotation.Nullable
    private OperationEnum operation = OperationEnum.REPLACE;

    public UpdateUserGroupRequest() {}

    public UpdateUserGroupRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the group to modify.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public UpdateUserGroupRequest defaultLiveboardIdentifiers(
            @javax.annotation.Nullable List<String> defaultLiveboardIdentifiers) {
        this.defaultLiveboardIdentifiers = defaultLiveboardIdentifiers;
        return this;
    }

    public UpdateUserGroupRequest addDefaultLiveboardIdentifiersItem(
            String defaultLiveboardIdentifiersItem) {
        if (this.defaultLiveboardIdentifiers == null) {
            this.defaultLiveboardIdentifiers = new ArrayList<>();
        }
        this.defaultLiveboardIdentifiers.add(defaultLiveboardIdentifiersItem);
        return this;
    }

    /**
     * ID of the Liveboards to be assigned as default Liveboards to the users in the group.
     *
     * @return defaultLiveboardIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getDefaultLiveboardIdentifiers() {
        return defaultLiveboardIdentifiers;
    }

    public void setDefaultLiveboardIdentifiers(
            @javax.annotation.Nullable List<String> defaultLiveboardIdentifiers) {
        this.defaultLiveboardIdentifiers = defaultLiveboardIdentifiers;
    }

    public UpdateUserGroupRequest description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description for the group.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public UpdateUserGroupRequest displayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the group.
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

    public UpdateUserGroupRequest privileges(
            @javax.annotation.Nullable List<PrivilegesEnum> privileges) {
        this.privileges = privileges;
        return this;
    }

    public UpdateUserGroupRequest addPrivilegesItem(PrivilegesEnum privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Privileges to assign to the group.
     *
     * @return privileges
     */
    @javax.annotation.Nullable
    public List<PrivilegesEnum> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(@javax.annotation.Nullable List<PrivilegesEnum> privileges) {
        this.privileges = privileges;
    }

    public UpdateUserGroupRequest subGroupIdentifiers(
            @javax.annotation.Nullable List<String> subGroupIdentifiers) {
        this.subGroupIdentifiers = subGroupIdentifiers;
        return this;
    }

    public UpdateUserGroupRequest addSubGroupIdentifiersItem(String subGroupIdentifiersItem) {
        if (this.subGroupIdentifiers == null) {
            this.subGroupIdentifiers = new ArrayList<>();
        }
        this.subGroupIdentifiers.add(subGroupIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
     *
     * @return subGroupIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getSubGroupIdentifiers() {
        return subGroupIdentifiers;
    }

    public void setSubGroupIdentifiers(
            @javax.annotation.Nullable List<String> subGroupIdentifiers) {
        this.subGroupIdentifiers = subGroupIdentifiers;
    }

    public UpdateUserGroupRequest type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the group
     *
     * @return type
     */
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
    }

    public UpdateUserGroupRequest userIdentifiers(
            @javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
        return this;
    }

    public UpdateUserGroupRequest addUserIdentifiersItem(String userIdentifiersItem) {
        if (this.userIdentifiers == null) {
            this.userIdentifiers = new ArrayList<>();
        }
        this.userIdentifiers.add(userIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of the users to assign to the group.
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

    public UpdateUserGroupRequest visibility(@javax.annotation.Nullable VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of the group. To make a group visible to other users and groups, set the
     * visibility to SHAREABLE.
     *
     * @return visibility
     */
    @javax.annotation.Nullable
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(@javax.annotation.Nullable VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public UpdateUserGroupRequest roleIdentifiers(
            @javax.annotation.Nullable List<String> roleIdentifiers) {
        this.roleIdentifiers = roleIdentifiers;
        return this;
    }

    public UpdateUserGroupRequest addRoleIdentifiersItem(String roleIdentifiersItem) {
        if (this.roleIdentifiers == null) {
            this.roleIdentifiers = new ArrayList<>();
        }
        this.roleIdentifiers.add(roleIdentifiersItem);
        return this;
    }

    /**
     * Role identifiers of the Roles that should be assigned to the group.
     *
     * @return roleIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getRoleIdentifiers() {
        return roleIdentifiers;
    }

    public void setRoleIdentifiers(@javax.annotation.Nullable List<String> roleIdentifiers) {
        this.roleIdentifiers = roleIdentifiers;
    }

    public UpdateUserGroupRequest operation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Type of update operation. Default operation type is REPLACE
     *
     * @return operation
     */
    @javax.annotation.Nullable
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserGroupRequest updateUserGroupRequest = (UpdateUserGroupRequest) o;
        return Objects.equals(this.name, updateUserGroupRequest.name)
                && Objects.equals(
                        this.defaultLiveboardIdentifiers,
                        updateUserGroupRequest.defaultLiveboardIdentifiers)
                && Objects.equals(this.description, updateUserGroupRequest.description)
                && Objects.equals(this.displayName, updateUserGroupRequest.displayName)
                && Objects.equals(this.privileges, updateUserGroupRequest.privileges)
                && Objects.equals(
                        this.subGroupIdentifiers, updateUserGroupRequest.subGroupIdentifiers)
                && Objects.equals(this.type, updateUserGroupRequest.type)
                && Objects.equals(this.userIdentifiers, updateUserGroupRequest.userIdentifiers)
                && Objects.equals(this.visibility, updateUserGroupRequest.visibility)
                && Objects.equals(this.roleIdentifiers, updateUserGroupRequest.roleIdentifiers)
                && Objects.equals(this.operation, updateUserGroupRequest.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                defaultLiveboardIdentifiers,
                description,
                displayName,
                privileges,
                subGroupIdentifiers,
                type,
                userIdentifiers,
                visibility,
                roleIdentifiers,
                operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserGroupRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultLiveboardIdentifiers: ")
                .append(toIndentedString(defaultLiveboardIdentifiers))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    subGroupIdentifiers: ")
                .append(toIndentedString(subGroupIdentifiers))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    roleIdentifiers: ").append(toIndentedString(roleIdentifiers)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("default_liveboard_identifiers");
        openapiFields.add("description");
        openapiFields.add("display_name");
        openapiFields.add("privileges");
        openapiFields.add("sub_group_identifiers");
        openapiFields.add("type");
        openapiFields.add("user_identifiers");
        openapiFields.add("visibility");
        openapiFields.add("role_identifiers");
        openapiFields.add("operation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateUserGroupRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateUserGroupRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateUserGroupRequest is not found"
                                        + " in the empty JSON string",
                                UpdateUserGroupRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateUserGroupRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateUserGroupRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("default_liveboard_identifiers") != null
                && !jsonObj.get("default_liveboard_identifiers").isJsonNull()
                && !jsonObj.get("default_liveboard_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `default_liveboard_identifiers` to be an array in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("default_liveboard_identifiers").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
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
        if (jsonObj.get("privileges") != null
                && !jsonObj.get("privileges").isJsonNull()
                && !jsonObj.get("privileges").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `privileges` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("privileges").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("sub_group_identifiers") != null
                && !jsonObj.get("sub_group_identifiers").isJsonNull()
                && !jsonObj.get("sub_group_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sub_group_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sub_group_identifiers").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the optional field `type`
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
            TypeEnum.validateJsonElement(jsonObj.get("type"));
        }
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
        if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull())
                && !jsonObj.get("visibility").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visibility` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("visibility").toString()));
        }
        // validate the optional field `visibility`
        if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) {
            VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("role_identifiers") != null
                && !jsonObj.get("role_identifiers").isJsonNull()
                && !jsonObj.get("role_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `role_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("role_identifiers").toString()));
        }
        if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull())
                && !jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the optional field `operation`
        if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
            OperationEnum.validateJsonElement(jsonObj.get("operation"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateUserGroupRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateUserGroupRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateUserGroupRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateUserGroupRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateUserGroupRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateUserGroupRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateUserGroupRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateUserGroupRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateUserGroupRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateUserGroupRequest
     */
    public static UpdateUserGroupRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateUserGroupRequest.class);
    }

    /**
     * Convert an instance of UpdateUserGroupRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
