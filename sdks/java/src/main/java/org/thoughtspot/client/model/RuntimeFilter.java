/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import org.thoughtspot.client.JSON;

/**
 * List of runtime parameters need to set during the session.
 */

public class RuntimeFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";
  @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
  @javax.annotation.Nullable
  private Object runtimeFilter;

  public RuntimeFilter() {
  }

  public RuntimeFilter runtimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
    return this;
  }

  /**
   * Runtime filter parameter type in JWT.
   * @return runtimeFilter
   */
  @javax.annotation.Nullable
  public Object getRuntimeFilter() {
    return runtimeFilter;
  }

  public void setRuntimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeFilter runtimeFilter = (RuntimeFilter) o;
    return Objects.equals(this.runtimeFilter, runtimeFilter.runtimeFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtimeFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeFilter {\n");
    sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
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
    openapiFields.add("runtime_filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RuntimeFilter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuntimeFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuntimeFilter is not found in the empty JSON string", RuntimeFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuntimeFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuntimeFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuntimeFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuntimeFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuntimeFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuntimeFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<RuntimeFilter>() {
           @Override
           public void write(JsonWriter out, RuntimeFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuntimeFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RuntimeFilter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RuntimeFilter
   * @throws IOException if the JSON string is invalid with respect to RuntimeFilter
   */
  public static RuntimeFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuntimeFilter.class);
  }

  /**
   * Convert an instance of RuntimeFilter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

