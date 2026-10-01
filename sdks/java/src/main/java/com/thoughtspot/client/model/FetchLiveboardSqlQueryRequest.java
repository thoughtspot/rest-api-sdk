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
 * FetchLiveboardSqlQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class FetchLiveboardSqlQueryRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
  @javax.annotation.Nonnull
  private String metadataIdentifier;

  public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS = "visualization_identifiers";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> visualizationIdentifiers;

  public FetchLiveboardSqlQueryRequest() {
  }

  public FetchLiveboardSqlQueryRequest metadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
    return this;
  }

  /**
   * ID or name of the Liveboard.
   * @return metadataIdentifier
   */
  @javax.annotation.Nonnull
  public String getMetadataIdentifier() {
    return metadataIdentifier;
  }

  public void setMetadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
  }


  public FetchLiveboardSqlQueryRequest visualizationIdentifiers(@javax.annotation.Nullable List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
    return this;
  }

  public FetchLiveboardSqlQueryRequest addVisualizationIdentifiersItem(String visualizationIdentifiersItem) {
    if (this.visualizationIdentifiers == null) {
      this.visualizationIdentifiers = new ArrayList<>();
    }
    this.visualizationIdentifiers.add(visualizationIdentifiersItem);
    return this;
  }

  /**
   * Unique ID or name of visualizations.
   * @return visualizationIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getVisualizationIdentifiers() {
    return visualizationIdentifiers;
  }

  public void setVisualizationIdentifiers(@javax.annotation.Nullable List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
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
   * @return the FetchLiveboardSqlQueryRequest instance itself
   */
  public FetchLiveboardSqlQueryRequest putAdditionalProperty(String key, Object value) {
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
    FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest = (FetchLiveboardSqlQueryRequest) o;
    return Objects.equals(this.metadataIdentifier, fetchLiveboardSqlQueryRequest.metadataIdentifier) &&
        Objects.equals(this.visualizationIdentifiers, fetchLiveboardSqlQueryRequest.visualizationIdentifiers)&&
        Objects.equals(this.additionalProperties, fetchLiveboardSqlQueryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataIdentifier, visualizationIdentifiers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchLiveboardSqlQueryRequest {\n");
    sb.append("    metadataIdentifier: ").append(toIndentedString(metadataIdentifier)).append("\n");
    sb.append("    visualizationIdentifiers: ").append(toIndentedString(visualizationIdentifiers)).append("\n");
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
    openapiFields.add("metadata_identifier");
    openapiFields.add("visualization_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FetchLiveboardSqlQueryRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FetchLiveboardSqlQueryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchLiveboardSqlQueryRequest is not found in the empty JSON string", FetchLiveboardSqlQueryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchLiveboardSqlQueryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("visualization_identifiers") != null && !jsonObj.get("visualization_identifiers").isJsonNull() && !jsonObj.get("visualization_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visualization_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("visualization_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchLiveboardSqlQueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchLiveboardSqlQueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchLiveboardSqlQueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchLiveboardSqlQueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchLiveboardSqlQueryRequest>() {
           @Override
           public void write(JsonWriter out, FetchLiveboardSqlQueryRequest value) throws IOException {
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
           public FetchLiveboardSqlQueryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FetchLiveboardSqlQueryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of FetchLiveboardSqlQueryRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FetchLiveboardSqlQueryRequest
   * @throws IOException if the JSON string is invalid with respect to FetchLiveboardSqlQueryRequest
   */
  public static FetchLiveboardSqlQueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchLiveboardSqlQueryRequest.class);
  }

  /**
   * Convert an instance of FetchLiveboardSqlQueryRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

