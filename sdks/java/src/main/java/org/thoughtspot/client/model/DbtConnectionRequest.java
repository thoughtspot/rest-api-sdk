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
 * DbtConnectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T09:43:29.263117728Z[Etc/UTC]")
public class DbtConnectionRequest {
  public static final String SERIALIZED_NAME_CONNECTION_NAME = "connection_name";
  @SerializedName(SERIALIZED_NAME_CONNECTION_NAME)
  private String connectionName;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  /**
   * Mention type of Import
   */
  @JsonAdapter(ImportTypeEnum.Adapter.class)
  public enum ImportTypeEnum {
    DBT_CLOUD("DBT_CLOUD"),
    
    ZIP_FILE("ZIP_FILE");

    private String value;

    ImportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImportTypeEnum fromValue(String value) {
      for (ImportTypeEnum b : ImportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImportTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMPORT_TYPE = "import_type";
  @SerializedName(SERIALIZED_NAME_IMPORT_TYPE)
  private ImportTypeEnum importType = ImportTypeEnum.DBT_CLOUD;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_DBT_URL = "dbt_url";
  @SerializedName(SERIALIZED_NAME_DBT_URL)
  private String dbtUrl;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_DBT_ENV_ID = "dbt_env_id";
  @SerializedName(SERIALIZED_NAME_DBT_ENV_ID)
  private String dbtEnvId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_FILE_CONTENT = "file_content";
  @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
  private File fileContent;

  public DbtConnectionRequest() {
  }

  public DbtConnectionRequest connectionName(String connectionName) {
    
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Name of the connection.
   * @return connectionName
  **/
  @javax.annotation.Nonnull
  public String getConnectionName() {
    return connectionName;
  }


  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }


  public DbtConnectionRequest databaseName(String databaseName) {
    
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Name of the Database.
   * @return databaseName
  **/
  @javax.annotation.Nonnull
  public String getDatabaseName() {
    return databaseName;
  }


  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public DbtConnectionRequest importType(ImportTypeEnum importType) {
    
    this.importType = importType;
    return this;
  }

   /**
   * Mention type of Import
   * @return importType
  **/
  @javax.annotation.Nullable
  public ImportTypeEnum getImportType() {
    return importType;
  }


  public void setImportType(ImportTypeEnum importType) {
    this.importType = importType;
  }


  public DbtConnectionRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token is mandatory when Import_Type is DBT_CLOUD.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public DbtConnectionRequest dbtUrl(String dbtUrl) {
    
    this.dbtUrl = dbtUrl;
    return this;
  }

   /**
   * DBT URL is mandatory when Import_Type is DBT_CLOUD.
   * @return dbtUrl
  **/
  @javax.annotation.Nullable
  public String getDbtUrl() {
    return dbtUrl;
  }


  public void setDbtUrl(String dbtUrl) {
    this.dbtUrl = dbtUrl;
  }


  public DbtConnectionRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID is mandatory when Import_Type is DBT_CLOUD
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public DbtConnectionRequest projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Project ID is mandatory when Import_Type is DBT_CLOUD
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public DbtConnectionRequest dbtEnvId(String dbtEnvId) {
    
    this.dbtEnvId = dbtEnvId;
    return this;
  }

   /**
   * DBT Environment ID\&quot;
   * @return dbtEnvId
  **/
  @javax.annotation.Nullable
  public String getDbtEnvId() {
    return dbtEnvId;
  }


  public void setDbtEnvId(String dbtEnvId) {
    this.dbtEnvId = dbtEnvId;
  }


  public DbtConnectionRequest projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * Name of the project
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public DbtConnectionRequest fileContent(File fileContent) {
    
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is &#39;ZIP_FILE&#39;
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
    DbtConnectionRequest dbtConnectionRequest = (DbtConnectionRequest) o;
    return Objects.equals(this.connectionName, dbtConnectionRequest.connectionName) &&
        Objects.equals(this.databaseName, dbtConnectionRequest.databaseName) &&
        Objects.equals(this.importType, dbtConnectionRequest.importType) &&
        Objects.equals(this.accessToken, dbtConnectionRequest.accessToken) &&
        Objects.equals(this.dbtUrl, dbtConnectionRequest.dbtUrl) &&
        Objects.equals(this.accountId, dbtConnectionRequest.accountId) &&
        Objects.equals(this.projectId, dbtConnectionRequest.projectId) &&
        Objects.equals(this.dbtEnvId, dbtConnectionRequest.dbtEnvId) &&
        Objects.equals(this.projectName, dbtConnectionRequest.projectName) &&
        Objects.equals(this.fileContent, dbtConnectionRequest.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbtConnectionRequest {\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    dbtUrl: ").append(toIndentedString(dbtUrl)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    dbtEnvId: ").append(toIndentedString(dbtEnvId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
    openapiFields.add("connection_name");
    openapiFields.add("database_name");
    openapiFields.add("import_type");
    openapiFields.add("access_token");
    openapiFields.add("dbt_url");
    openapiFields.add("account_id");
    openapiFields.add("project_id");
    openapiFields.add("dbt_env_id");
    openapiFields.add("project_name");
    openapiFields.add("file_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connection_name");
    openapiRequiredFields.add("database_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DbtConnectionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DbtConnectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbtConnectionRequest is not found in the empty JSON string", DbtConnectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DbtConnectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbtConnectionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbtConnectionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("connection_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_name").toString()));
      }
      if (!jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("import_type") != null && !jsonObj.get("import_type").isJsonNull()) && !jsonObj.get("import_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_type").toString()));
      }
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("dbt_url") != null && !jsonObj.get("dbt_url").isJsonNull()) && !jsonObj.get("dbt_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbt_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbt_url").toString()));
      }
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("dbt_env_id") != null && !jsonObj.get("dbt_env_id").isJsonNull()) && !jsonObj.get("dbt_env_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbt_env_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbt_env_id").toString()));
      }
      if ((jsonObj.get("project_name") != null && !jsonObj.get("project_name").isJsonNull()) && !jsonObj.get("project_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbtConnectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbtConnectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbtConnectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbtConnectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DbtConnectionRequest>() {
           @Override
           public void write(JsonWriter out, DbtConnectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbtConnectionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbtConnectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbtConnectionRequest
  * @throws IOException if the JSON string is invalid with respect to DbtConnectionRequest
  */
  public static DbtConnectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbtConnectionRequest.class);
  }

 /**
  * Convert an instance of DbtConnectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

