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
 * This is a model class for TspublicRestV2UserSearchRequest type.
 */
public class TspublicRestV2UserSearchRequest {
    private List<String> outputFields;
    private String name;
    private String id;
    private String displayName;
    private SearchUsersVisibilityEnum visibility;
    private String mail;
    private List<GroupNameAndIDInput> groups;
    private List<SearchUsersPrivilegesEnum> privileges;
    private SearchUsersStateEnum state;
    private SearchUsersNotifyOnShareEnum notifyOnShare;
    private SearchUsersShowWalkMeEnum showWalkMe;
    private SearchUsersAnalystOnboardingCompleteEnum analystOnboardingComplete;
    private SearchUsersTypeEnum type;

    /**
     * Default constructor.
     */
    public TspublicRestV2UserSearchRequest() {
    }

    /**
     * Initialization constructor.
     * @param  outputFields  List of String value for outputFields.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  displayName  String value for displayName.
     * @param  visibility  SearchUsersVisibilityEnum value for visibility.
     * @param  mail  String value for mail.
     * @param  groups  List of GroupNameAndIDInput value for groups.
     * @param  privileges  List of SearchUsersPrivilegesEnum value for privileges.
     * @param  state  SearchUsersStateEnum value for state.
     * @param  notifyOnShare  SearchUsersNotifyOnShareEnum value for notifyOnShare.
     * @param  showWalkMe  SearchUsersShowWalkMeEnum value for showWalkMe.
     * @param  analystOnboardingComplete  SearchUsersAnalystOnboardingCompleteEnum value for
     *         analystOnboardingComplete.
     * @param  type  SearchUsersTypeEnum value for type.
     */
    public TspublicRestV2UserSearchRequest(
            List<String> outputFields,
            String name,
            String id,
            String displayName,
            SearchUsersVisibilityEnum visibility,
            String mail,
            List<GroupNameAndIDInput> groups,
            List<SearchUsersPrivilegesEnum> privileges,
            SearchUsersStateEnum state,
            SearchUsersNotifyOnShareEnum notifyOnShare,
            SearchUsersShowWalkMeEnum showWalkMe,
            SearchUsersAnalystOnboardingCompleteEnum analystOnboardingComplete,
            SearchUsersTypeEnum type) {
        this.outputFields = outputFields;
        this.name = name;
        this.id = id;
        this.displayName = displayName;
        this.visibility = visibility;
        this.mail = mail;
        this.groups = groups;
        this.privileges = privileges;
        this.state = state;
        this.notifyOnShare = notifyOnShare;
        this.showWalkMe = showWalkMe;
        this.analystOnboardingComplete = analystOnboardingComplete;
        this.type = type;
    }

    /**
     * Getter for OutputFields.
     * Array of field names that need to be included in the response.
     * @return Returns the List of String
     */
    @JsonGetter("outputFields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getOutputFields() {
        return outputFields;
    }

