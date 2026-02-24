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
import org.openapitools.jackson.nullable.JsonNullable;
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
 * InputEurekaNLSRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class InputEurekaNLSRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGENT_VERSION = "agentVersion";
  @SerializedName(SERIALIZED_NAME_AGENT_VERSION)
  @javax.annotation.Nullable
  private Integer agentVersion;

  public static final String SERIALIZED_NAME_BYPASS_CACHE = "bypassCache";
  @SerializedName(SERIALIZED_NAME_BYPASS_CACHE)
  @javax.annotation.Nullable
  private Boolean bypassCache;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  @javax.annotation.Nullable
  private List<String> instructions;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nullable
  private String query;

  public InputEurekaNLSRequest() {
  }

  public InputEurekaNLSRequest agentVersion(@javax.annotation.Nullable Integer agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * Cluster version like 10.4.0.cl, 10.5.0.cl, so on.
   * @return agentVersion
   */
  @javax.annotation.Nullable
  public Integer getAgentVersion() {
    return agentVersion;
  }

  public void setAgentVersion(@javax.annotation.Nullable Integer agentVersion) {
    this.agentVersion = agentVersion;
  }


  public InputEurekaNLSRequest bypassCache(@javax.annotation.Nullable Boolean bypassCache) {
    this.bypassCache = bypassCache;
    return this;
  }

  /**
   * If true, results are not returned from cache &amp; calculated every time. Can incur high costs &amp; latency.
   * @return bypassCache
   */
  @javax.annotation.Nullable
  public Boolean getBypassCache() {
    return bypassCache;
  }

  public void setBypassCache(@javax.annotation.Nullable Boolean bypassCache) {
    this.bypassCache = bypassCache;
  }


  public InputEurekaNLSRequest instructions(@javax.annotation.Nullable List<String> instructions) {
    this.instructions = instructions;
    return this;
  }

  public InputEurekaNLSRequest addInstructionsItem(String instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

  /**
   * User specific instructions for processing the @query.
   * @return instructions
   */
  @javax.annotation.Nullable
  public List<String> getInstructions() {
    return instructions;
  }

  public void setInstructions(@javax.annotation.Nullable List<String> instructions) {
    this.instructions = instructions;
  }


  public InputEurekaNLSRequest query(@javax.annotation.Nullable String query) {
    this.query = query;
    return this;
  }

  /**
   * User query which is a topical/goal oriented question that needs to be broken down into smaller simple analytical questions.
   * @return query
   */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nullable String query) {
    this.query = query;
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
   * @return the InputEurekaNLSRequest instance itself
   */
  public InputEurekaNLSRequest putAdditionalProperty(String key, Object value) {
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
    InputEurekaNLSRequest inputEurekaNLSRequest = (InputEurekaNLSRequest) o;
    return Objects.equals(this.agentVersion, inputEurekaNLSRequest.agentVersion) &&
        Objects.equals(this.bypassCache, inputEurekaNLSRequest.bypassCache) &&
        Objects.equals(this.instructions, inputEurekaNLSRequest.instructions) &&
        Objects.equals(this.query, inputEurekaNLSRequest.query)&&
        Objects.equals(this.additionalProperties, inputEurekaNLSRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentVersion, bypassCache, instructions, query, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputEurekaNLSRequest {\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    bypassCache: ").append(toIndentedString(bypassCache)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
    openapiFields.add("agentVersion");
    openapiFields.add("bypassCache");
    openapiFields.add("instructions");
    openapiFields.add("query");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InputEurekaNLSRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InputEurekaNLSRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputEurekaNLSRequest is not found in the empty JSON string", InputEurekaNLSRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull() && !jsonObj.get("instructions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be an array in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputEurekaNLSRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputEurekaNLSRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputEurekaNLSRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputEurekaNLSRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InputEurekaNLSRequest>() {
           @Override
           public void write(JsonWriter out, InputEurekaNLSRequest value) throws IOException {
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
           public InputEurekaNLSRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InputEurekaNLSRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of InputEurekaNLSRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InputEurekaNLSRequest
   * @throws IOException if the JSON string is invalid with respect to InputEurekaNLSRequest
   */
  public static InputEurekaNLSRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputEurekaNLSRequest.class);
  }

  /**
   * Convert an instance of InputEurekaNLSRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

