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
 * RestoreRevisionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class RestoreRevisionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TARGET_REVISION = "target_revision";
  @SerializedName(SERIALIZED_NAME_TARGET_REVISION)
  @javax.annotation.Nonnull
  private String targetRevision;

  /**
   * How far the run goes and how it settles per-object failures. Same values and meaning as deploy_policy on the deploy endpoint; under VALIDATE_ONLY nothing is committed either.
   */
  @JsonAdapter(RestorePolicyEnum.Adapter.class)
  public enum RestorePolicyEnum {
    ALL_OR_NONE("ALL_OR_NONE"),
    
    PARTIAL("PARTIAL"),
    
    VALIDATE_ONLY("VALIDATE_ONLY");

    private String value;

    RestorePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestorePolicyEnum fromValue(String value) {
      for (RestorePolicyEnum b : RestorePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RestorePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestorePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestorePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestorePolicyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RestorePolicyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESTORE_POLICY = "restore_policy";
  @SerializedName(SERIALIZED_NAME_RESTORE_POLICY)
  @javax.annotation.Nullable
  private RestorePolicyEnum restorePolicy = RestorePolicyEnum.ALL_OR_NONE;

  public RestoreRevisionRequest() {
  }

  public RestoreRevisionRequest targetRevision(@javax.annotation.Nonnull String targetRevision) {
    this.targetRevision = targetRevision;
    return this;
  }

  /**
   * Revision whose content the branch and the Org are restored to, for example a Git commit SHA. It must be reachable from your Org&#39;s configured branch, and must not be its head, since restoring the head changes nothing.
   * @return targetRevision
   */
  @javax.annotation.Nonnull
  public String getTargetRevision() {
    return targetRevision;
  }

  public void setTargetRevision(@javax.annotation.Nonnull String targetRevision) {
    this.targetRevision = targetRevision;
  }


  public RestoreRevisionRequest restorePolicy(@javax.annotation.Nullable RestorePolicyEnum restorePolicy) {
    this.restorePolicy = restorePolicy;
    return this;
  }

  /**
   * How far the run goes and how it settles per-object failures. Same values and meaning as deploy_policy on the deploy endpoint; under VALIDATE_ONLY nothing is committed either.
   * @return restorePolicy
   */
  @javax.annotation.Nullable
  public RestorePolicyEnum getRestorePolicy() {
    return restorePolicy;
  }

  public void setRestorePolicy(@javax.annotation.Nullable RestorePolicyEnum restorePolicy) {
    this.restorePolicy = restorePolicy;
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
   * @return the RestoreRevisionRequest instance itself
   */
  public RestoreRevisionRequest putAdditionalProperty(String key, Object value) {
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
    RestoreRevisionRequest restoreRevisionRequest = (RestoreRevisionRequest) o;
    return Objects.equals(this.targetRevision, restoreRevisionRequest.targetRevision) &&
        Objects.equals(this.restorePolicy, restoreRevisionRequest.restorePolicy)&&
        Objects.equals(this.additionalProperties, restoreRevisionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRevision, restorePolicy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreRevisionRequest {\n");
    sb.append("    targetRevision: ").append(toIndentedString(targetRevision)).append("\n");
    sb.append("    restorePolicy: ").append(toIndentedString(restorePolicy)).append("\n");
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
    openapiFields.add("target_revision");
    openapiFields.add("restore_policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("target_revision");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RestoreRevisionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestoreRevisionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestoreRevisionRequest is not found in the empty JSON string", RestoreRevisionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RestoreRevisionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("target_revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_revision").toString()));
      }
      if ((jsonObj.get("restore_policy") != null && !jsonObj.get("restore_policy").isJsonNull()) && !jsonObj.get("restore_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restore_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restore_policy").toString()));
      }
      // validate the optional field `restore_policy`
      if (jsonObj.get("restore_policy") != null && !jsonObj.get("restore_policy").isJsonNull()) {
        RestorePolicyEnum.validateJsonElement(jsonObj.get("restore_policy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestoreRevisionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestoreRevisionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestoreRevisionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestoreRevisionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RestoreRevisionRequest>() {
           @Override
           public void write(JsonWriter out, RestoreRevisionRequest value) throws IOException {
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
           public RestoreRevisionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RestoreRevisionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RestoreRevisionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RestoreRevisionRequest
   * @throws IOException if the JSON string is invalid with respect to RestoreRevisionRequest
   */
  public static RestoreRevisionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestoreRevisionRequest.class);
  }

  /**
   * Convert an instance of RestoreRevisionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

