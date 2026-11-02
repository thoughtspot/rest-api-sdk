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
import com.thoughtspot.client.model.InputColumnSchemaInput;
import com.thoughtspot.client.model.ReferencedColumnTimeDimension;
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
 * Definition of the input table schema.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class InputTableDefinitionInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NEW_COLUMNS = "new_columns";
  @SerializedName(SERIALIZED_NAME_NEW_COLUMNS)
  @javax.annotation.Nonnull
  private List<InputColumnSchemaInput> newColumns;

  public static final String SERIALIZED_NAME_REFERENCED_COLUMNS = "referenced_columns";
  @SerializedName(SERIALIZED_NAME_REFERENCED_COLUMNS)
  @javax.annotation.Nonnull
  private List<String> referencedColumns;

  public static final String SERIALIZED_NAME_REFERENCED_COLUMN_TIME_DIMENSIONS = "referenced_column_time_dimensions";
  @SerializedName(SERIALIZED_NAME_REFERENCED_COLUMN_TIME_DIMENSIONS)
  @javax.annotation.Nullable
  private List<ReferencedColumnTimeDimension> referencedColumnTimeDimensions;

  public InputTableDefinitionInput() {
  }

  public InputTableDefinitionInput newColumns(@javax.annotation.Nonnull List<InputColumnSchemaInput> newColumns) {
    this.newColumns = newColumns;
    return this;
  }

  public InputTableDefinitionInput addNewColumnsItem(InputColumnSchemaInput newColumnsItem) {
    if (this.newColumns == null) {
      this.newColumns = new ArrayList<>();
    }
    this.newColumns.add(newColumnsItem);
    return this;
  }

  /**
   * New input-only columns to create in the table.
   * @return newColumns
   */
  @javax.annotation.Nonnull
  public List<InputColumnSchemaInput> getNewColumns() {
    return newColumns;
  }

  public void setNewColumns(@javax.annotation.Nonnull List<InputColumnSchemaInput> newColumns) {
    this.newColumns = newColumns;
  }


  public InputTableDefinitionInput referencedColumns(@javax.annotation.Nonnull List<String> referencedColumns) {
    this.referencedColumns = referencedColumns;
    return this;
  }

  public InputTableDefinitionInput addReferencedColumnsItem(String referencedColumnsItem) {
    if (this.referencedColumns == null) {
      this.referencedColumns = new ArrayList<>();
    }
    this.referencedColumns.add(referencedColumnsItem);
    return this;
  }

  /**
   * Names of the columns on the linked model to include in the table, as they appear on the model. These become the input table&#39;s key columns: they are what the input table is joined to the model on, and what rows are matched on by updateInputTable. At least one is required — an empty array is rejected. A name must match exactly one visible model column; a name matching none, or more than one, is rejected. Each must also resolve to exactly one physical base column, so a formula, cohort, or constant model column cannot be referenced.
   * @return referencedColumns
   */
  @javax.annotation.Nonnull
  public List<String> getReferencedColumns() {
    return referencedColumns;
  }

  public void setReferencedColumns(@javax.annotation.Nonnull List<String> referencedColumns) {
    this.referencedColumns = referencedColumns;
  }


  public InputTableDefinitionInput referencedColumnTimeDimensions(@javax.annotation.Nullable List<ReferencedColumnTimeDimension> referencedColumnTimeDimensions) {
    this.referencedColumnTimeDimensions = referencedColumnTimeDimensions;
    return this;
  }

  public InputTableDefinitionInput addReferencedColumnTimeDimensionsItem(ReferencedColumnTimeDimension referencedColumnTimeDimensionsItem) {
    if (this.referencedColumnTimeDimensions == null) {
      this.referencedColumnTimeDimensions = new ArrayList<>();
    }
    this.referencedColumnTimeDimensions.add(referencedColumnTimeDimensionsItem);
    return this;
  }

  /**
   * Optional per-column time dimension to persist at creation. Provide one entry per referenced date column that should open — and stay locked — at a specific grain. Columns without an entry apply no bucketing (detailed). Applies to referenced model columns only; a column created through new_columns always starts detailed.
   * @return referencedColumnTimeDimensions
   */
  @javax.annotation.Nullable
  public List<ReferencedColumnTimeDimension> getReferencedColumnTimeDimensions() {
    return referencedColumnTimeDimensions;
  }

  public void setReferencedColumnTimeDimensions(@javax.annotation.Nullable List<ReferencedColumnTimeDimension> referencedColumnTimeDimensions) {
    this.referencedColumnTimeDimensions = referencedColumnTimeDimensions;
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
   * @return the InputTableDefinitionInput instance itself
   */
  public InputTableDefinitionInput putAdditionalProperty(String key, Object value) {
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
    InputTableDefinitionInput inputTableDefinitionInput = (InputTableDefinitionInput) o;
    return Objects.equals(this.newColumns, inputTableDefinitionInput.newColumns) &&
        Objects.equals(this.referencedColumns, inputTableDefinitionInput.referencedColumns) &&
        Objects.equals(this.referencedColumnTimeDimensions, inputTableDefinitionInput.referencedColumnTimeDimensions)&&
        Objects.equals(this.additionalProperties, inputTableDefinitionInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newColumns, referencedColumns, referencedColumnTimeDimensions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputTableDefinitionInput {\n");
    sb.append("    newColumns: ").append(toIndentedString(newColumns)).append("\n");
    sb.append("    referencedColumns: ").append(toIndentedString(referencedColumns)).append("\n");
    sb.append("    referencedColumnTimeDimensions: ").append(toIndentedString(referencedColumnTimeDimensions)).append("\n");
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
    openapiFields.add("new_columns");
    openapiFields.add("referenced_columns");
    openapiFields.add("referenced_column_time_dimensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("new_columns");
    openapiRequiredFields.add("referenced_columns");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InputTableDefinitionInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InputTableDefinitionInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputTableDefinitionInput is not found in the empty JSON string", InputTableDefinitionInput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InputTableDefinitionInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("new_columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_columns` to be an array in the JSON string but got `%s`", jsonObj.get("new_columns").toString()));
      }

      JsonArray jsonArraynewColumns = jsonObj.getAsJsonArray("new_columns");
      // validate the required field `new_columns` (array)
      for (int i = 0; i < jsonArraynewColumns.size(); i++) {
        InputColumnSchemaInput.validateJsonElement(jsonArraynewColumns.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("referenced_columns") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("referenced_columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenced_columns` to be an array in the JSON string but got `%s`", jsonObj.get("referenced_columns").toString()));
      }
      if (jsonObj.get("referenced_column_time_dimensions") != null && !jsonObj.get("referenced_column_time_dimensions").isJsonNull()) {
        JsonArray jsonArrayreferencedColumnTimeDimensions = jsonObj.getAsJsonArray("referenced_column_time_dimensions");
        if (jsonArrayreferencedColumnTimeDimensions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("referenced_column_time_dimensions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `referenced_column_time_dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("referenced_column_time_dimensions").toString()));
          }

          // validate the optional field `referenced_column_time_dimensions` (array)
          for (int i = 0; i < jsonArrayreferencedColumnTimeDimensions.size(); i++) {
            ReferencedColumnTimeDimension.validateJsonElement(jsonArrayreferencedColumnTimeDimensions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputTableDefinitionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputTableDefinitionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputTableDefinitionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputTableDefinitionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<InputTableDefinitionInput>() {
           @Override
           public void write(JsonWriter out, InputTableDefinitionInput value) throws IOException {
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
           public InputTableDefinitionInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InputTableDefinitionInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of InputTableDefinitionInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InputTableDefinitionInput
   * @throws IOException if the JSON string is invalid with respect to InputTableDefinitionInput
   */
  public static InputTableDefinitionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputTableDefinitionInput.class);
  }

  /**
   * Convert an instance of InputTableDefinitionInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

