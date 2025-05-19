/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thoughtspot.client.model.UserGroup;
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

import org.thoughtspot.client.JSON;

/**
 * ImportUserGroupsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ImportUserGroupsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUPS_ADDED = "groups_added";
  @SerializedName(SERIALIZED_NAME_GROUPS_ADDED)
  @javax.annotation.Nonnull
  private List<UserGroup> groupsAdded;

  public static final String SERIALIZED_NAME_GROUPS_DELETED = "groups_deleted";
  @SerializedName(SERIALIZED_NAME_GROUPS_DELETED)
  @javax.annotation.Nonnull
  private List<UserGroup> groupsDeleted;

  public static final String SERIALIZED_NAME_GROUPS_UPDATED = "groups_updated";
  @SerializedName(SERIALIZED_NAME_GROUPS_UPDATED)
  @javax.annotation.Nonnull
  private List<UserGroup> groupsUpdated;

  public ImportUserGroupsResponse() {
  }

  public ImportUserGroupsResponse groupsAdded(@javax.annotation.Nonnull List<UserGroup> groupsAdded) {
    this.groupsAdded = groupsAdded;
    return this;
  }

  public ImportUserGroupsResponse addGroupsAddedItem(UserGroup groupsAddedItem) {
    if (this.groupsAdded == null) {
      this.groupsAdded = new ArrayList<>();
    }
    this.groupsAdded.add(groupsAddedItem);
    return this;
  }

  /**
   * The groups which are added into the system.
   * @return groupsAdded
   */
  @javax.annotation.Nonnull
  public List<UserGroup> getGroupsAdded() {
    return groupsAdded;
  }

  public void setGroupsAdded(@javax.annotation.Nonnull List<UserGroup> groupsAdded) {
    this.groupsAdded = groupsAdded;
  }


  public ImportUserGroupsResponse groupsDeleted(@javax.annotation.Nonnull List<UserGroup> groupsDeleted) {
    this.groupsDeleted = groupsDeleted;
    return this;
  }

  public ImportUserGroupsResponse addGroupsDeletedItem(UserGroup groupsDeletedItem) {
    if (this.groupsDeleted == null) {
      this.groupsDeleted = new ArrayList<>();
    }
    this.groupsDeleted.add(groupsDeletedItem);
    return this;
  }

  /**
   * The groups which are deleted from the system.
   * @return groupsDeleted
   */
  @javax.annotation.Nonnull
  public List<UserGroup> getGroupsDeleted() {
    return groupsDeleted;
  }

  public void setGroupsDeleted(@javax.annotation.Nonnull List<UserGroup> groupsDeleted) {
    this.groupsDeleted = groupsDeleted;
  }


  public ImportUserGroupsResponse groupsUpdated(@javax.annotation.Nonnull List<UserGroup> groupsUpdated) {
    this.groupsUpdated = groupsUpdated;
    return this;
  }

  public ImportUserGroupsResponse addGroupsUpdatedItem(UserGroup groupsUpdatedItem) {
    if (this.groupsUpdated == null) {
      this.groupsUpdated = new ArrayList<>();
    }
    this.groupsUpdated.add(groupsUpdatedItem);
    return this;
  }

  /**
   * The groups which are updated in the system.
   * @return groupsUpdated
   */
  @javax.annotation.Nonnull
  public List<UserGroup> getGroupsUpdated() {
    return groupsUpdated;
  }

  public void setGroupsUpdated(@javax.annotation.Nonnull List<UserGroup> groupsUpdated) {
    this.groupsUpdated = groupsUpdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportUserGroupsResponse importUserGroupsResponse = (ImportUserGroupsResponse) o;
    return Objects.equals(this.groupsAdded, importUserGroupsResponse.groupsAdded) &&
        Objects.equals(this.groupsDeleted, importUserGroupsResponse.groupsDeleted) &&
        Objects.equals(this.groupsUpdated, importUserGroupsResponse.groupsUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupsAdded, groupsDeleted, groupsUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportUserGroupsResponse {\n");
    sb.append("    groupsAdded: ").append(toIndentedString(groupsAdded)).append("\n");
    sb.append("    groupsDeleted: ").append(toIndentedString(groupsDeleted)).append("\n");
    sb.append("    groupsUpdated: ").append(toIndentedString(groupsUpdated)).append("\n");
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
    openapiFields.add("groups_added");
    openapiFields.add("groups_deleted");
    openapiFields.add("groups_updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groups_added");
    openapiRequiredFields.add("groups_deleted");
    openapiRequiredFields.add("groups_updated");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImportUserGroupsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportUserGroupsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportUserGroupsResponse is not found in the empty JSON string", ImportUserGroupsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImportUserGroupsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportUserGroupsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportUserGroupsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("groups_added").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups_added` to be an array in the JSON string but got `%s`", jsonObj.get("groups_added").toString()));
      }

      JsonArray jsonArraygroupsAdded = jsonObj.getAsJsonArray("groups_added");
      // validate the required field `groups_added` (array)
      for (int i = 0; i < jsonArraygroupsAdded.size(); i++) {
        UserGroup.validateJsonElement(jsonArraygroupsAdded.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("groups_deleted").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups_deleted` to be an array in the JSON string but got `%s`", jsonObj.get("groups_deleted").toString()));
      }

      JsonArray jsonArraygroupsDeleted = jsonObj.getAsJsonArray("groups_deleted");
      // validate the required field `groups_deleted` (array)
      for (int i = 0; i < jsonArraygroupsDeleted.size(); i++) {
        UserGroup.validateJsonElement(jsonArraygroupsDeleted.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("groups_updated").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups_updated` to be an array in the JSON string but got `%s`", jsonObj.get("groups_updated").toString()));
      }

      JsonArray jsonArraygroupsUpdated = jsonObj.getAsJsonArray("groups_updated");
      // validate the required field `groups_updated` (array)
      for (int i = 0; i < jsonArraygroupsUpdated.size(); i++) {
        UserGroup.validateJsonElement(jsonArraygroupsUpdated.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportUserGroupsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportUserGroupsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportUserGroupsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportUserGroupsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportUserGroupsResponse>() {
           @Override
           public void write(JsonWriter out, ImportUserGroupsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportUserGroupsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImportUserGroupsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImportUserGroupsResponse
   * @throws IOException if the JSON string is invalid with respect to ImportUserGroupsResponse
   */
  public static ImportUserGroupsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportUserGroupsResponse.class);
  }

  /**
   * Convert an instance of ImportUserGroupsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

