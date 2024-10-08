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
import org.thoughtspot.client.model.MetadataInput;
import org.thoughtspot.client.model.SearchSchedulesRequestHistoryRunsOptions;
import org.thoughtspot.client.model.SearchSchedulesRequestSortOptions;

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
 * SearchSchedulesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T19:10:59.327084+05:30[Asia/Kolkata]")
public class SearchSchedulesRequest {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<MetadataInput> metadata;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  private Integer recordOffset;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  private Integer recordSize;

  public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";
  @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
  private SearchSchedulesRequestSortOptions sortOptions;

  public static final String SERIALIZED_NAME_HISTORY_RUNS_OPTIONS = "history_runs_options";
  @SerializedName(SERIALIZED_NAME_HISTORY_RUNS_OPTIONS)
  private SearchSchedulesRequestHistoryRunsOptions historyRunsOptions;

  public static final String SERIALIZED_NAME_SCHEDULE_IDENTIFIERS = "schedule_identifiers";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_IDENTIFIERS)
  private List<String> scheduleIdentifiers;

  public SearchSchedulesRequest() {
  }

  public SearchSchedulesRequest metadata(List<MetadataInput> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SearchSchedulesRequest addMetadataItem(MetadataInput metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Metadata objects associated with the scheduled jobs.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<MetadataInput> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<MetadataInput> metadata) {
    this.metadata = metadata;
  }


  public SearchSchedulesRequest recordOffset(Integer recordOffset) {
    
    this.recordOffset = recordOffset;
    return this;
  }

   /**
   * The starting record number from where the records should be included.
   * @return recordOffset
  **/
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }


  public void setRecordOffset(Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public SearchSchedulesRequest recordSize(Integer recordSize) {
    
    this.recordSize = recordSize;
    return this;
  }

   /**
   * The number of records that should be included.
   * @return recordSize
  **/
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }


  public void setRecordSize(Integer recordSize) {
    this.recordSize = recordSize;
  }


  public SearchSchedulesRequest sortOptions(SearchSchedulesRequestSortOptions sortOptions) {
    
    this.sortOptions = sortOptions;
    return this;
  }

   /**
   * Get sortOptions
   * @return sortOptions
  **/
  @javax.annotation.Nullable
  public SearchSchedulesRequestSortOptions getSortOptions() {
    return sortOptions;
  }


  public void setSortOptions(SearchSchedulesRequestSortOptions sortOptions) {
    this.sortOptions = sortOptions;
  }


  public SearchSchedulesRequest historyRunsOptions(SearchSchedulesRequestHistoryRunsOptions historyRunsOptions) {
    
    this.historyRunsOptions = historyRunsOptions;
    return this;
  }

   /**
   * Get historyRunsOptions
   * @return historyRunsOptions
  **/
  @javax.annotation.Nullable
  public SearchSchedulesRequestHistoryRunsOptions getHistoryRunsOptions() {
    return historyRunsOptions;
  }


  public void setHistoryRunsOptions(SearchSchedulesRequestHistoryRunsOptions historyRunsOptions) {
    this.historyRunsOptions = historyRunsOptions;
  }


  public SearchSchedulesRequest scheduleIdentifiers(List<String> scheduleIdentifiers) {
    
    this.scheduleIdentifiers = scheduleIdentifiers;
    return this;
  }

  public SearchSchedulesRequest addScheduleIdentifiersItem(String scheduleIdentifiersItem) {
    if (this.scheduleIdentifiers == null) {
      this.scheduleIdentifiers = new ArrayList<>();
    }
    this.scheduleIdentifiers.add(scheduleIdentifiersItem);
    return this;
  }

   /**
   * unique ID or name of the Schedule
   * @return scheduleIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getScheduleIdentifiers() {
    return scheduleIdentifiers;
  }


  public void setScheduleIdentifiers(List<String> scheduleIdentifiers) {
    this.scheduleIdentifiers = scheduleIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSchedulesRequest searchSchedulesRequest = (SearchSchedulesRequest) o;
    return Objects.equals(this.metadata, searchSchedulesRequest.metadata) &&
        Objects.equals(this.recordOffset, searchSchedulesRequest.recordOffset) &&
        Objects.equals(this.recordSize, searchSchedulesRequest.recordSize) &&
        Objects.equals(this.sortOptions, searchSchedulesRequest.sortOptions) &&
        Objects.equals(this.historyRunsOptions, searchSchedulesRequest.historyRunsOptions) &&
        Objects.equals(this.scheduleIdentifiers, searchSchedulesRequest.scheduleIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, recordOffset, recordSize, sortOptions, historyRunsOptions, scheduleIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSchedulesRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
    sb.append("    historyRunsOptions: ").append(toIndentedString(historyRunsOptions)).append("\n");
    sb.append("    scheduleIdentifiers: ").append(toIndentedString(scheduleIdentifiers)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("sort_options");
    openapiFields.add("history_runs_options");
    openapiFields.add("schedule_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchSchedulesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchSchedulesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchSchedulesRequest is not found in the empty JSON string", SearchSchedulesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchSchedulesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchSchedulesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            MetadataInput.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `sort_options`
      if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
        SearchSchedulesRequestSortOptions.validateJsonObject(jsonObj.getAsJsonObject("sort_options"));
      }
      // validate the optional field `history_runs_options`
      if (jsonObj.get("history_runs_options") != null && !jsonObj.get("history_runs_options").isJsonNull()) {
        SearchSchedulesRequestHistoryRunsOptions.validateJsonObject(jsonObj.getAsJsonObject("history_runs_options"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schedule_identifiers") != null && !jsonObj.get("schedule_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("schedule_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchSchedulesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchSchedulesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchSchedulesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchSchedulesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchSchedulesRequest>() {
           @Override
           public void write(JsonWriter out, SearchSchedulesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchSchedulesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchSchedulesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchSchedulesRequest
  * @throws IOException if the JSON string is invalid with respect to SearchSchedulesRequest
  */
  public static SearchSchedulesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchSchedulesRequest.class);
  }

 /**
  * Convert an instance of SearchSchedulesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

