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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Column
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T23:43:05.069148+05:30[Asia/Kolkata]")
public class Column {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_IS_AGGREGATE = "is_aggregate";
  @SerializedName(SERIALIZED_NAME_IS_AGGREGATE)
  private String isAggregate;

  public static final String SERIALIZED_NAME_CAN_IMPORT = "can_import";
  @SerializedName(SERIALIZED_NAME_CAN_IMPORT)
  private Boolean canImport;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;

  public static final String SERIALIZED_NAME_IS_LINKED_ACTIVE = "is_linked_active";
  @SerializedName(SERIALIZED_NAME_IS_LINKED_ACTIVE)
  private Boolean isLinkedActive;

  public Column() {
  }

  public Column name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the column
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Column dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Data type of the column
   * @return dataType
  **/
  @javax.annotation.Nonnull
  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public Column isAggregate(String isAggregate) {
    
    this.isAggregate = isAggregate;
    return this;
  }

   /**
   * Determines if the column schema is an aggregate
   * @return isAggregate
  **/
  @javax.annotation.Nullable
  public String getIsAggregate() {
    return isAggregate;
  }


  public void setIsAggregate(String isAggregate) {
    this.isAggregate = isAggregate;
  }


  public Column canImport(Boolean canImport) {
    
    this.canImport = canImport;
    return this;
  }

   /**
   * Determines if the column schema can be imported
   * @return canImport
  **/
  @javax.annotation.Nullable
  public Boolean getCanImport() {
    return canImport;
  }


  public void setCanImport(Boolean canImport) {
    this.canImport = canImport;
  }


  public Column selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * Determines if the table is selected
   * @return selected
  **/
  @javax.annotation.Nullable
  public Boolean getSelected() {
    return selected;
  }


  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  public Column isLinkedActive(Boolean isLinkedActive) {
    
    this.isLinkedActive = isLinkedActive;
    return this;
  }

   /**
   * Determines if the table is linked
   * @return isLinkedActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsLinkedActive() {
    return isLinkedActive;
  }


  public void setIsLinkedActive(Boolean isLinkedActive) {
    this.isLinkedActive = isLinkedActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Column column = (Column) o;
    return Objects.equals(this.name, column.name) &&
        Objects.equals(this.dataType, column.dataType) &&
        Objects.equals(this.isAggregate, column.isAggregate) &&
        Objects.equals(this.canImport, column.canImport) &&
        Objects.equals(this.selected, column.selected) &&
        Objects.equals(this.isLinkedActive, column.isLinkedActive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataType, isAggregate, canImport, selected, isLinkedActive);
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
    sb.append("class Column {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    isAggregate: ").append(toIndentedString(isAggregate)).append("\n");
    sb.append("    canImport: ").append(toIndentedString(canImport)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    isLinkedActive: ").append(toIndentedString(isLinkedActive)).append("\n");
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
    openapiFields.add("data_type");
    openapiFields.add("is_aggregate");
    openapiFields.add("can_import");
    openapiFields.add("selected");
    openapiFields.add("is_linked_active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("data_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Column
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Column.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Column is not found in the empty JSON string", Column.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Column.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Column` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Column.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if ((jsonObj.get("is_aggregate") != null && !jsonObj.get("is_aggregate").isJsonNull()) && !jsonObj.get("is_aggregate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_aggregate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_aggregate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Column.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Column' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Column> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Column.class));

       return (TypeAdapter<T>) new TypeAdapter<Column>() {
           @Override
           public void write(JsonWriter out, Column value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Column read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Column given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Column
  * @throws IOException if the JSON string is invalid with respect to Column
  */
  public static Column fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Column.class);
  }

 /**
  * Convert an instance of Column to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

