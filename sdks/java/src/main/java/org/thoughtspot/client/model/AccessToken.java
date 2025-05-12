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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.OrgInfo;
import org.thoughtspot.client.model.UserInfo;
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
 * AccessToken
 */

public class AccessToken implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nonnull
  private String token;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nonnull
  private OrgInfo org;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @javax.annotation.Nonnull
  private UserInfo user;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS = "expiration_time_in_millis";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float expirationTimeInMillis;

  public AccessToken() {
  }

  public AccessToken id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * GUID of the auth token.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public AccessToken token(@javax.annotation.Nonnull String token) {
    this.token = token;
    return this;
  }

  /**
   * Bearer auth token.
   * @return token
   */
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nonnull String token) {
    this.token = token;
  }


  public AccessToken org(@javax.annotation.Nonnull OrgInfo org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nonnull
  public OrgInfo getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nonnull OrgInfo org) {
    this.org = org;
  }


  public AccessToken user(@javax.annotation.Nonnull UserInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nonnull
  public UserInfo getUser() {
    return user;
  }

  public void setUser(@javax.annotation.Nonnull UserInfo user) {
    this.user = user;
  }


  public AccessToken creationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

  /**
   * Token creation time in milliseconds.
   * @return creationTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getCreationTimeInMillis() {
    return creationTimeInMillis;
  }

  public void setCreationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public AccessToken expirationTimeInMillis(@javax.annotation.Nonnull Float expirationTimeInMillis) {
    this.expirationTimeInMillis = expirationTimeInMillis;
    return this;
  }

  /**
   * Token expiration time in milliseconds.
   * @return expirationTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getExpirationTimeInMillis() {
    return expirationTimeInMillis;
  }

  public void setExpirationTimeInMillis(@javax.annotation.Nonnull Float expirationTimeInMillis) {
    this.expirationTimeInMillis = expirationTimeInMillis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.id, accessToken.id) &&
        Objects.equals(this.token, accessToken.token) &&
        Objects.equals(this.org, accessToken.org) &&
        Objects.equals(this.user, accessToken.user) &&
        Objects.equals(this.creationTimeInMillis, accessToken.creationTimeInMillis) &&
        Objects.equals(this.expirationTimeInMillis, accessToken.expirationTimeInMillis);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, org, user, creationTimeInMillis, expirationTimeInMillis);
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
    sb.append("class AccessToken {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    expirationTimeInMillis: ").append(toIndentedString(expirationTimeInMillis)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("org");
    openapiFields.add("user");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("expiration_time_in_millis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("org");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("expiration_time_in_millis");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccessToken
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessToken is not found in the empty JSON string", AccessToken.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessToken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessToken` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessToken.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // validate the required field `org`
      OrgInfo.validateJsonElement(jsonObj.get("org"));
      // validate the required field `user`
      UserInfo.validateJsonElement(jsonObj.get("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessToken.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessToken>() {
           @Override
           public void write(JsonWriter out, AccessToken value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessToken read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccessToken given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccessToken
   * @throws IOException if the JSON string is invalid with respect to AccessToken
   */
  public static AccessToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessToken.class);
  }

  /**
   * Convert an instance of AccessToken to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

