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
import java.util.ArrayList;
import java.util.List;

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
 * Filter Rules to be applied on Objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class FilterRules {
  public static final String SERIALIZED_NAME_COLUMN_NAME = "column_name";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  /**
   * The operator to use for filtering. Example: EQ (equals), GT(greater than), etc.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    EQ("EQ"),
    
    NE("NE"),
    
    LT("LT"),
    
    LE("LE"),
    
    GT("GT"),
    
    GE("GE"),
    
    IN("IN"),
    
    BW("BW"),
    
    CONTAINS("CONTAINS"),
    
    BEGINS_WITH("BEGINS_WITH"),
    
    ENDS_WITH("ENDS_WITH"),
    
    BW_INC("BW_INC"),
    
    BW_INC_MIN("BW_INC_MIN"),
    
    BW_INC_MAX("BW_INC_MAX"),
    
    LIKE("LIKE"),
    
    NOT_IN("NOT_IN");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public FilterRules() {
  }

  public FilterRules columnName(String columnName) {
    
    this.columnName = columnName;
    return this;
  }

   /**
   * The name of the column to apply the filter on.
   * @return columnName
  **/
  @javax.annotation.Nonnull
  public String getColumnName() {
    return columnName;
  }


  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public FilterRules operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The operator to use for filtering. Example: EQ (equals), GT(greater than), etc.
   * @return operator
  **/
  @javax.annotation.Nonnull
  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public FilterRules values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public FilterRules addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The values to filter on. To get all records, use TS_WILDCARD_ALL as values.
   * @return values
  **/
  @javax.annotation.Nonnull
  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
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
    FilterRules filterRules = (FilterRules) o;
    return Objects.equals(this.columnName, filterRules.columnName) &&
        Objects.equals(this.operator, filterRules.operator) &&
        Objects.equals(this.values, filterRules.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterRules {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
    openapiFields.add("column_name");
    openapiFields.add("operator");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("column_name");
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilterRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilterRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterRules is not found in the empty JSON string", FilterRules.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FilterRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterRules` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilterRules.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("column_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_name").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterRules.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterRules>() {
           @Override
           public void write(JsonWriter out, FilterRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilterRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilterRules
  * @throws IOException if the JSON string is invalid with respect to FilterRules
  */
  public static FilterRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterRules.class);
  }

 /**
  * Convert an instance of FilterRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
