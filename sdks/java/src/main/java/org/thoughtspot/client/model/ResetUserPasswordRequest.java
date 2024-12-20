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
 * ResetUserPasswordRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class ResetUserPasswordRequest {
  public static final String SERIALIZED_NAME_NEW_PASSWORD = "new_password";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;

  public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
  private String userIdentifier;

  public ResetUserPasswordRequest() {
  }

  public ResetUserPasswordRequest newPassword(String newPassword) {
    
    this.newPassword = newPassword;
    return this;
  }

   /**
   * New password for the user.
   * @return newPassword
  **/
  @javax.annotation.Nonnull
  public String getNewPassword() {
    return newPassword;
  }


  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  public ResetUserPasswordRequest userIdentifier(String userIdentifier) {
    
    this.userIdentifier = userIdentifier;
    return this;
  }

   /**
   * GUID or name of the user.
   * @return userIdentifier
  **/
  @javax.annotation.Nonnull
  public String getUserIdentifier() {
    return userIdentifier;
  }


  public void setUserIdentifier(String userIdentifier) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResetUserPasswordRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResetUserPasswordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResetUserPasswordRequest is not found in the empty JSON string", ResetUserPasswordRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResetUserPasswordRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResetUserPasswordRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResetUserPasswordRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
