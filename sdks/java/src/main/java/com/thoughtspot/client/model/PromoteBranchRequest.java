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
import com.thoughtspot.client.model.VersionControlPromoteSourceInput;
import com.thoughtspot.client.model.VersionControlPromoteStrategyInput;
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
 * PromoteBranchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class PromoteBranchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nonnull
  private VersionControlPromoteSourceInput source;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  @javax.annotation.Nonnull
  private VersionControlPromoteStrategyInput strategy;

  public static final String SERIALIZED_NAME_COMMIT_MESSAGE = "commit_message";
  @SerializedName(SERIALIZED_NAME_COMMIT_MESSAGE)
  @javax.annotation.Nullable
  private String commitMessage;

  public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  @javax.annotation.Nullable
  private Boolean dryRun = true;

  public PromoteBranchRequest() {
  }

  public PromoteBranchRequest source(@javax.annotation.Nonnull VersionControlPromoteSourceInput source) {
    this.source = source;
    return this;
  }

  /**
   * Where to promote content from, named either by Org or by branch.
   * @return source
   */
  @javax.annotation.Nonnull
  public VersionControlPromoteSourceInput getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nonnull VersionControlPromoteSourceInput source) {
    this.source = source;
  }


  public PromoteBranchRequest strategy(@javax.annotation.Nonnull VersionControlPromoteStrategyInput strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * How the source is applied to your Org&#39;s branch, and what to do when files conflict.
   * @return strategy
   */
  @javax.annotation.Nonnull
  public VersionControlPromoteStrategyInput getStrategy() {
    return strategy;
  }

  public void setStrategy(@javax.annotation.Nonnull VersionControlPromoteStrategyInput strategy) {
    this.strategy = strategy;
  }


  public PromoteBranchRequest commitMessage(@javax.annotation.Nullable String commitMessage) {
    this.commitMessage = commitMessage;
    return this;
  }

  /**
   * Message for the promotion commit. Omit this to let Git generate one.
   * @return commitMessage
   */
  @javax.annotation.Nullable
  public String getCommitMessage() {
    return commitMessage;
  }

  public void setCommitMessage(@javax.annotation.Nullable String commitMessage) {
    this.commitMessage = commitMessage;
  }


  public PromoteBranchRequest dryRun(@javax.annotation.Nullable Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Report what the promotion would change without writing anything. Defaults to true, so a request that omits this performs a dry run.
   * @return dryRun
   */
  @javax.annotation.Nullable
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(@javax.annotation.Nullable Boolean dryRun) {
    this.dryRun = dryRun;
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
   * @return the PromoteBranchRequest instance itself
   */
  public PromoteBranchRequest putAdditionalProperty(String key, Object value) {
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
    PromoteBranchRequest promoteBranchRequest = (PromoteBranchRequest) o;
    return Objects.equals(this.source, promoteBranchRequest.source) &&
        Objects.equals(this.strategy, promoteBranchRequest.strategy) &&
        Objects.equals(this.commitMessage, promoteBranchRequest.commitMessage) &&
        Objects.equals(this.dryRun, promoteBranchRequest.dryRun)&&
        Objects.equals(this.additionalProperties, promoteBranchRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, strategy, commitMessage, dryRun, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoteBranchRequest {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
    openapiFields.add("strategy");
    openapiFields.add("commit_message");
    openapiFields.add("dry_run");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("strategy");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PromoteBranchRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromoteBranchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromoteBranchRequest is not found in the empty JSON string", PromoteBranchRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PromoteBranchRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `source`
      VersionControlPromoteSourceInput.validateJsonElement(jsonObj.get("source"));
      // validate the required field `strategy`
      VersionControlPromoteStrategyInput.validateJsonElement(jsonObj.get("strategy"));
      if ((jsonObj.get("commit_message") != null && !jsonObj.get("commit_message").isJsonNull()) && !jsonObj.get("commit_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromoteBranchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromoteBranchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromoteBranchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromoteBranchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PromoteBranchRequest>() {
           @Override
           public void write(JsonWriter out, PromoteBranchRequest value) throws IOException {
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
           public PromoteBranchRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PromoteBranchRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of PromoteBranchRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PromoteBranchRequest
   * @throws IOException if the JSON string is invalid with respect to PromoteBranchRequest
   */
  public static PromoteBranchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromoteBranchRequest.class);
  }

  /**
   * Convert an instance of PromoteBranchRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

