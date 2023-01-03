/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for TspublicRestV2UserUpdateRequest type.
 */
public class TspublicRestV2UserUpdateRequest {
    private String name;
    private String id;
    private String displayName;
    private Visibility1Enum visibility;
    private String mail;
    private State1Enum state;
    private Boolean notifyOnShare;
    private Boolean showWalkMe;
    private Boolean analystOnboardingComplete;
    private Type9Enum type;
    private List<GroupNameAndIDInput> groups;

    /**
     * Default constructor.
     */
    public TspublicRestV2UserUpdateRequest() {
        visibility = Visibility1Enum.DEFAULT;
        state = State1Enum.ACTIVE;
        notifyOnShare = true;
        showWalkMe = true;
        analystOnboardingComplete = false;
        type = Type9Enum.LOCAL_USER;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  displayName  String value for displayName.
     * @param  visibility  Visibility1Enum value for visibility.
     * @param  mail  String value for mail.
     * @param  state  State1Enum value for state.
     * @param  notifyOnShare  Boolean value for notifyOnShare.
     * @param  showWalkMe  Boolean value for showWalkMe.
     * @param  analystOnboardingComplete  Boolean value for analystOnboardingComplete.
     * @param  type  Type9Enum value for type.
     * @param  groups  List of GroupNameAndIDInput value for groups.
     */
    public TspublicRestV2UserUpdateRequest(
            String name,
            String id,
            String displayName,
            Visibility1Enum visibility,
            String mail,
            State1Enum state,
            Boolean notifyOnShare,
            Boolean showWalkMe,
            Boolean analystOnboardingComplete,
            Type9Enum type,
            List<GroupNameAndIDInput> groups) {
        this.name = name;
        this.id = id;
        this.displayName = displayName;
        this.visibility = visibility;
        this.mail = mail;
        this.state = state;
        this.notifyOnShare = notifyOnShare;
        this.showWalkMe = showWalkMe;
        this.analystOnboardingComplete = analystOnboardingComplete;
        this.type = type;
        this.groups = groups;
    }

    /**
     * Getter for Name.
     * Name of the user. The username string must be unique.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the user. The username string must be unique.
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
     * Visibility of the user account. The visibility attribute is set to DEFAULT when creating a
     * user. The DEFAULT attribute makes a user visible to other users and user groups, and thus
     * allows them to share objects.
     * @return Returns the Visibility1Enum
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Visibility1Enum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * Visibility of the user account. The visibility attribute is set to DEFAULT when creating a
     * user. The DEFAULT attribute makes a user visible to other users and user groups, and thus
     * allows them to share objects.
     * @param visibility Value for Visibility1Enum
     */
    @JsonSetter("visibility")
    public void setVisibility(Visibility1Enum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Mail.
     * email of the user.
     * @return Returns the String
     */
    @JsonGetter("mail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMail() {
        return mail;
    }

    /**
     * Setter for Mail.
     * email of the user.
     * @param mail Value for String
     */
    @JsonSetter("mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Getter for State.
     * Status of user account. acitve or inactive.
     * @return Returns the State1Enum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public State1Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * Status of user account. acitve or inactive.
     * @param state Value for State1Enum
     */
    @JsonSetter("state")
    public void setState(State1Enum state) {
        this.state = state;
    }

    /**
     * Getter for NotifyOnShare.
     * User preference for receiving email notifications when another ThoughtSpot user shares
     * answers or pinboards.
     * @return Returns the Boolean
     */
    @JsonGetter("notifyOnShare")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyOnShare() {
        return notifyOnShare;
    }

    /**
     * Setter for NotifyOnShare.
     * User preference for receiving email notifications when another ThoughtSpot user shares
     * answers or pinboards.
     * @param notifyOnShare Value for Boolean
     */
    @JsonSetter("notifyOnShare")
    public void setNotifyOnShare(Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
    }

    /**
     * Getter for ShowWalkMe.
     * The user preference for revisiting the onboarding experience.
     * @return Returns the Boolean
     */
    @JsonGetter("showWalkMe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getShowWalkMe() {
        return showWalkMe;
    }

    /**
     * Setter for ShowWalkMe.
     * The user preference for revisiting the onboarding experience.
     * @param showWalkMe Value for Boolean
     */
    @JsonSetter("showWalkMe")
    public void setShowWalkMe(Boolean showWalkMe) {
        this.showWalkMe = showWalkMe;
    }

    /**
     * Getter for AnalystOnboardingComplete.
     * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding
     * experience leads users through a set of actions to help users get started and accomplish
     * their tasks quickly. The users can turn off the Onboarding experience and access it again
     * when they need assistance with the ThoughtSpot UI.
     * @return Returns the Boolean
     */
    @JsonGetter("analystOnboardingComplete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAnalystOnboardingComplete() {
        return analystOnboardingComplete;
    }

    /**
     * Setter for AnalystOnboardingComplete.
     * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding
     * experience leads users through a set of actions to help users get started and accomplish
     * their tasks quickly. The users can turn off the Onboarding experience and access it again
     * when they need assistance with the ThoughtSpot UI.
     * @param analystOnboardingComplete Value for Boolean
     */
    @JsonSetter("analystOnboardingComplete")
    public void setAnalystOnboardingComplete(Boolean analystOnboardingComplete) {
        this.analystOnboardingComplete = analystOnboardingComplete;
    }

    /**
     * Getter for Type.
     * Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot
     * system.
     * @return Returns the Type9Enum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Type9Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot
     * system.
     * @param type Value for Type9Enum
     */
    @JsonSetter("type")
    public void setType(Type9Enum type) {
        this.type = type;
    }

    /**
     * Getter for Groups.
     * Array of objects of groups that the user belong to.
     * @return Returns the List of GroupNameAndIDInput
     */
    @JsonGetter("groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GroupNameAndIDInput> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups.
     * Array of objects of groups that the user belong to.
     * @param groups Value for List of GroupNameAndIDInput
     */
    @JsonSetter("groups")
    public void setGroups(List<GroupNameAndIDInput> groups) {
        this.groups = groups;
    }

    /**
     * Converts this TspublicRestV2UserUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2UserUpdateRequest [" + "name=" + name + ", id=" + id
                + ", displayName=" + displayName + ", visibility=" + visibility + ", mail=" + mail
                + ", state=" + state + ", notifyOnShare=" + notifyOnShare + ", showWalkMe="
                + showWalkMe + ", analystOnboardingComplete=" + analystOnboardingComplete
                + ", type=" + type + ", groups=" + groups + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2UserUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2UserUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .displayName(getDisplayName())
                .visibility(getVisibility())
                .mail(getMail())
                .state(getState())
                .notifyOnShare(getNotifyOnShare())
                .showWalkMe(getShowWalkMe())
                .analystOnboardingComplete(getAnalystOnboardingComplete())
                .type(getType())
                .groups(getGroups());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2UserUpdateRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private String displayName;
        private Visibility1Enum visibility = Visibility1Enum.DEFAULT;
        private String mail;
        private State1Enum state = State1Enum.ACTIVE;
        private Boolean notifyOnShare = true;
        private Boolean showWalkMe = true;
        private Boolean analystOnboardingComplete = false;
        private Type9Enum type = Type9Enum.LOCAL_USER;
        private List<GroupNameAndIDInput> groups;



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
         * @param  visibility  Visibility1Enum value for visibility.
         * @return Builder
         */
        public Builder visibility(Visibility1Enum visibility) {
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
         * Setter for state.
         * @param  state  State1Enum value for state.
         * @return Builder
         */
        public Builder state(State1Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for notifyOnShare.
         * @param  notifyOnShare  Boolean value for notifyOnShare.
         * @return Builder
         */
        public Builder notifyOnShare(Boolean notifyOnShare) {
            this.notifyOnShare = notifyOnShare;
            return this;
        }

        /**
         * Setter for showWalkMe.
         * @param  showWalkMe  Boolean value for showWalkMe.
         * @return Builder
         */
        public Builder showWalkMe(Boolean showWalkMe) {
            this.showWalkMe = showWalkMe;
            return this;
        }

        /**
         * Setter for analystOnboardingComplete.
         * @param  analystOnboardingComplete  Boolean value for analystOnboardingComplete.
         * @return Builder
         */
        public Builder analystOnboardingComplete(Boolean analystOnboardingComplete) {
            this.analystOnboardingComplete = analystOnboardingComplete;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Type9Enum value for type.
         * @return Builder
         */
        public Builder type(Type9Enum type) {
            this.type = type;
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
         * Builds a new {@link TspublicRestV2UserUpdateRequest} object using the set fields.
         * @return {@link TspublicRestV2UserUpdateRequest}
         */
        public TspublicRestV2UserUpdateRequest build() {
            return new TspublicRestV2UserUpdateRequest(name, id, displayName, visibility, mail,
                    state, notifyOnShare, showWalkMe, analystOnboardingComplete, type, groups);
        }
    }
}
