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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Options while fetching history runs for the schedule.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T11:03:56.651712770Z[Etc/UTC]")
public class SearchSchedulesRequestHistoryRunsOptions {
  public static final String SERIALIZED_NAME_INCLUDE_HISTORY_RUNS = "include_history_runs";
  @SerializedName(SERIALIZED_NAME_INCLUDE_HISTORY_RUNS)
  private Boolean includeHistoryRuns = false;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  private Integer recordSize = 10;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  private Integer recordOffset = 0;

  public SearchSchedulesRequestHistoryRunsOptions() {
  }

  public SearchSchedulesRequestHistoryRunsOptions includeHistoryRuns(Boolean includeHistoryRuns) {
    
    this.includeHistoryRuns = includeHistoryRuns;
    return this;
  }

   /**
   * Indicates whether to fetch history runs for the scheduled notification.
   * @return includeHistoryRuns
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeHistoryRuns() {
    return includeHistoryRuns;
  }


  public void setIncludeHistoryRuns(Boolean includeHistoryRuns) {
    this.includeHistoryRuns = includeHistoryRuns;
  }


  public SearchSchedulesRequestHistoryRunsOptions recordSize(Integer recordSize) {
    
    this.recordSize = recordSize;
    return this;
  }

   /**
   * Indicates the max number of records that can be fetched as past runs of any scheduled job.
   * @return recordSize
  **/
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }


  public void setRecordSize(Integer recordSize) {
    this.recordSize = recordSize;
  }


  public SearchSchedulesRequestHistoryRunsOptions recordOffset(Integer recordOffset) {
    
    this.recordOffset = recordOffset;
    return this;
  }

   /**
   * Indicates the starting record number from where history runs records should be fetched.
   * @return recordOffset
  **/
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }


  public void setRecordOffset(Integer recordOffset) {
    this.recordOffset = recordOffset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSchedulesRequestHistoryRunsOptions searchSchedulesRequestHistoryRunsOptions = (SearchSchedulesRequestHistoryRunsOptions) o;
    return Objects.equals(this.includeHistoryRuns, searchSchedulesRequestHistoryRunsOptions.includeHistoryRuns) &&
        Objects.equals(this.recordSize, searchSchedulesRequestHistoryRunsOptions.recordSize) &&
        Objects.equals(this.recordOffset, searchSchedulesRequestHistoryRunsOptions.recordOffset);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeHistoryRuns, recordSize, recordOffset);
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
    sb.append("class SearchSchedulesRequestHistoryRunsOptions {\n");
    sb.append("    includeHistoryRuns: ").append(toIndentedString(includeHistoryRuns)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
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
    openapiFields.add("include_history_runs");
    openapiFields.add("record_size");
    openapiFields.add("record_offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchSchedulesRequestHistoryRunsOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchSchedulesRequestHistoryRunsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchSchedulesRequestHistoryRunsOptions is not found in the empty JSON string", SearchSchedulesRequestHistoryRunsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchSchedulesRequestHistoryRunsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchSchedulesRequestHistoryRunsOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchSchedulesRequestHistoryRunsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchSchedulesRequestHistoryRunsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchSchedulesRequestHistoryRunsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchSchedulesRequestHistoryRunsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchSchedulesRequestHistoryRunsOptions>() {
           @Override
           public void write(JsonWriter out, SearchSchedulesRequestHistoryRunsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchSchedulesRequestHistoryRunsOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchSchedulesRequestHistoryRunsOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchSchedulesRequestHistoryRunsOptions
  * @throws IOException if the JSON string is invalid with respect to SearchSchedulesRequestHistoryRunsOptions
  */
  public static SearchSchedulesRequestHistoryRunsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchSchedulesRequestHistoryRunsOptions.class);
  }

 /**
  * Convert an instance of SearchSchedulesRequestHistoryRunsOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

