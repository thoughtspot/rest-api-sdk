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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.UserObject;
import org.thoughtspot.client.model.UserParameters;
import org.thoughtspot.client.model.UserRuntimeFilters;
import org.thoughtspot.client.model.UserRuntimeSorts;

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
 * &lt;div&gt;Deprecated: 10.4.0.cl and later &lt;/div&gt;  Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T15:42:43.362610+05:30[Asia/Kolkata]")
public class GetObjectAccessTokenRequestUserParameters {
  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<UserObject> objects;

  public static final String SERIALIZED_NAME_RUNTIME_FILTERS = "runtime_filters";
  @SerializedName(SERIALIZED_NAME_RUNTIME_FILTERS)
  private List<UserRuntimeFilters> runtimeFilters;

  public static final String SERIALIZED_NAME_RUNTIME_SORTS = "runtime_sorts";
  @SerializedName(SERIALIZED_NAME_RUNTIME_SORTS)
  private List<UserRuntimeSorts> runtimeSorts;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<UserParameters> parameters;

  public GetObjectAccessTokenRequestUserParameters() {
  }

  public GetObjectAccessTokenRequestUserParameters objects(List<UserObject> objects) {
    
    this.objects = objects;
    return this;
  }

  public GetObjectAccessTokenRequestUserParameters addObjectsItem(UserObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @javax.annotation.Nullable
  public List<UserObject> getObjects() {
    return objects;
  }


  public void setObjects(List<UserObject> objects) {
    this.objects = objects;
  }


  public GetObjectAccessTokenRequestUserParameters runtimeFilters(List<UserRuntimeFilters> runtimeFilters) {
    
    this.runtimeFilters = runtimeFilters;
    return this;
  }

  public GetObjectAccessTokenRequestUserParameters addRuntimeFiltersItem(UserRuntimeFilters runtimeFiltersItem) {
    if (this.runtimeFilters == null) {
      this.runtimeFilters = new ArrayList<>();
    }
    this.runtimeFilters.add(runtimeFiltersItem);
    return this;
  }

   /**
   * Objects to apply the User_Runtime_Filters.  Examples to set the &#x60;runtime_filters&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;operator\&quot;: \&quot;EQ\&quot;, \&quot;values\&quot;: [\&quot;red\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60;
   * @return runtimeFilters
  **/
  @javax.annotation.Nullable
  public List<UserRuntimeFilters> getRuntimeFilters() {
    return runtimeFilters;
  }


  public void setRuntimeFilters(List<UserRuntimeFilters> runtimeFilters) {
    this.runtimeFilters = runtimeFilters;
  }


  public GetObjectAccessTokenRequestUserParameters runtimeSorts(List<UserRuntimeSorts> runtimeSorts) {
    
    this.runtimeSorts = runtimeSorts;
    return this;
  }

  public GetObjectAccessTokenRequestUserParameters addRuntimeSortsItem(UserRuntimeSorts runtimeSortsItem) {
    if (this.runtimeSorts == null) {
      this.runtimeSorts = new ArrayList<>();
    }
    this.runtimeSorts.add(runtimeSortsItem);
    return this;
  }

   /**
   * Objects to apply the User_Runtime_Sorts.  Examples to set the &#x60;runtime_sorts&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;order\&quot;: \&quot;ASC\&quot;, \&quot;persist\&quot;: false } &#x60;&#x60;&#x60;
   * @return runtimeSorts
  **/
  @javax.annotation.Nullable
  public List<UserRuntimeSorts> getRuntimeSorts() {
    return runtimeSorts;
  }


  public void setRuntimeSorts(List<UserRuntimeSorts> runtimeSorts) {
    this.runtimeSorts = runtimeSorts;
  }


  public GetObjectAccessTokenRequestUserParameters parameters(List<UserParameters> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public GetObjectAccessTokenRequestUserParameters addParametersItem(UserParameters parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Objects to apply the Runtime_Parameters.  Examples to set the &#x60;parameters&#x60; : &#x60;&#x60;&#x60;json { \&quot;name\&quot;: \&quot;Color\&quot;, \&quot;values\&quot;: [\&quot;Blue\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60;
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<UserParameters> getParameters() {
    return parameters;
  }


  public void setParameters(List<UserParameters> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetObjectAccessTokenRequestUserParameters getObjectAccessTokenRequestUserParameters = (GetObjectAccessTokenRequestUserParameters) o;
    return Objects.equals(this.objects, getObjectAccessTokenRequestUserParameters.objects) &&
        Objects.equals(this.runtimeFilters, getObjectAccessTokenRequestUserParameters.runtimeFilters) &&
        Objects.equals(this.runtimeSorts, getObjectAccessTokenRequestUserParameters.runtimeSorts) &&
        Objects.equals(this.parameters, getObjectAccessTokenRequestUserParameters.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, runtimeFilters, runtimeSorts, parameters);
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
    sb.append("class GetObjectAccessTokenRequestUserParameters {\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    runtimeFilters: ").append(toIndentedString(runtimeFilters)).append("\n");
    sb.append("    runtimeSorts: ").append(toIndentedString(runtimeSorts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("objects");
    openapiFields.add("runtime_filters");
    openapiFields.add("runtime_sorts");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetObjectAccessTokenRequestUserParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetObjectAccessTokenRequestUserParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetObjectAccessTokenRequestUserParameters is not found in the empty JSON string", GetObjectAccessTokenRequestUserParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetObjectAccessTokenRequestUserParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetObjectAccessTokenRequestUserParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
        JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
        if (jsonArrayobjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("objects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
          }

          // validate the optional field `objects` (array)
          for (int i = 0; i < jsonArrayobjects.size(); i++) {
            UserObject.validateJsonObject(jsonArrayobjects.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("runtime_filters") != null && !jsonObj.get("runtime_filters").isJsonNull()) {
        JsonArray jsonArrayruntimeFilters = jsonObj.getAsJsonArray("runtime_filters");
        if (jsonArrayruntimeFilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runtime_filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runtime_filters` to be an array in the JSON string but got `%s`", jsonObj.get("runtime_filters").toString()));
          }

          // validate the optional field `runtime_filters` (array)
          for (int i = 0; i < jsonArrayruntimeFilters.size(); i++) {
            UserRuntimeFilters.validateJsonObject(jsonArrayruntimeFilters.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("runtime_sorts") != null && !jsonObj.get("runtime_sorts").isJsonNull()) {
        JsonArray jsonArrayruntimeSorts = jsonObj.getAsJsonArray("runtime_sorts");
        if (jsonArrayruntimeSorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runtime_sorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runtime_sorts` to be an array in the JSON string but got `%s`", jsonObj.get("runtime_sorts").toString()));
          }

          // validate the optional field `runtime_sorts` (array)
          for (int i = 0; i < jsonArrayruntimeSorts.size(); i++) {
            UserRuntimeSorts.validateJsonObject(jsonArrayruntimeSorts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            UserParameters.validateJsonObject(jsonArrayparameters.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetObjectAccessTokenRequestUserParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetObjectAccessTokenRequestUserParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetObjectAccessTokenRequestUserParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetObjectAccessTokenRequestUserParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetObjectAccessTokenRequestUserParameters>() {
           @Override
           public void write(JsonWriter out, GetObjectAccessTokenRequestUserParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetObjectAccessTokenRequestUserParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetObjectAccessTokenRequestUserParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetObjectAccessTokenRequestUserParameters
  * @throws IOException if the JSON string is invalid with respect to GetObjectAccessTokenRequestUserParameters
  */
  public static GetObjectAccessTokenRequestUserParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetObjectAccessTokenRequestUserParameters.class);
  }

 /**
  * Convert an instance of GetObjectAccessTokenRequestUserParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

