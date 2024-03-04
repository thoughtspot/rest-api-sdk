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
import java.io.File;
import java.io.IOException;

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
 * DbtGenerateSyncTmlRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T10:25:25.563+05:30[Asia/Kolkata]")
public class DbtGenerateSyncTmlRequest {
  public static final String SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER = "dbt_connection_identifier";
  @SerializedName(SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER)
  private String dbtConnectionIdentifier;

  public static final String SERIALIZED_NAME_FILE_CONTENT = "file_content";
  @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
  private File fileContent;

  public DbtGenerateSyncTmlRequest() {
  }

  public DbtGenerateSyncTmlRequest dbtConnectionIdentifier(String dbtConnectionIdentifier) {
    
    this.dbtConnectionIdentifier = dbtConnectionIdentifier;
    return this;
  }

   /**
   * Unique ID of the DBT connection.
   * @return dbtConnectionIdentifier
  **/
  @javax.annotation.Nonnull
  public String getDbtConnectionIdentifier() {
    return dbtConnectionIdentifier;
  }


  public void setDbtConnectionIdentifier(String dbtConnectionIdentifier) {
    this.dbtConnectionIdentifier = dbtConnectionIdentifier;
  }


  public DbtGenerateSyncTmlRequest fileContent(File fileContent) {
    
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
   * @return fileContent
  **/
  @javax.annotation.Nullable
  public File getFileContent() {
    return fileContent;
  }


  public void setFileContent(File fileContent) {
    this.fileContent = fileContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbtGenerateSyncTmlRequest dbtGenerateSyncTmlRequest = (DbtGenerateSyncTmlRequest) o;
    return Objects.equals(this.dbtConnectionIdentifier, dbtGenerateSyncTmlRequest.dbtConnectionIdentifier) &&
        Objects.equals(this.fileContent, dbtGenerateSyncTmlRequest.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbtConnectionIdentifier, fileContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbtGenerateSyncTmlRequest {\n");
    sb.append("    dbtConnectionIdentifier: ").append(toIndentedString(dbtConnectionIdentifier)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
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
    openapiFields.add("dbt_connection_identifier");
    openapiFields.add("file_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dbt_connection_identifier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DbtGenerateSyncTmlRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DbtGenerateSyncTmlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbtGenerateSyncTmlRequest is not found in the empty JSON string", DbtGenerateSyncTmlRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DbtGenerateSyncTmlRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbtGenerateSyncTmlRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbtGenerateSyncTmlRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("dbt_connection_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbt_connection_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbt_connection_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbtGenerateSyncTmlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbtGenerateSyncTmlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbtGenerateSyncTmlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbtGenerateSyncTmlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DbtGenerateSyncTmlRequest>() {
           @Override
           public void write(JsonWriter out, DbtGenerateSyncTmlRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbtGenerateSyncTmlRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbtGenerateSyncTmlRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbtGenerateSyncTmlRequest
  * @throws IOException if the JSON string is invalid with respect to DbtGenerateSyncTmlRequest
  */
  public static DbtGenerateSyncTmlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbtGenerateSyncTmlRequest.class);
  }

 /**
  * Convert an instance of DbtGenerateSyncTmlRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

