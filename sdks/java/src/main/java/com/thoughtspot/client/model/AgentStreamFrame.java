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
import com.thoughtspot.client.model.AgentEvent;
import com.thoughtspot.client.model.AgentProgress;
import com.thoughtspot.client.model.AgentStreamDone;
import com.thoughtspot.client.model.AgentStreamError;
import com.thoughtspot.client.model.AgentToolCall;
import com.thoughtspot.client.model.AgentToolResult;
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
 * One frame of an agent response. On the streaming endpoint each SSE &#x60;data:&#x60; line is one frame, and a turn streams many over a single connection. Exactly one field is set on any given frame: route on which one is present. New frame types are added as new fields, so a frame where none of the fields you know is set is a frame of a type you do not recognize: skip it.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AgentStreamFrame implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  @javax.annotation.Nullable
  private AgentEvent event;

  public static final String SERIALIZED_NAME_TOOL_CALL = "tool_call";
  @SerializedName(SERIALIZED_NAME_TOOL_CALL)
  @javax.annotation.Nullable
  private AgentToolCall toolCall;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  @javax.annotation.Nullable
  private AgentProgress progress;

  public static final String SERIALIZED_NAME_TOOL_RESULT = "tool_result";
  @SerializedName(SERIALIZED_NAME_TOOL_RESULT)
  @javax.annotation.Nullable
  private AgentToolResult toolResult;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @javax.annotation.Nullable
  private AgentStreamError error;

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  @javax.annotation.Nullable
  private AgentStreamDone done;

  public AgentStreamFrame() {
  }

  public AgentStreamFrame event(@javax.annotation.Nullable AgentEvent event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @javax.annotation.Nullable
  public AgentEvent getEvent() {
    return event;
  }

  public void setEvent(@javax.annotation.Nullable AgentEvent event) {
    this.event = event;
  }


  public AgentStreamFrame toolCall(@javax.annotation.Nullable AgentToolCall toolCall) {
    this.toolCall = toolCall;
    return this;
  }

  /**
   * Get toolCall
   * @return toolCall
   */
  @javax.annotation.Nullable
  public AgentToolCall getToolCall() {
    return toolCall;
  }

  public void setToolCall(@javax.annotation.Nullable AgentToolCall toolCall) {
    this.toolCall = toolCall;
  }


  public AgentStreamFrame progress(@javax.annotation.Nullable AgentProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public AgentProgress getProgress() {
    return progress;
  }

  public void setProgress(@javax.annotation.Nullable AgentProgress progress) {
    this.progress = progress;
  }


  public AgentStreamFrame toolResult(@javax.annotation.Nullable AgentToolResult toolResult) {
    this.toolResult = toolResult;
    return this;
  }

  /**
   * Get toolResult
   * @return toolResult
   */
  @javax.annotation.Nullable
  public AgentToolResult getToolResult() {
    return toolResult;
  }

  public void setToolResult(@javax.annotation.Nullable AgentToolResult toolResult) {
    this.toolResult = toolResult;
  }


  public AgentStreamFrame error(@javax.annotation.Nullable AgentStreamError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public AgentStreamError getError() {
    return error;
  }

  public void setError(@javax.annotation.Nullable AgentStreamError error) {
    this.error = error;
  }


  public AgentStreamFrame done(@javax.annotation.Nullable AgentStreamDone done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   * @return done
   */
  @javax.annotation.Nullable
  public AgentStreamDone getDone() {
    return done;
  }

  public void setDone(@javax.annotation.Nullable AgentStreamDone done) {
    this.done = done;
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
   * @return the AgentStreamFrame instance itself
   */
  public AgentStreamFrame putAdditionalProperty(String key, Object value) {
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
    AgentStreamFrame agentStreamFrame = (AgentStreamFrame) o;
    return Objects.equals(this.event, agentStreamFrame.event) &&
        Objects.equals(this.toolCall, agentStreamFrame.toolCall) &&
        Objects.equals(this.progress, agentStreamFrame.progress) &&
        Objects.equals(this.toolResult, agentStreamFrame.toolResult) &&
        Objects.equals(this.error, agentStreamFrame.error) &&
        Objects.equals(this.done, agentStreamFrame.done)&&
        Objects.equals(this.additionalProperties, agentStreamFrame.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, toolCall, progress, toolResult, error, done, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStreamFrame {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    toolCall: ").append(toIndentedString(toolCall)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    toolResult: ").append(toIndentedString(toolResult)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("tool_call");
    openapiFields.add("progress");
    openapiFields.add("tool_result");
    openapiFields.add("error");
    openapiFields.add("done");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AgentStreamFrame
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentStreamFrame.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentStreamFrame is not found in the empty JSON string", AgentStreamFrame.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `event`
      if (jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) {
        AgentEvent.validateJsonElement(jsonObj.get("event"));
      }
      // validate the optional field `tool_call`
      if (jsonObj.get("tool_call") != null && !jsonObj.get("tool_call").isJsonNull()) {
        AgentToolCall.validateJsonElement(jsonObj.get("tool_call"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        AgentProgress.validateJsonElement(jsonObj.get("progress"));
      }
      // validate the optional field `tool_result`
      if (jsonObj.get("tool_result") != null && !jsonObj.get("tool_result").isJsonNull()) {
        AgentToolResult.validateJsonElement(jsonObj.get("tool_result"));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        AgentStreamError.validateJsonElement(jsonObj.get("error"));
      }
      // validate the optional field `done`
      if (jsonObj.get("done") != null && !jsonObj.get("done").isJsonNull()) {
        AgentStreamDone.validateJsonElement(jsonObj.get("done"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentStreamFrame.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentStreamFrame' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentStreamFrame> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentStreamFrame.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentStreamFrame>() {
           @Override
           public void write(JsonWriter out, AgentStreamFrame value) throws IOException {
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
           public AgentStreamFrame read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AgentStreamFrame instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AgentStreamFrame given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AgentStreamFrame
   * @throws IOException if the JSON string is invalid with respect to AgentStreamFrame
   */
  public static AgentStreamFrame fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentStreamFrame.class);
  }

  /**
   * Convert an instance of AgentStreamFrame to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

