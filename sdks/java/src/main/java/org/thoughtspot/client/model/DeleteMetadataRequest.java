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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.DeleteMetadataTypeInput;
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
 * DeleteMetadataRequest
 */

public class DeleteMetadataRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nonnull
  private List<DeleteMetadataTypeInput> metadata;

  public static final String SERIALIZED_NAME_DELETE_DISABLED_OBJECTS = "delete_disabled_objects";
  @SerializedName(SERIALIZED_NAME_DELETE_DISABLED_OBJECTS)
  @javax.annotation.Nullable
  private Boolean deleteDisabledObjects = false;

  public DeleteMetadataRequest() {
  }

  public DeleteMetadataRequest metadata(@javax.annotation.Nonnull List<DeleteMetadataTypeInput> metadata) {
    this.metadata = metadata;
    return this;
  }

  public DeleteMetadataRequest addMetadataItem(DeleteMetadataTypeInput metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Metadata objects.
   * @return metadata
   */
  @javax.annotation.Nonnull
  public List<DeleteMetadataTypeInput> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nonnull List<DeleteMetadataTypeInput> metadata) {
    this.metadata = metadata;
  }


  public DeleteMetadataRequest deleteDisabledObjects(@javax.annotation.Nullable Boolean deleteDisabledObjects) {
    this.deleteDisabledObjects = deleteDisabledObjects;
    return this;
  }

  /**
   * Indicates whether to delete disabled metadata objects.
   * @return deleteDisabledObjects
   */
  @javax.annotation.Nullable
  public Boolean getDeleteDisabledObjects() {
    return deleteDisabledObjects;
  }

  public void setDeleteDisabledObjects(@javax.annotation.Nullable Boolean deleteDisabledObjects) {
    this.deleteDisabledObjects = deleteDisabledObjects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteMetadataRequest deleteMetadataRequest = (DeleteMetadataRequest) o;
    return Objects.equals(this.metadata, deleteMetadataRequest.metadata) &&
        Objects.equals(this.deleteDisabledObjects, deleteMetadataRequest.deleteDisabledObjects);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, deleteDisabledObjects);
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
    sb.append("class DeleteMetadataRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    deleteDisabledObjects: ").append(toIndentedString(deleteDisabledObjects)).append("\n");
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
    openapiFields.add("delete_disabled_objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteMetadataRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteMetadataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteMetadataRequest is not found in the empty JSON string", DeleteMetadataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteMetadataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteMetadataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteMetadataRequest.openapiRequiredFields) {
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
        DeleteMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteMetadataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteMetadataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteMetadataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteMetadataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteMetadataRequest>() {
           @Override
           public void write(JsonWriter out, DeleteMetadataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteMetadataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteMetadataRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteMetadataRequest
   * @throws IOException if the JSON string is invalid with respect to DeleteMetadataRequest
   */
  public static DeleteMetadataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteMetadataRequest.class);
  }

  /**
   * Convert an instance of DeleteMetadataRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

