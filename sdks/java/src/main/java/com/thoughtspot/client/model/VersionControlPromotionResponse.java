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
import com.thoughtspot.client.model.VersionControlBranchDivergence;
import com.thoughtspot.client.model.VersionControlFileChanges;
import com.thoughtspot.client.model.VersionControlOrgBranch;
import com.thoughtspot.client.model.VersionControlRevisionDetails;
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
 * What a promotion did, or on a dry run what one would do.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlPromotionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nonnull
  private VersionControlOrgBranch source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  @javax.annotation.Nonnull
  private VersionControlOrgBranch target;

  public static final String SERIALIZED_NAME_BRANCH_DIVERGENCE = "branch_divergence";
  @SerializedName(SERIALIZED_NAME_BRANCH_DIVERGENCE)
  @javax.annotation.Nullable
  private VersionControlBranchDivergence branchDivergence;

  public static final String SERIALIZED_NAME_REVISION_DETAILS = "revision_details";
  @SerializedName(SERIALIZED_NAME_REVISION_DETAILS)
  @javax.annotation.Nullable
  private VersionControlRevisionDetails revisionDetails;

  public static final String SERIALIZED_NAME_FILE_CHANGES = "file_changes";
  @SerializedName(SERIALIZED_NAME_FILE_CHANGES)
  @javax.annotation.Nonnull
  private VersionControlFileChanges fileChanges;

  public VersionControlPromotionResponse() {
  }

  public VersionControlPromotionResponse source(@javax.annotation.Nonnull VersionControlOrgBranch source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nonnull
  public VersionControlOrgBranch getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nonnull VersionControlOrgBranch source) {
    this.source = source;
  }


  public VersionControlPromotionResponse target(@javax.annotation.Nonnull VersionControlOrgBranch target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @javax.annotation.Nonnull
  public VersionControlOrgBranch getTarget() {
    return target;
  }

  public void setTarget(@javax.annotation.Nonnull VersionControlOrgBranch target) {
    this.target = target;
  }


  public VersionControlPromotionResponse branchDivergence(@javax.annotation.Nullable VersionControlBranchDivergence branchDivergence) {
    this.branchDivergence = branchDivergence;
    return this;
  }

  /**
   * Get branchDivergence
   * @return branchDivergence
   */
  @javax.annotation.Nullable
  public VersionControlBranchDivergence getBranchDivergence() {
    return branchDivergence;
  }

  public void setBranchDivergence(@javax.annotation.Nullable VersionControlBranchDivergence branchDivergence) {
    this.branchDivergence = branchDivergence;
  }


  public VersionControlPromotionResponse revisionDetails(@javax.annotation.Nullable VersionControlRevisionDetails revisionDetails) {
    this.revisionDetails = revisionDetails;
    return this;
  }

  /**
   * Get revisionDetails
   * @return revisionDetails
   */
  @javax.annotation.Nullable
  public VersionControlRevisionDetails getRevisionDetails() {
    return revisionDetails;
  }

  public void setRevisionDetails(@javax.annotation.Nullable VersionControlRevisionDetails revisionDetails) {
    this.revisionDetails = revisionDetails;
  }


  public VersionControlPromotionResponse fileChanges(@javax.annotation.Nonnull VersionControlFileChanges fileChanges) {
    this.fileChanges = fileChanges;
    return this;
  }

  /**
   * Get fileChanges
   * @return fileChanges
   */
  @javax.annotation.Nonnull
  public VersionControlFileChanges getFileChanges() {
    return fileChanges;
  }

  public void setFileChanges(@javax.annotation.Nonnull VersionControlFileChanges fileChanges) {
    this.fileChanges = fileChanges;
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
   * @return the VersionControlPromotionResponse instance itself
   */
  public VersionControlPromotionResponse putAdditionalProperty(String key, Object value) {
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
    VersionControlPromotionResponse versionControlPromotionResponse = (VersionControlPromotionResponse) o;
    return Objects.equals(this.source, versionControlPromotionResponse.source) &&
        Objects.equals(this.target, versionControlPromotionResponse.target) &&
        Objects.equals(this.branchDivergence, versionControlPromotionResponse.branchDivergence) &&
        Objects.equals(this.revisionDetails, versionControlPromotionResponse.revisionDetails) &&
        Objects.equals(this.fileChanges, versionControlPromotionResponse.fileChanges)&&
        Objects.equals(this.additionalProperties, versionControlPromotionResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target, branchDivergence, revisionDetails, fileChanges, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlPromotionResponse {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    branchDivergence: ").append(toIndentedString(branchDivergence)).append("\n");
    sb.append("    revisionDetails: ").append(toIndentedString(revisionDetails)).append("\n");
    sb.append("    fileChanges: ").append(toIndentedString(fileChanges)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("target");
    openapiFields.add("branch_divergence");
    openapiFields.add("revision_details");
    openapiFields.add("file_changes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("target");
    openapiRequiredFields.add("file_changes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlPromotionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlPromotionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlPromotionResponse is not found in the empty JSON string", VersionControlPromotionResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionControlPromotionResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `source`
      VersionControlOrgBranch.validateJsonElement(jsonObj.get("source"));
      // validate the required field `target`
      VersionControlOrgBranch.validateJsonElement(jsonObj.get("target"));
      // validate the optional field `branch_divergence`
      if (jsonObj.get("branch_divergence") != null && !jsonObj.get("branch_divergence").isJsonNull()) {
        VersionControlBranchDivergence.validateJsonElement(jsonObj.get("branch_divergence"));
      }
      // validate the optional field `revision_details`
      if (jsonObj.get("revision_details") != null && !jsonObj.get("revision_details").isJsonNull()) {
        VersionControlRevisionDetails.validateJsonElement(jsonObj.get("revision_details"));
      }
      // validate the required field `file_changes`
      VersionControlFileChanges.validateJsonElement(jsonObj.get("file_changes"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlPromotionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlPromotionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlPromotionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlPromotionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlPromotionResponse>() {
           @Override
           public void write(JsonWriter out, VersionControlPromotionResponse value) throws IOException {
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
           public VersionControlPromotionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlPromotionResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlPromotionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlPromotionResponse
   * @throws IOException if the JSON string is invalid with respect to VersionControlPromotionResponse
   */
  public static VersionControlPromotionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlPromotionResponse.class);
  }

  /**
   * Convert an instance of VersionControlPromotionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

