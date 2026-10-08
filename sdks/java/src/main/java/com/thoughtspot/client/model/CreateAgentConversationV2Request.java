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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CreateAgentConversationV2Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CreateAgentConversationV2Request implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS = "data_source_identifiers";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> dataSourceIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_INSTRUCTIONS = "additional_instructions";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INSTRUCTIONS)
  @javax.annotation.Nullable
  private String additionalInstructions;

  public CreateAgentConversationV2Request() {
  }

  public CreateAgentConversationV2Request dataSourceIdentifiers(@javax.annotation.Nullable List<String> dataSourceIdentifiers) {
    this.dataSourceIdentifiers = dataSourceIdentifiers;
    return this;
  }

  public CreateAgentConversationV2Request addDataSourceIdentifiersItem(String dataSourceIdentifiersItem) {
    if (this.dataSourceIdentifiers == null) {
      this.dataSourceIdentifiers = new ArrayList<>();
    }
    this.dataSourceIdentifiers.add(dataSourceIdentifiersItem);
    return this;
  }

  /**
   * Unique identifiers of the data sources to scope the conversation to. When empty, Spotter selects the most relevant data source for each question.    Version: 26.12.0.cl or later 
   * @return dataSourceIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getDataSourceIdentifiers() {
    return dataSourceIdentifiers;
  }

  public void setDataSourceIdentifiers(@javax.annotation.Nullable List<String> dataSourceIdentifiers) {
    this.dataSourceIdentifiers = dataSourceIdentifiers;
  }


  public CreateAgentConversationV2Request additionalInstructions(@javax.annotation.Nullable String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
    return this;
  }

  /**
   * Guidance appended to the agent&#39;s instructions on every message in this conversation. Use it to set a persona, a preferred output format, or domain rules. Cannot be changed after the conversation is created.    Version: 26.12.0.cl or later 
   * @return additionalInstructions
   */
  @javax.annotation.Nullable
  public String getAdditionalInstructions() {
    return additionalInstructions;
  }

  public void setAdditionalInstructions(@javax.annotation.Nullable String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
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
   * @return the CreateAgentConversationV2Request instance itself
   */
  public CreateAgentConversationV2Request putAdditionalProperty(String key, Object value) {
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
    CreateAgentConversationV2Request createAgentConversationV2Request = (CreateAgentConversationV2Request) o;
    return Objects.equals(this.dataSourceIdentifiers, createAgentConversationV2Request.dataSourceIdentifiers) &&
        Objects.equals(this.additionalInstructions, createAgentConversationV2Request.additionalInstructions)&&
        Objects.equals(this.additionalProperties, createAgentConversationV2Request.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceIdentifiers, additionalInstructions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAgentConversationV2Request {\n");
    sb.append("    dataSourceIdentifiers: ").append(toIndentedString(dataSourceIdentifiers)).append("\n");
    sb.append("    additionalInstructions: ").append(toIndentedString(additionalInstructions)).append("\n");
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
    openapiFields.add("data_source_identifiers");
    openapiFields.add("additional_instructions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAgentConversationV2Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAgentConversationV2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAgentConversationV2Request is not found in the empty JSON string", CreateAgentConversationV2Request.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("data_source_identifiers") != null && !jsonObj.get("data_source_identifiers").isJsonNull() && !jsonObj.get("data_source_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("data_source_identifiers").toString()));
      }
      if ((jsonObj.get("additional_instructions") != null && !jsonObj.get("additional_instructions").isJsonNull()) && !jsonObj.get("additional_instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_instructions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAgentConversationV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAgentConversationV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAgentConversationV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAgentConversationV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAgentConversationV2Request>() {
           @Override
           public void write(JsonWriter out, CreateAgentConversationV2Request value) throws IOException {
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
           public CreateAgentConversationV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateAgentConversationV2Request instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateAgentConversationV2Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAgentConversationV2Request
   * @throws IOException if the JSON string is invalid with respect to CreateAgentConversationV2Request
   */
  public static CreateAgentConversationV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAgentConversationV2Request.class);
  }

  /**
   * Convert an instance of CreateAgentConversationV2Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

