/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * ValidateMergeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class ValidateMergeRequest {
  public static final String SERIALIZED_NAME_SOURCE_BRANCH_NAME = "source_branch_name";
  @SerializedName(SERIALIZED_NAME_SOURCE_BRANCH_NAME)
  private String sourceBranchName;

  public static final String SERIALIZED_NAME_TARGET_BRANCH_NAME = "target_branch_name";
  @SerializedName(SERIALIZED_NAME_TARGET_BRANCH_NAME)
  private String targetBranchName;

  public ValidateMergeRequest() {
  }

  public ValidateMergeRequest sourceBranchName(String sourceBranchName) {
    
    this.sourceBranchName = sourceBranchName;
    return this;
  }

   /**
   * Name of the branch from which changes need to be picked for validation
   * @return sourceBranchName
  **/
  @javax.annotation.Nonnull
  public String getSourceBranchName() {
    return sourceBranchName;
  }


  public void setSourceBranchName(String sourceBranchName) {
    this.sourceBranchName = sourceBranchName;
  }


  public ValidateMergeRequest targetBranchName(String targetBranchName) {
    
    this.targetBranchName = targetBranchName;
    return this;
  }

   /**
   * Name of the branch where files will be merged
   * @return targetBranchName
  **/
  @javax.annotation.Nonnull
  public String getTargetBranchName() {
    return targetBranchName;
  }


  public void setTargetBranchName(String targetBranchName) {
    this.targetBranchName = targetBranchName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMergeRequest validateMergeRequest = (ValidateMergeRequest) o;
    return Objects.equals(this.sourceBranchName, validateMergeRequest.sourceBranchName) &&
        Objects.equals(this.targetBranchName, validateMergeRequest.targetBranchName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceBranchName, targetBranchName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMergeRequest {\n");
    sb.append("    sourceBranchName: ").append(toIndentedString(sourceBranchName)).append("\n");
    sb.append("    targetBranchName: ").append(toIndentedString(targetBranchName)).append("\n");
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
    openapiFields.add("source_branch_name");
    openapiFields.add("target_branch_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_branch_name");
    openapiRequiredFields.add("target_branch_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ValidateMergeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValidateMergeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateMergeRequest is not found in the empty JSON string", ValidateMergeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ValidateMergeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidateMergeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValidateMergeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("source_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_branch_name").toString()));
      }
      if (!jsonObj.get("target_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_branch_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateMergeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateMergeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateMergeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateMergeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateMergeRequest>() {
           @Override
           public void write(JsonWriter out, ValidateMergeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidateMergeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidateMergeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidateMergeRequest
  * @throws IOException if the JSON string is invalid with respect to ValidateMergeRequest
  */
  public static ValidateMergeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateMergeRequest.class);
  }

 /**
  * Convert an instance of ValidateMergeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
