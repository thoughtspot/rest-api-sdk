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
import com.thoughtspot.client.model.UsagePoolKeyInput;
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
 * A change to one Spotter usage pool. The pool is created if it does not exist. Fields that are omitted keep their current value.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UsageDataUpdateInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private UsagePoolKeyInput key;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nullable
  private Object limit = null;

  public static final String SERIALIZED_NAME_WARNING_LIMIT = "warning_limit";
  @SerializedName(SERIALIZED_NAME_WARNING_LIMIT)
  @javax.annotation.Nullable
  private Object warningLimit = null;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  @javax.annotation.Nullable
  private Object usage = null;

  public UsageDataUpdateInput() {
  }

  public UsageDataUpdateInput key(@javax.annotation.Nonnull UsagePoolKeyInput key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nonnull
  public UsagePoolKeyInput getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull UsagePoolKeyInput key) {
    this.key = key;
  }


  public UsageDataUpdateInput limit(@javax.annotation.Nullable Object limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of Spotter questions the pool allows.
   * @return limit
   */
  @javax.annotation.Nullable
  public Object getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nullable Object limit) {
    this.limit = limit;
  }


  public UsageDataUpdateInput warningLimit(@javax.annotation.Nullable Object warningLimit) {
    this.warningLimit = warningLimit;
    return this;
  }

  /**
   * Usage level at which users drawing from the pool are warned that they are approaching the limit.
   * @return warningLimit
   */
  @javax.annotation.Nullable
  public Object getWarningLimit() {
    return warningLimit;
  }

  public void setWarningLimit(@javax.annotation.Nullable Object warningLimit) {
    this.warningLimit = warningLimit;
  }


  public UsageDataUpdateInput usage(@javax.annotation.Nullable Object usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Number of questions consumed from the pool. Set to &#x60;0&#x60; to reset the pool&#39;s usage, for example at the start of a billing period.
   * @return usage
   */
  @javax.annotation.Nullable
  public Object getUsage() {
    return usage;
  }

  public void setUsage(@javax.annotation.Nullable Object usage) {
    this.usage = usage;
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
   * @return the UsageDataUpdateInput instance itself
   */
  public UsageDataUpdateInput putAdditionalProperty(String key, Object value) {
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
    UsageDataUpdateInput usageDataUpdateInput = (UsageDataUpdateInput) o;
    return Objects.equals(this.key, usageDataUpdateInput.key) &&
        Objects.equals(this.limit, usageDataUpdateInput.limit) &&
        Objects.equals(this.warningLimit, usageDataUpdateInput.warningLimit) &&
        Objects.equals(this.usage, usageDataUpdateInput.usage)&&
        Objects.equals(this.additionalProperties, usageDataUpdateInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, limit, warningLimit, usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDataUpdateInput {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    warningLimit: ").append(toIndentedString(warningLimit)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("warning_limit");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UsageDataUpdateInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsageDataUpdateInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsageDataUpdateInput is not found in the empty JSON string", UsageDataUpdateInput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsageDataUpdateInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `key`
      UsagePoolKeyInput.validateJsonElement(jsonObj.get("key"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsageDataUpdateInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsageDataUpdateInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsageDataUpdateInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsageDataUpdateInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UsageDataUpdateInput>() {
           @Override
           public void write(JsonWriter out, UsageDataUpdateInput value) throws IOException {
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
           public UsageDataUpdateInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UsageDataUpdateInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UsageDataUpdateInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UsageDataUpdateInput
   * @throws IOException if the JSON string is invalid with respect to UsageDataUpdateInput
   */
  public static UsageDataUpdateInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsageDataUpdateInput.class);
  }

  /**
   * Convert an instance of UsageDataUpdateInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

