/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.FavoriteMetadataInput;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * UpdateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T09:43:29.263117728Z[Etc/UTC]")
public class UpdateUserRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
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
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a transitional state applicable to IAMv2 users only.
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
  }

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AccountStatusEnum accountStatus;

  public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
  private Boolean notifyOnShare;

  public static final String SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE = "show_onboarding_experience";
  @SerializedName(SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE)
  private Boolean showOnboardingExperience;

  public static final String SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED = "onboarding_experience_completed";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED)
  private Boolean onboardingExperienceCompleted;

  /**
   * Type of the account.
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
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  private List<String> groupIdentifiers;

  public static final String SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER = "home_liveboard_identifier";
  @SerializedName(SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER)
  private String homeLiveboardIdentifier;

  public static final String SERIALIZED_NAME_FAVORITE_METADATA = "favorite_metadata";
  @SerializedName(SERIALIZED_NAME_FAVORITE_METADATA)
  private List<FavoriteMetadataInput> favoriteMetadata;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
  private List<String> orgIdentifiers;

  /**
   * Type of update operation. Default operation type is REPLACE
   */
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
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation = OperationEnum.REPLACE;

  /**
   * Locale for the user.
   */
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
    
    EN_IN("en-IN");

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
      public void write(final JsonWriter jsonWriter, final PreferredLocaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PreferredLocaleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PreferredLocaleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PREFERRED_LOCALE = "preferred_locale";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LOCALE)
  private PreferredLocaleEnum preferredLocale;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private Object extendedProperties;

  public static final String SERIALIZED_NAME_EXTENDED_PREFERENCES = "extended_preferences";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PREFERENCES)
  private Object extendedPreferences;

  public UpdateUserRequest() {
  }

  public UpdateUserRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user. The username string must be unique.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateUserRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A unique display name string for the user account, usually their first and last name
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpdateUserRequest visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
   * @return visibility
  **/
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public UpdateUserRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the user account
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateUserRequest accountStatus(AccountStatusEnum accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a transitional state applicable to IAMv2 users only.
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }


  public UpdateUserRequest notifyOnShare(Boolean notifyOnShare) {
    
    this.notifyOnShare = notifyOnShare;
    return this;
  }

   /**
   * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
   * @return notifyOnShare
  **/
  @javax.annotation.Nullable
  public Boolean getNotifyOnShare() {
    return notifyOnShare;
  }


  public void setNotifyOnShare(Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
  }


  public UpdateUserRequest showOnboardingExperience(Boolean showOnboardingExperience) {
    
    this.showOnboardingExperience = showOnboardingExperience;
    return this;
  }

   /**
   * The user preference for revisiting the onboarding experience.
   * @return showOnboardingExperience
  **/
  @javax.annotation.Nullable
  public Boolean getShowOnboardingExperience() {
    return showOnboardingExperience;
  }


  public void setShowOnboardingExperience(Boolean showOnboardingExperience) {
    this.showOnboardingExperience = showOnboardingExperience;
  }


  public UpdateUserRequest onboardingExperienceCompleted(Boolean onboardingExperienceCompleted) {
    
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
    return this;
  }

   /**
   * Indicates if the user has completed the onboarding and allows turning off the onboarding walkthrough.
   * @return onboardingExperienceCompleted
  **/
  @javax.annotation.Nullable
  public Boolean getOnboardingExperienceCompleted() {
    return onboardingExperienceCompleted;
  }


  public void setOnboardingExperienceCompleted(Boolean onboardingExperienceCompleted) {
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
  }


  public UpdateUserRequest accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of the account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public UpdateUserRequest groupIdentifiers(List<String> groupIdentifiers) {
    
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public UpdateUserRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

   /**
   * GUIDs or names of the groups.
   * @return groupIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }


  public void setGroupIdentifiers(List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }


  public UpdateUserRequest homeLiveboardIdentifier(String homeLiveboardIdentifier) {
    
    this.homeLiveboardIdentifier = homeLiveboardIdentifier;
    return this;
  }

   /**
   * GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in.
   * @return homeLiveboardIdentifier
  **/
  @javax.annotation.Nullable
  public String getHomeLiveboardIdentifier() {
    return homeLiveboardIdentifier;
  }


  public void setHomeLiveboardIdentifier(String homeLiveboardIdentifier) {
    this.homeLiveboardIdentifier = homeLiveboardIdentifier;
  }


  public UpdateUserRequest favoriteMetadata(List<FavoriteMetadataInput> favoriteMetadata) {
    
    this.favoriteMetadata = favoriteMetadata;
    return this;
  }

  public UpdateUserRequest addFavoriteMetadataItem(FavoriteMetadataInput favoriteMetadataItem) {
    if (this.favoriteMetadata == null) {
      this.favoriteMetadata = new ArrayList<>();
    }
    this.favoriteMetadata.add(favoriteMetadataItem);
    return this;
  }

   /**
   * Metadata objects to add to the user&#39;s favorites list.
   * @return favoriteMetadata
  **/
  @javax.annotation.Nullable
  public List<FavoriteMetadataInput> getFavoriteMetadata() {
    return favoriteMetadata;
  }


  public void setFavoriteMetadata(List<FavoriteMetadataInput> favoriteMetadata) {
    this.favoriteMetadata = favoriteMetadata;
  }


  public UpdateUserRequest orgIdentifiers(List<String> orgIdentifiers) {
    
    this.orgIdentifiers = orgIdentifiers;
    return this;
  }

  public UpdateUserRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
    if (this.orgIdentifiers == null) {
      this.orgIdentifiers = new ArrayList<>();
    }
    this.orgIdentifiers.add(orgIdentifiersItem);
    return this;
  }

   /**
   * IDs of the Orgs.
   * @return orgIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getOrgIdentifiers() {
    return orgIdentifiers;
  }


  public void setOrgIdentifiers(List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
  }


  public UpdateUserRequest operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Type of update operation. Default operation type is REPLACE
   * @return operation
  **/
  @javax.annotation.Nullable
  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public UpdateUserRequest preferredLocale(PreferredLocaleEnum preferredLocale) {
    
    this.preferredLocale = preferredLocale;
    return this;
  }

   /**
   * Locale for the user.
   * @return preferredLocale
  **/
  @javax.annotation.Nullable
  public PreferredLocaleEnum getPreferredLocale() {
    return preferredLocale;
  }


  public void setPreferredLocale(PreferredLocaleEnum preferredLocale) {
    this.preferredLocale = preferredLocale;
  }


  public UpdateUserRequest extendedProperties(Object extendedProperties) {
    
    this.extendedProperties = extendedProperties;
    return this;
  }

   /**
   * Properties for the user
   * @return extendedProperties
  **/
  @javax.annotation.Nullable
  public Object getExtendedProperties() {
    return extendedProperties;
  }


  public void setExtendedProperties(Object extendedProperties) {
    this.extendedProperties = extendedProperties;
  }


  public UpdateUserRequest extendedPreferences(Object extendedPreferences) {
    
    this.extendedPreferences = extendedPreferences;
    return this;
  }

   /**
   * Preferences for the user
   * @return extendedPreferences
  **/
  @javax.annotation.Nullable
  public Object getExtendedPreferences() {
    return extendedPreferences;
  }


  public void setExtendedPreferences(Object extendedPreferences) {
    this.extendedPreferences = extendedPreferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.name, updateUserRequest.name) &&
        Objects.equals(this.displayName, updateUserRequest.displayName) &&
        Objects.equals(this.visibility, updateUserRequest.visibility) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.accountStatus, updateUserRequest.accountStatus) &&
        Objects.equals(this.notifyOnShare, updateUserRequest.notifyOnShare) &&
        Objects.equals(this.showOnboardingExperience, updateUserRequest.showOnboardingExperience) &&
        Objects.equals(this.onboardingExperienceCompleted, updateUserRequest.onboardingExperienceCompleted) &&
        Objects.equals(this.accountType, updateUserRequest.accountType) &&
        Objects.equals(this.groupIdentifiers, updateUserRequest.groupIdentifiers) &&
        Objects.equals(this.homeLiveboardIdentifier, updateUserRequest.homeLiveboardIdentifier) &&
        Objects.equals(this.favoriteMetadata, updateUserRequest.favoriteMetadata) &&
        Objects.equals(this.orgIdentifiers, updateUserRequest.orgIdentifiers) &&
        Objects.equals(this.operation, updateUserRequest.operation) &&
        Objects.equals(this.preferredLocale, updateUserRequest.preferredLocale) &&
        Objects.equals(this.extendedProperties, updateUserRequest.extendedProperties) &&
        Objects.equals(this.extendedPreferences, updateUserRequest.extendedPreferences);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, visibility, email, accountStatus, notifyOnShare, showOnboardingExperience, onboardingExperienceCompleted, accountType, groupIdentifiers, homeLiveboardIdentifier, favoriteMetadata, orgIdentifiers, operation, preferredLocale, extendedProperties, extendedPreferences);
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
    sb.append("class UpdateUserRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
    sb.append("    showOnboardingExperience: ").append(toIndentedString(showOnboardingExperience)).append("\n");
    sb.append("    onboardingExperienceCompleted: ").append(toIndentedString(onboardingExperienceCompleted)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
    sb.append("    homeLiveboardIdentifier: ").append(toIndentedString(homeLiveboardIdentifier)).append("\n");
    sb.append("    favoriteMetadata: ").append(toIndentedString(favoriteMetadata)).append("\n");
    sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    extendedPreferences: ").append(toIndentedString(extendedPreferences)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("display_name");
    openapiFields.add("visibility");
    openapiFields.add("email");
    openapiFields.add("account_status");
    openapiFields.add("notify_on_share");
    openapiFields.add("show_onboarding_experience");
    openapiFields.add("onboarding_experience_completed");
    openapiFields.add("account_type");
    openapiFields.add("group_identifiers");
    openapiFields.add("home_liveboard_identifier");
    openapiFields.add("favorite_metadata");
    openapiFields.add("org_identifiers");
    openapiFields.add("operation");
    openapiFields.add("preferred_locale");
    openapiFields.add("extended_properties");
    openapiFields.add("extended_preferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUserRequest is not found in the empty JSON string", UpdateUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_identifiers") != null && !jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
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
            FavoriteMetadataInput.validateJsonObject(jsonArrayfavoriteMetadata.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("org_identifiers") != null && !jsonObj.get("org_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("org_identifiers").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("preferred_locale") != null && !jsonObj.get("preferred_locale").isJsonNull()) && !jsonObj.get("preferred_locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferred_locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferred_locale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserRequest>() {
           @Override
           public void write(JsonWriter out, UpdateUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUserRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateUserRequest
  */
  public static UpdateUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserRequest.class);
  }

 /**
  * Convert an instance of UpdateUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

