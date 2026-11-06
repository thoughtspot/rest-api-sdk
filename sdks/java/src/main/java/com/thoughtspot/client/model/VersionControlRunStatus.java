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
import com.thoughtspot.client.model.VersionControlObjectResult;
import com.thoughtspot.client.model.VersionControlPrincipal;
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
 * Current outcome of one run.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlRunStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  /**
   * Which operation admitted the run.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COMMIT("COMMIT"),
    
    DEPLOY("DEPLOY"),
    
    RESTORE("RESTORE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  /**
   * Where the run stands.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("RUNNING"),
    
    SUCCESS("SUCCESS"),
    
    PARTIAL_SUCCESS("PARTIAL_SUCCESS"),
    
    FAILED("FAILED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nonnull
  private StateEnum state;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_ACCEPTED_TIME_IN_MILLIS = "accepted_time_in_millis";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float acceptedTimeInMillis;

  public static final String SERIALIZED_NAME_END_TIME_IN_MILLIS = "end_time_in_millis";
  @SerializedName(SERIALIZED_NAME_END_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Float endTimeInMillis;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  @javax.annotation.Nonnull
  private VersionControlPrincipal author;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  @javax.annotation.Nonnull
  private String branch;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  @javax.annotation.Nullable
  private String revision;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  @javax.annotation.Nonnull
  private List<VersionControlObjectResult> objects;

  public VersionControlRunStatus() {
  }

  public VersionControlRunStatus id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the run, as returned when it was admitted.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public VersionControlRunStatus type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Which operation admitted the run.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public VersionControlRunStatus state(@javax.annotation.Nonnull StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Where the run stands.
   * @return state
   */
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }

  public void setState(@javax.annotation.Nonnull StateEnum state) {
    this.state = state;
  }


  public VersionControlRunStatus message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * What happened, in prose. Always present when state is FAILED.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public VersionControlRunStatus acceptedTimeInMillis(@javax.annotation.Nonnull Float acceptedTimeInMillis) {
    this.acceptedTimeInMillis = acceptedTimeInMillis;
    return this;
  }

  /**
   * Admission time, in milliseconds since the Unix epoch.
   * @return acceptedTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getAcceptedTimeInMillis() {
    return acceptedTimeInMillis;
  }

  public void setAcceptedTimeInMillis(@javax.annotation.Nonnull Float acceptedTimeInMillis) {
    this.acceptedTimeInMillis = acceptedTimeInMillis;
  }


  public VersionControlRunStatus endTimeInMillis(@javax.annotation.Nullable Float endTimeInMillis) {
    this.endTimeInMillis = endTimeInMillis;
    return this;
  }

  /**
   * Time the run reached a terminal state, in milliseconds since the Unix epoch. Absent while state is RUNNING.
   * @return endTimeInMillis
   */
  @javax.annotation.Nullable
  public Float getEndTimeInMillis() {
    return endTimeInMillis;
  }

  public void setEndTimeInMillis(@javax.annotation.Nullable Float endTimeInMillis) {
    this.endTimeInMillis = endTimeInMillis;
  }


  public VersionControlRunStatus author(@javax.annotation.Nonnull VersionControlPrincipal author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @javax.annotation.Nonnull
  public VersionControlPrincipal getAuthor() {
    return author;
  }

  public void setAuthor(@javax.annotation.Nonnull VersionControlPrincipal author) {
    this.author = author;
  }


  public VersionControlRunStatus branch(@javax.annotation.Nonnull String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Branch the run used, which is the Org&#39;s configured branch at admission. A later edit to the Org&#39;s configuration does not change it.
   * @return branch
   */
  @javax.annotation.Nonnull
  public String getBranch() {
    return branch;
  }

  public void setBranch(@javax.annotation.Nonnull String branch) {
    this.branch = branch;
  }


  public VersionControlRunStatus revision(@javax.annotation.Nullable String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * On a commit, the commit this run produced. On a deploy, the revision being deployed. On a restore, the restore commit. Absent until the commit is pushed, and on a run that failed before pushing.
   * @return revision
   */
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(@javax.annotation.Nullable String revision) {
    this.revision = revision;
  }


  public VersionControlRunStatus objects(@javax.annotation.Nonnull List<VersionControlObjectResult> objects) {
    this.objects = objects;
    return this;
  }

  public VersionControlRunStatus addObjectsItem(VersionControlObjectResult objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

  /**
   * Per-object outcomes known so far. This grows while state is RUNNING, and is complete once the run is terminal.
   * @return objects
   */
  @javax.annotation.Nonnull
  public List<VersionControlObjectResult> getObjects() {
    return objects;
  }

  public void setObjects(@javax.annotation.Nonnull List<VersionControlObjectResult> objects) {
    this.objects = objects;
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
   * @return the VersionControlRunStatus instance itself
   */
  public VersionControlRunStatus putAdditionalProperty(String key, Object value) {
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
    VersionControlRunStatus versionControlRunStatus = (VersionControlRunStatus) o;
    return Objects.equals(this.id, versionControlRunStatus.id) &&
        Objects.equals(this.type, versionControlRunStatus.type) &&
        Objects.equals(this.state, versionControlRunStatus.state) &&
        Objects.equals(this.message, versionControlRunStatus.message) &&
        Objects.equals(this.acceptedTimeInMillis, versionControlRunStatus.acceptedTimeInMillis) &&
        Objects.equals(this.endTimeInMillis, versionControlRunStatus.endTimeInMillis) &&
        Objects.equals(this.author, versionControlRunStatus.author) &&
        Objects.equals(this.branch, versionControlRunStatus.branch) &&
        Objects.equals(this.revision, versionControlRunStatus.revision) &&
        Objects.equals(this.objects, versionControlRunStatus.objects)&&
        Objects.equals(this.additionalProperties, versionControlRunStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, state, message, acceptedTimeInMillis, endTimeInMillis, author, branch, revision, objects, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlRunStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    acceptedTimeInMillis: ").append(toIndentedString(acceptedTimeInMillis)).append("\n");
    sb.append("    endTimeInMillis: ").append(toIndentedString(endTimeInMillis)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("state");
    openapiFields.add("message");
    openapiFields.add("accepted_time_in_millis");
    openapiFields.add("end_time_in_millis");
    openapiFields.add("author");
    openapiFields.add("branch");
    openapiFields.add("revision");
    openapiFields.add("objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("accepted_time_in_millis");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("branch");
    openapiRequiredFields.add("objects");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlRunStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlRunStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlRunStatus is not found in the empty JSON string", VersionControlRunStatus.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionControlRunStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `state`
      StateEnum.validateJsonElement(jsonObj.get("state"));
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `author`
      VersionControlPrincipal.validateJsonElement(jsonObj.get("author"));
      if (!jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("objects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
      }

      JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
      // validate the required field `objects` (array)
      for (int i = 0; i < jsonArrayobjects.size(); i++) {
        VersionControlObjectResult.validateJsonElement(jsonArrayobjects.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlRunStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlRunStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlRunStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlRunStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlRunStatus>() {
           @Override
           public void write(JsonWriter out, VersionControlRunStatus value) throws IOException {
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
           public VersionControlRunStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlRunStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlRunStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlRunStatus
   * @throws IOException if the JSON string is invalid with respect to VersionControlRunStatus
   */
  public static VersionControlRunStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlRunStatus.class);
  }

  /**
   * Convert an instance of VersionControlRunStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

