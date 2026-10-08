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
import com.thoughtspot.client.model.VersionControlObjectInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * SearchVersionControlRunsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SearchVersionControlRunsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RUN_IDENTIFIERS = "run_identifiers";
  @SerializedName(SERIALIZED_NAME_RUN_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> runIdentifiers;

  /**
   * Return only runs admitted by this operation. COMMIT is your Org&#39;s commit history, DEPLOY the content it received, RESTORE the rollbacks it ran. Omit this to return every type.
   */
  @JsonAdapter(RunTypeEnum.Adapter.class)
  public enum RunTypeEnum {
    COMMIT("COMMIT"),
    
    DEPLOY("DEPLOY"),
    
    RESTORE("RESTORE");

    private String value;

    RunTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunTypeEnum fromValue(String value) {
      for (RunTypeEnum b : RunTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RunTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RunTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RunTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RUN_TYPE = "run_type";
  @SerializedName(SERIALIZED_NAME_RUN_TYPE)
  @javax.annotation.Nullable
  private RunTypeEnum runType;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  @javax.annotation.Nullable
  private List<VersionControlObjectInput> objects;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  @javax.annotation.Nullable
  private Integer recordOffset = 0;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  @javax.annotation.Nullable
  private Integer recordSize = 10;

  public SearchVersionControlRunsRequest() {
  }

  public SearchVersionControlRunsRequest runIdentifiers(@javax.annotation.Nullable List<String> runIdentifiers) {
    this.runIdentifiers = runIdentifiers;
    return this;
  }

  public SearchVersionControlRunsRequest addRunIdentifiersItem(String runIdentifiersItem) {
    if (this.runIdentifiers == null) {
      this.runIdentifiers = new ArrayList<>();
    }
    this.runIdentifiers.add(runIdentifiersItem);
    return this;
  }

  /**
   * Runs to read, as run IDs returned when each run was admitted, at most 100. Omit this to return your Org&#39;s runs, newest first. Paging applies either way.
   * @return runIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getRunIdentifiers() {
    return runIdentifiers;
  }

  public void setRunIdentifiers(@javax.annotation.Nullable List<String> runIdentifiers) {
    this.runIdentifiers = runIdentifiers;
  }


  public SearchVersionControlRunsRequest runType(@javax.annotation.Nullable RunTypeEnum runType) {
    this.runType = runType;
    return this;
  }

  /**
   * Return only runs admitted by this operation. COMMIT is your Org&#39;s commit history, DEPLOY the content it received, RESTORE the rollbacks it ran. Omit this to return every type.
   * @return runType
   */
  @javax.annotation.Nullable
  public RunTypeEnum getRunType() {
    return runType;
  }

  public void setRunType(@javax.annotation.Nullable RunTypeEnum runType) {
    this.runType = runType;
  }


  public SearchVersionControlRunsRequest objects(@javax.annotation.Nullable List<VersionControlObjectInput> objects) {
    this.objects = objects;
    return this;
  }

  public SearchVersionControlRunsRequest addObjectsItem(VersionControlObjectInput objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

  /**
   * Return only runs that carry a result for at least one of these objects. Objects are named as on the commit endpoint, except that the type may also be LOGICAL_TABLE: a run can report a type that a commit does not accept. Omit this to return runs regardless of the objects they touched.
   * @return objects
   */
  @javax.annotation.Nullable
  public List<VersionControlObjectInput> getObjects() {
    return objects;
  }

  public void setObjects(@javax.annotation.Nullable List<VersionControlObjectInput> objects) {
    this.objects = objects;
  }


  public SearchVersionControlRunsRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
    return this;
  }

  /**
   * The starting record number from where the runs should be included, in newest-first order.
   * @return recordOffset
   */
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }

  public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public SearchVersionControlRunsRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
    return this;
  }

  /**
   * The number of runs that should be included, between 1 and 100. Applies to run_identifiers too: naming more runs than this returns only the first page.
   * @return recordSize
   */
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }

  public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SearchVersionControlRunsRequest instance itself
   */
  public SearchVersionControlRunsRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchVersionControlRunsRequest searchVersionControlRunsRequest = (SearchVersionControlRunsRequest) o;
    return Objects.equals(this.runIdentifiers, searchVersionControlRunsRequest.runIdentifiers) &&
        Objects.equals(this.runType, searchVersionControlRunsRequest.runType) &&
        Objects.equals(this.objects, searchVersionControlRunsRequest.objects) &&
        Objects.equals(this.recordOffset, searchVersionControlRunsRequest.recordOffset) &&
        Objects.equals(this.recordSize, searchVersionControlRunsRequest.recordSize)&&
        Objects.equals(this.additionalProperties, searchVersionControlRunsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runIdentifiers, runType, objects, recordOffset, recordSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchVersionControlRunsRequest {\n");
    sb.append("    runIdentifiers: ").append(toIndentedString(runIdentifiers)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("run_identifiers");
    openapiFields.add("run_type");
    openapiFields.add("objects");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchVersionControlRunsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchVersionControlRunsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchVersionControlRunsRequest is not found in the empty JSON string", SearchVersionControlRunsRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("run_identifiers") != null && !jsonObj.get("run_identifiers").isJsonNull() && !jsonObj.get("run_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("run_identifiers").toString()));
      }
      if ((jsonObj.get("run_type") != null && !jsonObj.get("run_type").isJsonNull()) && !jsonObj.get("run_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_type").toString()));
      }
      // validate the optional field `run_type`
      if (jsonObj.get("run_type") != null && !jsonObj.get("run_type").isJsonNull()) {
        RunTypeEnum.validateJsonElement(jsonObj.get("run_type"));
      }
      if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
        JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
        if (jsonArrayobjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("objects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
          }

          // validate the optional field `objects` (array)
          for (int i = 0; i < jsonArrayobjects.size(); i++) {
            VersionControlObjectInput.validateJsonElement(jsonArrayobjects.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchVersionControlRunsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchVersionControlRunsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchVersionControlRunsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchVersionControlRunsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchVersionControlRunsRequest>() {
           @Override
           public void write(JsonWriter out, SearchVersionControlRunsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchVersionControlRunsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SearchVersionControlRunsRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchVersionControlRunsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchVersionControlRunsRequest
   * @throws IOException if the JSON string is invalid with respect to SearchVersionControlRunsRequest
   */
  public static SearchVersionControlRunsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchVersionControlRunsRequest.class);
  }

  /**
   * Convert an instance of SearchVersionControlRunsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

