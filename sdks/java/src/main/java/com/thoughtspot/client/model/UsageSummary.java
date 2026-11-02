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
import com.thoughtspot.client.model.UsageData;
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
 * A user&#39;s combined Spotter usage position across every pool they draw from. Totals are sums over the pools: a user in two groups with limits of 100 and 50 has a total limit of 150.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UsageSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_POOLS = "pools";
  @SerializedName(SERIALIZED_NAME_POOLS)
  @javax.annotation.Nonnull
  private List<UsageData> pools;

  public static final String SERIALIZED_NAME_TOTAL_USAGE = "total_usage";
  @SerializedName(SERIALIZED_NAME_TOTAL_USAGE)
  @javax.annotation.Nullable
  private Object totalUsage = null;

  public static final String SERIALIZED_NAME_TOTAL_WARNING_LIMIT = "total_warning_limit";
  @SerializedName(SERIALIZED_NAME_TOTAL_WARNING_LIMIT)
  @javax.annotation.Nullable
  private Object totalWarningLimit = null;

  public static final String SERIALIZED_NAME_TOTAL_LIMIT = "total_limit";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIMIT)
  @javax.annotation.Nullable
  private Object totalLimit = null;

  public static final String SERIALIZED_NAME_TOTAL_REMAINING = "total_remaining";
  @SerializedName(SERIALIZED_NAME_TOTAL_REMAINING)
  @javax.annotation.Nullable
  private Object totalRemaining = null;

  public static final String SERIALIZED_NAME_IS_AT_WARNING = "is_at_warning";
  @SerializedName(SERIALIZED_NAME_IS_AT_WARNING)
  @javax.annotation.Nonnull
  private Boolean isAtWarning;

  public static final String SERIALIZED_NAME_IS_AT_LIMIT = "is_at_limit";
  @SerializedName(SERIALIZED_NAME_IS_AT_LIMIT)
  @javax.annotation.Nonnull
  private Boolean isAtLimit;

  public static final String SERIALIZED_NAME_HAS_UNLIMITED_POOL = "has_unlimited_pool";
  @SerializedName(SERIALIZED_NAME_HAS_UNLIMITED_POOL)
  @javax.annotation.Nonnull
  private Boolean hasUnlimitedPool;

  public UsageSummary() {
  }

  public UsageSummary pools(@javax.annotation.Nonnull List<UsageData> pools) {
    this.pools = pools;
    return this;
  }

  public UsageSummary addPoolsItem(UsageData poolsItem) {
    if (this.pools == null) {
      this.pools = new ArrayList<>();
    }
    this.pools.add(poolsItem);
    return this;
  }

  /**
   * The individual pools the user draws from.
   * @return pools
   */
  @javax.annotation.Nonnull
  public List<UsageData> getPools() {
    return pools;
  }

  public void setPools(@javax.annotation.Nonnull List<UsageData> pools) {
    this.pools = pools;
  }


  public UsageSummary totalUsage(@javax.annotation.Nullable Object totalUsage) {
    this.totalUsage = totalUsage;
    return this;
  }

  /**
   * Questions consumed across all of the user&#39;s pools.
   * @return totalUsage
   */
  @javax.annotation.Nullable
  public Object getTotalUsage() {
    return totalUsage;
  }

  public void setTotalUsage(@javax.annotation.Nullable Object totalUsage) {
    this.totalUsage = totalUsage;
  }


  public UsageSummary totalWarningLimit(@javax.annotation.Nullable Object totalWarningLimit) {
    this.totalWarningLimit = totalWarningLimit;
    return this;
  }

  /**
   * Sum of the warning limits of the user&#39;s pools.
   * @return totalWarningLimit
   */
  @javax.annotation.Nullable
  public Object getTotalWarningLimit() {
    return totalWarningLimit;
  }

  public void setTotalWarningLimit(@javax.annotation.Nullable Object totalWarningLimit) {
    this.totalWarningLimit = totalWarningLimit;
  }


  public UsageSummary totalLimit(@javax.annotation.Nullable Object totalLimit) {
    this.totalLimit = totalLimit;
    return this;
  }

  /**
   * Sum of the limits of the user&#39;s pools.
   * @return totalLimit
   */
  @javax.annotation.Nullable
  public Object getTotalLimit() {
    return totalLimit;
  }

  public void setTotalLimit(@javax.annotation.Nullable Object totalLimit) {
    this.totalLimit = totalLimit;
  }


  public UsageSummary totalRemaining(@javax.annotation.Nullable Object totalRemaining) {
    this.totalRemaining = totalRemaining;
    return this;
  }

  /**
   * Questions the user can still ask before reaching the limit. Absent when &#x60;has_unlimited_pool&#x60; is &#x60;true&#x60;.
   * @return totalRemaining
   */
  @javax.annotation.Nullable
  public Object getTotalRemaining() {
    return totalRemaining;
  }

  public void setTotalRemaining(@javax.annotation.Nullable Object totalRemaining) {
    this.totalRemaining = totalRemaining;
  }


  public UsageSummary isAtWarning(@javax.annotation.Nonnull Boolean isAtWarning) {
    this.isAtWarning = isAtWarning;
    return this;
  }

  /**
   * &#x60;true&#x60; when usage has reached the combined warning limit.
   * @return isAtWarning
   */
  @javax.annotation.Nonnull
  public Boolean getIsAtWarning() {
    return isAtWarning;
  }

  public void setIsAtWarning(@javax.annotation.Nonnull Boolean isAtWarning) {
    this.isAtWarning = isAtWarning;
  }


  public UsageSummary isAtLimit(@javax.annotation.Nonnull Boolean isAtLimit) {
    this.isAtLimit = isAtLimit;
    return this;
  }

  /**
   * &#x60;true&#x60; when usage has reached the combined limit and further Spotter questions are blocked.
   * @return isAtLimit
   */
  @javax.annotation.Nonnull
  public Boolean getIsAtLimit() {
    return isAtLimit;
  }

  public void setIsAtLimit(@javax.annotation.Nonnull Boolean isAtLimit) {
    this.isAtLimit = isAtLimit;
  }


  public UsageSummary hasUnlimitedPool(@javax.annotation.Nonnull Boolean hasUnlimitedPool) {
    this.hasUnlimitedPool = hasUnlimitedPool;
    return this;
  }

  /**
   * &#x60;true&#x60; when at least one of the user&#39;s pools has no limit, which makes the user unlimited.
   * @return hasUnlimitedPool
   */
  @javax.annotation.Nonnull
  public Boolean getHasUnlimitedPool() {
    return hasUnlimitedPool;
  }

  public void setHasUnlimitedPool(@javax.annotation.Nonnull Boolean hasUnlimitedPool) {
    this.hasUnlimitedPool = hasUnlimitedPool;
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
   * @return the UsageSummary instance itself
   */
  public UsageSummary putAdditionalProperty(String key, Object value) {
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
    UsageSummary usageSummary = (UsageSummary) o;
    return Objects.equals(this.pools, usageSummary.pools) &&
        Objects.equals(this.totalUsage, usageSummary.totalUsage) &&
        Objects.equals(this.totalWarningLimit, usageSummary.totalWarningLimit) &&
        Objects.equals(this.totalLimit, usageSummary.totalLimit) &&
        Objects.equals(this.totalRemaining, usageSummary.totalRemaining) &&
        Objects.equals(this.isAtWarning, usageSummary.isAtWarning) &&
        Objects.equals(this.isAtLimit, usageSummary.isAtLimit) &&
        Objects.equals(this.hasUnlimitedPool, usageSummary.hasUnlimitedPool)&&
        Objects.equals(this.additionalProperties, usageSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pools, totalUsage, totalWarningLimit, totalLimit, totalRemaining, isAtWarning, isAtLimit, hasUnlimitedPool, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummary {\n");
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
    sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
    sb.append("    totalWarningLimit: ").append(toIndentedString(totalWarningLimit)).append("\n");
    sb.append("    totalLimit: ").append(toIndentedString(totalLimit)).append("\n");
    sb.append("    totalRemaining: ").append(toIndentedString(totalRemaining)).append("\n");
    sb.append("    isAtWarning: ").append(toIndentedString(isAtWarning)).append("\n");
    sb.append("    isAtLimit: ").append(toIndentedString(isAtLimit)).append("\n");
    sb.append("    hasUnlimitedPool: ").append(toIndentedString(hasUnlimitedPool)).append("\n");
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
    openapiFields.add("pools");
    openapiFields.add("total_usage");
    openapiFields.add("total_warning_limit");
    openapiFields.add("total_limit");
    openapiFields.add("total_remaining");
    openapiFields.add("is_at_warning");
    openapiFields.add("is_at_limit");
    openapiFields.add("has_unlimited_pool");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pools");
    openapiRequiredFields.add("is_at_warning");
    openapiRequiredFields.add("is_at_limit");
    openapiRequiredFields.add("has_unlimited_pool");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UsageSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsageSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsageSummary is not found in the empty JSON string", UsageSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsageSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("pools").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pools` to be an array in the JSON string but got `%s`", jsonObj.get("pools").toString()));
      }

      JsonArray jsonArraypools = jsonObj.getAsJsonArray("pools");
      // validate the required field `pools` (array)
      for (int i = 0; i < jsonArraypools.size(); i++) {
        UsageData.validateJsonElement(jsonArraypools.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsageSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsageSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsageSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsageSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<UsageSummary>() {
           @Override
           public void write(JsonWriter out, UsageSummary value) throws IOException {
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
           public UsageSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UsageSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UsageSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UsageSummary
   * @throws IOException if the JSON string is invalid with respect to UsageSummary
   */
  public static UsageSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsageSummary.class);
  }

  /**
   * Convert an instance of UsageSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

