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
import com.thoughtspot.client.model.VersionControlCommitObjectInput;
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
 * CreateCommitRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CreateCommitRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  @javax.annotation.Nonnull
  private List<VersionControlCommitObjectInput> objects;

  public static final String SERIALIZED_NAME_COMMIT_MESSAGE = "commit_message";
  @SerializedName(SERIALIZED_NAME_COMMIT_MESSAGE)
  @javax.annotation.Nullable
  private String commitMessage;

  public static final String SERIALIZED_NAME_PRUNE_DELETED_OBJECT_FILES = "prune_deleted_object_files";
  @SerializedName(SERIALIZED_NAME_PRUNE_DELETED_OBJECT_FILES)
  @javax.annotation.Nullable
  private Boolean pruneDeletedObjectFiles = false;

  public CreateCommitRequest() {
  }

  public CreateCommitRequest objects(@javax.annotation.Nonnull List<VersionControlCommitObjectInput> objects) {
    this.objects = objects;
    return this;
  }

  public CreateCommitRequest addObjectsItem(VersionControlCommitObjectInput objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

  /**
   * Objects to version in this run, named by object ID. Every object must be distinct, must already exist in your Org, and must be a Liveboard or an Answer. A run carries at most 50.
   * @return objects
   */
  @javax.annotation.Nonnull
  public List<VersionControlCommitObjectInput> getObjects() {
    return objects;
  }

  public void setObjects(@javax.annotation.Nonnull List<VersionControlCommitObjectInput> objects) {
    this.objects = objects;
  }


  public CreateCommitRequest commitMessage(@javax.annotation.Nullable String commitMessage) {
    this.commitMessage = commitMessage;
    return this;
  }

  /**
   * Message for the single Git commit this run produces. Omit this to let ThoughtSpot generate one.
   * @return commitMessage
   */
  @javax.annotation.Nullable
  public String getCommitMessage() {
    return commitMessage;
  }

  public void setCommitMessage(@javax.annotation.Nullable String commitMessage) {
    this.commitMessage = commitMessage;
  }


  public CreateCommitRequest pruneDeletedObjectFiles(@javax.annotation.Nullable Boolean pruneDeletedObjectFiles) {
    this.pruneDeletedObjectFiles = pruneDeletedObjectFiles;
    return this;
  }

  /**
   * Remove the repository file of any named object that no longer exists in ThoughtSpot, so the branch stops carrying deleted content.
   * @return pruneDeletedObjectFiles
   */
  @javax.annotation.Nullable
  public Boolean getPruneDeletedObjectFiles() {
    return pruneDeletedObjectFiles;
  }

  public void setPruneDeletedObjectFiles(@javax.annotation.Nullable Boolean pruneDeletedObjectFiles) {
    this.pruneDeletedObjectFiles = pruneDeletedObjectFiles;
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
   * @return the CreateCommitRequest instance itself
   */
  public CreateCommitRequest putAdditionalProperty(String key, Object value) {
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
    CreateCommitRequest createCommitRequest = (CreateCommitRequest) o;
    return Objects.equals(this.objects, createCommitRequest.objects) &&
        Objects.equals(this.commitMessage, createCommitRequest.commitMessage) &&
        Objects.equals(this.pruneDeletedObjectFiles, createCommitRequest.pruneDeletedObjectFiles)&&
        Objects.equals(this.additionalProperties, createCommitRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, commitMessage, pruneDeletedObjectFiles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCommitRequest {\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    pruneDeletedObjectFiles: ").append(toIndentedString(pruneDeletedObjectFiles)).append("\n");
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
    openapiFields.add("objects");
    openapiFields.add("commit_message");
    openapiFields.add("prune_deleted_object_files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objects");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCommitRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCommitRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCommitRequest is not found in the empty JSON string", CreateCommitRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCommitRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("objects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
      }

      JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
      // validate the required field `objects` (array)
      for (int i = 0; i < jsonArrayobjects.size(); i++) {
        VersionControlCommitObjectInput.validateJsonElement(jsonArrayobjects.get(i));
      };
      if ((jsonObj.get("commit_message") != null && !jsonObj.get("commit_message").isJsonNull()) && !jsonObj.get("commit_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCommitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCommitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCommitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCommitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCommitRequest>() {
           @Override
           public void write(JsonWriter out, CreateCommitRequest value) throws IOException {
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
           public CreateCommitRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateCommitRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateCommitRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCommitRequest
   * @throws IOException if the JSON string is invalid with respect to CreateCommitRequest
   */
  public static CreateCommitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCommitRequest.class);
  }

  /**
   * Convert an instance of CreateCommitRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

