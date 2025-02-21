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
 * ImportUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T09:43:29.263117728Z[Etc/UTC]")
public class ImportUser {
  public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
  private String userIdentifier;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

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
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType = AccountTypeEnum.LOCAL_USER;

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
  }

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AccountStatusEnum accountStatus = AccountStatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
  private List<String> orgIdentifiers;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  private List<String> groupIdentifiers;

  /**
   * Visibility of the users. The SHARABLE property makes a user visible to other users and group, who can share objects with the user.
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

  public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
  private Boolean notifyOnShare = true;

  public static final String SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE = "show_onboarding_experience";
  @SerializedName(SERIALIZED_NAME_SHOW_ONBOARDING_EXPERIENCE)
  private Boolean showOnboardingExperience;

  public static final String SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED = "onboarding_experience_completed";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_EXPERIENCE_COMPLETED)
  private Boolean onboardingExperienceCompleted;

  public static final String SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER = "home_liveboard_identifier";
  @SerializedName(SERIALIZED_NAME_HOME_LIVEBOARD_IDENTIFIER)
  private String homeLiveboardIdentifier;

  public static final String SERIALIZED_NAME_FAVORITE_METADATA = "favorite_metadata";
  @SerializedName(SERIALIZED_NAME_FAVORITE_METADATA)
  private List<FavoriteMetadataInput> favoriteMetadata;

  public ImportUser() {
  }

  public ImportUser userIdentifier(String userIdentifier) {
    
    this.userIdentifier = userIdentifier;
    return this;
  }

   /**
   * Unique ID or name of the user.
   * @return userIdentifier
  **/
  @javax.annotation.Nonnull
  public String getUserIdentifier() {
    return userIdentifier;
  }


  public void setUserIdentifier(String userIdentifier) {
    this.userIdentifier = userIdentifier;
  }


  public ImportUser displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the user.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ImportUser password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password of the user.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ImportUser accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of the user account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public ImportUser accountStatus(AccountStatusEnum accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Status of the user account.
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }


  public ImportUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the user.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ImportUser orgIdentifiers(List<String> orgIdentifiers) {
    
    this.orgIdentifiers = orgIdentifiers;
    return this;
  }

  public ImportUser addOrgIdentifiersItem(String orgIdentifiersItem) {
    if (this.orgIdentifiers == null) {
      this.orgIdentifiers = new ArrayList<>();
    }
    this.orgIdentifiers.add(orgIdentifiersItem);
    return this;
  }

   /**
   * ID or name of the Orgs to which the user belongs.
   * @return orgIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getOrgIdentifiers() {
    return orgIdentifiers;
  }


  public void setOrgIdentifiers(List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
  }


  public ImportUser groupIdentifiers(List<String> groupIdentifiers) {
    
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public ImportUser addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

   /**
   * ID or name of the groups to which the user belongs.
   * @return groupIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }


  public void setGroupIdentifiers(List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }


  public ImportUser visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Visibility of the users. The SHARABLE property makes a user visible to other users and group, who can share objects with the user.
   * @return visibility
  **/
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public ImportUser notifyOnShare(Boolean notifyOnShare) {
    
    this.notifyOnShare = notifyOnShare;
    return this;
  }

   /**
   * Notify user when other users or groups share metadata objects
   * @return notifyOnShare
  **/
  @javax.annotation.Nullable
  public Boolean getNotifyOnShare() {
    return notifyOnShare;
  }


  public void setNotifyOnShare(Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
  }


  public ImportUser showOnboardingExperience(Boolean showOnboardingExperience) {
    
    this.showOnboardingExperience = showOnboardingExperience;
    return this;
  }

   /**
   * Show or hide the new user onboarding walkthroughs
   * @return showOnboardingExperience
  **/
  @javax.annotation.Nullable
  public Boolean getShowOnboardingExperience() {
    return showOnboardingExperience;
  }


  public void setShowOnboardingExperience(Boolean showOnboardingExperience) {
    this.showOnboardingExperience = showOnboardingExperience;
  }


  public ImportUser onboardingExperienceCompleted(Boolean onboardingExperienceCompleted) {
    
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
    return this;
  }

   /**
   * Revisit the new user onboarding walkthroughs
   * @return onboardingExperienceCompleted
  **/
  @javax.annotation.Nullable
  public Boolean getOnboardingExperienceCompleted() {
    return onboardingExperienceCompleted;
  }


  public void setOnboardingExperienceCompleted(Boolean onboardingExperienceCompleted) {
    this.onboardingExperienceCompleted = onboardingExperienceCompleted;
  }


  public ImportUser homeLiveboardIdentifier(String homeLiveboardIdentifier) {
    
    this.homeLiveboardIdentifier = homeLiveboardIdentifier;
    return this;
  }

   /**
   * Unique ID or name of the default Liveboard assigned to the user.
   * @return homeLiveboardIdentifier
  **/
  @javax.annotation.Nullable
  public String getHomeLiveboardIdentifier() {
    return homeLiveboardIdentifier;
  }


  public void setHomeLiveboardIdentifier(String homeLiveboardIdentifier) {
    this.homeLiveboardIdentifier = homeLiveboardIdentifier;
  }


  public ImportUser favoriteMetadata(List<FavoriteMetadataInput> favoriteMetadata) {
    
    this.favoriteMetadata = favoriteMetadata;
    return this;
  }

  public ImportUser addFavoriteMetadataItem(FavoriteMetadataInput favoriteMetadataItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportUser importUser = (ImportUser) o;
    return Objects.equals(this.userIdentifier, importUser.userIdentifier) &&
        Objects.equals(this.displayName, importUser.displayName) &&
        Objects.equals(this.password, importUser.password) &&
        Objects.equals(this.accountType, importUser.accountType) &&
        Objects.equals(this.accountStatus, importUser.accountStatus) &&
        Objects.equals(this.email, importUser.email) &&
        Objects.equals(this.orgIdentifiers, importUser.orgIdentifiers) &&
        Objects.equals(this.groupIdentifiers, importUser.groupIdentifiers) &&
        Objects.equals(this.visibility, importUser.visibility) &&
        Objects.equals(this.notifyOnShare, importUser.notifyOnShare) &&
        Objects.equals(this.showOnboardingExperience, importUser.showOnboardingExperience) &&
        Objects.equals(this.onboardingExperienceCompleted, importUser.onboardingExperienceCompleted) &&
        Objects.equals(this.homeLiveboardIdentifier, importUser.homeLiveboardIdentifier) &&
        Objects.equals(this.favoriteMetadata, importUser.favoriteMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdentifier, displayName, password, accountType, accountStatus, email, orgIdentifiers, groupIdentifiers, visibility, notifyOnShare, showOnboardingExperience, onboardingExperienceCompleted, homeLiveboardIdentifier, favoriteMetadata);
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
    sb.append("class ImportUser {\n");
    sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
    sb.append("    showOnboardingExperience: ").append(toIndentedString(showOnboardingExperience)).append("\n");
    sb.append("    onboardingExperienceCompleted: ").append(toIndentedString(onboardingExperienceCompleted)).append("\n");
    sb.append("    homeLiveboardIdentifier: ").append(toIndentedString(homeLiveboardIdentifier)).append("\n");
    sb.append("    favoriteMetadata: ").append(toIndentedString(favoriteMetadata)).append("\n");
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
    openapiFields.add("password");
    openapiFields.add("account_type");
    openapiFields.add("account_status");
    openapiFields.add("email");
    openapiFields.add("org_identifiers");
    openapiFields.add("group_identifiers");
    openapiFields.add("visibility");
    openapiFields.add("notify_on_share");
    openapiFields.add("show_onboarding_experience");
    openapiFields.add("onboarding_experience_completed");
    openapiFields.add("home_liveboard_identifier");
    openapiFields.add("favorite_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_identifier");
    openapiRequiredFields.add("display_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImportUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportUser is not found in the empty JSON string", ImportUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("user_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_identifier").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("org_identifiers") != null && !jsonObj.get("org_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("org_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_identifiers") != null && !jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportUser.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportUser>() {
           @Override
           public void write(JsonWriter out, ImportUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportUser
  * @throws IOException if the JSON string is invalid with respect to ImportUser
  */
  public static ImportUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportUser.class);
  }

 /**
  * Convert an instance of ImportUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

