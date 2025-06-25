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
import com.thoughtspot.client.model.PermissionsMetadataTypeInput;
import com.thoughtspot.client.model.PrincipalsInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * FetchPermissionsOnMetadataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class FetchPermissionsOnMetadataRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nonnull
  private List<PermissionsMetadataTypeInput> metadata;

  public static final String SERIALIZED_NAME_PRINCIPALS = "principals";
  @SerializedName(SERIALIZED_NAME_PRINCIPALS)
  @javax.annotation.Nullable
  private List<PrincipalsInput> principals;

  public static final String SERIALIZED_NAME_INCLUDE_DEPENDENT_OBJECTS = "include_dependent_objects";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DEPENDENT_OBJECTS)
  @javax.annotation.Nullable
  private Boolean includeDependentObjects = false;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  @javax.annotation.Nullable
  private Integer recordOffset = 0;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  @javax.annotation.Nullable
  private Integer recordSize = -1;

  public static final String SERIALIZED_NAME_PERMISSION_TYPE = "permission_type";
  @SerializedName(SERIALIZED_NAME_PERMISSION_TYPE)
  @javax.annotation.Nullable
  private String permissionType;

  public FetchPermissionsOnMetadataRequest() {
  }

  public FetchPermissionsOnMetadataRequest metadata(@javax.annotation.Nonnull List<PermissionsMetadataTypeInput> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FetchPermissionsOnMetadataRequest addMetadataItem(PermissionsMetadataTypeInput metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * GUID or name of the metadata object.
   * @return metadata
   */
  @javax.annotation.Nonnull
  public List<PermissionsMetadataTypeInput> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nonnull List<PermissionsMetadataTypeInput> metadata) {
    this.metadata = metadata;
  }


  public FetchPermissionsOnMetadataRequest principals(@javax.annotation.Nullable List<PrincipalsInput> principals) {
    this.principals = principals;
    return this;
  }

  public FetchPermissionsOnMetadataRequest addPrincipalsItem(PrincipalsInput principalsItem) {
    if (this.principals == null) {
      this.principals = new ArrayList<>();
    }
    this.principals.add(principalsItem);
    return this;
  }

  /**
   * User or group objects for which you want to fetch permissions. If not specified, the API returns all users and groups that can access the specified metadata objects.
   * @return principals
   */
  @javax.annotation.Nullable
  public List<PrincipalsInput> getPrincipals() {
    return principals;
  }

  public void setPrincipals(@javax.annotation.Nullable List<PrincipalsInput> principals) {
    this.principals = principals;
  }


  public FetchPermissionsOnMetadataRequest includeDependentObjects(@javax.annotation.Nullable Boolean includeDependentObjects) {
    this.includeDependentObjects = includeDependentObjects;
    return this;
  }

  /**
   * Indicates whether to fetch permissions of dependent metadata objects.
   * @return includeDependentObjects
   */
  @javax.annotation.Nullable
  public Boolean getIncludeDependentObjects() {
    return includeDependentObjects;
  }

  public void setIncludeDependentObjects(@javax.annotation.Nullable Boolean includeDependentObjects) {
    this.includeDependentObjects = includeDependentObjects;
  }


  public FetchPermissionsOnMetadataRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
    return this;
  }

  /**
   * The starting record number from where the records should be included for each metadata type.
   * @return recordOffset
   */
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }

  public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public FetchPermissionsOnMetadataRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
    return this;
  }

  /**
   * The number of records that should be included for each metadata type.
   * @return recordSize
   */
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }

  public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
  }


  public FetchPermissionsOnMetadataRequest permissionType(@javax.annotation.Nullable String permissionType) {
    this.permissionType = permissionType;
    return this;
  }

  /**
   * &lt;div&gt;Version: 10.3.0.cl or later &lt;/div&gt;  Specifies the type of permission. Valid values are:     EFFECTIVE - If the user permission to the metadata objects is granted by the privileges assigned to the groups to which they belong.     DEFINED - If a user or user group received access to metadata objects via object sharing by another user.
   * @return permissionType
   */
  @javax.annotation.Nullable
  public String getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(@javax.annotation.Nullable String permissionType) {
    this.permissionType = permissionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest = (FetchPermissionsOnMetadataRequest) o;
    return Objects.equals(this.metadata, fetchPermissionsOnMetadataRequest.metadata) &&
        Objects.equals(this.principals, fetchPermissionsOnMetadataRequest.principals) &&
        Objects.equals(this.includeDependentObjects, fetchPermissionsOnMetadataRequest.includeDependentObjects) &&
        Objects.equals(this.recordOffset, fetchPermissionsOnMetadataRequest.recordOffset) &&
        Objects.equals(this.recordSize, fetchPermissionsOnMetadataRequest.recordSize) &&
        Objects.equals(this.permissionType, fetchPermissionsOnMetadataRequest.permissionType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, principals, includeDependentObjects, recordOffset, recordSize, permissionType);
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
    sb.append("class FetchPermissionsOnMetadataRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    includeDependentObjects: ").append(toIndentedString(includeDependentObjects)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
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
    openapiFields.add("principals");
    openapiFields.add("include_dependent_objects");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("permission_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FetchPermissionsOnMetadataRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FetchPermissionsOnMetadataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchPermissionsOnMetadataRequest is not found in the empty JSON string", FetchPermissionsOnMetadataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FetchPermissionsOnMetadataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FetchPermissionsOnMetadataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchPermissionsOnMetadataRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }

      JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
      // validate the required field `metadata` (array)
      for (int i = 0; i < jsonArraymetadata.size(); i++) {
        PermissionsMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
      };
      if (jsonObj.get("principals") != null && !jsonObj.get("principals").isJsonNull()) {
        JsonArray jsonArrayprincipals = jsonObj.getAsJsonArray("principals");
        if (jsonArrayprincipals != null) {
          // ensure the json data is an array
          if (!jsonObj.get("principals").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `principals` to be an array in the JSON string but got `%s`", jsonObj.get("principals").toString()));
          }

          // validate the optional field `principals` (array)
          for (int i = 0; i < jsonArrayprincipals.size(); i++) {
            PrincipalsInput.validateJsonElement(jsonArrayprincipals.get(i));
          };
        }
      }
      if ((jsonObj.get("permission_type") != null && !jsonObj.get("permission_type").isJsonNull()) && !jsonObj.get("permission_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchPermissionsOnMetadataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchPermissionsOnMetadataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchPermissionsOnMetadataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchPermissionsOnMetadataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchPermissionsOnMetadataRequest>() {
           @Override
           public void write(JsonWriter out, FetchPermissionsOnMetadataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchPermissionsOnMetadataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FetchPermissionsOnMetadataRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FetchPermissionsOnMetadataRequest
   * @throws IOException if the JSON string is invalid with respect to FetchPermissionsOnMetadataRequest
   */
  public static FetchPermissionsOnMetadataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchPermissionsOnMetadataRequest.class);
  }

  /**
   * Convert an instance of FetchPermissionsOnMetadataRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

