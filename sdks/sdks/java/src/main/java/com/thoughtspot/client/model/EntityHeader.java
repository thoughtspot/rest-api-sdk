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
import java.util.Arrays;
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
 * EntityHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EntityHeader implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DATA_SOURCE_NAME = "data_source_name";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAME)
  @javax.annotation.Nullable
  private String dataSourceName;

  public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER = "data_source_identifier";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER)
  @javax.annotation.Nullable
  private String dataSourceIdentifier;

  public EntityHeader() {
  }

  public EntityHeader description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the data source.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public EntityHeader dataSourceName(@javax.annotation.Nullable String dataSourceName) {
    this.dataSourceName = dataSourceName;
    return this;
  }

  /**
   * Display name of the data source.
   * @return dataSourceName
   */
  @javax.annotation.Nullable
  public String getDataSourceName() {
    return dataSourceName;
  }

  public void setDataSourceName(@javax.annotation.Nullable String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }


  public EntityHeader dataSourceIdentifier(@javax.annotation.Nullable String dataSourceIdentifier) {
    this.dataSourceIdentifier = dataSourceIdentifier;
    return this;
  }

  /**
   * Unique identifier of the data source.
   * @return dataSourceIdentifier
   */
  @javax.annotation.Nullable
  public String getDataSourceIdentifier() {
    return dataSourceIdentifier;
  }

  public void setDataSourceIdentifier(@javax.annotation.Nullable String dataSourceIdentifier) {
    this.dataSourceIdentifier = dataSourceIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityHeader entityHeader = (EntityHeader) o;
    return Objects.equals(this.description, entityHeader.description) &&
        Objects.equals(this.dataSourceName, entityHeader.dataSourceName) &&
        Objects.equals(this.dataSourceIdentifier, entityHeader.dataSourceIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dataSourceName, dataSourceIdentifier);
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
    sb.append("class EntityHeader {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
    sb.append("    dataSourceIdentifier: ").append(toIndentedString(dataSourceIdentifier)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("data_source_name");
    openapiFields.add("data_source_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EntityHeader
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EntityHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntityHeader is not found in the empty JSON string", EntityHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EntityHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntityHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("data_source_name") != null && !jsonObj.get("data_source_name").isJsonNull()) && !jsonObj.get("data_source_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_source_name").toString()));
      }
      if ((jsonObj.get("data_source_identifier") != null && !jsonObj.get("data_source_identifier").isJsonNull()) && !jsonObj.get("data_source_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_source_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntityHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntityHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntityHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntityHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<EntityHeader>() {
           @Override
           public void write(JsonWriter out, EntityHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntityHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EntityHeader given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EntityHeader
   * @throws IOException if the JSON string is invalid with respect to EntityHeader
   */
  public static EntityHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntityHeader.class);
  }

  /**
   * Convert an instance of EntityHeader to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

