/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

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

import com.thoughtspot.client.JSON;

/**
 * A failure that ended the turn.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AgentStreamError implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private String source;

  public static final String SERIALIZED_NAME_DISPLAY_MESSAGE = "display_message";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MESSAGE)
  @javax.annotation.Nullable
  private String displayMessage;

  public static final String SERIALIZED_NAME_ERROR_BUCKET = "error_bucket";
  @SerializedName(SERIALIZED_NAME_ERROR_BUCKET)
  @javax.annotation.Nullable
  private String errorBucket;

  public AgentStreamError() {
  }

  public AgentStreamError code(@javax.annotation.Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Machine-readable status, always a string. Quote it when reporting an issue.    Version: 26.12.0.cl or later 
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }


  public AgentStreamError message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Diagnostic detail. Not written for end users — render &#x60;display_message&#x60;.    Version: 26.12.0.cl or later 
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public AgentStreamError source(@javax.annotation.Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * Which layer produced the failure.    Version: 26.12.0.cl or later 
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable String source) {
    this.source = source;
  }


  public AgentStreamError displayMessage(@javax.annotation.Nullable String displayMessage) {
    this.displayMessage = displayMessage;
    return this;
  }

  /**
   * Text safe to show a user.    Version: 26.12.0.cl or later 
   * @return displayMessage
   */
  @javax.annotation.Nullable
  public String getDisplayMessage() {
    return displayMessage;
  }

  public void setDisplayMessage(@javax.annotation.Nullable String displayMessage) {
    this.displayMessage = displayMessage;
  }


  public AgentStreamError errorBucket(@javax.annotation.Nullable String errorBucket) {
    this.errorBucket = errorBucket;
    return this;
  }

  /**
   * What the caller should do: &#x60;RETRY&#x60;, &#x60;REFRESH&#x60;, &#x60;NEW_CHAT&#x60; or &#x60;SUPPORT&#x60;. Treat an unrecognized value as &#x60;SUPPORT&#x60;.    Version: 26.12.0.cl or later 
   * @return errorBucket
   */
  @javax.annotation.Nullable
  public String getErrorBucket() {
    return errorBucket;
  }

  public void setErrorBucket(@javax.annotation.Nullable String errorBucket) {
    this.errorBucket = errorBucket;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AgentStreamError instance itself
   */
  public AgentStreamError putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStreamError agentStreamError = (AgentStreamError) o;
    return Objects.equals(this.code, agentStreamError.code) &&
        Objects.equals(this.message, agentStreamError.message) &&
        Objects.equals(this.source, agentStreamError.source) &&
        Objects.equals(this.displayMessage, agentStreamError.displayMessage) &&
        Objects.equals(this.errorBucket, agentStreamError.errorBucket)&&
        Objects.equals(this.additionalProperties, agentStreamError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, source, displayMessage, errorBucket, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStreamError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
    sb.append("    errorBucket: ").append(toIndentedString(errorBucket)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("source");
    openapiFields.add("display_message");
    openapiFields.add("error_bucket");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AgentStreamError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentStreamError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentStreamError is not found in the empty JSON string", AgentStreamError.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("display_message") != null && !jsonObj.get("display_message").isJsonNull()) && !jsonObj.get("display_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_message").toString()));
      }
      if ((jsonObj.get("error_bucket") != null && !jsonObj.get("error_bucket").isJsonNull()) && !jsonObj.get("error_bucket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_bucket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_bucket").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentStreamError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentStreamError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentStreamError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentStreamError.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentStreamError>() {
           @Override
           public void write(JsonWriter out, AgentStreamError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentStreamError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AgentStreamError instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AgentStreamError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AgentStreamError
   * @throws IOException if the JSON string is invalid with respect to AgentStreamError
   */
  public static AgentStreamError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentStreamError.class);
  }

  /**
   * Convert an instance of AgentStreamError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

