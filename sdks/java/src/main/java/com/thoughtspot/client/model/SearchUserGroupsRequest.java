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

/** SearchUserGroupsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchUserGroupsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";

    @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
    @javax.annotation.Nullable
    private String namePattern;

    public static final String SERIALIZED_NAME_GROUP_IDENTIFIER = "group_identifier";

    @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIER)
    @javax.annotation.Nullable
    private String groupIdentifier;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> orgIdentifiers;

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

        EXPERIMENTALFEATUREPRIVILEGE("EXPERIMENTALFEATUREPRIVILEGE"),

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

        APPLICATION_ADMINISTRATION("APPLICATION_ADMINISTRATION"),

        SYSTEM_INFO_ADMINISTRATION("SYSTEM_INFO_ADMINISTRATION"),

        ORG_ADMINISTRATION("ORG_ADMINISTRATION"),

        ROLE_ADMINISTRATION("ROLE_ADMINISTRATION"),

        AUTHENTICATION_ADMINISTRATION("AUTHENTICATION_ADMINISTRATION"),

        BILLING_INFO_ADMINISTRATION("BILLING_INFO_ADMINISTRATION"),

        CAN_MANAGE_CUSTOM_CALENDAR("CAN_MANAGE_CUSTOM_CALENDAR"),

        CAN_CREATE_OR_EDIT_CONNECTIONS("CAN_CREATE_OR_EDIT_CONNECTIONS"),

        CAN_MANAGE_WORKSHEET_VIEWS_TABLES("CAN_MANAGE_WORKSHEET_VIEWS_TABLES"),

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

    /** Group type. */
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

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 10;

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private SortOptions sortOptions;

    public SearchUserGroupsRequest() {}

    public SearchUserGroupsRequest defaultLiveboardIdentifiers(
            @javax.annotation.Nullable List<String> defaultLiveboardIdentifiers) {
        this.defaultLiveboardIdentifiers = defaultLiveboardIdentifiers;
        return this;
    }

    public SearchUserGroupsRequest addDefaultLiveboardIdentifiersItem(
            String defaultLiveboardIdentifiersItem) {
        if (this.defaultLiveboardIdentifiers == null) {
            this.defaultLiveboardIdentifiers = new ArrayList<>();
        }
        this.defaultLiveboardIdentifiers.add(defaultLiveboardIdentifiersItem);
        return this;
    }

    /**
     * GUID of Liveboards that are assigned as default Liveboards to the users in the group.
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

    public SearchUserGroupsRequest description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the group
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

    public SearchUserGroupsRequest displayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the group
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

    public SearchUserGroupsRequest namePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    /**
     * A pattern to match case-insensitive name of the Group object.
     *
     * @return namePattern
     */
    @javax.annotation.Nullable
    public String getNamePattern() {
        return namePattern;
    }

    public void setNamePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
    }

    public SearchUserGroupsRequest groupIdentifier(
            @javax.annotation.Nullable String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
        return this;
    }

    /**
     * GUID or name of the group
     *
     * @return groupIdentifier
     */
    @javax.annotation.Nullable
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    public void setGroupIdentifier(@javax.annotation.Nullable String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    public SearchUserGroupsRequest orgIdentifiers(
            @javax.annotation.Nullable List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
        return this;
    }

    public SearchUserGroupsRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
        if (this.orgIdentifiers == null) {
            this.orgIdentifiers = new ArrayList<>();
        }
        this.orgIdentifiers.add(orgIdentifiersItem);
        return this;
    }

    /**
     * ID or name of the Org to which the group belongs
     *
     * @return orgIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getOrgIdentifiers() {
        return orgIdentifiers;
    }

    public void setOrgIdentifiers(@javax.annotation.Nullable List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
    }

    public SearchUserGroupsRequest privileges(
            @javax.annotation.Nullable List<PrivilegesEnum> privileges) {
        this.privileges = privileges;
        return this;
    }

    public SearchUserGroupsRequest addPrivilegesItem(PrivilegesEnum privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Privileges assigned to the group.
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

    public SearchUserGroupsRequest subGroupIdentifiers(
            @javax.annotation.Nullable List<String> subGroupIdentifiers) {
        this.subGroupIdentifiers = subGroupIdentifiers;
        return this;
    }

    public SearchUserGroupsRequest addSubGroupIdentifiersItem(String subGroupIdentifiersItem) {
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

    public SearchUserGroupsRequest type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Group type.
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

    public SearchUserGroupsRequest userIdentifiers(
            @javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
        return this;
    }

    public SearchUserGroupsRequest addUserIdentifiersItem(String userIdentifiersItem) {
        if (this.userIdentifiers == null) {
            this.userIdentifiers = new ArrayList<>();
        }
        this.userIdentifiers.add(userIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of the users assigned to the group.
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

    public SearchUserGroupsRequest visibility(
            @javax.annotation.Nullable VisibilityEnum visibility) {
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

    public SearchUserGroupsRequest roleIdentifiers(
            @javax.annotation.Nullable List<String> roleIdentifiers) {
        this.roleIdentifiers = roleIdentifiers;
        return this;
    }

    public SearchUserGroupsRequest addRoleIdentifiersItem(String roleIdentifiersItem) {
        if (this.roleIdentifiers == null) {
            this.roleIdentifiers = new ArrayList<>();
        }
        this.roleIdentifiers.add(roleIdentifiersItem);
        return this;
    }

    /**
     * Filter groups with a list of Roles assigned to a group
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

    public SearchUserGroupsRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public SearchUserGroupsRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included.
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    public SearchUserGroupsRequest sortOptions(@javax.annotation.Nullable SortOptions sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort options to filter group details.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public SortOptions getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(@javax.annotation.Nullable SortOptions sortOptions) {
        this.sortOptions = sortOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchUserGroupsRequest searchUserGroupsRequest = (SearchUserGroupsRequest) o;
        return Objects.equals(
                        this.defaultLiveboardIdentifiers,
                        searchUserGroupsRequest.defaultLiveboardIdentifiers)
                && Objects.equals(this.description, searchUserGroupsRequest.description)
                && Objects.equals(this.displayName, searchUserGroupsRequest.displayName)
                && Objects.equals(this.namePattern, searchUserGroupsRequest.namePattern)
                && Objects.equals(this.groupIdentifier, searchUserGroupsRequest.groupIdentifier)
                && Objects.equals(this.orgIdentifiers, searchUserGroupsRequest.orgIdentifiers)
                && Objects.equals(this.privileges, searchUserGroupsRequest.privileges)
                && Objects.equals(
                        this.subGroupIdentifiers, searchUserGroupsRequest.subGroupIdentifiers)
                && Objects.equals(this.type, searchUserGroupsRequest.type)
                && Objects.equals(this.userIdentifiers, searchUserGroupsRequest.userIdentifiers)
                && Objects.equals(this.visibility, searchUserGroupsRequest.visibility)
                && Objects.equals(this.roleIdentifiers, searchUserGroupsRequest.roleIdentifiers)
                && Objects.equals(this.recordOffset, searchUserGroupsRequest.recordOffset)
                && Objects.equals(this.recordSize, searchUserGroupsRequest.recordSize)
                && Objects.equals(this.sortOptions, searchUserGroupsRequest.sortOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultLiveboardIdentifiers,
                description,
                displayName,
                namePattern,
                groupIdentifier,
                orgIdentifiers,
                privileges,
                subGroupIdentifiers,
                type,
                userIdentifiers,
                visibility,
                roleIdentifiers,
                recordOffset,
                recordSize,
                sortOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchUserGroupsRequest {\n");
        sb.append("    defaultLiveboardIdentifiers: ")
                .append(toIndentedString(defaultLiveboardIdentifiers))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
        sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
        sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    subGroupIdentifiers: ")
                .append(toIndentedString(subGroupIdentifiers))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    roleIdentifiers: ").append(toIndentedString(roleIdentifiers)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
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
        openapiFields.add("default_liveboard_identifiers");
        openapiFields.add("description");
        openapiFields.add("display_name");
        openapiFields.add("name_pattern");
        openapiFields.add("group_identifier");
        openapiFields.add("org_identifiers");
        openapiFields.add("privileges");
        openapiFields.add("sub_group_identifiers");
        openapiFields.add("type");
        openapiFields.add("user_identifiers");
        openapiFields.add("visibility");
        openapiFields.add("role_identifiers");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("sort_options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SearchUserGroupsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchUserGroupsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchUserGroupsRequest is not found"
                                        + " in the empty JSON string",
                                SearchUserGroupsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchUserGroupsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchUserGroupsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull())
                && !jsonObj.get("name_pattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name_pattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("name_pattern").toString()));
        }
        if ((jsonObj.get("group_identifier") != null
                        && !jsonObj.get("group_identifier").isJsonNull())
                && !jsonObj.get("group_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `group_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("group_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("org_identifiers") != null
                && !jsonObj.get("org_identifiers").isJsonNull()
                && !jsonObj.get("org_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_identifiers").toString()));
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
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            SortOptions.validateJsonElement(jsonObj.get("sort_options"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchUserGroupsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchUserGroupsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchUserGroupsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchUserGroupsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchUserGroupsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchUserGroupsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchUserGroupsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchUserGroupsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchUserGroupsRequest
     * @throws IOException if the JSON string is invalid with respect to SearchUserGroupsRequest
     */
    public static SearchUserGroupsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchUserGroupsRequest.class);
    }

    /**
     * Convert an instance of SearchUserGroupsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
