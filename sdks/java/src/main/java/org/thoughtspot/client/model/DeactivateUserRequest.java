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
 * DeactivateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T09:37:12.899082-08:00[America/Los_Angeles]")
public class DeactivateUserRequest {
  public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
  private String userIdentifier;

  public static final String SERIALIZED_NAME_BASE_URL = "base_url";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private String baseUrl;

  public DeactivateUserRequest() {
  }

  public DeactivateUserRequest userIdentifier(String userIdentifier) {
    
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


  public DeactivateUserRequest baseUrl(String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * Base url of the cluster.
   * @return baseUrl
  **/
  @javax.annotation.Nonnull
  public String getBaseUrl() {
    return baseUrl;
  }


  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeactivateUserRequest deactivateUserRequest = (DeactivateUserRequest) o;
    return Objects.equals(this.userIdentifier, deactivateUserRequest.userIdentifier) &&
        Objects.equals(this.baseUrl, deactivateUserRequest.baseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdentifier, baseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeactivateUserRequest {\n");
    sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
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
    openapiFields.add("base_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_identifier");
    openapiRequiredFields.add("base_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeactivateUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeactivateUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeactivateUserRequest is not found in the empty JSON string", DeactivateUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeactivateUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeactivateUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeactivateUserRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("user_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_identifier").toString()));
      }
      if (!jsonObj.get("base_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeactivateUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeactivateUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeactivateUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeactivateUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeactivateUserRequest>() {
           @Override
           public void write(JsonWriter out, DeactivateUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeactivateUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeactivateUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeactivateUserRequest
  * @throws IOException if the JSON string is invalid with respect to DeactivateUserRequest
  */
  public static DeactivateUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeactivateUserRequest.class);
  }

 /**
  * Convert an instance of DeactivateUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

