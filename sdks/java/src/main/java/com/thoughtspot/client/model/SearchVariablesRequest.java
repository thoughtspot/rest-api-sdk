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
import com.thoughtspot.client.model.ValueScopeInput;
import com.thoughtspot.client.model.VariableDetailInput;
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
 * SearchVariablesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SearchVariablesRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VARIABLE_DETAILS = "variable_details";
  @SerializedName(SERIALIZED_NAME_VARIABLE_DETAILS)
  @javax.annotation.Nullable
  private List<VariableDetailInput> variableDetails;

  public static final String SERIALIZED_NAME_VALUE_SCOPE = "value_scope";
  @SerializedName(SERIALIZED_NAME_VALUE_SCOPE)
  @javax.annotation.Nullable
  private List<ValueScopeInput> valueScope;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  @javax.annotation.Nullable
  private Integer recordOffset = 0;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  @javax.annotation.Nullable
  private Integer recordSize = 10;

  /**
   * Format in which we want the output
   */
  @JsonAdapter(OutputFormatEnum.Adapter.class)
  public enum OutputFormatEnum {
    METADATA_ONLY("METADATA_ONLY"),
    
    METADATA_AND_VALUES("METADATA_AND_VALUES");

    private String value;

    OutputFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutputFormatEnum fromValue(String value) {
      for (OutputFormatEnum b : OutputFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutputFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutputFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutputFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutputFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OutputFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output_format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nullable
  private OutputFormatEnum outputFormat = OutputFormatEnum.METADATA_ONLY;

  public SearchVariablesRequest() {
  }

  public SearchVariablesRequest variableDetails(@javax.annotation.Nullable List<VariableDetailInput> variableDetails) {
    this.variableDetails = variableDetails;
    return this;
  }

  public SearchVariablesRequest addVariableDetailsItem(VariableDetailInput variableDetailsItem) {
    if (this.variableDetails == null) {
      this.variableDetails = new ArrayList<>();
    }
    this.variableDetails.add(variableDetailsItem);
    return this;
  }

  /**
   * Variable details
   * @return variableDetails
   */
  @javax.annotation.Nullable
  public List<VariableDetailInput> getVariableDetails() {
    return variableDetails;
  }

  public void setVariableDetails(@javax.annotation.Nullable List<VariableDetailInput> variableDetails) {
    this.variableDetails = variableDetails;
  }


  public SearchVariablesRequest valueScope(@javax.annotation.Nullable List<ValueScopeInput> valueScope) {
    this.valueScope = valueScope;
    return this;
  }

  public SearchVariablesRequest addValueScopeItem(ValueScopeInput valueScopeItem) {
    if (this.valueScope == null) {
      this.valueScope = new ArrayList<>();
    }
    this.valueScope.add(valueScopeItem);
    return this;
  }

  /**
   * Array of scope filters
   * @return valueScope
   */
  @javax.annotation.Nullable
  public List<ValueScopeInput> getValueScope() {
    return valueScope;
  }

  public void setValueScope(@javax.annotation.Nullable List<ValueScopeInput> valueScope) {
    this.valueScope = valueScope;
  }


  public SearchVariablesRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
    return this;
  }

  /**
   * The starting record number from where the records should be included
   * @return recordOffset
   */
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }

  public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public SearchVariablesRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
    return this;
  }

  /**
   * The number of records that should be included
   * @return recordSize
   */
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }

  public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
  }


  public SearchVariablesRequest outputFormat(@javax.annotation.Nullable OutputFormatEnum outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Format in which we want the output
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public OutputFormatEnum getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(@javax.annotation.Nullable OutputFormatEnum outputFormat) {
    this.outputFormat = outputFormat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchVariablesRequest searchVariablesRequest = (SearchVariablesRequest) o;
    return Objects.equals(this.variableDetails, searchVariablesRequest.variableDetails) &&
        Objects.equals(this.valueScope, searchVariablesRequest.valueScope) &&
        Objects.equals(this.recordOffset, searchVariablesRequest.recordOffset) &&
        Objects.equals(this.recordSize, searchVariablesRequest.recordSize) &&
        Objects.equals(this.outputFormat, searchVariablesRequest.outputFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableDetails, valueScope, recordOffset, recordSize, outputFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchVariablesRequest {\n");
    sb.append("    variableDetails: ").append(toIndentedString(variableDetails)).append("\n");
    sb.append("    valueScope: ").append(toIndentedString(valueScope)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
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
    openapiFields.add("variable_details");
    openapiFields.add("value_scope");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("output_format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchVariablesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchVariablesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchVariablesRequest is not found in the empty JSON string", SearchVariablesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchVariablesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchVariablesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("variable_details") != null && !jsonObj.get("variable_details").isJsonNull()) {
        JsonArray jsonArrayvariableDetails = jsonObj.getAsJsonArray("variable_details");
        if (jsonArrayvariableDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variable_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variable_details` to be an array in the JSON string but got `%s`", jsonObj.get("variable_details").toString()));
          }

          // validate the optional field `variable_details` (array)
          for (int i = 0; i < jsonArrayvariableDetails.size(); i++) {
            VariableDetailInput.validateJsonElement(jsonArrayvariableDetails.get(i));
          };
        }
      }
      if (jsonObj.get("value_scope") != null && !jsonObj.get("value_scope").isJsonNull()) {
        JsonArray jsonArrayvalueScope = jsonObj.getAsJsonArray("value_scope");
        if (jsonArrayvalueScope != null) {
          // ensure the json data is an array
          if (!jsonObj.get("value_scope").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `value_scope` to be an array in the JSON string but got `%s`", jsonObj.get("value_scope").toString()));
          }

          // validate the optional field `value_scope` (array)
          for (int i = 0; i < jsonArrayvalueScope.size(); i++) {
            ValueScopeInput.validateJsonElement(jsonArrayvalueScope.get(i));
          };
        }
      }
      if ((jsonObj.get("output_format") != null && !jsonObj.get("output_format").isJsonNull()) && !jsonObj.get("output_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output_format").toString()));
      }
      // validate the optional field `output_format`
      if (jsonObj.get("output_format") != null && !jsonObj.get("output_format").isJsonNull()) {
        OutputFormatEnum.validateJsonElement(jsonObj.get("output_format"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchVariablesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchVariablesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchVariablesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchVariablesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchVariablesRequest>() {
           @Override
           public void write(JsonWriter out, SearchVariablesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchVariablesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchVariablesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchVariablesRequest
   * @throws IOException if the JSON string is invalid with respect to SearchVariablesRequest
   */
  public static SearchVariablesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchVariablesRequest.class);
  }

  /**
   * Convert an instance of SearchVariablesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

