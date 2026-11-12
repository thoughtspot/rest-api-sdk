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
 * Admission receipt for a deploy run. It identifies the run and the revisions it was admitted against; it says nothing about what was imported.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlDeployResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RUN_ID = "run_id";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  @javax.annotation.Nonnull
  private String runId;

  public static final String SERIALIZED_NAME_TARGET_DEPLOYMENT_REVISION = "target_deployment_revision";
  @SerializedName(SERIALIZED_NAME_TARGET_DEPLOYMENT_REVISION)
  @javax.annotation.Nonnull
  private String targetDeploymentRevision;

  public static final String SERIALIZED_NAME_LAST_DEPLOYED_REVISION = "last_deployed_revision";
  @SerializedName(SERIALIZED_NAME_LAST_DEPLOYED_REVISION)
  @javax.annotation.Nullable
  private String lastDeployedRevision;

  public static final String SERIALIZED_NAME_ACCEPTED_TIME_IN_MILLIS = "accepted_time_in_millis";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float acceptedTimeInMillis;

  public VersionControlDeployResponse() {
  }

  public VersionControlDeployResponse runId(@javax.annotation.Nonnull String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * ID of this run, and the trace key across the API, the worker and the logs. Pass it to run search to read per-object outcomes.
   * @return runId
   */
  @javax.annotation.Nonnull
  public String getRunId() {
    return runId;
  }

  public void setRunId(@javax.annotation.Nonnull String runId) {
    this.runId = runId;
  }


  public VersionControlDeployResponse targetDeploymentRevision(@javax.annotation.Nonnull String targetDeploymentRevision) {
    this.targetDeploymentRevision = targetDeploymentRevision;
    return this;
  }

  /**
   * Revision this run was admitted against, pinned at admission. Resolved from the head of the configured branch when target_revision was omitted.
   * @return targetDeploymentRevision
   */
  @javax.annotation.Nonnull
  public String getTargetDeploymentRevision() {
    return targetDeploymentRevision;
  }

  public void setTargetDeploymentRevision(@javax.annotation.Nonnull String targetDeploymentRevision) {
    this.targetDeploymentRevision = targetDeploymentRevision;
  }


  public VersionControlDeployResponse lastDeployedRevision(@javax.annotation.Nullable String lastDeployedRevision) {
    this.lastDeployedRevision = lastDeployedRevision;
    return this;
  }

  /**
   * Revision the Org last received, which this run compared against. Absent when there was none: the Org&#39;s first deploy, or deploy_type FULL.
   * @return lastDeployedRevision
   */
  @javax.annotation.Nullable
  public String getLastDeployedRevision() {
    return lastDeployedRevision;
  }

  public void setLastDeployedRevision(@javax.annotation.Nullable String lastDeployedRevision) {
    this.lastDeployedRevision = lastDeployedRevision;
  }


  public VersionControlDeployResponse acceptedTimeInMillis(@javax.annotation.Nonnull Float acceptedTimeInMillis) {
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
   * @return the VersionControlDeployResponse instance itself
   */
  public VersionControlDeployResponse putAdditionalProperty(String key, Object value) {
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
    VersionControlDeployResponse versionControlDeployResponse = (VersionControlDeployResponse) o;
    return Objects.equals(this.runId, versionControlDeployResponse.runId) &&
        Objects.equals(this.targetDeploymentRevision, versionControlDeployResponse.targetDeploymentRevision) &&
        Objects.equals(this.lastDeployedRevision, versionControlDeployResponse.lastDeployedRevision) &&
        Objects.equals(this.acceptedTimeInMillis, versionControlDeployResponse.acceptedTimeInMillis)&&
        Objects.equals(this.additionalProperties, versionControlDeployResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, targetDeploymentRevision, lastDeployedRevision, acceptedTimeInMillis, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlDeployResponse {\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    targetDeploymentRevision: ").append(toIndentedString(targetDeploymentRevision)).append("\n");
    sb.append("    lastDeployedRevision: ").append(toIndentedString(lastDeployedRevision)).append("\n");
    sb.append("    acceptedTimeInMillis: ").append(toIndentedString(acceptedTimeInMillis)).append("\n");
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
    openapiFields.add("run_id");
    openapiFields.add("target_deployment_revision");
    openapiFields.add("last_deployed_revision");
    openapiFields.add("accepted_time_in_millis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("run_id");
    openapiRequiredFields.add("target_deployment_revision");
    openapiRequiredFields.add("accepted_time_in_millis");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlDeployResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlDeployResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlDeployResponse is not found in the empty JSON string", VersionControlDeployResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionControlDeployResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("run_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_id").toString()));
      }
      if (!jsonObj.get("target_deployment_revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_deployment_revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_deployment_revision").toString()));
      }
      if ((jsonObj.get("last_deployed_revision") != null && !jsonObj.get("last_deployed_revision").isJsonNull()) && !jsonObj.get("last_deployed_revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_deployed_revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_deployed_revision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlDeployResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlDeployResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlDeployResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlDeployResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlDeployResponse>() {
           @Override
           public void write(JsonWriter out, VersionControlDeployResponse value) throws IOException {
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
           public VersionControlDeployResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlDeployResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlDeployResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlDeployResponse
   * @throws IOException if the JSON string is invalid with respect to VersionControlDeployResponse
   */
  public static VersionControlDeployResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlDeployResponse.class);
  }

  /**
   * Convert an instance of VersionControlDeployResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

