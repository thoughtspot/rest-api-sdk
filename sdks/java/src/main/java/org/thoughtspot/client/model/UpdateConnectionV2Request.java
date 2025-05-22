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

import org.thoughtspot.client.JSON;

/**
 * UpdateConnectionV2Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UpdateConnectionV2Request implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DATA_WAREHOUSE_CONFIG = "data_warehouse_config";
  @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_CONFIG)
  @javax.annotation.Nullable
  private Object dataWarehouseConfig;

  public static final String SERIALIZED_NAME_VALIDATE = "validate";
  @SerializedName(SERIALIZED_NAME_VALIDATE)
  @javax.annotation.Nullable
  private Boolean validate = true;

  public UpdateConnectionV2Request() {
  }

  public UpdateConnectionV2Request name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Updated name of the connection.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public UpdateConnectionV2Request description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Updated description of the connection.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public UpdateConnectionV2Request dataWarehouseConfig(@javax.annotation.Nullable Object dataWarehouseConfig) {
    this.dataWarehouseConfig = dataWarehouseConfig;
    return this;
  }

  /**
   * Configuration of the data warehouse in JSON.
   * @return dataWarehouseConfig
   */
  @javax.annotation.Nullable
  public Object getDataWarehouseConfig() {
    return dataWarehouseConfig;
  }

  public void setDataWarehouseConfig(@javax.annotation.Nullable Object dataWarehouseConfig) {
    this.dataWarehouseConfig = dataWarehouseConfig;
  }


  public UpdateConnectionV2Request validate(@javax.annotation.Nullable Boolean validate) {
    this.validate = validate;
    return this;
  }

  /**
   * Indicates whether to validate the connection details.
   * @return validate
   */
  @javax.annotation.Nullable
  public Boolean getValidate() {
    return validate;
  }

  public void setValidate(@javax.annotation.Nullable Boolean validate) {
    this.validate = validate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConnectionV2Request updateConnectionV2Request = (UpdateConnectionV2Request) o;
    return Objects.equals(this.name, updateConnectionV2Request.name) &&
        Objects.equals(this.description, updateConnectionV2Request.description) &&
        Objects.equals(this.dataWarehouseConfig, updateConnectionV2Request.dataWarehouseConfig) &&
        Objects.equals(this.validate, updateConnectionV2Request.validate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dataWarehouseConfig, validate);
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
    sb.append("class UpdateConnectionV2Request {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataWarehouseConfig: ").append(toIndentedString(dataWarehouseConfig)).append("\n");
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("data_warehouse_config");
    openapiFields.add("validate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateConnectionV2Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateConnectionV2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateConnectionV2Request is not found in the empty JSON string", UpdateConnectionV2Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateConnectionV2Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateConnectionV2Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateConnectionV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateConnectionV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateConnectionV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateConnectionV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateConnectionV2Request>() {
           @Override
           public void write(JsonWriter out, UpdateConnectionV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateConnectionV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateConnectionV2Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateConnectionV2Request
   * @throws IOException if the JSON string is invalid with respect to UpdateConnectionV2Request
   */
  public static UpdateConnectionV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateConnectionV2Request.class);
  }

  /**
   * Convert an instance of UpdateConnectionV2Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

