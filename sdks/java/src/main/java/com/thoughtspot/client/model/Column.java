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
 * Column
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class Column implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  @javax.annotation.Nonnull
  private String dataType;

  public static final String SERIALIZED_NAME_IS_AGGREGATE = "is_aggregate";
  @SerializedName(SERIALIZED_NAME_IS_AGGREGATE)
  @javax.annotation.Nullable
  private String isAggregate;

  public static final String SERIALIZED_NAME_CAN_IMPORT = "can_import";
  @SerializedName(SERIALIZED_NAME_CAN_IMPORT)
  @javax.annotation.Nullable
  private Boolean canImport;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  @javax.annotation.Nullable
  private Boolean selected;

  public static final String SERIALIZED_NAME_IS_LINKED_ACTIVE = "is_linked_active";
  @SerializedName(SERIALIZED_NAME_IS_LINKED_ACTIVE)
  @javax.annotation.Nullable
  private Boolean isLinkedActive;

  public Column() {
  }

  public Column name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the column
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Column dataType(@javax.annotation.Nonnull String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Data type of the column
   * @return dataType
   */
  @javax.annotation.Nonnull
  public String getDataType() {
    return dataType;
  }

  public void setDataType(@javax.annotation.Nonnull String dataType) {
    this.dataType = dataType;
  }


  public Column isAggregate(@javax.annotation.Nullable String isAggregate) {
    this.isAggregate = isAggregate;
    return this;
  }

  /**
   * Determines if the column schema is an aggregate
   * @return isAggregate
   */
  @javax.annotation.Nullable
  public String getIsAggregate() {
    return isAggregate;
  }

  public void setIsAggregate(@javax.annotation.Nullable String isAggregate) {
    this.isAggregate = isAggregate;
  }


  public Column canImport(@javax.annotation.Nullable Boolean canImport) {
    this.canImport = canImport;
    return this;
  }

  /**
   * Determines if the column schema can be imported
   * @return canImport
   */
  @javax.annotation.Nullable
  public Boolean getCanImport() {
    return canImport;
  }

  public void setCanImport(@javax.annotation.Nullable Boolean canImport) {
    this.canImport = canImport;
  }


  public Column selected(@javax.annotation.Nullable Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Determines if the table is selected
   * @return selected
   */
  @javax.annotation.Nullable
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(@javax.annotation.Nullable Boolean selected) {
    this.selected = selected;
  }


  public Column isLinkedActive(@javax.annotation.Nullable Boolean isLinkedActive) {
    this.isLinkedActive = isLinkedActive;
    return this;
  }

  /**
   * Determines if the table is linked
   * @return isLinkedActive
   */
  @javax.annotation.Nullable
  public Boolean getIsLinkedActive() {
    return isLinkedActive;
  }

  public void setIsLinkedActive(@javax.annotation.Nullable Boolean isLinkedActive) {
    this.isLinkedActive = isLinkedActive;
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
   * @return the Column instance itself
   */
  public Column putAdditionalProperty(String key, Object value) {
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
    Column column = (Column) o;
    return Objects.equals(this.name, column.name) &&
        Objects.equals(this.dataType, column.dataType) &&
        Objects.equals(this.isAggregate, column.isAggregate) &&
        Objects.equals(this.canImport, column.canImport) &&
        Objects.equals(this.selected, column.selected) &&
        Objects.equals(this.isLinkedActive, column.isLinkedActive)&&
        Objects.equals(this.additionalProperties, column.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataType, isAggregate, canImport, selected, isLinkedActive, additionalProperties);
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Column
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Column.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Column is not found in the empty JSON string", Column.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Column.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
           public Column read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Column instance = thisAdapter.fromJsonTree(jsonObj);
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

