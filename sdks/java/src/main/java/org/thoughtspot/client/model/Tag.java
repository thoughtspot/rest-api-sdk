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
 * Tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T10:47:55.743445Z[Etc/UTC]")
public class Tag {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private Boolean external;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private Boolean deprecated;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS = "modification_time_in_millis";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
  private Float modificationTimeInMillis;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_MODIFIER_ID = "modifier_id";
  @SerializedName(SERIALIZED_NAME_MODIFIER_ID)
  private String modifierId;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public Tag() {
  }

  public Tag name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Tag id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Tag color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public Tag deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Tag hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public Tag external(Boolean external) {
    
    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/
  @javax.annotation.Nullable
  public Boolean getExternal() {
    return external;
  }


  public void setExternal(Boolean external) {
    this.external = external;
  }


  public Tag deprecated(Boolean deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Get deprecated
   * @return deprecated
  **/
  @javax.annotation.Nullable
  public Boolean getDeprecated() {
    return deprecated;
  }


  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public Tag creationTimeInMillis(Float creationTimeInMillis) {
    
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

   /**
   * Get creationTimeInMillis
   * @return creationTimeInMillis
  **/
  @javax.annotation.Nullable
  public Float getCreationTimeInMillis() {
    return creationTimeInMillis;
  }


  public void setCreationTimeInMillis(Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public Tag modificationTimeInMillis(Float modificationTimeInMillis) {
    
    this.modificationTimeInMillis = modificationTimeInMillis;
    return this;
  }

   /**
   * Get modificationTimeInMillis
   * @return modificationTimeInMillis
  **/
  @javax.annotation.Nullable
  public Float getModificationTimeInMillis() {
    return modificationTimeInMillis;
  }


  public void setModificationTimeInMillis(Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
  }


  public Tag authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Get authorId
   * @return authorId
  **/
  @javax.annotation.Nullable
  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public Tag modifierId(String modifierId) {
    
    this.modifierId = modifierId;
    return this;
  }

   /**
   * Get modifierId
   * @return modifierId
  **/
  @javax.annotation.Nullable
  public String getModifierId() {
    return modifierId;
  }


  public void setModifierId(String modifierId) {
    this.modifierId = modifierId;
  }


  public Tag ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.name, tag.name) &&
        Objects.equals(this.id, tag.id) &&
        Objects.equals(this.color, tag.color) &&
        Objects.equals(this.deleted, tag.deleted) &&
        Objects.equals(this.hidden, tag.hidden) &&
        Objects.equals(this.external, tag.external) &&
        Objects.equals(this.deprecated, tag.deprecated) &&
        Objects.equals(this.creationTimeInMillis, tag.creationTimeInMillis) &&
        Objects.equals(this.modificationTimeInMillis, tag.modificationTimeInMillis) &&
        Objects.equals(this.authorId, tag.authorId) &&
        Objects.equals(this.modifierId, tag.modifierId) &&
        Objects.equals(this.ownerId, tag.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, color, deleted, hidden, external, deprecated, creationTimeInMillis, modificationTimeInMillis, authorId, modifierId, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    modificationTimeInMillis: ").append(toIndentedString(modificationTimeInMillis)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("color");
    openapiFields.add("deleted");
    openapiFields.add("hidden");
    openapiFields.add("external");
    openapiFields.add("deprecated");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("modification_time_in_millis");
    openapiFields.add("author_id");
    openapiFields.add("modifier_id");
    openapiFields.add("owner_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Tag
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Tag.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tag is not found in the empty JSON string", Tag.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Tag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tag` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Tag.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull()) && !jsonObj.get("author_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_id").toString()));
      }
      if ((jsonObj.get("modifier_id") != null && !jsonObj.get("modifier_id").isJsonNull()) && !jsonObj.get("modifier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifier_id").toString()));
      }
      if ((jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonNull()) && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tag.class));

       return (TypeAdapter<T>) new TypeAdapter<Tag>() {
           @Override
           public void write(JsonWriter out, Tag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tag read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tag
  * @throws IOException if the JSON string is invalid with respect to Tag
  */
  public static Tag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tag.class);
  }

 /**
  * Convert an instance of Tag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

