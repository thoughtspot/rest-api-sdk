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
import org.thoughtspot.client.model.UserParameterOptions;
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
 * GetFullAccessTokenRequest
 */

public class GetFullAccessTokenRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nonnull
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nullable
  private String password = "";

  public static final String SERIALIZED_NAME_SECRET_KEY = "secret_key";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  @javax.annotation.Nullable
  private String secretKey = "";

  public static final String SERIALIZED_NAME_VALIDITY_TIME_IN_SEC = "validity_time_in_sec";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIME_IN_SEC)
  @javax.annotation.Nullable
  private Integer validityTimeInSec = 300;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  @javax.annotation.Nullable
  private Integer orgId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_AUTO_CREATE = "auto_create";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE)
  @javax.annotation.Nullable
  private Boolean autoCreate = false;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> groupIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_PARAMETERS = "user_parameters";
  @SerializedName(SERIALIZED_NAME_USER_PARAMETERS)
  @javax.annotation.Nullable
  private UserParameterOptions userParameters;

  public GetFullAccessTokenRequest() {
  }

  public GetFullAccessTokenRequest username(@javax.annotation.Nonnull String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of the ThoughtSpot user. The username is stored in the &#x60;name&#x60; attribute of the user object.
   * @return username
   */
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nonnull String username) {
    this.username = username;
  }


  public GetFullAccessTokenRequest password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the user account
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public GetFullAccessTokenRequest secretKey(@javax.annotation.Nullable String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  /**
   * The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled.
   * @return secretKey
   */
  @javax.annotation.Nullable
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(@javax.annotation.Nullable String secretKey) {
    this.secretKey = secretKey;
  }


  public GetFullAccessTokenRequest validityTimeInSec(@javax.annotation.Nullable Integer validityTimeInSec) {
    this.validityTimeInSec = validityTimeInSec;
    return this;
  }

  /**
   * Token validity duration in seconds
   * @return validityTimeInSec
   */
  @javax.annotation.Nullable
  public Integer getValidityTimeInSec() {
    return validityTimeInSec;
  }

  public void setValidityTimeInSec(@javax.annotation.Nullable Integer validityTimeInSec) {
    this.validityTimeInSec = validityTimeInSec;
  }


  public GetFullAccessTokenRequest orgId(@javax.annotation.Nullable Integer orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session.
   * @return orgId
   */
  @javax.annotation.Nullable
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(@javax.annotation.Nullable Integer orgId) {
    this.orgId = orgId;
  }


  public GetFullAccessTokenRequest email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning).
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public GetFullAccessTokenRequest displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Indicates display name of the user. Use this parameter to provision a user just-in-time (JIT).
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public GetFullAccessTokenRequest autoCreate(@javax.annotation.Nullable Boolean autoCreate) {
    this.autoCreate = autoCreate;
    return this;
  }

  /**
   *    Creates a new user if the specified username does not already exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required. 
   * @return autoCreate
   */
  @javax.annotation.Nullable
  public Boolean getAutoCreate() {
    return autoCreate;
  }

  public void setAutoCreate(@javax.annotation.Nullable Boolean autoCreate) {
    this.autoCreate = autoCreate;
  }


  public GetFullAccessTokenRequest groupIdentifiers(@javax.annotation.Nullable List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public GetFullAccessTokenRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

  /**
   * ID or name of the groups to which the newly created user belongs. Use this parameter to provision a user just-in-time (JIT).
   * @return groupIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }

  public void setGroupIdentifiers(@javax.annotation.Nullable List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }


  public GetFullAccessTokenRequest userParameters(@javax.annotation.Nullable UserParameterOptions userParameters) {
    this.userParameters = userParameters;
    return this;
  }

  /**
   * &lt;div&gt;Deprecated: 10.4.0.cl and later &lt;/div&gt;  Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).
   * @return userParameters
   */
  @javax.annotation.Nullable
  public UserParameterOptions getUserParameters() {
    return userParameters;
  }

  public void setUserParameters(@javax.annotation.Nullable UserParameterOptions userParameters) {
    this.userParameters = userParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFullAccessTokenRequest getFullAccessTokenRequest = (GetFullAccessTokenRequest) o;
    return Objects.equals(this.username, getFullAccessTokenRequest.username) &&
        Objects.equals(this.password, getFullAccessTokenRequest.password) &&
        Objects.equals(this.secretKey, getFullAccessTokenRequest.secretKey) &&
        Objects.equals(this.validityTimeInSec, getFullAccessTokenRequest.validityTimeInSec) &&
        Objects.equals(this.orgId, getFullAccessTokenRequest.orgId) &&
        Objects.equals(this.email, getFullAccessTokenRequest.email) &&
        Objects.equals(this.displayName, getFullAccessTokenRequest.displayName) &&
        Objects.equals(this.autoCreate, getFullAccessTokenRequest.autoCreate) &&
        Objects.equals(this.groupIdentifiers, getFullAccessTokenRequest.groupIdentifiers) &&
        Objects.equals(this.userParameters, getFullAccessTokenRequest.userParameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, secretKey, validityTimeInSec, orgId, email, displayName, autoCreate, groupIdentifiers, userParameters);
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
    sb.append("class GetFullAccessTokenRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    validityTimeInSec: ").append(toIndentedString(validityTimeInSec)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    autoCreate: ").append(toIndentedString(autoCreate)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
    sb.append("    userParameters: ").append(toIndentedString(userParameters)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("secret_key");
    openapiFields.add("validity_time_in_sec");
    openapiFields.add("org_id");
    openapiFields.add("email");
    openapiFields.add("display_name");
    openapiFields.add("auto_create");
    openapiFields.add("group_identifiers");
    openapiFields.add("user_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetFullAccessTokenRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFullAccessTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFullAccessTokenRequest is not found in the empty JSON string", GetFullAccessTokenRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFullAccessTokenRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFullAccessTokenRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetFullAccessTokenRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("secret_key") != null && !jsonObj.get("secret_key").isJsonNull()) && !jsonObj.get("secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_key").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_identifiers") != null && !jsonObj.get("group_identifiers").isJsonNull() && !jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
      }
      // validate the optional field `user_parameters`
      if (jsonObj.get("user_parameters") != null && !jsonObj.get("user_parameters").isJsonNull()) {
        UserParameterOptions.validateJsonElement(jsonObj.get("user_parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFullAccessTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFullAccessTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFullAccessTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFullAccessTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFullAccessTokenRequest>() {
           @Override
           public void write(JsonWriter out, GetFullAccessTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFullAccessTokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFullAccessTokenRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFullAccessTokenRequest
   * @throws IOException if the JSON string is invalid with respect to GetFullAccessTokenRequest
   */
  public static GetFullAccessTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFullAccessTokenRequest.class);
  }

  /**
   * Convert an instance of GetFullAccessTokenRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

