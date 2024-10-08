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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.ImportUser;

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
 * ImportUsersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T14:03:41.316769Z[Etc/UTC]")
public class ImportUsersRequest {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<ImportUser> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_PASSWORD = "default_password";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PASSWORD)
  private String defaultPassword;

  public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun = true;

  public static final String SERIALIZED_NAME_DELETE_UNSPECIFIED_USERS = "delete_unspecified_users";
  @SerializedName(SERIALIZED_NAME_DELETE_UNSPECIFIED_USERS)
  private Boolean deleteUnspecifiedUsers = false;

  public ImportUsersRequest() {
  }

  public ImportUsersRequest users(List<ImportUser> users) {
    
    this.users = users;
    return this;
  }

  public ImportUsersRequest addUsersItem(ImportUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users needs to be imported.
   * @return users
  **/
  @javax.annotation.Nonnull
  public List<ImportUser> getUsers() {
    return users;
  }


  public void setUsers(List<ImportUser> users) {
    this.users = users;
  }


  public ImportUsersRequest defaultPassword(String defaultPassword) {
    
    this.defaultPassword = defaultPassword;
    return this;
  }

   /**
   * The default password to assign to users if they do not have a password assigned in ThoughtSpot.
   * @return defaultPassword
  **/
  @javax.annotation.Nullable
  public String getDefaultPassword() {
    return defaultPassword;
  }


  public void setDefaultPassword(String defaultPassword) {
    this.defaultPassword = defaultPassword;
  }


  public ImportUsersRequest dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If true, the API performs a test operation and returns user IDs whose data will be edited after the import.
   * @return dryRun
  **/
  @javax.annotation.Nullable
  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public ImportUsersRequest deleteUnspecifiedUsers(Boolean deleteUnspecifiedUsers) {
    
    this.deleteUnspecifiedUsers = deleteUnspecifiedUsers;
    return this;
  }

   /**
   * If set to true, removes the users that are not specified in the API request.
   * @return deleteUnspecifiedUsers
  **/
  @javax.annotation.Nullable
  public Boolean getDeleteUnspecifiedUsers() {
    return deleteUnspecifiedUsers;
  }


  public void setDeleteUnspecifiedUsers(Boolean deleteUnspecifiedUsers) {
    this.deleteUnspecifiedUsers = deleteUnspecifiedUsers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportUsersRequest importUsersRequest = (ImportUsersRequest) o;
    return Objects.equals(this.users, importUsersRequest.users) &&
        Objects.equals(this.defaultPassword, importUsersRequest.defaultPassword) &&
        Objects.equals(this.dryRun, importUsersRequest.dryRun) &&
        Objects.equals(this.deleteUnspecifiedUsers, importUsersRequest.deleteUnspecifiedUsers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, defaultPassword, dryRun, deleteUnspecifiedUsers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportUsersRequest {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    defaultPassword: ").append(toIndentedString(defaultPassword)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    deleteUnspecifiedUsers: ").append(toIndentedString(deleteUnspecifiedUsers)).append("\n");
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
    openapiFields.add("users");
    openapiFields.add("default_password");
    openapiFields.add("dry_run");
    openapiFields.add("delete_unspecified_users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("users");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportUsersRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImportUsersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportUsersRequest is not found in the empty JSON string", ImportUsersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportUsersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportUsersRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportUsersRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }

      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      // validate the required field `users` (array)
      for (int i = 0; i < jsonArrayusers.size(); i++) {
        ImportUser.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("default_password") != null && !jsonObj.get("default_password").isJsonNull()) && !jsonObj.get("default_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportUsersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportUsersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportUsersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportUsersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportUsersRequest>() {
           @Override
           public void write(JsonWriter out, ImportUsersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportUsersRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportUsersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportUsersRequest
  * @throws IOException if the JSON string is invalid with respect to ImportUsersRequest
  */
  public static ImportUsersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportUsersRequest.class);
  }

 /**
  * Convert an instance of ImportUsersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

