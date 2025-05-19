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
import org.thoughtspot.client.model.ResponseFailedEntities;
import org.thoughtspot.client.model.ResponseIncompleteEntities;
import org.thoughtspot.client.model.ResponsePostUpgradeFailedEntities;
import org.thoughtspot.client.model.ResponseSuccessfulEntities;
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
 * Name of the conversion process, which involves converting worksheets to models.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ResponseWorksheetToModelConversion implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SUCCESS_COUNT = "success_count";
  @SerializedName(SERIALIZED_NAME_SUCCESS_COUNT)
  @javax.annotation.Nonnull
  private Integer successCount;

  public static final String SERIALIZED_NAME_FAILURE_COUNT = "failure_count";
  @SerializedName(SERIALIZED_NAME_FAILURE_COUNT)
  @javax.annotation.Nonnull
  private Integer failureCount;

  public static final String SERIALIZED_NAME_INCOMPLETE_COUNT = "incomplete_count";
  @SerializedName(SERIALIZED_NAME_INCOMPLETE_COUNT)
  @javax.annotation.Nonnull
  private Integer incompleteCount;

  public static final String SERIALIZED_NAME_POST_UPGRADE_FAILED_COUNT = "post_upgrade_failed_count";
  @SerializedName(SERIALIZED_NAME_POST_UPGRADE_FAILED_COUNT)
  @javax.annotation.Nonnull
  private Integer postUpgradeFailedCount;

  public static final String SERIALIZED_NAME_TOTAL_TIME_IN_MILLIS = "total_time_in_millis";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Integer totalTimeInMillis;

  public static final String SERIALIZED_NAME_SUCCESSFUL_ENTITIES = "successful_entities";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_ENTITIES)
  @javax.annotation.Nonnull
  private ResponseSuccessfulEntities successfulEntities;

  public static final String SERIALIZED_NAME_FAILED_ENTITIES = "failed_entities";
  @SerializedName(SERIALIZED_NAME_FAILED_ENTITIES)
  @javax.annotation.Nonnull
  private ResponseFailedEntities failedEntities;

  public static final String SERIALIZED_NAME_INCOMPLETE_ENTITIES = "incomplete_entities";
  @SerializedName(SERIALIZED_NAME_INCOMPLETE_ENTITIES)
  @javax.annotation.Nonnull
  private ResponseIncompleteEntities incompleteEntities;

  public static final String SERIALIZED_NAME_POST_UPGRADE_FAILED_ENTITIES = "post_upgrade_failed_entities";
  @SerializedName(SERIALIZED_NAME_POST_UPGRADE_FAILED_ENTITIES)
  @javax.annotation.Nonnull
  private ResponsePostUpgradeFailedEntities postUpgradeFailedEntities;

  public ResponseWorksheetToModelConversion() {
  }

  public ResponseWorksheetToModelConversion name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ResponseWorksheetToModelConversion successCount(@javax.annotation.Nonnull Integer successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * The number of worksheets successfully converted to models.
   * @return successCount
   */
  @javax.annotation.Nonnull
  public Integer getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(@javax.annotation.Nonnull Integer successCount) {
    this.successCount = successCount;
  }


  public ResponseWorksheetToModelConversion failureCount(@javax.annotation.Nonnull Integer failureCount) {
    this.failureCount = failureCount;
    return this;
  }

  /**
   * The number of worksheets that failed to convert.
   * @return failureCount
   */
  @javax.annotation.Nonnull
  public Integer getFailureCount() {
    return failureCount;
  }

  public void setFailureCount(@javax.annotation.Nonnull Integer failureCount) {
    this.failureCount = failureCount;
  }


  public ResponseWorksheetToModelConversion incompleteCount(@javax.annotation.Nonnull Integer incompleteCount) {
    this.incompleteCount = incompleteCount;
    return this;
  }

  /**
   * The number of worksheets that were incomplete during the conversion process.
   * @return incompleteCount
   */
  @javax.annotation.Nonnull
  public Integer getIncompleteCount() {
    return incompleteCount;
  }

  public void setIncompleteCount(@javax.annotation.Nonnull Integer incompleteCount) {
    this.incompleteCount = incompleteCount;
  }


  public ResponseWorksheetToModelConversion postUpgradeFailedCount(@javax.annotation.Nonnull Integer postUpgradeFailedCount) {
    this.postUpgradeFailedCount = postUpgradeFailedCount;
    return this;
  }

  /**
   * The number of worksheets that failed after an upgrade during the conversion process.
   * @return postUpgradeFailedCount
   */
  @javax.annotation.Nonnull
  public Integer getPostUpgradeFailedCount() {
    return postUpgradeFailedCount;
  }

  public void setPostUpgradeFailedCount(@javax.annotation.Nonnull Integer postUpgradeFailedCount) {
    this.postUpgradeFailedCount = postUpgradeFailedCount;
  }


  public ResponseWorksheetToModelConversion totalTimeInMillis(@javax.annotation.Nonnull Integer totalTimeInMillis) {
    this.totalTimeInMillis = totalTimeInMillis;
    return this;
  }

  /**
   * The total time taken to complete the conversion process in milliseconds.
   * @return totalTimeInMillis
   */
  @javax.annotation.Nonnull
  public Integer getTotalTimeInMillis() {
    return totalTimeInMillis;
  }

  public void setTotalTimeInMillis(@javax.annotation.Nonnull Integer totalTimeInMillis) {
    this.totalTimeInMillis = totalTimeInMillis;
  }


  public ResponseWorksheetToModelConversion successfulEntities(@javax.annotation.Nonnull ResponseSuccessfulEntities successfulEntities) {
    this.successfulEntities = successfulEntities;
    return this;
  }

  /**
   * Get successfulEntities
   * @return successfulEntities
   */
  @javax.annotation.Nonnull
  public ResponseSuccessfulEntities getSuccessfulEntities() {
    return successfulEntities;
  }

  public void setSuccessfulEntities(@javax.annotation.Nonnull ResponseSuccessfulEntities successfulEntities) {
    this.successfulEntities = successfulEntities;
  }


  public ResponseWorksheetToModelConversion failedEntities(@javax.annotation.Nonnull ResponseFailedEntities failedEntities) {
    this.failedEntities = failedEntities;
    return this;
  }

  /**
   * Get failedEntities
   * @return failedEntities
   */
  @javax.annotation.Nonnull
  public ResponseFailedEntities getFailedEntities() {
    return failedEntities;
  }

  public void setFailedEntities(@javax.annotation.Nonnull ResponseFailedEntities failedEntities) {
    this.failedEntities = failedEntities;
  }


  public ResponseWorksheetToModelConversion incompleteEntities(@javax.annotation.Nonnull ResponseIncompleteEntities incompleteEntities) {
    this.incompleteEntities = incompleteEntities;
    return this;
  }

  /**
   * Get incompleteEntities
   * @return incompleteEntities
   */
  @javax.annotation.Nonnull
  public ResponseIncompleteEntities getIncompleteEntities() {
    return incompleteEntities;
  }

  public void setIncompleteEntities(@javax.annotation.Nonnull ResponseIncompleteEntities incompleteEntities) {
    this.incompleteEntities = incompleteEntities;
  }


  public ResponseWorksheetToModelConversion postUpgradeFailedEntities(@javax.annotation.Nonnull ResponsePostUpgradeFailedEntities postUpgradeFailedEntities) {
    this.postUpgradeFailedEntities = postUpgradeFailedEntities;
    return this;
  }

  /**
   * Get postUpgradeFailedEntities
   * @return postUpgradeFailedEntities
   */
  @javax.annotation.Nonnull
  public ResponsePostUpgradeFailedEntities getPostUpgradeFailedEntities() {
    return postUpgradeFailedEntities;
  }

  public void setPostUpgradeFailedEntities(@javax.annotation.Nonnull ResponsePostUpgradeFailedEntities postUpgradeFailedEntities) {
    this.postUpgradeFailedEntities = postUpgradeFailedEntities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWorksheetToModelConversion responseWorksheetToModelConversion = (ResponseWorksheetToModelConversion) o;
    return Objects.equals(this.name, responseWorksheetToModelConversion.name) &&
        Objects.equals(this.successCount, responseWorksheetToModelConversion.successCount) &&
        Objects.equals(this.failureCount, responseWorksheetToModelConversion.failureCount) &&
        Objects.equals(this.incompleteCount, responseWorksheetToModelConversion.incompleteCount) &&
        Objects.equals(this.postUpgradeFailedCount, responseWorksheetToModelConversion.postUpgradeFailedCount) &&
        Objects.equals(this.totalTimeInMillis, responseWorksheetToModelConversion.totalTimeInMillis) &&
        Objects.equals(this.successfulEntities, responseWorksheetToModelConversion.successfulEntities) &&
        Objects.equals(this.failedEntities, responseWorksheetToModelConversion.failedEntities) &&
        Objects.equals(this.incompleteEntities, responseWorksheetToModelConversion.incompleteEntities) &&
        Objects.equals(this.postUpgradeFailedEntities, responseWorksheetToModelConversion.postUpgradeFailedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, successCount, failureCount, incompleteCount, postUpgradeFailedCount, totalTimeInMillis, successfulEntities, failedEntities, incompleteEntities, postUpgradeFailedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWorksheetToModelConversion {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
    sb.append("    incompleteCount: ").append(toIndentedString(incompleteCount)).append("\n");
    sb.append("    postUpgradeFailedCount: ").append(toIndentedString(postUpgradeFailedCount)).append("\n");
    sb.append("    totalTimeInMillis: ").append(toIndentedString(totalTimeInMillis)).append("\n");
    sb.append("    successfulEntities: ").append(toIndentedString(successfulEntities)).append("\n");
    sb.append("    failedEntities: ").append(toIndentedString(failedEntities)).append("\n");
    sb.append("    incompleteEntities: ").append(toIndentedString(incompleteEntities)).append("\n");
    sb.append("    postUpgradeFailedEntities: ").append(toIndentedString(postUpgradeFailedEntities)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("success_count");
    openapiFields.add("failure_count");
    openapiFields.add("incomplete_count");
    openapiFields.add("post_upgrade_failed_count");
    openapiFields.add("total_time_in_millis");
    openapiFields.add("successful_entities");
    openapiFields.add("failed_entities");
    openapiFields.add("incomplete_entities");
    openapiFields.add("post_upgrade_failed_entities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("success_count");
    openapiRequiredFields.add("failure_count");
    openapiRequiredFields.add("incomplete_count");
    openapiRequiredFields.add("post_upgrade_failed_count");
    openapiRequiredFields.add("total_time_in_millis");
    openapiRequiredFields.add("successful_entities");
    openapiRequiredFields.add("failed_entities");
    openapiRequiredFields.add("incomplete_entities");
    openapiRequiredFields.add("post_upgrade_failed_entities");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResponseWorksheetToModelConversion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResponseWorksheetToModelConversion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseWorksheetToModelConversion is not found in the empty JSON string", ResponseWorksheetToModelConversion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResponseWorksheetToModelConversion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseWorksheetToModelConversion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseWorksheetToModelConversion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `successful_entities`
      ResponseSuccessfulEntities.validateJsonElement(jsonObj.get("successful_entities"));
      // validate the required field `failed_entities`
      ResponseFailedEntities.validateJsonElement(jsonObj.get("failed_entities"));
      // validate the required field `incomplete_entities`
      ResponseIncompleteEntities.validateJsonElement(jsonObj.get("incomplete_entities"));
      // validate the required field `post_upgrade_failed_entities`
      ResponsePostUpgradeFailedEntities.validateJsonElement(jsonObj.get("post_upgrade_failed_entities"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseWorksheetToModelConversion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseWorksheetToModelConversion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseWorksheetToModelConversion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseWorksheetToModelConversion.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseWorksheetToModelConversion>() {
           @Override
           public void write(JsonWriter out, ResponseWorksheetToModelConversion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseWorksheetToModelConversion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResponseWorksheetToModelConversion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseWorksheetToModelConversion
   * @throws IOException if the JSON string is invalid with respect to ResponseWorksheetToModelConversion
   */
  public static ResponseWorksheetToModelConversion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseWorksheetToModelConversion.class);
  }

  /**
   * Convert an instance of ResponseWorksheetToModelConversion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

