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
 * ResetUserPasswordRequest
 */

public class ResetUserPasswordRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "new_password";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  @javax.annotation.Nonnull
  private String newPassword;

  public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
  @javax.annotation.Nonnull
  private String userIdentifier;

  public ResetUserPasswordRequest() {
  }

  public ResetUserPasswordRequest newPassword(@javax.annotation.Nonnull String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * New password for the user.
   * @return newPassword
   */
  @javax.annotation.Nonnull
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(@javax.annotation.Nonnull String newPassword) {
    this.newPassword = newPassword;
  }


  public ResetUserPasswordRequest userIdentifier(@javax.annotation.Nonnull String userIdentifier) {
    this.userIdentifier = userIdentifier;
    return this;
  }

  /**
   * GUID or name of the user.
   * @return userIdentifier
   */
  @javax.annotation.Nonnull
  public String getUserIdentifier() {
    return userIdentifier;
  }

  public void setUserIdentifier(@javax.annotation.Nonnull String userIdentifier) {
    this.userIdentifier = userIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetUserPasswordRequest resetUserPasswordRequest = (ResetUserPasswordRequest) o;
    return Objects.equals(this.newPassword, resetUserPasswordRequest.newPassword) &&
        Objects.equals(this.userIdentifier, resetUserPasswordRequest.userIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPassword, userIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetUserPasswordRequest {\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
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
    openapiFields.add("new_password");
    openapiFields.add("user_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("new_password");
    openapiRequiredFields.add("user_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResetUserPasswordRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResetUserPasswordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResetUserPasswordRequest is not found in the empty JSON string", ResetUserPasswordRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResetUserPasswordRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResetUserPasswordRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResetUserPasswordRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("new_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_password").toString()));
      }
      if (!jsonObj.get("user_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResetUserPasswordRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResetUserPasswordRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResetUserPasswordRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResetUserPasswordRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ResetUserPasswordRequest>() {
           @Override
           public void write(JsonWriter out, ResetUserPasswordRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResetUserPasswordRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResetUserPasswordRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResetUserPasswordRequest
   * @throws IOException if the JSON string is invalid with respect to ResetUserPasswordRequest
   */
  public static ResetUserPasswordRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResetUserPasswordRequest.class);
  }

  /**
   * Convert an instance of ResetUserPasswordRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