    /**
     * Setter for OutputFields.
     * Array of field names that need to be included in the response.
     * @param outputFields Value for List of String
     */
    @JsonSetter("outputFields")
    public void setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
    }

    /**
     * Getter for Name.
     * Name of the user.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the user.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The GUID of the user account to query
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The GUID of the user account to query
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for DisplayName.
     * A unique display name string for the user, usually their first and last name.
     * @return Returns the String
     */
    @JsonGetter("displayName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * A unique display name string for the user, usually their first and last name.
     * @param displayName Value for String
     */
    @JsonSetter("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for Visibility.
     * Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.
     * Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows
     * them to share objects
     * @return Returns the SearchUsersVisibilityEnum
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchUsersVisibilityEnum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.
     * Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows
     * them to share objects
     * @param visibility Value for SearchUsersVisibilityEnum
     */
    @JsonSetter("visibility")
    public void setVisibility(SearchUsersVisibilityEnum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Mail.
     * email of the user account
     * @return Returns the String
     */
    @JsonGetter("mail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMail() {
        return mail;
    }

    /**
     * Setter for Mail.
     * email of the user account
     * @param mail Value for String
     */
    @JsonSetter("mail")
    public void setMail(String mail) {
        this.mail = mail;
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
     * Getter for Privileges.
     * A JSON array of privileges assigned to the user
     * @return Returns the List of SearchUsersPrivilegesEnum
     */
    @JsonGetter("privileges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SearchUsersPrivilegesEnum> getPrivileges() {
        return privileges;
    }

    /**
     * Setter for Privileges.
     * A JSON array of privileges assigned to the user
     * @param privileges Value for List of SearchUsersPrivilegesEnum
     */
    @JsonSetter("privileges")
    public void setPrivileges(List<SearchUsersPrivilegesEnum> privileges) {
        this.privileges = privileges;
    }

    /**
     * Getter for State.
     * Status of user account. acitve or inactive.
     * @return Returns the SearchUsersStateEnum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchUsersStateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * Status of user account. acitve or inactive.
     * @param state Value for SearchUsersStateEnum
     */
    @JsonSetter("state")
    public void setState(SearchUsersStateEnum state) {
        this.state = state;
    }

    /**
     * Getter for NotifyOnShare.
     * User preference for receiving email notifications when another ThoughtSpot user shares
     * answers or pinboards.
     * @return Returns the SearchUsersNotifyOnShareEnum
     */
    @JsonGetter("notifyOnShare")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchUsersNotifyOnShareEnum getNotifyOnShare() {
        return notifyOnShare;
    }

    /**
     * Setter for NotifyOnShare.
     * User preference for receiving email notifications when another ThoughtSpot user shares
     * answers or pinboards.
     * @param notifyOnShare Value for SearchUsersNotifyOnShareEnum
     */
    @JsonSetter("notifyOnShare")
    public void setNotifyOnShare(SearchUsersNotifyOnShareEnum notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
    }

    /**
     * Getter for ShowWalkMe.
     * The user preference for revisiting the onboarding experience.
     * @return Returns the SearchUsersShowWalkMeEnum
     */
    @JsonGetter("showWalkMe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchUsersShowWalkMeEnum getShowWalkMe() {
        return showWalkMe;
    }

    /**
     * Setter for ShowWalkMe.
     * The user preference for revisiting the onboarding experience.
     * @param showWalkMe Value for SearchUsersShowWalkMeEnum
     */
    @JsonSetter("showWalkMe")
    public void setShowWalkMe(SearchUsersShowWalkMeEnum showWalkMe) {
        this.showWalkMe = showWalkMe;
    }

    /**
     * Getter for AnalystOnboardingComplete.
     * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding
     * experience leads users through a set of actions to help users get started and accomplish
     * their tasks quickly. The users can turn off the Onboarding experience and access it again
     * when they need assistance with the ThoughtSpot UI.
     * @return Returns the SearchUsersAnalystOnboardingCompleteEnum
     */
    @JsonGetter("analystOnboardingComplete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchUsersAnalystOnboardingCompleteEnum getAnalystOnboardingComplete() {
        return analystOnboardingComplete;
    }

    /**
     * Setter for AnalystOnboardingComplete.
     * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding
     * experience leads users through a set of actions to help users get started and accomplish
     * their tasks quickly. The users can turn off the Onboarding experience and access it again
     * when they need assistance with the ThoughtSpot UI.
     * @param analystOnboardingComplete Value for SearchUsersAnalystOnboardingCompleteEnum
     */
    @JsonSetter("analystOnboardingComplete")
    public void setAnalystOnboardingComplete(SearchUsersAnalystOnboardingCompleteEnum analystOnboardingComplete) {
        this.analystOnboardingComplete = analystOnboardingComplete;
    }

    /**
     * Getter for Type.
     * Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot
     * system.
     * @return Returns the SearchUsersTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchUsersTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot
     * system.
     * @param type Value for SearchUsersTypeEnum
     */
    @JsonSetter("type")
    public void setType(SearchUsersTypeEnum type) {
        this.type = type;
    }

    /**
     * Converts this TspublicRestV2UserSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2UserSearchRequest [" + "outputFields=" + outputFields + ", name="
                + name + ", id=" + id + ", displayName=" + displayName + ", visibility="
                + visibility + ", mail=" + mail + ", groups=" + groups + ", privileges="
                + privileges + ", state=" + state + ", notifyOnShare=" + notifyOnShare
                + ", showWalkMe=" + showWalkMe + ", analystOnboardingComplete="
                + analystOnboardingComplete + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2UserSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2UserSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .outputFields(getOutputFields())
                .name(getName())
                .id(getId())
                .displayName(getDisplayName())
                .visibility(getVisibility())
                .mail(getMail())
                .groups(getGroups())
                .privileges(getPrivileges())
                .state(getState())
                .notifyOnShare(getNotifyOnShare())
                .showWalkMe(getShowWalkMe())
                .analystOnboardingComplete(getAnalystOnboardingComplete())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2UserSearchRequest}.
     */
    public static class Builder {
        private List<String> outputFields;
        private String name;
        private String id;
        private String displayName;
        private SearchUsersVisibilityEnum visibility;
        private String mail;
        private List<GroupNameAndIDInput> groups;
        private List<SearchUsersPrivilegesEnum> privileges;
        private SearchUsersStateEnum state;
        private SearchUsersNotifyOnShareEnum notifyOnShare;
        private SearchUsersShowWalkMeEnum showWalkMe;
        private SearchUsersAnalystOnboardingCompleteEnum analystOnboardingComplete;
        private SearchUsersTypeEnum type;



        /**
         * Setter for outputFields.
         * @param  outputFields  List of String value for outputFields.
         * @return Builder
         */
        public Builder outputFields(List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }

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
         * @param  visibility  SearchUsersVisibilityEnum value for visibility.
         * @return Builder
         */
        public Builder visibility(SearchUsersVisibilityEnum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for mail.
         * @param  mail  String value for mail.
         * @return Builder
         */
        public Builder mail(String mail) {
            this.mail = mail;
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
         * Setter for privileges.
         * @param  privileges  List of SearchUsersPrivilegesEnum value for privileges.
         * @return Builder
         */
        public Builder privileges(List<SearchUsersPrivilegesEnum> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  SearchUsersStateEnum value for state.
         * @return Builder
         */
        public Builder state(SearchUsersStateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for notifyOnShare.
         * @param  notifyOnShare  SearchUsersNotifyOnShareEnum value for notifyOnShare.
         * @return Builder
         */
        public Builder notifyOnShare(SearchUsersNotifyOnShareEnum notifyOnShare) {
            this.notifyOnShare = notifyOnShare;
            return this;
        }

        /**
         * Setter for showWalkMe.
         * @param  showWalkMe  SearchUsersShowWalkMeEnum value for showWalkMe.
         * @return Builder
         */
        public Builder showWalkMe(SearchUsersShowWalkMeEnum showWalkMe) {
            this.showWalkMe = showWalkMe;
            return this;
        }

        /**
         * Setter for analystOnboardingComplete.
         * @param  analystOnboardingComplete  SearchUsersAnalystOnboardingCompleteEnum value for
         *         analystOnboardingComplete.
         * @return Builder
         */
        public Builder analystOnboardingComplete(
                SearchUsersAnalystOnboardingCompleteEnum analystOnboardingComplete) {
            this.analystOnboardingComplete = analystOnboardingComplete;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  SearchUsersTypeEnum value for type.
         * @return Builder
         */
        public Builder type(SearchUsersTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2UserSearchRequest} object using the set fields.
         * @return {@link TspublicRestV2UserSearchRequest}
         */
        public TspublicRestV2UserSearchRequest build() {
            return new TspublicRestV2UserSearchRequest(outputFields, name, id, displayName,
                    visibility, mail, groups, privileges, state, notifyOnShare, showWalkMe,
                    analystOnboardingComplete, type);
        }
    }
}
