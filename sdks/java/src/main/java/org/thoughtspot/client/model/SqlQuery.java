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
 * Response format associated with fetch SQL query api
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T14:03:41.316769Z[Etc/UTC]")
public class SqlQuery {
  public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";
  @SerializedName(SERIALIZED_NAME_METADATA_ID)
  private String metadataId;

  public static final String SERIALIZED_NAME_METADATA_NAME = "metadata_name";
  @SerializedName(SERIALIZED_NAME_METADATA_NAME)
  private String metadataName;

  public static final String SERIALIZED_NAME_SQL_QUERY = "sql_query";
  @SerializedName(SERIALIZED_NAME_SQL_QUERY)
  private String sqlQuery;

  public SqlQuery() {
  }

  public SqlQuery metadataId(String metadataId) {
    
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


  public SqlQuery metadataName(String metadataName) {
    
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


  public SqlQuery sqlQuery(String sqlQuery) {
    
    this.sqlQuery = sqlQuery;
    return this;
  }

   /**
   * SQL query of a metadata object.
   * @return sqlQuery
  **/
  @javax.annotation.Nonnull
  public String getSqlQuery() {
    return sqlQuery;
  }


  public void setSqlQuery(String sqlQuery) {
    this.sqlQuery = sqlQuery;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlQuery sqlQuery = (SqlQuery) o;
    return Objects.equals(this.metadataId, sqlQuery.metadataId) &&
        Objects.equals(this.metadataName, sqlQuery.metadataName) &&
        Objects.equals(this.sqlQuery, sqlQuery.sqlQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataId, metadataName, sqlQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlQuery {\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
    sb.append("    metadataName: ").append(toIndentedString(metadataName)).append("\n");
    sb.append("    sqlQuery: ").append(toIndentedString(sqlQuery)).append("\n");
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
    openapiFields.add("sql_query");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_id");
    openapiRequiredFields.add("metadata_name");
    openapiRequiredFields.add("sql_query");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SqlQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SqlQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SqlQuery is not found in the empty JSON string", SqlQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SqlQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SqlQuery` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SqlQuery.openapiRequiredFields) {
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
      if (!jsonObj.get("sql_query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sql_query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sql_query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SqlQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SqlQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SqlQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SqlQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<SqlQuery>() {
           @Override
           public void write(JsonWriter out, SqlQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SqlQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SqlQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SqlQuery
  * @throws IOException if the JSON string is invalid with respect to SqlQuery
  */
  public static SqlQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SqlQuery.class);
  }

 /**
  * Convert an instance of SqlQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

