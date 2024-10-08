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
import org.thoughtspot.client.model.ImportUserType;

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
 * ImportUsersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T14:03:41.316769Z[Etc/UTC]")
public class ImportUsersResponse {
  public static final String SERIALIZED_NAME_USERS_ADDED = "users_added";
  @SerializedName(SERIALIZED_NAME_USERS_ADDED)
  private List<ImportUserType> usersAdded;

  public static final String SERIALIZED_NAME_USERS_UPDATED = "users_updated";
  @SerializedName(SERIALIZED_NAME_USERS_UPDATED)
  private List<ImportUserType> usersUpdated;

  public static final String SERIALIZED_NAME_USERS_DELETED = "users_deleted";
  @SerializedName(SERIALIZED_NAME_USERS_DELETED)
  private List<ImportUserType> usersDeleted;

  public ImportUsersResponse() {
  }

  public ImportUsersResponse usersAdded(List<ImportUserType> usersAdded) {
    
    this.usersAdded = usersAdded;
    return this;
  }

  public ImportUsersResponse addUsersAddedItem(ImportUserType usersAddedItem) {
    if (this.usersAdded == null) {
      this.usersAdded = new ArrayList<>();
    }
    this.usersAdded.add(usersAddedItem);
    return this;
  }

   /**
   * Get usersAdded
   * @return usersAdded
  **/
  @javax.annotation.Nullable
  public List<ImportUserType> getUsersAdded() {
    return usersAdded;
  }


  public void setUsersAdded(List<ImportUserType> usersAdded) {
    this.usersAdded = usersAdded;
  }


  public ImportUsersResponse usersUpdated(List<ImportUserType> usersUpdated) {
    
    this.usersUpdated = usersUpdated;
    return this;
  }

  public ImportUsersResponse addUsersUpdatedItem(ImportUserType usersUpdatedItem) {
    if (this.usersUpdated == null) {
      this.usersUpdated = new ArrayList<>();
    }
    this.usersUpdated.add(usersUpdatedItem);
    return this;
  }

   /**
   * Get usersUpdated
   * @return usersUpdated
  **/
  @javax.annotation.Nullable
  public List<ImportUserType> getUsersUpdated() {
    return usersUpdated;
  }


  public void setUsersUpdated(List<ImportUserType> usersUpdated) {
    this.usersUpdated = usersUpdated;
  }


  public ImportUsersResponse usersDeleted(List<ImportUserType> usersDeleted) {
    
    this.usersDeleted = usersDeleted;
    return this;
  }

  public ImportUsersResponse addUsersDeletedItem(ImportUserType usersDeletedItem) {
    if (this.usersDeleted == null) {
      this.usersDeleted = new ArrayList<>();
    }
    this.usersDeleted.add(usersDeletedItem);
    return this;
  }

   /**
   * Get usersDeleted
   * @return usersDeleted
  **/
  @javax.annotation.Nullable
  public List<ImportUserType> getUsersDeleted() {
    return usersDeleted;
  }


  public void setUsersDeleted(List<ImportUserType> usersDeleted) {
    this.usersDeleted = usersDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportUsersResponse importUsersResponse = (ImportUsersResponse) o;
    return Objects.equals(this.usersAdded, importUsersResponse.usersAdded) &&
        Objects.equals(this.usersUpdated, importUsersResponse.usersUpdated) &&
        Objects.equals(this.usersDeleted, importUsersResponse.usersDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersAdded, usersUpdated, usersDeleted);
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
    sb.append("class ImportUsersResponse {\n");
    sb.append("    usersAdded: ").append(toIndentedString(usersAdded)).append("\n");
    sb.append("    usersUpdated: ").append(toIndentedString(usersUpdated)).append("\n");
    sb.append("    usersDeleted: ").append(toIndentedString(usersDeleted)).append("\n");
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
    openapiFields.add("users_added");
    openapiFields.add("users_updated");
    openapiFields.add("users_deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportUsersResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImportUsersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportUsersResponse is not found in the empty JSON string", ImportUsersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportUsersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportUsersResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("users_added") != null && !jsonObj.get("users_added").isJsonNull()) {
        JsonArray jsonArrayusersAdded = jsonObj.getAsJsonArray("users_added");
        if (jsonArrayusersAdded != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users_added").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users_added` to be an array in the JSON string but got `%s`", jsonObj.get("users_added").toString()));
          }

          // validate the optional field `users_added` (array)
          for (int i = 0; i < jsonArrayusersAdded.size(); i++) {
            ImportUserType.validateJsonObject(jsonArrayusersAdded.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("users_updated") != null && !jsonObj.get("users_updated").isJsonNull()) {
        JsonArray jsonArrayusersUpdated = jsonObj.getAsJsonArray("users_updated");
        if (jsonArrayusersUpdated != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users_updated").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users_updated` to be an array in the JSON string but got `%s`", jsonObj.get("users_updated").toString()));
          }

          // validate the optional field `users_updated` (array)
          for (int i = 0; i < jsonArrayusersUpdated.size(); i++) {
            ImportUserType.validateJsonObject(jsonArrayusersUpdated.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("users_deleted") != null && !jsonObj.get("users_deleted").isJsonNull()) {
        JsonArray jsonArrayusersDeleted = jsonObj.getAsJsonArray("users_deleted");
        if (jsonArrayusersDeleted != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users_deleted").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users_deleted` to be an array in the JSON string but got `%s`", jsonObj.get("users_deleted").toString()));
          }

          // validate the optional field `users_deleted` (array)
          for (int i = 0; i < jsonArrayusersDeleted.size(); i++) {
            ImportUserType.validateJsonObject(jsonArrayusersDeleted.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportUsersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportUsersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportUsersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportUsersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportUsersResponse>() {
           @Override
           public void write(JsonWriter out, ImportUsersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportUsersResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportUsersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportUsersResponse
  * @throws IOException if the JSON string is invalid with respect to ImportUsersResponse
  */
  public static ImportUsersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportUsersResponse.class);
  }

 /**
  * Convert an instance of ImportUsersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

