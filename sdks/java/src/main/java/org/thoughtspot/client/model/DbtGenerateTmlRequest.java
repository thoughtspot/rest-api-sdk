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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thoughtspot.client.model.ModelTableList;
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
 * DbtGenerateTmlRequest
 */

public class DbtGenerateTmlRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER = "dbt_connection_identifier";
  @SerializedName(SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER)
  @javax.annotation.Nonnull
  private String dbtConnectionIdentifier;

  public static final String SERIALIZED_NAME_MODEL_TABLES = "model_tables";
  @SerializedName(SERIALIZED_NAME_MODEL_TABLES)
  @javax.annotation.Nullable
  private List<ModelTableList> modelTables = new ArrayList<>();

  /**
   * Mention the worksheet tmls to import
   */
  @JsonAdapter(ImportWorksheetsEnum.Adapter.class)
  public enum ImportWorksheetsEnum {
    ALL("ALL"),
    
    NONE("NONE"),
    
    SELECTED("SELECTED");

    private String value;

    ImportWorksheetsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImportWorksheetsEnum fromValue(String value) {
      for (ImportWorksheetsEnum b : ImportWorksheetsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImportWorksheetsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImportWorksheetsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImportWorksheetsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImportWorksheetsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ImportWorksheetsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IMPORT_WORKSHEETS = "import_worksheets";
  @SerializedName(SERIALIZED_NAME_IMPORT_WORKSHEETS)
  @javax.annotation.Nonnull
  private ImportWorksheetsEnum importWorksheets;

  public static final String SERIALIZED_NAME_WORKSHEETS = "worksheets";
  @SerializedName(SERIALIZED_NAME_WORKSHEETS)
  @javax.annotation.Nullable
  private List<String> worksheets = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE_CONTENT = "file_content";
  @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
  @javax.annotation.Nullable
  private File fileContent;

  public DbtGenerateTmlRequest() {
  }

  public DbtGenerateTmlRequest dbtConnectionIdentifier(@javax.annotation.Nonnull String dbtConnectionIdentifier) {
    this.dbtConnectionIdentifier = dbtConnectionIdentifier;
    return this;
  }

  /**
   * Unique ID of the DBT connection.
   * @return dbtConnectionIdentifier
   */
  @javax.annotation.Nonnull
  public String getDbtConnectionIdentifier() {
    return dbtConnectionIdentifier;
  }

  public void setDbtConnectionIdentifier(@javax.annotation.Nonnull String dbtConnectionIdentifier) {
    this.dbtConnectionIdentifier = dbtConnectionIdentifier;
  }


  public DbtGenerateTmlRequest modelTables(@javax.annotation.Nullable List<ModelTableList> modelTables) {
    this.modelTables = modelTables;
    return this;
  }

  public DbtGenerateTmlRequest addModelTablesItem(ModelTableList modelTablesItem) {
    if (this.modelTables == null) {
      this.modelTables = new ArrayList<>();
    }
    this.modelTables.add(modelTablesItem);
    return this;
  }

  /**
   * List of Models and their respective Tables
   * @return modelTables
   */
  @javax.annotation.Nullable
  public List<ModelTableList> getModelTables() {
    return modelTables;
  }

  public void setModelTables(@javax.annotation.Nullable List<ModelTableList> modelTables) {
    this.modelTables = modelTables;
  }


  public DbtGenerateTmlRequest importWorksheets(@javax.annotation.Nonnull ImportWorksheetsEnum importWorksheets) {
    this.importWorksheets = importWorksheets;
    return this;
  }

  /**
   * Mention the worksheet tmls to import
   * @return importWorksheets
   */
  @javax.annotation.Nonnull
  public ImportWorksheetsEnum getImportWorksheets() {
    return importWorksheets;
  }

  public void setImportWorksheets(@javax.annotation.Nonnull ImportWorksheetsEnum importWorksheets) {
    this.importWorksheets = importWorksheets;
  }


  public DbtGenerateTmlRequest worksheets(@javax.annotation.Nullable List<String> worksheets) {
    this.worksheets = worksheets;
    return this;
  }

  public DbtGenerateTmlRequest addWorksheetsItem(String worksheetsItem) {
    if (this.worksheets == null) {
      this.worksheets = new ArrayList<>();
    }
    this.worksheets.add(worksheetsItem);
    return this;
  }

  /**
   * List of worksheets is mandatory when import_Worksheets is type SELECTED
   * @return worksheets
   */
  @javax.annotation.Nullable
  public List<String> getWorksheets() {
    return worksheets;
  }

  public void setWorksheets(@javax.annotation.Nullable List<String> worksheets) {
    this.worksheets = worksheets;
  }


  public DbtGenerateTmlRequest fileContent(@javax.annotation.Nullable File fileContent) {
    this.fileContent = fileContent;
    return this;
  }

  /**
   * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
   * @return fileContent
   */
  @javax.annotation.Nullable
  public File getFileContent() {
    return fileContent;
  }

  public void setFileContent(@javax.annotation.Nullable File fileContent) {
    this.fileContent = fileContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbtGenerateTmlRequest dbtGenerateTmlRequest = (DbtGenerateTmlRequest) o;
    return Objects.equals(this.dbtConnectionIdentifier, dbtGenerateTmlRequest.dbtConnectionIdentifier) &&
        Objects.equals(this.modelTables, dbtGenerateTmlRequest.modelTables) &&
        Objects.equals(this.importWorksheets, dbtGenerateTmlRequest.importWorksheets) &&
        Objects.equals(this.worksheets, dbtGenerateTmlRequest.worksheets) &&
        Objects.equals(this.fileContent, dbtGenerateTmlRequest.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbtGenerateTmlRequest {\n");
    sb.append("    dbtConnectionIdentifier: ").append(toIndentedString(dbtConnectionIdentifier)).append("\n");
    sb.append("    modelTables: ").append(toIndentedString(modelTables)).append("\n");
    sb.append("    importWorksheets: ").append(toIndentedString(importWorksheets)).append("\n");
    sb.append("    worksheets: ").append(toIndentedString(worksheets)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
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
    openapiFields.add("dbt_connection_identifier");
    openapiFields.add("model_tables");
    openapiFields.add("import_worksheets");
    openapiFields.add("worksheets");
    openapiFields.add("file_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dbt_connection_identifier");
    openapiRequiredFields.add("import_worksheets");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DbtGenerateTmlRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbtGenerateTmlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbtGenerateTmlRequest is not found in the empty JSON string", DbtGenerateTmlRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbtGenerateTmlRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbtGenerateTmlRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbtGenerateTmlRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dbt_connection_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbt_connection_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbt_connection_identifier").toString()));
      }
      if (jsonObj.get("model_tables") != null && !jsonObj.get("model_tables").isJsonNull()) {
        JsonArray jsonArraymodelTables = jsonObj.getAsJsonArray("model_tables");
        if (jsonArraymodelTables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_tables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_tables` to be an array in the JSON string but got `%s`", jsonObj.get("model_tables").toString()));
          }

          // validate the optional field `model_tables` (array)
          for (int i = 0; i < jsonArraymodelTables.size(); i++) {
            ModelTableList.validateJsonElement(jsonArraymodelTables.get(i));
          };
        }
      }
      if (!jsonObj.get("import_worksheets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_worksheets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_worksheets").toString()));
      }
      // validate the required field `import_worksheets`
      ImportWorksheetsEnum.validateJsonElement(jsonObj.get("import_worksheets"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("worksheets") != null && !jsonObj.get("worksheets").isJsonNull() && !jsonObj.get("worksheets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `worksheets` to be an array in the JSON string but got `%s`", jsonObj.get("worksheets").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbtGenerateTmlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbtGenerateTmlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbtGenerateTmlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbtGenerateTmlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DbtGenerateTmlRequest>() {
           @Override
           public void write(JsonWriter out, DbtGenerateTmlRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbtGenerateTmlRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DbtGenerateTmlRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DbtGenerateTmlRequest
   * @throws IOException if the JSON string is invalid with respect to DbtGenerateTmlRequest
   */
  public static DbtGenerateTmlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbtGenerateTmlRequest.class);
  }

  /**
   * Convert an instance of DbtGenerateTmlRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

