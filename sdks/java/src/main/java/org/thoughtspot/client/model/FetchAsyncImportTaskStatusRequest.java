/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

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
import org.openapitools.jackson.nullable.JsonNullable;
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

import org.thoughtspot.client.JSON;

/**
 * FetchAsyncImportTaskStatusRequest
 */

public class FetchAsyncImportTaskStatusRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  @javax.annotation.Nullable
  private List<String> taskIds = new ArrayList<>();

  /**
   * Gets or Sets taskStatus
   */
  @JsonAdapter(TaskStatusEnum.Adapter.class)
  public enum TaskStatusEnum {
    COMPLETED("COMPLETED"),
    
    IN_QUEUE("IN_QUEUE"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    FAILED("FAILED");

    private String value;

    TaskStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaskStatusEnum fromValue(String value) {
      for (TaskStatusEnum b : TaskStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaskStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaskStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaskStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaskStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TaskStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TASK_STATUS = "task_status";
  @SerializedName(SERIALIZED_NAME_TASK_STATUS)
  @javax.annotation.Nullable
  private List<TaskStatusEnum> taskStatus = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHOR_IDENTIFIER = "author_identifier";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDENTIFIER)
  @javax.annotation.Nullable
  private String authorIdentifier;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  @javax.annotation.Nullable
  private Integer recordOffset = 0;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  @javax.annotation.Nullable
  private Integer recordSize = 5;

  public static final String SERIALIZED_NAME_INCLUDE_IMPORT_RESPONSE = "include_import_response";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IMPORT_RESPONSE)
  @javax.annotation.Nullable
  private Boolean includeImportResponse = false;

  public FetchAsyncImportTaskStatusRequest() {
  }

  public FetchAsyncImportTaskStatusRequest taskIds(@javax.annotation.Nullable List<String> taskIds) {
    this.taskIds = taskIds;
    return this;
  }

  public FetchAsyncImportTaskStatusRequest addTaskIdsItem(String taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

  /**
   * List of task IDs to fetch status for.
   * @return taskIds
   */
  @javax.annotation.Nullable
  public List<String> getTaskIds() {
    return taskIds;
  }

  public void setTaskIds(@javax.annotation.Nullable List<String> taskIds) {
    this.taskIds = taskIds;
  }


  public FetchAsyncImportTaskStatusRequest taskStatus(@javax.annotation.Nullable List<TaskStatusEnum> taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  public FetchAsyncImportTaskStatusRequest addTaskStatusItem(TaskStatusEnum taskStatusItem) {
    if (this.taskStatus == null) {
      this.taskStatus = new ArrayList<>();
    }
    this.taskStatus.add(taskStatusItem);
    return this;
  }

  /**
   * List of task statuses to filter on. Valid values: [IN_QUEUE, IN_PROGRESS, COMPLETED, FAILED]
   * @return taskStatus
   */
  @javax.annotation.Nullable
  public List<TaskStatusEnum> getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(@javax.annotation.Nullable List<TaskStatusEnum> taskStatus) {
    this.taskStatus = taskStatus;
  }


  public FetchAsyncImportTaskStatusRequest authorIdentifier(@javax.annotation.Nullable String authorIdentifier) {
    this.authorIdentifier = authorIdentifier;
    return this;
  }

  /**
   * Author GUID or name of async import tasks to filter on.
   * @return authorIdentifier
   */
  @javax.annotation.Nullable
  public String getAuthorIdentifier() {
    return authorIdentifier;
  }

  public void setAuthorIdentifier(@javax.annotation.Nullable String authorIdentifier) {
    this.authorIdentifier = authorIdentifier;
  }


  public FetchAsyncImportTaskStatusRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
    return this;
  }

  /**
   * The offset point, starting from where the task status should be included in the response.
   * @return recordOffset
   */
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }

  public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public FetchAsyncImportTaskStatusRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
    return this;
  }

  /**
   * The number of task statuses that should be included in the response starting from offset position.
   * @return recordSize
   */
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }

  public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
  }


  public FetchAsyncImportTaskStatusRequest includeImportResponse(@javax.annotation.Nullable Boolean includeImportResponse) {
    this.includeImportResponse = includeImportResponse;
    return this;
  }

  /**
   * Boolean flag to specify whether to include import response in the task status objects.
   * @return includeImportResponse
   */
  @javax.annotation.Nullable
  public Boolean getIncludeImportResponse() {
    return includeImportResponse;
  }

  public void setIncludeImportResponse(@javax.annotation.Nullable Boolean includeImportResponse) {
    this.includeImportResponse = includeImportResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest = (FetchAsyncImportTaskStatusRequest) o;
    return Objects.equals(this.taskIds, fetchAsyncImportTaskStatusRequest.taskIds) &&
        Objects.equals(this.taskStatus, fetchAsyncImportTaskStatusRequest.taskStatus) &&
        Objects.equals(this.authorIdentifier, fetchAsyncImportTaskStatusRequest.authorIdentifier) &&
        Objects.equals(this.recordOffset, fetchAsyncImportTaskStatusRequest.recordOffset) &&
        Objects.equals(this.recordSize, fetchAsyncImportTaskStatusRequest.recordSize) &&
        Objects.equals(this.includeImportResponse, fetchAsyncImportTaskStatusRequest.includeImportResponse);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskIds, taskStatus, authorIdentifier, recordOffset, recordSize, includeImportResponse);
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
    sb.append("class FetchAsyncImportTaskStatusRequest {\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    authorIdentifier: ").append(toIndentedString(authorIdentifier)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    includeImportResponse: ").append(toIndentedString(includeImportResponse)).append("\n");
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
    openapiFields.add("task_ids");
    openapiFields.add("task_status");
    openapiFields.add("author_identifier");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("include_import_response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FetchAsyncImportTaskStatusRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FetchAsyncImportTaskStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchAsyncImportTaskStatusRequest is not found in the empty JSON string", FetchAsyncImportTaskStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FetchAsyncImportTaskStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FetchAsyncImportTaskStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("task_ids") != null && !jsonObj.get("task_ids").isJsonNull() && !jsonObj.get("task_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_ids` to be an array in the JSON string but got `%s`", jsonObj.get("task_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("task_status") != null && !jsonObj.get("task_status").isJsonNull() && !jsonObj.get("task_status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_status` to be an array in the JSON string but got `%s`", jsonObj.get("task_status").toString()));
      }
      if ((jsonObj.get("author_identifier") != null && !jsonObj.get("author_identifier").isJsonNull()) && !jsonObj.get("author_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchAsyncImportTaskStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchAsyncImportTaskStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchAsyncImportTaskStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchAsyncImportTaskStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchAsyncImportTaskStatusRequest>() {
           @Override
           public void write(JsonWriter out, FetchAsyncImportTaskStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchAsyncImportTaskStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FetchAsyncImportTaskStatusRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FetchAsyncImportTaskStatusRequest
   * @throws IOException if the JSON string is invalid with respect to FetchAsyncImportTaskStatusRequest
   */
  public static FetchAsyncImportTaskStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchAsyncImportTaskStatusRequest.class);
  }

  /**
   * Convert an instance of FetchAsyncImportTaskStatusRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

