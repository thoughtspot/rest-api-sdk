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
import org.thoughtspot.client.model.AssociateMetadataInputCreate;
import org.thoughtspot.client.model.CreateCustomActionRequestActionDetails;
import org.thoughtspot.client.model.CreateCustomActionRequestDefaultActionConfig;

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
 * CreateCustomActionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T11:03:56.651712770Z[Etc/UTC]")
public class CreateCustomActionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTION_DETAILS = "action_details";
  @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
  private CreateCustomActionRequestActionDetails actionDetails;

  public static final String SERIALIZED_NAME_ASSOCIATE_METADATA = "associate_metadata";
  @SerializedName(SERIALIZED_NAME_ASSOCIATE_METADATA)
  private List<AssociateMetadataInputCreate> associateMetadata;

  public static final String SERIALIZED_NAME_DEFAULT_ACTION_CONFIG = "default_action_config";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION_CONFIG)
  private CreateCustomActionRequestDefaultActionConfig defaultActionConfig;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  private List<String> groupIdentifiers;

  public CreateCustomActionRequest() {
  }

  public CreateCustomActionRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the custom action. The custom action name must be unique.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCustomActionRequest actionDetails(CreateCustomActionRequestActionDetails actionDetails) {
    
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @javax.annotation.Nonnull
  public CreateCustomActionRequestActionDetails getActionDetails() {
    return actionDetails;
  }


  public void setActionDetails(CreateCustomActionRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }


  public CreateCustomActionRequest associateMetadata(List<AssociateMetadataInputCreate> associateMetadata) {
    
    this.associateMetadata = associateMetadata;
    return this;
  }

  public CreateCustomActionRequest addAssociateMetadataItem(AssociateMetadataInputCreate associateMetadataItem) {
    if (this.associateMetadata == null) {
      this.associateMetadata = new ArrayList<>();
    }
    this.associateMetadata.add(associateMetadataItem);
    return this;
  }

   /**
   * Metadata objects to which the custom action needs to be associated.
   * @return associateMetadata
  **/
  @javax.annotation.Nullable
  public List<AssociateMetadataInputCreate> getAssociateMetadata() {
    return associateMetadata;
  }


  public void setAssociateMetadata(List<AssociateMetadataInputCreate> associateMetadata) {
    this.associateMetadata = associateMetadata;
  }


  public CreateCustomActionRequest defaultActionConfig(CreateCustomActionRequestDefaultActionConfig defaultActionConfig) {
    
    this.defaultActionConfig = defaultActionConfig;
    return this;
  }

   /**
   * Get defaultActionConfig
   * @return defaultActionConfig
  **/
  @javax.annotation.Nullable
  public CreateCustomActionRequestDefaultActionConfig getDefaultActionConfig() {
    return defaultActionConfig;
  }


  public void setDefaultActionConfig(CreateCustomActionRequestDefaultActionConfig defaultActionConfig) {
    this.defaultActionConfig = defaultActionConfig;
  }


  public CreateCustomActionRequest groupIdentifiers(List<String> groupIdentifiers) {
    
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public CreateCustomActionRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

   /**
   * Unique ID or name of the groups that can view and access the custom action.
   * @return groupIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }


  public void setGroupIdentifiers(List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomActionRequest createCustomActionRequest = (CreateCustomActionRequest) o;
    return Objects.equals(this.name, createCustomActionRequest.name) &&
        Objects.equals(this.actionDetails, createCustomActionRequest.actionDetails) &&
        Objects.equals(this.associateMetadata, createCustomActionRequest.associateMetadata) &&
        Objects.equals(this.defaultActionConfig, createCustomActionRequest.defaultActionConfig) &&
        Objects.equals(this.groupIdentifiers, createCustomActionRequest.groupIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, actionDetails, associateMetadata, defaultActionConfig, groupIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomActionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
    sb.append("    associateMetadata: ").append(toIndentedString(associateMetadata)).append("\n");
    sb.append("    defaultActionConfig: ").append(toIndentedString(defaultActionConfig)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("action_details");
    openapiFields.add("associate_metadata");
    openapiFields.add("default_action_config");
    openapiFields.add("group_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("action_details");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCustomActionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCustomActionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCustomActionRequest is not found in the empty JSON string", CreateCustomActionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCustomActionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCustomActionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCustomActionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `action_details`
      CreateCustomActionRequestActionDetails.validateJsonObject(jsonObj.getAsJsonObject("action_details"));
      if (jsonObj.get("associate_metadata") != null && !jsonObj.get("associate_metadata").isJsonNull()) {
        JsonArray jsonArrayassociateMetadata = jsonObj.getAsJsonArray("associate_metadata");
        if (jsonArrayassociateMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associate_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associate_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("associate_metadata").toString()));
          }

          // validate the optional field `associate_metadata` (array)
          for (int i = 0; i < jsonArrayassociateMetadata.size(); i++) {
            AssociateMetadataInputCreate.validateJsonObject(jsonArrayassociateMetadata.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `default_action_config`
      if (jsonObj.get("default_action_config") != null && !jsonObj.get("default_action_config").isJsonNull()) {
        CreateCustomActionRequestDefaultActionConfig.validateJsonObject(jsonObj.getAsJsonObject("default_action_config"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_identifiers") != null && !jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCustomActionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCustomActionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCustomActionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCustomActionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCustomActionRequest>() {
           @Override
           public void write(JsonWriter out, CreateCustomActionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCustomActionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCustomActionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCustomActionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCustomActionRequest
  */
  public static CreateCustomActionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCustomActionRequest.class);
  }

 /**
  * Convert an instance of CreateCustomActionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

