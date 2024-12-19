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
 * SearchCommitsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T10:15:19.022933Z[Etc/UTC]")
public class SearchCommitsRequest {
  public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
  private String metadataIdentifier;

  /**
   * Type of metadata.
   */
  @JsonAdapter(MetadataTypeEnum.Adapter.class)
  public enum MetadataTypeEnum {
    LIVEBOARD("LIVEBOARD"),
    
    ANSWER("ANSWER"),
    
    LOGICAL_TABLE("LOGICAL_TABLE"),
    
    CUSTOM_ACTION("CUSTOM_ACTION");

    private String value;

    MetadataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetadataTypeEnum fromValue(String value) {
      for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetadataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";
  @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
  private MetadataTypeEnum metadataType;

  public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";
  @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
  private String branchName;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  private Integer recordOffset;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  private Integer recordSize;

  public SearchCommitsRequest() {
  }

  public SearchCommitsRequest metadataIdentifier(String metadataIdentifier) {
    
    this.metadataIdentifier = metadataIdentifier;
    return this;
  }

   /**
   * Unique ID or name of the metadata.
   * @return metadataIdentifier
  **/
  @javax.annotation.Nonnull
  public String getMetadataIdentifier() {
    return metadataIdentifier;
  }


  public void setMetadataIdentifier(String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
  }


  public SearchCommitsRequest metadataType(MetadataTypeEnum metadataType) {
    
    this.metadataType = metadataType;
    return this;
  }

   /**
   * Type of metadata.
   * @return metadataType
  **/
  @javax.annotation.Nullable
  public MetadataTypeEnum getMetadataType() {
    return metadataType;
  }


  public void setMetadataType(MetadataTypeEnum metadataType) {
    this.metadataType = metadataType;
  }


  public SearchCommitsRequest branchName(String branchName) {
    
    this.branchName = branchName;
    return this;
  }

   /**
   *    Name of the branch from which commit history needs to be displayed.      Note: If no branch_name is specified, then commits will be returned for the default branch for this configuration.
   * @return branchName
  **/
  @javax.annotation.Nullable
  public String getBranchName() {
    return branchName;
  }


  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public SearchCommitsRequest recordOffset(Integer recordOffset) {
    
    this.recordOffset = recordOffset;
    return this;
  }

   /**
   *     Record offset point in the commit history to display the response.       Note: If no record offset is specified, the beginning of the record will be considered.
   * @return recordOffset
  **/
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }


  public void setRecordOffset(Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public SearchCommitsRequest recordSize(Integer recordSize) {
    
    this.recordSize = recordSize;
    return this;
  }

   /**
   *     Number of history records from record offset point to be displayed in the response.       Note: If no record size is specified, then all the records will be considered.
   * @return recordSize
  **/
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }


  public void setRecordSize(Integer recordSize) {
    this.recordSize = recordSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCommitsRequest searchCommitsRequest = (SearchCommitsRequest) o;
    return Objects.equals(this.metadataIdentifier, searchCommitsRequest.metadataIdentifier) &&
        Objects.equals(this.metadataType, searchCommitsRequest.metadataType) &&
        Objects.equals(this.branchName, searchCommitsRequest.branchName) &&
        Objects.equals(this.recordOffset, searchCommitsRequest.recordOffset) &&
        Objects.equals(this.recordSize, searchCommitsRequest.recordSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataIdentifier, metadataType, branchName, recordOffset, recordSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCommitsRequest {\n");
    sb.append("    metadataIdentifier: ").append(toIndentedString(metadataIdentifier)).append("\n");
    sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
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
    openapiFields.add("metadata_type");
    openapiFields.add("branch_name");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_identifier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchCommitsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchCommitsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchCommitsRequest is not found in the empty JSON string", SearchCommitsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchCommitsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchCommitsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchCommitsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_identifier").toString()));
      }
      if ((jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull()) && !jsonObj.get("metadata_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_type").toString()));
      }
      if ((jsonObj.get("branch_name") != null && !jsonObj.get("branch_name").isJsonNull()) && !jsonObj.get("branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchCommitsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchCommitsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchCommitsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchCommitsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchCommitsRequest>() {
           @Override
           public void write(JsonWriter out, SearchCommitsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchCommitsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchCommitsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchCommitsRequest
  * @throws IOException if the JSON string is invalid with respect to SearchCommitsRequest
  */
  public static SearchCommitsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchCommitsRequest.class);
  }

 /**
  * Convert an instance of SearchCommitsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

