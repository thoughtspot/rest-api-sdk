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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Scope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T14:03:41.316769Z[Etc/UTC]")
public class Scope {
  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private Integer orgId;

  public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";
  @SerializedName(SERIALIZED_NAME_METADATA_ID)
  private String metadataId;

  public Scope() {
  }

  public Scope accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * Object access scope type.
   * @return accessType
  **/
  @javax.annotation.Nonnull
  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public Scope orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Unique identifier of the metadata.
   * @return orgId
  **/
  @javax.annotation.Nullable
  public Integer getOrgId() {
    return orgId;
  }


  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }


  public Scope metadataId(String metadataId) {
    
    this.metadataId = metadataId;
    return this;
  }

   /**
   * Unique identifier of the Org.
   * @return metadataId
  **/
  @javax.annotation.Nullable
  public String getMetadataId() {
    return metadataId;
  }


  public void setMetadataId(String metadataId) {
    this.metadataId = metadataId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scope scope = (Scope) o;
    return Objects.equals(this.accessType, scope.accessType) &&
        Objects.equals(this.orgId, scope.orgId) &&
        Objects.equals(this.metadataId, scope.metadataId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, orgId, metadataId);
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
    sb.append("class Scope {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
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
    openapiFields.add("access_type");
    openapiFields.add("org_id");
    openapiFields.add("metadata_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Scope
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Scope.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Scope is not found in the empty JSON string", Scope.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Scope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Scope` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Scope.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
      if ((jsonObj.get("metadata_id") != null && !jsonObj.get("metadata_id").isJsonNull()) && !jsonObj.get("metadata_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Scope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Scope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Scope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Scope.class));

       return (TypeAdapter<T>) new TypeAdapter<Scope>() {
           @Override
           public void write(JsonWriter out, Scope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Scope read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Scope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Scope
  * @throws IOException if the JSON string is invalid with respect to Scope
  */
  public static Scope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Scope.class);
  }

 /**
  * Convert an instance of Scope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

