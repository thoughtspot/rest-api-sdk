/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2GroupUpdateRequest type.
 */
public class TspublicRestV2GroupUpdateRequest {
    private String name;
    private String id;
    private String displayName;
    private UpdateGroupVisibilityEnum visibility;
    private String description;
    private List<UpdateGroupPrivilegesEnum> privileges;
    private List<GroupNameAndIDInput> groups;
    private List<UserNameAndIDInput> users;
    private List<String> assignedLiveboards;
    private UpdateGroupTypeEnum type;

    /**
     * Default constructor.
     */
    public TspublicRestV2GroupUpdateRequest() {
        visibility = UpdateGroupVisibilityEnum.DEFAULT;
        type = UpdateGroupTypeEnum.LOCAL_GROUP;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  displayName  String value for displayName.
     * @param  visibility  UpdateGroupVisibilityEnum value for visibility.
     * @param  description  String value for description.
     * @param  privileges  List of UpdateGroupPrivilegesEnum value for privileges.
     * @param  groups  List of GroupNameAndIDInput value for groups.
     * @param  users  List of UserNameAndIDInput value for users.
     * @param  assignedLiveboards  List of String value for assignedLiveboards.
     * @param  type  UpdateGroupTypeEnum value for type.
     */
    public TspublicRestV2GroupUpdateRequest(
            String name,
            String id,
            String displayName,
            UpdateGroupVisibilityEnum visibility,
            String description,
            List<UpdateGroupPrivilegesEnum> privileges,
            List<GroupNameAndIDInput> groups,
            List<UserNameAndIDInput> users,
            List<String> assignedLiveboards,
            UpdateGroupTypeEnum type) {
        this.name = name;
        this.id = id;
        this.displayName = displayName;
        this.visibility = visibility;
        this.description = description;
        this.privileges = privileges;
        this.groups = groups;
        this.users = users;
        this.assignedLiveboards = assignedLiveboards;
        this.type = type;
    }

    /**
     * Getter for Name.
     * Name of the user group
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the user group
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * GUID of the group to update
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the group to update
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for DisplayName.
     * A unique display name string for the user group, for example, Developer group.
     * @return Returns the String
     */
    @JsonGetter("displayName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * A unique display name string for the user group, for example, Developer group.
     * @param displayName Value for String
     */
    @JsonSetter("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for Visibility.
     * Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT
     * attribute makes the user group visible for other user groups and allows them to share
     * objects.
     * @return Returns the UpdateGroupVisibilityEnum
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateGroupVisibilityEnum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT
     * attribute makes the user group visible for other user groups and allows them to share
     * objects.
     * @param visibility Value for UpdateGroupVisibilityEnum
     */
    @JsonSetter("visibility")
    public void setVisibility(UpdateGroupVisibilityEnum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Description.
     * Description text for the group.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description text for the group.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Privileges.
     * A JSON array of privileges assigned to the group
     * @return Returns the List of UpdateGroupPrivilegesEnum
     */
    @JsonGetter("privileges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UpdateGroupPrivilegesEnum> getPrivileges() {
        return privileges;
    }

    /**
     * Setter for Privileges.
     * A JSON array of privileges assigned to the group
     * @param privileges Value for List of UpdateGroupPrivilegesEnum
     */
    @JsonSetter("privileges")
    public void setPrivileges(List<UpdateGroupPrivilegesEnum> privileges) {
        this.privileges = privileges;
    }

    /**
     * Getter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @return Returns the List of GroupNameAndIDInput
     */
    @JsonGetter("groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GroupNameAndIDInput> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @param groups Value for List of GroupNameAndIDInput
     */
    @JsonSetter("groups")
    public void setGroups(List<GroupNameAndIDInput> groups) {
        this.groups = groups;
    }

    /**
     * Getter for Users.
     * A JSON array of name of users or GUIDs of users or both. When both are given then id is
     * considered
     * @return Returns the List of UserNameAndIDInput
     */
    @JsonGetter("users")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserNameAndIDInput> getUsers() {
        return users;
    }

    /**
     * Setter for Users.
     * A JSON array of name of users or GUIDs of users or both. When both are given then id is
     * considered
     * @param users Value for List of UserNameAndIDInput
     */
    @JsonSetter("users")
    public void setUsers(List<UserNameAndIDInput> users) {
        this.users = users;
    }

    /**
     * Getter for AssignedLiveboards.
     * An array of liveboard ids to be assigned to the group.
     * @return Returns the List of String
     */
    @JsonGetter("assignedLiveboards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getAssignedLiveboards() {
        return assignedLiveboards;
    }

    /**
     * Setter for AssignedLiveboards.
     * An array of liveboard ids to be assigned to the group.
     * @param assignedLiveboards Value for List of String
     */
    @JsonSetter("assignedLiveboards")
    public void setAssignedLiveboards(List<String> assignedLiveboards) {
        this.assignedLiveboards = assignedLiveboards;
    }

    /**
     * Getter for Type.
     * Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot
     * system.
     * @return Returns the UpdateGroupTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateGroupTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot
     * system.
     * @param type Value for UpdateGroupTypeEnum
     */
    @JsonSetter("type")
    public void setType(UpdateGroupTypeEnum type) {
        this.type = type;
    }

    /**
     * Converts this TspublicRestV2GroupUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2GroupUpdateRequest [" + "name=" + name + ", id=" + id
                + ", displayName=" + displayName + ", visibility=" + visibility + ", description="
                + description + ", privileges=" + privileges + ", groups=" + groups + ", users="
                + users + ", assignedLiveboards=" + assignedLiveboards + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2GroupUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2GroupUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .displayName(getDisplayName())
                .visibility(getVisibility())
                .description(getDescription())
                .privileges(getPrivileges())
                .groups(getGroups())
                .users(getUsers())
                .assignedLiveboards(getAssignedLiveboards())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2GroupUpdateRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private String displayName;
        private UpdateGroupVisibilityEnum visibility = UpdateGroupVisibilityEnum.DEFAULT;
        private String description;
        private List<UpdateGroupPrivilegesEnum> privileges;
        private List<GroupNameAndIDInput> groups;
        private List<UserNameAndIDInput> users;
        private List<String> assignedLiveboards;
        private UpdateGroupTypeEnum type = UpdateGroupTypeEnum.LOCAL_GROUP;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for displayName.
         * @param  displayName  String value for displayName.
         * @return Builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setter for visibility.
         * @param  visibility  UpdateGroupVisibilityEnum value for visibility.
         * @return Builder
         */
        public Builder visibility(UpdateGroupVisibilityEnum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for privileges.
         * @param  privileges  List of UpdateGroupPrivilegesEnum value for privileges.
         * @return Builder
         */
        public Builder privileges(List<UpdateGroupPrivilegesEnum> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Setter for groups.
         * @param  groups  List of GroupNameAndIDInput value for groups.
         * @return Builder
         */
        public Builder groups(List<GroupNameAndIDInput> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Setter for users.
         * @param  users  List of UserNameAndIDInput value for users.
         * @return Builder
         */
        public Builder users(List<UserNameAndIDInput> users) {
            this.users = users;
            return this;
        }

        /**
         * Setter for assignedLiveboards.
         * @param  assignedLiveboards  List of String value for assignedLiveboards.
         * @return Builder
         */
        public Builder assignedLiveboards(List<String> assignedLiveboards) {
            this.assignedLiveboards = assignedLiveboards;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  UpdateGroupTypeEnum value for type.
         * @return Builder
         */
        public Builder type(UpdateGroupTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2GroupUpdateRequest} object using the set fields.
         * @return {@link TspublicRestV2GroupUpdateRequest}
         */
        public TspublicRestV2GroupUpdateRequest build() {
            return new TspublicRestV2GroupUpdateRequest(name, id, displayName, visibility,
                    description, privileges, groups, users, assignedLiveboards, type);
        }
    }
}
