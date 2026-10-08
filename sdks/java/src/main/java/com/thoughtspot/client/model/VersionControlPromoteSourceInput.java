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
 * Where a promotion takes content from. Name the source either by Org or by branch, not both: an Org and the branch it versions to determine each other, and the response reports both.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlPromoteSourceInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nullable
  private String orgIdentifier;

  public static final String SERIALIZED_NAME_SOURCE_BRANCH = "source_branch";
  @SerializedName(SERIALIZED_NAME_SOURCE_BRANCH)
  @javax.annotation.Nullable
  private String sourceBranch;

  public static final String SERIALIZED_NAME_SOURCE_REVISION = "source_revision";
  @SerializedName(SERIALIZED_NAME_SOURCE_REVISION)
  @javax.annotation.Nullable
  private String sourceRevision;

  public VersionControlPromoteSourceInput() {
  }

  public VersionControlPromoteSourceInput orgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the Org to promote from. Promoting from any Org other than your own requires tenant administration privilege.
   * @return orgIdentifier
   */
  @javax.annotation.Nullable
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }


  public VersionControlPromoteSourceInput sourceBranch(@javax.annotation.Nullable String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  /**
   * Branch to promote from, when naming it directly rather than by Org.
   * @return sourceBranch
   */
  @javax.annotation.Nullable
  public String getSourceBranch() {
    return sourceBranch;
  }

  public void setSourceBranch(@javax.annotation.Nullable String sourceBranch) {
    this.sourceBranch = sourceBranch;
  }


  public VersionControlPromoteSourceInput sourceRevision(@javax.annotation.Nullable String sourceRevision) {
    this.sourceRevision = sourceRevision;
    return this;
  }

  /**
   * Revision to promote, for example a Git commit SHA. Required when the strategy type is CHERRY_PICK, and ignored otherwise.
   * @return sourceRevision
   */
  @javax.annotation.Nullable
  public String getSourceRevision() {
    return sourceRevision;
  }

  public void setSourceRevision(@javax.annotation.Nullable String sourceRevision) {
    this.sourceRevision = sourceRevision;
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
   * @return the VersionControlPromoteSourceInput instance itself
   */
  public VersionControlPromoteSourceInput putAdditionalProperty(String key, Object value) {
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
    VersionControlPromoteSourceInput versionControlPromoteSourceInput = (VersionControlPromoteSourceInput) o;
    return Objects.equals(this.orgIdentifier, versionControlPromoteSourceInput.orgIdentifier) &&
        Objects.equals(this.sourceBranch, versionControlPromoteSourceInput.sourceBranch) &&
        Objects.equals(this.sourceRevision, versionControlPromoteSourceInput.sourceRevision)&&
        Objects.equals(this.additionalProperties, versionControlPromoteSourceInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdentifier, sourceBranch, sourceRevision, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlPromoteSourceInput {\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
    sb.append("    sourceRevision: ").append(toIndentedString(sourceRevision)).append("\n");
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
    openapiFields.add("org_identifier");
    openapiFields.add("source_branch");
    openapiFields.add("source_revision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlPromoteSourceInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlPromoteSourceInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlPromoteSourceInput is not found in the empty JSON string", VersionControlPromoteSourceInput.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull()) && !jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
      if ((jsonObj.get("source_branch") != null && !jsonObj.get("source_branch").isJsonNull()) && !jsonObj.get("source_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_branch").toString()));
      }
      if ((jsonObj.get("source_revision") != null && !jsonObj.get("source_revision").isJsonNull()) && !jsonObj.get("source_revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_revision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlPromoteSourceInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlPromoteSourceInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlPromoteSourceInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlPromoteSourceInput.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlPromoteSourceInput>() {
           @Override
           public void write(JsonWriter out, VersionControlPromoteSourceInput value) throws IOException {
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
           public VersionControlPromoteSourceInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlPromoteSourceInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlPromoteSourceInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlPromoteSourceInput
   * @throws IOException if the JSON string is invalid with respect to VersionControlPromoteSourceInput
   */
  public static VersionControlPromoteSourceInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlPromoteSourceInput.class);
  }

  /**
   * Convert an instance of VersionControlPromoteSourceInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

