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
import com.thoughtspot.client.model.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * EurekaDataSourceSuggestionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EurekaDataSourceSuggestionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA_SOURCES = "data_sources";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCES)
  @javax.annotation.Nullable
  private List<DataSource> dataSources;

  public EurekaDataSourceSuggestionResponse() {
  }

  public EurekaDataSourceSuggestionResponse dataSources(@javax.annotation.Nullable List<DataSource> dataSources) {
    this.dataSources = dataSources;
    return this;
  }

  public EurekaDataSourceSuggestionResponse addDataSourcesItem(DataSource dataSourcesItem) {
    if (this.dataSources == null) {
      this.dataSources = new ArrayList<>();
    }
    this.dataSources.add(dataSourcesItem);
    return this;
  }

  /**
   * List of data sources suggested.
   * @return dataSources
   */
  @javax.annotation.Nullable
  public List<DataSource> getDataSources() {
    return dataSources;
  }

  public void setDataSources(@javax.annotation.Nullable List<DataSource> dataSources) {
    this.dataSources = dataSources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EurekaDataSourceSuggestionResponse eurekaDataSourceSuggestionResponse = (EurekaDataSourceSuggestionResponse) o;
    return Objects.equals(this.dataSources, eurekaDataSourceSuggestionResponse.dataSources);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSources);
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
    sb.append("class EurekaDataSourceSuggestionResponse {\n");
    sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
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
    openapiFields.add("data_sources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EurekaDataSourceSuggestionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EurekaDataSourceSuggestionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EurekaDataSourceSuggestionResponse is not found in the empty JSON string", EurekaDataSourceSuggestionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EurekaDataSourceSuggestionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EurekaDataSourceSuggestionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data_sources") != null && !jsonObj.get("data_sources").isJsonNull()) {
        JsonArray jsonArraydataSources = jsonObj.getAsJsonArray("data_sources");
        if (jsonArraydataSources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data_sources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data_sources` to be an array in the JSON string but got `%s`", jsonObj.get("data_sources").toString()));
          }

          // validate the optional field `data_sources` (array)
          for (int i = 0; i < jsonArraydataSources.size(); i++) {
            DataSource.validateJsonElement(jsonArraydataSources.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EurekaDataSourceSuggestionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EurekaDataSourceSuggestionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EurekaDataSourceSuggestionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EurekaDataSourceSuggestionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EurekaDataSourceSuggestionResponse>() {
           @Override
           public void write(JsonWriter out, EurekaDataSourceSuggestionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EurekaDataSourceSuggestionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EurekaDataSourceSuggestionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EurekaDataSourceSuggestionResponse
   * @throws IOException if the JSON string is invalid with respect to EurekaDataSourceSuggestionResponse
   */
  public static EurekaDataSourceSuggestionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EurekaDataSourceSuggestionResponse.class);
  }

  /**
   * Convert an instance of EurekaDataSourceSuggestionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

