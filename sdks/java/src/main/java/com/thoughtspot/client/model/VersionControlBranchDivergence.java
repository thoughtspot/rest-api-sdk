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
 * How far apart two branches are.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlBranchDivergence implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AHEAD_BY = "ahead_by";
  @SerializedName(SERIALIZED_NAME_AHEAD_BY)
  @javax.annotation.Nullable
  private Integer aheadBy;

  public static final String SERIALIZED_NAME_BEHIND_BY = "behind_by";
  @SerializedName(SERIALIZED_NAME_BEHIND_BY)
  @javax.annotation.Nullable
  private Integer behindBy;

  public VersionControlBranchDivergence() {
  }

  public VersionControlBranchDivergence aheadBy(@javax.annotation.Nullable Integer aheadBy) {
    this.aheadBy = aheadBy;
    return this;
  }

  /**
   * Commits on the source that are not yet on the target.
   * @return aheadBy
   */
  @javax.annotation.Nullable
  public Integer getAheadBy() {
    return aheadBy;
  }

  public void setAheadBy(@javax.annotation.Nullable Integer aheadBy) {
    this.aheadBy = aheadBy;
  }


  public VersionControlBranchDivergence behindBy(@javax.annotation.Nullable Integer behindBy) {
    this.behindBy = behindBy;
    return this;
  }

  /**
   * Commits on the target that are not on the source.
   * @return behindBy
   */
  @javax.annotation.Nullable
  public Integer getBehindBy() {
    return behindBy;
  }

  public void setBehindBy(@javax.annotation.Nullable Integer behindBy) {
    this.behindBy = behindBy;
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
   * @return the VersionControlBranchDivergence instance itself
   */
  public VersionControlBranchDivergence putAdditionalProperty(String key, Object value) {
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
    VersionControlBranchDivergence versionControlBranchDivergence = (VersionControlBranchDivergence) o;
    return Objects.equals(this.aheadBy, versionControlBranchDivergence.aheadBy) &&
        Objects.equals(this.behindBy, versionControlBranchDivergence.behindBy)&&
        Objects.equals(this.additionalProperties, versionControlBranchDivergence.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aheadBy, behindBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlBranchDivergence {\n");
    sb.append("    aheadBy: ").append(toIndentedString(aheadBy)).append("\n");
    sb.append("    behindBy: ").append(toIndentedString(behindBy)).append("\n");
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
    openapiFields.add("ahead_by");
    openapiFields.add("behind_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlBranchDivergence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlBranchDivergence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlBranchDivergence is not found in the empty JSON string", VersionControlBranchDivergence.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlBranchDivergence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlBranchDivergence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlBranchDivergence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlBranchDivergence.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlBranchDivergence>() {
           @Override
           public void write(JsonWriter out, VersionControlBranchDivergence value) throws IOException {
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
           public VersionControlBranchDivergence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlBranchDivergence instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlBranchDivergence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlBranchDivergence
   * @throws IOException if the JSON string is invalid with respect to VersionControlBranchDivergence
   */
  public static VersionControlBranchDivergence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlBranchDivergence.class);
  }

  /**
   * Convert an instance of VersionControlBranchDivergence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

