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
 * Input for variable value update in batch operations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VariableUpdateAssignmentInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VARIABLE_IDENTIFIER = "variable_identifier";
  @SerializedName(SERIALIZED_NAME_VARIABLE_IDENTIFIER)
  @javax.annotation.Nonnull
  private String variableIdentifier;

  public static final String SERIALIZED_NAME_VARIABLE_VALUES = "variable_values";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUES)
  @javax.annotation.Nonnull
  private List<String> variableValues;

  /**
   * Operation to perform
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ADD("ADD"),
    
    REMOVE("REMOVE"),
    
    REPLACE("REPLACE"),
    
    RESET("RESET");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  @javax.annotation.Nonnull
  private OperationEnum operation;

  public VariableUpdateAssignmentInput() {
  }

  public VariableUpdateAssignmentInput variableIdentifier(@javax.annotation.Nonnull String variableIdentifier) {
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


  public VariableUpdateAssignmentInput variableValues(@javax.annotation.Nonnull List<String> variableValues) {
    this.variableValues = variableValues;
    return this;
  }

  public VariableUpdateAssignmentInput addVariableValuesItem(String variableValuesItem) {
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
  public List<String> getVariableValues() {
    return variableValues;
  }

  public void setVariableValues(@javax.annotation.Nonnull List<String> variableValues) {
    this.variableValues = variableValues;
  }


  public VariableUpdateAssignmentInput operation(@javax.annotation.Nonnull OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Operation to perform
   * @return operation
   */
  @javax.annotation.Nonnull
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(@javax.annotation.Nonnull OperationEnum operation) {
    this.operation = operation;
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
   * @return the VariableUpdateAssignmentInput instance itself
   */
  public VariableUpdateAssignmentInput putAdditionalProperty(String key, Object value) {
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
    VariableUpdateAssignmentInput variableUpdateAssignmentInput = (VariableUpdateAssignmentInput) o;
    return Objects.equals(this.variableIdentifier, variableUpdateAssignmentInput.variableIdentifier) &&
        Objects.equals(this.variableValues, variableUpdateAssignmentInput.variableValues) &&
        Objects.equals(this.operation, variableUpdateAssignmentInput.operation)&&
        Objects.equals(this.additionalProperties, variableUpdateAssignmentInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableIdentifier, variableValues, operation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableUpdateAssignmentInput {\n");
    sb.append("    variableIdentifier: ").append(toIndentedString(variableIdentifier)).append("\n");
    sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("variable_identifier");
    openapiFields.add("variable_values");
    openapiFields.add("operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("variable_identifier");
    openapiRequiredFields.add("variable_values");
    openapiRequiredFields.add("operation");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VariableUpdateAssignmentInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VariableUpdateAssignmentInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariableUpdateAssignmentInput is not found in the empty JSON string", VariableUpdateAssignmentInput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VariableUpdateAssignmentInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("variable_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_identifier").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("variable_values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("variable_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_values` to be an array in the JSON string but got `%s`", jsonObj.get("variable_values").toString()));
      }
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the required field `operation`
      OperationEnum.validateJsonElement(jsonObj.get("operation"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariableUpdateAssignmentInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariableUpdateAssignmentInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariableUpdateAssignmentInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariableUpdateAssignmentInput.class));

       return (TypeAdapter<T>) new TypeAdapter<VariableUpdateAssignmentInput>() {
           @Override
           public void write(JsonWriter out, VariableUpdateAssignmentInput value) throws IOException {
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
           public VariableUpdateAssignmentInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VariableUpdateAssignmentInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VariableUpdateAssignmentInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VariableUpdateAssignmentInput
   * @throws IOException if the JSON string is invalid with respect to VariableUpdateAssignmentInput
   */
  public static VariableUpdateAssignmentInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariableUpdateAssignmentInput.class);
  }

  /**
   * Convert an instance of VariableUpdateAssignmentInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

