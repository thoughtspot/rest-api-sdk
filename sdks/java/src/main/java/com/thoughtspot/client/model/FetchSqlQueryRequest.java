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
import com.thoughtspot.client.model.SqlMetadataInput;
import java.io.IOException;
import java.util.Arrays;
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
 * FetchSqlQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class FetchSqlQueryRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nonnull
  private SqlMetadataInput metadata;

  public static final String SERIALIZED_NAME_QUERY_STRING = "query_string";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING)
  @javax.annotation.Nullable
  private String queryString;

  public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";
  @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
  @javax.annotation.Nullable
  private Object runtimeFilter = null;

  public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";
  @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
  @javax.annotation.Nullable
  private Object runtimeSort = null;

  public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
  @javax.annotation.Nullable
  private Object runtimeParamOverride = null;

  public FetchSqlQueryRequest() {
  }

  public FetchSqlQueryRequest metadata(@javax.annotation.Nonnull SqlMetadataInput metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Object to fetch the SQL query of. For example, &lt;code&gt;{\&quot;type\&quot;: \&quot;LOGICAL_TABLE\&quot;, \&quot;identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;}&lt;/code&gt;.
   * @return metadata
   */
  @javax.annotation.Nonnull
  public SqlMetadataInput getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nonnull SqlMetadataInput metadata) {
    this.metadata = metadata;
  }


  public FetchSqlQueryRequest queryString(@javax.annotation.Nullable String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Query string with search tokens to apply on the data source. For example, &lt;code&gt;[Sales][Region]&lt;/code&gt;. See [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api). Required for &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;; not supported with other types.
   * @return queryString
   */
  @javax.annotation.Nullable
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(@javax.annotation.Nullable String queryString) {
    this.queryString = queryString;
  }


  public FetchSqlQueryRequest runtimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
    return this;
  }

  /**
   * JSON object with representing filter condition to apply filters at runtime. Not supported with &lt;code&gt;tml&lt;/code&gt;. For example, &lt;code&gt; {\&quot;col1\&quot;: \&quot;item type\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;Bags\&quot;} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
   * @return runtimeFilter
   */
  @javax.annotation.Nullable
  public Object getRuntimeFilter() {
    return runtimeFilter;
  }

  public void setRuntimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
  }


  public FetchSqlQueryRequest runtimeSort(@javax.annotation.Nullable Object runtimeSort) {
    this.runtimeSort = runtimeSort;
    return this;
  }

  /**
   * JSON object representing columns to sort data at runtime. Not supported with &lt;code&gt;tml&lt;/code&gt;. For example, &lt;code&gt; {\&quot;sortCol1\&quot;: \&quot;sales\&quot;, \&quot;asc1\&quot;: true} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
   * @return runtimeSort
   */
  @javax.annotation.Nullable
  public Object getRuntimeSort() {
    return runtimeSort;
  }

  public void setRuntimeSort(@javax.annotation.Nullable Object runtimeSort) {
    this.runtimeSort = runtimeSort;
  }


  public FetchSqlQueryRequest runtimeParamOverride(@javax.annotation.Nullable Object runtimeParamOverride) {
    this.runtimeParamOverride = runtimeParamOverride;
    return this;
  }

  /**
   * JSON object for setting values of parameters at runtime. Not supported with &lt;code&gt;tml&lt;/code&gt;. For example, &lt;code&gt; {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;: 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
   * @return runtimeParamOverride
   */
  @javax.annotation.Nullable
  public Object getRuntimeParamOverride() {
    return runtimeParamOverride;
  }

  public void setRuntimeParamOverride(@javax.annotation.Nullable Object runtimeParamOverride) {
    this.runtimeParamOverride = runtimeParamOverride;
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
   * @return the FetchSqlQueryRequest instance itself
   */
  public FetchSqlQueryRequest putAdditionalProperty(String key, Object value) {
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
    FetchSqlQueryRequest fetchSqlQueryRequest = (FetchSqlQueryRequest) o;
    return Objects.equals(this.metadata, fetchSqlQueryRequest.metadata) &&
        Objects.equals(this.queryString, fetchSqlQueryRequest.queryString) &&
        Objects.equals(this.runtimeFilter, fetchSqlQueryRequest.runtimeFilter) &&
        Objects.equals(this.runtimeSort, fetchSqlQueryRequest.runtimeSort) &&
        Objects.equals(this.runtimeParamOverride, fetchSqlQueryRequest.runtimeParamOverride)&&
        Objects.equals(this.additionalProperties, fetchSqlQueryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, queryString, runtimeFilter, runtimeSort, runtimeParamOverride, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchSqlQueryRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
    sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
    sb.append("    runtimeParamOverride: ").append(toIndentedString(runtimeParamOverride)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("query_string");
    openapiFields.add("runtime_filter");
    openapiFields.add("runtime_sort");
    openapiFields.add("runtime_param_override");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FetchSqlQueryRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FetchSqlQueryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchSqlQueryRequest is not found in the empty JSON string", FetchSqlQueryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchSqlQueryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `metadata`
      SqlMetadataInput.validateJsonElement(jsonObj.get("metadata"));
      if ((jsonObj.get("query_string") != null && !jsonObj.get("query_string").isJsonNull()) && !jsonObj.get("query_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query_string").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchSqlQueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchSqlQueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchSqlQueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchSqlQueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchSqlQueryRequest>() {
           @Override
           public void write(JsonWriter out, FetchSqlQueryRequest value) throws IOException {
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
           public FetchSqlQueryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FetchSqlQueryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of FetchSqlQueryRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FetchSqlQueryRequest
   * @throws IOException if the JSON string is invalid with respect to FetchSqlQueryRequest
   */
  public static FetchSqlQueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchSqlQueryRequest.class);
  }

  /**
   * Convert an instance of FetchSqlQueryRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

