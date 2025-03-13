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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.ImportEPackAsyncTaskStatus;

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
 * GetAsyncImportStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T11:03:56.651712770Z[Etc/UTC]")
public class GetAsyncImportStatusResponse {
  public static final String SERIALIZED_NAME_STATUS_LIST = "status_list";
  @SerializedName(SERIALIZED_NAME_STATUS_LIST)
  private List<ImportEPackAsyncTaskStatus> statusList;

  public static final String SERIALIZED_NAME_LAST_BATCH = "last_batch";
  @SerializedName(SERIALIZED_NAME_LAST_BATCH)
  private Boolean lastBatch;

  public GetAsyncImportStatusResponse() {
  }

  public GetAsyncImportStatusResponse statusList(List<ImportEPackAsyncTaskStatus> statusList) {
    
    this.statusList = statusList;
    return this;
  }

  public GetAsyncImportStatusResponse addStatusListItem(ImportEPackAsyncTaskStatus statusListItem) {
    if (this.statusList == null) {
      this.statusList = new ArrayList<>();
    }
    this.statusList.add(statusListItem);
    return this;
  }

   /**
   * List of task statuses.
   * @return statusList
  **/
  @javax.annotation.Nullable
  public List<ImportEPackAsyncTaskStatus> getStatusList() {
    return statusList;
  }


  public void setStatusList(List<ImportEPackAsyncTaskStatus> statusList) {
    this.statusList = statusList;
  }


  public GetAsyncImportStatusResponse lastBatch(Boolean lastBatch) {
    
    this.lastBatch = lastBatch;
    return this;
  }

   /**
   * Indicates whether there are more task statuses to fetch.
   * @return lastBatch
  **/
  @javax.annotation.Nullable
  public Boolean getLastBatch() {
    return lastBatch;
  }


  public void setLastBatch(Boolean lastBatch) {
    this.lastBatch = lastBatch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAsyncImportStatusResponse getAsyncImportStatusResponse = (GetAsyncImportStatusResponse) o;
    return Objects.equals(this.statusList, getAsyncImportStatusResponse.statusList) &&
        Objects.equals(this.lastBatch, getAsyncImportStatusResponse.lastBatch);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusList, lastBatch);
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
    sb.append("class GetAsyncImportStatusResponse {\n");
    sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
    sb.append("    lastBatch: ").append(toIndentedString(lastBatch)).append("\n");
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
    openapiFields.add("status_list");
    openapiFields.add("last_batch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAsyncImportStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetAsyncImportStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAsyncImportStatusResponse is not found in the empty JSON string", GetAsyncImportStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAsyncImportStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAsyncImportStatusResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("status_list") != null && !jsonObj.get("status_list").isJsonNull()) {
        JsonArray jsonArraystatusList = jsonObj.getAsJsonArray("status_list");
        if (jsonArraystatusList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("status_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `status_list` to be an array in the JSON string but got `%s`", jsonObj.get("status_list").toString()));
          }

          // validate the optional field `status_list` (array)
          for (int i = 0; i < jsonArraystatusList.size(); i++) {
            ImportEPackAsyncTaskStatus.validateJsonObject(jsonArraystatusList.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAsyncImportStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAsyncImportStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAsyncImportStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAsyncImportStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAsyncImportStatusResponse>() {
           @Override
           public void write(JsonWriter out, GetAsyncImportStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAsyncImportStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAsyncImportStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAsyncImportStatusResponse
  * @throws IOException if the JSON string is invalid with respect to GetAsyncImportStatusResponse
  */
  public static GetAsyncImportStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAsyncImportStatusResponse.class);
  }

 /**
  * Convert an instance of GetAsyncImportStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

