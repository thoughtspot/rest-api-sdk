/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.FavoriteMetadataInput;
import org.thoughtspot.client.model.SortOptions;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * SearchUsersRequest
 */

public class SearchUsersRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
  @javax.annotation.Nullable
  private String userIdentifier;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";
  @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
  @javax.annotation.Nullable
  private String namePattern;

  /**
   * Visibility of the user
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
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
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

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> groupIdentifiers = new ArrayList<>();

  /**
   * Gets or Sets privileges
   */
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
      public void write(final JsonWriter jsonWriter, final PrivilegesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
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
  private List<PrivilegesEnum> privileges = new ArrayList<>();

  /**
   * Type of the account
   */
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
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
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
  private AccountTypeEnum accountType;

  /**
   * Current status of the user account.
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
      public void write(final JsonWriter jsonWriter, final AccountStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
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
  private AccountStatusEnum accountStatus;

  public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
  @javax.annotation.Nullable
  private Boolean notifyOnShare;

  public static final String SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE = "show_onboarding_experience";
  @SerializedName(SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE)
  @javax.annotation.Nullable
  private Boolean showOnboardingExperience;

  public static final String SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED = "onboarding_experience_completed";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED)
  @javax.annotation.Nullable
  private Boolean onboardingExperienceCompleted;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> orgIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER = "home_liveboard_identifier";
  @SerializedName(SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER)
  @javax.annotation.Nullable
  private String homeLiveboardIdentifier;

  public static final String SERIALIZED_NAME_FAVORITE_METADATA = "favorite_metadata";
  @SerializedName(SERIALIZED_NAME_FAVORITE_METADATA)
  @javax.annotation.Nullable
  private List<FavoriteMetadataInput> favoriteMetadata = new ArrayList<>();

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

  public static final String SERIALIZED_NAME_ROLE_IDENTIFIERS = "role_identifiers";
  @SerializedName(SERIALIZED_NAME_ROLE_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> roleIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUDE_FAVORITE_METADATA = "include_favorite_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FAVORITE_METADATA)
  @javax.annotation.Nullable
  private Boolean includeFavoriteMetadata = false;

  public SearchUsersRequest() {
  }

  public SearchUsersRequest userIdentifier(@javax.annotation.Nullable String userIdentifier) {
    this.userIdentifier = userIdentifier;
    return this;
  }

  /**
   * GUID / name of the user to search
   * @return userIdentifier
   */
  @javax.annotation.Nullable
  public String getUserIdentifier() {
    return userIdentifier;
  }

  public void setUserIdentifier(@javax.annotation.Nullable String userIdentifier) {
    this.userIdentifier = userIdentifier;
  }


  public SearchUsersRequest displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A unique display name string for the user account, usually their first and last name
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public SearchUsersRequest namePattern(@javax.annotation.Nullable String namePattern) {
    this.namePattern = namePattern;
    return this;
  }

  /**
   * A pattern to match case-insensitive name of the User object.
   * @return namePattern
   */
  @javax.annotation.Nullable
  public String getNamePattern() {
    return namePattern;
  }

  public void setNamePattern(@javax.annotation.Nullable String namePattern) {
    this.namePattern = namePattern;
  }


  public SearchUsersRequest visibility(@javax.annotation.Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the user
   * @return visibility
   */
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@javax.annotation.Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public SearchUsersRequest email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the user account
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public SearchUsersRequest groupIdentifiers(@javax.annotation.Nullable List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public SearchUsersRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

  /**
   * GUID or name of the group to which the user belongs
   * @return groupIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }

  public void setGroupIdentifiers(@javax.annotation.Nullable List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }


  public SearchUsersRequest privileges(@javax.annotation.Nullable List<PrivilegesEnum> privileges) {
    this.privileges = privileges;
    return this;
  }

  public SearchUsersRequest addPrivilegesItem(PrivilegesEnum privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

  /**
   * Privileges assigned to the user
   * @return privileges
   */
  @javax.annotation.Nullable
  public List<PrivilegesEnum> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(@javax.annotation.Nullable List<PrivilegesEnum> privileges) {
    this.privileges = privileges;
  }


  public SearchUsersRequest accountType(@javax.annotation.Nullable AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Type of the account
   * @return accountType
   */
  @javax.annotation.Nullable
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(@javax.annotation.Nullable AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public SearchUsersRequest accountStatus(@javax.annotation.Nullable AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  /**
   * Current status of the user account.
   * @return accountStatus
   */
  @javax.annotation.Nullable
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(@javax.annotation.Nullable AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }


  public SearchUsersRequest notifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
    return this;
  }

  /**
   * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
   * @return notifyOnShare
   */
  @javax.annotation.Nullable
  public Boolean getNotifyOnShare() {
    return notifyOnShare;
  }

  public void setNotifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
  }


  public SearchUsersRequest showOnboardingExperience(@javax.annotation.Nullable Boolean showOnboardingExperience) {
    this.showOnboardingExperience = showOnboardingExperience;
    return this;
  }

  /**
   * The user preference for revisiting the onboarding experience
   * @return showOnboardingExperience
   */
  @javax.annotation.Nullable
  public Boolean getShowOnboardingExperience() {
    return showOnboardingExperience;
  }

  public void setShowOnboardingExperience(@javax.annotation.Nullable Boolean showOnboardingExperience) {
    this.showOnboardingExperience = showOnboardingExperience;
  }


  public SearchUsersRequest onboardingExperienceCompleted(@javax.annotation.Nullable Boolean onboardingExperienceCompleted) {
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
    return this;
  }

  /**
   * Indicates if the user has completed the onboarding walkthrough
   * @return onboardingExperienceCompleted
   */
  @javax.annotation.Nullable
  public Boolean getOnboardingExperienceCompleted() {
    return onboardingExperienceCompleted;
  }

  public void setOnboardingExperienceCompleted(@javax.annotation.Nullable Boolean onboardingExperienceCompleted) {
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
  }


  public SearchUsersRequest orgIdentifiers(@javax.annotation.Nullable List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
    return this;
  }

  public SearchUsersRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
    if (this.orgIdentifiers == null) {
      this.orgIdentifiers = new ArrayList<>();
    }
    this.orgIdentifiers.add(orgIdentifiersItem);
    return this;
  }

  /**
   * IDs or names of the Orgs to which the user belongs
   * @return orgIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getOrgIdentifiers() {
    return orgIdentifiers;
  }

  public void setOrgIdentifiers(@javax.annotation.Nullable List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
  }


  public SearchUsersRequest homeLiveboardIdentifier(@javax.annotation.Nullable String homeLiveboardIdentifier) {
    this.homeLiveboardIdentifier = homeLiveboardIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the user&#39;s home Liveboard.
   * @return homeLiveboardIdentifier
   */
  @javax.annotation.Nullable
  public String getHomeLiveboardIdentifier() {
    return homeLiveboardIdentifier;
  }

  public void setHomeLiveboardIdentifier(@javax.annotation.Nullable String homeLiveboardIdentifier) {
    this.homeLiveboardIdentifier = homeLiveboardIdentifier;
  }


  public SearchUsersRequest favoriteMetadata(@javax.annotation.Nullable List<FavoriteMetadataInput> favoriteMetadata) {
    this.favoriteMetadata = favoriteMetadata;
    return this;
  }

  public SearchUsersRequest addFavoriteMetadataItem(FavoriteMetadataInput favoriteMetadataItem) {
    if (this.favoriteMetadata == null) {
      this.favoriteMetadata = new ArrayList<>();
    }
    this.favoriteMetadata.add(favoriteMetadataItem);
    return this;
  }

  /**
   * Metadata objects which are assigned as favorites of the user.
   * @return favoriteMetadata
   */
  @javax.annotation.Nullable
  public List<FavoriteMetadataInput> getFavoriteMetadata() {
    return favoriteMetadata;
  }

  public void setFavoriteMetadata(@javax.annotation.Nullable List<FavoriteMetadataInput> favoriteMetadata) {
    this.favoriteMetadata = favoriteMetadata;
  }


  public SearchUsersRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
    return this;
  }

  /**
   * The starting record number from where the records should be included.
   * @return recordOffset
   */
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }

  public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public SearchUsersRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
    return this;
  }

  /**
   * The number of records that should be included.
   * @return recordSize
   */
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }

  public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
  }


  public SearchUsersRequest sortOptions(@javax.annotation.Nullable SortOptions sortOptions) {
    this.sortOptions = sortOptions;
    return this;
  }

  /**
   * Sort options.
   * @return sortOptions
   */
  @javax.annotation.Nullable
  public SortOptions getSortOptions() {
    return sortOptions;
  }

  public void setSortOptions(@javax.annotation.Nullable SortOptions sortOptions) {
    this.sortOptions = sortOptions;
  }


  public SearchUsersRequest roleIdentifiers(@javax.annotation.Nullable List<String> roleIdentifiers) {
    this.roleIdentifiers = roleIdentifiers;
    return this;
  }

  public SearchUsersRequest addRoleIdentifiersItem(String roleIdentifiersItem) {
    if (this.roleIdentifiers == null) {
      this.roleIdentifiers = new ArrayList<>();
    }
    this.roleIdentifiers.add(roleIdentifiersItem);
    return this;
  }

  /**
   * Filters by the role assigned to the user.
   * @return roleIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getRoleIdentifiers() {
    return roleIdentifiers;
  }

  public void setRoleIdentifiers(@javax.annotation.Nullable List<String> roleIdentifiers) {
    this.roleIdentifiers = roleIdentifiers;
  }


  public SearchUsersRequest includeFavoriteMetadata(@javax.annotation.Nullable Boolean includeFavoriteMetadata) {
    this.includeFavoriteMetadata = includeFavoriteMetadata;
    return this;
  }

  /**
   * Indicates if the user&#39;s favorite objects should be displayed.
   * @return includeFavoriteMetadata
   */
  @javax.annotation.Nullable
  public Boolean getIncludeFavoriteMetadata() {
    return includeFavoriteMetadata;
  }

  public void setIncludeFavoriteMetadata(@javax.annotation.Nullable Boolean includeFavoriteMetadata) {
    this.includeFavoriteMetadata = includeFavoriteMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUsersRequest searchUsersRequest = (SearchUsersRequest) o;
    return Objects.equals(this.userIdentifier, searchUsersRequest.userIdentifier) &&
        Objects.equals(this.displayName, searchUsersRequest.displayName) &&
        Objects.equals(this.namePattern, searchUsersRequest.namePattern) &&
        Objects.equals(this.visibility, searchUsersRequest.visibility) &&
        Objects.equals(this.email, searchUsersRequest.email) &&
        Objects.equals(this.groupIdentifiers, searchUsersRequest.groupIdentifiers) &&
        Objects.equals(this.privileges, searchUsersRequest.privileges) &&
        Objects.equals(this.accountType, searchUsersRequest.accountType) &&
        Objects.equals(this.accountStatus, searchUsersRequest.accountStatus) &&
        Objects.equals(this.notifyOnShare, searchUsersRequest.notifyOnShare) &&
        Objects.equals(this.showOnboardingExperience, searchUsersRequest.showOnboardingExperience) &&
        Objects.equals(this.onboardingExperienceCompleted, searchUsersRequest.onboardingExperienceCompleted) &&
        Objects.equals(this.orgIdentifiers, searchUsersRequest.orgIdentifiers) &&
        Objects.equals(this.homeLiveboardIdentifier, searchUsersRequest.homeLiveboardIdentifier) &&
        Objects.equals(this.favoriteMetadata, searchUsersRequest.favoriteMetadata) &&
        Objects.equals(this.recordOffset, searchUsersRequest.recordOffset) &&
        Objects.equals(this.recordSize, searchUsersRequest.recordSize) &&
        Objects.equals(this.sortOptions, searchUsersRequest.sortOptions) &&
        Objects.equals(this.roleIdentifiers, searchUsersRequest.roleIdentifiers) &&
        Objects.equals(this.includeFavoriteMetadata, searchUsersRequest.includeFavoriteMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdentifier, displayName, namePattern, visibility, email, groupIdentifiers, privileges, accountType, accountStatus, notifyOnShare, showOnboardingExperience, onboardingExperienceCompleted, orgIdentifiers, homeLiveboardIdentifier, favoriteMetadata, recordOffset, recordSize, sortOptions, roleIdentifiers, includeFavoriteMetadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUsersRequest {\n");
    sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
    sb.append("    showOnboardingExperience: ").append(toIndentedString(showOnboardingExperience)).append("\n");
    sb.append("    onboardingExperienceCompleted: ").append(toIndentedString(onboardingExperienceCompleted)).append("\n");
    sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
    sb.append("    homeLiveboardIdentifier: ").append(toIndentedString(homeLiveboardIdentifier)).append("\n");
    sb.append("    favoriteMetadata: ").append(toIndentedString(favoriteMetadata)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
    sb.append("    roleIdentifiers: ").append(toIndentedString(roleIdentifiers)).append("\n");
    sb.append("    includeFavoriteMetadata: ").append(toIndentedString(includeFavoriteMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("user_identifier");
    openapiFields.add("display_name");
    openapiFields.add("name_pattern");
    openapiFields.add("visibility");
    openapiFields.add("email");
    openapiFields.add("group_identifiers");
    openapiFields.add("privileges");
    openapiFields.add("account_type");
    openapiFields.add("account_status");
    openapiFields.add("notify_on_share");
    openapiFields.add("show_onboarding_experience");
    openapiFields.add("onboarding_experience_completed");
    openapiFields.add("org_identifiers");
    openapiFields.add("home_liveboard_identifier");
    openapiFields.add("favorite_metadata");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("sort_options");
    openapiFields.add("role_identifiers");
    openapiFields.add("include_favorite_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchUsersRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchUsersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchUsersRequest is not found in the empty JSON string", SearchUsersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchUsersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchUsersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("user_identifier") != null && !jsonObj.get("user_identifier").isJsonNull()) && !jsonObj.get("user_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_identifier").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull()) && !jsonObj.get("name_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pattern").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the optional field `visibility`
      if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) {
        VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_identifiers") != null && !jsonObj.get("group_identifiers").isJsonNull() && !jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("privileges") != null && !jsonObj.get("privileges").isJsonNull() && !jsonObj.get("privileges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      // validate the optional field `account_type`
      if (jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) {
        AccountTypeEnum.validateJsonElement(jsonObj.get("account_type"));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      // validate the optional field `account_status`
      if (jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) {
        AccountStatusEnum.validateJsonElement(jsonObj.get("account_status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("org_identifiers") != null && !jsonObj.get("org_identifiers").isJsonNull() && !jsonObj.get("org_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("org_identifiers").toString()));
      }
      if ((jsonObj.get("home_liveboard_identifier") != null && !jsonObj.get("home_liveboard_identifier").isJsonNull()) && !jsonObj.get("home_liveboard_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `home_liveboard_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("home_liveboard_identifier").toString()));
      }
      if (jsonObj.get("favorite_metadata") != null && !jsonObj.get("favorite_metadata").isJsonNull()) {
        JsonArray jsonArrayfavoriteMetadata = jsonObj.getAsJsonArray("favorite_metadata");
        if (jsonArrayfavoriteMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("favorite_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `favorite_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("favorite_metadata").toString()));
          }

          // validate the optional field `favorite_metadata` (array)
          for (int i = 0; i < jsonArrayfavoriteMetadata.size(); i++) {
            FavoriteMetadataInput.validateJsonElement(jsonArrayfavoriteMetadata.get(i));
          };
        }
      }
      // validate the optional field `sort_options`
      if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
        SortOptions.validateJsonElement(jsonObj.get("sort_options"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("role_identifiers") != null && !jsonObj.get("role_identifiers").isJsonNull() && !jsonObj.get("role_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("role_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchUsersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchUsersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchUsersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchUsersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchUsersRequest>() {
           @Override
           public void write(JsonWriter out, SearchUsersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchUsersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchUsersRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchUsersRequest
   * @throws IOException if the JSON string is invalid with respect to SearchUsersRequest
   */
  public static SearchUsersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchUsersRequest.class);
  }

  /**
   * Convert an instance of SearchUsersRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

