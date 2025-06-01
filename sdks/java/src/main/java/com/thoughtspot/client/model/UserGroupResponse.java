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

/** UserGroupResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UserGroupResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";

    @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
    @javax.annotation.Nullable
    private String authorId;

    public static final String SERIALIZED_NAME_COMPLETE_DETAIL = "complete_detail";

    @SerializedName(SERIALIZED_NAME_COMPLETE_DETAIL)
    @javax.annotation.Nullable
    private Boolean completeDetail;

    public static final String SERIALIZED_NAME_CONTENT = "content";

    @SerializedName(SERIALIZED_NAME_CONTENT)
    @javax.annotation.Nullable
    private Object content;

    public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";

    @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float creationTimeInMillis;

    public static final String SERIALIZED_NAME_DEFAULT_LIVEBOARDS = "default_liveboards";

    @SerializedName(SERIALIZED_NAME_DEFAULT_LIVEBOARDS)
    @javax.annotation.Nullable
    private List<UserGroup> defaultLiveboards;

    public static final String SERIALIZED_NAME_DELETED = "deleted";

    @SerializedName(SERIALIZED_NAME_DELETED)
    @javax.annotation.Nullable
    private Boolean deleted;

    public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";

    @SerializedName(SERIALIZED_NAME_DEPRECATED)
    @javax.annotation.Nullable
    private Boolean deprecated;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nonnull
    private String displayName;

    public static final String SERIALIZED_NAME_EXTERNAL = "external";

    @SerializedName(SERIALIZED_NAME_EXTERNAL)
    @javax.annotation.Nullable
    private Boolean external;

    public static final String SERIALIZED_NAME_GENERATION_NUMBER = "generation_number";

    @SerializedName(SERIALIZED_NAME_GENERATION_NUMBER)
    @javax.annotation.Nullable
    private Integer generationNumber;

    public static final String SERIALIZED_NAME_HIDDEN = "hidden";

    @SerializedName(SERIALIZED_NAME_HIDDEN)
    @javax.annotation.Nullable
    private Boolean hidden;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    @javax.annotation.Nullable
    private Integer index;

    public static final String SERIALIZED_NAME_INDEX_VERSION = "index_version";

    @SerializedName(SERIALIZED_NAME_INDEX_VERSION)
    @javax.annotation.Nullable
    private Integer indexVersion;

    public static final String SERIALIZED_NAME_METADATA_VERSION = "metadata_version";

    @SerializedName(SERIALIZED_NAME_METADATA_VERSION)
    @javax.annotation.Nullable
    private Integer metadataVersion;

    public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS =
            "modification_time_in_millis";

    @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float modificationTimeInMillis;

    public static final String SERIALIZED_NAME_MODIFIER_ID = "modifier_id";

    @SerializedName(SERIALIZED_NAME_MODIFIER_ID)
    @javax.annotation.Nullable
    private String modifierId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_ORGS = "orgs";

    @SerializedName(SERIALIZED_NAME_ORGS)
    @javax.annotation.Nullable
    private List<UserGroup> orgs;

    public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";

    @SerializedName(SERIALIZED_NAME_OWNER_ID)
    @javax.annotation.Nullable
    private String ownerId;

    /** Parent type of the group. */
    @JsonAdapter(ParentTypeEnum.Adapter.class)
    public enum ParentTypeEnum {
        USER("USER"),

        GROUP("GROUP");

        private String value;

        ParentTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ParentTypeEnum fromValue(String value) {
            for (ParentTypeEnum b : ParentTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ParentTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ParentTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ParentTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ParentTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ParentTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PARENT_TYPE = "parent_type";

    @SerializedName(SERIALIZED_NAME_PARENT_TYPE)
    @javax.annotation.Nullable
    private ParentTypeEnum parentType;

    public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";

    @SerializedName(SERIALIZED_NAME_PRIVILEGES)
    @javax.annotation.Nullable
    private List<String> privileges;

    public static final String SERIALIZED_NAME_SUB_GROUPS = "sub_groups";

    @SerializedName(SERIALIZED_NAME_SUB_GROUPS)
    @javax.annotation.Nullable
    private List<UserGroup> subGroups;

    public static final String SERIALIZED_NAME_SYSTEM_GROUP = "system_group";

    @SerializedName(SERIALIZED_NAME_SYSTEM_GROUP)
    @javax.annotation.Nullable
    private Boolean systemGroup;

    public static final String SERIALIZED_NAME_TAGS = "tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    @javax.annotation.Nullable
    private List<UserGroup> tags;

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

    public static final String SERIALIZED_NAME_USERS = "users";

    @SerializedName(SERIALIZED_NAME_USERS)
    @javax.annotation.Nullable
    private List<UserGroup> users;

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
    @javax.annotation.Nonnull
    private VisibilityEnum visibility;

    public static final String SERIALIZED_NAME_ROLES = "roles";

    @SerializedName(SERIALIZED_NAME_ROLES)
    @javax.annotation.Nullable
    private List<Role> roles;

    public UserGroupResponse() {}

    public UserGroupResponse authorId(@javax.annotation.Nullable String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * The unique identifier of the object
     *
     * @return authorId
     */
    @javax.annotation.Nullable
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(@javax.annotation.Nullable String authorId) {
        this.authorId = authorId;
    }

    public UserGroupResponse completeDetail(@javax.annotation.Nullable Boolean completeDetail) {
        this.completeDetail = completeDetail;
        return this;
    }

    /**
     * Indicates whether the response has complete detail of the group.
     *
     * @return completeDetail
     */
    @javax.annotation.Nullable
    public Boolean getCompleteDetail() {
        return completeDetail;
    }

    public void setCompleteDetail(@javax.annotation.Nullable Boolean completeDetail) {
        this.completeDetail = completeDetail;
    }

    public UserGroupResponse content(@javax.annotation.Nullable Object content) {
        this.content = content;
        return this;
    }

    /**
     * Content details of the group
     *
     * @return content
     */
    @javax.annotation.Nullable
    public Object getContent() {
        return content;
    }

    public void setContent(@javax.annotation.Nullable Object content) {
        this.content = content;
    }

    public UserGroupResponse creationTimeInMillis(
            @javax.annotation.Nullable Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
        return this;
    }

    /**
     * Creation time of the group in milliseconds
     *
     * @return creationTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getCreationTimeInMillis() {
        return creationTimeInMillis;
    }

    public void setCreationTimeInMillis(@javax.annotation.Nullable Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    public UserGroupResponse defaultLiveboards(
            @javax.annotation.Nullable List<UserGroup> defaultLiveboards) {
        this.defaultLiveboards = defaultLiveboards;
        return this;
    }

    public UserGroupResponse addDefaultLiveboardsItem(UserGroup defaultLiveboardsItem) {
        if (this.defaultLiveboards == null) {
            this.defaultLiveboards = new ArrayList<>();
        }
        this.defaultLiveboards.add(defaultLiveboardsItem);
        return this;
    }

    /**
     * Liveboards that are assigned as default Liveboards to the group.
     *
     * @return defaultLiveboards
     */
    @javax.annotation.Nullable
    public List<UserGroup> getDefaultLiveboards() {
        return defaultLiveboards;
    }

    public void setDefaultLiveboards(@javax.annotation.Nullable List<UserGroup> defaultLiveboards) {
        this.defaultLiveboards = defaultLiveboards;
    }

    public UserGroupResponse deleted(@javax.annotation.Nullable Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Indicates whether the group is deleted
     *
     * @return deleted
     */
    @javax.annotation.Nullable
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(@javax.annotation.Nullable Boolean deleted) {
        this.deleted = deleted;
    }

    public UserGroupResponse deprecated(@javax.annotation.Nullable Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    /**
     * Indicates whether the group is deprecated
     *
     * @return deprecated
     */
    @javax.annotation.Nullable
    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(@javax.annotation.Nullable Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public UserGroupResponse description(@javax.annotation.Nullable String description) {
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

    public UserGroupResponse displayName(@javax.annotation.Nonnull String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the group.
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

    public UserGroupResponse external(@javax.annotation.Nullable Boolean external) {
        this.external = external;
        return this;
    }

    /**
     * Indicates whether the group is external
     *
     * @return external
     */
    @javax.annotation.Nullable
    public Boolean getExternal() {
        return external;
    }

    public void setExternal(@javax.annotation.Nullable Boolean external) {
        this.external = external;
    }

    public UserGroupResponse generationNumber(@javax.annotation.Nullable Integer generationNumber) {
        this.generationNumber = generationNumber;
        return this;
    }

    /**
     * Generation number of the group
     *
     * @return generationNumber
     */
    @javax.annotation.Nullable
    public Integer getGenerationNumber() {
        return generationNumber;
    }

    public void setGenerationNumber(@javax.annotation.Nullable Integer generationNumber) {
        this.generationNumber = generationNumber;
    }

    public UserGroupResponse hidden(@javax.annotation.Nullable Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * Indicates whether the group is hidden
     *
     * @return hidden
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(@javax.annotation.Nullable Boolean hidden) {
        this.hidden = hidden;
    }

    public UserGroupResponse id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the object
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public UserGroupResponse index(@javax.annotation.Nullable Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Index number of the group
     *
     * @return index
     */
    @javax.annotation.Nullable
    public Integer getIndex() {
        return index;
    }

    public void setIndex(@javax.annotation.Nullable Integer index) {
        this.index = index;
    }

    public UserGroupResponse indexVersion(@javax.annotation.Nullable Integer indexVersion) {
        this.indexVersion = indexVersion;
        return this;
    }

    /**
     * Index version number of the group
     *
     * @return indexVersion
     */
    @javax.annotation.Nullable
    public Integer getIndexVersion() {
        return indexVersion;
    }

    public void setIndexVersion(@javax.annotation.Nullable Integer indexVersion) {
        this.indexVersion = indexVersion;
    }

    public UserGroupResponse metadataVersion(@javax.annotation.Nullable Integer metadataVersion) {
        this.metadataVersion = metadataVersion;
        return this;
    }

    /**
     * Metadata version number of the group
     *
     * @return metadataVersion
     */
    @javax.annotation.Nullable
    public Integer getMetadataVersion() {
        return metadataVersion;
    }

    public void setMetadataVersion(@javax.annotation.Nullable Integer metadataVersion) {
        this.metadataVersion = metadataVersion;
    }

    public UserGroupResponse modificationTimeInMillis(
            @javax.annotation.Nullable Float modificationTimeInMillis) {
        this.modificationTimeInMillis = modificationTimeInMillis;
        return this;
    }

    /**
     * Last modified time of the group in milliseconds.
     *
     * @return modificationTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getModificationTimeInMillis() {
        return modificationTimeInMillis;
    }

    public void setModificationTimeInMillis(
            @javax.annotation.Nullable Float modificationTimeInMillis) {
        this.modificationTimeInMillis = modificationTimeInMillis;
    }

    public UserGroupResponse modifierId(@javax.annotation.Nullable String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * The unique identifier of the object
     *
     * @return modifierId
     */
    @javax.annotation.Nullable
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(@javax.annotation.Nullable String modifierId) {
        this.modifierId = modifierId;
    }

    public UserGroupResponse name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the group.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public UserGroupResponse orgs(@javax.annotation.Nullable List<UserGroup> orgs) {
        this.orgs = orgs;
        return this;
    }

    public UserGroupResponse addOrgsItem(UserGroup orgsItem) {
        if (this.orgs == null) {
            this.orgs = new ArrayList<>();
        }
        this.orgs.add(orgsItem);
        return this;
    }

    /**
     * Orgs in which group exists.
     *
     * @return orgs
     */
    @javax.annotation.Nullable
    public List<UserGroup> getOrgs() {
        return orgs;
    }

    public void setOrgs(@javax.annotation.Nullable List<UserGroup> orgs) {
        this.orgs = orgs;
    }

    public UserGroupResponse ownerId(@javax.annotation.Nullable String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The unique identifier of the object
     *
     * @return ownerId
     */
    @javax.annotation.Nullable
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(@javax.annotation.Nullable String ownerId) {
        this.ownerId = ownerId;
    }

    public UserGroupResponse parentType(@javax.annotation.Nullable ParentTypeEnum parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * Parent type of the group.
     *
     * @return parentType
     */
    @javax.annotation.Nullable
    public ParentTypeEnum getParentType() {
        return parentType;
    }

    public void setParentType(@javax.annotation.Nullable ParentTypeEnum parentType) {
        this.parentType = parentType;
    }

    public UserGroupResponse privileges(@javax.annotation.Nullable List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public UserGroupResponse addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Privileges which are assigned to the group
     *
     * @return privileges
     */
    @javax.annotation.Nullable
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(@javax.annotation.Nullable List<String> privileges) {
        this.privileges = privileges;
    }

    public UserGroupResponse subGroups(@javax.annotation.Nullable List<UserGroup> subGroups) {
        this.subGroups = subGroups;
        return this;
    }

    public UserGroupResponse addSubGroupsItem(UserGroup subGroupsItem) {
        if (this.subGroups == null) {
            this.subGroups = new ArrayList<>();
        }
        this.subGroups.add(subGroupsItem);
        return this;
    }

    /**
     * Groups who are part of the group
     *
     * @return subGroups
     */
    @javax.annotation.Nullable
    public List<UserGroup> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(@javax.annotation.Nullable List<UserGroup> subGroups) {
        this.subGroups = subGroups;
    }

    public UserGroupResponse systemGroup(@javax.annotation.Nullable Boolean systemGroup) {
        this.systemGroup = systemGroup;
        return this;
    }

    /**
     * Indicates whether the group is a system group.
     *
     * @return systemGroup
     */
    @javax.annotation.Nullable
    public Boolean getSystemGroup() {
        return systemGroup;
    }

    public void setSystemGroup(@javax.annotation.Nullable Boolean systemGroup) {
        this.systemGroup = systemGroup;
    }

    public UserGroupResponse tags(@javax.annotation.Nullable List<UserGroup> tags) {
        this.tags = tags;
        return this;
    }

    public UserGroupResponse addTagsItem(UserGroup tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Tags associated with the group.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<UserGroup> getTags() {
        return tags;
    }

    public void setTags(@javax.annotation.Nullable List<UserGroup> tags) {
        this.tags = tags;
    }

    public UserGroupResponse type(@javax.annotation.Nullable TypeEnum type) {
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

    public UserGroupResponse users(@javax.annotation.Nullable List<UserGroup> users) {
        this.users = users;
        return this;
    }

    public UserGroupResponse addUsersItem(UserGroup usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Users who are part of the group.
     *
     * @return users
     */
    @javax.annotation.Nullable
    public List<UserGroup> getUsers() {
        return users;
    }

    public void setUsers(@javax.annotation.Nullable List<UserGroup> users) {
        this.users = users;
    }

    public UserGroupResponse visibility(@javax.annotation.Nonnull VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and
     * thus allows them to share objects.
     *
     * @return visibility
     */
    @javax.annotation.Nonnull
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(@javax.annotation.Nonnull VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public UserGroupResponse roles(@javax.annotation.Nullable List<Role> roles) {
        this.roles = roles;
        return this;
    }

    public UserGroupResponse addRolesItem(Role rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * List of roles assgined to the user
     *
     * @return roles
     */
    @javax.annotation.Nullable
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(@javax.annotation.Nullable List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserGroupResponse userGroupResponse = (UserGroupResponse) o;
        return Objects.equals(this.authorId, userGroupResponse.authorId)
                && Objects.equals(this.completeDetail, userGroupResponse.completeDetail)
                && Objects.equals(this.content, userGroupResponse.content)
                && Objects.equals(this.creationTimeInMillis, userGroupResponse.creationTimeInMillis)
                && Objects.equals(this.defaultLiveboards, userGroupResponse.defaultLiveboards)
                && Objects.equals(this.deleted, userGroupResponse.deleted)
                && Objects.equals(this.deprecated, userGroupResponse.deprecated)
                && Objects.equals(this.description, userGroupResponse.description)
                && Objects.equals(this.displayName, userGroupResponse.displayName)
                && Objects.equals(this.external, userGroupResponse.external)
                && Objects.equals(this.generationNumber, userGroupResponse.generationNumber)
                && Objects.equals(this.hidden, userGroupResponse.hidden)
                && Objects.equals(this.id, userGroupResponse.id)
                && Objects.equals(this.index, userGroupResponse.index)
                && Objects.equals(this.indexVersion, userGroupResponse.indexVersion)
                && Objects.equals(this.metadataVersion, userGroupResponse.metadataVersion)
                && Objects.equals(
                        this.modificationTimeInMillis, userGroupResponse.modificationTimeInMillis)
                && Objects.equals(this.modifierId, userGroupResponse.modifierId)
                && Objects.equals(this.name, userGroupResponse.name)
                && Objects.equals(this.orgs, userGroupResponse.orgs)
                && Objects.equals(this.ownerId, userGroupResponse.ownerId)
                && Objects.equals(this.parentType, userGroupResponse.parentType)
                && Objects.equals(this.privileges, userGroupResponse.privileges)
                && Objects.equals(this.subGroups, userGroupResponse.subGroups)
                && Objects.equals(this.systemGroup, userGroupResponse.systemGroup)
                && Objects.equals(this.tags, userGroupResponse.tags)
                && Objects.equals(this.type, userGroupResponse.type)
                && Objects.equals(this.users, userGroupResponse.users)
                && Objects.equals(this.visibility, userGroupResponse.visibility)
                && Objects.equals(this.roles, userGroupResponse.roles);
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
                authorId,
                completeDetail,
                content,
                creationTimeInMillis,
                defaultLiveboards,
                deleted,
                deprecated,
                description,
                displayName,
                external,
                generationNumber,
                hidden,
                id,
                index,
                indexVersion,
                metadataVersion,
                modificationTimeInMillis,
                modifierId,
                name,
                orgs,
                ownerId,
                parentType,
                privileges,
                subGroups,
                systemGroup,
                tags,
                type,
                users,
                visibility,
                roles);
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
        sb.append("class UserGroupResponse {\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    completeDetail: ").append(toIndentedString(completeDetail)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    creationTimeInMillis: ")
                .append(toIndentedString(creationTimeInMillis))
                .append("\n");
        sb.append("    defaultLiveboards: ")
                .append(toIndentedString(defaultLiveboards))
                .append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    external: ").append(toIndentedString(external)).append("\n");
        sb.append("    generationNumber: ").append(toIndentedString(generationNumber)).append("\n");
        sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    indexVersion: ").append(toIndentedString(indexVersion)).append("\n");
        sb.append("    metadataVersion: ").append(toIndentedString(metadataVersion)).append("\n");
        sb.append("    modificationTimeInMillis: ")
                .append(toIndentedString(modificationTimeInMillis))
                .append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    subGroups: ").append(toIndentedString(subGroups)).append("\n");
        sb.append("    systemGroup: ").append(toIndentedString(systemGroup)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
        openapiFields.add("author_id");
        openapiFields.add("complete_detail");
        openapiFields.add("content");
        openapiFields.add("creation_time_in_millis");
        openapiFields.add("default_liveboards");
        openapiFields.add("deleted");
        openapiFields.add("deprecated");
        openapiFields.add("description");
        openapiFields.add("display_name");
        openapiFields.add("external");
        openapiFields.add("generation_number");
        openapiFields.add("hidden");
        openapiFields.add("id");
        openapiFields.add("index");
        openapiFields.add("index_version");
        openapiFields.add("metadata_version");
        openapiFields.add("modification_time_in_millis");
        openapiFields.add("modifier_id");
        openapiFields.add("name");
        openapiFields.add("orgs");
        openapiFields.add("owner_id");
        openapiFields.add("parent_type");
        openapiFields.add("privileges");
        openapiFields.add("sub_groups");
        openapiFields.add("system_group");
        openapiFields.add("tags");
        openapiFields.add("type");
        openapiFields.add("users");
        openapiFields.add("visibility");
        openapiFields.add("roles");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("display_name");
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("visibility");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UserGroupResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UserGroupResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UserGroupResponse is not found in the"
                                        + " empty JSON string",
                                UserGroupResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UserGroupResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UserGroupResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UserGroupResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull())
                && !jsonObj.get("author_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_id").toString()));
        }
        if (jsonObj.get("default_liveboards") != null
                && !jsonObj.get("default_liveboards").isJsonNull()) {
            JsonArray jsonArraydefaultLiveboards = jsonObj.getAsJsonArray("default_liveboards");
            if (jsonArraydefaultLiveboards != null) {
                // ensure the json data is an array
                if (!jsonObj.get("default_liveboards").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `default_liveboards` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("default_liveboards").toString()));
                }

                // validate the optional field `default_liveboards` (array)
                for (int i = 0; i < jsonArraydefaultLiveboards.size(); i++) {
                    UserGroup.validateJsonElement(jsonArraydefaultLiveboards.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if (!jsonObj.get("display_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("display_name").toString()));
        }
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if ((jsonObj.get("modifier_id") != null && !jsonObj.get("modifier_id").isJsonNull())
                && !jsonObj.get("modifier_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `modifier_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("modifier_id").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (jsonObj.get("orgs") != null && !jsonObj.get("orgs").isJsonNull()) {
            JsonArray jsonArrayorgs = jsonObj.getAsJsonArray("orgs");
            if (jsonArrayorgs != null) {
                // ensure the json data is an array
                if (!jsonObj.get("orgs").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `orgs` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("orgs").toString()));
                }

                // validate the optional field `orgs` (array)
                for (int i = 0; i < jsonArrayorgs.size(); i++) {
                    UserGroup.validateJsonElement(jsonArrayorgs.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonNull())
                && !jsonObj.get("owner_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `owner_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("owner_id").toString()));
        }
        if ((jsonObj.get("parent_type") != null && !jsonObj.get("parent_type").isJsonNull())
                && !jsonObj.get("parent_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `parent_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("parent_type").toString()));
        }
        // validate the optional field `parent_type`
        if (jsonObj.get("parent_type") != null && !jsonObj.get("parent_type").isJsonNull()) {
            ParentTypeEnum.validateJsonElement(jsonObj.get("parent_type"));
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
        if (jsonObj.get("sub_groups") != null && !jsonObj.get("sub_groups").isJsonNull()) {
            JsonArray jsonArraysubGroups = jsonObj.getAsJsonArray("sub_groups");
            if (jsonArraysubGroups != null) {
                // ensure the json data is an array
                if (!jsonObj.get("sub_groups").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `sub_groups` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("sub_groups").toString()));
                }

                // validate the optional field `sub_groups` (array)
                for (int i = 0; i < jsonArraysubGroups.size(); i++) {
                    UserGroup.validateJsonElement(jsonArraysubGroups.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("tags").toString()));
                }

                // validate the optional field `tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    UserGroup.validateJsonElement(jsonArraytags.get(i));
                }
                ;
            }
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
        if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
            JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
            if (jsonArrayusers != null) {
                // ensure the json data is an array
                if (!jsonObj.get("users").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `users` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("users").toString()));
                }

                // validate the optional field `users` (array)
                for (int i = 0; i < jsonArrayusers.size(); i++) {
                    UserGroup.validateJsonElement(jsonArrayusers.get(i));
                }
                ;
            }
        }
        if (!jsonObj.get("visibility").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visibility` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("visibility").toString()));
        }
        // validate the required field `visibility`
        VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
        if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
            JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
            if (jsonArrayroles != null) {
                // ensure the json data is an array
                if (!jsonObj.get("roles").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `roles` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("roles").toString()));
                }

                // validate the optional field `roles` (array)
                for (int i = 0; i < jsonArrayroles.size(); i++) {
                    Role.validateJsonElement(jsonArrayroles.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UserGroupResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UserGroupResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserGroupResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UserGroupResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UserGroupResponse>() {
                        @Override
                        public void write(JsonWriter out, UserGroupResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UserGroupResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UserGroupResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UserGroupResponse
     * @throws IOException if the JSON string is invalid with respect to UserGroupResponse
     */
    public static UserGroupResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UserGroupResponse.class);
    }

    /**
     * Convert an instance of UserGroupResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
