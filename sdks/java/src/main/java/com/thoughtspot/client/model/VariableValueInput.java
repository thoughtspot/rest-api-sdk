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
import com.thoughtspot.client.model.InputVariableValue;
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
 * Input for variable value update
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VariableValueInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VARIABLE_IDENTIFIER = "variable_identifier";
  @SerializedName(SERIALIZED_NAME_VARIABLE_IDENTIFIER)
  @javax.annotation.Nonnull
  private String variableIdentifier;

  public static final String SERIALIZED_NAME_VARIABLE_VALUES = "variable_values";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUES)
  @javax.annotation.Nonnull
  private List<InputVariableValue> variableValues;

  public VariableValueInput() {
  }

  public VariableValueInput variableIdentifier(@javax.annotation.Nonnull String variableIdentifier) {
    this.variableIdentifier = variableIdentifier;
    return this;
  }

  /**
   * ID or Name of the variable
   * @return variableIdentifier
   */
  @javax.annotation.Nonnull
  public String getVariableIdentifier() {
    return variableIdentifier;
  }

  public void setVariableIdentifier(@javax.annotation.Nonnull String variableIdentifier) {
    this.variableIdentifier = variableIdentifier;
  }


  public VariableValueInput variableValues(@javax.annotation.Nonnull List<InputVariableValue> variableValues) {
    this.variableValues = variableValues;
    return this;
  }

  public VariableValueInput addVariableValuesItem(InputVariableValue variableValuesItem) {
    if (this.variableValues == null) {
      this.variableValues = new ArrayList<>();
    }
    this.variableValues.add(variableValuesItem);
    return this;
  }

  /**
   * Values of the variable
   * @return variableValues
   */
  @javax.annotation.Nonnull
  public List<InputVariableValue> getVariableValues() {
    return variableValues;
  }

  public void setVariableValues(@javax.annotation.Nonnull List<InputVariableValue> variableValues) {
    this.variableValues = variableValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableValueInput variableValueInput = (VariableValueInput) o;
    return Objects.equals(this.variableIdentifier, variableValueInput.variableIdentifier) &&
        Objects.equals(this.variableValues, variableValueInput.variableValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableIdentifier, variableValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableValueInput {\n");
    sb.append("    variableIdentifier: ").append(toIndentedString(variableIdentifier)).append("\n");
    sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
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
    openapiFields.add("variable_identifier");
    openapiFields.add("variable_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("variable_identifier");
    openapiRequiredFields.add("variable_values");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VariableValueInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VariableValueInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariableValueInput is not found in the empty JSON string", VariableValueInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VariableValueInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VariableValueInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VariableValueInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("variable_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_identifier").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("variable_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_values` to be an array in the JSON string but got `%s`", jsonObj.get("variable_values").toString()));
      }

      JsonArray jsonArrayvariableValues = jsonObj.getAsJsonArray("variable_values");
      // validate the required field `variable_values` (array)
      for (int i = 0; i < jsonArrayvariableValues.size(); i++) {
        InputVariableValue.validateJsonElement(jsonArrayvariableValues.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariableValueInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariableValueInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariableValueInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariableValueInput.class));

       return (TypeAdapter<T>) new TypeAdapter<VariableValueInput>() {
           @Override
           public void write(JsonWriter out, VariableValueInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VariableValueInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VariableValueInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VariableValueInput
   * @throws IOException if the JSON string is invalid with respect to VariableValueInput
   */
  public static VariableValueInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariableValueInput.class);
  }

  /**
   * Convert an instance of VariableValueInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

