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
 * Objects to apply the Runtime_Parameters.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T09:37:12.899082-08:00[America/Los_Angeles]")
public class UserParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERSIST = "persist";
  @SerializedName(SERIALIZED_NAME_PERSIST)
  private Boolean persist = false;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<UserObject> objects;

  public UserParameters() {
  }

  public UserParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the parameter.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserParameters values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public UserParameters addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The array of values.
   * @return values
  **/
  @javax.annotation.Nonnull
  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  public UserParameters persist(Boolean persist) {
    
    this.persist = persist;
    return this;
  }

   /**
   * Flag to persist the parameters.    Version: 9.12.0.cl or later 
   * @return persist
  **/
  @javax.annotation.Nullable
  public Boolean getPersist() {
    return persist;
  }


  public void setPersist(Boolean persist) {
    this.persist = persist;
  }


  public UserParameters objects(List<UserObject> objects) {
    
    this.objects = objects;
    return this;
  }

  public UserParameters addObjectsItem(UserObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Object to apply the runtime parameter.
   * @return objects
  **/
  @javax.annotation.Nullable
  public List<UserObject> getObjects() {
    return objects;
  }


  public void setObjects(List<UserObject> objects) {
    this.objects = objects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserParameters userParameters = (UserParameters) o;
    return Objects.equals(this.name, userParameters.name) &&
        Objects.equals(this.values, userParameters.values) &&
        Objects.equals(this.persist, userParameters.persist) &&
        Objects.equals(this.objects, userParameters.objects);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values, persist, objects);
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
    sb.append("class UserParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    persist: ").append(toIndentedString(persist)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
    openapiFields.add("values");
    openapiFields.add("persist");
    openapiFields.add("objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserParameters is not found in the empty JSON string", UserParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserParameters.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<UserParameters>() {
           @Override
           public void write(JsonWriter out, UserParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserParameters
  * @throws IOException if the JSON string is invalid with respect to UserParameters
  */
  public static UserParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserParameters.class);
  }

 /**
  * Convert an instance of UserParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

