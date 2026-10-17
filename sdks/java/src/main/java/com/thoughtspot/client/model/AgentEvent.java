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
import com.thoughtspot.client.model.AgentEventContent;
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
 * Text from Spotter — its reasoning or its answer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AgentEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_INVOCATION_ID = "invocation_id";
  @SerializedName(SERIALIZED_NAME_INVOCATION_ID)
  @javax.annotation.Nullable
  private String invocationId;

  public static final String SERIALIZED_NAME_PARTIAL = "partial";
  @SerializedName(SERIALIZED_NAME_PARTIAL)
  @javax.annotation.Nullable
  private Boolean partial;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  @javax.annotation.Nullable
  private String errorCode;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  @javax.annotation.Nonnull
  private AgentEventContent content;

  public AgentEvent() {
  }

  public AgentEvent id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies a single event.    Version: 26.12.0.cl or later 
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public AgentEvent invocationId(@javax.annotation.Nullable String invocationId) {
    this.invocationId = invocationId;
    return this;
  }

  /**
   * Stable for one turn; every event of the same turn shares it.    Version: 26.12.0.cl or later 
   * @return invocationId
   */
  @javax.annotation.Nullable
  public String getInvocationId() {
    return invocationId;
  }

  public void setInvocationId(@javax.annotation.Nullable String invocationId) {
    this.invocationId = invocationId;
  }


  public AgentEvent partial(@javax.annotation.Nullable Boolean partial) {
    this.partial = partial;
    return this;
  }

  /**
   * &#x60;true&#x60; for an incremental chunk, &#x60;false&#x60; for a frame restating a completed segment; absent on a complete event. Restated text is not republished, and frames arrive in order over a single response, so appending every part is safe.    Version: 26.12.0.cl or later 
   * @return partial
   */
  @javax.annotation.Nullable
  public Boolean getPartial() {
    return partial;
  }

  public void setPartial(@javax.annotation.Nullable Boolean partial) {
    this.partial = partial;
  }


  public AgentEvent errorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Set when the turn failed while producing this event.    Version: 26.12.0.cl or later 
   * @return errorCode
   */
  @javax.annotation.Nullable
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = errorCode;
  }


  public AgentEvent content(@javax.annotation.Nonnull AgentEventContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nonnull
  public AgentEventContent getContent() {
    return content;
  }

  public void setContent(@javax.annotation.Nonnull AgentEventContent content) {
    this.content = content;
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
   * @return the AgentEvent instance itself
   */
  public AgentEvent putAdditionalProperty(String key, Object value) {
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
    AgentEvent agentEvent = (AgentEvent) o;
    return Objects.equals(this.id, agentEvent.id) &&
        Objects.equals(this.invocationId, agentEvent.invocationId) &&
        Objects.equals(this.partial, agentEvent.partial) &&
        Objects.equals(this.errorCode, agentEvent.errorCode) &&
        Objects.equals(this.content, agentEvent.content)&&
        Objects.equals(this.additionalProperties, agentEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invocationId, partial, errorCode, content, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("invocation_id");
    openapiFields.add("partial");
    openapiFields.add("error_code");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AgentEvent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentEvent is not found in the empty JSON string", AgentEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgentEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("invocation_id") != null && !jsonObj.get("invocation_id").isJsonNull()) && !jsonObj.get("invocation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invocation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invocation_id").toString()));
      }
      if ((jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonNull()) && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      // validate the required field `content`
      AgentEventContent.validateJsonElement(jsonObj.get("content"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentEvent>() {
           @Override
           public void write(JsonWriter out, AgentEvent value) throws IOException {
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
           public AgentEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AgentEvent instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AgentEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AgentEvent
   * @throws IOException if the JSON string is invalid with respect to AgentEvent
   */
  public static AgentEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentEvent.class);
  }

  /**
   * Convert an instance of AgentEvent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

