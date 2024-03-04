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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.thoughtspot.client.model.ModelTableList;

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
 * DbtGenerateTmlRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T10:25:25.563+05:30[Asia/Kolkata]")
public class DbtGenerateTmlRequest {
  public static final String SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER = "dbt_connection_identifier";
  @SerializedName(SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER)
  private String dbtConnectionIdentifier;

  public static final String SERIALIZED_NAME_MODEL_TABLES = "model_tables";
  @SerializedName(SERIALIZED_NAME_MODEL_TABLES)
  private List<ModelTableList> modelTables;

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
  }

  public static final String SERIALIZED_NAME_IMPORT_WORKSHEETS = "import_worksheets";
  @SerializedName(SERIALIZED_NAME_IMPORT_WORKSHEETS)
  private ImportWorksheetsEnum importWorksheets;

  public static final String SERIALIZED_NAME_WORKSHEETS = "worksheets";
  @SerializedName(SERIALIZED_NAME_WORKSHEETS)
  private List<String> worksheets;

  public static final String SERIALIZED_NAME_FILE_CONTENT = "file_content";
  @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
  private File fileContent;

  public DbtGenerateTmlRequest() {
  }

  public DbtGenerateTmlRequest dbtConnectionIdentifier(String dbtConnectionIdentifier) {
    
    this.dbtConnectionIdentifier = dbtConnectionIdentifier;
    return this;
  }

   /**
   * Unique ID of the DBT connection.
   * @return dbtConnectionIdentifier
  **/
  @javax.annotation.Nonnull
  public String getDbtConnectionIdentifier() {
    return dbtConnectionIdentifier;
  }


  public void setDbtConnectionIdentifier(String dbtConnectionIdentifier) {
    this.dbtConnectionIdentifier = dbtConnectionIdentifier;
  }


  public DbtGenerateTmlRequest modelTables(List<ModelTableList> modelTables) {
    
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
  **/
  @javax.annotation.Nullable
  public List<ModelTableList> getModelTables() {
    return modelTables;
  }


  public void setModelTables(List<ModelTableList> modelTables) {
    this.modelTables = modelTables;
  }


  public DbtGenerateTmlRequest importWorksheets(ImportWorksheetsEnum importWorksheets) {
    
    this.importWorksheets = importWorksheets;
    return this;
  }

   /**
   * Mention the worksheet tmls to import
   * @return importWorksheets
  **/
  @javax.annotation.Nonnull
  public ImportWorksheetsEnum getImportWorksheets() {
    return importWorksheets;
  }


  public void setImportWorksheets(ImportWorksheetsEnum importWorksheets) {
    this.importWorksheets = importWorksheets;
  }


  public DbtGenerateTmlRequest worksheets(List<String> worksheets) {
    
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
  **/
  @javax.annotation.Nullable
  public List<String> getWorksheets() {
    return worksheets;
  }


  public void setWorksheets(List<String> worksheets) {
    this.worksheets = worksheets;
  }


  public DbtGenerateTmlRequest fileContent(File fileContent) {
    
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
   * @return fileContent
  **/
  @javax.annotation.Nullable
  public File getFileContent() {
    return fileContent;
  }


  public void setFileContent(File fileContent) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DbtGenerateTmlRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DbtGenerateTmlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbtGenerateTmlRequest is not found in the empty JSON string", DbtGenerateTmlRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DbtGenerateTmlRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbtGenerateTmlRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbtGenerateTmlRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
            ModelTableList.validateJsonObject(jsonArraymodelTables.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("import_worksheets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_worksheets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_worksheets").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("worksheets") != null && !jsonObj.get("worksheets").isJsonArray()) {
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

