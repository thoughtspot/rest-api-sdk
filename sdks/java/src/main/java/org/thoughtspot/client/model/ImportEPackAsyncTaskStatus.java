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
import java.util.Arrays;
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
 * ImportEPackAsyncTaskStatus
 */

public class ImportEPackAsyncTaskStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nullable
  private String tenantId;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  @javax.annotation.Nullable
  private Integer orgId;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  @javax.annotation.Nullable
  private String taskId;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  @javax.annotation.Nullable
  private String taskName;

  public static final String SERIALIZED_NAME_IMPORT_RESPONSE = "import_response";
  @SerializedName(SERIALIZED_NAME_IMPORT_RESPONSE)
  @javax.annotation.Nullable
  private Object importResponse;

  /**
   * Current status of the task.
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
      return null;
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
  private TaskStatusEnum taskStatus;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  @javax.annotation.Nullable
  private String authorId;

  /**
   * Policy used for the import task.
   */
  @JsonAdapter(ImportPolicyEnum.Adapter.class)
  public enum ImportPolicyEnum {
    PARTIAL("PARTIAL"),
    
    ALL_OR_NONE("ALL_OR_NONE"),
    
    VALIDATE_ONLY("VALIDATE_ONLY"),
    
    PARTIAL_OBJECT("PARTIAL_OBJECT");

    private String value;

    ImportPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImportPolicyEnum fromValue(String value) {
      for (ImportPolicyEnum b : ImportPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImportPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImportPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImportPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImportPolicyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ImportPolicyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IMPORT_POLICY = "import_policy";
  @SerializedName(SERIALIZED_NAME_IMPORT_POLICY)
  @javax.annotation.Nullable
  private ImportPolicyEnum importPolicy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private Float createdAt;

  public static final String SERIALIZED_NAME_IN_PROGRESS_AT = "in_progress_at";
  @SerializedName(SERIALIZED_NAME_IN_PROGRESS_AT)
  @javax.annotation.Nullable
  private Float inProgressAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  @javax.annotation.Nullable
  private Float completedAt;

  public static final String SERIALIZED_NAME_TOTAL_OBJECT_COUNT = "total_object_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_OBJECT_COUNT)
  @javax.annotation.Nullable
  private Integer totalObjectCount;

  public static final String SERIALIZED_NAME_OBJECT_PROCESSED_COUNT = "object_processed_count";
  @SerializedName(SERIALIZED_NAME_OBJECT_PROCESSED_COUNT)
  @javax.annotation.Nullable
  private Integer objectProcessedCount;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  @javax.annotation.Nullable
  private Float modifiedAt;

  public ImportEPackAsyncTaskStatus() {
  }

  public ImportEPackAsyncTaskStatus tenantId(@javax.annotation.Nullable String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * GUID of tenant from which the task is initiated.
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(@javax.annotation.Nullable String tenantId) {
    this.tenantId = tenantId;
  }


  public ImportEPackAsyncTaskStatus orgId(@javax.annotation.Nullable Integer orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Organisation ID of the user who initiated the task.
   * @return orgId
   */
  @javax.annotation.Nullable
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(@javax.annotation.Nullable Integer orgId) {
    this.orgId = orgId;
  }


  public ImportEPackAsyncTaskStatus taskId(@javax.annotation.Nullable String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Unique identifier for the task.
   * @return taskId
   */
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(@javax.annotation.Nullable String taskId) {
    this.taskId = taskId;
  }


  public ImportEPackAsyncTaskStatus taskName(@javax.annotation.Nullable String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Name of the task.
   * @return taskName
   */
  @javax.annotation.Nullable
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(@javax.annotation.Nullable String taskName) {
    this.taskName = taskName;
  }


  public ImportEPackAsyncTaskStatus importResponse(@javax.annotation.Nullable Object importResponse) {
    this.importResponse = importResponse;
    return this;
  }

  /**
   * Response of imported objects so far.
   * @return importResponse
   */
  @javax.annotation.Nullable
  public Object getImportResponse() {
    return importResponse;
  }

  public void setImportResponse(@javax.annotation.Nullable Object importResponse) {
    this.importResponse = importResponse;
  }


  public ImportEPackAsyncTaskStatus taskStatus(@javax.annotation.Nullable TaskStatusEnum taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  /**
   * Current status of the task.
   * @return taskStatus
   */
  @javax.annotation.Nullable
  public TaskStatusEnum getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(@javax.annotation.Nullable TaskStatusEnum taskStatus) {
    this.taskStatus = taskStatus;
  }


  public ImportEPackAsyncTaskStatus authorId(@javax.annotation.Nullable String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * ID of the user who initiated the task.
   * @return authorId
   */
  @javax.annotation.Nullable
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(@javax.annotation.Nullable String authorId) {
    this.authorId = authorId;
  }


  public ImportEPackAsyncTaskStatus importPolicy(@javax.annotation.Nullable ImportPolicyEnum importPolicy) {
    this.importPolicy = importPolicy;
    return this;
  }

  /**
   * Policy used for the import task.
   * @return importPolicy
   */
  @javax.annotation.Nullable
  public ImportPolicyEnum getImportPolicy() {
    return importPolicy;
  }

  public void setImportPolicy(@javax.annotation.Nullable ImportPolicyEnum importPolicy) {
    this.importPolicy = importPolicy;
  }


  public ImportEPackAsyncTaskStatus createdAt(@javax.annotation.Nullable Float createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the task was created (in ms since epoch).
   * @return createdAt
   */
  @javax.annotation.Nullable
  public Float getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable Float createdAt) {
    this.createdAt = createdAt;
  }


  public ImportEPackAsyncTaskStatus inProgressAt(@javax.annotation.Nullable Float inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

  /**
   * Time when the task started (in ms since epoch).
   * @return inProgressAt
   */
  @javax.annotation.Nullable
  public Float getInProgressAt() {
    return inProgressAt;
  }

  public void setInProgressAt(@javax.annotation.Nullable Float inProgressAt) {
    this.inProgressAt = inProgressAt;
  }


  public ImportEPackAsyncTaskStatus completedAt(@javax.annotation.Nullable Float completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Time when the task was completed (in ms since epoch).
   * @return completedAt
   */
  @javax.annotation.Nullable
  public Float getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(@javax.annotation.Nullable Float completedAt) {
    this.completedAt = completedAt;
  }


  public ImportEPackAsyncTaskStatus totalObjectCount(@javax.annotation.Nullable Integer totalObjectCount) {
    this.totalObjectCount = totalObjectCount;
    return this;
  }

  /**
   * Total number of objects to process.
   * @return totalObjectCount
   */
  @javax.annotation.Nullable
  public Integer getTotalObjectCount() {
    return totalObjectCount;
  }

  public void setTotalObjectCount(@javax.annotation.Nullable Integer totalObjectCount) {
    this.totalObjectCount = totalObjectCount;
  }


  public ImportEPackAsyncTaskStatus objectProcessedCount(@javax.annotation.Nullable Integer objectProcessedCount) {
    this.objectProcessedCount = objectProcessedCount;
    return this;
  }

  /**
   * Number of objects processed so far.
   * @return objectProcessedCount
   */
  @javax.annotation.Nullable
  public Integer getObjectProcessedCount() {
    return objectProcessedCount;
  }

  public void setObjectProcessedCount(@javax.annotation.Nullable Integer objectProcessedCount) {
    this.objectProcessedCount = objectProcessedCount;
  }


  public ImportEPackAsyncTaskStatus modifiedAt(@javax.annotation.Nullable Float modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Last time the task status was updated (in ms since epoch).
   * @return modifiedAt
   */
  @javax.annotation.Nullable
  public Float getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(@javax.annotation.Nullable Float modifiedAt) {
    this.modifiedAt = modifiedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportEPackAsyncTaskStatus importEPackAsyncTaskStatus = (ImportEPackAsyncTaskStatus) o;
    return Objects.equals(this.tenantId, importEPackAsyncTaskStatus.tenantId) &&
        Objects.equals(this.orgId, importEPackAsyncTaskStatus.orgId) &&
        Objects.equals(this.taskId, importEPackAsyncTaskStatus.taskId) &&
        Objects.equals(this.taskName, importEPackAsyncTaskStatus.taskName) &&
        Objects.equals(this.importResponse, importEPackAsyncTaskStatus.importResponse) &&
        Objects.equals(this.taskStatus, importEPackAsyncTaskStatus.taskStatus) &&
        Objects.equals(this.authorId, importEPackAsyncTaskStatus.authorId) &&
        Objects.equals(this.importPolicy, importEPackAsyncTaskStatus.importPolicy) &&
        Objects.equals(this.createdAt, importEPackAsyncTaskStatus.createdAt) &&
        Objects.equals(this.inProgressAt, importEPackAsyncTaskStatus.inProgressAt) &&
        Objects.equals(this.completedAt, importEPackAsyncTaskStatus.completedAt) &&
        Objects.equals(this.totalObjectCount, importEPackAsyncTaskStatus.totalObjectCount) &&
        Objects.equals(this.objectProcessedCount, importEPackAsyncTaskStatus.objectProcessedCount) &&
        Objects.equals(this.modifiedAt, importEPackAsyncTaskStatus.modifiedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, orgId, taskId, taskName, importResponse, taskStatus, authorId, importPolicy, createdAt, inProgressAt, completedAt, totalObjectCount, objectProcessedCount, modifiedAt);
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
    sb.append("class ImportEPackAsyncTaskStatus {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    importResponse: ").append(toIndentedString(importResponse)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    importPolicy: ").append(toIndentedString(importPolicy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    inProgressAt: ").append(toIndentedString(inProgressAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    totalObjectCount: ").append(toIndentedString(totalObjectCount)).append("\n");
    sb.append("    objectProcessedCount: ").append(toIndentedString(objectProcessedCount)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
    openapiFields.add("tenant_id");
    openapiFields.add("org_id");
    openapiFields.add("task_id");
    openapiFields.add("task_name");
    openapiFields.add("import_response");
    openapiFields.add("task_status");
    openapiFields.add("author_id");
    openapiFields.add("import_policy");
    openapiFields.add("created_at");
    openapiFields.add("in_progress_at");
    openapiFields.add("completed_at");
    openapiFields.add("total_object_count");
    openapiFields.add("object_processed_count");
    openapiFields.add("modified_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImportEPackAsyncTaskStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportEPackAsyncTaskStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportEPackAsyncTaskStatus is not found in the empty JSON string", ImportEPackAsyncTaskStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImportEPackAsyncTaskStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportEPackAsyncTaskStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("task_id") != null && !jsonObj.get("task_id").isJsonNull()) && !jsonObj.get("task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_id").toString()));
      }
      if ((jsonObj.get("task_name") != null && !jsonObj.get("task_name").isJsonNull()) && !jsonObj.get("task_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_name").toString()));
      }
      if ((jsonObj.get("task_status") != null && !jsonObj.get("task_status").isJsonNull()) && !jsonObj.get("task_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_status").toString()));
      }
      // validate the optional field `task_status`
      if (jsonObj.get("task_status") != null && !jsonObj.get("task_status").isJsonNull()) {
        TaskStatusEnum.validateJsonElement(jsonObj.get("task_status"));
      }
      if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull()) && !jsonObj.get("author_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_id").toString()));
      }
      if ((jsonObj.get("import_policy") != null && !jsonObj.get("import_policy").isJsonNull()) && !jsonObj.get("import_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_policy").toString()));
      }
      // validate the optional field `import_policy`
      if (jsonObj.get("import_policy") != null && !jsonObj.get("import_policy").isJsonNull()) {
        ImportPolicyEnum.validateJsonElement(jsonObj.get("import_policy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportEPackAsyncTaskStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportEPackAsyncTaskStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportEPackAsyncTaskStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportEPackAsyncTaskStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportEPackAsyncTaskStatus>() {
           @Override
           public void write(JsonWriter out, ImportEPackAsyncTaskStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportEPackAsyncTaskStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImportEPackAsyncTaskStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImportEPackAsyncTaskStatus
   * @throws IOException if the JSON string is invalid with respect to ImportEPackAsyncTaskStatus
   */
  public static ImportEPackAsyncTaskStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportEPackAsyncTaskStatus.class);
  }

  /**
   * Convert an instance of ImportEPackAsyncTaskStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

