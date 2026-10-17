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
 * SendAgentConversationMessageStreamingV2Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SendAgentConversationMessageStreamingV2Request implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nonnull
  private String message;

  public static final String SERIALIZED_NAME_CONVERSATION_IDENTIFIER = "conversation_identifier";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_IDENTIFIER)
  @javax.annotation.Nullable
  private String conversationIdentifier;

  public SendAgentConversationMessageStreamingV2Request() {
  }

  public SendAgentConversationMessageStreamingV2Request message(@javax.annotation.Nonnull String message) {
    this.message = message;
    return this;
  }

  /**
   * The message to send to Spotter.    Version: 26.12.0.cl or later 
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }


  public SendAgentConversationMessageStreamingV2Request conversationIdentifier(@javax.annotation.Nullable String conversationIdentifier) {
    this.conversationIdentifier = conversationIdentifier;
    return this;
  }

  /**
   * Conversation to send the message in. When omitted, a new conversation is created and its identifier is returned in the &#x60;x-conversation-identifier&#x60; response header.    Version: 26.12.0.cl or later 
   * @return conversationIdentifier
   */
  @javax.annotation.Nullable
  public String getConversationIdentifier() {
    return conversationIdentifier;
  }

  public void setConversationIdentifier(@javax.annotation.Nullable String conversationIdentifier) {
    this.conversationIdentifier = conversationIdentifier;
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
   * @return the SendAgentConversationMessageStreamingV2Request instance itself
   */
  public SendAgentConversationMessageStreamingV2Request putAdditionalProperty(String key, Object value) {
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
    SendAgentConversationMessageStreamingV2Request sendAgentConversationMessageStreamingV2Request = (SendAgentConversationMessageStreamingV2Request) o;
    return Objects.equals(this.message, sendAgentConversationMessageStreamingV2Request.message) &&
        Objects.equals(this.conversationIdentifier, sendAgentConversationMessageStreamingV2Request.conversationIdentifier)&&
        Objects.equals(this.additionalProperties, sendAgentConversationMessageStreamingV2Request.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, conversationIdentifier, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendAgentConversationMessageStreamingV2Request {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    conversationIdentifier: ").append(toIndentedString(conversationIdentifier)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("conversation_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SendAgentConversationMessageStreamingV2Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SendAgentConversationMessageStreamingV2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendAgentConversationMessageStreamingV2Request is not found in the empty JSON string", SendAgentConversationMessageStreamingV2Request.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendAgentConversationMessageStreamingV2Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("conversation_identifier") != null && !jsonObj.get("conversation_identifier").isJsonNull()) && !jsonObj.get("conversation_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendAgentConversationMessageStreamingV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendAgentConversationMessageStreamingV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendAgentConversationMessageStreamingV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendAgentConversationMessageStreamingV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<SendAgentConversationMessageStreamingV2Request>() {
           @Override
           public void write(JsonWriter out, SendAgentConversationMessageStreamingV2Request value) throws IOException {
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
           public SendAgentConversationMessageStreamingV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SendAgentConversationMessageStreamingV2Request instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SendAgentConversationMessageStreamingV2Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SendAgentConversationMessageStreamingV2Request
   * @throws IOException if the JSON string is invalid with respect to SendAgentConversationMessageStreamingV2Request
   */
  public static SendAgentConversationMessageStreamingV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendAgentConversationMessageStreamingV2Request.class);
  }

  /**
   * Convert an instance of SendAgentConversationMessageStreamingV2Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

