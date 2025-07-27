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

/** CreateUserRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateUserRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nonnull
    private String displayName;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    @javax.annotation.Nullable
    private String password;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @javax.annotation.Nonnull
    private String email;

    /** Type of the account. */
    @JsonAdapter(AccountTypeEnum.Adapter.class)
    public enum AccountTypeEnum {
        LOCAL_USER("LOCAL_USER"),

        LDAP_USER("LDAP_USER"),

        SAML_USER("SAML_USER"),

        OIDC_USER("OIDC_USER"),

        REMOTE_USER("REMOTE_USER");

        private String value;

        AccountTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AccountTypeEnum fromValue(String value) {
            for (AccountTypeEnum b : AccountTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AccountTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AccountTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AccountTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
    @javax.annotation.Nullable
    private AccountTypeEnum accountType = AccountTypeEnum.LOCAL_USER;

    /**
     * Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a
     * transitional state applicable to IAMv2 users only.
     */
    @JsonAdapter(AccountStatusEnum.Adapter.class)
    public enum AccountStatusEnum {
        ACTIVE("ACTIVE"),

        INACTIVE("INACTIVE"),

        EXPIRED("EXPIRED"),

        LOCKED("LOCKED"),

        PENDING("PENDING"),

        SUSPENDED("SUSPENDED");

        private String value;

        AccountStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AccountStatusEnum fromValue(String value) {
            for (AccountStatusEnum b : AccountStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AccountStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AccountStatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AccountStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AccountStatusEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AccountStatusEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
    @javax.annotation.Nullable
    private AccountStatusEnum accountStatus = AccountStatusEnum.ACTIVE;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> orgIdentifiers;

    public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";

    @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> groupIdentifiers;

    /**
     * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups
     * when they try to share an object.
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
    private VisibilityEnum visibility = VisibilityEnum.SHARABLE;

    public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";

    @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
    @javax.annotation.Nullable
    private Boolean notifyOnShare = true;

    public static final String SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE =
            "show_onboarding_experience";

    @SerializedName(SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE)
    @javax.annotation.Nullable
    private Boolean showOnboardingExperience = true;

    public static final String SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED =
            "onboarding_experience_completed";

    @SerializedName(SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED)
    @javax.annotation.Nullable
    private Boolean onboardingExperienceCompleted = false;

    public static final String SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER =
            "home_liveboard_identifier";

    @SerializedName(SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER)
    @javax.annotation.Nullable
    private String homeLiveboardIdentifier;

    public static final String SERIALIZED_NAME_FAVORITE_METADATA = "favorite_metadata";

    @SerializedName(SERIALIZED_NAME_FAVORITE_METADATA)
    @javax.annotation.Nullable
    private List<FavoriteMetadataInput> favoriteMetadata;

    /** Locale for the user. */
    @JsonAdapter(PreferredLocaleEnum.Adapter.class)
    public enum PreferredLocaleEnum {
        EN_CA("en-CA"),

        EN_GB("en-GB"),

        EN_US("en-US"),

        DE_DE("de-DE"),

        JA_JP("ja-JP"),

        ZH_CN("zh-CN"),

        PT_BR("pt-BR"),

        FR_FR("fr-FR"),

        FR_CA("fr-CA"),

        ES_US("es-US"),

        DA_DK("da-DK"),

        ES_ES("es-ES"),

        FI_FI("fi-FI"),

        SV_SE("sv-SE"),

        NB_NO("nb-NO"),

        PT_PT("pt-PT"),

        NL_NL("nl-NL"),

        IT_IT("it-IT"),

        RU_RU("ru-RU"),

        EN_IN("en-IN"),

        DE_CH("de-CH"),

        EN_NZ("en-NZ"),

        ES_MX("es-MX"),

        EN_AU("en-AU"),

        ZH_HANT("zh-Hant"),

        KO_KR("ko-KR"),

        EN_DE("en-DE");

        private String value;

        PreferredLocaleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PreferredLocaleEnum fromValue(String value) {
            for (PreferredLocaleEnum b : PreferredLocaleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PreferredLocaleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PreferredLocaleEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PreferredLocaleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PreferredLocaleEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PreferredLocaleEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PREFERRED_LOCALE = "preferred_locale";

    @SerializedName(SERIALIZED_NAME_PREFERRED_LOCALE)
    @javax.annotation.Nullable
    private PreferredLocaleEnum preferredLocale;

    public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";

    @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
    @javax.annotation.Nullable
    private Object extendedProperties;

    public static final String SERIALIZED_NAME_EXTENDED_PREFERENCES = "extended_preferences";

    @SerializedName(SERIALIZED_NAME_EXTENDED_PREFERENCES)
    @javax.annotation.Nullable
    private Object extendedPreferences;

    public static final String SERIALIZED_NAME_TRIGGER_WELCOME_EMAIL = "trigger_welcome_email";

    @SerializedName(SERIALIZED_NAME_TRIGGER_WELCOME_EMAIL)
    @javax.annotation.Nullable
    private Boolean triggerWelcomeEmail;

    public static final String SERIALIZED_NAME_TRIGGER_ACTIVATION_EMAIL =
            "trigger_activation_email";

    @SerializedName(SERIALIZED_NAME_TRIGGER_ACTIVATION_EMAIL)
    @javax.annotation.Nullable
    private Boolean triggerActivationEmail;

    public CreateUserRequest() {}

    public CreateUserRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the user. The username string must be unique.
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

    public CreateUserRequest displayName(@javax.annotation.Nonnull String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * A unique display name string for the user account, usually their first and last name
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

    public CreateUserRequest password(@javax.annotation.Nullable String password) {
        this.password = password;
        return this;
    }

    /**
     * Password for the user account. For IAMv2 users, you must set this password if you do not want
     * to trigger an activation email.
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

    public CreateUserRequest email(@javax.annotation.Nonnull String email) {
        this.email = email;
        return this;
    }

    /**
     * Email of the user account
     *
     * @return email
     */
    @javax.annotation.Nonnull
    public String getEmail() {
        return email;
    }

    public void setEmail(@javax.annotation.Nonnull String email) {
        this.email = email;
    }

    public CreateUserRequest accountType(@javax.annotation.Nullable AccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Type of the account.
     *
     * @return accountType
     */
    @javax.annotation.Nullable
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(@javax.annotation.Nullable AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public CreateUserRequest accountStatus(
            @javax.annotation.Nullable AccountStatusEnum accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }

    /**
     * Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a
     * transitional state applicable to IAMv2 users only.
     *
     * @return accountStatus
     */
    @javax.annotation.Nullable
    public AccountStatusEnum getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(@javax.annotation.Nullable AccountStatusEnum accountStatus) {
        this.accountStatus = accountStatus;
    }

    public CreateUserRequest orgIdentifiers(
            @javax.annotation.Nullable List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
        return this;
    }

    public CreateUserRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
        if (this.orgIdentifiers == null) {
            this.orgIdentifiers = new ArrayList<>();
        }
        this.orgIdentifiers.add(orgIdentifiersItem);
        return this;
    }

    /**
     * List of Org IDs to which the user belongs.
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

    public CreateUserRequest groupIdentifiers(
            @javax.annotation.Nullable List<String> groupIdentifiers) {
        this.groupIdentifiers = groupIdentifiers;
        return this;
    }

    public CreateUserRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
        if (this.groupIdentifiers == null) {
            this.groupIdentifiers = new ArrayList<>();
        }
        this.groupIdentifiers.add(groupIdentifiersItem);
        return this;
    }

    /**
     * GUIDs or names of the groups to which the newly created user belongs.
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

    public CreateUserRequest visibility(@javax.annotation.Nullable VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups
     * when they try to share an object.
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

    public CreateUserRequest notifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
        return this;
    }

    /**
     * User preference for receiving email notifications when another ThoughtSpot user shares a
     * metadata object such as Answer, Liveboard, or Worksheet.
     *
     * @return notifyOnShare
     */
    @javax.annotation.Nullable
    public Boolean getNotifyOnShare() {
        return notifyOnShare;
    }

    public void setNotifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
    }

    public CreateUserRequest showOnboardingExperience(
            @javax.annotation.Nullable Boolean showOnboardingExperience) {
        this.showOnboardingExperience = showOnboardingExperience;
        return this;
    }

    /**
     * The user preference for revisiting the onboarding experience.
     *
     * @return showOnboardingExperience
     */
    @javax.annotation.Nullable
    public Boolean getShowOnboardingExperience() {
        return showOnboardingExperience;
    }

    public void setShowOnboardingExperience(
            @javax.annotation.Nullable Boolean showOnboardingExperience) {
        this.showOnboardingExperience = showOnboardingExperience;
    }

    public CreateUserRequest onboardingExperienceCompleted(
            @javax.annotation.Nullable Boolean onboardingExperienceCompleted) {
        this.onboardingExperienceCompleted = onboardingExperienceCompleted;
        return this;
    }

    /**
     * flag to get the on-boarding experience is completed or not.
     *
     * @return onboardingExperienceCompleted
     */
    @javax.annotation.Nullable
    public Boolean getOnboardingExperienceCompleted() {
        return onboardingExperienceCompleted;
    }

    public void setOnboardingExperienceCompleted(
            @javax.annotation.Nullable Boolean onboardingExperienceCompleted) {
        this.onboardingExperienceCompleted = onboardingExperienceCompleted;
    }

    public CreateUserRequest homeLiveboardIdentifier(
            @javax.annotation.Nullable String homeLiveboardIdentifier) {
        this.homeLiveboardIdentifier = homeLiveboardIdentifier;
        return this;
    }

    /**
     * GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this
     * Liveboard on the Home page when the user logs in.
     *
     * @return homeLiveboardIdentifier
     */
    @javax.annotation.Nullable
    public String getHomeLiveboardIdentifier() {
        return homeLiveboardIdentifier;
    }

    public void setHomeLiveboardIdentifier(
            @javax.annotation.Nullable String homeLiveboardIdentifier) {
        this.homeLiveboardIdentifier = homeLiveboardIdentifier;
    }

    public CreateUserRequest favoriteMetadata(
            @javax.annotation.Nullable List<FavoriteMetadataInput> favoriteMetadata) {
        this.favoriteMetadata = favoriteMetadata;
        return this;
    }

    public CreateUserRequest addFavoriteMetadataItem(FavoriteMetadataInput favoriteMetadataItem) {
        if (this.favoriteMetadata == null) {
            this.favoriteMetadata = new ArrayList<>();
        }
        this.favoriteMetadata.add(favoriteMetadataItem);
        return this;
    }

    /**
     * Metadata objects to add to the user&#39;s favorites list.
     *
     * @return favoriteMetadata
     */
    @javax.annotation.Nullable
    public List<FavoriteMetadataInput> getFavoriteMetadata() {
        return favoriteMetadata;
    }

    public void setFavoriteMetadata(
            @javax.annotation.Nullable List<FavoriteMetadataInput> favoriteMetadata) {
        this.favoriteMetadata = favoriteMetadata;
    }

    public CreateUserRequest preferredLocale(
            @javax.annotation.Nullable PreferredLocaleEnum preferredLocale) {
        this.preferredLocale = preferredLocale;
        return this;
    }

    /**
     * Locale for the user.
     *
     * @return preferredLocale
     */
    @javax.annotation.Nullable
    public PreferredLocaleEnum getPreferredLocale() {
        return preferredLocale;
    }

    public void setPreferredLocale(@javax.annotation.Nullable PreferredLocaleEnum preferredLocale) {
        this.preferredLocale = preferredLocale;
    }

    public CreateUserRequest extendedProperties(
            @javax.annotation.Nullable Object extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Properties for the user
     *
     * @return extendedProperties
     */
    @javax.annotation.Nullable
    public Object getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(@javax.annotation.Nullable Object extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public CreateUserRequest extendedPreferences(
            @javax.annotation.Nullable Object extendedPreferences) {
        this.extendedPreferences = extendedPreferences;
        return this;
    }

    /**
     * Preferences for the user
     *
     * @return extendedPreferences
     */
    @javax.annotation.Nullable
    public Object getExtendedPreferences() {
        return extendedPreferences;
    }

    public void setExtendedPreferences(@javax.annotation.Nullable Object extendedPreferences) {
        this.extendedPreferences = extendedPreferences;
    }

    public CreateUserRequest triggerWelcomeEmail(
            @javax.annotation.Nullable Boolean triggerWelcomeEmail) {
        this.triggerWelcomeEmail = triggerWelcomeEmail;
        return this;
    }

    /**
     * Flag to indicate whether welcome email should be sent to user. This parameter is applied only
     * on clusters on which IAM is disabled.
     *
     * @return triggerWelcomeEmail
     */
    @javax.annotation.Nullable
    public Boolean getTriggerWelcomeEmail() {
        return triggerWelcomeEmail;
    }

    public void setTriggerWelcomeEmail(@javax.annotation.Nullable Boolean triggerWelcomeEmail) {
        this.triggerWelcomeEmail = triggerWelcomeEmail;
    }

    public CreateUserRequest triggerActivationEmail(
            @javax.annotation.Nullable Boolean triggerActivationEmail) {
        this.triggerActivationEmail = triggerActivationEmail;
        return this;
    }

    /**
     * Flag to indicate whether activation email should be sent to the user. Default value for IAMv2
     * users is set to true. Users must either set this to false, or enter a valid password if they
     * do not want to trigger an activation email.
     *
     * @return triggerActivationEmail
     */
    @javax.annotation.Nullable
    public Boolean getTriggerActivationEmail() {
        return triggerActivationEmail;
    }

    public void setTriggerActivationEmail(
            @javax.annotation.Nullable Boolean triggerActivationEmail) {
        this.triggerActivationEmail = triggerActivationEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUserRequest createUserRequest = (CreateUserRequest) o;
        return Objects.equals(this.name, createUserRequest.name)
                && Objects.equals(this.displayName, createUserRequest.displayName)
                && Objects.equals(this.password, createUserRequest.password)
                && Objects.equals(this.email, createUserRequest.email)
                && Objects.equals(this.accountType, createUserRequest.accountType)
                && Objects.equals(this.accountStatus, createUserRequest.accountStatus)
                && Objects.equals(this.orgIdentifiers, createUserRequest.orgIdentifiers)
                && Objects.equals(this.groupIdentifiers, createUserRequest.groupIdentifiers)
                && Objects.equals(this.visibility, createUserRequest.visibility)
                && Objects.equals(this.notifyOnShare, createUserRequest.notifyOnShare)
                && Objects.equals(
                        this.showOnboardingExperience, createUserRequest.showOnboardingExperience)
                && Objects.equals(
                        this.onboardingExperienceCompleted,
                        createUserRequest.onboardingExperienceCompleted)
                && Objects.equals(
                        this.homeLiveboardIdentifier, createUserRequest.homeLiveboardIdentifier)
                && Objects.equals(this.favoriteMetadata, createUserRequest.favoriteMetadata)
                && Objects.equals(this.preferredLocale, createUserRequest.preferredLocale)
                && Objects.equals(this.extendedProperties, createUserRequest.extendedProperties)
                && Objects.equals(this.extendedPreferences, createUserRequest.extendedPreferences)
                && Objects.equals(this.triggerWelcomeEmail, createUserRequest.triggerWelcomeEmail)
                && Objects.equals(
                        this.triggerActivationEmail, createUserRequest.triggerActivationEmail);
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
                name,
                displayName,
                password,
                email,
                accountType,
                accountStatus,
                orgIdentifiers,
                groupIdentifiers,
                visibility,
                notifyOnShare,
                showOnboardingExperience,
                onboardingExperienceCompleted,
                homeLiveboardIdentifier,
                favoriteMetadata,
                preferredLocale,
                extendedProperties,
                extendedPreferences,
                triggerWelcomeEmail,
                triggerActivationEmail);
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
        sb.append("class CreateUserRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
        sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
        sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
        sb.append("    showOnboardingExperience: ")
                .append(toIndentedString(showOnboardingExperience))
                .append("\n");
        sb.append("    onboardingExperienceCompleted: ")
                .append(toIndentedString(onboardingExperienceCompleted))
                .append("\n");
        sb.append("    homeLiveboardIdentifier: ")
                .append(toIndentedString(homeLiveboardIdentifier))
                .append("\n");
        sb.append("    favoriteMetadata: ").append(toIndentedString(favoriteMetadata)).append("\n");
        sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
        sb.append("    extendedProperties: ")
                .append(toIndentedString(extendedProperties))
                .append("\n");
        sb.append("    extendedPreferences: ")
                .append(toIndentedString(extendedPreferences))
                .append("\n");
        sb.append("    triggerWelcomeEmail: ")
                .append(toIndentedString(triggerWelcomeEmail))
                .append("\n");
        sb.append("    triggerActivationEmail: ")
                .append(toIndentedString(triggerActivationEmail))
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
        openapiFields.add("name");
        openapiFields.add("display_name");
        openapiFields.add("password");
        openapiFields.add("email");
        openapiFields.add("account_type");
        openapiFields.add("account_status");
        openapiFields.add("org_identifiers");
        openapiFields.add("group_identifiers");
        openapiFields.add("visibility");
        openapiFields.add("notify_on_share");
        openapiFields.add("show_onboarding_experience");
        openapiFields.add("onboarding_experience_completed");
        openapiFields.add("home_liveboard_identifier");
        openapiFields.add("favorite_metadata");
        openapiFields.add("preferred_locale");
        openapiFields.add("extended_properties");
        openapiFields.add("extended_preferences");
        openapiFields.add("trigger_welcome_email");
        openapiFields.add("trigger_activation_email");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("display_name");
        openapiRequiredFields.add("email");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateUserRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateUserRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateUserRequest is not found in the"
                                        + " empty JSON string",
                                CreateUserRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateUserRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateUserRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateUserRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("display_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("display_name").toString()));
        }
        if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull())
                && !jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `password` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("password").toString()));
        }
        if (!jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
        if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull())
                && !jsonObj.get("account_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `account_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("account_type").toString()));
        }
        // validate the optional field `account_type`
        if (jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) {
            AccountTypeEnum.validateJsonElement(jsonObj.get("account_type"));
        }
        if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull())
                && !jsonObj.get("account_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `account_status` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("account_status").toString()));
        }
        // validate the optional field `account_status`
        if (jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) {
            AccountStatusEnum.validateJsonElement(jsonObj.get("account_status"));
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
        if (jsonObj.get("group_identifiers") != null
                && !jsonObj.get("group_identifiers").isJsonNull()
                && !jsonObj.get("group_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `group_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("group_identifiers").toString()));
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
        if ((jsonObj.get("home_liveboard_identifier") != null
                        && !jsonObj.get("home_liveboard_identifier").isJsonNull())
                && !jsonObj.get("home_liveboard_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `home_liveboard_identifier` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("home_liveboard_identifier").toString()));
        }
        if (jsonObj.get("favorite_metadata") != null
                && !jsonObj.get("favorite_metadata").isJsonNull()) {
            JsonArray jsonArrayfavoriteMetadata = jsonObj.getAsJsonArray("favorite_metadata");
            if (jsonArrayfavoriteMetadata != null) {
                // ensure the json data is an array
                if (!jsonObj.get("favorite_metadata").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `favorite_metadata` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("favorite_metadata").toString()));
                }

                // validate the optional field `favorite_metadata` (array)
                for (int i = 0; i < jsonArrayfavoriteMetadata.size(); i++) {
                    FavoriteMetadataInput.validateJsonElement(jsonArrayfavoriteMetadata.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("preferred_locale") != null
                        && !jsonObj.get("preferred_locale").isJsonNull())
                && !jsonObj.get("preferred_locale").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `preferred_locale` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("preferred_locale").toString()));
        }
        // validate the optional field `preferred_locale`
        if (jsonObj.get("preferred_locale") != null
                && !jsonObj.get("preferred_locale").isJsonNull()) {
            PreferredLocaleEnum.validateJsonElement(jsonObj.get("preferred_locale"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateUserRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateUserRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateUserRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateUserRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateUserRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateUserRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateUserRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateUserRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateUserRequest
     * @throws IOException if the JSON string is invalid with respect to CreateUserRequest
     */
    public static CreateUserRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateUserRequest.class);
    }

    /**
     * Convert an instance of CreateUserRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
