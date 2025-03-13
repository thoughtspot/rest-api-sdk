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
import org.thoughtspot.client.model.DataWarehouseObjectInput;

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
 * ConnectionInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T16:12:37.188804+05:30[Asia/Kolkata]")
public class ConnectionInput {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";
  @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
  private String namePattern;

  public static final String SERIALIZED_NAME_DATA_WAREHOUSE_OBJECTS = "data_warehouse_objects";
  @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_OBJECTS)
  private List<DataWarehouseObjectInput> dataWarehouseObjects;

  public ConnectionInput() {
  }

  public ConnectionInput identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Unique ID or name of the connection.
   * @return identifier
  **/
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ConnectionInput namePattern(String namePattern) {
    
    this.namePattern = namePattern;
    return this;
  }

   /**
   * A pattern to match case-insensitive name of the connection object. User &#x60;%&#x60; for a wildcard match.
   * @return namePattern
  **/
  @javax.annotation.Nullable
  public String getNamePattern() {
    return namePattern;
  }


  public void setNamePattern(String namePattern) {
    this.namePattern = namePattern;
  }


  public ConnectionInput dataWarehouseObjects(List<DataWarehouseObjectInput> dataWarehouseObjects) {
    
    this.dataWarehouseObjects = dataWarehouseObjects;
    return this;
  }

  public ConnectionInput addDataWarehouseObjectsItem(DataWarehouseObjectInput dataWarehouseObjectsItem) {
    if (this.dataWarehouseObjects == null) {
      this.dataWarehouseObjects = new ArrayList<>();
    }
    this.dataWarehouseObjects.add(dataWarehouseObjectsItem);
    return this;
  }

   /**
   * Filter options for databases, schemas, tables and columns.
   * @return dataWarehouseObjects
  **/
  @javax.annotation.Nullable
  public List<DataWarehouseObjectInput> getDataWarehouseObjects() {
    return dataWarehouseObjects;
  }


  public void setDataWarehouseObjects(List<DataWarehouseObjectInput> dataWarehouseObjects) {
    this.dataWarehouseObjects = dataWarehouseObjects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInput connectionInput = (ConnectionInput) o;
    return Objects.equals(this.identifier, connectionInput.identifier) &&
        Objects.equals(this.namePattern, connectionInput.namePattern) &&
        Objects.equals(this.dataWarehouseObjects, connectionInput.dataWarehouseObjects);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, namePattern, dataWarehouseObjects);
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
    sb.append("class ConnectionInput {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
    sb.append("    dataWarehouseObjects: ").append(toIndentedString(dataWarehouseObjects)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("name_pattern");
    openapiFields.add("data_warehouse_objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionInput is not found in the empty JSON string", ConnectionInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConnectionInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectionInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull()) && !jsonObj.get("name_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pattern").toString()));
      }
      if (jsonObj.get("data_warehouse_objects") != null && !jsonObj.get("data_warehouse_objects").isJsonNull()) {
        JsonArray jsonArraydataWarehouseObjects = jsonObj.getAsJsonArray("data_warehouse_objects");
        if (jsonArraydataWarehouseObjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data_warehouse_objects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data_warehouse_objects` to be an array in the JSON string but got `%s`", jsonObj.get("data_warehouse_objects").toString()));
          }

          // validate the optional field `data_warehouse_objects` (array)
          for (int i = 0; i < jsonArraydataWarehouseObjects.size(); i++) {
            DataWarehouseObjectInput.validateJsonObject(jsonArraydataWarehouseObjects.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionInput>() {
           @Override
           public void write(JsonWriter out, ConnectionInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectionInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionInput
  * @throws IOException if the JSON string is invalid with respect to ConnectionInput
  */
  public static ConnectionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionInput.class);
  }

 /**
  * Convert an instance of ConnectionInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

