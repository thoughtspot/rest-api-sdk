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
import java.io.IOException;
import java.util.Arrays;
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
 * Details of a maintenance window scheduled for the cluster.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class MaintenanceScheduleInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_START_TIME_IN_MILLIS = "start_time_in_millis";
  @SerializedName(SERIALIZED_NAME_START_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Float startTimeInMillis;

  public static final String SERIALIZED_NAME_DURATION_IN_SECONDS = "duration_in_seconds";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_SECONDS)
  @javax.annotation.Nullable
  private Integer durationInSeconds;

  /**
   * Status of the maintenance event.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SCHEDULED("SCHEDULED"),
    
    AD_HOC("AD_HOC");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  /**
   * Type of the maintenance event.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UPGRADE("UPGRADE"),
    
    PATCH("PATCH");

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
      return null;
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
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public MaintenanceScheduleInfo() {
  }

  public MaintenanceScheduleInfo startTimeInMillis(@javax.annotation.Nullable Float startTimeInMillis) {
    this.startTimeInMillis = startTimeInMillis;
    return this;
  }

  /**
   * Start time of the maintenance window, in milliseconds since epoch.
   * @return startTimeInMillis
   */
  @javax.annotation.Nullable
  public Float getStartTimeInMillis() {
    return startTimeInMillis;
  }

  public void setStartTimeInMillis(@javax.annotation.Nullable Float startTimeInMillis) {
    this.startTimeInMillis = startTimeInMillis;
  }


  public MaintenanceScheduleInfo durationInSeconds(@javax.annotation.Nullable Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }

  /**
   * Expected duration of the maintenance window, in seconds.
   * @return durationInSeconds
   */
  @javax.annotation.Nullable
  public Integer getDurationInSeconds() {
    return durationInSeconds;
  }

  public void setDurationInSeconds(@javax.annotation.Nullable Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }


  public MaintenanceScheduleInfo status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the maintenance event.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public MaintenanceScheduleInfo type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the maintenance event.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public MaintenanceScheduleInfo description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the maintenance event.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
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
   * @return the MaintenanceScheduleInfo instance itself
   */
  public MaintenanceScheduleInfo putAdditionalProperty(String key, Object value) {
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
    MaintenanceScheduleInfo maintenanceScheduleInfo = (MaintenanceScheduleInfo) o;
    return Objects.equals(this.startTimeInMillis, maintenanceScheduleInfo.startTimeInMillis) &&
        Objects.equals(this.durationInSeconds, maintenanceScheduleInfo.durationInSeconds) &&
        Objects.equals(this.status, maintenanceScheduleInfo.status) &&
        Objects.equals(this.type, maintenanceScheduleInfo.type) &&
        Objects.equals(this.description, maintenanceScheduleInfo.description)&&
        Objects.equals(this.additionalProperties, maintenanceScheduleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeInMillis, durationInSeconds, status, type, description, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceScheduleInfo {\n");
    sb.append("    startTimeInMillis: ").append(toIndentedString(startTimeInMillis)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("start_time_in_millis");
    openapiFields.add("duration_in_seconds");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MaintenanceScheduleInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MaintenanceScheduleInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaintenanceScheduleInfo is not found in the empty JSON string", MaintenanceScheduleInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaintenanceScheduleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaintenanceScheduleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaintenanceScheduleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaintenanceScheduleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MaintenanceScheduleInfo>() {
           @Override
           public void write(JsonWriter out, MaintenanceScheduleInfo value) throws IOException {
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
           public MaintenanceScheduleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MaintenanceScheduleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MaintenanceScheduleInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MaintenanceScheduleInfo
   * @throws IOException if the JSON string is invalid with respect to MaintenanceScheduleInfo
   */
  public static MaintenanceScheduleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaintenanceScheduleInfo.class);
  }

  /**
   * Convert an instance of MaintenanceScheduleInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

