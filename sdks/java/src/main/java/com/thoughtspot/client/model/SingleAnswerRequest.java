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
 * SingleAnswerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SingleAnswerRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nonnull
  private String query;

  public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
  @javax.annotation.Nonnull
  private String metadataIdentifier;

  public SingleAnswerRequest() {
  }

  public SingleAnswerRequest query(@javax.annotation.Nonnull String query) {
    this.query = query;
    return this;
  }

  /**
   * A natural language query string to generate the Answer.
   * @return query
   */
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nonnull String query) {
    this.query = query;
  }


  public SingleAnswerRequest metadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
    return this;
  }

  /**
   * ID of the metadata object, such as a Worksheet or Model, to use as a data source for the query.
   * @return metadataIdentifier
   */
  @javax.annotation.Nonnull
  public String getMetadataIdentifier() {
    return metadataIdentifier;
  }

  public void setMetadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleAnswerRequest singleAnswerRequest = (SingleAnswerRequest) o;
    return Objects.equals(this.query, singleAnswerRequest.query) &&
        Objects.equals(this.metadataIdentifier, singleAnswerRequest.metadataIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, metadataIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleAnswerRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    metadataIdentifier: ").append(toIndentedString(metadataIdentifier)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("metadata_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("metadata_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SingleAnswerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SingleAnswerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SingleAnswerRequest is not found in the empty JSON string", SingleAnswerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SingleAnswerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SingleAnswerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SingleAnswerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SingleAnswerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SingleAnswerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SingleAnswerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SingleAnswerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SingleAnswerRequest>() {
           @Override
           public void write(JsonWriter out, SingleAnswerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SingleAnswerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SingleAnswerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SingleAnswerRequest
   * @throws IOException if the JSON string is invalid with respect to SingleAnswerRequest
   */
  public static SingleAnswerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SingleAnswerRequest.class);
  }

  /**
   * Convert an instance of SingleAnswerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

