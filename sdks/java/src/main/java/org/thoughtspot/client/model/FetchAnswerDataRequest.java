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
 * FetchAnswerDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T10:25:25.563+05:30[Asia/Kolkata]")
public class FetchAnswerDataRequest {
  public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
  private String metadataIdentifier;

  /**
   * JSON output format. By default, the API returns full data in the JSON.
   */
  @JsonAdapter(DataFormatEnum.Adapter.class)
  public enum DataFormatEnum {
    COMPACT("COMPACT");

    private String value;

    DataFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataFormatEnum fromValue(String value) {
      for (DataFormatEnum b : DataFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_FORMAT = "data_format";
  @SerializedName(SERIALIZED_NAME_DATA_FORMAT)
  private DataFormatEnum dataFormat = DataFormatEnum.COMPACT;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  private Integer recordOffset = 0;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  private Integer recordSize = 10;

  public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";
  @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
  private Object runtimeFilter;

  public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";
  @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
  private Object runtimeSort;

  public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
  private Object runtimeParamOverride;

  public FetchAnswerDataRequest() {
  }

  public FetchAnswerDataRequest metadataIdentifier(String metadataIdentifier) {
    
    this.metadataIdentifier = metadataIdentifier;
    return this;
  }

   /**
   * GUID or name of the Answer.
   * @return metadataIdentifier
  **/
  @javax.annotation.Nonnull
  public String getMetadataIdentifier() {
    return metadataIdentifier;
  }


  public void setMetadataIdentifier(String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
  }


  public FetchAnswerDataRequest dataFormat(DataFormatEnum dataFormat) {
    
    this.dataFormat = dataFormat;
    return this;
  }

   /**
   * JSON output format. By default, the API returns full data in the JSON.
   * @return dataFormat
  **/
  @javax.annotation.Nullable
  public DataFormatEnum getDataFormat() {
    return dataFormat;
  }


  public void setDataFormat(DataFormatEnum dataFormat) {
    this.dataFormat = dataFormat;
  }


  public FetchAnswerDataRequest recordOffset(Integer recordOffset) {
    
    this.recordOffset = recordOffset;
    return this;
  }

   /**
   * The starting record number from where the records should be included.
   * @return recordOffset
  **/
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }


  public void setRecordOffset(Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public FetchAnswerDataRequest recordSize(Integer recordSize) {
    
    this.recordSize = recordSize;
    return this;
  }

   /**
   * The number of records to include in a batch.
   * @return recordSize
  **/
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }


  public void setRecordSize(Integer recordSize) {
    this.recordSize = recordSize;
  }


  public FetchAnswerDataRequest runtimeFilter(Object runtimeFilter) {
    
    this.runtimeFilter = runtimeFilter;
    return this;
  }

   /**
   * JSON object with representing filter condition to apply filters at runtime. For example, &lt;code&gt; {\&quot;col1\&quot;: \&quot;item type\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;Bags\&quot;} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
   * @return runtimeFilter
  **/
  @javax.annotation.Nullable
  public Object getRuntimeFilter() {
    return runtimeFilter;
  }


  public void setRuntimeFilter(Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
  }


  public FetchAnswerDataRequest runtimeSort(Object runtimeSort) {
    
    this.runtimeSort = runtimeSort;
    return this;
  }

   /**
   * JSON object representing columns to sort data at runtime. For example, &lt;code&gt; {\&quot;sortCol1\&quot;: \&quot;sales\&quot;, \&quot;asc1\&quot;: true} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
   * @return runtimeSort
  **/
  @javax.annotation.Nullable
  public Object getRuntimeSort() {
    return runtimeSort;
  }


  public void setRuntimeSort(Object runtimeSort) {
    this.runtimeSort = runtimeSort;
  }


  public FetchAnswerDataRequest runtimeParamOverride(Object runtimeParamOverride) {
    
    this.runtimeParamOverride = runtimeParamOverride;
    return this;
  }

   /**
   * JSON object for setting values of parameters at runtime. For example, &lt;code&gt; {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;: 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
   * @return runtimeParamOverride
  **/
  @javax.annotation.Nullable
  public Object getRuntimeParamOverride() {
    return runtimeParamOverride;
  }


  public void setRuntimeParamOverride(Object runtimeParamOverride) {
    this.runtimeParamOverride = runtimeParamOverride;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchAnswerDataRequest fetchAnswerDataRequest = (FetchAnswerDataRequest) o;
    return Objects.equals(this.metadataIdentifier, fetchAnswerDataRequest.metadataIdentifier) &&
        Objects.equals(this.dataFormat, fetchAnswerDataRequest.dataFormat) &&
        Objects.equals(this.recordOffset, fetchAnswerDataRequest.recordOffset) &&
        Objects.equals(this.recordSize, fetchAnswerDataRequest.recordSize) &&
        Objects.equals(this.runtimeFilter, fetchAnswerDataRequest.runtimeFilter) &&
        Objects.equals(this.runtimeSort, fetchAnswerDataRequest.runtimeSort) &&
        Objects.equals(this.runtimeParamOverride, fetchAnswerDataRequest.runtimeParamOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataIdentifier, dataFormat, recordOffset, recordSize, runtimeFilter, runtimeSort, runtimeParamOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchAnswerDataRequest {\n");
    sb.append("    metadataIdentifier: ").append(toIndentedString(metadataIdentifier)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
    sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
    sb.append("    runtimeParamOverride: ").append(toIndentedString(runtimeParamOverride)).append("\n");
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
    openapiFields.add("metadata_identifier");
    openapiFields.add("data_format");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("runtime_filter");
    openapiFields.add("runtime_sort");
    openapiFields.add("runtime_param_override");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_identifier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FetchAnswerDataRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FetchAnswerDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchAnswerDataRequest is not found in the empty JSON string", FetchAnswerDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FetchAnswerDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FetchAnswerDataRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchAnswerDataRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_identifier").toString()));
      }
      if ((jsonObj.get("data_format") != null && !jsonObj.get("data_format").isJsonNull()) && !jsonObj.get("data_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_format").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchAnswerDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchAnswerDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchAnswerDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchAnswerDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchAnswerDataRequest>() {
           @Override
           public void write(JsonWriter out, FetchAnswerDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchAnswerDataRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FetchAnswerDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FetchAnswerDataRequest
  * @throws IOException if the JSON string is invalid with respect to FetchAnswerDataRequest
  */
  public static FetchAnswerDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchAnswerDataRequest.class);
  }

 /**
  * Convert an instance of FetchAnswerDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

