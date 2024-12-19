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
import org.thoughtspot.client.model.SqlQuery;

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
 * SqlQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T23:43:05.069148+05:30[Asia/Kolkata]")
public class SqlQueryResponse {
  public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";
  @SerializedName(SERIALIZED_NAME_METADATA_ID)
  private String metadataId;

  public static final String SERIALIZED_NAME_METADATA_NAME = "metadata_name";
  @SerializedName(SERIALIZED_NAME_METADATA_NAME)
  private String metadataName;

  /**
   * Type of the metadata.
   */
  @JsonAdapter(MetadataTypeEnum.Adapter.class)
  public enum MetadataTypeEnum {
    LIVEBOARD("LIVEBOARD"),
    
    ANSWER("ANSWER"),
    
    LOGICAL_TABLE("LOGICAL_TABLE"),
    
    LOGICAL_COLUMN("LOGICAL_COLUMN"),
    
    CONNECTION("CONNECTION"),
    
    TAG("TAG"),
    
    USER("USER"),
    
    USER_GROUP("USER_GROUP"),
    
    LOGICAL_RELATIONSHIP("LOGICAL_RELATIONSHIP");

    private String value;

    MetadataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetadataTypeEnum fromValue(String value) {
      for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetadataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";
  @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
  private MetadataTypeEnum metadataType;

  public static final String SERIALIZED_NAME_SQL_QUERIES = "sql_queries";
  @SerializedName(SERIALIZED_NAME_SQL_QUERIES)
  private List<SqlQuery> sqlQueries = new ArrayList<>();

  public SqlQueryResponse() {
  }

  public SqlQueryResponse metadataId(String metadataId) {
    
    this.metadataId = metadataId;
    return this;
  }

   /**
   * Unique identifier of the metadata.
   * @return metadataId
  **/
  @javax.annotation.Nonnull
  public String getMetadataId() {
    return metadataId;
  }


  public void setMetadataId(String metadataId) {
    this.metadataId = metadataId;
  }


  public SqlQueryResponse metadataName(String metadataName) {
    
    this.metadataName = metadataName;
    return this;
  }

   /**
   * Name of the metadata.
   * @return metadataName
  **/
  @javax.annotation.Nonnull
  public String getMetadataName() {
    return metadataName;
  }


  public void setMetadataName(String metadataName) {
    this.metadataName = metadataName;
  }


  public SqlQueryResponse metadataType(MetadataTypeEnum metadataType) {
    
    this.metadataType = metadataType;
    return this;
  }

   /**
   * Type of the metadata.
   * @return metadataType
  **/
  @javax.annotation.Nonnull
  public MetadataTypeEnum getMetadataType() {
    return metadataType;
  }


  public void setMetadataType(MetadataTypeEnum metadataType) {
    this.metadataType = metadataType;
  }


  public SqlQueryResponse sqlQueries(List<SqlQuery> sqlQueries) {
    
    this.sqlQueries = sqlQueries;
    return this;
  }

  public SqlQueryResponse addSqlQueriesItem(SqlQuery sqlQueriesItem) {
    if (this.sqlQueries == null) {
      this.sqlQueries = new ArrayList<>();
    }
    this.sqlQueries.add(sqlQueriesItem);
    return this;
  }

   /**
   * SQL query details of metadata objects.
   * @return sqlQueries
  **/
  @javax.annotation.Nonnull
  public List<SqlQuery> getSqlQueries() {
    return sqlQueries;
  }


  public void setSqlQueries(List<SqlQuery> sqlQueries) {
    this.sqlQueries = sqlQueries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlQueryResponse sqlQueryResponse = (SqlQueryResponse) o;
    return Objects.equals(this.metadataId, sqlQueryResponse.metadataId) &&
        Objects.equals(this.metadataName, sqlQueryResponse.metadataName) &&
        Objects.equals(this.metadataType, sqlQueryResponse.metadataType) &&
        Objects.equals(this.sqlQueries, sqlQueryResponse.sqlQueries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataId, metadataName, metadataType, sqlQueries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlQueryResponse {\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
    sb.append("    metadataName: ").append(toIndentedString(metadataName)).append("\n");
    sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
    sb.append("    sqlQueries: ").append(toIndentedString(sqlQueries)).append("\n");
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
    openapiFields.add("metadata_id");
    openapiFields.add("metadata_name");
    openapiFields.add("metadata_type");
    openapiFields.add("sql_queries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_id");
    openapiRequiredFields.add("metadata_name");
    openapiRequiredFields.add("metadata_type");
    openapiRequiredFields.add("sql_queries");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SqlQueryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SqlQueryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SqlQueryResponse is not found in the empty JSON string", SqlQueryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SqlQueryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SqlQueryResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SqlQueryResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("metadata_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_id").toString()));
      }
      if (!jsonObj.get("metadata_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_name").toString()));
      }
      if (!jsonObj.get("metadata_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sql_queries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sql_queries` to be an array in the JSON string but got `%s`", jsonObj.get("sql_queries").toString()));
      }

      JsonArray jsonArraysqlQueries = jsonObj.getAsJsonArray("sql_queries");
      // validate the required field `sql_queries` (array)
      for (int i = 0; i < jsonArraysqlQueries.size(); i++) {
        SqlQuery.validateJsonObject(jsonArraysqlQueries.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SqlQueryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SqlQueryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SqlQueryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SqlQueryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SqlQueryResponse>() {
           @Override
           public void write(JsonWriter out, SqlQueryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SqlQueryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SqlQueryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SqlQueryResponse
  * @throws IOException if the JSON string is invalid with respect to SqlQueryResponse
  */
  public static SqlQueryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SqlQueryResponse.class);
  }

 /**
  * Convert an instance of SqlQueryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

