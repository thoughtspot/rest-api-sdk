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
 * UpdateVariableRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UpdateVariableRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  /**
   * Operation to perform on the values.
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ADD("ADD"),
    
    REMOVE("REMOVE"),
    
    REPLACE("REPLACE");

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
  @javax.annotation.Nullable
  private OperationEnum operation = OperationEnum.REPLACE;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private List<InputVariableValue> values;

  public UpdateVariableRequest() {
  }

  public UpdateVariableRequest name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * New name of the variable if we want to rename.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public UpdateVariableRequest operation(@javax.annotation.Nullable OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Operation to perform on the values.
   * @return operation
   */
  @javax.annotation.Nullable
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
    this.operation = operation;
  }


  public UpdateVariableRequest values(@javax.annotation.Nullable List<InputVariableValue> values) {
    this.values = values;
    return this;
  }

  public UpdateVariableRequest addValuesItem(InputVariableValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values of variable to be updated.
   * @return values
   */
  @javax.annotation.Nullable
  public List<InputVariableValue> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nullable List<InputVariableValue> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVariableRequest updateVariableRequest = (UpdateVariableRequest) o;
    return Objects.equals(this.name, updateVariableRequest.name) &&
        Objects.equals(this.operation, updateVariableRequest.operation) &&
        Objects.equals(this.values, updateVariableRequest.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVariableRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateVariableRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateVariableRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVariableRequest is not found in the empty JSON string", UpdateVariableRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateVariableRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVariableRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        OperationEnum.validateJsonElement(jsonObj.get("operation"));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            InputVariableValue.validateJsonElement(jsonArrayvalues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVariableRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVariableRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVariableRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVariableRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVariableRequest>() {
           @Override
           public void write(JsonWriter out, UpdateVariableRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVariableRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateVariableRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateVariableRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateVariableRequest
   */
  public static UpdateVariableRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVariableRequest.class);
  }

  /**
   * Convert an instance of UpdateVariableRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

