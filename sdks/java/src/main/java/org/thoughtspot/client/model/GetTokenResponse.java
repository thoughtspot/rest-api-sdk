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
 * GetTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T15:42:43.362610+05:30[Asia/Kolkata]")
public class GetTokenResponse {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS = "expiration_time_in_millis";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS)
  private Float expirationTimeInMillis;

  public static final String SERIALIZED_NAME_VALID_FOR_USER_ID = "valid_for_user_id";
  @SerializedName(SERIALIZED_NAME_VALID_FOR_USER_ID)
  private String validForUserId;

  public static final String SERIALIZED_NAME_VALID_FOR_USERNAME = "valid_for_username";
  @SerializedName(SERIALIZED_NAME_VALID_FOR_USERNAME)
  private String validForUsername;

  public GetTokenResponse() {
  }

  public GetTokenResponse token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Bearer auth token.
   * @return token
  **/
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public GetTokenResponse creationTimeInMillis(Float creationTimeInMillis) {
    
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

   /**
   * Token creation time in milliseconds.
   * @return creationTimeInMillis
  **/
  @javax.annotation.Nonnull
  public Float getCreationTimeInMillis() {
    return creationTimeInMillis;
  }


  public void setCreationTimeInMillis(Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public GetTokenResponse expirationTimeInMillis(Float expirationTimeInMillis) {
    
    this.expirationTimeInMillis = expirationTimeInMillis;
    return this;
  }

   /**
   * Token expiration time in milliseconds.
   * @return expirationTimeInMillis
  **/
  @javax.annotation.Nonnull
  public Float getExpirationTimeInMillis() {
    return expirationTimeInMillis;
  }


  public void setExpirationTimeInMillis(Float expirationTimeInMillis) {
    this.expirationTimeInMillis = expirationTimeInMillis;
  }


  public GetTokenResponse validForUserId(String validForUserId) {
    
    this.validForUserId = validForUserId;
    return this;
  }

   /**
   * Username to whom the token is issued.
   * @return validForUserId
  **/
  @javax.annotation.Nonnull
  public String getValidForUserId() {
    return validForUserId;
  }


  public void setValidForUserId(String validForUserId) {
    this.validForUserId = validForUserId;
  }


  public GetTokenResponse validForUsername(String validForUsername) {
    
    this.validForUsername = validForUsername;
    return this;
  }

   /**
   * Unique identifier of the user to whom the token is issued.
   * @return validForUsername
  **/
  @javax.annotation.Nonnull
  public String getValidForUsername() {
    return validForUsername;
  }


  public void setValidForUsername(String validForUsername) {
    this.validForUsername = validForUsername;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenResponse getTokenResponse = (GetTokenResponse) o;
    return Objects.equals(this.token, getTokenResponse.token) &&
        Objects.equals(this.creationTimeInMillis, getTokenResponse.creationTimeInMillis) &&
        Objects.equals(this.expirationTimeInMillis, getTokenResponse.expirationTimeInMillis) &&
        Objects.equals(this.validForUserId, getTokenResponse.validForUserId) &&
        Objects.equals(this.validForUsername, getTokenResponse.validForUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, creationTimeInMillis, expirationTimeInMillis, validForUserId, validForUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    expirationTimeInMillis: ").append(toIndentedString(expirationTimeInMillis)).append("\n");
    sb.append("    validForUserId: ").append(toIndentedString(validForUserId)).append("\n");
    sb.append("    validForUsername: ").append(toIndentedString(validForUsername)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("expiration_time_in_millis");
    openapiFields.add("valid_for_user_id");
    openapiFields.add("valid_for_username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("expiration_time_in_millis");
    openapiRequiredFields.add("valid_for_user_id");
    openapiRequiredFields.add("valid_for_username");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTokenResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetTokenResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTokenResponse is not found in the empty JSON string", GetTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTokenResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTokenResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if (!jsonObj.get("valid_for_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_for_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_for_user_id").toString()));
      }
      if (!jsonObj.get("valid_for_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_for_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_for_username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTokenResponse>() {
           @Override
           public void write(JsonWriter out, GetTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTokenResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTokenResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTokenResponse
  * @throws IOException if the JSON string is invalid with respect to GetTokenResponse
  */
  public static GetTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTokenResponse.class);
  }

 /**
  * Convert an instance of GetTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

