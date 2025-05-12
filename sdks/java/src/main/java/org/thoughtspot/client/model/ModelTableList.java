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

import org.thoughtspot.client.JSON;

/**
 * ModelTableList
 */

public class ModelTableList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  @javax.annotation.Nonnull
  private String modelName;

  public static final String SERIALIZED_NAME_MODEL_PATH = "model_path";
  @SerializedName(SERIALIZED_NAME_MODEL_PATH)
  @javax.annotation.Nullable
  private String modelPath;

  public static final String SERIALIZED_NAME_TABLES = "tables";
  @SerializedName(SERIALIZED_NAME_TABLES)
  @javax.annotation.Nonnull
  private List<String> tables = new ArrayList<>();

  public ModelTableList() {
  }

  public ModelTableList modelName(@javax.annotation.Nonnull String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Name of the Model.
   * @return modelName
   */
  @javax.annotation.Nonnull
  public String getModelName() {
    return modelName;
  }

  public void setModelName(@javax.annotation.Nonnull String modelName) {
    this.modelName = modelName;
  }


  public ModelTableList modelPath(@javax.annotation.Nullable String modelPath) {
    this.modelPath = modelPath;
    return this;
  }

  /**
   * Model directory path, this is optional param and required if there are duplicate models with the same name.
   * @return modelPath
   */
  @javax.annotation.Nullable
  public String getModelPath() {
    return modelPath;
  }

  public void setModelPath(@javax.annotation.Nullable String modelPath) {
    this.modelPath = modelPath;
  }


  public ModelTableList tables(@javax.annotation.Nonnull List<String> tables) {
    this.tables = tables;
    return this;
  }

  public ModelTableList addTablesItem(String tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * List of Tables.
   * @return tables
   */
  @javax.annotation.Nonnull
  public List<String> getTables() {
    return tables;
  }

  public void setTables(@javax.annotation.Nonnull List<String> tables) {
    this.tables = tables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTableList modelTableList = (ModelTableList) o;
    return Objects.equals(this.modelName, modelTableList.modelName) &&
        Objects.equals(this.modelPath, modelTableList.modelPath) &&
        Objects.equals(this.tables, modelTableList.tables);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelPath, tables);
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
    sb.append("class ModelTableList {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelPath: ").append(toIndentedString(modelPath)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
    openapiFields.add("model_name");
    openapiFields.add("model_path");
    openapiFields.add("tables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model_name");
    openapiRequiredFields.add("tables");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelTableList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelTableList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelTableList is not found in the empty JSON string", ModelTableList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelTableList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelTableList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelTableList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("model_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_name").toString()));
      }
      if ((jsonObj.get("model_path") != null && !jsonObj.get("model_path").isJsonNull()) && !jsonObj.get("model_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_path").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tables") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tables` to be an array in the JSON string but got `%s`", jsonObj.get("tables").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelTableList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelTableList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelTableList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelTableList.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelTableList>() {
           @Override
           public void write(JsonWriter out, ModelTableList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelTableList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelTableList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelTableList
   * @throws IOException if the JSON string is invalid with respect to ModelTableList
   */
  public static ModelTableList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelTableList.class);
  }

  /**
   * Convert an instance of ModelTableList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

