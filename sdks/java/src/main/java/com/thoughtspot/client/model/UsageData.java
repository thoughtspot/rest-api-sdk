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
import com.thoughtspot.client.model.UsagePoolKey;
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
 * A Spotter usage pool: the question allowance configured for a user, user group, or Org, and how much of it has been consumed.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UsageData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private UsagePoolKey key;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  @javax.annotation.Nullable
  private Object usage = null;

  public static final String SERIALIZED_NAME_WARNING_LIMIT = "warning_limit";
  @SerializedName(SERIALIZED_NAME_WARNING_LIMIT)
  @javax.annotation.Nullable
  private Object warningLimit = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nullable
  private Object limit = null;

  public static final String SERIALIZED_NAME_UPDATED_TIME_IN_MILLIS = "updated_time_in_millis";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME_IN_MILLIS)
  @javax.annotation.Nullable
  private Object updatedTimeInMillis = null;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updated_by";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  @javax.annotation.Nullable
  private String updatedBy;

  public UsageData() {
  }

  public UsageData key(@javax.annotation.Nonnull UsagePoolKey key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nonnull
  public UsagePoolKey getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull UsagePoolKey key) {
    this.key = key;
  }


  public UsageData usage(@javax.annotation.Nullable Object usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Number of Spotter questions consumed from the pool.
   * @return usage
   */
  @javax.annotation.Nullable
  public Object getUsage() {
    return usage;
  }

  public void setUsage(@javax.annotation.Nullable Object usage) {
    this.usage = usage;
  }


  public UsageData warningLimit(@javax.annotation.Nullable Object warningLimit) {
    this.warningLimit = warningLimit;
    return this;
  }

  /**
   * Usage level at which users drawing from the pool are warned that they are approaching the limit. Absent when no warning is configured.
   * @return warningLimit
   */
  @javax.annotation.Nullable
  public Object getWarningLimit() {
    return warningLimit;
  }

  public void setWarningLimit(@javax.annotation.Nullable Object warningLimit) {
    this.warningLimit = warningLimit;
  }


  public UsageData limit(@javax.annotation.Nullable Object limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of Spotter questions the pool allows. Absent when the pool is unlimited.
   * @return limit
   */
  @javax.annotation.Nullable
  public Object getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nullable Object limit) {
    this.limit = limit;
  }


  public UsageData updatedTimeInMillis(@javax.annotation.Nullable Object updatedTimeInMillis) {
    this.updatedTimeInMillis = updatedTimeInMillis;
    return this;
  }

  /**
   * Epoch milliseconds of the last change to the pool&#39;s configuration.
   * @return updatedTimeInMillis
   */
  @javax.annotation.Nullable
  public Object getUpdatedTimeInMillis() {
    return updatedTimeInMillis;
  }

  public void setUpdatedTimeInMillis(@javax.annotation.Nullable Object updatedTimeInMillis) {
    this.updatedTimeInMillis = updatedTimeInMillis;
  }


  public UsageData updatedBy(@javax.annotation.Nullable String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * ID of the user who last changed the pool&#39;s configuration.
   * @return updatedBy
   */
  @javax.annotation.Nullable
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(@javax.annotation.Nullable String updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return the UsageData instance itself
   */
  public UsageData putAdditionalProperty(String key, Object value) {
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
    UsageData usageData = (UsageData) o;
    return Objects.equals(this.key, usageData.key) &&
        Objects.equals(this.usage, usageData.usage) &&
        Objects.equals(this.warningLimit, usageData.warningLimit) &&
        Objects.equals(this.limit, usageData.limit) &&
        Objects.equals(this.updatedTimeInMillis, usageData.updatedTimeInMillis) &&
        Objects.equals(this.updatedBy, usageData.updatedBy)&&
        Objects.equals(this.additionalProperties, usageData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, usage, warningLimit, limit, updatedTimeInMillis, updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageData {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    warningLimit: ").append(toIndentedString(warningLimit)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    updatedTimeInMillis: ").append(toIndentedString(updatedTimeInMillis)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("usage");
    openapiFields.add("warning_limit");
    openapiFields.add("limit");
    openapiFields.add("updated_time_in_millis");
    openapiFields.add("updated_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UsageData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsageData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsageData is not found in the empty JSON string", UsageData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsageData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `key`
      UsagePoolKey.validateJsonElement(jsonObj.get("key"));
      if ((jsonObj.get("updated_by") != null && !jsonObj.get("updated_by").isJsonNull()) && !jsonObj.get("updated_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsageData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsageData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsageData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsageData.class));

       return (TypeAdapter<T>) new TypeAdapter<UsageData>() {
           @Override
           public void write(JsonWriter out, UsageData value) throws IOException {
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
           public UsageData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UsageData instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UsageData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UsageData
   * @throws IOException if the JSON string is invalid with respect to UsageData
   */
  public static UsageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsageData.class);
  }

  /**
   * Convert an instance of UsageData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

