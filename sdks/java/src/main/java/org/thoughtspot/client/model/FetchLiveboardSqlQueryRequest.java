/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * FetchLiveboardSqlQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class FetchLiveboardSqlQueryRequest {
  public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
  private String metadataIdentifier;

  public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS = "visualization_identifiers";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
  private List<String> visualizationIdentifiers;

  public FetchLiveboardSqlQueryRequest() {
  }

  public FetchLiveboardSqlQueryRequest metadataIdentifier(String metadataIdentifier) {
    
    this.metadataIdentifier = metadataIdentifier;
    return this;
  }

   /**
   * ID or name of the Liveboard.
   * @return metadataIdentifier
  **/
  @javax.annotation.Nonnull
  public String getMetadataIdentifier() {
    return metadataIdentifier;
  }


  public void setMetadataIdentifier(String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
  }


  public FetchLiveboardSqlQueryRequest visualizationIdentifiers(List<String> visualizationIdentifiers) {
    
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
  **/
  @javax.annotation.Nullable
  public List<String> getVisualizationIdentifiers() {
    return visualizationIdentifiers;
  }


  public void setVisualizationIdentifiers(List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
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
        Objects.equals(this.visualizationIdentifiers, fetchLiveboardSqlQueryRequest.visualizationIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataIdentifier, visualizationIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchLiveboardSqlQueryRequest {\n");
    sb.append("    metadataIdentifier: ").append(toIndentedString(metadataIdentifier)).append("\n");
    sb.append("    visualizationIdentifiers: ").append(toIndentedString(visualizationIdentifiers)).append("\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FetchLiveboardSqlQueryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FetchLiveboardSqlQueryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchLiveboardSqlQueryRequest is not found in the empty JSON string", FetchLiveboardSqlQueryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FetchLiveboardSqlQueryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FetchLiveboardSqlQueryRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchLiveboardSqlQueryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("visualization_identifiers") != null && !jsonObj.get("visualization_identifiers").isJsonArray()) {
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
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchLiveboardSqlQueryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
