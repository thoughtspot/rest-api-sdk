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
import com.thoughtspot.client.model.ContextPayloadV2Input;
import com.thoughtspot.client.model.ConversationSettingsInput;
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
 * CreateAgentConversationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CreateAgentConversationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA_CONTEXT = "metadata_context";
  @SerializedName(SERIALIZED_NAME_METADATA_CONTEXT)
  @javax.annotation.Nullable
  private ContextPayloadV2Input metadataContext;

  public static final String SERIALIZED_NAME_CONVERSATION_SETTINGS = "conversation_settings";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_SETTINGS)
  @javax.annotation.Nullable
  private ConversationSettingsInput conversationSettings;

  public static final String SERIALIZED_NAME_ANALYST_IDENTIFIER = "analyst_identifier";
  @SerializedName(SERIALIZED_NAME_ANALYST_IDENTIFIER)
  @javax.annotation.Nullable
  private String analystIdentifier;

  public static final String SERIALIZED_NAME_ADDITIONAL_INSTRUCTIONS = "additional_instructions";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INSTRUCTIONS)
  @javax.annotation.Nullable
  private String additionalInstructions;

  /**
   * Version of the Spotter experience the conversation runs on. The conversation stays on this version, so pass the same value on every later request for it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. Uses   &#x60;conversation_settings&#x60;. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Accepts   &#x60;additional_instructions&#x60;. Requires a cluster admin to set Spotter 3   Liveboard experience to Liveboard side panel (New); otherwise the   request returns a 400.    Version: 26.12.0.cl or later 
   */
  @JsonAdapter(SpotterExperienceVersionEnum.Adapter.class)
  public enum SpotterExperienceVersionEnum {
    V1("V1"),
    
    V2("V2");

    private String value;

    SpotterExperienceVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpotterExperienceVersionEnum fromValue(String value) {
      for (SpotterExperienceVersionEnum b : SpotterExperienceVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpotterExperienceVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpotterExperienceVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpotterExperienceVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpotterExperienceVersionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SpotterExperienceVersionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SPOTTER_EXPERIENCE_VERSION = "spotter_experience_version";
  @SerializedName(SERIALIZED_NAME_SPOTTER_EXPERIENCE_VERSION)
  @javax.annotation.Nullable
  private SpotterExperienceVersionEnum spotterExperienceVersion = SpotterExperienceVersionEnum.V1;

  public CreateAgentConversationRequest() {
  }

  public CreateAgentConversationRequest metadataContext(@javax.annotation.Nullable ContextPayloadV2Input metadataContext) {
    this.metadataContext = metadataContext;
    return this;
  }

  /**
   * Context for the conversation. Required unless &#x60;analyst_identifier&#x60; is provided; do not pass both.
   * @return metadataContext
   */
  @javax.annotation.Nullable
  public ContextPayloadV2Input getMetadataContext() {
    return metadataContext;
  }

  public void setMetadataContext(@javax.annotation.Nullable ContextPayloadV2Input metadataContext) {
    this.metadataContext = metadataContext;
  }


  public CreateAgentConversationRequest conversationSettings(@javax.annotation.Nullable ConversationSettingsInput conversationSettings) {
    this.conversationSettings = conversationSettings;
    return this;
  }

  /**
   * Conversation settings. Applies to V1 only.
   * @return conversationSettings
   */
  @javax.annotation.Nullable
  public ConversationSettingsInput getConversationSettings() {
    return conversationSettings;
  }

  public void setConversationSettings(@javax.annotation.Nullable ConversationSettingsInput conversationSettings) {
    this.conversationSettings = conversationSettings;
  }


  public CreateAgentConversationRequest analystIdentifier(@javax.annotation.Nullable String analystIdentifier) {
    this.analystIdentifier = analystIdentifier;
    return this;
  }

  /**
   * Unique identifier of the Spotter Analyst to start the conversation from. When provided, the conversation uses the analyst&#39;s configuration (data sources, agent instructions, and connectors), and &#x60;metadata_context&#x60; must be omitted.    Version: 26.10.0.cl or later 
   * @return analystIdentifier
   */
  @javax.annotation.Nullable
  public String getAnalystIdentifier() {
    return analystIdentifier;
  }

  public void setAnalystIdentifier(@javax.annotation.Nullable String analystIdentifier) {
    this.analystIdentifier = analystIdentifier;
  }


  public CreateAgentConversationRequest additionalInstructions(@javax.annotation.Nullable String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
    return this;
  }

  /**
   * Guidance appended to the agent&#39;s instructions on every message in this conversation, such as a persona, an output format or domain rules. Cannot be changed after the conversation is created. V2 only, and not with &#x60;analyst_identifier&#x60;.    Version: 26.12.0.cl or later 
   * @return additionalInstructions
   */
  @javax.annotation.Nullable
  public String getAdditionalInstructions() {
    return additionalInstructions;
  }

  public void setAdditionalInstructions(@javax.annotation.Nullable String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
  }


  public CreateAgentConversationRequest spotterExperienceVersion(@javax.annotation.Nullable SpotterExperienceVersionEnum spotterExperienceVersion) {
    this.spotterExperienceVersion = spotterExperienceVersion;
    return this;
  }

  /**
   * Version of the Spotter experience the conversation runs on. The conversation stays on this version, so pass the same value on every later request for it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. Uses   &#x60;conversation_settings&#x60;. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Accepts   &#x60;additional_instructions&#x60;. Requires a cluster admin to set Spotter 3   Liveboard experience to Liveboard side panel (New); otherwise the   request returns a 400.    Version: 26.12.0.cl or later 
   * @return spotterExperienceVersion
   */
  @javax.annotation.Nullable
  public SpotterExperienceVersionEnum getSpotterExperienceVersion() {
    return spotterExperienceVersion;
  }

  public void setSpotterExperienceVersion(@javax.annotation.Nullable SpotterExperienceVersionEnum spotterExperienceVersion) {
    this.spotterExperienceVersion = spotterExperienceVersion;
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
   * @return the CreateAgentConversationRequest instance itself
   */
  public CreateAgentConversationRequest putAdditionalProperty(String key, Object value) {
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
    CreateAgentConversationRequest createAgentConversationRequest = (CreateAgentConversationRequest) o;
    return Objects.equals(this.metadataContext, createAgentConversationRequest.metadataContext) &&
        Objects.equals(this.conversationSettings, createAgentConversationRequest.conversationSettings) &&
        Objects.equals(this.analystIdentifier, createAgentConversationRequest.analystIdentifier) &&
        Objects.equals(this.additionalInstructions, createAgentConversationRequest.additionalInstructions) &&
        Objects.equals(this.spotterExperienceVersion, createAgentConversationRequest.spotterExperienceVersion)&&
        Objects.equals(this.additionalProperties, createAgentConversationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataContext, conversationSettings, analystIdentifier, additionalInstructions, spotterExperienceVersion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAgentConversationRequest {\n");
    sb.append("    metadataContext: ").append(toIndentedString(metadataContext)).append("\n");
    sb.append("    conversationSettings: ").append(toIndentedString(conversationSettings)).append("\n");
    sb.append("    analystIdentifier: ").append(toIndentedString(analystIdentifier)).append("\n");
    sb.append("    additionalInstructions: ").append(toIndentedString(additionalInstructions)).append("\n");
    sb.append("    spotterExperienceVersion: ").append(toIndentedString(spotterExperienceVersion)).append("\n");
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
    openapiFields.add("metadata_context");
    openapiFields.add("conversation_settings");
    openapiFields.add("analyst_identifier");
    openapiFields.add("additional_instructions");
    openapiFields.add("spotter_experience_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAgentConversationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAgentConversationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAgentConversationRequest is not found in the empty JSON string", CreateAgentConversationRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `metadata_context`
      if (jsonObj.get("metadata_context") != null && !jsonObj.get("metadata_context").isJsonNull()) {
        ContextPayloadV2Input.validateJsonElement(jsonObj.get("metadata_context"));
      }
      // validate the optional field `conversation_settings`
      if (jsonObj.get("conversation_settings") != null && !jsonObj.get("conversation_settings").isJsonNull()) {
        ConversationSettingsInput.validateJsonElement(jsonObj.get("conversation_settings"));
      }
      if ((jsonObj.get("analyst_identifier") != null && !jsonObj.get("analyst_identifier").isJsonNull()) && !jsonObj.get("analyst_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `analyst_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("analyst_identifier").toString()));
      }
      if ((jsonObj.get("additional_instructions") != null && !jsonObj.get("additional_instructions").isJsonNull()) && !jsonObj.get("additional_instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_instructions").toString()));
      }
      if ((jsonObj.get("spotter_experience_version") != null && !jsonObj.get("spotter_experience_version").isJsonNull()) && !jsonObj.get("spotter_experience_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spotter_experience_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spotter_experience_version").toString()));
      }
      // validate the optional field `spotter_experience_version`
      if (jsonObj.get("spotter_experience_version") != null && !jsonObj.get("spotter_experience_version").isJsonNull()) {
        SpotterExperienceVersionEnum.validateJsonElement(jsonObj.get("spotter_experience_version"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAgentConversationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAgentConversationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAgentConversationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAgentConversationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAgentConversationRequest>() {
           @Override
           public void write(JsonWriter out, CreateAgentConversationRequest value) throws IOException {
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
           public CreateAgentConversationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateAgentConversationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateAgentConversationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAgentConversationRequest
   * @throws IOException if the JSON string is invalid with respect to CreateAgentConversationRequest
   */
  public static CreateAgentConversationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAgentConversationRequest.class);
  }

  /**
   * Convert an instance of CreateAgentConversationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

