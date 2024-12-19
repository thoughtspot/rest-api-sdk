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
 * TokenValidationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T23:43:05.069148+05:30[Asia/Kolkata]")
public class TokenValidationResponse {
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

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public TokenValidationResponse() {
  }

  public TokenValidationResponse creationTimeInMillis(Float creationTimeInMillis) {
    
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


  public TokenValidationResponse expirationTimeInMillis(Float expirationTimeInMillis) {
    
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


  public TokenValidationResponse scope(Scope scope) {
    
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


  public TokenValidationResponse validForUserId(String validForUserId) {
    
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


  public TokenValidationResponse tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Type of token.
   * @return tokenType
  **/
  @javax.annotation.Nonnull
  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenValidationResponse tokenValidationResponse = (TokenValidationResponse) o;
    return Objects.equals(this.creationTimeInMillis, tokenValidationResponse.creationTimeInMillis) &&
        Objects.equals(this.expirationTimeInMillis, tokenValidationResponse.expirationTimeInMillis) &&
        Objects.equals(this.scope, tokenValidationResponse.scope) &&
        Objects.equals(this.validForUserId, tokenValidationResponse.validForUserId) &&
        Objects.equals(this.tokenType, tokenValidationResponse.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTimeInMillis, expirationTimeInMillis, scope, validForUserId, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenValidationResponse {\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    expirationTimeInMillis: ").append(toIndentedString(expirationTimeInMillis)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    validForUserId: ").append(toIndentedString(validForUserId)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("expiration_time_in_millis");
    openapiFields.add("scope");
    openapiFields.add("valid_for_user_id");
    openapiFields.add("token_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("expiration_time_in_millis");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("valid_for_user_id");
    openapiRequiredFields.add("token_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenValidationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenValidationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenValidationResponse is not found in the empty JSON string", TokenValidationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenValidationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenValidationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenValidationResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `scope`
      Scope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      if (!jsonObj.get("valid_for_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_for_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_for_user_id").toString()));
      }
      if (!jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenValidationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenValidationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenValidationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenValidationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenValidationResponse>() {
           @Override
           public void write(JsonWriter out, TokenValidationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenValidationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenValidationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenValidationResponse
  * @throws IOException if the JSON string is invalid with respect to TokenValidationResponse
  */
  public static TokenValidationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenValidationResponse.class);
  }

 /**
  * Convert an instance of TokenValidationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

