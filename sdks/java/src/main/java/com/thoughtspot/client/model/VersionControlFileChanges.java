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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Files a promotion changed, or would change on a dry run, one list per kind of change. Every list is present and empty when that kind has none, so total_count is the sum of their lengths.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlFileChanges implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  @javax.annotation.Nonnull
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  @javax.annotation.Nonnull
  private List<String> added;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  @javax.annotation.Nonnull
  private List<String> modified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  @javax.annotation.Nonnull
  private List<String> deleted;

  public static final String SERIALIZED_NAME_CONFLICTS = "conflicts";
  @SerializedName(SERIALIZED_NAME_CONFLICTS)
  @javax.annotation.Nonnull
  private List<String> conflicts;

  public VersionControlFileChanges() {
  }

  public VersionControlFileChanges totalCount(@javax.annotation.Nonnull Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total files changed, across all kinds of change.
   * @return totalCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(@javax.annotation.Nonnull Integer totalCount) {
    this.totalCount = totalCount;
  }


  public VersionControlFileChanges added(@javax.annotation.Nonnull List<String> added) {
    this.added = added;
    return this;
  }

  public VersionControlFileChanges addAddedItem(String addedItem) {
    if (this.added == null) {
      this.added = new ArrayList<>();
    }
    this.added.add(addedItem);
    return this;
  }

  /**
   * Repository paths of files added.
   * @return added
   */
  @javax.annotation.Nonnull
  public List<String> getAdded() {
    return added;
  }

  public void setAdded(@javax.annotation.Nonnull List<String> added) {
    this.added = added;
  }


  public VersionControlFileChanges modified(@javax.annotation.Nonnull List<String> modified) {
    this.modified = modified;
    return this;
  }

  public VersionControlFileChanges addModifiedItem(String modifiedItem) {
    if (this.modified == null) {
      this.modified = new ArrayList<>();
    }
    this.modified.add(modifiedItem);
    return this;
  }

  /**
   * Repository paths of files modified.
   * @return modified
   */
  @javax.annotation.Nonnull
  public List<String> getModified() {
    return modified;
  }

  public void setModified(@javax.annotation.Nonnull List<String> modified) {
    this.modified = modified;
  }


  public VersionControlFileChanges deleted(@javax.annotation.Nonnull List<String> deleted) {
    this.deleted = deleted;
    return this;
  }

  public VersionControlFileChanges addDeletedItem(String deletedItem) {
    if (this.deleted == null) {
      this.deleted = new ArrayList<>();
    }
    this.deleted.add(deletedItem);
    return this;
  }

  /**
   * Repository paths of files deleted.
   * @return deleted
   */
  @javax.annotation.Nonnull
  public List<String> getDeleted() {
    return deleted;
  }

  public void setDeleted(@javax.annotation.Nonnull List<String> deleted) {
    this.deleted = deleted;
  }


  public VersionControlFileChanges conflicts(@javax.annotation.Nonnull List<String> conflicts) {
    this.conflicts = conflicts;
    return this;
  }

  public VersionControlFileChanges addConflictsItem(String conflictsItem) {
    if (this.conflicts == null) {
      this.conflicts = new ArrayList<>();
    }
    this.conflicts.add(conflictsItem);
    return this;
  }

  /**
   * Repository paths of files that conflicted and were resolved in favor of the side named by conflict_policy. Empty under FAIL_REQUEST, which fails the request rather than returning a body whenever anything conflicts.
   * @return conflicts
   */
  @javax.annotation.Nonnull
  public List<String> getConflicts() {
    return conflicts;
  }

  public void setConflicts(@javax.annotation.Nonnull List<String> conflicts) {
    this.conflicts = conflicts;
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
   * @return the VersionControlFileChanges instance itself
   */
  public VersionControlFileChanges putAdditionalProperty(String key, Object value) {
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
    VersionControlFileChanges versionControlFileChanges = (VersionControlFileChanges) o;
    return Objects.equals(this.totalCount, versionControlFileChanges.totalCount) &&
        Objects.equals(this.added, versionControlFileChanges.added) &&
        Objects.equals(this.modified, versionControlFileChanges.modified) &&
        Objects.equals(this.deleted, versionControlFileChanges.deleted) &&
        Objects.equals(this.conflicts, versionControlFileChanges.conflicts)&&
        Objects.equals(this.additionalProperties, versionControlFileChanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, added, modified, deleted, conflicts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlFileChanges {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
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
    openapiFields.add("total_count");
    openapiFields.add("added");
    openapiFields.add("modified");
    openapiFields.add("deleted");
    openapiFields.add("conflicts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_count");
    openapiRequiredFields.add("added");
    openapiRequiredFields.add("modified");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("conflicts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlFileChanges
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlFileChanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlFileChanges is not found in the empty JSON string", VersionControlFileChanges.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionControlFileChanges.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("added") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("added").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `added` to be an array in the JSON string but got `%s`", jsonObj.get("added").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("modified") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("modified").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be an array in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("deleted") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("deleted").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted` to be an array in the JSON string but got `%s`", jsonObj.get("deleted").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("conflicts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("conflicts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `conflicts` to be an array in the JSON string but got `%s`", jsonObj.get("conflicts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlFileChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlFileChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlFileChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlFileChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlFileChanges>() {
           @Override
           public void write(JsonWriter out, VersionControlFileChanges value) throws IOException {
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
           public VersionControlFileChanges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlFileChanges instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlFileChanges given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlFileChanges
   * @throws IOException if the JSON string is invalid with respect to VersionControlFileChanges
   */
  public static VersionControlFileChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlFileChanges.class);
  }

  /**
   * Convert an instance of VersionControlFileChanges to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

