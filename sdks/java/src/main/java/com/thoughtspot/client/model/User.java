/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.model.FavoriteMetadataItem;
import com.thoughtspot.client.model.ObjectIDAndName;
import com.thoughtspot.client.model.Org;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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

import com.thoughtspot.client.JSON;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nonnull
  private String displayName;

  /**
   * Visibility of the users. The &#x60;SHARABLE&#x60; property makes a user visible to other users and group, who can share objects with the user.
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
  @javax.annotation.Nonnull
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  @javax.annotation.Nullable
  private String authorId;

  public static final String SERIALIZED_NAME_CAN_CHANGE_PASSWORD = "can_change_password";
  @SerializedName(SERIALIZED_NAME_CAN_CHANGE_PASSWORD)
  @javax.annotation.Nullable
  private Boolean canChangePassword;

  public static final String SERIALIZED_NAME_COMPLETE_DETAIL = "complete_detail";
  @SerializedName(SERIALIZED_NAME_COMPLETE_DETAIL)
  @javax.annotation.Nullable
  private Boolean completeDetail;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_CURRENT_ORG = "current_org";
  @SerializedName(SERIALIZED_NAME_CURRENT_ORG)
  @javax.annotation.Nullable
  private Org currentOrg;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  @javax.annotation.Nullable
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  @javax.annotation.Nullable
  private Boolean deprecated;

  /**
   * Type of the user account.
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
      return null;
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
   * Status of the user account.
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
      return null;
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

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS = "expiration_time_in_millis";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Float expirationTimeInMillis;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  @javax.annotation.Nullable
  private Boolean external;

  public static final String SERIALIZED_NAME_FAVORITE_METADATA = "favorite_metadata";
  @SerializedName(SERIALIZED_NAME_FAVORITE_METADATA)
  @javax.annotation.Nullable
  private List<FavoriteMetadataItem> favoriteMetadata;

  public static final String SERIALIZED_NAME_FIRST_LOGIN_TIME_IN_MILLIS = "first_login_time_in_millis";
  @SerializedName(SERIALIZED_NAME_FIRST_LOGIN_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Float firstLoginTimeInMillis;

  public static final String SERIALIZED_NAME_GROUP_MASK = "group_mask";
  @SerializedName(SERIALIZED_NAME_GROUP_MASK)
  @javax.annotation.Nullable
  private Integer groupMask;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  @javax.annotation.Nullable
  private Boolean hidden;

  public static final String SERIALIZED_NAME_HOME_LIVEBOARD = "home_liveboard";
  @SerializedName(SERIALIZED_NAME_HOME_LIVEBOARD)
  @javax.annotation.Nullable
  private ObjectIDAndName homeLiveboard;

  public static final String SERIALIZED_NAME_INCOMPLETE_DETAILS = "incomplete_details";
  @SerializedName(SERIALIZED_NAME_INCOMPLETE_DETAILS)
  @javax.annotation.Nullable
  private Object incompleteDetails;

  public static final String SERIALIZED_NAME_IS_FIRST_LOGIN = "is_first_login";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_LOGIN)
  @javax.annotation.Nullable
  private Boolean isFirstLogin;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS = "modification_time_in_millis";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Float modificationTimeInMillis;

  public static final String SERIALIZED_NAME_MODIFIER_ID = "modifier_id";
  @SerializedName(SERIALIZED_NAME_MODIFIER_ID)
  @javax.annotation.Nullable
  private String modifierId;

  public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
  @javax.annotation.Nullable
  private Boolean notifyOnShare;

  public static final String SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED = "onboarding_experience_completed";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED)
  @javax.annotation.Nullable
  private Boolean onboardingExperienceCompleted;

  public static final String SERIALIZED_NAME_ORGS = "orgs";
  @SerializedName(SERIALIZED_NAME_ORGS)
  @javax.annotation.Nullable
  private List<Org> orgs;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  @javax.annotation.Nullable
  private String ownerId;

  /**
   * Parent type of the user.
   */
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
      public void write(final JsonWriter jsonWriter, final ParentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ParentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
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

  public static final String SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE = "show_onboarding_experience";
  @SerializedName(SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE)
  @javax.annotation.Nullable
  private Boolean showOnboardingExperience;

  public static final String SERIALIZED_NAME_SUPER_USER = "super_user";
  @SerializedName(SERIALIZED_NAME_SUPER_USER)
  @javax.annotation.Nullable
  private Boolean superUser;

  public static final String SERIALIZED_NAME_SYSTEM_USER = "system_user";
  @SerializedName(SERIALIZED_NAME_SYSTEM_USER)
  @javax.annotation.Nullable
  private Boolean systemUser;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<ObjectIDAndName> tags;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nullable
  private String tenantId;

  public static final String SERIALIZED_NAME_USER_GROUPS = "user_groups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  @javax.annotation.Nullable
  private List<ObjectIDAndName> userGroups;

  public static final String SERIALIZED_NAME_USER_INHERITED_GROUPS = "user_inherited_groups";
  @SerializedName(SERIALIZED_NAME_USER_INHERITED_GROUPS)
  @javax.annotation.Nullable
  private List<ObjectIDAndName> userInheritedGroups;

  public static final String SERIALIZED_NAME_WELCOME_EMAIL_SENT = "welcome_email_sent";
  @SerializedName(SERIALIZED_NAME_WELCOME_EMAIL_SENT)
  @javax.annotation.Nullable
  private Boolean welcomeEmailSent;

  public static final String SERIALIZED_NAME_ORG_PRIVILEGES = "org_privileges";
  @SerializedName(SERIALIZED_NAME_ORG_PRIVILEGES)
  @javax.annotation.Nullable
  private Object orgPrivileges;

  public static final String SERIALIZED_NAME_PREFERRED_LOCALE = "preferred_locale";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LOCALE)
  @javax.annotation.Nullable
  private String preferredLocale;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  @javax.annotation.Nullable
  private Object extendedProperties;

  public static final String SERIALIZED_NAME_EXTENDED_PREFERENCES = "extended_preferences";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PREFERENCES)
  @javax.annotation.Nullable
  private Object extendedPreferences;

  public static final String SERIALIZED_NAME_USER_PARAMETERS = "user_parameters";
  @SerializedName(SERIALIZED_NAME_USER_PARAMETERS)
  @javax.annotation.Nullable
  private Object userParameters;

  public static final String SERIALIZED_NAME_ACCESS_CONTROL_PROPERTIES = "access_control_properties";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROL_PROPERTIES)
  @javax.annotation.Nullable
  private Object accessControlProperties;

  public static final String SERIALIZED_NAME_VARIABLE_VALUES = "variable_values";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUES)
  @javax.annotation.Nullable
  private Object variableValues;

  public User() {
  }

  public User id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the user.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public User name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the user.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public User displayName(@javax.annotation.Nonnull String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the user.
   * @return displayName
   */
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nonnull String displayName) {
    this.displayName = displayName;
  }


  public User visibility(@javax.annotation.Nonnull VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the users. The &#x60;SHARABLE&#x60; property makes a user visible to other users and group, who can share objects with the user.
   * @return visibility
   */
  @javax.annotation.Nonnull
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@javax.annotation.Nonnull VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public User authorId(@javax.annotation.Nullable String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Unique identifier of author of the user.
   * @return authorId
   */
  @javax.annotation.Nullable
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(@javax.annotation.Nullable String authorId) {
    this.authorId = authorId;
  }


  public User canChangePassword(@javax.annotation.Nullable Boolean canChangePassword) {
    this.canChangePassword = canChangePassword;
    return this;
  }

  /**
   * Defines whether the user can change their password.
   * @return canChangePassword
   */
  @javax.annotation.Nullable
  public Boolean getCanChangePassword() {
    return canChangePassword;
  }

  public void setCanChangePassword(@javax.annotation.Nullable Boolean canChangePassword) {
    this.canChangePassword = canChangePassword;
  }


  public User completeDetail(@javax.annotation.Nullable Boolean completeDetail) {
    this.completeDetail = completeDetail;
    return this;
  }

  /**
   * Defines whether the response has complete detail of the user.
   * @return completeDetail
   */
  @javax.annotation.Nullable
  public Boolean getCompleteDetail() {
    return completeDetail;
  }

  public void setCompleteDetail(@javax.annotation.Nullable Boolean completeDetail) {
    this.completeDetail = completeDetail;
  }


  public User creationTimeInMillis(@javax.annotation.Nullable Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

  /**
   * Creation time of the user in milliseconds.
   * @return creationTimeInMillis
   */
  @javax.annotation.Nullable
  public Float getCreationTimeInMillis() {
    return creationTimeInMillis;
  }

  public void setCreationTimeInMillis(@javax.annotation.Nullable Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public User currentOrg(@javax.annotation.Nullable Org currentOrg) {
    this.currentOrg = currentOrg;
    return this;
  }

  /**
   * Get currentOrg
   * @return currentOrg
   */
  @javax.annotation.Nullable
  public Org getCurrentOrg() {
    return currentOrg;
  }

  public void setCurrentOrg(@javax.annotation.Nullable Org currentOrg) {
    this.currentOrg = currentOrg;
  }


  public User deleted(@javax.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Indicates whether the user is deleted.
   * @return deleted
   */
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(@javax.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
  }


  public User deprecated(@javax.annotation.Nullable Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Indicates whether the user is deprecated.
   * @return deprecated
   */
  @javax.annotation.Nullable
  public Boolean getDeprecated() {
    return deprecated;
  }

  public void setDeprecated(@javax.annotation.Nullable Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public User accountType(@javax.annotation.Nullable AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Type of the user account.
   * @return accountType
   */
  @javax.annotation.Nullable
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(@javax.annotation.Nullable AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public User accountStatus(@javax.annotation.Nullable AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  /**
   * Status of the user account.
   * @return accountStatus
   */
  @javax.annotation.Nullable
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(@javax.annotation.Nullable AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }


  public User email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the user.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public User expirationTimeInMillis(@javax.annotation.Nullable Float expirationTimeInMillis) {
    this.expirationTimeInMillis = expirationTimeInMillis;
    return this;
  }

  /**
   * Expiration time of the user in milliseconds.
   * @return expirationTimeInMillis
   */
  @javax.annotation.Nullable
  public Float getExpirationTimeInMillis() {
    return expirationTimeInMillis;
  }

  public void setExpirationTimeInMillis(@javax.annotation.Nullable Float expirationTimeInMillis) {
    this.expirationTimeInMillis = expirationTimeInMillis;
  }


  public User external(@javax.annotation.Nullable Boolean external) {
    this.external = external;
    return this;
  }

  /**
   * Indicates whether the user is external.
   * @return external
   */
  @javax.annotation.Nullable
  public Boolean getExternal() {
    return external;
  }

  public void setExternal(@javax.annotation.Nullable Boolean external) {
    this.external = external;
  }


  public User favoriteMetadata(@javax.annotation.Nullable List<FavoriteMetadataItem> favoriteMetadata) {
    this.favoriteMetadata = favoriteMetadata;
    return this;
  }

  public User addFavoriteMetadataItem(FavoriteMetadataItem favoriteMetadataItem) {
    if (this.favoriteMetadata == null) {
      this.favoriteMetadata = new ArrayList<>();
    }
    this.favoriteMetadata.add(favoriteMetadataItem);
    return this;
  }

  /**
   * Metadata objects to add to the users&#39; favorites list.
   * @return favoriteMetadata
   */
  @javax.annotation.Nullable
  public List<FavoriteMetadataItem> getFavoriteMetadata() {
    return favoriteMetadata;
  }

  public void setFavoriteMetadata(@javax.annotation.Nullable List<FavoriteMetadataItem> favoriteMetadata) {
    this.favoriteMetadata = favoriteMetadata;
  }


  public User firstLoginTimeInMillis(@javax.annotation.Nullable Float firstLoginTimeInMillis) {
    this.firstLoginTimeInMillis = firstLoginTimeInMillis;
    return this;
  }

  /**
   * Timestamp of the first login session of the user in milliseconds.
   * @return firstLoginTimeInMillis
   */
  @javax.annotation.Nullable
  public Float getFirstLoginTimeInMillis() {
    return firstLoginTimeInMillis;
  }

  public void setFirstLoginTimeInMillis(@javax.annotation.Nullable Float firstLoginTimeInMillis) {
    this.firstLoginTimeInMillis = firstLoginTimeInMillis;
  }


  public User groupMask(@javax.annotation.Nullable Integer groupMask) {
    this.groupMask = groupMask;
    return this;
  }

  /**
   * Group mask of the user.
   * @return groupMask
   */
  @javax.annotation.Nullable
  public Integer getGroupMask() {
    return groupMask;
  }

  public void setGroupMask(@javax.annotation.Nullable Integer groupMask) {
    this.groupMask = groupMask;
  }


  public User hidden(@javax.annotation.Nullable Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Indicates whether the user is hidden.
   * @return hidden
   */
  @javax.annotation.Nullable
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(@javax.annotation.Nullable Boolean hidden) {
    this.hidden = hidden;
  }


  public User homeLiveboard(@javax.annotation.Nullable ObjectIDAndName homeLiveboard) {
    this.homeLiveboard = homeLiveboard;
    return this;
  }

  /**
   * Get homeLiveboard
   * @return homeLiveboard
   */
  @javax.annotation.Nullable
  public ObjectIDAndName getHomeLiveboard() {
    return homeLiveboard;
  }

  public void setHomeLiveboard(@javax.annotation.Nullable ObjectIDAndName homeLiveboard) {
    this.homeLiveboard = homeLiveboard;
  }


  public User incompleteDetails(@javax.annotation.Nullable Object incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

  /**
   * Incomplete details of user if any present.
   * @return incompleteDetails
   */
  @javax.annotation.Nullable
  public Object getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(@javax.annotation.Nullable Object incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }


  public User isFirstLogin(@javax.annotation.Nullable Boolean isFirstLogin) {
    this.isFirstLogin = isFirstLogin;
    return this;
  }

  /**
   * Indicates whether it is first login of the user.
   * @return isFirstLogin
   */
  @javax.annotation.Nullable
  public Boolean getIsFirstLogin() {
    return isFirstLogin;
  }

  public void setIsFirstLogin(@javax.annotation.Nullable Boolean isFirstLogin) {
    this.isFirstLogin = isFirstLogin;
  }


  public User modificationTimeInMillis(@javax.annotation.Nullable Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
    return this;
  }

  /**
   * Last modified time of the user in milliseconds.
   * @return modificationTimeInMillis
   */
  @javax.annotation.Nullable
  public Float getModificationTimeInMillis() {
    return modificationTimeInMillis;
  }

  public void setModificationTimeInMillis(@javax.annotation.Nullable Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
  }


  public User modifierId(@javax.annotation.Nullable String modifierId) {
    this.modifierId = modifierId;
    return this;
  }

  /**
   * Unique identifier of modifier of the user.
   * @return modifierId
   */
  @javax.annotation.Nullable
  public String getModifierId() {
    return modifierId;
  }

  public void setModifierId(@javax.annotation.Nullable String modifierId) {
    this.modifierId = modifierId;
  }


  public User notifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
    return this;
  }

  /**
   * User preference for receiving email notifications on shared Answers or Liveboard.
   * @return notifyOnShare
   */
  @javax.annotation.Nullable
  public Boolean getNotifyOnShare() {
    return notifyOnShare;
  }

  public void setNotifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
  }


  public User onboardingExperienceCompleted(@javax.annotation.Nullable Boolean onboardingExperienceCompleted) {
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
    return this;
  }

  /**
   * The user preference for turning off the onboarding experience.
   * @return onboardingExperienceCompleted
   */
  @javax.annotation.Nullable
  public Boolean getOnboardingExperienceCompleted() {
    return onboardingExperienceCompleted;
  }

  public void setOnboardingExperienceCompleted(@javax.annotation.Nullable Boolean onboardingExperienceCompleted) {
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
  }


  public User orgs(@javax.annotation.Nullable List<Org> orgs) {
    this.orgs = orgs;
    return this;
  }

  public User addOrgsItem(Org orgsItem) {
    if (this.orgs == null) {
      this.orgs = new ArrayList<>();
    }
    this.orgs.add(orgsItem);
    return this;
  }

  /**
   * Orgs to which the user belongs.
   * @return orgs
   */
  @javax.annotation.Nullable
  public List<Org> getOrgs() {
    return orgs;
  }

  public void setOrgs(@javax.annotation.Nullable List<Org> orgs) {
    this.orgs = orgs;
  }


  public User ownerId(@javax.annotation.Nullable String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Unique identifier of owner of the user.
   * @return ownerId
   */
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(@javax.annotation.Nullable String ownerId) {
    this.ownerId = ownerId;
  }


  public User parentType(@javax.annotation.Nullable ParentTypeEnum parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Parent type of the user.
   * @return parentType
   */
  @javax.annotation.Nullable
  public ParentTypeEnum getParentType() {
    return parentType;
  }

  public void setParentType(@javax.annotation.Nullable ParentTypeEnum parentType) {
    this.parentType = parentType;
  }


  public User privileges(@javax.annotation.Nullable List<String> privileges) {
    this.privileges = privileges;
    return this;
  }

  public User addPrivilegesItem(String privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

  /**
   * Privileges which are assigned to the user.
   * @return privileges
   */
  @javax.annotation.Nullable
  public List<String> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(@javax.annotation.Nullable List<String> privileges) {
    this.privileges = privileges;
  }


  public User showOnboardingExperience(@javax.annotation.Nullable Boolean showOnboardingExperience) {
    this.showOnboardingExperience = showOnboardingExperience;
    return this;
  }

  /**
   * User&#39;s preference to revisit the new user onboarding experience.
   * @return showOnboardingExperience
   */
  @javax.annotation.Nullable
  public Boolean getShowOnboardingExperience() {
    return showOnboardingExperience;
  }

  public void setShowOnboardingExperience(@javax.annotation.Nullable Boolean showOnboardingExperience) {
    this.showOnboardingExperience = showOnboardingExperience;
  }


  public User superUser(@javax.annotation.Nullable Boolean superUser) {
    this.superUser = superUser;
    return this;
  }

  /**
   * Indicates whether the user is a super user.
   * @return superUser
   */
  @javax.annotation.Nullable
  public Boolean getSuperUser() {
    return superUser;
  }

  public void setSuperUser(@javax.annotation.Nullable Boolean superUser) {
    this.superUser = superUser;
  }


  public User systemUser(@javax.annotation.Nullable Boolean systemUser) {
    this.systemUser = systemUser;
    return this;
  }

  /**
   * Indicates whether the user is a system user.
   * @return systemUser
   */
  @javax.annotation.Nullable
  public Boolean getSystemUser() {
    return systemUser;
  }

  public void setSystemUser(@javax.annotation.Nullable Boolean systemUser) {
    this.systemUser = systemUser;
  }


  public User tags(@javax.annotation.Nullable List<ObjectIDAndName> tags) {
    this.tags = tags;
    return this;
  }

  public User addTagsItem(ObjectIDAndName tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the user.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<ObjectIDAndName> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<ObjectIDAndName> tags) {
    this.tags = tags;
  }


  public User tenantId(@javax.annotation.Nullable String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Unique identifier of tenant of the user.
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(@javax.annotation.Nullable String tenantId) {
    this.tenantId = tenantId;
  }


  public User userGroups(@javax.annotation.Nullable List<ObjectIDAndName> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public User addUserGroupsItem(ObjectIDAndName userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

  /**
   * Groups to which the user is assigned.
   * @return userGroups
   */
  @javax.annotation.Nullable
  public List<ObjectIDAndName> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(@javax.annotation.Nullable List<ObjectIDAndName> userGroups) {
    this.userGroups = userGroups;
  }


  public User userInheritedGroups(@javax.annotation.Nullable List<ObjectIDAndName> userInheritedGroups) {
    this.userInheritedGroups = userInheritedGroups;
    return this;
  }

  public User addUserInheritedGroupsItem(ObjectIDAndName userInheritedGroupsItem) {
    if (this.userInheritedGroups == null) {
      this.userInheritedGroups = new ArrayList<>();
    }
    this.userInheritedGroups.add(userInheritedGroupsItem);
    return this;
  }

  /**
   * Inherited User Groups which the user is part of.
   * @return userInheritedGroups
   */
  @javax.annotation.Nullable
  public List<ObjectIDAndName> getUserInheritedGroups() {
    return userInheritedGroups;
  }

  public void setUserInheritedGroups(@javax.annotation.Nullable List<ObjectIDAndName> userInheritedGroups) {
    this.userInheritedGroups = userInheritedGroups;
  }


  public User welcomeEmailSent(@javax.annotation.Nullable Boolean welcomeEmailSent) {
    this.welcomeEmailSent = welcomeEmailSent;
    return this;
  }

  /**
   * Indicates whether welcome email is sent for the user.
   * @return welcomeEmailSent
   */
  @javax.annotation.Nullable
  public Boolean getWelcomeEmailSent() {
    return welcomeEmailSent;
  }

  public void setWelcomeEmailSent(@javax.annotation.Nullable Boolean welcomeEmailSent) {
    this.welcomeEmailSent = welcomeEmailSent;
  }


  public User orgPrivileges(@javax.annotation.Nullable Object orgPrivileges) {
    this.orgPrivileges = orgPrivileges;
    return this;
  }

  /**
   * Privileges which are assigned to the user with org.
   * @return orgPrivileges
   */
  @javax.annotation.Nullable
  public Object getOrgPrivileges() {
    return orgPrivileges;
  }

  public void setOrgPrivileges(@javax.annotation.Nullable Object orgPrivileges) {
    this.orgPrivileges = orgPrivileges;
  }


  public User preferredLocale(@javax.annotation.Nullable String preferredLocale) {
    this.preferredLocale = preferredLocale;
    return this;
  }

  /**
   * Locale for the user.
   * @return preferredLocale
   */
  @javax.annotation.Nullable
  public String getPreferredLocale() {
    return preferredLocale;
  }

  public void setPreferredLocale(@javax.annotation.Nullable String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }


  public User extendedProperties(@javax.annotation.Nullable Object extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  /**
   * Properties for the user
   * @return extendedProperties
   */
  @javax.annotation.Nullable
  public Object getExtendedProperties() {
    return extendedProperties;
  }

  public void setExtendedProperties(@javax.annotation.Nullable Object extendedProperties) {
    this.extendedProperties = extendedProperties;
  }


  public User extendedPreferences(@javax.annotation.Nullable Object extendedPreferences) {
    this.extendedPreferences = extendedPreferences;
    return this;
  }

  /**
   * Preferences for the user
   * @return extendedPreferences
   */
  @javax.annotation.Nullable
  public Object getExtendedPreferences() {
    return extendedPreferences;
  }

  public void setExtendedPreferences(@javax.annotation.Nullable Object extendedPreferences) {
    this.extendedPreferences = extendedPreferences;
  }


  public User userParameters(@javax.annotation.Nullable Object userParameters) {
    this.userParameters = userParameters;
    return this;
  }

  /**
   * User Parameters which are specified for the user via JWToken
   * @return userParameters
   */
  @javax.annotation.Nullable
  public Object getUserParameters() {
    return userParameters;
  }

  public void setUserParameters(@javax.annotation.Nullable Object userParameters) {
    this.userParameters = userParameters;
  }


  public User accessControlProperties(@javax.annotation.Nullable Object accessControlProperties) {
    this.accessControlProperties = accessControlProperties;
    return this;
  }

  /**
   * Access Control Properties which are specified for the user via JWToken
   * @return accessControlProperties
   */
  @javax.annotation.Nullable
  public Object getAccessControlProperties() {
    return accessControlProperties;
  }

  public void setAccessControlProperties(@javax.annotation.Nullable Object accessControlProperties) {
    this.accessControlProperties = accessControlProperties;
  }


  public User variableValues(@javax.annotation.Nullable Object variableValues) {
    this.variableValues = variableValues;
    return this;
  }

  /**
   * Formula Variables which are specified for the user via JWToken
   * @return variableValues
   */
  @javax.annotation.Nullable
  public Object getVariableValues() {
    return variableValues;
  }

  public void setVariableValues(@javax.annotation.Nullable Object variableValues) {
    this.variableValues = variableValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.visibility, user.visibility) &&
        Objects.equals(this.authorId, user.authorId) &&
        Objects.equals(this.canChangePassword, user.canChangePassword) &&
        Objects.equals(this.completeDetail, user.completeDetail) &&
        Objects.equals(this.creationTimeInMillis, user.creationTimeInMillis) &&
        Objects.equals(this.currentOrg, user.currentOrg) &&
        Objects.equals(this.deleted, user.deleted) &&
        Objects.equals(this.deprecated, user.deprecated) &&
        Objects.equals(this.accountType, user.accountType) &&
        Objects.equals(this.accountStatus, user.accountStatus) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.expirationTimeInMillis, user.expirationTimeInMillis) &&
        Objects.equals(this.external, user.external) &&
        Objects.equals(this.favoriteMetadata, user.favoriteMetadata) &&
        Objects.equals(this.firstLoginTimeInMillis, user.firstLoginTimeInMillis) &&
        Objects.equals(this.groupMask, user.groupMask) &&
        Objects.equals(this.hidden, user.hidden) &&
        Objects.equals(this.homeLiveboard, user.homeLiveboard) &&
        Objects.equals(this.incompleteDetails, user.incompleteDetails) &&
        Objects.equals(this.isFirstLogin, user.isFirstLogin) &&
        Objects.equals(this.modificationTimeInMillis, user.modificationTimeInMillis) &&
        Objects.equals(this.modifierId, user.modifierId) &&
        Objects.equals(this.notifyOnShare, user.notifyOnShare) &&
        Objects.equals(this.onboardingExperienceCompleted, user.onboardingExperienceCompleted) &&
        Objects.equals(this.orgs, user.orgs) &&
        Objects.equals(this.ownerId, user.ownerId) &&
        Objects.equals(this.parentType, user.parentType) &&
        Objects.equals(this.privileges, user.privileges) &&
        Objects.equals(this.showOnboardingExperience, user.showOnboardingExperience) &&
        Objects.equals(this.superUser, user.superUser) &&
        Objects.equals(this.systemUser, user.systemUser) &&
        Objects.equals(this.tags, user.tags) &&
        Objects.equals(this.tenantId, user.tenantId) &&
        Objects.equals(this.userGroups, user.userGroups) &&
        Objects.equals(this.userInheritedGroups, user.userInheritedGroups) &&
        Objects.equals(this.welcomeEmailSent, user.welcomeEmailSent) &&
        Objects.equals(this.orgPrivileges, user.orgPrivileges) &&
        Objects.equals(this.preferredLocale, user.preferredLocale) &&
        Objects.equals(this.extendedProperties, user.extendedProperties) &&
        Objects.equals(this.extendedPreferences, user.extendedPreferences) &&
        Objects.equals(this.userParameters, user.userParameters) &&
        Objects.equals(this.accessControlProperties, user.accessControlProperties) &&
        Objects.equals(this.variableValues, user.variableValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, visibility, authorId, canChangePassword, completeDetail, creationTimeInMillis, currentOrg, deleted, deprecated, accountType, accountStatus, email, expirationTimeInMillis, external, favoriteMetadata, firstLoginTimeInMillis, groupMask, hidden, homeLiveboard, incompleteDetails, isFirstLogin, modificationTimeInMillis, modifierId, notifyOnShare, onboardingExperienceCompleted, orgs, ownerId, parentType, privileges, showOnboardingExperience, superUser, systemUser, tags, tenantId, userGroups, userInheritedGroups, welcomeEmailSent, orgPrivileges, preferredLocale, extendedProperties, extendedPreferences, userParameters, accessControlProperties, variableValues);
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
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    canChangePassword: ").append(toIndentedString(canChangePassword)).append("\n");
    sb.append("    completeDetail: ").append(toIndentedString(completeDetail)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    currentOrg: ").append(toIndentedString(currentOrg)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expirationTimeInMillis: ").append(toIndentedString(expirationTimeInMillis)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    favoriteMetadata: ").append(toIndentedString(favoriteMetadata)).append("\n");
    sb.append("    firstLoginTimeInMillis: ").append(toIndentedString(firstLoginTimeInMillis)).append("\n");
    sb.append("    groupMask: ").append(toIndentedString(groupMask)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    homeLiveboard: ").append(toIndentedString(homeLiveboard)).append("\n");
    sb.append("    incompleteDetails: ").append(toIndentedString(incompleteDetails)).append("\n");
    sb.append("    isFirstLogin: ").append(toIndentedString(isFirstLogin)).append("\n");
    sb.append("    modificationTimeInMillis: ").append(toIndentedString(modificationTimeInMillis)).append("\n");
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
    sb.append("    onboardingExperienceCompleted: ").append(toIndentedString(onboardingExperienceCompleted)).append("\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    showOnboardingExperience: ").append(toIndentedString(showOnboardingExperience)).append("\n");
    sb.append("    superUser: ").append(toIndentedString(superUser)).append("\n");
    sb.append("    systemUser: ").append(toIndentedString(systemUser)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    userInheritedGroups: ").append(toIndentedString(userInheritedGroups)).append("\n");
    sb.append("    welcomeEmailSent: ").append(toIndentedString(welcomeEmailSent)).append("\n");
    sb.append("    orgPrivileges: ").append(toIndentedString(orgPrivileges)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    extendedPreferences: ").append(toIndentedString(extendedPreferences)).append("\n");
    sb.append("    userParameters: ").append(toIndentedString(userParameters)).append("\n");
    sb.append("    accessControlProperties: ").append(toIndentedString(accessControlProperties)).append("\n");
    sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("display_name");
    openapiFields.add("visibility");
    openapiFields.add("author_id");
    openapiFields.add("can_change_password");
    openapiFields.add("complete_detail");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("current_org");
    openapiFields.add("deleted");
    openapiFields.add("deprecated");
    openapiFields.add("account_type");
    openapiFields.add("account_status");
    openapiFields.add("email");
    openapiFields.add("expiration_time_in_millis");
    openapiFields.add("external");
    openapiFields.add("favorite_metadata");
    openapiFields.add("first_login_time_in_millis");
    openapiFields.add("group_mask");
    openapiFields.add("hidden");
    openapiFields.add("home_liveboard");
    openapiFields.add("incomplete_details");
    openapiFields.add("is_first_login");
    openapiFields.add("modification_time_in_millis");
    openapiFields.add("modifier_id");
    openapiFields.add("notify_on_share");
    openapiFields.add("onboarding_experience_completed");
    openapiFields.add("orgs");
    openapiFields.add("owner_id");
    openapiFields.add("parent_type");
    openapiFields.add("privileges");
    openapiFields.add("show_onboarding_experience");
    openapiFields.add("super_user");
    openapiFields.add("system_user");
    openapiFields.add("tags");
    openapiFields.add("tenant_id");
    openapiFields.add("user_groups");
    openapiFields.add("user_inherited_groups");
    openapiFields.add("welcome_email_sent");
    openapiFields.add("org_privileges");
    openapiFields.add("preferred_locale");
    openapiFields.add("extended_properties");
    openapiFields.add("extended_preferences");
    openapiFields.add("user_parameters");
    openapiFields.add("access_control_properties");
    openapiFields.add("variable_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("display_name");
    openapiRequiredFields.add("visibility");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (!jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the required field `visibility`
      VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
      if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull()) && !jsonObj.get("author_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_id").toString()));
      }
      // validate the optional field `current_org`
      if (jsonObj.get("current_org") != null && !jsonObj.get("current_org").isJsonNull()) {
        Org.validateJsonElement(jsonObj.get("current_org"));
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
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
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
            FavoriteMetadataItem.validateJsonElement(jsonArrayfavoriteMetadata.get(i));
          };
        }
      }
      // validate the optional field `home_liveboard`
      if (jsonObj.get("home_liveboard") != null && !jsonObj.get("home_liveboard").isJsonNull()) {
        ObjectIDAndName.validateJsonElement(jsonObj.get("home_liveboard"));
      }
      if ((jsonObj.get("modifier_id") != null && !jsonObj.get("modifier_id").isJsonNull()) && !jsonObj.get("modifier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifier_id").toString()));
      }
      if (jsonObj.get("orgs") != null && !jsonObj.get("orgs").isJsonNull()) {
        JsonArray jsonArrayorgs = jsonObj.getAsJsonArray("orgs");
        if (jsonArrayorgs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orgs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orgs` to be an array in the JSON string but got `%s`", jsonObj.get("orgs").toString()));
          }

          // validate the optional field `orgs` (array)
          for (int i = 0; i < jsonArrayorgs.size(); i++) {
            Org.validateJsonElement(jsonArrayorgs.get(i));
          };
        }
      }
      if ((jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonNull()) && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if ((jsonObj.get("parent_type") != null && !jsonObj.get("parent_type").isJsonNull()) && !jsonObj.get("parent_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_type").toString()));
      }
      // validate the optional field `parent_type`
      if (jsonObj.get("parent_type") != null && !jsonObj.get("parent_type").isJsonNull()) {
        ParentTypeEnum.validateJsonElement(jsonObj.get("parent_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("privileges") != null && !jsonObj.get("privileges").isJsonNull() && !jsonObj.get("privileges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            ObjectIDAndName.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if (jsonObj.get("user_groups") != null && !jsonObj.get("user_groups").isJsonNull()) {
        JsonArray jsonArrayuserGroups = jsonObj.getAsJsonArray("user_groups");
        if (jsonArrayuserGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("user_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `user_groups` to be an array in the JSON string but got `%s`", jsonObj.get("user_groups").toString()));
          }

          // validate the optional field `user_groups` (array)
          for (int i = 0; i < jsonArrayuserGroups.size(); i++) {
            ObjectIDAndName.validateJsonElement(jsonArrayuserGroups.get(i));
          };
        }
      }
      if (jsonObj.get("user_inherited_groups") != null && !jsonObj.get("user_inherited_groups").isJsonNull()) {
        JsonArray jsonArrayuserInheritedGroups = jsonObj.getAsJsonArray("user_inherited_groups");
        if (jsonArrayuserInheritedGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("user_inherited_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `user_inherited_groups` to be an array in the JSON string but got `%s`", jsonObj.get("user_inherited_groups").toString()));
          }

          // validate the optional field `user_inherited_groups` (array)
          for (int i = 0; i < jsonArrayuserInheritedGroups.size(); i++) {
            ObjectIDAndName.validateJsonElement(jsonArrayuserInheritedGroups.get(i));
          };
        }
      }
      if ((jsonObj.get("preferred_locale") != null && !jsonObj.get("preferred_locale").isJsonNull()) && !jsonObj.get("preferred_locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferred_locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferred_locale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws IOException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

  /**
   * Convert an instance of User to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

