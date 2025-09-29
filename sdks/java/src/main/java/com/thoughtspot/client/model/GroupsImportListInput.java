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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** GroupsImportListInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GroupsImportListInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nonnull
    private String displayName;

    public static final String SERIALIZED_NAME_GROUP_IDENTIFIER = "group_identifier";

    @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIER)
    @javax.annotation.Nonnull
    private String groupIdentifier;

    public static final String SERIALIZED_NAME_DEFAULT_LIVEBOARD_IDENTIFIERS =
            "default_liveboard_identifiers";

    @SerializedName(SERIALIZED_NAME_DEFAULT_LIVEBOARD_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> defaultLiveboardIdentifiers;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

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

    /** Type of the group. */
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
            return null;
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
     * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and
     * thus allows them to share objects.
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
            return null;
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

    public GroupsImportListInput() {}

    public GroupsImportListInput displayName(@javax.annotation.Nonnull String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Unique display name of the group.
     *
     * @return displayName
     */
    @javax.annotation.Nonnull
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@javax.annotation.Nonnull String displayName) {
        this.displayName = displayName;
    }

    public GroupsImportListInput groupIdentifier(@javax.annotation.Nonnull String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the group.
     *
     * @return groupIdentifier
     */
    @javax.annotation.Nonnull
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    public void setGroupIdentifier(@javax.annotation.Nonnull String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    public GroupsImportListInput defaultLiveboardIdentifiers(
            @javax.annotation.Nullable List<String> defaultLiveboardIdentifiers) {
        this.defaultLiveboardIdentifiers = defaultLiveboardIdentifiers;
        return this;
    }

    public GroupsImportListInput addDefaultLiveboardIdentifiersItem(
            String defaultLiveboardIdentifiersItem) {
        if (this.defaultLiveboardIdentifiers == null) {
            this.defaultLiveboardIdentifiers = new ArrayList<>();
        }
        this.defaultLiveboardIdentifiers.add(defaultLiveboardIdentifiersItem);
        return this;
    }

    /**
     * Unique ID of Liveboards that will be assigned as default Liveboards to the users in the
     * group.
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

    public GroupsImportListInput description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the group.
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

    public GroupsImportListInput privileges(
            @javax.annotation.Nullable List<PrivilegesEnum> privileges) {
        this.privileges = privileges;
        return this;
    }

    public GroupsImportListInput addPrivilegesItem(PrivilegesEnum privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Privileges that will be assigned to the group.
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

    public GroupsImportListInput subGroupIdentifiers(
            @javax.annotation.Nullable List<String> subGroupIdentifiers) {
        this.subGroupIdentifiers = subGroupIdentifiers;
        return this;
    }

    public GroupsImportListInput addSubGroupIdentifiersItem(String subGroupIdentifiersItem) {
        if (this.subGroupIdentifiers == null) {
            this.subGroupIdentifiers = new ArrayList<>();
        }
        this.subGroupIdentifiers.add(subGroupIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the sub-groups to add to the group.
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

    public GroupsImportListInput type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the group.
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

    public GroupsImportListInput userIdentifiers(
            @javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
        return this;
    }

    public GroupsImportListInput addUserIdentifiersItem(String userIdentifiersItem) {
        if (this.userIdentifiers == null) {
            this.userIdentifiers = new ArrayList<>();
        }
        this.userIdentifiers.add(userIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the users to assign to the group.
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

    public GroupsImportListInput visibility(@javax.annotation.Nullable VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and
     * thus allows them to share objects.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupsImportListInput groupsImportListInput = (GroupsImportListInput) o;
        return Objects.equals(this.displayName, groupsImportListInput.displayName)
                && Objects.equals(this.groupIdentifier, groupsImportListInput.groupIdentifier)
                && Objects.equals(
                        this.defaultLiveboardIdentifiers,
                        groupsImportListInput.defaultLiveboardIdentifiers)
                && Objects.equals(this.description, groupsImportListInput.description)
                && Objects.equals(this.privileges, groupsImportListInput.privileges)
                && Objects.equals(
                        this.subGroupIdentifiers, groupsImportListInput.subGroupIdentifiers)
                && Objects.equals(this.type, groupsImportListInput.type)
                && Objects.equals(this.userIdentifiers, groupsImportListInput.userIdentifiers)
                && Objects.equals(this.visibility, groupsImportListInput.visibility);
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
                displayName,
                groupIdentifier,
                defaultLiveboardIdentifiers,
                description,
                privileges,
                subGroupIdentifiers,
                type,
                userIdentifiers,
                visibility);
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
        sb.append("class GroupsImportListInput {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
        sb.append("    defaultLiveboardIdentifiers: ")
                .append(toIndentedString(defaultLiveboardIdentifiers))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    subGroupIdentifiers: ")
                .append(toIndentedString(subGroupIdentifiers))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
        openapiFields.add("display_name");
        openapiFields.add("group_identifier");
        openapiFields.add("default_liveboard_identifiers");
        openapiFields.add("description");
        openapiFields.add("privileges");
        openapiFields.add("sub_group_identifiers");
        openapiFields.add("type");
        openapiFields.add("user_identifiers");
        openapiFields.add("visibility");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("display_name");
        openapiRequiredFields.add("group_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GroupsImportListInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GroupsImportListInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GroupsImportListInput is not found in"
                                        + " the empty JSON string",
                                GroupsImportListInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GroupsImportListInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GroupsImportListInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GroupsImportListInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("display_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("display_name").toString()));
        }
        if (!jsonObj.get("group_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `group_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("group_identifier").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GroupsImportListInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GroupsImportListInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GroupsImportListInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GroupsImportListInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GroupsImportListInput>() {
                        @Override
                        public void write(JsonWriter out, GroupsImportListInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GroupsImportListInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GroupsImportListInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GroupsImportListInput
     * @throws IOException if the JSON string is invalid with respect to GroupsImportListInput
     */
    public static GroupsImportListInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GroupsImportListInput.class);
    }

    /**
     * Convert an instance of GroupsImportListInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
