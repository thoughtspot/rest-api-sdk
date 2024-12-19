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
 * List of runtime parameters need to set during the session.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T23:43:05.069148+05:30[Asia/Kolkata]")
public class RuntimeParamOverride {
  public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
  private Object runtimeParamOverride;

  public RuntimeParamOverride() {
  }

  public RuntimeParamOverride runtimeParamOverride(Object runtimeParamOverride) {
    
    this.runtimeParamOverride = runtimeParamOverride;
    return this;
  }

   /**
   * Runtime param override type in JWT.
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
    RuntimeParamOverride runtimeParamOverride = (RuntimeParamOverride) o;
    return Objects.equals(this.runtimeParamOverride, runtimeParamOverride.runtimeParamOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtimeParamOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeParamOverride {\n");
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
    openapiFields.add("runtime_param_override");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RuntimeParamOverride
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RuntimeParamOverride.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuntimeParamOverride is not found in the empty JSON string", RuntimeParamOverride.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RuntimeParamOverride.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuntimeParamOverride` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuntimeParamOverride.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuntimeParamOverride' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuntimeParamOverride> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuntimeParamOverride.class));

       return (TypeAdapter<T>) new TypeAdapter<RuntimeParamOverride>() {
           @Override
           public void write(JsonWriter out, RuntimeParamOverride value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuntimeParamOverride read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuntimeParamOverride given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuntimeParamOverride
  * @throws IOException if the JSON string is invalid with respect to RuntimeParamOverride
  */
  public static RuntimeParamOverride fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuntimeParamOverride.class);
  }

 /**
  * Convert an instance of RuntimeParamOverride to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

