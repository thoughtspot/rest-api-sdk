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
import java.util.ArrayList;
import java.util.List;
import org.thoughtspot.client.model.MetadataObject;

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
 * RevertCommitRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class RevertCommitRequest {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<MetadataObject> metadata;

  public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";
  @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
  private String branchName;

  /**
   * Policy to apply when reverting a commit. Valid values: [ALL_OR_NONE, PARTIAL]
   */
  @JsonAdapter(RevertPolicyEnum.Adapter.class)
  public enum RevertPolicyEnum {
    ALL_OR_NONE("ALL_OR_NONE"),
    
    PARTIAL("PARTIAL");

    private String value;

    RevertPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RevertPolicyEnum fromValue(String value) {
      for (RevertPolicyEnum b : RevertPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RevertPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RevertPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RevertPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RevertPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVERT_POLICY = "revert_policy";
  @SerializedName(SERIALIZED_NAME_REVERT_POLICY)
  private RevertPolicyEnum revertPolicy = RevertPolicyEnum.ALL_OR_NONE;

  public RevertCommitRequest() {
  }

  public RevertCommitRequest metadata(List<MetadataObject> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public RevertCommitRequest addMetadataItem(MetadataObject metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Metadata objects.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<MetadataObject> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<MetadataObject> metadata) {
    this.metadata = metadata;
  }


  public RevertCommitRequest branchName(String branchName) {
    
    this.branchName = branchName;
    return this;
  }

   /**
   *    Name of the branch where the reverted version should be committed      Note: If no branch_name is specified, then the commit_branch_name will be considered.
   * @return branchName
  **/
  @javax.annotation.Nullable
  public String getBranchName() {
    return branchName;
  }


  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public RevertCommitRequest revertPolicy(RevertPolicyEnum revertPolicy) {
    
    this.revertPolicy = revertPolicy;
    return this;
  }

   /**
   * Policy to apply when reverting a commit. Valid values: [ALL_OR_NONE, PARTIAL]
   * @return revertPolicy
  **/
  @javax.annotation.Nullable
  public RevertPolicyEnum getRevertPolicy() {
    return revertPolicy;
  }


  public void setRevertPolicy(RevertPolicyEnum revertPolicy) {
    this.revertPolicy = revertPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevertCommitRequest revertCommitRequest = (RevertCommitRequest) o;
    return Objects.equals(this.metadata, revertCommitRequest.metadata) &&
        Objects.equals(this.branchName, revertCommitRequest.branchName) &&
        Objects.equals(this.revertPolicy, revertCommitRequest.revertPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, branchName, revertPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevertCommitRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    revertPolicy: ").append(toIndentedString(revertPolicy)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("branch_name");
    openapiFields.add("revert_policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevertCommitRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RevertCommitRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevertCommitRequest is not found in the empty JSON string", RevertCommitRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevertCommitRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevertCommitRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            MetadataObject.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("branch_name") != null && !jsonObj.get("branch_name").isJsonNull()) && !jsonObj.get("branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch_name").toString()));
      }
      if ((jsonObj.get("revert_policy") != null && !jsonObj.get("revert_policy").isJsonNull()) && !jsonObj.get("revert_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revert_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revert_policy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevertCommitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevertCommitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevertCommitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevertCommitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RevertCommitRequest>() {
           @Override
           public void write(JsonWriter out, RevertCommitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevertCommitRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevertCommitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevertCommitRequest
  * @throws IOException if the JSON string is invalid with respect to RevertCommitRequest
  */
  public static RevertCommitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevertCommitRequest.class);
  }

 /**
  * Convert an instance of RevertCommitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

