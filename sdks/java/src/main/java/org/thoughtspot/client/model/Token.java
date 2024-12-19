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
import org.thoughtspot.client.model.Scope;

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
 * Token
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T23:43:05.069148+05:30[Asia/Kolkata]")
public class Token {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS = "expiration_time_in_millis";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_IN_MILLIS)
  private Float expirationTimeInMillis;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private Scope scope;

  public static final String SERIALIZED_NAME_VALID_FOR_USER_ID = "valid_for_user_id";
  @SerializedName(SERIALIZED_NAME_VALID_FOR_USER_ID)
  private String validForUserId;

  public static final String SERIALIZED_NAME_VALID_FOR_USERNAME = "valid_for_username";
  @SerializedName(SERIALIZED_NAME_VALID_FOR_USERNAME)
  private String validForUsername;

  public Token() {
  }

  public Token token(String token) {
    
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


  public Token creationTimeInMillis(Float creationTimeInMillis) {
    
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


  public Token expirationTimeInMillis(Float expirationTimeInMillis) {
    
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


  public Token scope(Scope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nonnull
  public Scope getScope() {
    return scope;
  }


  public void setScope(Scope scope) {
    this.scope = scope;
  }


  public Token validForUserId(String validForUserId) {
    
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


  public Token validForUsername(String validForUsername) {
    
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
    Token token = (Token) o;
    return Objects.equals(this.token, token.token) &&
        Objects.equals(this.creationTimeInMillis, token.creationTimeInMillis) &&
        Objects.equals(this.expirationTimeInMillis, token.expirationTimeInMillis) &&
        Objects.equals(this.scope, token.scope) &&
        Objects.equals(this.validForUserId, token.validForUserId) &&
        Objects.equals(this.validForUsername, token.validForUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, creationTimeInMillis, expirationTimeInMillis, scope, validForUserId, validForUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    expirationTimeInMillis: ").append(toIndentedString(expirationTimeInMillis)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("valid_for_user_id");
    openapiFields.add("valid_for_username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("expiration_time_in_millis");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("valid_for_user_id");
    openapiRequiredFields.add("valid_for_username");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Token
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Token.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Token is not found in the empty JSON string", Token.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Token.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Token` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Token.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // validate the required field `scope`
      Scope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
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
       if (!Token.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Token' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Token> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Token.class));

       return (TypeAdapter<T>) new TypeAdapter<Token>() {
           @Override
           public void write(JsonWriter out, Token value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Token read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Token given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Token
  * @throws IOException if the JSON string is invalid with respect to Token
  */
  public static Token fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Token.class);
  }

 /**
  * Convert an instance of Token to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

