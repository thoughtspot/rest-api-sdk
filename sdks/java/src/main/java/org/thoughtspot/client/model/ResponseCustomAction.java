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
import org.thoughtspot.client.model.ActionDetails;
import org.thoughtspot.client.model.DefaultActionConfig;
import org.thoughtspot.client.model.MetadataAssociationItem;
import org.thoughtspot.client.model.ObjectIDAndName;

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
 * Custom action details
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T10:25:25.563+05:30[Asia/Kolkata]")
public class ResponseCustomAction {
  public static final String SERIALIZED_NAME_ACTION_DETAILS = "action_details";
  @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
  private ActionDetails actionDetails;

  public static final String SERIALIZED_NAME_DEFAULT_ACTION_CONFIG = "default_action_config";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION_CONFIG)
  private DefaultActionConfig defaultActionConfig;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA_ASSOCIATION = "metadata_association";
  @SerializedName(SERIALIZED_NAME_METADATA_ASSOCIATION)
  private List<MetadataAssociationItem> metadataAssociation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_GROUPS = "user_groups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  private List<ObjectIDAndName> userGroups;

  public ResponseCustomAction() {
  }

  public ResponseCustomAction actionDetails(ActionDetails actionDetails) {
    
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @javax.annotation.Nonnull
  public ActionDetails getActionDetails() {
    return actionDetails;
  }


  public void setActionDetails(ActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }


  public ResponseCustomAction defaultActionConfig(DefaultActionConfig defaultActionConfig) {
    
    this.defaultActionConfig = defaultActionConfig;
    return this;
  }

   /**
   * Get defaultActionConfig
   * @return defaultActionConfig
  **/
  @javax.annotation.Nonnull
  public DefaultActionConfig getDefaultActionConfig() {
    return defaultActionConfig;
  }


  public void setDefaultActionConfig(DefaultActionConfig defaultActionConfig) {
    this.defaultActionConfig = defaultActionConfig;
  }


  public ResponseCustomAction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique Id of the custom action.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ResponseCustomAction metadataAssociation(List<MetadataAssociationItem> metadataAssociation) {
    
    this.metadataAssociation = metadataAssociation;
    return this;
  }

  public ResponseCustomAction addMetadataAssociationItem(MetadataAssociationItem metadataAssociationItem) {
    if (this.metadataAssociation == null) {
      this.metadataAssociation = new ArrayList<>();
    }
    this.metadataAssociation.add(metadataAssociationItem);
    return this;
  }

   /**
   * Metadata objects to assign the the custom action to.
   * @return metadataAssociation
  **/
  @javax.annotation.Nullable
  public List<MetadataAssociationItem> getMetadataAssociation() {
    return metadataAssociation;
  }


  public void setMetadataAssociation(List<MetadataAssociationItem> metadataAssociation) {
    this.metadataAssociation = metadataAssociation;
  }


  public ResponseCustomAction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Unique name of the custom action.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResponseCustomAction userGroups(List<ObjectIDAndName> userGroups) {
    
    this.userGroups = userGroups;
    return this;
  }

  public ResponseCustomAction addUserGroupsItem(ObjectIDAndName userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Unique ID or name of the User groups which are associated with the custom action.
   * @return userGroups
  **/
  @javax.annotation.Nullable
  public List<ObjectIDAndName> getUserGroups() {
    return userGroups;
  }


  public void setUserGroups(List<ObjectIDAndName> userGroups) {
    this.userGroups = userGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCustomAction responseCustomAction = (ResponseCustomAction) o;
    return Objects.equals(this.actionDetails, responseCustomAction.actionDetails) &&
        Objects.equals(this.defaultActionConfig, responseCustomAction.defaultActionConfig) &&
        Objects.equals(this.id, responseCustomAction.id) &&
        Objects.equals(this.metadataAssociation, responseCustomAction.metadataAssociation) &&
        Objects.equals(this.name, responseCustomAction.name) &&
        Objects.equals(this.userGroups, responseCustomAction.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDetails, defaultActionConfig, id, metadataAssociation, name, userGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCustomAction {\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
    sb.append("    defaultActionConfig: ").append(toIndentedString(defaultActionConfig)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadataAssociation: ").append(toIndentedString(metadataAssociation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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
    openapiFields.add("action_details");
    openapiFields.add("default_action_config");
    openapiFields.add("id");
    openapiFields.add("metadata_association");
    openapiFields.add("name");
    openapiFields.add("user_groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action_details");
    openapiRequiredFields.add("default_action_config");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseCustomAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResponseCustomAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseCustomAction is not found in the empty JSON string", ResponseCustomAction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseCustomAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseCustomAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseCustomAction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `action_details`
      ActionDetails.validateJsonObject(jsonObj.getAsJsonObject("action_details"));
      // validate the required field `default_action_config`
      DefaultActionConfig.validateJsonObject(jsonObj.getAsJsonObject("default_action_config"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("metadata_association") != null && !jsonObj.get("metadata_association").isJsonNull()) {
        JsonArray jsonArraymetadataAssociation = jsonObj.getAsJsonArray("metadata_association");
        if (jsonArraymetadataAssociation != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata_association").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata_association` to be an array in the JSON string but got `%s`", jsonObj.get("metadata_association").toString()));
          }

          // validate the optional field `metadata_association` (array)
          for (int i = 0; i < jsonArraymetadataAssociation.size(); i++) {
            MetadataAssociationItem.validateJsonObject(jsonArraymetadataAssociation.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("user_groups") != null && !jsonObj.get("user_groups").isJsonNull()) {
        JsonArray jsonArrayuserGroups = jsonObj.getAsJsonArray("user_groups");
        if (jsonArrayuserGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("user_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `user_groups` to be an array in the JSON string but got `%s`", jsonObj.get("user_groups").toString()));
          }

          // validate the optional field `user_groups` (array)
          for (int i = 0; i < jsonArrayuserGroups.size(); i++) {
            ObjectIDAndName.validateJsonObject(jsonArrayuserGroups.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseCustomAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseCustomAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseCustomAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseCustomAction.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseCustomAction>() {
           @Override
           public void write(JsonWriter out, ResponseCustomAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseCustomAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseCustomAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseCustomAction
  * @throws IOException if the JSON string is invalid with respect to ResponseCustomAction
  */
  public static ResponseCustomAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseCustomAction.class);
  }

 /**
  * Convert an instance of ResponseCustomAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

