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
 * Flags to specify additional options for export.    Version: 10.6.0.cl or later 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T10:56:34.609498487Z[Etc/UTC]")
public class ExportMetadataTMLRequestExportOptions {
  public static final String SERIALIZED_NAME_INCLUDE_OBJ_ID_REF = "include_obj_id_ref";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OBJ_ID_REF)
  private Boolean includeObjIdRef = false;

  public static final String SERIALIZED_NAME_INCLUDE_GUID = "include_guid";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GUID)
  private Boolean includeGuid = true;

  public static final String SERIALIZED_NAME_INCLUDE_OBJ_ID = "include_obj_id";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OBJ_ID)
  private Boolean includeObjId = false;

  public ExportMetadataTMLRequestExportOptions() {
  }

  public ExportMetadataTMLRequestExportOptions includeObjIdRef(Boolean includeObjIdRef) {
    
    this.includeObjIdRef = includeObjIdRef;
    return this;
  }

   /**
   * Boolean Flag to whether to export user_defined_id of referenced object. This will only be respected when UserDefinedId in TML is enabled.
   * @return includeObjIdRef
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeObjIdRef() {
    return includeObjIdRef;
  }


  public void setIncludeObjIdRef(Boolean includeObjIdRef) {
    this.includeObjIdRef = includeObjIdRef;
  }


  public ExportMetadataTMLRequestExportOptions includeGuid(Boolean includeGuid) {
    
    this.includeGuid = includeGuid;
    return this;
  }

   /**
   * Boolean flag to whether to export guid of the object. This will only be respected when UserDefinedId in TML is enabled.
   * @return includeGuid
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeGuid() {
    return includeGuid;
  }


  public void setIncludeGuid(Boolean includeGuid) {
    this.includeGuid = includeGuid;
  }


  public ExportMetadataTMLRequestExportOptions includeObjId(Boolean includeObjId) {
    
    this.includeObjId = includeObjId;
    return this;
  }

   /**
   * Boolean flag to whether to export user_defined_id of the object. This will only be respected when UserDefinedId in TML is enabled.
   * @return includeObjId
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeObjId() {
    return includeObjId;
  }


  public void setIncludeObjId(Boolean includeObjId) {
    this.includeObjId = includeObjId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportMetadataTMLRequestExportOptions exportMetadataTMLRequestExportOptions = (ExportMetadataTMLRequestExportOptions) o;
    return Objects.equals(this.includeObjIdRef, exportMetadataTMLRequestExportOptions.includeObjIdRef) &&
        Objects.equals(this.includeGuid, exportMetadataTMLRequestExportOptions.includeGuid) &&
        Objects.equals(this.includeObjId, exportMetadataTMLRequestExportOptions.includeObjId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeObjIdRef, includeGuid, includeObjId);
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
    sb.append("class ExportMetadataTMLRequestExportOptions {\n");
    sb.append("    includeObjIdRef: ").append(toIndentedString(includeObjIdRef)).append("\n");
    sb.append("    includeGuid: ").append(toIndentedString(includeGuid)).append("\n");
    sb.append("    includeObjId: ").append(toIndentedString(includeObjId)).append("\n");
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
    openapiFields.add("include_obj_id_ref");
    openapiFields.add("include_guid");
    openapiFields.add("include_obj_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportMetadataTMLRequestExportOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExportMetadataTMLRequestExportOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportMetadataTMLRequestExportOptions is not found in the empty JSON string", ExportMetadataTMLRequestExportOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExportMetadataTMLRequestExportOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportMetadataTMLRequestExportOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportMetadataTMLRequestExportOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportMetadataTMLRequestExportOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportMetadataTMLRequestExportOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportMetadataTMLRequestExportOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportMetadataTMLRequestExportOptions>() {
           @Override
           public void write(JsonWriter out, ExportMetadataTMLRequestExportOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportMetadataTMLRequestExportOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportMetadataTMLRequestExportOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportMetadataTMLRequestExportOptions
  * @throws IOException if the JSON string is invalid with respect to ExportMetadataTMLRequestExportOptions
  */
  public static ExportMetadataTMLRequestExportOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportMetadataTMLRequestExportOptions.class);
  }

 /**
  * Convert an instance of ExportMetadataTMLRequestExportOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

