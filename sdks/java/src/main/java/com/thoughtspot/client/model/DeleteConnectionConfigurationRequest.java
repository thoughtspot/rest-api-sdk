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
 * DeleteConnectionConfigurationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class DeleteConnectionConfigurationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDENTIFIER = "configuration_identifier";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDENTIFIER)
  @javax.annotation.Nonnull
  private String configurationIdentifier;

  public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";
  @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
  @javax.annotation.Nonnull
  private String connectionIdentifier;

  public DeleteConnectionConfigurationRequest() {
  }

  public DeleteConnectionConfigurationRequest configurationIdentifier(@javax.annotation.Nonnull String configurationIdentifier) {
    this.configurationIdentifier = configurationIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the configuration.
   * @return configurationIdentifier
   */
  @javax.annotation.Nonnull
  public String getConfigurationIdentifier() {
    return configurationIdentifier;
  }

  public void setConfigurationIdentifier(@javax.annotation.Nonnull String configurationIdentifier) {
    this.configurationIdentifier = configurationIdentifier;
  }


  public DeleteConnectionConfigurationRequest connectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
    this.connectionIdentifier = connectionIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the connection.
   * @return connectionIdentifier
   */
  @javax.annotation.Nonnull
  public String getConnectionIdentifier() {
    return connectionIdentifier;
  }

  public void setConnectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
    this.connectionIdentifier = connectionIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest = (DeleteConnectionConfigurationRequest) o;
    return Objects.equals(this.configurationIdentifier, deleteConnectionConfigurationRequest.configurationIdentifier) &&
        Objects.equals(this.connectionIdentifier, deleteConnectionConfigurationRequest.connectionIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIdentifier, connectionIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteConnectionConfigurationRequest {\n");
    sb.append("    configurationIdentifier: ").append(toIndentedString(configurationIdentifier)).append("\n");
    sb.append("    connectionIdentifier: ").append(toIndentedString(connectionIdentifier)).append("\n");
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
    openapiFields.add("configuration_identifier");
    openapiFields.add("connection_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configuration_identifier");
    openapiRequiredFields.add("connection_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteConnectionConfigurationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteConnectionConfigurationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteConnectionConfigurationRequest is not found in the empty JSON string", DeleteConnectionConfigurationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteConnectionConfigurationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteConnectionConfigurationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteConnectionConfigurationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("configuration_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_identifier").toString()));
      }
      if (!jsonObj.get("connection_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteConnectionConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteConnectionConfigurationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteConnectionConfigurationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteConnectionConfigurationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteConnectionConfigurationRequest>() {
           @Override
           public void write(JsonWriter out, DeleteConnectionConfigurationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteConnectionConfigurationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteConnectionConfigurationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteConnectionConfigurationRequest
   * @throws IOException if the JSON string is invalid with respect to DeleteConnectionConfigurationRequest
   */
  public static DeleteConnectionConfigurationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteConnectionConfigurationRequest.class);
  }

  /**
   * Convert an instance of DeleteConnectionConfigurationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

