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
import com.thoughtspot.client.model.InputColumnInfo;
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
 * InputTableResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class InputTableResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INPUT_TABLE_ID = "input_table_id";
  @SerializedName(SERIALIZED_NAME_INPUT_TABLE_ID)
  @javax.annotation.Nullable
  private String inputTableId;

  public static final String SERIALIZED_NAME_INPUT_COLUMNS = "input_columns";
  @SerializedName(SERIALIZED_NAME_INPUT_COLUMNS)
  @javax.annotation.Nullable
  private List<InputColumnInfo> inputColumns;

  public static final String SERIALIZED_NAME_MESSAGE_INFO = "message_info";
  @SerializedName(SERIALIZED_NAME_MESSAGE_INFO)
  @javax.annotation.Nullable
  private String messageInfo;

  public InputTableResponse() {
  }

  public InputTableResponse inputTableId(@javax.annotation.Nullable String inputTableId) {
    this.inputTableId = inputTableId;
    return this;
  }

  /**
   * Unique ID of the newly created input table. Pass it as the input_table_identifier path parameter of the other input-table operations.
   * @return inputTableId
   */
  @javax.annotation.Nullable
  public String getInputTableId() {
    return inputTableId;
  }

  public void setInputTableId(@javax.annotation.Nullable String inputTableId) {
    this.inputTableId = inputTableId;
  }


  public InputTableResponse inputColumns(@javax.annotation.Nullable List<InputColumnInfo> inputColumns) {
    this.inputColumns = inputColumns;
    return this;
  }

  public InputTableResponse addInputColumnsItem(InputColumnInfo inputColumnsItem) {
    if (this.inputColumns == null) {
      this.inputColumns = new ArrayList<>();
    }
    this.inputColumns.add(inputColumnsItem);
    return this;
  }

  /**
   * Columns of the newly created input table, each with its name and unique ID. Use these IDs to reference specific columns in follow-up calls (for example, the column identifiers written by updateInputTable). Returned so callers do not need a separate lookup to resolve a column name to its ID.
   * @return inputColumns
   */
  @javax.annotation.Nullable
  public List<InputColumnInfo> getInputColumns() {
    return inputColumns;
  }

  public void setInputColumns(@javax.annotation.Nullable List<InputColumnInfo> inputColumns) {
    this.inputColumns = inputColumns;
  }


  public InputTableResponse messageInfo(@javax.annotation.Nullable String messageInfo) {
    this.messageInfo = messageInfo;
    return this;
  }

  /**
   * Note set when a referenced column had to be renamed to keep the input table&#39;s column names unique — a model column name that occurs in more than one base table is prefixed with its base table name. Absent when no column was renamed. Read it to learn the final name of a renamed column, or read the name off input_columns.
   * @return messageInfo
   */
  @javax.annotation.Nullable
  public String getMessageInfo() {
    return messageInfo;
  }

  public void setMessageInfo(@javax.annotation.Nullable String messageInfo) {
    this.messageInfo = messageInfo;
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
   * @return the InputTableResponse instance itself
   */
  public InputTableResponse putAdditionalProperty(String key, Object value) {
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
    InputTableResponse inputTableResponse = (InputTableResponse) o;
    return Objects.equals(this.inputTableId, inputTableResponse.inputTableId) &&
        Objects.equals(this.inputColumns, inputTableResponse.inputColumns) &&
        Objects.equals(this.messageInfo, inputTableResponse.messageInfo)&&
        Objects.equals(this.additionalProperties, inputTableResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputTableId, inputColumns, messageInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputTableResponse {\n");
    sb.append("    inputTableId: ").append(toIndentedString(inputTableId)).append("\n");
    sb.append("    inputColumns: ").append(toIndentedString(inputColumns)).append("\n");
    sb.append("    messageInfo: ").append(toIndentedString(messageInfo)).append("\n");
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
    openapiFields.add("input_table_id");
    openapiFields.add("input_columns");
    openapiFields.add("message_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InputTableResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InputTableResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputTableResponse is not found in the empty JSON string", InputTableResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("input_table_id") != null && !jsonObj.get("input_table_id").isJsonNull()) && !jsonObj.get("input_table_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_table_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_table_id").toString()));
      }
      if (jsonObj.get("input_columns") != null && !jsonObj.get("input_columns").isJsonNull()) {
        JsonArray jsonArrayinputColumns = jsonObj.getAsJsonArray("input_columns");
        if (jsonArrayinputColumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("input_columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `input_columns` to be an array in the JSON string but got `%s`", jsonObj.get("input_columns").toString()));
          }

          // validate the optional field `input_columns` (array)
          for (int i = 0; i < jsonArrayinputColumns.size(); i++) {
            InputColumnInfo.validateJsonElement(jsonArrayinputColumns.get(i));
          };
        }
      }
      if ((jsonObj.get("message_info") != null && !jsonObj.get("message_info").isJsonNull()) && !jsonObj.get("message_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_info").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputTableResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputTableResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputTableResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputTableResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InputTableResponse>() {
           @Override
           public void write(JsonWriter out, InputTableResponse value) throws IOException {
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
           public InputTableResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InputTableResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of InputTableResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InputTableResponse
   * @throws IOException if the JSON string is invalid with respect to InputTableResponse
   */
  public static InputTableResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputTableResponse.class);
  }

  /**
   * Convert an instance of InputTableResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

