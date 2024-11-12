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
 * Schedule run response object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T09:37:12.899082-08:00[America/Los_Angeles]")
public class ResponseScheduleRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_START_TIME_IN_MILLIS = "start_time_in_millis";
  @SerializedName(SERIALIZED_NAME_START_TIME_IN_MILLIS)
  private Integer startTimeInMillis;

  public static final String SERIALIZED_NAME_END_TIME_IN_MILLIS = "end_time_in_millis";
  @SerializedName(SERIALIZED_NAME_END_TIME_IN_MILLIS)
  private Integer endTimeInMillis;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public ResponseScheduleRun() {
  }

  public ResponseScheduleRun id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * GUID of the scheduled job.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ResponseScheduleRun startTimeInMillis(Integer startTimeInMillis) {
    
    this.startTimeInMillis = startTimeInMillis;
    return this;
  }

   /**
   * Schedule run start time in milliseconds.
   * @return startTimeInMillis
  **/
  @javax.annotation.Nonnull
  public Integer getStartTimeInMillis() {
    return startTimeInMillis;
  }


  public void setStartTimeInMillis(Integer startTimeInMillis) {
    this.startTimeInMillis = startTimeInMillis;
  }


  public ResponseScheduleRun endTimeInMillis(Integer endTimeInMillis) {
    
    this.endTimeInMillis = endTimeInMillis;
    return this;
  }

   /**
   * Schedule run end time in milliseconds.
   * @return endTimeInMillis
  **/
  @javax.annotation.Nonnull
  public Integer getEndTimeInMillis() {
    return endTimeInMillis;
  }


  public void setEndTimeInMillis(Integer endTimeInMillis) {
    this.endTimeInMillis = endTimeInMillis;
  }


  public ResponseScheduleRun status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the schedule run.
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ResponseScheduleRun detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Message details related to the schedule run.
   * @return detail
  **/
  @javax.annotation.Nullable
  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseScheduleRun responseScheduleRun = (ResponseScheduleRun) o;
    return Objects.equals(this.id, responseScheduleRun.id) &&
        Objects.equals(this.startTimeInMillis, responseScheduleRun.startTimeInMillis) &&
        Objects.equals(this.endTimeInMillis, responseScheduleRun.endTimeInMillis) &&
        Objects.equals(this.status, responseScheduleRun.status) &&
        Objects.equals(this.detail, responseScheduleRun.detail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTimeInMillis, endTimeInMillis, status, detail);
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
    sb.append("class ResponseScheduleRun {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTimeInMillis: ").append(toIndentedString(startTimeInMillis)).append("\n");
    sb.append("    endTimeInMillis: ").append(toIndentedString(endTimeInMillis)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("start_time_in_millis");
    openapiFields.add("end_time_in_millis");
    openapiFields.add("status");
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("start_time_in_millis");
    openapiRequiredFields.add("end_time_in_millis");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseScheduleRun
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResponseScheduleRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseScheduleRun is not found in the empty JSON string", ResponseScheduleRun.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseScheduleRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseScheduleRun` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseScheduleRun.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseScheduleRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseScheduleRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseScheduleRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseScheduleRun.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseScheduleRun>() {
           @Override
           public void write(JsonWriter out, ResponseScheduleRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseScheduleRun read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseScheduleRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseScheduleRun
  * @throws IOException if the JSON string is invalid with respect to ResponseScheduleRun
  */
  public static ResponseScheduleRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseScheduleRun.class);
  }

 /**
  * Convert an instance of ResponseScheduleRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

